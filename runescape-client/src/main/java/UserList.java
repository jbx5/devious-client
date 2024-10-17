import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1108690839
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 40009885
	)
	@Export("size")
	int size;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lse;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("an")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ao")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("af")
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lse;",
		garbageValue = "-807171089"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)[Lse;",
		garbageValue = "1608525822"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-75736655"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-72"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "42"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Z",
		garbageValue = "-2015580611"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Lse;",
		garbageValue = "-1235505935"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lwx;B)Lse;",
		garbageValue = "-30"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Lse;",
		garbageValue = "-2002683332"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Z",
		garbageValue = "376680354"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lse;I)V",
		garbageValue = "-1936730839"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Lse;",
		garbageValue = "-1008200315"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lwx;Lwx;S)Lse;",
		garbageValue = "9773"
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Lse;",
		garbageValue = "716740655"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lwx;Lwx;I)V",
		garbageValue = "-1571468601"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lse;B)I",
		garbageValue = "0"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lse;B)V",
		garbageValue = "13"
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lse;I)V",
		garbageValue = "654321447"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lse;B)V",
		garbageValue = "1"
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "81"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "2"
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
		descriptor = "(I)V",
		garbageValue = "2104649368"
	)
	static final void method9103() {
		Client.field700 = Client.cycleCntr;
		Clock.ClanChat_inClanChat = true;
	}
}
