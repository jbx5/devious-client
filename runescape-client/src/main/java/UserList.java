import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("nr")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 2139320615)
	@Export("capacity")
	final int capacity;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1908802599)
	@Export("size")
	int size = 0;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "[Lnb;")
	@Export("array")
	User[] array;

	@ObfuscatedName("a")
	@Export("usernamesMap")
	HashMap usernamesMap;

	@ObfuscatedName("m")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;

	@ObfuscatedName("u")
	@Export("comparator")
	Comparator comparator = null;

	UserList(int var1) {
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)Lnb;", garbageValue = "1043377845")
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)[Lnb;", garbageValue = "46467081")
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-27475")
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, ((Object) (null)));
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1935883392")
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "-15378")
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(Lqy;I)Z", garbageValue = "-1535295925")
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(Lqy;I)Lnb;", garbageValue = "2034250284")
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(Lqy;I)Lnb;", garbageValue = "1851850510")
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.usernamesMap.get(var1)));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(Lqy;I)Lnb;", garbageValue = "-419798119")
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.previousUsernamesMap.get(var1)));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(Lqy;I)Z", garbageValue = "-603485605")
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(Lnb;B)V", garbageValue = "-35")
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(Lqy;B)Lnb;", garbageValue = "-1")
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, ((Username) (null)));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(Lqy;Lqy;B)Lnb;", garbageValue = "86")
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(II)Lnb;", garbageValue = "-1498364129")
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "60")
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(Lnb;Lqy;Lqy;I)V", garbageValue = "656088804")
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(Lnb;B)I", garbageValue = "-50")
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "-1047886129")
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "-1390035986")
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "1761503827")
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			User var2 = ((User) (this.previousUsernamesMap.put(var1.previousUsername, var1)));
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "8")
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-956307950")
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;S)V", garbageValue = "-25489")
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) (this.comparator)).addComparator(var1);
		}
	}
}