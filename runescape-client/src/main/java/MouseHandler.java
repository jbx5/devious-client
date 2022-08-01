import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
@ObfuscatedName("ab")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener , MouseMotionListener , FocusListener {
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lab;")
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance = new MouseHandler();

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -44816389)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles = 0;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1194359125)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile = 0;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1249393651)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile = -1;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -413344239)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile = -1;

	@ObfuscatedName("h")
	@ObfuscatedGetter(longValue = -1626091396562653879L)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile = -1L;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 43075733)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton = 0;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1980728717)
	@Export("MouseHandler_x")
	public static int MouseHandler_x = 0;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 2007939997)
	@Export("MouseHandler_y")
	public static int MouseHandler_y = 0;

	@ObfuscatedName("x")
	@ObfuscatedGetter(longValue = -3606414732592476637L)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis = 0L;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1605526365)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile = 0;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 1625100181)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile = 0;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 1214346213)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile = 0;

	@ObfuscatedName("l")
	@ObfuscatedGetter(longValue = -3506452727014923741L)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -87818647)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton = 0;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -86980559)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX = 0;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -524846311)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY = 0;

	@ObfuscatedName("t")
	@ObfuscatedGetter(longValue = 7730373158896790447L)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis = 0L;

	@ObfuscatedName("ez")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive6")
	static Archive archive6;

	@ObfuscatedName("im")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	MouseHandler() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;B)I", garbageValue = "1")
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class131.method2916();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}
	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ldp;FI)F", garbageValue = "1893083699")
	static float method600(class117 var0, float var1) {
		if (var0 != null && var0.method2785() != 0) {
			if (var1 < ((float) (var0.field1437[0].field1390))) {
				return var0.field1435 == class116.field1431 ? var0.field1437[0].field1389 : KitDefinition.method3390(var0, var1, true);
			} else if (var1 > ((float) (var0.field1437[var0.method2785() - 1].field1390))) {
				return var0.field1436 == class116.field1431 ? var0.field1437[var0.method2785() - 1].field1389 : KitDefinition.method3390(var0, var1, false);
			} else if (var0.field1434) {
				return var0.field1437[0].field1389;
			} else {
				class113 var2 = var0.method2774(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0 == ((double) (var2.field1392)) && ((double) (var2.field1393)) == 0.0) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1392 && Float.MAX_VALUE == var2.field1393) {
						var4 = true;
					} else if (var2.field1388 != null) {
						if (var0.field1448) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = ((float) (var2.field1390));
							var6[0] = var2.field1389;
							var5[1] = var5[0] + var2.field1392 * 0.33333334F;
							var6[1] = 0.33333334F * var2.field1393 + var6[0];
							var5[3] = ((float) (var2.field1388.field1390));
							var6[3] = var2.field1388.field1389;
							var5[2] = var5[3] - var2.field1388.field1391 * 0.33333334F;
							var6[2] = var6[3] - 0.33333334F * var2.field1388.field1396;
							if (var0.field1446) {
								ObjectSound.method1774(var0, var5, var6);
							} else if (var0 != null) {
								var0.field1439 = var5[0];
								float var7 = var5[3] - var5[0];
								float var8 = var6[3] - var6[0];
								float var9 = var5[1] - var5[0];
								float var10 = 0.0F;
								float var11 = 0.0F;
								if (0.0 != ((double) (var9))) {
									var10 = (var6[1] - var6[0]) / var9;
								}
								var9 = var5[3] - var5[2];
								if (0.0 != ((double) (var9))) {
									var11 = (var6[3] - var6[2]) / var9;
								}
								float var12 = 1.0F / (var7 * var7);
								float var13 = var10 * var7;
								float var14 = var7 * var11;
								var0.field1441[0] = var12 * (var13 + var14 - var8 - var8) / var7;
								var0.field1441[1] = (var8 + var8 + var8 - var13 - var13 - var14) * var12;
								var0.field1441[2] = var10;
								var0.field1441[3] = var6[0];
							}
							var0.field1448 = false;
						}
					} else {
						var3 = true;
					}
					if (var3) {
						return var2.field1389;
					} else if (var4) {
						return ((float) (var2.field1390)) != var1 && var2.field1388 != null ? var2.field1388.field1389 : var2.field1389;
					} else {
						return var0.field1446 ? WorldMapIcon_1.method4561(var0, var1) : Canvas.method354(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)Lnb;", garbageValue = "-43")
	public static class388 method574() {
		synchronized(class388.field4409) {
			if (class259.field2903 == 0) {
				return new class388();
			} else {
				class388.field4409[--class259.field2903].method7004();
				return class388.field4409[class259.field2903];
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1979772952")
	static void method597() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			HealthBarUpdate.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = AbstractByteArrayCopier.method5506();
			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var4 = Login.Login_username;
				Random var5 = new Random();
				Buffer var6 = new Buffer(128);
				Buffer var7 = new Buffer(128);
				int[] var8 = new int[]{ var5.nextInt(), var5.nextInt(), ((int) (var1 >> 32)), ((int) (var1)) };
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
				var6.encryptRsa(class65.field864, class65.field865);
				var7.writeByte(10);
				for (var9 = 0; var9 < 3; ++var9) {
					var7.writeInt(var5.nextInt());
				}
				var7.writeLong(var5.nextLong());
				var7.writeLongMedium(var5.nextLong());
				if (Client.randomDatData != null) {
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var10 = new byte[24];
					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var10);
						int var11;
						for (var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
						}
						if (var11 >= 24) {
							throw new IOException();
						}
					} catch (Exception var25) {
						for (int var12 = 0; var12 < 24; ++var12) {
							var10[var12] = -1;
						}
					}
					var7.writeBytes(var10, 0, var10.length);
				}
				var7.writeLong(var5.nextLong());
				var7.encryptRsa(class65.field864, class65.field865);
				var9 = class92.stringCp1252NullTerminatedByteSize(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}
				Buffer var26 = new Buffer(var9);
				var26.writeStringCp1252NullTerminated(var4);
				var26.offset = var9;
				var26.xteaEncryptAll(var8);
				Buffer var20 = new Buffer(var6.offset + var7.offset + var26.offset + 5);
				var20.writeByte(2);
				var20.writeByte(var6.offset);
				var20.writeBytes(var6.array, 0, var6.offset);
				var20.writeByte(var7.offset);
				var20.writeBytes(var7.array, 0, var7.offset);
				var20.writeShort(var26.offset);
				var20.writeBytes(var26.array, 0, var26.offset);
				byte[] var13 = var20.array;
				String var22 = Frames.method4310(var13, 0, var13.length);
				String var14 = var22;
				byte var3;
				try {
					URL var15 = new URL(ScriptFrame.method1055("services", false) + "m=accountappeal/login.ws");
					URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write("data2=" + class342.method6309(var14) + "&dest=" + class342.method6309("passwordchoice.ws"));
					var17.flush();
					InputStream var18 = var16.getInputStream();
					var20 = new Buffer(new byte[1000]);
					while (true) {
						int var19 = var18.read(var20.array, var20.offset, 1000 - var20.offset);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var23 = new String(var20.array);
							if (var23.startsWith("OFFLINE")) {
								var3 = 4;
							} else if (var23.startsWith("WRONG")) {
								var3 = 7;
							} else if (var23.startsWith("RELOAD")) {
								var3 = 3;
							} else if (var23.startsWith("Not permitted for social network accounts.")) {
								var3 = 6;
							} else {
								var20.xteaDecryptAll(var8);
								while (var20.offset > 0 && var20.array[var20.offset - 1] == 0) {
									--var20.offset;
								} 
								var23 = new String(var20.array, 0, var20.offset);
								if (class67.method1937(var23)) {
									class238.openURL(var23, true, false);
									var3 = 2;
								} else {
									var3 = 5;
								}
							}
							break;
						}
						var20.offset += var19;
						if (var20.offset >= 1000) {
							var3 = 5;
							break;
						}
					} 
				} catch (Throwable var24) {
					var24.printStackTrace();
					var3 = 5;
				}
				var0 = var3;
			}
			switch (var0) {
				case 2 :
					HealthBarUpdate.setLoginResponseString(Strings.field3913, Strings.field3887, Strings.field3863);
					UserComparator6.method2701(6);
					break;
				case 3 :
					HealthBarUpdate.setLoginResponseString("", "Error connecting to server.", "");
					break;
				case 4 :
					HealthBarUpdate.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
					break;
				case 5 :
					HealthBarUpdate.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
					break;
				case 6 :
					HealthBarUpdate.setLoginResponseString("", "Error connecting to server.", "");
					break;
				case 7 :
					HealthBarUpdate.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(descriptor = "(IIIIIIIB)V", garbageValue = "0")
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ReflectionCheck.loadInterface(var0)) {
			class389.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(descriptor = "(Lku;S)V", garbageValue = "-11486")
	static final void method598(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field765 == -1) {
				Client.field765 = var0.spriteId2;
				Client.field627 = var0.spriteId;
			}
			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field765;
			} else {
				var0.spriteId2 = Client.field627;
			}
		} else if (var1 == 325) {
			if (Client.field765 == -1) {
				Client.field765 = var0.spriteId2;
				Client.field627 = var0.spriteId;
			}
			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field627;
			} else {
				var0.spriteId2 = Client.field765;
			}
		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "402120773")
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class433.getPacketBufferNode(ClientPacket.CLAN_JOINCHAT, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}