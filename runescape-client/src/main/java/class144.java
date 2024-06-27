import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class144 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 220879453
	)
	int field1679;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1092215929
	)
	int field1677;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1641898427
	)
	int field1676;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -234504907
	)
	int field1680;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class144(class150 var1) {
		this.this$0 = var1;
		this.field1679 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1679 = var1.readUnsignedShort();
		this.field1677 = var1.readInt();
		this.field1676 = var1.readUnsignedByte();
		this.field1680 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3363(this.field1679, this.field1677, this.field1676, this.field1680);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	public static void method3244() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}
}
