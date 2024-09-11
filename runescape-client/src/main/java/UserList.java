import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1991364691
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1323812959
	)
	@Export("size")
	int size;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lss;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("ad")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ah")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("ap")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;",
		garbageValue = "-1113906309"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[Lss;",
		garbageValue = "-1325336376"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "685681119"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1363647746"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "821113673"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lwf;S)Z",
		garbageValue = "128"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lwf;B)Lss;",
		garbageValue = "-39"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lwf;I)Lss;",
		garbageValue = "1263043034"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lwf;I)Lss;",
		garbageValue = "-314301981"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lwf;B)Z",
		garbageValue = "3"
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lss;B)V",
		garbageValue = "84"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lwf;B)Lss;",
		garbageValue = "36"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lwf;Lwf;I)Lss;",
		garbageValue = "2097700284"
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Lss;",
		garbageValue = "1547516718"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lss;Lwf;Lwf;I)V",
		garbageValue = "189629305"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lss;I)I",
		garbageValue = "1917623707"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lss;I)V",
		garbageValue = "1178567633"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lss;B)V",
		garbageValue = "-53"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lss;I)V",
		garbageValue = "987449873"
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1522545690"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9720"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1078229185"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}
}
