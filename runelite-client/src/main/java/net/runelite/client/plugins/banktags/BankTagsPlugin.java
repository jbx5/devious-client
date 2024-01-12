/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Ron Young <https://github.com/raiyni>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.banktags;

import com.google.common.collect.Lists;
import com.google.common.primitives.Shorts;
import com.google.inject.Provides;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.VarClientStr;
import net.runelite.api.events.GrandExchangeSearched;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.game.chatbox.ChatboxPanelManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.banktags.tabs.TabInterface;
import static net.runelite.client.plugins.banktags.tabs.TabInterface.FILTERED_CHARS;
import net.runelite.client.plugins.banktags.tabs.TabSprites;
import net.runelite.client.plugins.banktags.tabs.TagTab;
import net.runelite.client.util.Text;

@PluginDescriptor(
	name = "Bank Tags",
	description = "Enable tagging of bank items and searching of bank tags",
	tags = {"searching", "tagging"}
)
public class BankTagsPlugin extends Plugin
{
	public static final String CONFIG_GROUP = "banktags";
	public static final String TAG_SEARCH = "tag:";
	private static final String EDIT_TAGS_MENU_OPTION = "Edit-tags";
	public static final String ICON_SEARCH = "icon_";
	public static final String TAG_TABS_CONFIG = "tagtabs";
	public static final String VAR_TAG_SUFFIX = "*";

	private static final int MAX_RESULT_COUNT = 250;

	private static final String SEARCH_BANK_INPUT_TEXT =
		"Show items whose names or tags contain the following text:<br>" +
			"(To show only tagged items, start your search with 'tag:')";
	private static final String SEARCH_BANK_INPUT_TEXT_FOUND =
		"Show items whose names or tags contain the following text: (%d found)<br>" +
			"(To show only tagged items, start your search with 'tag:')";

	@Inject
	private ItemManager itemManager;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ChatboxPanelManager chatboxPanelManager;

	@Inject
	private TagManager tagManager;

	@Inject
	private TabInterface tabInterface;

	@Inject
	private SpriteManager spriteManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private EventBus eventBus;

