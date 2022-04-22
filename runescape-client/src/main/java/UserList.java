import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-962501009)

	@Export("capacity")
	final int capacity;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1469945805)

	@Export("size")
	int size;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"[Lnn;")

	@Export("array")
	User[] array;
	@ObfuscatedName("p")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("w")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("k")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Lnn;", garbageValue = 
	"-2105397576")

	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)[Lnn;", garbageValue = 
	"1888809026")

	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-126")

	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, ((Object) (null)));
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1142855250")

	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(S)Z", garbageValue = 
	"15215")

	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)Z", garbageValue = 
	"-2040208013")

	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)Lnn;", garbageValue = 
	"85985954")

	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)Lnn;", garbageValue = 
	"-723468130")

	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.usernamesMap.get(var1)));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)Lnn;", garbageValue = 
	"1714959015")

	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.previousUsernamesMap.get(var1)));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)Z", garbageValue = 
	"1454726576")

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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;I)V", garbageValue = 
	"1184769229")

	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != (-1)) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;B)Lnn;", garbageValue = 
	"72")

	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, ((Username) (null)));
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;Lqb;I)Lnn;", garbageValue = 
	"155101250")

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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(II)Lnn;", garbageValue = 
	"1336383728")

	@Export("get")
	public final User get(int var1) {
		if ((var1 >= 0) && (var1 < this.size)) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"71")

	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;Lqb;Lqb;I)V", garbageValue = 
	"2114154350")

	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;I)I", garbageValue = 
	"1398600558")

	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;I)V", garbageValue = 
	"2123373059")

	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else 
		if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername);
		}


	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;B)V", garbageValue = 
	"0")

	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[(++this.size) - 1] = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;B)V", garbageValue = 
	"1")

	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			User var2 = ((User) (this.previousUsernamesMap.put(var1.previousUsername, var1)));
			if ((var2 != null) && (var2 != var1)) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1984344824")

	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"633444578")

	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/Comparator;I)V", garbageValue = 
	"-2147310039")

	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) (this.comparator)).addComparator(var1);
		}

	}
}