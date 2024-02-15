import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class150 extends class145 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1703;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1471281011
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 864379007
	)
	int field1704;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -87635401
	)
	int field1702;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1132385113
	)
	int field1707;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1342163369
	)
	int field1701;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class150(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1704 = var1.readInt();
		this.field1701 = var1.readInt();
		this.field1702 = var1.readUnsignedByte();
		this.field1707 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3319(this.field1704, this.field1701, this.field1702, this.field1707);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1620728648"
	)
	static void method3272(int var0) {
		JagexCache.method4224(14);
		Login.Login_banType = var0;
	}
}
