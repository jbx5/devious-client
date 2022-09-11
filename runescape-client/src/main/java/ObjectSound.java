import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -1208168089
	)
	static int field832;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 516937797
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -870441583
	)
	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 378496640
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1197669760
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1611461431
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1585697121
	)
	int field819;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -272736565
	)
	int field823;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1699420357
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1844338655
	)
	int field827;
	@ObfuscatedName("v")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1150988163
	)
	int field829;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "940400704"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field823 = var2.int7 * 128; // L: 54
			this.field819 = var2.int5; // L: 55
			this.field827 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field823 = 0; // L: 61
			this.field819 = 0; // L: 62
			this.field827 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			class16.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcj;",
		garbageValue = "1956276941"
	)
	static class83[] method1849() {
		return new class83[]{class83.field1073, class83.field1074, class83.field1078, class83.field1076, class83.field1075, class83.field1077}; // L: 17
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "46"
	)
	static void method1848(boolean var0) {
		byte var1 = 0; // L: 1138
		if (!class344.method6492()) { // L: 1139
			var1 = 12; // L: 1140
		} else if (IgnoreList.client.method1190() || IgnoreList.client.method1191()) { // L: 1142
			var1 = 10; // L: 1143
		}

		class139.method3101(var1); // L: 1145
		if (var0) { // L: 1146
			Login.Login_username = ""; // L: 1147
			Login.Login_password = ""; // L: 1148
			class347.field4201 = 0; // L: 1149
			class28.otp = ""; // L: 1150
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1153
			if (Player.clientPreferences.method2407() != null) { // L: 1154
				Login.Login_username = Player.clientPreferences.method2407(); // L: 1155
				Client.Login_isUsernameRemembered = true; // L: 1156
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1158
			}
		}

		class65.method2029(); // L: 1160
	} // L: 1161

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-500016340"
	)
	static void method1850(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12016
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 12017
				var1.remove(); // L: 12018
			}
		}

	} // L: 12021
}
