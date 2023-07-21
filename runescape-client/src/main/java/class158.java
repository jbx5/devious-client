import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class158 extends class143 {
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("am")
	static File field1748;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5087881689276661231L
	)
	long field1746;
	@ObfuscatedName("ay")
	String field1747;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -201191647
	)
	int field1751;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class158(class146 var1) {
		this.this$0 = var1;
		this.field1746 = -1L;
		this.field1747 = null;
		this.field1751 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1746 = var1.readLong();
		}

		this.field1747 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1751 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3233(this.field1746, this.field1747, this.field1751);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhg;",
		garbageValue = "1969817280"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(IIIILud;Lmi;I)V",
		garbageValue = "-750705418"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			SoundCache.redHintArrowSprite.method9656(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			GameEngine.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2067489904"
	)
	public static boolean method3322() {
		return Client.staffModLevel >= 2;
	}
}
