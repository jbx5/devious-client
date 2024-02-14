import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1424369897
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("al")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ai")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)I",
		garbageValue = "-17325591"
	)
	static int method1157(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1994910292"
	)
	static void method1158(int var0, int var1, int var2, int var3) {
		class321.musicPlayerStatus = var0;
		class321.field3476 = var1;
		class321.field3485 = var2;
		class321.field3486 = var3;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IZZZZS)Lom;",
		garbageValue = "16056"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class173.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class155.masterDisk, class356.field3897, var0, var1, var2, var3, var4, false);
	}
}