	@Provides
	BankTagsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BankTagsConfig.class);
	}

	@Override
	public void resetConfiguration()
	{
		List<String> extraKeys = Lists.newArrayList(
			CONFIG_GROUP + "." + TagManager.ITEM_KEY_PREFIX,
			CONFIG_GROUP + "." + ICON_SEARCH,
			CONFIG_GROUP + "." + TAG_TABS_CONFIG
		);

		for (String prefix : extraKeys)
		{
			List<String> keys = configManager.getConfigurationKeys(prefix);
			for (String key : keys)
			{
				String[] str = key.split("\\.", 2);
				if (str.length == 2)
				{
					configManager.unsetConfiguration(str[0], str[1]);
				}
			}
		}

		clientThread.invokeLater(this::reinitBank);
	}

	@Override
	public void startUp()
	{
		cleanConfig();
		spriteManager.addSpriteOverrides(TabSprites.values());
		eventBus.register(tabInterface);
		clientThread.invokeLater(this::reinitBank);
	}

	@Override
	public void shutDown()
	{
		eventBus.unregister(tabInterface);
		clientThread.invokeLater(() ->
		{
			// since the tab interface is unregistered from the eventbus, manually deinit it
			// and then reinit the bank.
			tabInterface.deinit();
			reinitBank();
		});
		spriteManager.removeSpriteOverrides(TabSprites.values());
	}

	private void reinitBank()
	{
		// call [clientscript,bankmain_init]
		Widget w = client.getWidget(ComponentID.BANK_CONTAINER);
		if (w != null)
		{
			client.createScriptEvent(w.getOnLoadListener())
				.setSource(w)
				.run();
		}
	}

	@Deprecated
	private void cleanConfig()
	{
		removeInvalidTags("tagtabs");

		List<String> tags = configManager.getConfigurationKeys(CONFIG_GROUP + ".item_");
		tags.forEach(s ->
		{
			String[] split = s.split("\\.", 2);
			removeInvalidTags(split[1]);
		});

		List<String> icons = configManager.getConfigurationKeys(CONFIG_GROUP + ".icon_");
		icons.forEach(s ->
		{
			String[] split = s.split("\\.", 2);
			String replaced = split[1].replaceAll("[<>/]", "");
			if (!split[1].equals(replaced))
			{
				String value = configManager.getConfiguration(CONFIG_GROUP, split[1]);
				configManager.unsetConfiguration(CONFIG_GROUP, split[1]);
				if (replaced.length() > "icon_".length())
				{
					configManager.setConfiguration(CONFIG_GROUP, replaced, value);
				}
			}
		});
	}

	@Deprecated
	private void removeInvalidTags(final String key)
	{
		final String value = configManager.getConfiguration(CONFIG_GROUP, key);
		if (value == null)
		{
			return;
		}

		String replaced = value.replaceAll("[<>:/]", "");
		if (!value.equals(replaced))
		{
			replaced = Text.toCSV(Text.fromCSV(replaced));
			if (replaced.isEmpty())
			{
				configManager.unsetConfiguration(CONFIG_GROUP, key);
			}
			else
			{
				configManager.setConfiguration(CONFIG_GROUP, key, replaced);
			}
		}
	}

	@Subscribe
	public void onGrandExchangeSearched(GrandExchangeSearched event)
	{
		final String input = client.getVarcStrValue(VarClientStr.INPUT_TEXT);
		if (!input.startsWith(TAG_SEARCH))
		{
			return;
		}

		event.consume();

		final String tag = input.substring(TAG_SEARCH.length()).trim();
		final Set<Integer> ids = tagManager.getItemsForTag(tag)
			.stream()
			.mapToInt(Math::abs)
			.mapToObj(ItemVariationMapping::getVariations)
			.flatMap(Collection::stream)
			.distinct()
			.filter(i -> itemManager.getItemComposition(i).isTradeable())
			.limit(MAX_RESULT_COUNT)
			.collect(Collectors.toCollection(TreeSet::new));

		client.setGeSearchResultIndex(0);
		client.setGeSearchResultCount(ids.size());
		client.setGeSearchResultIds(Shorts.toArray(ids));
	}

	@Subscribe
	public void onScriptCallbackEvent(ScriptCallbackEvent event)
	{
		String eventName = event.getEventName();

		int[] intStack = client.getIntStack();
		String[] stringStack = client.getStringStack();
		int intStackSize = client.getIntStackSize();
		int stringStackSize = client.getStringStackSize();

		switch (eventName)
		{
			case "setSearchBankInputText":
				stringStack[stringStackSize - 1] = SEARCH_BANK_INPUT_TEXT;
				break;
			case "setSearchBankInputTextFound":
			{
				int matches = intStack[intStackSize - 1];
				stringStack[stringStackSize - 1] = String.format(SEARCH_BANK_INPUT_TEXT_FOUND, matches);
				break;
			}
			case "bankSearchFilter":
				final int itemId = intStack[intStackSize - 1];
				final String searchfilter = stringStack[stringStackSize - 1];

				// This event only fires when the bank is in search mode. It will fire even if there is no search
				// input. We prevent having a tag tab open while also performing a normal search, so if a tag tab
				// is active here it must mean we have placed the bank into search mode. See onScriptPostFired().
				TagTab activeTab = tabInterface.getActiveTab();
				// Shared storage uses the bankmain filter scripts too. Allow using tag searches in it but don't
				// apply the tag search from the active tab.
				final boolean bankOpen = client.getItemContainer(InventoryID.BANK) != null;
				String search = activeTab != null && bankOpen ? TAG_SEARCH + activeTab.getTag() : searchfilter;

				if (search.isEmpty())
				{
					return;
				}

				boolean tagSearch = search.startsWith(TAG_SEARCH);
				if (tagSearch)
				{
					search = search.substring(TAG_SEARCH.length()).trim();
				}

				if (tagManager.findTag(itemId, search))
				{
					// return true
					intStack[intStackSize - 2] = 1;
				}
				else if (tagSearch)
				{
					// if the item isn't tagged we return false to prevent the item matching if the item name happens
					// to contain the tag name.
					intStack[intStackSize - 2] = 0;
				}
				break;
			case "getSearchingTagTab":
				intStack[intStackSize - 1] = tabInterface.isActive() ? 1 : 0;
				break;
		}
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (event.getActionParam1() == ComponentID.BANK_ITEM_CONTAINER
			&& event.getOption().equals("Examine"))
		{
			Widget container = client.getWidget(ComponentID.BANK_ITEM_CONTAINER);
			Widget item = container.getChild(event.getActionParam0());
			int itemID = item.getItemId();
			String text = EDIT_TAGS_MENU_OPTION;
			int tagCount = tagManager.getTags(itemID, false).size() + tagManager.getTags(itemID, true).size();

			if (tagCount > 0)
			{
				text += " (" + tagCount + ")";
			}

			client.createMenuEntry(-1)
				.setParam0(event.getActionParam0())
				.setParam1(event.getActionParam1())
				.setTarget(event.getTarget())
				.setOption(text)
				.setType(MenuAction.RUNELITE)
				.setIdentifier(event.getIdentifier())
				.onClick(this::editTags);
		}

		tabInterface.handleAdd(event);
	}

	private void editTags(MenuEntry entry)
	{
		int inventoryIndex = entry.getParam0();
		ItemContainer bankContainer = client.getItemContainer(InventoryID.BANK);
		if (bankContainer == null)
		{
			return;
		}

		Item[] items = bankContainer.getItems();
		if (inventoryIndex < 0 || inventoryIndex >= items.length)
		{
			return;
		}

		Item item = items[inventoryIndex];
		if (item == null)
		{
			return;
		}

		int itemId = item.getId();
		ItemComposition itemComposition = itemManager.getItemComposition(itemId);
		String name = itemComposition.getName();

		// Get both tags and vartags and append * to end of vartags name
		Collection<String> tags = tagManager.getTags(itemId, false);
		tagManager.getTags(itemId, true).stream()
			.map(i -> i + "*")
			.forEach(tags::add);

		String initialValue = Text.toCSV(tags);

		chatboxPanelManager.openTextInput(name + " tags:<br>(append " + VAR_TAG_SUFFIX + " for variation tag)")
			.addCharValidator(FILTERED_CHARS)
			.value(initialValue)
			.onDone((Consumer<String>) (newValue) ->
				clientThread.invoke(() ->
				{
					// Split inputted tags to vartags (ending with *) and regular tags
					final Collection<String> newTags = new ArrayList<>(Text.fromCSV(newValue.toLowerCase()));
					final Collection<String> newVarTags = new ArrayList<>(newTags).stream().filter(s -> s.endsWith(VAR_TAG_SUFFIX)).map(s ->
					{
						newTags.remove(s);
						return s.substring(0, s.length() - VAR_TAG_SUFFIX.length());
					}).collect(Collectors.toList());

					// And save them
					tagManager.setTagString(itemId, Text.toCSV(newTags), false);
					tagManager.setTagString(itemId, Text.toCSV(newVarTags), true);

					// If a tab if active, rebuild the bank to apply the changes
					tabInterface.reloadActiveTab();
				}))
			.build();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged configChanged)
	{
		if (configChanged.getGroup().equals(CONFIG_GROUP) && configChanged.getKey().equals("useTabs"))
		{
			clientThread.invokeLater(this::reinitBank);
		}
	}
}
