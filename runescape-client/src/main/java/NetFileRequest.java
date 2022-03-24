import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive")
	Archive archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	102733645)

	@Export("crc")
	int crc;
	@ObfuscatedName("h")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;Lpq;B)Lpq;", garbageValue = 
	"61")

	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = Login.method1894(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put(((Node) (var6)), ((long) (var5)));
		}

		return var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;B)V", garbageValue = 
	"-69")

	public static void method5867(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(CB)Z", garbageValue = 
	"59")

	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return (((var0 >= '0') && (var0 <= '9')) || ((var0 >= 'A') && (var0 <= 'Z'))) || ((var0 >= 'a') && (var0 <= 'z'));
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(descriptor = 
	"(IIIILql;Lkw;I)V", garbageValue = 
	"874629723")

	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = (var3 * var3) + (var2 * var2);
		if ((var6 > 4225) && (var6 < 90000)) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = ((var3 * var8) + (var9 * var2)) >> 16;
			int var11 = ((var3 * var9) - (var8 * var2)) >> 16;
			double var12 = Math.atan2(((double) (var10)), ((double) (var11)));
			int var14 = (var5.width / 2) - 25;
			int var15 = ((int) (Math.sin(var12) * ((double) (var14))));
			int var16 = ((int) (Math.cos(var12) * ((double) (var14))));
			byte var17 = 20;
			Huffman.redHintArrowSprite.method8238(var15 + ((var0 + (var5.width / 2)) - (var17 / 2)), ((((var5.height / 2) + var1) - (var17 / 2)) - var16) - 10, var17, var17, 15, 15, var12, 256);
		} else {
			Messages.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}