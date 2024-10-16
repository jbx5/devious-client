import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public class class357 {
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -952592971
	)
	static int field3813;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public class359 field3815;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class353 field3809;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	class27 field3810;
	@ObfuscatedName("aj")
	public Object[] field3808;
	@ObfuscatedName("ai")
	public Object[] field3812;
	@ObfuscatedName("ay")
	public Object[] field3811;
	@ObfuscatedName("as")
	public Object[] field3814;

	class357() {
		this.field3815 = new class359();
		this.field3809 = new class353();
		this.field3810 = new class27();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-1635029644"
	)
	static final int method6924(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class75.field899, class75.field898);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var19 = class1.method4();
			var5.writeBytes(var19, 0, var19.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class75.field899, class75.field898);
		var7 = World.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		int var13 = var11.length;
		StringBuilder var14 = new StringBuilder();

		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) {
			int var16 = var11[var15] & 255;
			var14.append(class418.field4745[var16 >>> 2]);
			if (var15 < var13 - 1) {
				var17 = var11[var15 + 1] & 255;
				var14.append(class418.field4745[(var16 & 3) << 4 | var17 >>> 4]);
				if (var15 < var13 - 2) {
					int var18 = var11[var15 + 2] & 255;
					var14.append(class418.field4745[(var17 & 15) << 2 | var18 >>> 6]).append(class418.field4745[var18 & 63]);
				} else {
					var14.append(class418.field4745[(var17 & 15) << 2]).append("=");
				}
			} else {
				var14.append(class418.field4745[(var16 & 3) << 4]).append("==");
			}
		}

		String var12 = var14.toString();
		var12 = var12;

		try {
			URL var20 = new URL(Messages.method3176("services", false) + "m=accountappeal/login.ws");
			URLConnection var25 = var20.openConnection();
			var25.setDoInput(true);
			var25.setDoOutput(true);
			var25.setConnectTimeout(5000);
			OutputStreamWriter var21 = new OutputStreamWriter(var25.getOutputStream());
			var21.write("data2=" + class421.method8125(var12) + "&dest=" + class421.method8125("passwordchoice.ws"));
			var21.flush();
			InputStream var22 = var25.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				var17 = var22.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var21.close();
					var22.close();
					String var23 = new String(var9.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var23 = new String(var9.array, 0, var9.offset);
						if (SecureUrlRequester.method3242(var23)) {
							GrandExchangeOfferAgeComparator.openURL(var23, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var17;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var24) {
			var24.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	static void method6925() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class132.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			class132.setLoginResponseString("", "Please enter your password.", "");
		} else {
			class132.setLoginResponseString("", "Connecting to server...", "");
			Client.authenticationScheme = TaskHandler.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
			BuddyRankComparator.updateGameState(20);
		}
	}
}
