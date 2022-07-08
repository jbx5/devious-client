import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("kh")
public enum class295 implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lkh;")
	field3529(0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lkh;")
	field3526(1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkh;")
	field3527(2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkh;")
	field3528(3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lkh;")
	field3530(4);
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1099242609)
	final int field3525;

	class295(int var3) {
		this.field3525 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3525;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(CI)B", garbageValue = "-328191535")
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = ((byte) (var0));
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}
		return var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Lbc;I)V", garbageValue = "1904209787")
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			GrandExchangeOfferOwnWorldComparator.method1096(var0.isMembersOnly());
		}
		if (var0.properties != Client.worldProperties) {
			SoundSystem.method739(class304.archive8, var0.properties);
		}
		StructComposition.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		FloorDecoration.worldPort = (Client.gameBuild == 0) ? 43594 : var0.id + 40000;
		class18.js5Port = (Client.gameBuild == 0) ? 443 : var0.id + 50000;
		Client.currentPort = FloorDecoration.worldPort;
	}
}