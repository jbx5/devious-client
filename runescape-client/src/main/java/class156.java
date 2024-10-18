import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class156 extends class166 {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field1737;
	@ObfuscatedName("gl")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1461970157
	)
	int field1733;
	@ObfuscatedName("aw")
	byte field1732;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1533555405
	)
	int field1739;
	@ObfuscatedName("aj")
	String field1734;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class156(class167 var1) {
		this.this$0 = var1;
		this.field1733 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-303680000"
	)
	void vmethod3816(Buffer var1) {
		this.field1733 = var1.readUnsignedShort();
		this.field1732 = var1.readByte();
		this.field1739 = var1.readUnsignedShort();
		var1.readLong();
		this.field1734 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "-152326479"
	)
	void vmethod3817(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1733);
		var2.rank = this.field1732;
		var2.world = this.field1739;
		var2.username = new Username(this.field1734);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "19"
	)
	static final int method3622(int var0) {
		return Math.abs(var0 - class390.cameraYaw) > 1024 ? var0 + 2048 * (var0 < class390.cameraYaw ? 1 : -1) : var0;
	}
}
