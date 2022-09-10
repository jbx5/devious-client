import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mo")
public class class343 {
	@ObfuscatedName("c")
	static char[] field4188;
	@ObfuscatedName("p")
	static char[] field4187;
	@ObfuscatedName("f")
	static char[] field4186;
	@ObfuscatedName("n")
	static int[] field4189;

	static {
		field4188 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4188[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4188[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4188[var0] = (char)(var0 + 48 - 52);
		}

		field4188[62] = '+'; // L: 11
		field4188[63] = '/'; // L: 12
		field4187 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4187[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4187[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4187[var0] = (char)(var0 + 48 - 52);
		}

		field4187[62] = '*'; // L: 22
		field4187[63] = '-'; // L: 23
		field4186 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4186[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4186[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4186[var0] = (char)(var0 + 48 - 52);
		}

		field4186[62] = '-'; // L: 33
		field4186[63] = '_'; // L: 34
		field4189 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4189.length; ++var0) { // L: 41
			field4189[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4189[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4189[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4189[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4189; // L: 45
		field4189[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4189; // L: 48
		field4189[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-1540107780"
	)
	static int method6445(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1454
			var7 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1455
			class65.addGameMessage(0, "", var7); // L: 1456
			return 1; // L: 1457
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1460
			class120.performPlayerAnimation(class67.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1461
			return 1; // L: 1462
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field833) { // L: 1465
				Interpreter.field843 = true; // L: 1466
			}

			return 1; // L: 1468
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1471
				var16 = 0; // L: 1472
				if (class151.isNumber(var7)) { // L: 1473
					var16 = MidiPcmStream.method5532(var7);
				}

				PacketBufferNode var14 = class120.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, Client.packetWriter.isaacCipher); // L: 1475
				var14.packetBuffer.writeInt(var16); // L: 1476
				Client.packetWriter.addNode(var14); // L: 1477
				return 1; // L: 1478
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1481
					var12 = class120.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher); // L: 1483
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1484
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1485
					Client.packetWriter.addNode(var12); // L: 1486
					return 1; // L: 1487
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1490
					var12 = class120.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher); // L: 1492
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1493
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1494
					Client.packetWriter.addNode(var12); // L: 1495
					return 1; // L: 1496
				} else {
					int var3;
					String var11;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1499
						var11 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1500
						PacketWriter.method2674(var3, var11); // L: 1501
						return 1; // L: 1502
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1505
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1506
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1507
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1508
						Widget var15 = SpotAnimationDefinition.getWidget(var9); // L: 1509
						AbstractByteArrayCopier.clickWidget(var15, var3, var16); // L: 1510
						return 1; // L: 1511
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1514
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1515
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1516
						Widget var13 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1517
						AbstractByteArrayCopier.clickWidget(var13, var3, var16); // L: 1518
						return 1; // L: 1519
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Renderable.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1522
						return 1; // L: 1523
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.clientPreferences.method2452() ? 1 : 0; // L: 1526
						return 1; // L: 1527
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Player.clientPreferences.method2412(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1530
						return 1; // L: 1531
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1534
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1535
						CollisionMap.openURL(var7, var8, false); // L: 1536
						return 1; // L: 1537
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1540
						var12 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher); // L: 1542
						var12.packetBuffer.writeShort(var3); // L: 1543
						Client.packetWriter.addNode(var12); // L: 1544
						return 1; // L: 1545
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1548
						VarbitComposition.Interpreter_stringStackSize -= 2; // L: 1549
						var11 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize]; // L: 1550
						String var5 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1]; // L: 1551
						if (var11.length() > 500) { // L: 1552
							return 1;
						} else if (var5.length() > 500) { // L: 1553
							return 1;
						} else {
							PacketBufferNode var6 = class120.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher); // L: 1554
							var6.packetBuffer.writeShort(1 + class357.stringCp1252NullTerminatedByteSize(var11) + class357.stringCp1252NullTerminatedByteSize(var5)); // L: 1555
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1556
							var6.packetBuffer.writeByte(var3); // L: 1557
							var6.packetBuffer.writeStringCp1252NullTerminated(var11); // L: 1558
							Client.packetWriter.addNode(var6); // L: 1559
							return 1; // L: 1560
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1563
						return 1; // L: 1564
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1567
						return 1; // L: 1568
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1571
						return 1; // L: 1572
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1575
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1576
						}

						return 1; // L: 1577
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1580
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1581
						}

						return 1; // L: 1582
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1585
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1586
						}

						return 1; // L: 1587
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1590
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1591
						}

						return 1; // L: 1592
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1595
						return 1; // L: 1596
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1599
						return 1; // L: 1600
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1603
						return 1; // L: 1604
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Canvas.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1607
						return 1; // L: 1608
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class271.getTapToDrop() ? 1 : 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1615
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1616
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1617
						return 1; // L: 1618
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1621
						return 1; // L: 1622
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 1625
						return 1; // L: 1626
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class123.canvasWidth; // L: 1629
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class166.canvasHeight; // L: 1630
						return 1; // L: 1631
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 1634
						return 1; // L: 1635
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1638
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1641
						return 1; // L: 1642
					} else if (var0 == 3136) {
						Client.field593 = 3; // L: 1645
						Client.field668 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1646
						return 1; // L: 1647
					} else if (var0 == 3137) {
						Client.field593 = 2; // L: 1650
						Client.field668 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1651
						return 1; // L: 1652
					} else if (var0 == 3138) {
						Client.field593 = 0; // L: 1655
						return 1; // L: 1656
					} else if (var0 == 3139) {
						Client.field593 = 1; // L: 1659
						return 1; // L: 1660
					} else if (var0 == 3140) {
						Client.field593 = 3; // L: 1663
						Client.field668 = var2 ? TextureProvider.scriptDotWidget.id : MenuAction.scriptActiveWidget.id; // L: 1664
						return 1; // L: 1665
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1668
							Player.clientPreferences.method2390(var10); // L: 1669
							return 1; // L: 1670
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.clientPreferences.method2397() ? 1 : 0; // L: 1673
							return 1; // L: 1674
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1677
							Client.Login_isUsernameRemembered = var10; // L: 1678
							if (!var10) { // L: 1679
								Player.clientPreferences.method2406(""); // L: 1680
							}

							return 1; // L: 1682
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1685
							return 1; // L: 1686
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1689
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1692
							Player.clientPreferences.method2392(!var10); // L: 1693
							return 1; // L: 1694
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.clientPreferences.method2393() ? 0 : 1; // L: 1697
							return 1; // L: 1698
						} else if (var0 == 3148) {
							return 1; // L: 1701
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1704
							return 1; // L: 1705
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1708
							return 1; // L: 1709
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1712
							return 1; // L: 1713
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1716
							return 1; // L: 1717
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class128.method3003(); // L: 1724
							return 1; // L: 1725
						} else if (var0 == 3155) {
							--VarbitComposition.Interpreter_stringStackSize; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3156) {
							return 1; // L: 1732
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1735
							return 1; // L: 1736
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1739
							return 1; // L: 1740
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1743
							return 1; // L: 1744
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1747
							return 1; // L: 1748
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 1751
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1752
							return 1; // L: 1753
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 1756
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1757
							return 1; // L: 1758
						} else if (var0 == 3163) {
							--VarbitComposition.Interpreter_stringStackSize; // L: 1761
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1762
							return 1; // L: 1763
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 1766
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1767
							return 1; // L: 1768
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 1771
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1772
							return 1; // L: 1773
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1776
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1777
							return 1; // L: 1778
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1781
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1782
							return 1; // L: 1783
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1786
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1787
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1788
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1789
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1790
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1791
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1792
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1793
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1794
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1795
							return 1; // L: 1796
						} else if (var0 == 3169) {
							return 1; // L: 1799
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1802
							return 1; // L: 1803
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1806
							return 1; // L: 1807
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 1810
							return 1; // L: 1811
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 1814
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1815
							return 1; // L: 1816
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 1819
							return 1; // L: 1820
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1823
							return 1; // L: 1824
						} else if (var0 == 3176) {
							return 1; // L: 1827
						} else if (var0 == 3177) {
							return 1; // L: 1830
						} else if (var0 == 3178) {
							--VarbitComposition.Interpreter_stringStackSize; // L: 1833
							return 1; // L: 1834
						} else if (var0 == 3179) {
							return 1; // L: 1837
						} else if (var0 == 3180) {
							--VarbitComposition.Interpreter_stringStackSize; // L: 1840
							return 1; // L: 1841
						} else if (var0 == 3181) {
							GrandExchangeOfferOwnWorldComparator.method1174(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1844
							return 1; // L: 1845
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator5.method2751(); // L: 1848
							return 1; // L: 1849
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1852
							SequenceDefinition var4 = class4.SequenceDefinition_get(var3); // L: 1853
							if (var4.isCachedModelIdSet()) { // L: 1854
								ItemComposition.method3910(var4.SequenceDefinition_cachedModelId); // L: 1855
							}

							return 1; // L: 1857
						} else {
							return 2; // L: 1859
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1039741684"
	)
	static void method6444() {
		Client.packetWriter.clearBuffer(); // L: 2646
		Client.packetWriter.packetBuffer.offset = 0; // L: 2647
		Client.packetWriter.serverPacket = null; // L: 2648
		Client.packetWriter.field1348 = null; // L: 2649
		Client.packetWriter.field1350 = null; // L: 2650
		Client.packetWriter.field1345 = null; // L: 2651
		Client.packetWriter.serverPacketLength = 0; // L: 2652
		Client.packetWriter.field1349 = 0; // L: 2653
		Client.rebootTimer = 0; // L: 2654
		AbstractWorldMapIcon.method5183(); // L: 2655
		Client.minimapState = 0; // L: 2656
		Client.destinationX = 0; // L: 2657

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2658
			Client.players[var0] = null;
		}

		class67.localPlayer = null; // L: 2659

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2660
			NPC var1 = Client.npcs[var0]; // L: 2661
			if (var1 != null) { // L: 2662
				var1.targetIndex = -1; // L: 2663
				var1.false0 = false; // L: 2664
			}
		}

		class33.method640(); // L: 2667
		Coord.updateGameState(30); // L: 2668

		for (var0 = 0; var0 < 100; ++var0) { // L: 2669
			Client.field714[var0] = true;
		}

		PacketBufferNode var2 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher); // L: 2672
		var2.packetBuffer.writeByte(SceneTilePaint.getWindowedMode()); // L: 2673
		var2.packetBuffer.writeShort(class123.canvasWidth); // L: 2674
		var2.packetBuffer.writeShort(class166.canvasHeight); // L: 2675
		Client.packetWriter.addNode(var2); // L: 2676
	} // L: 2678
}
