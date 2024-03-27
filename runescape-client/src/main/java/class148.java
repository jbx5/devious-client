import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class148 extends class144 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1478693243
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1499259535
	)
	int field1700;
	@ObfuscatedName("ah")
	byte field1701;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class148(class147 var1) {
		this.this$0 = var1;
		this.field1700 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1700 = var1.readUnsignedShort();
		this.field1701 = var1.readByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3307(this.field1700, this.field1701);
	}
}
