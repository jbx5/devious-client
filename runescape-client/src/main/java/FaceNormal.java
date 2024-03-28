import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -825673515
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1083154949
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1141248363
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lot;",
		garbageValue = "1491252484"
	)
	static GameBuild[] method4885() {
		return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP, GameBuild.LIVE};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpv;II)Lmh;",
		garbageValue = "299810628"
	)
	public static PacketBufferNode method4884(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = FadeInTask.getPacketBufferNode(ClientPacket.field3239, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = ClanChannel.method3399(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var9 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		MenuAction.method2088(var4.packetBuffer, var1);
		if (var0 == class357.field3919.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldn;",
		garbageValue = "-1476583300"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class193.method3722(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1008 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field749.method4282();
			}

			if (Client.gameState == 0) {
				UrlRequest.client.method489();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class102.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field544 = 0;
				Client.field667 = 0;
				Client.timer.method7927(var0);
				if (var0 != 20) {
					class27.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Actor.field1277 != null) {
				Actor.field1277.close();
				Actor.field1277 = null;
			}

			if (Client.gameState == 25) {
				Client.field582 = 0;
				Client.field578 = 0;
				Client.field579 = 1;
				Client.field727 = 0;
				Client.field581 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class306.method5907(SpriteMask.archive10, GameEngine.archive8, false, var1);
				} else if (var0 == 11) {
					class306.method5907(SpriteMask.archive10, GameEngine.archive8, false, 4);
				} else if (var0 == 50) {
					class59.setLoginResponseString("", "Updating date of birth...", "");
					class306.method5907(SpriteMask.archive10, GameEngine.archive8, false, 7);
				} else if (var0 != 0 && Login.clearLoginScreen) {
					Login.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					class430.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					class390.logoSprite = null;
					ApproximateRouteStrategy.title_muteSprite = null;
					class27.options_buttons_0Sprite = null;
					AuthenticationScheme.options_buttons_2Sprite = null;
					class325.worldSelectBackSprites = null;
					class4.worldSelectFlagSprites = null;
					class136.worldSelectArrows = null;
					class7.worldSelectStars = null;
					class1.field3 = null;
					class59.loginScreenRunesAnimation.method2433();
					class11.method108(0, 100);
					class341.method6299().method7052(true);
					Login.clearLoginScreen = false;
				}
			} else {
				var1 = HttpRequest.method101() ? 0 : 12;
				class306.method5907(SpriteMask.archive10, GameEngine.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
