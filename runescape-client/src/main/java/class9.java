import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class9 implements MouseWheel {
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	public static final class9 field34;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	public static final class9 field32;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	static final class9 field33;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	static final class9 field37;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	static final class9 field35;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -516341067
	)
	static int field31;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -355301615
	)
	int field38;
	@ObfuscatedName("s")
	String field40;
	@ObfuscatedName("q")
	boolean field36;
	@ObfuscatedName("m")
	boolean field39;

	static {
		field34 = new class9(0, "POST", true, true); // L: 6
		field32 = new class9(1, "GET", true, false); // L: 7
		field33 = new class9(2, "PUT", false, true); // L: 8
		field37 = new class9(3, "PATCH", false, true); // L: 9
		field35 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field38 = var1; // L: 17
		this.field40 = var2; // L: 18
		this.field36 = var3; // L: 19
		this.field39 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2133594239"
	)
	boolean method87() {
		return this.field36; // L: 24
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field38; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-338873662"
	)
	public String method75() {
		return this.field40; // L: 28
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1305116386"
	)
	boolean method76() {
		return this.field39; // L: 32
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static final int method83(int var0, int var1) {
		if (var0 == -1) { // L: 978
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 979
			if (var1 < 2) { // L: 980
				var1 = 2;
			} else if (var1 > 126) { // L: 981
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 982
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "17950"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3529
			class17.method267(); // L: 3530
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Player.clientPreferences.method2402() != 0 && !Client.playingJingle) { // L: 3532
			Archive var1 = class14.archive6; // L: 3533
			int var2 = Player.clientPreferences.method2402(); // L: 3534
			class274.musicPlayerStatus = 1; // L: 3536
			class274.musicTrackArchive = var1; // L: 3537
			class274.musicTrackGroupId = var0; // L: 3538
			StructComposition.musicTrackFileId = 0; // L: 3539
			class269.musicTrackVolume = var2; // L: 3540
			TriBool.musicTrackBoolean = false; // L: 3541
			VarcInt.pcmSampleLength = 2; // L: 3542
		}

		Client.currentTrackGroupId = var0; // L: 3545
	} // L: 3546

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1657093407"
	)
	static final void method89(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8180
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8181
				Client.field714[var4] = true;
			}
		}

	} // L: 8183

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "37"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class145.friendsChat != null) { // L: 11952
			PacketBufferNode var1 = class120.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher); // L: 11953
			var1.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var0)); // L: 11954
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11955
			Client.packetWriter.addNode(var1); // L: 11956
		}
	} // L: 11957
}
