import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class14 {
	@ObfuscatedName("bj")
	protected static String field67;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1975336687
	)
	final int field65;
	@ObfuscatedName("ah")
	final String field63;
	@ObfuscatedName("ar")
	final ThreadFactory field62;
	@ObfuscatedName("ao")
	final ThreadPoolExecutor field60;

	public class14(String var1, int var2, int var3) {
		this.field63 = var1;
		this.field65 = var2;
		this.field62 = new class16(this);
		this.field60 = this.method184(var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1434703627"
	)
	final ThreadPoolExecutor method184(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field65), this.field62);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lap;I)Laq;",
		garbageValue = "1326084774"
	)
	public class18 method181(class10 var1) {
		if (this.field60.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field60.getCorePoolSize() + " Queue capacity " + this.field65);
			return new class18("Queue full");
		} else {
			class18 var2 = new class18(this.field60.submit(new class19(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107542128"
	)
	public final void method179() {
		try {
			this.field60.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ltt;I)Ljava/lang/String;",
		garbageValue = "-576035634"
	)
	public static String method180(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && class489.method8666(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && class489.method8666(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5022) {
					case 1:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var4 <= var6) {
					StringBuilder var12 = new StringBuilder(var4);

					for (int var14 = var2; var14 < var3; ++var14) {
						char var7 = var0.charAt(var14);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (KeyHandler.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class505.field5030;
							int var10 = 0;

							label86:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class505.field5031;

									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var11 == var7) {
											var8 = true;
											break label86;
										}
									}

									var8 = false;
									break;
								}

								var11 = var9[var10];
								if (var11 == var7) {
									var8 = true;
									break;
								}

								++var10;
							}
						}

						if (var8) {
							char var13 = FriendsChat.method8113(var7);
							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lco;",
		garbageValue = "69"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	static void method189() {
		if (class384.clearLoginScreen) {
			Login.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			class134.runesSprite = null;
			class250.leftTitleSprite = null;
			Login.rightTitleSprite = null;
			Login.logoSprite = null;
			Login.title_muteSprite = null;
			class310.options_buttons_0Sprite = null;
			FriendsList.options_buttons_2Sprite = null;
			class108.worldSelectBackSprites = null;
			class130.worldSelectFlagSprites = null;
			class148.worldSelectArrows = null;
			class228.worldSelectStars = null;
			FadeOutTask.field4547 = null;
			EnumComposition.loginScreenRunesAnimation.method2506();
			WorldMapRenderer.method4769(0, 100);
			class157.method3396().method7045(true);
			class384.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luj;IIIIIII)V",
		garbageValue = "834175330"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class134.method3146(var1, var2, var3)) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedShort();
				if (var7 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -DevicePcmPlayerProvider.method315(var4 + 932731, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Interpreter.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					ViewportMouse.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
					class369.field4297[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					class74.Tiles_underlays[var1][var2][var3] = (short)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readShort();
				}
			}
		}

	}
}
