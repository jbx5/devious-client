import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("ns")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("fw")
	@ObfuscatedGetter(intValue = -101600863)
	static int field4331;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 467089255)
	@Export("capacity")
	final int capacity;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -239528243)
	@Export("size")
	int size = 0;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "[Lnd;")
	@Export("array")
	User[] array;

	@ObfuscatedName("n")
	@Export("usernamesMap")
	HashMap usernamesMap;

	@ObfuscatedName("x")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;

	@ObfuscatedName("g")
	@Export("comparator")
	Comparator comparator = null;

	UserList(int var1) {
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Lnd;", garbageValue = "12")
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)[Lnd;", garbageValue = "-1607059691")
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1713729845")
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, ((Object) (null)));
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-846803733")
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1618539079")
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(Lqi;B)Z", garbageValue = "9")
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(Lqi;I)Lnd;", garbageValue = "-1189586238")
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(Lqi;B)Lnd;", garbageValue = "-92")
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.usernamesMap.get(var1)));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(Lqi;B)Lnd;", garbageValue = "-34")
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.previousUsernamesMap.get(var1)));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(Lqi;I)Z", garbageValue = "-2098239373")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(Lnd;I)V", garbageValue = "-106911697")
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(Lqi;I)Lnd;", garbageValue = "993935093")
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, ((Username) (null)));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(Lqi;Lqi;I)Lnd;", garbageValue = "-154321526")
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(IB)Lnd;", garbageValue = "80")
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "532327817")
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(Lnd;Lqi;Lqi;B)V", garbageValue = "-55")
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(Lnd;B)I", garbageValue = "-98")
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(Lnd;I)V", garbageValue = "-920288527")
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(Lnd;I)V", garbageValue = "1604475672")
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(Lnd;I)V", garbageValue = "2126464584")
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "-9263")
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-90")
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V", garbageValue = "-1520318068")
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) (this.comparator)).addComparator(var1);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([BILjava/lang/CharSequence;I)I", garbageValue = "-126269322")
	public static int method6809(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;
		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = ((byte) (var6));
			} else if (var6 <= 2047) {
				var0[var4++] = ((byte) (192 | var6 >> 6));
				var0[var4++] = ((byte) (128 | var6 & 63));
			} else {
				var0[var4++] = ((byte) (224 | var6 >> 12));
				var0[var4++] = ((byte) (128 | var6 >> 6 & 63));
				var0[var4++] = ((byte) (128 | var6 & 63));
			}
		}
		return var4 - var1;
	}
}