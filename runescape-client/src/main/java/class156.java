import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class156 extends class160 {
	@ObfuscatedName("az")
	String field1758;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 372181157
	)
	int field1759;
	@ObfuscatedName("af")
	byte field1760;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class156(class161 var1) {
		this.this$0 = var1;
		this.field1758 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1758 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1759 = var1.readUnsignedShort();
		this.field1760 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1758);
		var2.world = this.field1759;
		var2.rank = this.field1760;
		var1.addMember(var2);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "-552810314"
	)
	static void method3318(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, Canvas.getTileHeight(var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, Canvas.getTileHeight(var3, var4, var0) - var8, var9 + Client.cycle);
		Client.projectiles.addFirst(var14);
	}
}
