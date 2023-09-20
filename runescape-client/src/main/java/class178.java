import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class178 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1412529255
	)
	static int field1853;
	@ObfuscatedName("jn")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	static IndexedSprite[] field1854;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	public UrlRequest field1856;
	@ObfuscatedName("al")
	public float[] field1855;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class172 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class178(class172 var1) {
		this.this$0 = var1;
		this.field1855 = new float[4];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-871910304"
	)
	static final int method3551(long var0, String var2) {
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

		var4.encryptRsa(class74.field906, class74.field907);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var16 = class131.method3015();
			var5.writeBytes(var16, 0, var16.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class74.field906, class74.field907);
		var7 = class478.stringCp1252NullTerminatedByteSize(var2);
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
		String var10 = class233.method4421(var9.array);

		try {
			URL var11 = new URL(ScriptEvent.method2315("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + Timer.method7850(var10) + "&dest=" + Timer.method7850("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var15 == -1) {
					var13.close();
					var14.close();
					String var17 = new String(var9.array);
					if (var17.startsWith("OFFLINE")) {
						return 4;
					} else if (var17.startsWith("WRONG")) {
						return 7;
					} else if (var17.startsWith("RELOAD")) {
						return 3;
					} else if (var17.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var17 = new String(var9.array, 0, var9.offset);
						if (ItemComposition.method4137(var17)) {
							VertexNormal.openURL(var17, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var15;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var18) {
			var18.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1551769490"
	)
	static final void method3552(int var0) {
		if (class33.widgetDefinition.loadInterface(var0)) {
			class174.drawModelComponents(class33.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
