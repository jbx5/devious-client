import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("w")
class class12 extends SSLSocket {
	@ObfuscatedName("v")
	Certificate[] field62;

	@ObfuscatedSignature(descriptor = 
	"Lm;")

	final class15 this$0;

	final TlsClientProtocol val$tlsClientProtocol;

	final String val$host;

	@ObfuscatedSignature(descriptor = 
	"(Lm;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")

	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public boolean getUseClientMode() {
		return false;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1760016998")

	static void method157() {
		if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"380597881")

	static final int method117(int var0, int var1) {
		int var2 = var0 + (var1 * 57);
		var2 ^= var2 << 13;
		int var3 = (((((var2 * var2) * 15731) + 789221) * var2) + 1376312589) & Integer.MAX_VALUE;
		return (var3 >> 19) & 255;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1823604285")

	static final void method158(int var0, int var1) {
		if (Client.hintArrowType == 2) {
			VarbitComposition.worldToScreen(((Client.hintArrowX - GrandExchangeOfferOwnWorldComparator.baseX) << 7) + Client.hintArrowSubX, ((Client.hintArrowY - VarcInt.baseY) << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2);
			if ((Client.viewportTempX > (-1)) && ((Client.cycle % 20) < 10)) {
				InvDefinition.headIconHintSprites[0].drawTransBgAt((var0 + Client.viewportTempX) - 12, (Client.viewportTempY + var1) - 28);
			}

		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(descriptor = 
	"(Lcy;IIII)V", garbageValue = 
	"402229020")

	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if ((!var4.isFollower) || (Client.followerIndex == var1)) {
						String var5 = var4.name;
						int var6;
						int var9;
						if ((var4.combatLevel != 0) && (var0.field1182 != 0)) {
							var6 = (var0.field1182 != (-1)) ? (var0.field1182 * (-979480491)) * (-1781781251) : (var4.combatLevel * (-867920465)) * 2112479567;
							var9 = GrandExchangeEvents.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < (-9)) {
								var8 = UserComparator9.colorStartTag(16711680);
							} else if (var10 < (-6)) {
								var8 = UserComparator9.colorStartTag(16723968);
							} else if (var10 < (-3)) {
								var8 = UserComparator9.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = UserComparator9.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = UserComparator9.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = UserComparator9.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = UserComparator9.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = UserComparator9.colorStartTag(12648192);
							} else {
								var8 = UserComparator9.colorStartTag(16776960);
							}

							var5 = (((((var5 + var8) + " ") + " (") + "level-") + var6) + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							class21.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + UserComparator9.colorStartTag(16776960)) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class17.selectedSpellFlags & 2) == 2) {
								class21.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + UserComparator9.colorStartTag(16776960)) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = (var4.isFollower && Client.followerOpsLowPriority) ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if ((var7[var11] != null) && (!var7[var11].equalsIgnoreCase("Attack"))) {
										var9 = 0;
										if (var11 == 0) {
											var9 = var6 + 9;
										}

										if (var11 == 1) {
											var9 = var6 + 10;
										}

										if (var11 == 2) {
											var9 = var6 + 11;
										}

										if (var11 == 3) {
											var9 = var6 + 12;
										}

										if (var11 == 4) {
											var9 = var6 + 13;
										}

										class21.insertMenuItemNoShift(var7[var11], UserComparator9.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if ((var7[var11] != null) && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if ((Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick) || ((Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels) && (var4.combatLevel > GrandExchangeEvents.localPlayer.combatLevel))) {
												var12 = 2000;
											}

											var9 = 0;
											if (var11 == 0) {
												var9 = var12 + 9;
											}

											if (var11 == 1) {
												var9 = var12 + 10;
											}

											if (var11 == 2) {
												var9 = var12 + 11;
											}

											if (var11 == 3) {
												var9 = var12 + 12;
											}

											if (var11 == 4) {
												var9 = var12 + 13;
											}

											class21.insertMenuItemNoShift(var7[var11], UserComparator9.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if ((!var4.isFollower) || (!Client.followerOpsLowPriority)) {
								class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ZB)V", garbageValue = 
	"121")

	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class293.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class19.ItemDefinition_get(var4);
			if ((((!var1) || var9.isTradable) && (var9.noteTemplate == (-1))) && (var9.name.toLowerCase().indexOf(var0) != (-1))) {
				if (var3 >= 250) {
					Script.foundItemIdCount = -1;
					PendingSpawn.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = ((short) (var4));
			}
		}

		PendingSpawn.foundItemIds = var2;
		GameEngine.foundItemIndex = 0;
		Script.foundItemIdCount = var3;
		String[] var8 = new String[Script.foundItemIdCount];

		for (int var5 = 0; var5 < Script.foundItemIdCount; ++var5) {
			var8[var5] = class19.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = PendingSpawn.foundItemIds;
		class117.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}