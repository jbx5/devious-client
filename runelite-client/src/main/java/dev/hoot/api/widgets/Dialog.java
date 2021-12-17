package dev.hoot.api.widgets;

import dev.hoot.api.commons.Time;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.input.Keyboard;
import dev.hoot.api.items.GrandExchange;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Dialog {

	private static final Supplier<Widget> DIALOG = () -> Widgets.get(162, 557);
	private static final Supplier<Widget> WEIRD_CONT = () -> Widgets.get(193, 3);
	private static final Supplier<Widget> WEIRD_CONT_2 = () -> Widgets.get(633, 0);
	private static final Supplier<Widget> NPC_CONT = () -> Widgets.get(WidgetID.DIALOG_NPC_GROUP_ID, 4);
	private static final Supplier<Widget> PLAYER_CONT = () -> Widgets.get(WidgetID.DIALOG_PLAYER_GROUP_ID, 3);
	private static final Supplier<Widget> DEATH_CONT = () -> Widgets.get(663, 0);
	private static final Supplier<Widget> TUT_CONT = () -> Widgets.get(229, 2);
	private static final Supplier<Widget> OPTIONS = () -> Widgets.get(WidgetID.DIALOG_OPTION_GROUP_ID, 1);

	// Tutorial island continue dialogs
	public static void continueTutorial() {
		GameThread.invoke(() -> Game.getClient().runScript(299, 1, 1, 1));
	}

	public static boolean isOpen() {
		Widget widget = DIALOG.get();
		return widget == null || GameThread.invokeLater(widget::isHidden);
	}

	public static boolean canContinue() {
		return GameThread.invokeLater(() -> canContinueNPC() || canContinuePlayer() || canContinueDeath()
						|| canWeirdContinue() || canWeirderContinue() || canWeirdestContinue() || canContinueTutIsland() || canContinueTutIsland2()
						|| canContinueTutIsland3() || canLevelUpContinue());
	}

	public static boolean canLevelUpContinue() {
		Widget widget = Widgets.get(WidgetInfo.LEVEL_UP_LEVEL);
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canWeirdContinue() {
		Widget widget = Widgets.get(WidgetInfo.DIALOG2_SPRITE_CONTINUE);
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canWeirderContinue() {
		Widget widget = WEIRD_CONT.get();
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canWeirdestContinue() {
		Widget widget = WEIRD_CONT_2.get();
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canContinueNPC() {
		Widget widget = NPC_CONT.get();
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canContinuePlayer() {
		Widget widget = PLAYER_CONT.get();
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canContinueDeath() {
		Widget widget = DEATH_CONT.get();
		return widget != null && GameThread.invokeLater(() ->
						!widget.isHidden()
										&& widget.getChild(2) != null
										&& !widget.getChild(2).isHidden()
		);
	}

	public static boolean canContinueTutIsland() {
		Widget widget = TUT_CONT.get();
		return widget != null && GameThread.invokeLater(() -> !widget.isHidden());
	}

	public static boolean canContinueTutIsland2() {
		Widget widget = Widgets.get(WidgetInfo.DIALOG_SPRITE);
		return widget != null
						&& GameThread.invokeLater(() ->
						!widget.isHidden()
										&& widget.getChild(2) != null
										&& !widget.getChild(2).isHidden()
		);
	}

	public static boolean canContinueTutIsland3() {
		Widget widget = Widgets.get(WidgetInfo.CHATBOX_FULL_INPUT);
		return widget != null
						&& GameThread.invokeLater(() -> !widget.isHidden())
						&& widget.getText().toLowerCase().contains("continue");
	}

	public static boolean isEnterInputOpen() {
		Widget widget = Widgets.get(WidgetInfo.CHATBOX_FULL_INPUT);
		return widget != null && !GameThread.invokeLater(widget::isHidden) && !GrandExchange.isSearchingItem();
	}

	public static void enterInput(String input) {
		Time.sleepUntil(Dialog::isEnterInputOpen, 2000);
		if (isEnterInputOpen()) {
			Keyboard.type(input, true);
		}
	}

	public static void enterInput(int input) {
		enterInput(String.valueOf(input));
	}

	public static boolean isViewingOptions() {
		return !getOptions().isEmpty();
	}

	public static void continueSpace() {
		if (Dialog.isOpen()) {
			Keyboard.sendSpace();
		}
	}

	public static boolean chooseOption(int index) {
		if (isViewingOptions()) {
			Keyboard.type(index);
			return true;
		}

		return false;
	}

	public static boolean chooseOption(String... options) {
		if (isViewingOptions()) {
			for (int i = 0; i < getOptions().size(); i++) {
				Widget widget = getOptions().get(i);
				for (String option : options) {
					if (widget.getText().contains(option)) {
						return chooseOption(i + 1);
					}
				}
			}
		}

		return false;
	}

	public static List<Widget> getOptions() {
		Widget widget = OPTIONS.get();
		if (widget == null || GameThread.invokeLater(widget::isHidden)) {
			return Collections.emptyList();
		}

		List<Widget> out = new ArrayList<>();
		Widget[] children = widget.getChildren();
		if (children == null) {
			return out;
		}

		// Skip first child, it's not a dialog option
		for (int i = 1; i < children.length; i++) {
			if (children[i].getText().isBlank()) {
				continue;
			}

			out.add(children[i]);
		}

		return out;
	}

	public static void quickProcess(DialogOption... dialogOption) {
		GameThread.invokeLater(() -> {
			for (DialogOption option : dialogOption) {
				option.process();
			}

			return true;
		});
	}
}
