import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class149 extends class148 {
	@ObfuscatedName("au")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -379443229
	)
	int field1677;
	@ObfuscatedName("ay")
	boolean field1679;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class149(class151 var1) {
		this.this$0 = var1;
		this.field1677 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1677 = var1.readUnsignedShort();
		this.field1679 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3474(this.field1677, this.field1679);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026616698"
	)
	static void method3360() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class130.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(class329.method6181("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var20 = var7.readLong();
						var1 = var20;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var28) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var29 = Login.Login_username;
				Random var30 = new Random();
				Buffer var24 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var30.nextInt(), var30.nextInt(), (int)(var1 >> 32), (int)var1};
				var24.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var24.writeInt(var30.nextInt());
				}

				var24.writeInt(var10[0]);
				var24.writeInt(var10[1]);
				var24.writeLong(var1);
				var24.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var24.writeInt(var30.nextInt());
				}

				var24.encryptRsa(class74.field882, class74.field883);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var30.nextInt());
				}

				var9.writeLong(var30.nextLong());
				var9.writeLongMedium(var30.nextLong());
				class28.randomDatData2(var9);
				var9.writeLong(var30.nextLong());
				var9.encryptRsa(class74.field882, class74.field883);
				var11 = class526.stringCp1252NullTerminatedByteSize(var29);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var29);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var12.offset + var9.offset + var24.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var24.offset);
				var13.writeBytes(var24.array, 0, var24.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				String var14 = GrandExchangeOfferWorldComparator.base64Encode(var13.array);

				byte var25;
				try {
					URL var15 = new URL(class329.method6181("services", false) + "m=accountappeal/login.ws");
					URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write("data2=" + class487.method8869(var14) + "&dest=" + class487.method8869("passwordchoice.ws"));
					var17.flush();
					InputStream var18 = var16.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var26 = new String(var13.array);
							if (var26.startsWith("OFFLINE")) {
								var25 = 4;
							} else if (var26.startsWith("WRONG")) {
								var25 = 7;
							} else if (var26.startsWith("RELOAD")) {
								var25 = 3;
							} else if (var26.startsWith("Not permitted for social network accounts.")) {
								var25 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var26 = new String(var13.array, 0, var13.offset);
								if (class371.method7154(var26)) {
									SequenceDefinition.openURL(var26, true, false);
									var25 = 2;
								} else {
									var25 = 5;
								}
							}
							break;
						}

						var13.offset += var19;
						if (var13.offset >= 1000) {
							var25 = 5;
							break;
						}
					}
				} catch (Throwable var27) {
					var27.printStackTrace();
					var25 = 5;
				}

				var0 = var25;
			}

			switch(var0) {
			case 2:
				class130.setLoginResponseString(Strings.field4122, Strings.field4355, Strings.field4377);
				class532.updateLoginIndex(6);
				break;
			case 3:
				class130.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class130.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class130.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class130.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class130.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-24"
	)
	static final void method3361(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
