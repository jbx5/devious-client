import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class402 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static final class402 field4634;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static final class402 field4635;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static final class402 field4636;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static final class402 field4638;

	static {
		field4634 = new class402();
		field4635 = new class402();
		field4636 = new class402();
		field4638 = new class402();
	}

	class402() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)I",
		garbageValue = "-90"
	)
	static final int method7746(long var0, String var2) {
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

		var4.encryptRsa(class75.field921, class75.field917);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		class27.randomDatData2(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class75.field921, class75.field917);
		var7 = class536.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		String var10 = FileSystem.base64Encode(var9.array);

		try {
			URL var11 = new URL(class354.method6858("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + MoveSpeed.method5703(var10) + "&dest=" + MoveSpeed.method5703("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var15 == -1) {
					var13.close();
					var14.close();
					String var18 = new String(var9.array);
					if (var18.startsWith("OFFLINE")) {
						return 4;
					} else if (var18.startsWith("WRONG")) {
						return 7;
					} else if (var18.startsWith("RELOAD")) {
						return 3;
					} else if (var18.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var18 = new String(var9.array, 0, var9.offset);
						boolean var16;
						if (var18 == null) {
							var16 = false;
						} else {
							label84: {
								try {
									new URL(var18);
								} catch (MalformedURLException var19) {
									var16 = false;
									break label84;
								}

								var16 = true;
							}
						}

						if (var16) {
							FloorOverlayDefinition.openURL(var18, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var15;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var20) {
			var20.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)Z",
		garbageValue = "1835504734"
	)
	static boolean method7747(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class273.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1564355311"
	)
	static final void method7745() {
		for (PendingSpawn var0 = (PendingSpawn)ClientPreferences.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)ClientPreferences.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class254.method5223(ClientPreferences.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
