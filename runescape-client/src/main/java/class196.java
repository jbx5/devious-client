import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class196 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-776452670"
	)
	static final int method3817(long var0, String var2) {
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

		var4.encryptRsa(class73.field912, class73.field916);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		KitDefinition.randomDatData2(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class73.field912, class73.field916);
		var7 = class145.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var8.offset + var4.offset + var5.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		String var10 = class371.base64Encode(var9.array);

		try {
			URL var11 = new URL(class317.method6073("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + class183.method3663(var10) + "&dest=" + class183.method3663("passwordchoice.ws"));
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
							label85: {
								try {
									new URL(var18);
								} catch (MalformedURLException var19) {
									var16 = false;
									break label85;
								}

								var16 = true;
							}
						}

						if (var16) {
							class137.openURL(var18, true, false);
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
}
