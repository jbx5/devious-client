import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class146 extends class147 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("cx")
	@Export("otp")
	static String otp;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -328879889
	)
	int field1690;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class146(class150 var1) {
		this.this$0 = var1;
		this.field1690 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1690 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3390(this.field1690);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lok;III)Z",
		garbageValue = "145522420"
	)
	public static boolean method3260(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			DefaultsGroup.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
