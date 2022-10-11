import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class152 extends class145 {
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1492776749
	)
	static int field1724;
	@ObfuscatedName("n")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1212207479
	)
	static int field1725;
	@ObfuscatedName("c")
	String field1726;
	@ObfuscatedName("p")
	byte field1721;
	@ObfuscatedName("f")
	byte field1720;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class152(class146 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-64301329"
	)
	void vmethod3300(Buffer var1) {
		this.field1726 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1726 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1721 = var1.readByte(); // L: 161
			this.field1720 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "97"
	)
	void vmethod3302(ClanChannel var1) {
		var1.name = this.field1726; // L: 167
		if (this.field1726 != null) { // L: 168
			var1.field1711 = this.field1721; // L: 169
			var1.field1709 = this.field1720; // L: 170
		}

	} // L: 172

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "28556"
	)
	static int method3310(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "200812028"
	)
	public static void method3303() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 82
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 83
			} // L: 84

			if (var0 == null) {
				return; // L: 85
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 86
		}
	}
}
