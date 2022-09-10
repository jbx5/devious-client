import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
class class17 implements SSLSession {
	@ObfuscatedName("uc")
	static Iterator field100;
	@ObfuscatedName("q")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lh;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field62; // L: 182
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	public static void method267() {
		class139.midiPcmStream.clear(); // L: 36
		class274.musicPlayerStatus = 1; // L: 37
		class274.musicTrackArchive = null; // L: 38
	} // L: 39

	@ObfuscatedName("n")
	public static int method271(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 61
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-2056199428"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8374
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) { // L: 8375
			Client.mouseCrossX = var7; // L: 8493
			Client.mouseCrossY = var8; // L: 8494
			Client.mouseCrossColor = 2; // L: 8495
			Client.mouseCrossState = 0; // L: 8496
			Client.destinationX = var0; // L: 8497
			Client.destinationY = var1; // L: 8498
			var9 = class120.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, Client.packetWriter.isaacCipher); // L: 8500
			var9.packetBuffer.writeShort(Canvas.selectedItemId); // L: 8501
			var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 8502
			var9.packetBuffer.writeInt(GameObject.selectedItemWidget); // L: 8503
			var9.packetBuffer.writeShortAddLE(var3); // L: 8504
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8505
			var9.packetBuffer.writeShort(class128.baseX * 64 + var0); // L: 8506
			var9.packetBuffer.writeShort(ApproximateRouteStrategy.selectedItemSlot); // L: 8507
			Client.packetWriter.addNode(var9); // L: 8508
		} else if (var2 == 2) {
			Client.mouseCrossX = var7; // L: 8768
			Client.mouseCrossY = var8; // L: 8769
			Client.mouseCrossColor = 2; // L: 8770
			Client.mouseCrossState = 0; // L: 8771
			Client.destinationX = var0; // L: 8772
			Client.destinationY = var1; // L: 8773
			var9 = class120.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher); // L: 8774
			var9.packetBuffer.writeShortAddLE(Client.selectedSpellItemId); // L: 8775
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8776
			var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 8777
			var9.packetBuffer.writeShortAddLE(class128.baseX * 64 + var0); // L: 8778
			var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 8779
			var9.packetBuffer.writeIntME(ClanSettings.selectedSpellWidget); // L: 8780
			var9.packetBuffer.writeShortAddLE(var3); // L: 8781
			Client.packetWriter.addNode(var9); // L: 8782
		} else if (var2 == 3) {
			Client.mouseCrossX = var7; // L: 8838
			Client.mouseCrossY = var8; // L: 8839
			Client.mouseCrossColor = 2; // L: 8840
			Client.mouseCrossState = 0; // L: 8841
			Client.destinationX = var0; // L: 8842
			Client.destinationY = var1; // L: 8843
			var9 = class120.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher); // L: 8845
			var9.packetBuffer.writeShortLE(WorldMapData_1.baseY * 64 + var1); // L: 8846
			var9.packetBuffer.writeShortLE(class128.baseX * 64 + var0); // L: 8847
			var9.packetBuffer.writeShort(var3); // L: 8848
			var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8849
			Client.packetWriter.addNode(var9); // L: 8850
		} else if (var2 == 4) {
			Client.mouseCrossX = var7; // L: 9165
			Client.mouseCrossY = var8; // L: 9166
			Client.mouseCrossColor = 2; // L: 9167
			Client.mouseCrossState = 0; // L: 9168
			Client.destinationX = var0; // L: 9169
			Client.destinationY = var1; // L: 9170
			var9 = class120.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher); // L: 9172
			var9.packetBuffer.writeShortLE(var3); // L: 9173
			var9.packetBuffer.writeShort(WorldMapData_1.baseY * 64 + var1); // L: 9174
			var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9175
			var9.packetBuffer.writeShort(class128.baseX * 64 + var0); // L: 9176
			Client.packetWriter.addNode(var9); // L: 9177
		} else if (var2 == 5) {
			Client.mouseCrossX = var7; // L: 8406
			Client.mouseCrossY = var8; // L: 8407
			Client.mouseCrossColor = 2; // L: 8408
			Client.mouseCrossState = 0; // L: 8409
			Client.destinationX = var0; // L: 8410
			Client.destinationY = var1; // L: 8411
			var9 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher); // L: 8413
			var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8414
			var9.packetBuffer.writeShortAdd(class128.baseX * 64 + var0); // L: 8415
			var9.packetBuffer.writeShortAdd(WorldMapData_1.baseY * 64 + var1); // L: 8416
			var9.packetBuffer.writeShort(var3); // L: 8417
			Client.packetWriter.addNode(var9); // L: 8418
		} else if (var2 == 6) {
			Client.mouseCrossX = var7; // L: 9021
			Client.mouseCrossY = var8; // L: 9022
			Client.mouseCrossColor = 2; // L: 9023
			Client.mouseCrossState = 0; // L: 9024
			Client.destinationX = var0; // L: 9025
			Client.destinationY = var1; // L: 9026
			var9 = class120.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher); // L: 9028
			var9.packetBuffer.writeShortAddLE(class128.baseX * 64 + var0); // L: 9029
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9030
			var9.packetBuffer.writeShortAdd(var3); // L: 9031
			var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 9032
			Client.packetWriter.addNode(var9); // L: 9033
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3]; // L: 8879
				if (var14 != null) { // L: 8880
					Client.mouseCrossX = var7; // L: 8881
					Client.mouseCrossY = var8; // L: 8882
					Client.mouseCrossColor = 2; // L: 8883
					Client.mouseCrossState = 0; // L: 8884
					Client.destinationX = var0; // L: 8885
					Client.destinationY = var1; // L: 8886
					var10 = class120.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher); // L: 8888
					var10.packetBuffer.writeInt(GameObject.selectedItemWidget); // L: 8889
					var10.packetBuffer.writeShort(ApproximateRouteStrategy.selectedItemSlot); // L: 8890
					var10.packetBuffer.writeShort(var3); // L: 8891
					var10.packetBuffer.writeShort(Canvas.selectedItemId); // L: 8892
					var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8893
					Client.packetWriter.addNode(var10); // L: 8894
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3]; // L: 8820
				if (var14 != null) { // L: 8821
					Client.mouseCrossX = var7; // L: 8822
					Client.mouseCrossY = var8; // L: 8823
					Client.mouseCrossColor = 2; // L: 8824
					Client.mouseCrossState = 0; // L: 8825
					Client.destinationX = var0; // L: 8826
					Client.destinationY = var1; // L: 8827
					var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher); // L: 8828
					var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 8829
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8830
					var10.packetBuffer.writeIntME(ClanSettings.selectedSpellWidget); // L: 8831
					var10.packetBuffer.writeShortLE(var3); // L: 8832
					var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId); // L: 8833
					Client.packetWriter.addNode(var10); // L: 8834
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3]; // L: 8863
				if (var14 != null) { // L: 8864
					Client.mouseCrossX = var7; // L: 8865
					Client.mouseCrossY = var8; // L: 8866
					Client.mouseCrossColor = 2; // L: 8867
					Client.mouseCrossState = 0; // L: 8868
					Client.destinationX = var0; // L: 8869
					Client.destinationY = var1; // L: 8870
					var10 = class120.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher); // L: 8872
					var10.packetBuffer.writeShortAdd(var3); // L: 8873
					var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8874
					Client.packetWriter.addNode(var10); // L: 8875
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3]; // L: 8720
				if (var14 != null) { // L: 8721
					Client.mouseCrossX = var7; // L: 8722
					Client.mouseCrossY = var8; // L: 8723
					Client.mouseCrossColor = 2; // L: 8724
					Client.mouseCrossState = 0; // L: 8725
					Client.destinationX = var0; // L: 8726
					Client.destinationY = var1; // L: 8727
					var10 = class120.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher); // L: 8729
					var10.packetBuffer.writeShortLE(var3); // L: 8730
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8731
					Client.packetWriter.addNode(var10); // L: 8732
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3]; // L: 8704
				if (var14 != null) { // L: 8705
					Client.mouseCrossX = var7; // L: 8706
					Client.mouseCrossY = var8; // L: 8707
					Client.mouseCrossColor = 2; // L: 8708
					Client.mouseCrossState = 0; // L: 8709
					Client.destinationX = var0; // L: 8710
					Client.destinationY = var1; // L: 8711
					var10 = class120.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher); // L: 8713
					var10.packetBuffer.writeShortAddLE(var3); // L: 8714
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8715
					Client.packetWriter.addNode(var10); // L: 8716
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3]; // L: 8421
				if (var14 != null) { // L: 8422
					Client.mouseCrossX = var7; // L: 8423
					Client.mouseCrossY = var8; // L: 8424
					Client.mouseCrossColor = 2; // L: 8425
					Client.mouseCrossState = 0; // L: 8426
					Client.destinationX = var0; // L: 8427
					Client.destinationY = var1; // L: 8428
					var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher); // L: 8430
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8431
					var10.packetBuffer.writeShortAddLE(var3); // L: 8432
					Client.packetWriter.addNode(var10); // L: 8433
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3]; // L: 8673
				if (var14 != null) { // L: 8674
					Client.mouseCrossX = var7; // L: 8675
					Client.mouseCrossY = var8; // L: 8676
					Client.mouseCrossColor = 2; // L: 8677
					Client.mouseCrossState = 0; // L: 8678
					Client.destinationX = var0; // L: 8679
					Client.destinationY = var1; // L: 8680
					var10 = class120.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher); // L: 8682
					var10.packetBuffer.writeShort(var3); // L: 8683
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8684
					Client.packetWriter.addNode(var10); // L: 8685
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3]; // L: 8630
					if (var16 != null) { // L: 8631
						Client.mouseCrossX = var7; // L: 8632
						Client.mouseCrossY = var8; // L: 8633
						Client.mouseCrossColor = 2; // L: 8634
						Client.mouseCrossState = 0; // L: 8635
						Client.destinationX = var0; // L: 8636
						Client.destinationY = var1; // L: 8637
						var10 = class120.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher); // L: 8639
						var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8640
						var10.packetBuffer.writeShort(ApproximateRouteStrategy.selectedItemSlot); // L: 8641
						var10.packetBuffer.writeShortAdd(var3); // L: 8642
						var10.packetBuffer.writeIntLE(GameObject.selectedItemWidget); // L: 8643
						var10.packetBuffer.writeShortAddLE(Canvas.selectedItemId); // L: 8644
						Client.packetWriter.addNode(var10); // L: 8645
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3]; // L: 8475
					if (var16 != null) { // L: 8476
						Client.mouseCrossX = var7; // L: 8477
						Client.mouseCrossY = var8; // L: 8478
						Client.mouseCrossColor = 2; // L: 8479
						Client.mouseCrossState = 0; // L: 8480
						Client.destinationX = var0; // L: 8481
						Client.destinationY = var1; // L: 8482
						var10 = class120.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher); // L: 8483
						var10.packetBuffer.writeShortAdd(var3); // L: 8484
						var10.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8485
						var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8486
						var10.packetBuffer.writeIntIME(ClanSettings.selectedSpellWidget); // L: 8487
						var10.packetBuffer.writeShortAddLE(Client.selectedSpellItemId); // L: 8488
						Client.packetWriter.addNode(var10); // L: 8489
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7; // L: 8551
					Client.mouseCrossY = var8; // L: 8552
					Client.mouseCrossColor = 2; // L: 8553
					Client.mouseCrossState = 0; // L: 8554
					Client.destinationX = var0; // L: 8555
					Client.destinationY = var1; // L: 8556
					var9 = class120.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher); // L: 8558
					var9.packetBuffer.writeShortAddLE(Canvas.selectedItemId); // L: 8559
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8560
					var9.packetBuffer.writeShortLE(ApproximateRouteStrategy.selectedItemSlot); // L: 8561
					var9.packetBuffer.writeShort(WorldMapData_1.baseY * 64 + var1); // L: 8562
					var9.packetBuffer.writeShortLE(class128.baseX * 64 + var0); // L: 8563
					var9.packetBuffer.writeShortAddLE(var3); // L: 8564
					var9.packetBuffer.writeInt(GameObject.selectedItemWidget); // L: 8565
					Client.packetWriter.addNode(var9); // L: 8566
				} else if (var2 == 17) {
					Client.mouseCrossX = var7; // L: 8389
					Client.mouseCrossY = var8; // L: 8390
					Client.mouseCrossColor = 2; // L: 8391
					Client.mouseCrossState = 0; // L: 8392
					Client.destinationX = var0; // L: 8393
					Client.destinationY = var1; // L: 8394
					var9 = class120.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, Client.packetWriter.isaacCipher); // L: 8395
					var9.packetBuffer.writeShortAddLE(Client.selectedSpellItemId); // L: 8396
					var9.packetBuffer.writeShort(var3); // L: 8397
					var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 8398
					var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8399
					var9.packetBuffer.writeInt(ClanSettings.selectedSpellWidget); // L: 8400
					var9.packetBuffer.writeShortAddLE(class128.baseX * 64 + var0); // L: 8401
					var9.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex); // L: 8402
					Client.packetWriter.addNode(var9); // L: 8403
				} else if (var2 == 18) {
					Client.mouseCrossX = var7; // L: 8599
					Client.mouseCrossY = var8; // L: 8600
					Client.mouseCrossColor = 2; // L: 8601
					Client.mouseCrossState = 0; // L: 8602
					Client.destinationX = var0; // L: 8603
					Client.destinationY = var1; // L: 8604
					var9 = class120.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher); // L: 8606
					var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8607
					var9.packetBuffer.writeShortLE(WorldMapData_1.baseY * 64 + var1); // L: 8608
					var9.packetBuffer.writeShort(class128.baseX * 64 + var0); // L: 8609
					var9.packetBuffer.writeShort(var3); // L: 8610
					Client.packetWriter.addNode(var9); // L: 8611
				} else if (var2 == 19) {
					Client.mouseCrossX = var7; // L: 8689
					Client.mouseCrossY = var8; // L: 8690
					Client.mouseCrossColor = 2; // L: 8691
					Client.mouseCrossState = 0; // L: 8692
					Client.destinationX = var0; // L: 8693
					Client.destinationY = var1; // L: 8694
					var9 = class120.getPacketBufferNode(ClientPacket.CLAN_LEAVECHAT, Client.packetWriter.isaacCipher); // L: 8696
					var9.packetBuffer.writeShort(var3); // L: 8697
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8698
					var9.packetBuffer.writeShortLE(class128.baseX * 64 + var0); // L: 8699
					var9.packetBuffer.writeShort(WorldMapData_1.baseY * 64 + var1); // L: 8700
					Client.packetWriter.addNode(var9); // L: 8701
				} else if (var2 == 20) {
					Client.mouseCrossX = var7; // L: 9052
					Client.mouseCrossY = var8; // L: 9053
					Client.mouseCrossColor = 2; // L: 9054
					Client.mouseCrossState = 0; // L: 9055
					Client.destinationX = var0; // L: 9056
					Client.destinationY = var1; // L: 9057
					var9 = class120.getPacketBufferNode(ClientPacket.field3026, Client.packetWriter.isaacCipher); // L: 9059
					var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9060
					var9.packetBuffer.writeShortLE(class128.baseX * 64 + var0); // L: 9061
					var9.packetBuffer.writeShortAdd(WorldMapData_1.baseY * 64 + var1); // L: 9062
					var9.packetBuffer.writeShortAddLE(var3); // L: 9063
					Client.packetWriter.addNode(var9); // L: 9064
				} else if (var2 == 21) {
					Client.mouseCrossX = var7; // L: 9006
					Client.mouseCrossY = var8; // L: 9007
					Client.mouseCrossColor = 2; // L: 9008
					Client.mouseCrossState = 0; // L: 9009
					Client.destinationX = var0; // L: 9010
					Client.destinationY = var1; // L: 9011
					var9 = class120.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher); // L: 9013
					var9.packetBuffer.writeShortLE(var3); // L: 9014
					var9.packetBuffer.writeShortLE(WorldMapData_1.baseY * 64 + var1); // L: 9015
					var9.packetBuffer.writeShortAddLE(class128.baseX * 64 + var0); // L: 9016
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9017
					Client.packetWriter.addNode(var9); // L: 9018
				} else if (var2 == 22) {
					Client.mouseCrossX = var7; // L: 8793
					Client.mouseCrossY = var8; // L: 8794
					Client.mouseCrossColor = 2; // L: 8795
					Client.mouseCrossState = 0; // L: 8796
					Client.destinationX = var0; // L: 8797
					Client.destinationY = var1; // L: 8798
					var9 = class120.getPacketBufferNode(ClientPacket.field3045, Client.packetWriter.isaacCipher); // L: 8800
					var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 8801
					var9.packetBuffer.writeShortAdd(var3); // L: 8802
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8803
					var9.packetBuffer.writeShortAddLE(class128.baseX * 64 + var0); // L: 8804
					Client.packetWriter.addNode(var9); // L: 8805
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8785
						MusicPatchNode.scene.setViewportWalking(); // L: 8786
					} else {
						MusicPatchNode.scene.menuOpen(Tiles.Client_plane, var0, var1, true); // L: 8789
					}
				} else {
					PacketBufferNode var11;
					Widget var17;
					if (var2 == 24) {
						var17 = SpotAnimationDefinition.getWidget(var1); // L: 8527
						if (var17 != null) { // L: 8528
							boolean var12 = true; // L: 8529
							if (var17.contentType > 0) { // L: 8530
								var12 = SoundSystem.method817(var17);
							}

							if (var12) { // L: 8531
								var11 = class120.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, Client.packetWriter.isaacCipher); // L: 8533
								var11.packetBuffer.writeInt(var1); // L: 8534
								Client.packetWriter.addNode(var11); // L: 8535
							}
						}
					} else {
						if (var2 == 25) {
							var17 = JagexCache.getWidgetChild(var1, var0); // L: 8376
							if (var17 != null) { // L: 8377
								class193.Widget_runOnTargetLeave(); // L: 8378
								class128.selectSpell(var1, var0, SoundCache.Widget_unpackTargetMask(class97.getWidgetFlags(var17)), var4); // L: 8379
								Client.isItemSelected = 0; // L: 8380
								Client.selectedSpellActionName = class67.Widget_getSpellActionName(var17); // L: 8381
								if (Client.selectedSpellActionName == null) { // L: 8382
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) { // L: 8383
									Client.selectedSpellName = var17.dataText + SoundCache.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = SoundCache.colorStartTag(65280) + var17.spellName + SoundCache.colorStartTag(16777215); // L: 8384
								}
							}

							return; // L: 8386
						}

						if (var2 == 26) {
							class21.method318(); // L: 8981
						} else {
							int var13;
							Widget var15;
							if (var2 == 28) {
								var9 = class120.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, Client.packetWriter.isaacCipher); // L: 9143
								var9.packetBuffer.writeInt(var1); // L: 9144
								Client.packetWriter.addNode(var9); // L: 9145
								var15 = SpotAnimationDefinition.getWidget(var1); // L: 9146
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9147
									var13 = var15.cs1Instructions[0][1]; // L: 9148
									Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13]; // L: 9149
									class269.changeGameOptions(var13); // L: 9150
								}
							} else if (var2 == 29) {
								var9 = class120.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, Client.packetWriter.isaacCipher); // L: 8570
								var9.packetBuffer.writeInt(var1); // L: 8571
								Client.packetWriter.addNode(var9); // L: 8572
								var15 = SpotAnimationDefinition.getWidget(var1); // L: 8573
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 8574
									var13 = var15.cs1Instructions[0][1]; // L: 8575
									if (Varps.Varps_main[var13] != var15.cs1ComparisonValues[0]) { // L: 8576
										Varps.Varps_main[var13] = var15.cs1ComparisonValues[0]; // L: 8577
										class269.changeGameOptions(var13); // L: 8578
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8898
									class425.resumePauseWidget(var1, var0); // L: 8899
									Client.meslayerContinueWidget = JagexCache.getWidgetChild(var1, var0); // L: 8900
									class403.invalidateWidget(Client.meslayerContinueWidget); // L: 8901
								}
							} else if (var2 == 31) {
								var9 = class120.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher); // L: 9079
								var9.packetBuffer.writeInt(var1); // L: 9080
								var9.packetBuffer.writeShort(ApproximateRouteStrategy.selectedItemSlot); // L: 9081
								var9.packetBuffer.writeShortLE(Canvas.selectedItemId); // L: 9082
								var9.packetBuffer.writeIntIME(GameObject.selectedItemWidget); // L: 9083
								var9.packetBuffer.writeShortAddLE(var0); // L: 9084
								var9.packetBuffer.writeShort(var4); // L: 9085
								Client.packetWriter.addNode(var9); // L: 9086
								Client.field609 = 0; // L: 9087
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9088
								Client.field635 = var0; // L: 9089
							} else if (var2 == 32) {
								var9 = class120.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher); // L: 8661
								var9.packetBuffer.writeInt(ClanSettings.selectedSpellWidget); // L: 8662
								var9.packetBuffer.writeShortAddLE(var0); // L: 8663
								var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8664
								var9.packetBuffer.writeIntIME(var1); // L: 8665
								var9.packetBuffer.writeShortAddLE(var4); // L: 8666
								Client.packetWriter.addNode(var9); // L: 8667
								Client.field609 = 0; // L: 8668
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 8669
								Client.field635 = var0; // L: 8670
							} else if (var2 == 33) {
								var9 = class120.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher); // L: 8996
								var9.packetBuffer.writeShortAddLE(var4); // L: 8997
								var9.packetBuffer.writeIntME(var1); // L: 8998
								var9.packetBuffer.writeShort(var0); // L: 8999
								Client.packetWriter.addNode(var9); // L: 9000
								Client.field609 = 0; // L: 9001
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9002
								Client.field635 = var0; // L: 9003
							} else if (var2 == 34) {
								var9 = class120.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher); // L: 8541
								var9.packetBuffer.writeIntIME(var1); // L: 8542
								var9.packetBuffer.writeShortLE(var0); // L: 8543
								var9.packetBuffer.writeShortAdd(var4); // L: 8544
								Client.packetWriter.addNode(var9); // L: 8545
								Client.field609 = 0; // L: 8546
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 8547
								Client.field635 = var0; // L: 8548
							} else if (var2 == 35) {
								var9 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher); // L: 9121
								var9.packetBuffer.writeShortLE(var4); // L: 9122
								var9.packetBuffer.writeIntME(var1); // L: 9123
								var9.packetBuffer.writeShortAdd(var0); // L: 9124
								Client.packetWriter.addNode(var9); // L: 9125
								Client.field609 = 0; // L: 9126
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9127
								Client.field635 = var0; // L: 9128
							} else if (var2 == 36) {
								var9 = class120.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher); // L: 8922
								var9.packetBuffer.writeShort(var0); // L: 8923
								var9.packetBuffer.writeShortAdd(var4); // L: 8924
								var9.packetBuffer.writeIntLE(var1); // L: 8925
								Client.packetWriter.addNode(var9); // L: 8926
								Client.field609 = 0; // L: 8927
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 8928
								Client.field635 = var0; // L: 8929
							} else if (var2 == 37) {
								var9 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher); // L: 8965
								var9.packetBuffer.writeShortLE(var0); // L: 8966
								var9.packetBuffer.writeIntME(var1); // L: 8967
								var9.packetBuffer.writeShortLE(var4); // L: 8968
								Client.packetWriter.addNode(var9); // L: 8969
								Client.field609 = 0; // L: 8970
								DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 8971
								Client.field635 = var0; // L: 8972
							} else {
								if (var2 == 38) {
									class193.Widget_runOnTargetLeave(); // L: 9108
									var17 = SpotAnimationDefinition.getWidget(var1); // L: 9109
									Client.isItemSelected = 1; // L: 9110
									ApproximateRouteStrategy.selectedItemSlot = var0; // L: 9111
									GameObject.selectedItemWidget = var1; // L: 9112
									Canvas.selectedItemId = var4; // L: 9113
									class403.invalidateWidget(var17); // L: 9114
									Client.selectedItemName = SoundCache.colorStartTag(16748608) + UserComparator3.ItemDefinition_get(var4).name + SoundCache.colorStartTag(16777215); // L: 9115
									if (Client.selectedItemName == null) { // L: 9116
										Client.selectedItemName = "null";
									}

									return; // L: 9117
								}

								if (var2 == 39) {
									var9 = class120.getPacketBufferNode(ClientPacket.field3028, Client.packetWriter.isaacCipher); // L: 9132
									var9.packetBuffer.writeShortLE(var4); // L: 9133
									var9.packetBuffer.writeShortAdd(var0); // L: 9134
									var9.packetBuffer.writeInt(var1); // L: 9135
									Client.packetWriter.addNode(var9); // L: 9136
									Client.field609 = 0; // L: 9137
									DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9138
									Client.field635 = var0; // L: 9139
								} else if (var2 == 40) {
									var9 = class120.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher); // L: 9155
									var9.packetBuffer.writeInt(var1); // L: 9156
									var9.packetBuffer.writeShortAdd(var0); // L: 9157
									var9.packetBuffer.writeShortAdd(var4); // L: 9158
									Client.packetWriter.addNode(var9); // L: 9159
									Client.field609 = 0; // L: 9160
									DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9161
									Client.field635 = var0; // L: 9162
								} else if (var2 == 41) {
									var9 = class120.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher); // L: 9068
									var9.packetBuffer.writeInt(var1); // L: 9069
									var9.packetBuffer.writeShortAddLE(var0); // L: 9070
									var9.packetBuffer.writeShortAddLE(var4); // L: 9071
									Client.packetWriter.addNode(var9); // L: 9072
									Client.field609 = 0; // L: 9073
									DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9074
									Client.field635 = var0; // L: 9075
								} else if (var2 == 42) {
									var9 = class120.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 8650
									var9.packetBuffer.writeInt(var1); // L: 8651
									var9.packetBuffer.writeShort(var0); // L: 8652
									var9.packetBuffer.writeShortAddLE(var4); // L: 8653
									Client.packetWriter.addNode(var9); // L: 8654
									Client.field609 = 0; // L: 8655
									DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 8656
									Client.field635 = var0; // L: 8657
								} else if (var2 == 43) {
									var9 = class120.getPacketBufferNode(ClientPacket.IF_BUTTOND, Client.packetWriter.isaacCipher); // L: 8985
									var9.packetBuffer.writeShortAdd(var0); // L: 8986
									var9.packetBuffer.writeShortLE(var4); // L: 8987
									var9.packetBuffer.writeIntIME(var1); // L: 8988
									Client.packetWriter.addNode(var9); // L: 8989
									Client.field609 = 0; // L: 8990
									DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 8991
									Client.field635 = var0; // L: 8992
								} else if (var2 == 44) {
									var16 = Client.players[var3]; // L: 8583
									if (var16 != null) { // L: 8584
										Client.mouseCrossX = var7; // L: 8585
										Client.mouseCrossY = var8; // L: 8586
										Client.mouseCrossColor = 2; // L: 8587
										Client.mouseCrossState = 0; // L: 8588
										Client.destinationX = var0; // L: 8589
										Client.destinationY = var1; // L: 8590
										var10 = class120.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher); // L: 8592
										var10.packetBuffer.writeShort(var3); // L: 8593
										var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8594
										Client.packetWriter.addNode(var10); // L: 8595
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3]; // L: 8905
									if (var16 != null) { // L: 8906
										Client.mouseCrossX = var7; // L: 8907
										Client.mouseCrossY = var8; // L: 8908
										Client.mouseCrossColor = 2; // L: 8909
										Client.mouseCrossState = 0; // L: 8910
										Client.destinationX = var0; // L: 8911
										Client.destinationY = var1; // L: 8912
										var10 = class120.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher); // L: 8914
										var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8915
										var10.packetBuffer.writeShortAddLE(var3); // L: 8916
										Client.packetWriter.addNode(var10); // L: 8917
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3]; // L: 8614
									if (var16 != null) { // L: 8615
										Client.mouseCrossX = var7; // L: 8616
										Client.mouseCrossY = var8; // L: 8617
										Client.mouseCrossColor = 2; // L: 8618
										Client.mouseCrossState = 0; // L: 8619
										Client.destinationX = var0; // L: 8620
										Client.destinationY = var1; // L: 8621
										var10 = class120.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 8623
										var10.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8624
										var10.packetBuffer.writeShortAdd(var3); // L: 8625
										Client.packetWriter.addNode(var10); // L: 8626
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3]; // L: 9036
									if (var16 != null) { // L: 9037
										Client.mouseCrossX = var7; // L: 9038
										Client.mouseCrossY = var8; // L: 9039
										Client.mouseCrossColor = 2; // L: 9040
										Client.mouseCrossState = 0; // L: 9041
										Client.destinationX = var0; // L: 9042
										Client.destinationY = var1; // L: 9043
										var10 = class120.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher); // L: 9045
										var10.packetBuffer.writeShortLE(var3); // L: 9046
										var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9047
										Client.packetWriter.addNode(var10); // L: 9048
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3]; // L: 8736
									if (var16 != null) { // L: 8737
										Client.mouseCrossX = var7; // L: 8738
										Client.mouseCrossY = var8; // L: 8739
										Client.mouseCrossColor = 2; // L: 8740
										Client.mouseCrossState = 0; // L: 8741
										Client.destinationX = var0; // L: 8742
										Client.destinationY = var1; // L: 8743
										var10 = class120.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher); // L: 8745
										var10.packetBuffer.writeShortAddLE(var3); // L: 8746
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8747
										Client.packetWriter.addNode(var10); // L: 8748
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3]; // L: 8752
									if (var16 != null) { // L: 8753
										Client.mouseCrossX = var7; // L: 8754
										Client.mouseCrossY = var8; // L: 8755
										Client.mouseCrossColor = 2; // L: 8756
										Client.mouseCrossState = 0; // L: 8757
										Client.destinationX = var0; // L: 8758
										Client.destinationY = var1; // L: 8759
										var10 = class120.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 8761
										var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8762
										var10.packetBuffer.writeShortAdd(var3); // L: 8763
										Client.packetWriter.addNode(var10); // L: 8764
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3]; // L: 8511
									if (var16 != null) { // L: 8512
										Client.mouseCrossX = var7; // L: 8513
										Client.mouseCrossY = var8; // L: 8514
										Client.mouseCrossColor = 2; // L: 8515
										Client.mouseCrossState = 0; // L: 8516
										Client.destinationX = var0; // L: 8517
										Client.destinationY = var1; // L: 8518
										var10 = class120.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 8520
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8521
										var10.packetBuffer.writeShortAddLE(var3); // L: 8522
										Client.packetWriter.addNode(var10); // L: 8523
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3]; // L: 8459
									if (var16 != null) { // L: 8460
										Client.mouseCrossX = var7; // L: 8461
										Client.mouseCrossY = var8; // L: 8462
										Client.mouseCrossColor = 2; // L: 8463
										Client.mouseCrossState = 0; // L: 8464
										Client.destinationX = var0; // L: 8465
										Client.destinationY = var1; // L: 8466
										var10 = class120.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher); // L: 8468
										var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8469
										var10.packetBuffer.writeShortAddLE(var3); // L: 8470
										Client.packetWriter.addNode(var10); // L: 8471
									}
								} else {
									label666: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = JagexCache.getWidgetChild(var1, var0); // L: 8437
												if (var17 != null) { // L: 8438
													if (var17.field3506 != null) { // L: 8439
														ScriptEvent var19 = new ScriptEvent(); // L: 8440
														var19.widget = var17; // L: 8441
														var19.opIndex = var3; // L: 8442
														var19.targetName = var6; // L: 8443
														var19.args = var17.field3506; // L: 8444
														class348.runScriptEvent(var19); // L: 8445
													}

													var10 = class120.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 8448
													var10.packetBuffer.writeShort(var0); // L: 8449
													var10.packetBuffer.writeIntLE(ClanSettings.selectedSpellWidget); // L: 8450
													var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 8451
													var10.packetBuffer.writeIntIME(var1); // L: 8452
													var10.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8453
													var10.packetBuffer.writeShortLE(var4); // L: 8454
													Client.packetWriter.addNode(var10); // L: 8455
												}
												break label666;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7; // L: 8949
												Client.mouseCrossY = var8; // L: 8950
												Client.mouseCrossColor = 2; // L: 8951
												Client.mouseCrossState = 0; // L: 8952
												Client.destinationX = var0; // L: 8953
												Client.destinationY = var1; // L: 8954
												var9 = class120.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 8956
												var9.packetBuffer.writeShortAdd(var3); // L: 8957
												var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 8958
												var9.packetBuffer.writeShortLE(class128.baseX * 64 + var0); // L: 8959
												var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8960
												Client.packetWriter.addNode(var9); // L: 8961
												break label666;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7; // L: 8853
												Client.mouseCrossY = var8; // L: 8854
												Client.mouseCrossColor = 2; // L: 8855
												Client.mouseCrossState = 0; // L: 8856
												var9 = class120.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher); // L: 8858
												var9.packetBuffer.writeShort(var3); // L: 8859
												Client.packetWriter.addNode(var9); // L: 8860
												break label666;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7; // L: 8932
												Client.mouseCrossY = var8; // L: 8933
												Client.mouseCrossColor = 2; // L: 8934
												Client.mouseCrossState = 0; // L: 8935
												var14 = Client.npcs[var3]; // L: 8936
												if (var14 != null) { // L: 8937
													NPCComposition var18 = var14.definition; // L: 8938
													if (var18.transforms != null) { // L: 8939
														var18 = var18.transform();
													}

													if (var18 != null) { // L: 8940
														var11 = class120.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 8942
														var11.packetBuffer.writeShortAdd(var18.id); // L: 8943
														Client.packetWriter.addNode(var11); // L: 8944
													}
												}
												break label666;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7; // L: 8808
												Client.mouseCrossY = var8; // L: 8809
												Client.mouseCrossColor = 2; // L: 8810
												Client.mouseCrossState = 0; // L: 8811
												var9 = class120.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, Client.packetWriter.isaacCipher); // L: 8813
												var9.packetBuffer.writeShort(var3); // L: 8814
												var9.packetBuffer.writeShort(class128.baseX * 64 + var0); // L: 8815
												var9.packetBuffer.writeShortAddLE(WorldMapData_1.baseY * 64 + var1); // L: 8816
												Client.packetWriter.addNode(var9); // L: 8817
												break label666;
											}

											if (var2 == 1005) {
												var17 = SpotAnimationDefinition.getWidget(var1); // L: 9092
												if (var17 != null && var17.itemQuantities[var0] >= 100000) { // L: 9093
													class65.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + UserComparator3.ItemDefinition_get(var4).name);
												} else {
													var10 = class120.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher); // L: 9096
													var10.packetBuffer.writeShortAdd(var4); // L: 9097
													Client.packetWriter.addNode(var10); // L: 9098
												}

												Client.field609 = 0; // L: 9100
												DevicePcmPlayerProvider.field153 = SpotAnimationDefinition.getWidget(var1); // L: 9101
												Client.field635 = var0; // L: 9102
												break label666;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1008 || var2 == 1012) {
													Decimator.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9105
												}
												break label666;
											}
										}

										var17 = JagexCache.getWidgetChild(var1, var0); // L: 8975
										if (var17 != null) { // L: 8976
											ApproximateRouteStrategy.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 8977
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9179
			Client.isItemSelected = 0; // L: 9180
			class403.invalidateWidget(SpotAnimationDefinition.getWidget(GameObject.selectedItemWidget)); // L: 9181
		}

		if (Client.isSpellSelected) { // L: 9183
			class193.Widget_runOnTargetLeave();
		}

		if (DevicePcmPlayerProvider.field153 != null && Client.field609 == 0) { // L: 9184
			class403.invalidateWidget(DevicePcmPlayerProvider.field153);
		}

	} // L: 9185

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "([Lkw;IIIIIIIB)V",
		garbageValue = "-5"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10791
			Widget var9 = var0[var8]; // L: 10792
			if (var9 != null && var9.parentId == var1 && (var9.method5784() || class97.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 10793 10794 10795
				if (var9.isIf3) { // L: 10796
					if (class11.isComponentHidden(var9)) { // L: 10797
						continue;
					}
				} else if (var9.type == 0 && var9 != class148.mousedOverWidgetIf1 && class11.isComponentHidden(var9)) { // L: 10800
					continue;
				}

				if (var9.type == 11 && var9.method5827(Messages.urlRequester)) { // L: 10802 10803
					if (var9.method5790()) { // L: 10804
						class403.invalidateWidget(var9); // L: 10805
						StructComposition.revalidateWidgetScroll(var9.children, var9, true); // L: 10806
					}

					if (var9.field3522 != null) { // L: 10808
						ScriptEvent var10 = new ScriptEvent(); // L: 10809
						var10.widget = var9; // L: 10810
						var10.args = var9.field3522; // L: 10811
						Client.scriptEvents.addFirst(var10); // L: 10812
					}
				}

				int var26 = var9.x + var6; // L: 10816
				int var11 = var7 + var9.y; // L: 10817
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10822
					var12 = var2; // L: 10823
					var13 = var3; // L: 10824
					var14 = var4; // L: 10825
					var15 = var5; // L: 10826
				} else {
					int var16;
					if (var9.type == 9) { // L: 10828
						var16 = var26; // L: 10829
						var17 = var11; // L: 10830
						var18 = var26 + var9.width; // L: 10831
						int var19 = var11 + var9.height; // L: 10832
						if (var18 < var26) { // L: 10833
							var16 = var18; // L: 10835
							var18 = var26; // L: 10836
						}

						if (var19 < var11) { // L: 10838
							var17 = var19; // L: 10840
							var19 = var11; // L: 10841
						}

						++var18; // L: 10843
						++var19; // L: 10844
						var12 = var16 > var2 ? var16 : var2; // L: 10845
						var13 = var17 > var3 ? var17 : var3; // L: 10846
						var14 = var18 < var4 ? var18 : var4; // L: 10847
						var15 = var19 < var5 ? var19 : var5; // L: 10848
					} else {
						var16 = var26 + var9.width; // L: 10851
						var17 = var11 + var9.height; // L: 10852
						var12 = var26 > var2 ? var26 : var2; // L: 10853
						var13 = var11 > var3 ? var11 : var3; // L: 10854
						var14 = var16 < var4 ? var16 : var4; // L: 10855
						var15 = var17 < var5 ? var17 : var5; // L: 10856
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10858
					Client.field686 = true; // L: 10859
					Client.field687 = var26; // L: 10860
					Client.field688 = var11; // L: 10861
				}

				boolean var34 = false; // L: 10863
				if (var9.field3395) { // L: 10864
					switch(Client.field593) { // L: 10865
					case 0:
						var34 = true; // L: 10877
					case 1:
					default:
						break;
					case 2:
						if (Client.field668 == var9.id >>> 16) { // L: 10867
							var34 = true; // L: 10868
						}
						break;
					case 3:
						if (var9.id == Client.field668) { // L: 10872
							var34 = true; // L: 10873
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10881
					if (var9.isIf3) { // L: 10882
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 10883
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10884
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10885
									if (var27.isMouseInputEvent) { // L: 10886
										var27.remove(); // L: 10887
										var27.widget.containsMouse = false; // L: 10888
									}
								}

								if (class259.widgetDragDuration == 0) { // L: 10891
									Client.clickedWidget = null; // L: 10892
									Client.clickedWidgetParent = null; // L: 10893
								}

								if (!Client.isMenuOpen) { // L: 10895
									FloorOverlayDefinition.addCancelMenuEntry(); // L: 10896
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10900 10901
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10902
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 10903
									var27.remove(); // L: 10904
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10910
					var18 = MouseHandler.MouseHandler_y; // L: 10911
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10912
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10913
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10914
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10916
					if (var9.contentType == 1337) { // L: 10917
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 10918
							UserComparator6.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10921
						BufferedSource.checkIfMinimapClicked(var9, var26, var11); // L: 10922
					} else {
						if (var9.contentType == 1400) { // L: 10925
							Decimator.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 10926
						}

						if (!Client.isMenuOpen && var35) { // L: 10928
							if (var9.contentType == 1400) { // L: 10929
								Decimator.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 10930
							} else {
								TaskHandler.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 10933
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 10936
							for (int var20 = 0; var20 < var9.field3464.length; ++var20) { // L: 10937
								var21 = false; // L: 10938
								boolean var28 = false; // L: 10939
								if (!var21 && var9.field3464[var20] != null) { // L: 10940
									for (var29 = 0; var29 < var9.field3464[var20].length; ++var29) { // L: 10941
										boolean var24 = false; // L: 10942
										if (var9.field3544 != null) { // L: 10943
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3464[var20][var29]]; // L: 10944
										}

										if (UserComparator6.method2800(var9.field3464[var20][var29]) || var24) { // L: 10946
											var21 = true; // L: 10947
											if (var9.field3544 != null && var9.field3544[var20] > Client.cycle) { // L: 10948
												break;
											}

											byte var33 = var9.field3475[var20][var29]; // L: 10949
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10950 10951 10952 10953 10954
												var28 = true; // L: 10956
												break;
											}
										}
									}
								}

								if (var28) { // L: 10962
									if (var20 < 10) { // L: 10963
										ApproximateRouteStrategy.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10964
										class193.Widget_runOnTargetLeave(); // L: 10965
										class128.selectSpell(var9.id, var9.childIndex, SoundCache.Widget_unpackTargetMask(class97.getWidgetFlags(var9)), var9.itemId); // L: 10966
										Client.selectedSpellActionName = class67.Widget_getSpellActionName(var9); // L: 10967
										if (Client.selectedSpellActionName == null) { // L: 10968
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + SoundCache.colorStartTag(16777215); // L: 10969
									}

									var29 = var9.field3417[var20]; // L: 10971
									if (var9.field3544 == null) { // L: 10972
										var9.field3544 = new int[var9.field3464.length];
									}

									if (var9.field3477 == null) { // L: 10973
										var9.field3477 = new int[var9.field3464.length];
									}

									if (var29 != 0) { // L: 10974
										if (var9.field3544[var20] == 0) { // L: 10975
											var9.field3544[var20] = var29 + Client.cycle + var9.field3477[var20];
										} else {
											var9.field3544[var20] = var29 + Client.cycle; // L: 10976
										}
									} else {
										var9.field3544[var20] = Integer.MAX_VALUE; // L: 10978
									}
								}

								if (!var21 && var9.field3544 != null) { // L: 10980 10981
									var9.field3544[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10985
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10986
								var35 = true;
							} else {
								var35 = false; // L: 10987
							}

							boolean var36 = false; // L: 10988
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 10989
								var36 = true;
							}

							var21 = false; // L: 10990
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10991
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 10992
								AbstractByteArrayCopier.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 10993
								if (var9.type == 11 && var9.method5789(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) { // L: 10994
									switch(var9.method5817()) { // L: 10995
									case 0:
										CollisionMap.openURL(var9.method5815(), true, false); // L: 10997
										break;
									case 1:
										if (ItemComposition.method3909(class97.getWidgetFlags(var9))) { // L: 11000
											var22 = var9.method5835(); // L: 11001
											if (var22 != null) { // L: 11002
												PacketBufferNode var23 = class120.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher); // L: 11003
												var23.packetBuffer.writeIntLE(var22[0]); // L: 11004
												var23.packetBuffer.writeIntIME(var9.id); // L: 11005
												var23.packetBuffer.writeIntLE(var22[1]); // L: 11006
												var23.packetBuffer.writeShort(var9.childIndex); // L: 11007
												var23.packetBuffer.writeIntLE(var22[2]); // L: 11008
												var23.packetBuffer.writeIntLE(var9.method5839()); // L: 11009
												Client.packetWriter.addNode(var23); // L: 11010
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 11017
								Decimator.worldMap.method7391(var17, var18, var35 & var36, var35 & var21); // L: 11018
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && HealthBarDefinition.method3606(class97.getWidgetFlags(var9))) { // L: 11020
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11021
								Client.field683 = true; // L: 11022
								Client.field783 = var26; // L: 11023
								Client.field744 = var11; // L: 11024
							}

							if (var9.hasListener) { // L: 11026
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11027
									var37 = new ScriptEvent(); // L: 11028
									var37.isMouseInputEvent = true; // L: 11029
									var37.widget = var9; // L: 11030
									var37.mouseY = Client.mouseWheelRotation; // L: 11031
									var37.args = var9.onScroll; // L: 11032
									Client.scriptEvents.addFirst(var37); // L: 11033
								}

								if (Client.clickedWidget != null || User.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11035
									var21 = false; // L: 11036
									var36 = false; // L: 11037
									var35 = false; // L: 11038
								}

								if (!var9.isClicked && var21) { // L: 11040
									var9.isClicked = true; // L: 11041
									if (var9.onClick != null) { // L: 11042
										var37 = new ScriptEvent(); // L: 11043
										var37.isMouseInputEvent = true; // L: 11044
										var37.widget = var9; // L: 11045
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11046
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11047
										var37.args = var9.onClick; // L: 11048
										Client.scriptEvents.addFirst(var37); // L: 11049
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 11052 11053
									var37 = new ScriptEvent(); // L: 11054
									var37.isMouseInputEvent = true; // L: 11055
									var37.widget = var9; // L: 11056
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11057
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11058
									var37.args = var9.onClickRepeat; // L: 11059
									Client.scriptEvents.addFirst(var37); // L: 11060
								}

								if (var9.isClicked && !var36) { // L: 11063
									var9.isClicked = false; // L: 11064
									if (var9.onRelease != null) { // L: 11065
										var37 = new ScriptEvent(); // L: 11066
										var37.isMouseInputEvent = true; // L: 11067
										var37.widget = var9; // L: 11068
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11069
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11070
										var37.args = var9.onRelease; // L: 11071
										Client.field626.addFirst(var37); // L: 11072
									}
								}

								if (var36 && var9.onHold != null) { // L: 11075 11076
									var37 = new ScriptEvent(); // L: 11077
									var37.isMouseInputEvent = true; // L: 11078
									var37.widget = var9; // L: 11079
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11080
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11081
									var37.args = var9.onHold; // L: 11082
									Client.scriptEvents.addFirst(var37); // L: 11083
								}

								if (!var9.containsMouse && var35) { // L: 11086
									var9.containsMouse = true; // L: 11087
									if (var9.onMouseOver != null) { // L: 11088
										var37 = new ScriptEvent(); // L: 11089
										var37.isMouseInputEvent = true; // L: 11090
										var37.widget = var9; // L: 11091
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11092
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11093
										var37.args = var9.onMouseOver; // L: 11094
										Client.scriptEvents.addFirst(var37); // L: 11095
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11098 11099
									var37 = new ScriptEvent(); // L: 11100
									var37.isMouseInputEvent = true; // L: 11101
									var37.widget = var9; // L: 11102
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11103
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11104
									var37.args = var9.onMouseRepeat; // L: 11105
									Client.scriptEvents.addFirst(var37); // L: 11106
								}

								if (var9.containsMouse && !var35) { // L: 11109
									var9.containsMouse = false; // L: 11110
									if (var9.onMouseLeave != null) { // L: 11111
										var37 = new ScriptEvent(); // L: 11112
										var37.isMouseInputEvent = true; // L: 11113
										var37.widget = var9; // L: 11114
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11115
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11116
										var37.args = var9.onMouseLeave; // L: 11117
										Client.field626.addFirst(var37); // L: 11118
									}
								}

								if (var9.onTimer != null) { // L: 11121
									var37 = new ScriptEvent(); // L: 11122
									var37.widget = var9; // L: 11123
									var37.args = var9.onTimer; // L: 11124
									Client.field709.addFirst(var37); // L: 11125
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3539) { // L: 11127
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3539 <= 32) { // L: 11128
										label834:
										for (var40 = var9.field3539; var40 < Client.changedVarpCount; ++var40) { // L: 11135
											var29 = Client.changedVarps[var40 & 31]; // L: 11136

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 11137
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 11138
													var25 = new ScriptEvent(); // L: 11139
													var25.widget = var9; // L: 11140
													var25.args = var9.onVarTransmit; // L: 11141
													Client.scriptEvents.addFirst(var25); // L: 11142
													break label834; // L: 11143
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11129
										var37.widget = var9; // L: 11130
										var37.args = var9.onVarTransmit; // L: 11131
										Client.scriptEvents.addFirst(var37); // L: 11132
									}

									var9.field3539 = Client.changedVarpCount; // L: 11148
								}

								if (var9.onInvTransmit != null && Client.field694 > var9.field3540) { // L: 11150
									if (var9.invTransmitTriggers != null && Client.field694 - var9.field3540 <= 32) { // L: 11151
										label810:
										for (var40 = var9.field3540; var40 < Client.field694; ++var40) { // L: 11158
											var29 = Client.changedItemContainers[var40 & 31]; // L: 11159

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 11160
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 11161
													var25 = new ScriptEvent(); // L: 11162
													var25.widget = var9; // L: 11163
													var25.args = var9.onInvTransmit; // L: 11164
													Client.scriptEvents.addFirst(var25); // L: 11165
													break label810; // L: 11166
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11152
										var37.widget = var9; // L: 11153
										var37.args = var9.onInvTransmit; // L: 11154
										Client.scriptEvents.addFirst(var37); // L: 11155
									}

									var9.field3540 = Client.field694; // L: 11171
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3541) { // L: 11173
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3541 <= 32) { // L: 11174
										label786:
										for (var40 = var9.field3541; var40 < Client.changedSkillsCount; ++var40) { // L: 11181
											var29 = Client.changedSkills[var40 & 31]; // L: 11182

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 11183
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 11184
													var25 = new ScriptEvent(); // L: 11185
													var25.widget = var9; // L: 11186
													var25.args = var9.onStatTransmit; // L: 11187
													Client.scriptEvents.addFirst(var25); // L: 11188
													break label786; // L: 11189
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11175
										var37.widget = var9; // L: 11176
										var37.args = var9.onStatTransmit; // L: 11177
										Client.scriptEvents.addFirst(var37); // L: 11178
									}

									var9.field3541 = Client.changedSkillsCount; // L: 11194
								}

								if (Client.chatCycle > var9.field3538 && var9.onChatTransmit != null) { // L: 11196
									var37 = new ScriptEvent(); // L: 11197
									var37.widget = var9; // L: 11198
									var37.args = var9.onChatTransmit; // L: 11199
									Client.scriptEvents.addFirst(var37); // L: 11200
								}

								if (Client.field700 > var9.field3538 && var9.onFriendTransmit != null) { // L: 11202
									var37 = new ScriptEvent(); // L: 11203
									var37.widget = var9; // L: 11204
									var37.args = var9.onFriendTransmit; // L: 11205
									Client.scriptEvents.addFirst(var37); // L: 11206
								}

								if (Client.field701 > var9.field3538 && var9.onClanTransmit != null) { // L: 11208
									var37 = new ScriptEvent(); // L: 11209
									var37.widget = var9; // L: 11210
									var37.args = var9.onClanTransmit; // L: 11211
									Client.scriptEvents.addFirst(var37); // L: 11212
								}

								if (Client.field702 > var9.field3538 && var9.field3526 != null) { // L: 11214
									var37 = new ScriptEvent(); // L: 11215
									var37.widget = var9; // L: 11216
									var37.args = var9.field3526; // L: 11217
									Client.scriptEvents.addFirst(var37); // L: 11218
								}

								if (Client.field745 > var9.field3538 && var9.field3431 != null) { // L: 11220
									var37 = new ScriptEvent(); // L: 11221
									var37.widget = var9; // L: 11222
									var37.args = var9.field3431; // L: 11223
									Client.scriptEvents.addFirst(var37); // L: 11224
								}

								if (Client.field704 > var9.field3538 && var9.onStockTransmit != null) { // L: 11226
									var37 = new ScriptEvent(); // L: 11227
									var37.widget = var9; // L: 11228
									var37.args = var9.onStockTransmit; // L: 11229
									Client.scriptEvents.addFirst(var37); // L: 11230
								}

								if (Client.field705 > var9.field3538 && var9.field3452 != null) { // L: 11232
									var37 = new ScriptEvent(); // L: 11233
									var37.widget = var9; // L: 11234
									var37.args = var9.field3452; // L: 11235
									Client.scriptEvents.addFirst(var37); // L: 11236
								}

								if (Client.field706 > var9.field3538 && var9.onMiscTransmit != null) { // L: 11238
									var37 = new ScriptEvent(); // L: 11239
									var37.widget = var9; // L: 11240
									var37.args = var9.onMiscTransmit; // L: 11241
									Client.scriptEvents.addFirst(var37); // L: 11242
								}

								var9.field3538 = Client.cycleCntr; // L: 11244
								if (var9.onKey != null) { // L: 11245
									for (var40 = 0; var40 < Client.field529; ++var40) { // L: 11246
										ScriptEvent var38 = new ScriptEvent(); // L: 11247
										var38.widget = var9; // L: 11248
										var38.keyTyped = Client.field749[var40]; // L: 11249
										var38.keyPressed = Client.field731[var40]; // L: 11250
										var38.args = var9.onKey; // L: 11251
										Client.scriptEvents.addFirst(var38); // L: 11252
									}
								}

								ScriptEvent var32;
								if (var9.field3528 != null) { // L: 11255
									var22 = VerticalAlignment.method3664(); // L: 11256

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11257
										var32 = new ScriptEvent(); // L: 11258
										var32.widget = var9; // L: 11259
										var32.keyTyped = var22[var29]; // L: 11260
										var32.args = var9.field3528; // L: 11261
										Client.scriptEvents.addFirst(var32); // L: 11262
									}
								}

								if (var9.field3511 != null) { // L: 11265
									var22 = ClientPacket.method5341(); // L: 11266

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11267
										var32 = new ScriptEvent(); // L: 11268
										var32.widget = var9; // L: 11269
										var32.keyTyped = var22[var29]; // L: 11270
										var32.args = var9.field3511; // L: 11271
										Client.scriptEvents.addFirst(var32); // L: 11272
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11277
							if (Client.clickedWidget != null || User.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11278
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11279
								if (var9.mouseOverRedirect >= 0) { // L: 11280
									class148.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class148.mousedOverWidgetIf1 = var9; // L: 11281
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11283
								GrandExchangeEvent.field4105 = var9; // L: 11284
							}

							if (var9.scrollHeight > var9.height) { // L: 11286
								class10.method110(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11288
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11289
							if (var9.children != null) { // L: 11290
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11291
							if (var30 != null) { // L: 11292
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11293
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11294
										if (var31.isMouseInputEvent) { // L: 11295
											var31.remove(); // L: 11296
											var31.widget.containsMouse = false; // L: 11297
										}
									}

									if (class259.widgetDragDuration == 0) { // L: 11300
										Client.clickedWidget = null; // L: 11301
										Client.clickedWidgetParent = null; // L: 11302
									}

									if (!Client.isMenuOpen) { // L: 11304
										FloorOverlayDefinition.addCancelMenuEntry(); // L: 11305
									}
								}

								class259.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11308
							}
						}
					}
				}
			}
		}

	} // L: 11312
}
