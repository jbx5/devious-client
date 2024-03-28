import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("je")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("aw")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Ljk;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -296837493
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -881924737
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("an")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 69133945
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.textures = new Texture[var1.getGroupFileCount(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
				this.textures[var7[var9]] = new Texture(var10);
			}
		} else {
			this.textures = new Texture[0];
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1282794497"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) {
			return 100;
		} else {
			int var1 = 0;
			int var2 = 0;
			Texture[] var3 = this.textures;

			for (int var4 = 0; var4 < var3.length; ++var4) {
				Texture var5 = var3[var4];
				if (var5 != null && var5.fileIds != null) {
					var1 += var5.fileIds.length;
					int[] var6 = var5.fileIds;

					for (int var7 = 0; var7 < var6.length; ++var7) {
						int var8 = var6[var7];
						if (this.archive.method6957(var8)) {
							++var2;
						}
					}
				}
			}

			if (var1 == 0) {
				return 0;
			} else {
				return var2 * 100 / var1;
			}
		}
	}

	@ObfuscatedName("ah")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1101959318"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2073193625"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "38"
	)
	public boolean vmethod5205(int var1) {
		return this.textures[var1].field2569;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1647932846"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "990414333"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1061631271"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lun;IB)V",
		garbageValue = "-15"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		Login.method2160(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 1) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 2048) != 0) {
				var6 += var0.readUnsignedByte() << 16;
			}

			class204.method3848(var0, var4, var5, var6);
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "739287375"
	)
	static int method4931(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			var3 = class243.widgetDefinition.method6281(var4);
		} else {
			var3 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class347 var17 = var3.method6667();
				if (var17 != null && var17.method6373(var23, var16)) {
					WorldMapData_0.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				WorldMapData_0.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			HttpRequestTask.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 5];
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				WorldMapData_0.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			WorldMapData_0.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class347 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method6667();
					if (var21 != null && var21.method6513()) {
						var21.method6366(var15);
					} else {
						var3.text = var15;
					}

					WorldMapData_0.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					WorldMapData_0.invalidateWidget(var3);
				}

				return 1;
			} else {
				class347 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method6667();
						if (var19 != null) {
							var19.method6380();
						}
					}

					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					HttpRequestTask.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method6667();
						if (var19 != null) {
							var19.method6374(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
							var19.method6375(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
					}

					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					HttpRequestTask.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					WorldMapData_0.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						IsaacCipher.revalidateWidgetScroll(class243.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					LoginState.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					WorldMapData_0.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					FillMode var22 = (FillMode)KitDefinition.findEnumerated(class234.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						WorldMapData_0.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
						var3.field3862 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3780 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
						WorldMapData_0.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method6662(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize], "", class94.urlRequester, Varcs.getUserId());
						return 1;
					} else if (var0 == 1131) {
						HttpRequestTask.Interpreter_intStackSize -= 2;
						var3.method6666(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6659(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
						return 1;
					} else {
						class341 var20;
						if (var0 == 1133) {
							--HttpRequestTask.Interpreter_intStackSize;
							var20 = var3.method6699();
							if (var20 != null) {
								var20.field3655 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--HttpRequestTask.Interpreter_intStackSize;
							var20 = var3.method6699();
							if (var20 != null) {
								var20.field3656 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize;
							var19 = var3.method6667();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--HttpRequestTask.Interpreter_intStackSize;
							var20 = var3.method6699();
							if (var20 != null) {
								var20.field3657 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null && var19.method6370(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize])) {
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null && var19.method6390(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize])) {
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null && var19.method6520(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize])) {
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
							Client.field749.method4282();
							var21 = var3.method6667();
							if (var21 != null && var21.method6486(var14)) {
								if (var14) {
									Client.field749.method4278(var3);
								}

								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field749.method4279() == var3) {
								Client.field749.method4282();
								WorldMapData_0.invalidateWidget(var3);
							}

							var21 = var3.method6667();
							if (var21 != null) {
								var21.method6365(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var19 = var3.method6667();
							if (var19 != null && var19.method6388(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1])) {
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null && var19.method6388(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize])) {
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null) {
								var19.method6377(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]);
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null) {
								var19.method6376(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null) {
								var19.method6379(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--HttpRequestTask.Interpreter_intStackSize;
							var19 = var3.method6667();
							if (var19 != null) {
								var19.method6465(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]);
								WorldMapData_0.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								var18 = var3.method6682();
								if (var18 != null) {
									var18.method396(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								var18 = var3.method6682();
								if (var18 != null) {
									var18.method402((char)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6645(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize], class94.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								AbstractWorldMapIcon.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 2];
								long var8 = Varcs.getUserId();
								long var10 = class421.getUserHash();
								String var12 = ObjectSound.getPlatformInfo().getDeviceId(ObjectSound.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method6663(var15, var13, var7, var12, Long.toString(var10), class94.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class171 var5 = var3.method6769();
									boolean var6 = var5 != null && AttackOption.method2678().method3564(var5.method3452());
									Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvg;",
		garbageValue = "902921219"
	)
	static SpritePixels[] method4930() {
		SpritePixels[] var0 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var2.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var1];
			var2.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = Ignored.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subWidth * var2.subHeight;
			byte[] var4 = SpriteBufferProperties.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = class126.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		Ignored.SpriteBuffer_spriteHeights = null;
		class126.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-123926135"
	)
	static void method4928(int var0) {
		Client.oculusOrbState = var0;
	}
}
