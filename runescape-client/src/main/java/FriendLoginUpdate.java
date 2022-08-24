import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import netscape.javascript.JSObject;
import net.runelite.mapping.Export;
@ObfuscatedName("ns")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 2088013585)
	public int field4296 = ((int) (class181.method3483() / 1000L));

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("username")
	public Username username;

	@ObfuscatedName("w")
	@Export("world")
	public short world;

	@ObfuscatedSignature(descriptor = "(Lqy;I)V")
	FriendLoginUpdate(Username var1, int var2) {
		this.username = var1;
		this.world = ((short) (var2));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z", garbageValue = "-65")
	static boolean method6597(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field167.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class29.field174;
				Object[] var5 = new Object[]{ new URL(class29.field174.getCodeBase(), var0).toString() };
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field174.getAppletContext().showDocument(new URL(class29.field174.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class27.method384(class29.field174, "loggedout");
			} catch (Throwable var12) {
			}
			try {
				class29.field174.getAppletContext().showDocument(new URL(class29.field174.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqz;ILcq;II)V", garbageValue = "-885879954")
	static final void method6596(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class192.field2205.field2208;
		if ((var3 & 256) != 0) {
			var2.field1178 = var0.readByteSub();
			var2.field1127 = var0.readByteNeg();
			var2.field1179 = var0.readByte();
			var2.field1181 = var0.readByteAdd();
			var2.field1182 = var0.readUnsignedShortAdd() + Client.cycle;
			var2.field1183 = var0.readUnsignedShortAddLE() + Client.cycle;
			var2.field1136 = var0.readUnsignedShortLE();
			if (var2.field1111) {
				var2.field1178 += var2.tileX;
				var2.field1127 += var2.tileY;
				var2.field1179 += var2.tileX;
				var2.field1181 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1178 += var2.pathX[0];
				var2.field1127 += var2.pathY[0];
				var2.field1179 += var2.pathX[0];
				var2.field1181 += var2.pathY[0];
				var2.pathLength = 1;
			}
			var2.field1201 = 0;
		}
		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) {
			var5 = var0.readUnsignedShortAddLE();
			PlayerType var6 = ((PlayerType) (GameEngine.findEnumerated(class220.PlayerType_values(), var0.readUnsignedByteNeg())));
			boolean var7 = var0.readUnsignedByteAdd() == 1;
			var8 = var0.readUnsignedByteAdd();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var10 = false;
				if (var6.isUser && class321.friendSystem.isIgnored(var2.username)) {
					var10 = true;
				}
				if (!var10 && Client.field601 == 0 && !var2.isHidden) {
					Players.field1309.offset = 0;
					var0.readBytesLE(Players.field1309.array, 0, var8);
					Players.field1309.offset = 0;
					String var11 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(Players.field1309)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var7;
					var2.field1164 = var2 != ScriptFrame.localPlayer && var6.isUser && "" != Client.field711 && var11.toLowerCase().indexOf(Client.field711) == -1;
					if (var6.isPrivileged) {
						var12 = (var7) ? 91 : 1;
					} else {
						var12 = (var7) ? 90 : 2;
					}
					if (var6.modIcon != -1) {
						VarcInt.addGameMessage(var12, SoundSystem.method740(var6.modIcon) + var2.username.getName(), var11);
					} else {
						VarcInt.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}
			var0.offset = var9 + var8;
		}
		if ((var3 & 64) != 0) {
			var2.targetIndex = var0.readUnsignedShortLE();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}
		if ((var3 & 2048) != 0) {
			class192[] var13 = Players.field1298;
			class192[] var15 = new class192[]{ class192.field2207, class192.field2209, class192.field2205, class192.field2206 };
			var13[var1] = ((class192) (GameEngine.findEnumerated(var15, var0.readByteNeg())));
		}
		int var14;
		if ((var3 & 2) != 0) {
			var5 = var0.readUnsignedShortLE();
			if (var5 == 65535) {
				var5 = -1;
			}
			var14 = var0.readUnsignedByteAdd();
			Strings.performPlayerAnimation(var2, var5, var14);
		}
		if ((var3 & 8192) != 0) {
			var2.field1187 = Client.cycle + var0.readUnsignedShortAdd();
			var2.field1188 = Client.cycle + var0.readUnsignedShortAddLE();
			var2.field1189 = var0.readByteNeg();
			var2.field1131 = var0.readByteNeg();
			var2.field1191 = var0.readByteSub();
			var2.field1192 = ((byte) (var0.readUnsignedByteSub()));
		}
		if ((var3 & 512) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}
		if ((var3 & 16384) != 0) {
			var4 = var0.readByteSub();
		}
		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByteNeg();
			byte[] var17 = new byte[var5];
			Buffer var22 = new Buffer(var17);
			var0.readBytes(var17, 0, var5);
			Players.field1308[var1] = var22;
			var2.read(var22);
		}
		if ((var3 & 1024) != 0) {
			var2.spotAnimation = var0.readUnsignedShortLE();
			var5 = var0.readUnsignedIntIME();
			var2.spotAnimationHeight = var5 >> 16;
			var2.field1176 = (var5 & '￿') + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1176 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}
			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}
		if ((var3 & 8) != 0) {
			var2.field1162 = var0.readUnsignedShortLE();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1162;
				var2.field1162 = -1;
			}
		}
		if ((var3 & 1) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				VarcInt.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == ScriptFrame.localPlayer) {
				VarcInt.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}
			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}
		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedByte();
			int var16;
			int var19;
			int var20;
			if (var5 > 0) {
				for (var14 = 0; var14 < var5; ++var14) {
					var8 = -1;
					var9 = -1;
					var20 = -1;
					var19 = var0.readUShortSmart();
					if (var19 == 32767) {
						var19 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var20 = var0.readUShortSmart();
					} else if (var19 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var19 = -1;
					}
					var16 = var0.readUShortSmart();
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle, var16);
				}
			}
			var14 = var0.readUnsignedByteNeg();
			if (var14 > 0) {
				for (var19 = 0; var19 < var14; ++var19) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var20 = var0.readUShortSmart();
						var16 = var0.readUnsignedByte();
						var12 = (var9 > 0) ? var0.readUnsignedByteAdd() : var16;
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}
		if (var2.field1111) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class192 var21;
				if (var4 != class192.field2205.field2208) {
					class192[] var18 = new class192[]{ class192.field2207, class192.field2209, class192.field2205, class192.field2206 };
					var21 = ((class192) (GameEngine.findEnumerated(var18, var4)));
				} else {
					var21 = Players.field1298[var1];
				}
				var2.method2131(var2.tileX, var2.tileY, var21);
			}
		}
	}
}