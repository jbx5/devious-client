package net.unethicalite.api;

import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.events.MenuAutomated;

import java.util.Arrays;
import java.util.function.Predicate;

public interface Interactable
{
	Point getClickPoint();

	String[] getActions();

	int getActionOpcode(int action);

	MenuAutomated getMenu(int actionIndex);

	MenuAutomated getMenu(int actionIndex, int opcode);

	void interact(int index);

	void interact(int index, int opcode);

	void interact(int identifier, int opcode, int param0, int param1);

	default int getActionIndex(String action)
	{
		return Arrays.asList(getActions()).indexOf(action);
	}

	default void interact(Predicate<String> predicate)
	{
		String[] raw = getActions();
		if (raw == null)
		{
			return;
		}

		for (int i = 0; i < raw.length; i++)
		{
			if (predicate.test(raw[i]))
			{
				interact(i);
				return;
			}
		}
	}

	default void interact(String action)
	{
		if (getActions() == null)
		{
			return;
		}

		int index = getActionIndex(action);
		if (index == -1)
		{
			return;
		}

		interact(index);
	}

	default void interact(String... actions)
	{
		interact(Predicates.texts(actions));
	}

	default boolean hasAction(Predicate<String> filter)
	{
		String[] raw = getActions();
		if (raw == null)
		{
			return false;
		}

		return Arrays.stream(raw).anyMatch(filter);
	}

	default boolean hasAction(String... actions)
	{
		return hasAction(Predicates.texts(actions));
	}

	default MenuAutomated getMenu(String action)
	{
		return getMenu(getActionIndex(action));
	}

	default MenuAutomated getMenu(int identifier, int opcode, int param0, int param1)
	{
		MenuAutomated.MenuAutomatedBuilder builder = MenuAutomated.builder()
				.identifier(identifier)
				.opcode(MenuAction.of(opcode))
				.param0(param0)
				.param1(param1);

		if (this instanceof SceneEntity)
		{
			builder.entity((SceneEntity) this);
		}
		else
		{
			Point clickPoint = getClickPoint();
			builder.clickX(clickPoint.getX())
					.clickY(clickPoint.getY());
		}

		return builder.build();
	}
}
