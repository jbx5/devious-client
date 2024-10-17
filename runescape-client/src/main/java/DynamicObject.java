import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2044875447
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1565534601
	)
	@Export("type")
	final int type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1790019807
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1816491519
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2057600999
	)
	@Export("x")
	final int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1834683989
	)
	@Export("y")
	final int y;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -97130721
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1010418003
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIIIIIZLjv;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		if (var8 != -1) {
			this.sequenceDefinition = Widget.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (this.sequenceDefinition == var11.sequenceDefinition) {
					this.frame = var11.frame;
					this.cycleStart = var11.cycleStart;
					return;
				}
			}

			if (var9 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4367());
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljy;",
		garbageValue = "1885718735"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = UrlRequest.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (var12 > 100 && this.sequenceDefinition.frameCount > 0) {
					var12 = 100;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					label61: {
						do {
							while (true) {
								if (var12 <= this.sequenceDefinition.frameLengths[this.frame]) {
									break label61;
								}

								var12 -= this.sequenceDefinition.frameLengths[this.frame];
								++this.frame;
								if (this.frame >= this.sequenceDefinition.frameIds.length) {
									this.frame -= this.sequenceDefinition.frameCount;
									break;
								}

								WorldMapSection0.method6223(this.sequenceDefinition, this.frame, var10, var11, false);
							}
						} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

						this.sequenceDefinition = null;
					}
				} else {
					int var13 = this.sequenceDefinition.method4367();
					this.frame += var12;
					var12 = 0;
					if (this.frame >= var13) {
						this.frame = var13 - this.sequenceDefinition.frameCount;
						if (this.frame < 0 || this.frame > var13) {
							this.sequenceDefinition = null;
						}
					}

					if (this.sequenceDefinition != null) {
						WorldMapSection0.method6223(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;Lum;I)Lum;",
		garbageValue = "-1109744675"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = ClientPreferences.method2941(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIII)V",
		garbageValue = "2129246771"
	)
	static final void method2455(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					Tiles.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var8 == var2 + var4 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-1674143797"
	)
	static int method2461(Widget var0) {
		if (var0.type != 11) {
			--class208.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var0.method7355(var1);
			return 1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;Lqi;I)V",
		garbageValue = "-508354921"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (HttpRequestTask.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		DevicePcmPlayerProvider.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			HitSplatDefinition.method4211(var0, var1);
		} else {
			IntHashTable.leftTitleSprite.drawAt(Login.xPadding, 0);
			class544.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			TriBool.logoSprite.drawAt(Login.xPadding + 382 - TriBool.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			short var17;
			int var18;
			short var19;
			if (Client.gameState == 20) {
				class230.titleboxSprite.drawAt(Login.loginBoxX + 180 - class230.titleboxSprite.subWidth / 2, 271 - class230.titleboxSprite.subHeight / 2);
				var17 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
				var18 = var17 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16776960, 0);
				var18 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16776960, 0);
				var18 += 15;
				var18 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var18, 16777215, 0);
					var19 = 200;
					var5 = TaskHandler.clientPreferences.isUsernameHidden() ? ViewportMouse.method5473(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var19; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var18, 16777215, 0);
					var18 += 15;

					for (var7 = ViewportMouse.method5473(Login.Login_password); var0.stringWidth(var7) > var19; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var18, 16777215, 0);
					var18 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class230.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var12;
				if (Login.loginIndex == 0) {
					var17 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var17, 16776960, 0);
					var18 = var17 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var12 = 291;
					SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
					var0.drawLines("New User", var4 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
					var0.drawLines("Existing User", var4 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var17 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16777215, 0);
					var18 = var17 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16777215, 0);
					var18 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16777215, 0);
					var18 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var12 = 321;
					SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
					var0.drawCentered("Continue", var4, var12 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
					var0.drawCentered("Cancel", var4, var12 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var17 = 201;
					var0.drawCentered(Login.Login_response1, DevicePcmPlayerProvider.loginBoxCenter, var17, 16776960, 0);
					var18 = var17 + 15;
					var0.drawCentered(Login.Login_response2, DevicePcmPlayerProvider.loginBoxCenter, var18, 16776960, 0);
					var18 += 15;
					var0.drawCentered(Login.Login_response3, DevicePcmPlayerProvider.loginBoxCenter, var18, 16776960, 0);
					var18 += 15;
					var18 += 7;
					var0.draw("Login: ", DevicePcmPlayerProvider.loginBoxCenter - 110, var18, 16777215, 0);
					var19 = 200;
					var5 = TaskHandler.clientPreferences.isUsernameHidden() ? ViewportMouse.method5473(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var19; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class204.colorStartTag(16776960) + "|" : ""), DevicePcmPlayerProvider.loginBoxCenter - 70, var18, 16777215, 0);
					var18 += 15;

					for (var7 = ViewportMouse.method5473(Login.Login_password); var0.stringWidth(var7) > var19; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class204.colorStartTag(16776960) + "|" : ""), DevicePcmPlayerProvider.loginBoxCenter - 108, var18, 16777215, 0);
					var18 += 15;
					var17 = 277;
					int var8 = DevicePcmPlayerProvider.loginBoxCenter + -117;
					IndexedSprite var9 = class174.method3827(Client.Login_isUsernameRemembered, Login.field956);
					var9.drawAt(var8, var17);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var17 + 13, 16776960, 0);
					var8 = DevicePcmPlayerProvider.loginBoxCenter + 24;
					var9 = class174.method3827(TaskHandler.clientPreferences.isUsernameHidden(), Login.field947);
					var9.drawAt(var8, var17);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Hide username", var8, var17 + 13, 16776960, 0);
					var18 = var17 + 15;
					int var10 = DevicePcmPlayerProvider.loginBoxCenter - 80;
					short var11 = 321;
					SoundSystem.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0);
					var10 = DevicePcmPlayerProvider.loginBoxCenter + 80;
					SoundSystem.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0);
					var17 = 357;
					switch(Login.field938) {
					case 2:
						Tile.field2584 = "Having trouble logging in?";
						break;
					default:
						Tile.field2584 = "Can't login? Click here.";
					}

					ScriptFrame.field446 = new Bounds(DevicePcmPlayerProvider.loginBoxCenter, var17, var1.stringWidth(Tile.field2584), 11);
					class213.field2344 = new Bounds(DevicePcmPlayerProvider.loginBoxCenter, var17, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(Tile.field2584, DevicePcmPlayerProvider.loginBoxCenter, var17, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var17 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var17, 16776960, 0);
					var18 = var17 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var18, 16776960, 0);
					var18 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var18, 16776960, 0);
					var18 += 15;
					var4 = Login.loginBoxX + 180;
					var12 = 276;
					SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
					var2.drawCentered("Try again", var4, var12 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var12 = 326;
					SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
					var2.drawCentered("Forgotten password?", var4, var12 + 5, 16777215, 0);
				} else {
					int var14;
					short var21;
					int var22;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var17 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16777215, 0);
						var18 = var17 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16777215, 0);
						var18 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16777215, 0);
						var18 += 15;
						var0.draw("PIN: " + ViewportMouse.method5473(Huffman.otp) + (Client.cycle % 40 < 20 ? class204.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var18, 16777215, 0);
						var18 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var18, 16776960, 0);
						var18 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var18, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var22 = var18 - var0.ascent;
						IndexedSprite var20;
						if (Login.rememberUsername) {
							var20 = UserList.options_buttons_2Sprite;
						} else {
							var20 = class33.options_buttons_0Sprite;
						}

						var20.drawAt(var4, var22);
						var18 += 15;
						var14 = Login.loginBoxX + 180 - 80;
						var21 = 321;
						SoundSystem.titlebuttonSprite.drawAt(var14 - 73, var21 - 20);
						var0.drawCentered("Continue", var14, var21 + 5, 16777215, 0);
						var14 = Login.loginBoxX + 180 + 80;
						SoundSystem.titlebuttonSprite.drawAt(var14 - 73, var21 - 20);
						var0.drawCentered("Cancel", var14, var21 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var21 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var17 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var18 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var18, 16777215, 0);
						var19 = 174;
						var5 = TaskHandler.clientPreferences.isUsernameHidden() ? ViewportMouse.method5473(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var19; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class204.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var18, 16777215, 0);
						var18 += 15;
						var14 = Login.loginBoxX + 180 - 80;
						var21 = 321;
						SoundSystem.titlebuttonSprite.drawAt(var14 - 73, var21 - 20);
						var0.drawCentered("Recover", var14, var21 + 5, 16777215, 0);
						var14 = Login.loginBoxX + 180 + 80;
						SoundSystem.titlebuttonSprite.drawAt(var14 - 73, var21 - 20);
						var0.drawCentered("Back", var14, var21 + 5, 16777215, 0);
						var21 = 356;
						var1.drawCentered("Still having trouble logging in?", DevicePcmPlayerProvider.loginBoxCenter, var21, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var17 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var4 = Login.loginBoxX + 180;
						var12 = 321;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Back", var4, var12 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class417.field4741 && !Client.onMobile) {
							var17 = 201;
							var0.drawCentered(Login.Login_response1, DevicePcmPlayerProvider.loginBoxCenter, var17, 16776960, 0);
							var18 = var17 + 15;
							var0.drawCentered(Login.Login_response2, DevicePcmPlayerProvider.loginBoxCenter, var18, 16776960, 0);
							var18 += 15;
							var0.drawCentered(Login.Login_response3, DevicePcmPlayerProvider.loginBoxCenter, var18, 16776960, 0);
							var4 = DevicePcmPlayerProvider.loginBoxCenter - 150;
							var18 += 10;

							for (var22 = 0; var22 < 8; ++var22) {
								SoundSystem.titlebuttonSprite.method10558(var4, var18, 30, 40);
								boolean var15 = var22 == Login.field930 & Client.cycle % 40 < 20;
								var0.draw((Login.field943[var22] == null ? "" : Login.field943[var22]) + (var15 ? class204.colorStartTag(16776960) + "|" : ""), var4 + 10, var18 + 27, 16777215, 0);
								if (var22 != 1 && var22 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var18 + 27, 16777215, 0);
								}
							}

							var22 = DevicePcmPlayerProvider.loginBoxCenter - 80;
							short var23 = 321;
							SoundSystem.titlebuttonSprite.drawAt(var22 - 73, var23 - 20);
							var0.drawCentered("Submit", var22, var23 + 5, 16777215, 0);
							var22 = DevicePcmPlayerProvider.loginBoxCenter + 80;
							SoundSystem.titlebuttonSprite.drawAt(var22 - 73, var23 - 20);
							var0.drawCentered("Cancel", var22, var23 + 5, 16777215, 0);
						} else {
							var17 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var17, 16776960, 0);
							var18 = var17 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var18, 16776960, 0);
							var18 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var18, 16776960, 0);
							var18 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var12 = 321;
							SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
							var0.drawCentered("Set Date of Birth", var4, var12 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
							var0.drawCentered("Back", var4, var12 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var17 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var12 = 321;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Privacy Policy", var4, var12 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Back", var4, var12 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var17 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var12 = 311;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Try again", var4, var12 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var18 = Login.loginBoxX + 180;
						var19 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var19, 16776960, 0);
						var4 = var19 + 20;
						class268.field2981.drawAt(var18 - 109, var4);
						if (Login.displayName.isEmpty()) {
							Login.field944.drawAt(var18 - 48, var4 + 18);
						} else {
							Login.field944.drawAt(var18 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var18, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var18 = DevicePcmPlayerProvider.loginBoxCenter;
						var19 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var18, var19, 16777215, 0);
						var4 = var19 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var18, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var18, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var18, var4, 16777215, 0);
						var18 = DevicePcmPlayerProvider.loginBoxCenter - 80;
						var19 = 311;
						SoundSystem.titlebuttonSprite.drawAt(var18 - 73, var19 - 20);
						var0.drawCentered("Accept", var18, var19 + 5, 16777215, 0);
						var18 = DevicePcmPlayerProvider.loginBoxCenter + 80;
						SoundSystem.titlebuttonSprite.drawAt(var18 - 73, var19 - 20);
						var0.drawCentered("Decline", var18, var19 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var17 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var17, 16777215, 0);
						var18 = var17 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var18, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 311;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var17 = 201;
						String var13 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
						case 0:
							var13 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var13 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var13 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4254;
							break;
						default:
							FontName.Login_promptCredentials(false);
						}

						var0.drawCentered(var13, Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var18, 16776960, 0);
						var14 = Login.loginBoxX + 180;
						var21 = 276;
						SoundSystem.titlebuttonSprite.drawAt(var14 - 73, var21 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var14, var21 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var14, var21 + 5, 16777215, 0);
						}

						var14 = Login.loginBoxX + 180;
						var21 = 326;
						SoundSystem.titlebuttonSprite.drawAt(var14 - 73, var21 - 20);
						var0.drawCentered("Back", var14, var21 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var17 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16777215, 0);
						var18 = var17 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16777215, 0);
						var18 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16777215, 0);
						var18 += 15;
						var4 = Login.loginBoxX + 180;
						var12 = 301;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Ok", var4, var12 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var17 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var12 = 321;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Set Date of Birth", var4, var12 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var0.drawCentered("Back", var4, var12 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var17 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var17, 16776960, 0);
						var18 = var17 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var18, 16776960, 0);
						var18 += 15;
						var4 = Login.loginBoxX + 180;
						var12 = 276;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var2.drawCentered("Download Launcher", var4, var12 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var12 = 326;
						SoundSystem.titlebuttonSprite.drawAt(var4 - 73, var12 - 20);
						var2.drawCentered("Back", var4, var12 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var16 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var16);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class268.canvasHeight);
				Timer.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Timer.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var16);
			}

			DbTableType.title_muteSprite[TaskHandler.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && WorldMapCacheName.clientLanguage == Language.Language_EN) {
				if (class180.field1897 != null) {
					var18 = Login.xPadding + 5;
					var19 = 463;
					byte var25 = 100;
					byte var24 = 35;
					class180.field1897.drawAt(var18, var19);
					var0.drawCentered("World" + " " + Client.worldId, var25 / 2 + var18, var24 / 2 + var19 - 2, 16777215, 0);
					if (Friend.World_request != null) {
						var1.drawCentered("Loading...", var25 / 2 + var18, var24 / 2 + var19 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var25 / 2 + var18, var24 / 2 + var19 + 12, 16777215, 0);
					}
				} else {
					class180.field1897 = AttackOption.SpriteBuffer_getIndexedSpriteByName(class450.archive8, "sl_button", "");
				}
			}

		}
	}
}
