import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class151 extends class150 {
	@ObfuscatedName("aj")
	static File field1708;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 225519357
	)
	int field1705;
	@ObfuscatedName("aw")
	boolean field1707;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class151(class153 var1) {
		this.this$0 = var1;
		this.field1705 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1705 = var1.readUnsignedShort();
		this.field1707 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3666(this.field1705, this.field1707);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1697292236"
	)
	static final void method3583() {
		Client.field586 = Client.cycleCntr;
	}
}
