import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1855293411
	)
	int field1200;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1008038753
	)
	int field1191;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 433863545
	)
	int field1192;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -264142591
	)
	int field1196;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 106953625
	)
	int field1194;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1536759051
	)
	int field1195;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1120669841
	)
	int field1201;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 875810921
	)
	int field1193;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -995596597
	)
	int field1198;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1848412699
	)
	int field1197;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1214778777
	)
	int field1190;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2010923569
	)
	int field1199;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1187381017
	)
	int field1202;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1758720105
	)
	int field1203;

	PendingSpawn() {
		this.field1199 = 31;
		this.field1202 = 0;
		this.field1203 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "111"
	)
	void method2412(int var1) {
		this.field1199 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "521834596"
	)
	boolean method2415(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1199 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhc;",
		garbageValue = "105227683"
	)
	static HorizontalAlignment[] method2417() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2107, HorizontalAlignment.field2105};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "300392582"
	)
	static void method2411(boolean var0) {
		byte var1 = 0;
		if (!HttpRequestTask.hasAcceptedEULA()) {
			var1 = 12;
		} else if (class188.client.containsAccessAndRefreshToken() || class188.client.otlTokenRequesterInitialized() || class188.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		ParamComposition.updateLoginIndex(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class414.otpMedium = 0;
			class285.otp = "";
		}

		AsyncHttpResponse.updateToRememberedUsername();
		ActorSpotAnim.focusPasswordWhenUsernameFilled();
	}
}
