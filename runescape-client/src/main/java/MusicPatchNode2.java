import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("am")
	byte[] field3446;
	@ObfuscatedName("ap")
	byte[] field3445;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2073587451
	)
	int field3453;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1357198507
	)
	int field3448;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1563895247
	)
	int field3447;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1696962409
	)
	int field3450;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1478653309
	)
	int field3451;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -233143541
	)
	int field3452;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 290476327
	)
	int field3449;

	MusicPatchNode2() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;IB)Lmc;",
		garbageValue = "-46"
	)
	static MusicPatch method6039(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;B)V",
		garbageValue = "-76"
	)
	public static void method6040(AbstractArchive var0) {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-123"
	)
	static final int method6036() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	static void method6037() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class142.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = class185.method3710();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class11.method101(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class142.setLoginResponseString(Strings.field4239, Strings.field4065, Strings.field4241);
				Actor.method2489(6);
				break;
			case 3:
				class142.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class142.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class142.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class142.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class142.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-933399972"
	)
	static final String method6038(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return class208.colorStartTag(16711680);
		} else if (var2 < -6) {
			return class208.colorStartTag(16723968);
		} else if (var2 < -3) {
			return class208.colorStartTag(16740352);
		} else if (var2 < 0) {
			return class208.colorStartTag(16756736);
		} else if (var2 > 9) {
			return class208.colorStartTag(65280);
		} else if (var2 > 6) {
			return class208.colorStartTag(4259584);
		} else if (var2 > 3) {
			return class208.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class208.colorStartTag(12648192) : class208.colorStartTag(16776960);
		}
	}
}
