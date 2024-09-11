import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class97 implements Iterable {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	WorldView field1204;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	final IterableNodeHashTable field1202;

	class97() {
		this.field1202 = new IterableNodeHashTable(16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldd;",
		garbageValue = "766479740"
	)
	WorldView method2614(int var1, int var2, int var3) {
		this.field1204 = this.method2615(-1, var1, var2, var3, class232.field2470);
		this.field1202.put(this.field1204, -1L);
		return this.field1204;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILin;I)Ldd;",
		garbageValue = "1221149411"
	)
	WorldView method2615(int var1, int var2, int var3, int var4, class232 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.field1202.put(var6, (long)var1);
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
		this.field1204.method2860();
		this.field1202.clear();
		this.field1202.put(this.field1204, -1L);
	}

	public Iterator iterator() {
		return this.field1202.iterator();
	}
}
