import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1875806315
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -855604593
	)
	@Export("size")
	int size;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lsk;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("au")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ah")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("az")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0;
		this.comparator = null;
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsk;",
		garbageValue = "99"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsk;",
		garbageValue = "-2040243144"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "567107698"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "28522"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1035493324"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lvo;B)Z",
		garbageValue = "1"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lvo;B)Lsk;",
		garbageValue = "-39"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lvo;B)Lsk;",
		garbageValue = "-61"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Lsk;",
		garbageValue = "837458464"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Z",
		garbageValue = "-634012871"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		if (var2 == null) {
			return false;
		} else {
			this.remove(var2);
			return true;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lsk;S)V",
		garbageValue = "-3463"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Lsk;",
		garbageValue = "295946346"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lvo;Lvo;I)Lsk;",
		garbageValue = "1991162674"
	)
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) {
			throw new IllegalStateException();
		} else {
			User var3 = this.newInstance();
			var3.set(var1, var2);
			this.arrayAddLast(var3);
			this.mapPut(var3);
			return var3;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)Lsk;",
		garbageValue = "-1890256480"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lsk;Lvo;Lvo;I)V",
		garbageValue = "1881769358"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)I",
		garbageValue = "707997239"
	)
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "-2013396087"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername);
			}

		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "303602913"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "799526432"
	)
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1750562623"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408274121"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "3"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1596011288"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			KitDefinition.method3632(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = class142.Widget_getSpellActionName(var0);
			if (var1 != null) {
				KitDefinition.method3632(var1, NpcOverrides.colorStartTag(65280) + var0.field3960, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			UrlRequester.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			UrlRequester.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			UrlRequester.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			UrlRequester.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var2;
			if (Client.isSpellSelected) {
				var2 = ClanChannel.getWidgetFlags(var0);
				boolean var5 = (var2 >> 21 & 1) != 0;
				if (var5 && (class92.selectedSpellFlags & 32) == 32) {
					KitDefinition.method3632(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var9 = 9; var9 >= 5; --var9) {
					String var7;
					if (!Varps.method6452(ClanChannel.getWidgetFlags(var0), var9) && var0.onOp == null) {
						var7 = null;
					} else if (var0.actions != null && var0.actions.length > var9 && var0.actions[var9] != null && var0.actions[var9].trim().length() != 0) {
						var7 = var0.actions[var9];
					} else {
						var7 = null;
					}

					if (var7 != null) {
						KitDefinition.method3632(var7, var0.dataText, 1007, var9 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}

				var1 = class142.Widget_getSpellActionName(var0);
				if (var1 != null) {
					KitDefinition.method3632(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					String var6;
					if (!Varps.method6452(ClanChannel.getWidgetFlags(var0), var2) && var0.onOp == null) {
						var6 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var6 = var0.actions[var2];
					} else {
						var6 = null;
					}

					if (var6 != null) {
						WorldMapArea.insertMenuItem(var6, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
					}
				}

				int var3 = ClanChannel.getWidgetFlags(var0);
				boolean var8 = (var3 & 1) != 0;
				if (var8) {
					UrlRequester.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
