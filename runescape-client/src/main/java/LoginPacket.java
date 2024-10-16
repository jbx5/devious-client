import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("LoginPacket")
public class LoginPacket extends class150 {
	@ObfuscatedName("aj")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 7772991231255048331L
	)
	long field1695;
	@ObfuscatedName("aw")
	String field1692;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	LoginPacket(class153 var1) {
		this.this$0 = var1;
		this.field1695 = -1L;
		this.field1692 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1695 = var1.readLong();
		}

		this.field1692 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3659(this.field1695, this.field1692, 0);
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1625323105"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
