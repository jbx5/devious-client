package net.unethicalite.api.events;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.unethicalite.api.SceneEntity;

import java.util.function.Consumer;

@Getter
@Setter
@Builder
public class MenuAutomated
{
	@Builder.Default
	private String option = "Automated";
	@Builder.Default
	private String target = "";
	private int identifier;
	private MenuAction opcode;
	private int param0;
	private int param1;
	@Builder.Default
	private int clickX = -1;
	@Builder.Default
	private int clickY = -1;
	@Builder.Default
	private int itemId = -1;
	private SceneEntity entity;

	public MenuEntry toEntry(Client client, int idx)
	{
		return toEntry(client, idx, null);
	}

	public MenuEntry toEntry(Client client, int idx, Consumer<MenuEntry> consumer)
	{
		return toEntry(client, idx, option, target, consumer);
	}

	public MenuEntry toEntry(Client client, int idx, String option, String target)
	{
		return toEntry(client, idx, option, target, null);
	}

	public MenuEntry toEntry(Client client, int idx, String option, String target, Consumer<MenuEntry> consumer)
	{
		return client.createMenuEntry(idx)
				.setOption(option)
				.setTarget(target)
				.setIdentifier(identifier)
				.setType(opcode)
				.setParam0(param0)
				.setParam1(param1)
				.onClick(consumer);
	}

	public MenuEntry toEntry(Client client)
	{
		return toEntry(client, null);
	}

	public MenuEntry toEntry(Client client, Consumer<MenuEntry> consumer)
	{
		return toEntry(client, option, target, consumer);
	}

	public MenuEntry toEntry(Client client, String option, String target)
	{
		return toEntry(client, option, target, null);
	}

	public MenuEntry toEntry(Client client, String option, String target, Consumer<MenuEntry> consumer)
	{
		return toEntry(client, -1, option, target, consumer);
	}

	public MenuEntry toBareEntry(Client client)
	{
		return client.createMenuEntry(
				option,
				target,
				identifier,
				opcode.getId(),
				param0,
				param1,
				itemId,
				false
		);
	}
}
