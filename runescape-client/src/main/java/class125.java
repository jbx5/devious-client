import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("de")
public class class125 extends class128 {
	@ObfuscatedName("c")
	@Export("cacheDir")
	static File cacheDir;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -987319237)
	int field1529;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1623168443)
	int field1527;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -638251523)
	int field1526;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 603420191)
	int field1528;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1529 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		this.field1529 = var1.readUnsignedShort();
		this.field1527 = var1.readInt();
		this.field1526 = var1.readUnsignedByte();
		this.field1528 = var1.readUnsignedByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.method2937(this.field1529, this.field1527, this.field1526, this.field1528);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "-12")
	static final void method2776(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					Tiles.field975[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}
					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}
					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}
					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(descriptor = "(Lkn;B)V", garbageValue = "-43")
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field697) {
			Client.field643[var0.rootIndex] = true;
		}
	}
}