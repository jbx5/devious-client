import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class163 extends class166 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-2137509577)

	int field1761;

	@ObfuscatedSignature(descriptor = 
	"Lev;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lev;Ljava/lang/String;I)V")

	class163(class155 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1761 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1689964957")

	public int vmethod3341() {
		return 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"31414")

	public int vmethod3334() {
		return this.field1761;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BILjava/lang/CharSequence;I)I", garbageValue = 
	"760271805")

	public static int method3321(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = ((byte) (var6));
			} else if (var6 <= 2047) {
				var0[var4++] = ((byte) (192 | (var6 >> 6)));
				var0[var4++] = ((byte) (128 | (var6 & '?')));
			} else {
				var0[var4++] = ((byte) (224 | (var6 >> '\f')));
				var0[var4++] = ((byte) (128 | ((var6 >> 6) & 63)));
				var0[var4++] = ((byte) (128 | (var6 & '?')));
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("v")
	public static final int method3320(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0) {
			double var12;
			if (var4 < 0.5) {
				var12 = (1.0 + var2) * var4;
			} else {
				var12 = (var4 + var2) - (var4 * var2);
			}

			double var14 = (2.0 * var4) - var12;
			double var16 = var0 + 0.3333333333333333;
			if (var16 > 1.0) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				++var20;
			}

			if ((6.0 * var16) < 1.0) {
				var6 = var14 + ((6.0 * (var12 - var14)) * var16);
			} else if ((2.0 * var16) < 1.0) {
				var6 = var12;
			} else if ((var16 * 3.0) < 2.0) {
				var6 = ((6.0 * (var12 - var14)) * (0.6666666666666666 - var16)) + var14;
			} else {
				var6 = var14;
			}

			if ((6.0 * var0) < 1.0) {
				var8 = var14 + (((var12 - var14) * 6.0) * var0);
			} else if ((2.0 * var0) < 1.0) {
				var8 = var12;
			} else if ((var0 * 3.0) < 2.0) {
				var8 = var14 + (((0.6666666666666666 - var0) * (var12 - var14)) * 6.0);
			} else {
				var8 = var14;
			}

			if ((6.0 * var20) < 1.0) {
				var10 = var14 + ((var20 * (var12 - var14)) * 6.0);
			} else if ((var20 * 2.0) < 1.0) {
				var10 = var12;
			} else if ((3.0 * var20) < 2.0) {
				var10 = var14 + (((var12 - var14) * (0.6666666666666666 - var20)) * 6.0);
			} else {
				var10 = var14;
			}
		}

		int var22 = ((int) (256.0 * var6));
		int var13 = ((int) (256.0 * var8));
		int var23 = ((int) (var10 * 256.0));
		int var15 = (var23 + (var13 << 8)) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;ZLmd;I)V", garbageValue = 
	"845693367")

	public static void method3318(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		SoundCache.ItemDefinition_archive = var0;
		AttackOption.ItemDefinition_modelArchive = var1;
		DevicePcmPlayerProvider.ItemDefinition_inMembersWorld = var2;
		class293.ItemDefinition_fileCount = SoundCache.ItemDefinition_archive.getGroupFileCount(10);
		ParamComposition.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lgw;", garbageValue = 
	"-26")

	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = ((SequenceDefinition) (SequenceDefinition.SequenceDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class11.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;IIB)Lmd;", garbageValue = 
	"3")

	public static Font method3322(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			WorldMapArea.SpriteBuffer_decode(var5);
			var4 = true;
		}

		return !var4 ? null : ViewportMouse.method5090(var1.takeFile(var2, var3));
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(descriptor = 
	"(Lct;I)V", garbageValue = 
	"-2096027290")

	static final void method3315(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = ArchiveLoader.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = ArchiveLoader.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = ArchiveLoader.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ArchiveLoader.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = ArchiveLoader.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = FileSystem.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = (var6 >> 6) & 3;
		}

		var0.objectId = var3;
		var0.field1105 = var4;
		var0.field1104 = var5;
	}
}