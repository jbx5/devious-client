package net.unethicalite.api.widgets;

import net.runelite.api.Friend;
import net.unethicalite.client.Static;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Friends
{
	public static List<Friend> getAll(Predicate<Friend> filter)
	{
		return Arrays.stream(Static.getClient().getFriendContainer().getMembers())
				.filter(filter)
				.collect(Collectors.toList());
	}

	public static List<Friend> getAll(String... names)
	{
		return getAll(x ->
		{
			if (x.getName() == null)
			{
				return false;
			}

			for (String name : names)
			{
				if (name.equals(x.getName()))
				{
					return true;
				}
			}

			return false;
		});
	}

	public static List<Friend> getAll(int... worlds)
	{
		return getAll(x ->
		{
			for (int world : worlds)
			{
				if (world == x.getWorld())
				{
					return true;
				}
			}

			return false;
		});
	}

	public static Friend getFirst(Predicate<Friend> filter)
	{
		return getAll(filter).stream()
				.findFirst()
				.orElse(null);
	}

	public static Friend getFirst(String... names)
	{
		return getFirst(x ->
		{
			if (x.getName() == null)
			{
				return false;
			}

			for (String name : names)
			{
				if (name.equals(x.getName()))
				{
					return true;
				}
			}

			return false;
		});
	}

	public static Friend getFirst(int... worlds)
	{
		return getFirst(x ->
		{
			for (int world : worlds)
			{
				if (world == x.getWorld())
				{
					return true;
				}
			}

			return false;
		});
	}

	public static boolean isAdded(String name)
	{
		return Static.getClient().isFriended(name, false);
	}

	public static boolean isOnline(Friend friend)
	{
		return isOnline(friend.getName());
	}

	public static boolean isOnline(String name)
	{
		return Static.getClient().isFriended(name, true);
	}

	public static void add(String name)
	{
		Static.getClient().addFriend(name);
	}

	public static void remove(String name)
	{
		Static.getClient().removeFriend(name);
	}
}
