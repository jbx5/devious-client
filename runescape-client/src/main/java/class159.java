import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class159 extends class150 {
	@ObfuscatedName("jd")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("ap")
	String field1757;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class159(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1757 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.name = this.field1757;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1450976103"
	)
	static void method3642() {
		if ((Client.worldProperties & class552.field5439.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class6.method43(1);
			class96.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class552.field5416.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class552.field5424.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class6.method43(1);
			class96.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class552.field5424.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class6.method43(1);
			class96.focusPasswordWhenUsernameFilled();
		} else {
			FontName.Login_promptCredentials(false);
		}

	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-887575164"
	)
	static final void method3643() {
		Client.field701 = Client.cycleCntr;
		ObjectSound.field848 = true;
	}
}
