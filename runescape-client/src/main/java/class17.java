import java.io.File;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
class class17 implements SSLSession {
	@ObfuscatedName("o")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("im")
	@ObfuscatedSignature(descriptor = 
	"[Lql;")

	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;

	@ObfuscatedSignature(descriptor = 
	"Lc;")

	final class12 this$1;

	@ObfuscatedSignature(descriptor = 
	"(Lc;)V")

	class17(class12 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field65;
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"912175547")

	static int method259(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
			Login.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class295.Interpreter_intStackSize -= 2;
			KeyHandler.performPlayerAnimation(class19.localPlayer, Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field838) {
				Interpreter.field837 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
				var15 = 0;
				if (class20.isNumber(var7)) {
					var15 = class16.method217(var7);
				}

				PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					var11 = ItemContainer.getPacketBufferNode(ClientPacket.RESUME_P_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					var11 = ItemContainer.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
						VertexNormal.method4497(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class295.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
						Widget var14 = HorizontalAlignment.getWidget(var9);
						PcmPlayer.clickWidget(var14, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class295.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
						Widget var12 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
						PcmPlayer.clickWidget(var12, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator5.mouseCam = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (Interpreter.clientPreferences.method2255()) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Interpreter.clientPreferences.method2254(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						class11.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var11 = ItemContainer.getPacketBufferNode(ClientPacket.RESUME_P_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						ChatChannel.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ItemContainer.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort((1 + ItemLayer.stringCp1252NullTerminatedByteSize(var4)) + ItemLayer.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeByteSub(var10);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						SpriteMask.setTapToDrop(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (TextureProvider.getTapToDrop()) ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class295.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class295.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class295.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class4.canvasWidth;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class309.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class295.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class295.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field652 = 3;
						Client.field653 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field652 = 2;
						Client.field653 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field652 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field652 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field652 = 3;
						Client.field653 = (var2) ? (class432.scriptDotWidget.id * 2073510769) * (-769712751) : (class341.scriptActiveWidget.id * 2073510769) * (-769712751);
						return 1;
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							Interpreter.clientPreferences.method2256(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (Interpreter.clientPreferences.method2257()) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var3;
							if (!var3) {
								Interpreter.clientPreferences.method2316("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (Client.Login_isUsernameRemembered) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
							Interpreter.clientPreferences.method2258(!var3);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (Interpreter.clientPreferences.method2259()) ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = InterfaceParent.method2103();
							return 1;
						} else if (var0 == 3155) {
							--ChatChannel.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class295.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class295.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class295.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--ChatChannel.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class295.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class295.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class295.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class295.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class295.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class295.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class295.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class295.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--ChatChannel.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--ChatChannel.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							WorldMapSection0.method4940(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ViewportMouse.method4492();
							return 1;
						} else if ((var0 != 3183) && (var0 != 3184)) {
							if (var0 == 3187) {
								ChatChannel.Interpreter_stringStackSize -= 2;
								return 1;
							} else {
								return var0 == 3188 ? 1 : 2;
							}
						} else {
							--class295.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1840232783")

	static int method280(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			class295.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class295.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class295.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class295.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.random() * ((double) (var3))));
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.random() * ((double) (var3 + 1))));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class295.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 + (((var4 - var3) * (var7 - var5)) / (var6 - var5));
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 + ((var4 * var3) / 100);
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 | (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 & ((-1) - (1 << var4));
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((var3 & (1 << var4)) != 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.pow(((double) (var3)), ((double) (var4)))));
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					return 1;
				} else {
					switch (var4) {
						case 0 :
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Integer.MAX_VALUE;
							break;
						case 1 :
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
							break;
						case 2 :
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.sqrt(((double) (var3)))));
							break;
						case 3 :
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.cbrt(((double) (var3)))));
							break;
						case 4 :
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.sqrt(Math.sqrt(((double) (var3))))));
							break;
						default :
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) (Math.pow(((double) (var3)), 1.0 / ((double) (var4)))));}


					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class295.Interpreter_intStackSize -= 3;
				long var9 = ((long) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]));
				long var11 = ((long) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]));
				long var13 = ((long) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]));
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((int) ((var9 * var13) / var11));
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = class263.method5208(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 ^ (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class295.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = NetSocket.method3271(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class295.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class425.method7636(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class295.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var3 << var6) >>> (var6 + var4);
				return 1;
			} else if (var0 == 4030) {
				class295.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3];
				var3 = class425.method7636(var3, var5, var6);
				var7 = class260.method5203((var6 - var5) + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 | (var4 << var5);
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = class18.method282(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = class127.method2831(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = class392.method7190(var3, var4);
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-28885")

	static void method228() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(ReflectionCheck.getWindowedMode());
		var0.packetBuffer.writeShort(class4.canvasWidth);
		var0.packetBuffer.writeShort(class309.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}