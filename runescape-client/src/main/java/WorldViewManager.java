import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("hashTable")
	final IterableNodeHashTable hashTable;

	WorldViewManager() {
		this.hashTable = new IterableNodeHashTable(16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldd;",
		garbageValue = "766479740"
	)
	WorldView method2614(int var1, int var2, int var3) {
		this.worldView = this.method2615(-1, var1, var2, var3, class232.field2470);
		this.hashTable.put(this.worldView, -1L);
		return this.worldView;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILin;I)Ldd;",
		garbageValue = "1221149411"
	)
	WorldView method2615(int var1, int var2, int var3, int var4, class232 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.hashTable.put(var6, (long)var1);
		return var6;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "613246029"
	)
	void method2613(WorldView var1) {
		if (var1 != null) {
			var1.remove();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4096"
	)
	@Export("clear")
	void clear() {
		this.worldView.method2860();
		this.hashTable.clear();
		this.hashTable.put(this.worldView, -1L);
	}

	public Iterator iterator() {
		return this.hashTable.iterator();
	}
}
