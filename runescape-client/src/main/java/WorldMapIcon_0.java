import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 221469055
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -331250067
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 509633783
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;ILkz;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = WidgetDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1650655075"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-2083618685"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "139624089"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1778353617"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)I",
		garbageValue = "-56"
	)
	static int method5598(AbstractArchive var0) {
		int var1 = Login.field961.length + Login.field962.length;
		String[] var2 = Login.field963;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1890729689"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4673) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4678) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4679) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4680) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4677 < ByteArrayPool.field4681) {
				ByteArrayPool.field4685[++ByteArrayPool.field4677 - 1] = var0;
			} else {
				if (HttpJsonRequestBody.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class318.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class318.ByteArrayPool_alternativeSizes[var2] && WorldMapID.ByteArrayPool_altSizeArrayCounts[var2] < HttpJsonRequestBody.ByteArrayPool_arrays[var2].length) {
							HttpJsonRequestBody.ByteArrayPool_arrays[var2][WorldMapID.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1754662671"
	)
	static void method5610() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class59.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = Varps.method6250();
			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var4 = Login.Login_username;
				Random var5 = new Random();
				Buffer var6 = new Buffer(128);
				Buffer var7 = new Buffer(128);
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
				var6.writeByte(10);

				int var9;
				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.writeInt(var8[0]);
				var6.writeInt(var8[1]);
				var6.writeLong(var1);
				var6.writeLong(0L);

				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.encryptRsa(class73.field898, class73.field902);
				var7.writeByte(10);

				for (var9 = 0; var9 < 3; ++var9) {
					var7.writeInt(var5.nextInt());
				}

				var7.writeLong(var5.nextLong());
				var7.writeLongMedium(var5.nextLong());
				if (Client.randomDatData != null) {
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var18 = Player.randomDatData2();
					var7.writeBytes(var18, 0, var18.length);
				}

				var7.writeLong(var5.nextLong());
				var7.encryptRsa(class73.field898, class73.field902);
				var9 = SequenceDefinition.stringCp1252NullTerminatedByteSize(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9);
				var10.writeStringCp1252NullTerminated(var4);
				var10.offset = var9;
				var10.xteaEncryptAll(var8);
				Buffer var11 = new Buffer(var10.offset + var7.offset + var6.offset + 5);
				var11.writeByte(2);
				var11.writeByte(var6.offset);
				var11.writeBytes(var6.array, 0, var6.offset);
				var11.writeByte(var7.offset);
				var11.writeBytes(var7.array, 0, var7.offset);
				var11.writeShort(var10.offset);
				var11.writeBytes(var10.array, 0, var10.offset);
				String var12 = class130.base64Encode(var11.array);

				byte var3;
				try {
					URL var13 = new URL(WorldMapData_0.method5235("services", false) + "m=accountappeal/login.ws");
					URLConnection var14 = var13.openConnection();
					var14.setDoInput(true);
					var14.setDoOutput(true);
					var14.setConnectTimeout(5000);
					OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
					var15.write("data2=" + RouteStrategy.method4393(var12) + "&dest=" + RouteStrategy.method4393("passwordchoice.ws"));
					var15.flush();
					InputStream var16 = var14.getInputStream();
					var11 = new Buffer(new byte[1000]);

					while (true) {
						int var17 = var16.read(var11.array, var11.offset, 1000 - var11.offset);
						if (var17 == -1) {
							var15.close();
							var16.close();
							String var19 = new String(var11.array);
							if (var19.startsWith("OFFLINE")) {
								var3 = 4;
							} else if (var19.startsWith("WRONG")) {
								var3 = 7;
							} else if (var19.startsWith("RELOAD")) {
								var3 = 3;
							} else if (var19.startsWith("Not permitted for social network accounts.")) {
								var3 = 6;
							} else {
								var11.xteaDecryptAll(var8);

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) {
									--var11.offset;
								}

								var19 = new String(var11.array, 0, var11.offset);
								if (Players.method2715(var19)) {
									class129.openURL(var19, true, false);
									var3 = 2;
								} else {
									var3 = 5;
								}
							}
							break;
						}

						var11.offset += var17;
						if (var11.offset >= 1000) {
							var3 = 5;
							break;
						}
					}
				} catch (Throwable var20) {
					var20.printStackTrace();
					var3 = 5;
				}

				var0 = var3;
			}

			switch(var0) {
			case 2:
				class59.setLoginResponseString(Strings.field4127, Strings.field4273, Strings.field4274);
				class210.method3930(6);
				break;
			case 3:
				class59.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class59.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class59.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class59.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class59.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "364324423"
	)
	static final void method5608(int var0, int var1, int var2, int var3, int var4, int var5) {
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
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method4580(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method4580(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
