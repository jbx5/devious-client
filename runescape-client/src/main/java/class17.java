import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
class class17 implements SSLSession {
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1053269587
	)
	@Export("cameraY")
	static int cameraY;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lap;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field63;
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lto;",
		garbageValue = "110"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class500.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (FileSystem.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (FileSystem.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(DevicePcmPlayerProvider.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "201012705"
	)
	static int method267(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = class33.widgetDefinition.method6240(var4);
		} else {
			var3 = var2 ? class416.scriptDotWidget : class306.scriptActiveWidget;
		}

		int var14;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			Interpreter.Interpreter_intStackSize -= 2;
			var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class344 var7 = var3.method6614();
				if (var7 != null && var7.method6313(var14, var9)) {
					ClanChannelMember.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var14;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var9;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				ClanChannelMember.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var14 != var3.sequenceId) {
				var3.sequenceId = var14;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				ClanChannelMember.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ClanChannelMember.invalidateWidget(var3);
			return 1;
		} else {
			class344 var6;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class344 var11;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3.type == 12) {
						var11 = var3.method6614();
						if (var11 != null) {
							var11.method6486();
						}
					}

					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					Interpreter.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var11 = var3.method6614();
						if (var11 != null) {
							var11.method6537(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
							var11.method6315(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					}

					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					ClanChannelMember.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						PendingSpawn.revalidateWidgetScroll(class33.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class174.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ClanChannelMember.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					FillMode var12 = (FillMode)SequenceDefinition.findEnumerated(class472.FillMode_values(), var14);
					if (var12 != null) {
						var3.fillMode = var12;
						ClanChannelMember.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var8;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.field3700 = var8;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var8;
						return 1;
					} else if (var0 == 1129) {
						var3.field3713 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
						ClanChannelMember.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method6692(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize], AbstractWorldMapIcon.urlRequester, class304.getUserId());
						return 1;
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3.method6601(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6602(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						return 1;
					} else {
						class339 var13;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize;
							var13 = var3.method6615();
							if (var13 != null) {
								var13.field3591 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize;
							var13 = var3.method6615();
							if (var13 != null) {
								var13.field3592 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class180.Interpreter_stringStackSize;
							var11 = var3.method6614();
							if (var11 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize;
							var13 = var3.method6615();
							if (var13 != null) {
								var13.field3593 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null && var11.method6321(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null && var11.method6311(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null && var11.method6412(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.field756.method4232();
							var6 = var3.method6614();
							if (var6 != null && var6.method6304(var8)) {
								if (var8) {
									Client.field756.method4216(var3);
								}

								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (!var8 && Client.field756.method4217() == var3) {
								Client.field756.method4232();
								ClanChannelMember.invalidateWidget(var3);
							}

							var6 = var3.method6614();
							if (var6 != null) {
								var6.method6305(var8);
							}

							return 1;
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2;
							var11 = var3.method6614();
							if (var11 != null && var11.method6314(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null && var11.method6314(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null) {
								var11.method6317(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null) {
								var11.method6316(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null) {
								var11.method6319(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize;
							var11 = var3.method6614();
							if (var11 != null) {
								var11.method6318(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								ClanChannelMember.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var10;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2;
								var10 = var3.method6591();
								if (var10 != null) {
									var10.method372(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2;
								var10 = var3.method6591();
								if (var10 != null) {
									var10.method373((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6676(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize], AbstractWorldMapIcon.urlRequester);
								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			} else {
				String var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
				if (!var5.equals(var3.text)) {
					if (var3.type == 12) {
						var6 = var3.method6614();
						if (var6 != null && var6.method6360()) {
							var6.method6306(var5);
						} else {
							var3.text = var5;
						}
					} else {
						var3.text = var5;
					}

					ClanChannelMember.invalidateWidget(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-236516761"
	)
	static int method265(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarcInt.method3678() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
