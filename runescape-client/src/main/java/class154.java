import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class154 extends class150 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 531673615
	)
	int field1724;
	@ObfuscatedName("aw")
	byte field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class154(class153 var1) {
		this.this$0 = var1;
		this.field1724 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1724 = var1.readUnsignedShort();
		this.field1722 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3664(this.field1724, this.field1722);
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "1600697300"
	)
	static void method3607(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class451.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
