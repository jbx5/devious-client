import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("World")
public class World {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 298002637
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1099316549
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("az")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("av")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1223093243
	)
	static int field835;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field829;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1537616355
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1550321977
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1098841151
	)
	@Export("population")
	int population;
	@ObfuscatedName("ax")
	@Export("host")
	String host;
	@ObfuscatedName("aa")
	@Export("activity")
	String activity;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1663377203
	)
	@Export("location")
	int location;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1541369663
	)
	@Export("index")
	int index;
	@ObfuscatedName("ab")
	String field823;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "18459"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666523957"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (65536 & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-14"
	)
	boolean method1810() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2076610622"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
	)
	boolean method1812() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "88611160"
	)
	boolean method1846() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1119201695"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1104770276"
	)
	boolean method1815() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	boolean method1816() {
		return (256 & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "245225695"
	)
	boolean method1817() {
		return (134217728 & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-1514003245"
	)
	public static int method1861(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lij;B)V",
		garbageValue = "0"
	)
	static final void method1862(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var1;
					int var11 = var9 + var2;
					ScriptEvent.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0);
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1526297994"
	)
	static void method1844() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			Actor.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(UrlRequest.method2850("services", false) + "m=accountappeal/login.ws");
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
						long var22 = var7.readLong();
						var1 = var22;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var31) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var32 = Login.Login_username;
				Random var33 = new Random();
				Buffer var26 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var33.nextInt(), var33.nextInt(), (int)(var1 >> 32), (int)var1};
				var26.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var33.nextInt());
				}

				var26.writeInt(var10[0]);
				var26.writeInt(var10[1]);
				var26.writeLong(var1);
				var26.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var33.nextInt());
				}

				var26.encryptRsa(class72.field902, class72.field903);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var33.nextInt());
				}

				var9.writeLong(var33.nextLong());
				var9.writeLongMedium(var33.nextLong());
				VertexNormal.method4951(var9);
				var9.writeLong(var33.nextLong());
				var9.encryptRsa(class72.field902, class72.field903);
				var11 = class501.stringCp1252NullTerminatedByteSize(var32);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var32);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var9.offset + var26.offset + var12.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var26.offset);
				var13.writeBytes(var26.array, 0, var26.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				String var14 = class345.method6646(var13.array);

				byte var27;
				try {
					URL var15 = new URL(UrlRequest.method2850("services", false) + "m=accountappeal/login.ws");
					URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write("data2=" + class497.method8882(var14) + "&dest=" + class497.method8882("passwordchoice.ws"));
					var17.flush();
					InputStream var18 = var16.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var28 = new String(var13.array);
							if (var28.startsWith("OFFLINE")) {
								var27 = 4;
							} else if (var28.startsWith("WRONG")) {
								var27 = 7;
							} else if (var28.startsWith("RELOAD")) {
								var27 = 3;
							} else if (var28.startsWith("Not permitted for social network accounts.")) {
								var27 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var28 = new String(var13.array, 0, var13.offset);
								boolean var20;
								if (var28 == null) {
									var20 = false;
								} else {
									label116: {
										try {
											new URL(var28);
										} catch (MalformedURLException var29) {
											var20 = false;
											break label116;
										}

										var20 = true;
									}
								}

								if (var20) {
									NPC.openURL(var28, true, false);
									var27 = 2;
								} else {
									var27 = 5;
								}
							}
							break;
						}

						var13.offset += var19;
						if (var13.offset >= 1000) {
							var27 = 5;
							break;
						}
					}
				} catch (Throwable var30) {
					var30.printStackTrace();
					var27 = 5;
				}

				var0 = var27;
			}

			switch(var0) {
			case 2:
				Actor.setLoginResponseString(Strings.field3908, Strings.field4163, Strings.field4034);
				class328.method6115(6);
				break;
			case 3:
				Actor.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				Actor.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				Actor.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				Actor.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				Actor.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IILio;B)V",
		garbageValue = "-30"
	)
	static final void method1860(Player var0, int var1, int var2, class218 var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var8 = var0.transformedSize();
				Client.field815.approxDestinationX = var1;
				Client.field815.approxDestinationY = var2;
				Client.field815.approxDestinationSizeX = 1;
				Client.field815.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var9 = Client.field815;
				CollisionMap var11 = Client.collisionMaps[var0.plane];
				int[] var12 = Client.field795;
				int[] var13 = Client.field737;
				int var7 = WorldMapSprite.method5513(var4, var5, var8, var9, var11, true, var12, var13, class219.field2388[0]);
				int var14 = var7;
				if (var7 >= 1) {
					for (int var15 = 0; var15 < var14 - 1; ++var15) {
						var0.method2332(Client.field795[var15], Client.field737[var15], var3);
					}

				}
			}
		}
	}
}
