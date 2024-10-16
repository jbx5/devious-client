import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	WorldView field1191;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("hashTable")
	final IterableNodeHashTable hashTable;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 884311629
	)
	int field1193;
	@ObfuscatedName("aj")
	final HashMap field1192;
	@ObfuscatedName("ai")
	final HashMap field1196;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	class492 field1189;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	class491 field1195;

	WorldViewManager() {
		this.hashTable = new IterableNodeHashTable(16);
		this.field1193 = 0;
		this.field1192 = new HashMap(16);
		this.field1196 = new HashMap(16);
		this.field1189 = class492.field5089;
		this.field1195 = class491.field5083;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldn;",
		garbageValue = "-316680284"
	)
	WorldView method2667(int var1, int var2, int var3) {
		this.field1191 = this.method2684(-1, var1, var2, var3, class232.field2470);
		return this.field1191;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIILim;I)Ldn;",
		garbageValue = "941942769"
	)
	WorldView method2684(int var1, int var2, int var3, int var4, class232 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.hashTable.put(var6, (long)var1);
		++this.field1193;
		return var6;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "1742557413"
	)
	void method2700(WorldView var1) {
		if (var1 != null) {
			this.field1192.remove(var1.id);
			this.field1196.remove(var1.id);
			var1.remove();
			--this.field1193;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ldn;",
		garbageValue = "-1634950082"
	)
	public WorldView method2670() {
		return this.field1191;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-39814115"
	)
	int method2671() {
		return this.field1193;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsx;Lsf;I)V",
		garbageValue = "-264387331"
	)
	void method2672(class492 var1, class491 var2) {
		this.field1189 = var1;
		this.field1195 = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILsx;Lsf;B)V",
		garbageValue = "-54"
	)
	void method2673(int var1, class492 var2, class491 var3) {
		this.field1192.put(var1, var2);
		this.field1196.put(var1, var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method2701(int var1) {
		this.field1192.remove(var1);
		this.field1196.remove(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsx;",
		garbageValue = "7"
	)
	class492 method2675(int var1) {
		class492 var2 = (class492)this.field1192.get(var1);
		return var2 != null ? var2 : this.field1189;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsf;",
		garbageValue = "44"
	)
	class491 method2676(int var1) {
		class491 var2 = (class491)this.field1196.get(var1);
		return var2 != null ? var2 : this.field1195;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1550738967"
	)
	@Export("clear")
	void clear() {
		this.hashTable.clear();
		this.field1193 = 0;
		this.field1192.clear();
		this.field1196.clear();
		this.field1189 = class492.field5089;
		this.field1195 = class491.field5083;
		if (this.field1191 != null) {
			this.field1191.method2943();
			this.hashTable.put(this.field1191, -1L);
			this.field1193 = 1;
		}

	}

	public Iterator iterator() {
		return this.hashTable.iterator();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	static int method2699() {
		return class28.KeyHandler_keyCodes.length;
	}
}
