import java.applet.Applet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("v")
class class11 implements TlsAuthentication {
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lt;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 310
			LinkedList var3 = new LinkedList(); // L: 311
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 313

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 314
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 315
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 317
			}

			this.this$2.this$1.field62 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	@ObfuscatedName("c")
	public static final int method121(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var2 + var4 - var4 * var2; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var14 + (var12 - var14) * 6.0D * var16;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + (var12 - var14) * (0.6666666666666666D - var16) * 6.0D;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + var0 * 6.0D * (var12 - var14);
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = (0.6666666666666666D - var0) * (var12 - var14) * 6.0D + var14;
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var14 + (var12 - var14) * 6.0D * var20;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1769451818"
	)
	public static void method119(Applet var0, String var1) {
		class29.field179 = var0; // L: 22
		if (var1 != null) { // L: 23
			class29.field172 = var1;
		}

	} // L: 24

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;B)V",
		garbageValue = "-86"
	)
	public static void method120(AbstractArchive var0) {
		DbRowType.field4718 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1452992675"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4635
			if (FloorOverlayDefinition.loadInterface(var0)) { // L: 4636
				Widget[] var1 = Calendar.Widget_interfaceComponents[var0]; // L: 4637

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4638
					Widget var3 = var1[var2]; // L: 4639
					if (var3.onLoad != null) { // L: 4640
						ScriptEvent var4 = new ScriptEvent(); // L: 4641
						var4.widget = var3; // L: 4642
						var4.args = var3.onLoad; // L: 4643
						AbstractWorldMapData.runScript(var4, 5000000, 0); // L: 4644
					}
				}

			}
		}
	} // L: 4647

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "304356131"
	)
	static void method113() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2548
		class268.mouseRecorder.index = 0; // L: 2549
		class92.hasFocus = true; // L: 2550
		Client.hadFocus = true; // L: 2551
		Client.field733 = -1L; // L: 2552
		class33.reflectionChecks = new IterableNodeDeque(); // L: 2554
		Client.packetWriter.clearBuffer(); // L: 2556
		Client.packetWriter.packetBuffer.offset = 0; // L: 2557
		Client.packetWriter.serverPacket = null; // L: 2558
		Client.packetWriter.field1348 = null; // L: 2559
		Client.packetWriter.field1350 = null; // L: 2560
		Client.packetWriter.field1345 = null; // L: 2561
		Client.packetWriter.serverPacketLength = 0; // L: 2562
		Client.packetWriter.field1349 = 0; // L: 2563
		Client.rebootTimer = 0; // L: 2564
		Client.logoutTimer = 0; // L: 2565
		Client.hintArrowType = 0; // L: 2566
		AbstractWorldMapIcon.method5183(); // L: 2567
		GraphicsDefaults.method7089(0); // L: 2568
		Messages.Messages_channels.clear(); // L: 2570
		Messages.Messages_hashTable.clear(); // L: 2571
		Messages.Messages_queue.clear(); // L: 2572
		Messages.Messages_count = 0; // L: 2573
		Client.isItemSelected = 0; // L: 2575
		Client.isSpellSelected = false; // L: 2576
		Client.soundEffectCount = 0; // L: 2577
		Client.camAngleY = 0; // L: 2578
		Client.oculusOrbState = 0; // L: 2579
		Varcs.field1323 = null; // L: 2580
		Client.minimapState = 0; // L: 2581
		Client.field736 = -1; // L: 2582
		Client.destinationX = 0; // L: 2583
		Client.destinationY = 0; // L: 2584
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2585
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2586
		Client.npcCount = 0; // L: 2587
		FaceNormal.method4466(); // L: 2588

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2589
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2590
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2591
		Client.projectiles.clear(); // L: 2592
		Client.graphicsObjects.clear(); // L: 2593

		for (var0 = 0; var0 < 4; ++var0) { // L: 2594
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2595
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2596
					Client.groundItems[var0][var4][var2] = null; // L: 2597
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2601
		Varps.friendSystem.clear(); // L: 2602

		for (var0 = 0; var0 < VarpDefinition.field1841; ++var0) { // L: 2603
			VarpDefinition var1 = class119.VarpDefinition_get(var0); // L: 2604
			if (var1 != null) { // L: 2605
				Varps.Varps_temp[var0] = 0; // L: 2606
				Varps.Varps_main[var0] = 0; // L: 2607
			}
		}

		LoginType.varcs.clearTransient(); // L: 2610
		Client.followerIndex = -1; // L: 2611
		if (Client.rootInterface != -1) { // L: 2612
			WorldMapSection2.method4729(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2613
			class120.closeInterface(var3, true); // L: 2614
		}

		Client.rootInterface = -1; // L: 2616
		Client.interfaceParents = new NodeHashTable(8); // L: 2617
		Client.meslayerContinueWidget = null; // L: 2618
		AbstractWorldMapIcon.method5183(); // L: 2619
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2620

		for (var0 = 0; var0 < 8; ++var0) { // L: 2621
			Client.playerMenuActions[var0] = null; // L: 2622
			Client.playerOptionsPriorities[var0] = false; // L: 2623
		}

		class33.method640(); // L: 2625
		Client.isLoading = true; // L: 2626

		for (var0 = 0; var0 < 100; ++var0) { // L: 2627
			Client.field714[var0] = true;
		}

		PacketBufferNode var5 = class120.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher); // L: 2630
		var5.packetBuffer.writeByte(SceneTilePaint.getWindowedMode()); // L: 2631
		var5.packetBuffer.writeShort(class123.canvasWidth); // L: 2632
		var5.packetBuffer.writeShort(class166.canvasHeight); // L: 2633
		Client.packetWriter.addNode(var5); // L: 2634
		class145.friendsChat = null; // L: 2636
		class83.guestClanSettings = null; // L: 2637
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2638
		MusicPatchPcmStream.guestClanChannel = null; // L: 2639
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2640

		for (var0 = 0; var0 < 8; ++var0) { // L: 2641
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		EnumComposition.grandExchangeEvents = null; // L: 2642
	} // L: 2643

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkw;I)Ljava/lang/String;",
		garbageValue = "-73454153"
	)
	static String method112(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10280
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10281
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10283
					if (var3 == -1) { // L: 10284
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10285
					int var6 = ReflectionCheck.method648(var1, var2 - 1); // L: 10287
					String var5;
					if (var6 < 999999999) { // L: 10289
						var5 = Integer.toString(var6); // L: 10290
					} else {
						var5 = "*"; // L: 10293
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10295
				}
			}
		}

		return var0; // L: 10299
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I)Z",
		garbageValue = "930668555"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12040
	}
}
