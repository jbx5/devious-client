import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("t")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lh;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "2014428702"
	)
	static final int method185(long var0, String var2) {
		Random var3 = new Random(); // L: 65
		Buffer var4 = new Buffer(128); // L: 66
		Buffer var5 = new Buffer(128); // L: 67
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 68 69 70 71 72
		var4.writeByte(10); // L: 73

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 74
			var4.writeInt(var3.nextInt()); // L: 75
		}

		var4.writeInt(var6[0]); // L: 77
		var4.writeInt(var6[1]); // L: 78
		var4.writeLong(var0); // L: 79
		var4.writeLong(0L); // L: 80

		for (var7 = 0; var7 < 4; ++var7) { // L: 81
			var4.writeInt(var3.nextInt()); // L: 82
		}

		var4.encryptRsa(class65.field870, class65.field862); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.writeInt(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		if (Client.randomDatData != null) { // L: 92
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 93
		} else {
			byte[] var8 = new byte[24]; // L: 98

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 100
				JagexCache.JagexCache_randomDat.readFully(var8); // L: 101

				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) { // L: 102 103 104
				}

				if (var9 >= 24) { // L: 106
					throw new IOException();
				}
			} catch (Exception var24) {
				for (int var10 = 0; var10 < 24; ++var10) { // L: 109
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length); // L: 114
		}

		var5.writeLong(var3.nextLong()); // L: 116
		var5.encryptRsa(class65.field870, class65.field862); // L: 117
		var7 = class357.stringCp1252NullTerminatedByteSize(var2); // L: 118
		if (var7 % 8 != 0) { // L: 119
			var7 += 8 - var7 % 8;
		}

		Buffer var25 = new Buffer(var7); // L: 120
		var25.writeStringCp1252NullTerminated(var2); // L: 121
		var25.offset = var7; // L: 122
		var25.xteaEncryptAll(var6); // L: 123
		Buffer var18 = new Buffer(var4.offset + var5.offset + var25.offset + 5); // L: 124
		var18.writeByte(2); // L: 125
		var18.writeByte(var4.offset); // L: 126
		var18.writeBytes(var4.array, 0, var4.offset); // L: 127
		var18.writeByte(var5.offset); // L: 128
		var18.writeBytes(var5.array, 0, var5.offset); // L: 129
		var18.writeShort(var25.offset); // L: 130
		var18.writeBytes(var25.array, 0, var25.offset); // L: 131
		String var20 = ItemLayer.method4040(var18.array); // L: 132

		try {
			URL var11 = new URL(SecureRandomCallable.method2205("services", false) + "m=accountappeal/login.ws"); // L: 134
			URLConnection var12 = var11.openConnection(); // L: 135
			var12.setDoInput(true); // L: 136
			var12.setDoOutput(true); // L: 137
			var12.setConnectTimeout(5000); // L: 138
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream()); // L: 139
			var13.write("data2=" + class452.method8211(var20) + "&dest=" + class452.method8211("passwordchoice.ws")); // L: 140
			var13.flush(); // L: 141
			InputStream var14 = var12.getInputStream(); // L: 142
			var18 = new Buffer(new byte[1000]); // L: 143

			do {
				int var15 = var14.read(var18.array, var18.offset, 1000 - var18.offset); // L: 145
				if (var15 == -1) { // L: 146
					var13.close(); // L: 152
					var14.close(); // L: 153
					String var21 = new String(var18.array); // L: 154
					if (var21.startsWith("OFFLINE")) { // L: 155
						return 4; // L: 156
					} else if (var21.startsWith("WRONG")) { // L: 158
						return 7; // L: 159
					} else if (var21.startsWith("RELOAD")) { // L: 161
						return 3; // L: 162
					} else if (var21.startsWith("Not permitted for social network accounts.")) { // L: 164
						return 6; // L: 165
					} else {
						var18.xteaDecryptAll(var6); // L: 167

						while (var18.offset > 0 && var18.array[var18.offset - 1] == 0) { // L: 168
							--var18.offset; // L: 169
						}

						var21 = new String(var18.array, 0, var18.offset); // L: 171
						boolean var16;
						if (var21 == null) { // L: 174
							var16 = false; // L: 175
						} else {
							label106: {
								try {
									new URL(var21);
								} catch (MalformedURLException var22) { // L: 181
									var16 = false; // L: 182
									break label106; // L: 183
								}

								var16 = true; // L: 185
							}
						}

						if (var16) { // L: 187
							CollisionMap.openURL(var21, true, false); // L: 188
							return 2; // L: 189
						} else {
							return 5; // L: 191
						}
					}
				}

				var18.offset += var15; // L: 147
			} while(var18.offset < 1000); // L: 148

			return 5; // L: 149
		} catch (Throwable var23) { // L: 193
			var23.printStackTrace(); // L: 194
			return 5; // L: 195
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "535008134"
	)
	static int method180(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 4423
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4424
			NPCComposition var4 = class193.getNpcDefinition(var3); // L: 4425
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4426
			return 1; // L: 4427
		} else {
			return 2; // L: 4429
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "116"
	)
	static Object method184(int var0) {
		return class269.method5366((class434)Varps.findEnumerated(class434.method7781(), var0)); // L: 4673
	}
}
