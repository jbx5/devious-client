import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class31 {
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -729686907
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("am")
	public static Applet field163;
	@ObfuscatedName("ap")
	public static String field161;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("bh")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1289889713
	)
	static int field168;

	static {
		field163 = null;
		field161 = "";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lag;",
		garbageValue = "-2066796076"
	)
	public static class6[] method467() {
		return new class6[]{class6.field8};
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdn;I)V",
		garbageValue = "-1065598634"
	)
	static void method466(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = class137.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = Tiles.Tiles_heights[var0];
		int var22 = var21[var18][var20] + var21[var17][var19] + var21[var18][var19] + var21[var17][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			class482.method8736(var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field1108 = var1 * 128 + var15 * 64;
			var13.field1120 = var2 * 128 + var16 * 64;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "90"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		Widget var15;
		if (var2 == 25) {
			var15 = class380.widgetDefinition.getWidgetChild(var1, var0);
			if (var15 != null) {
				ArchiveDiskActionHandler.method6981();
				Timer.method8063(var1, var0, class155.Widget_unpackTargetMask(class405.getWidgetFlags(var15)), var4);
				Client.isItemSelected = 0;
				Client.selectedSpellActionName = FontName.Widget_getSpellActionName(var15);
				if (Client.selectedSpellActionName == null) {
					Client.selectedSpellActionName = "null";
				}

				if (var15.isIf3) {
					Client.selectedSpellName = var15.dataText + class208.colorStartTag(16777215);
				} else {
					Client.selectedSpellName = class208.colorStartTag(65280) + var15.field3830 + class208.colorStartTag(16777215);
				}
			}

		} else {
			Player var9;
			PacketBufferNode var10;
			if (var2 == 47) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
				GrandExchangeOfferUnitPriceComparator.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
			}

			PacketBufferNode var14;
			if (var2 == 3) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortAddLE(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 14) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.field3228, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAddLE(var3);
					var10.packetBuffer.writeShortAddLE(Decimator.field404);
					var10.packetBuffer.writeShortAdd(PlayerType.field4320);
					var10.packetBuffer.writeInt(KeyHandler.field131);
					var10.packetBuffer.writeByteAdd(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 57 || var2 == 1007) {
				var15 = class380.widgetDefinition.getWidgetChild(var1, var0);
				if (var15 != null) {
					class59.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
				}
			}

			if (var2 == 1001) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByteAdd(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortLE(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShort(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 58) {
				var15 = class380.widgetDefinition.getWidgetChild(var1, var0);
				if (var15 != null) {
					if (var15.field3809 != null) {
						ScriptEvent var16 = new ScriptEvent();
						var16.widget = var15;
						var16.opIndex = var3;
						var16.targetName = var6;
						var16.args = var15.field3809;
						WorldMapSectionType.runScriptEvent(var16);
					}

					var10 = class482.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeIntIME(var1);
					var10.packetBuffer.writeShortAddLE(var0);
					var10.packetBuffer.writeIntLE(ModelData0.selectedSpellWidget);
					var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeShort(Client.selectedSpellItemId);
					var10.packetBuffer.writeShortAddLE(var4);
					Client.packetWriter.addNode(var10);
				}
			}

			int var11;
			Widget var17;
			if (var2 == 29) {
				var14 = class482.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var14);
				var17 = class380.widgetDefinition.method6348(var1);
				if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) {
					var11 = var17.cs1Instructions[0][1];
					if (Varps.Varps_main[var11] != var17.cs1ComparisonValues[0]) {
						Varps.Varps_main[var11] = var17.cs1ComparisonValues[0];
						class136.changeGameOptions(var11);
					}
				}
			}

			if (var2 == 16) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.field3242, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(var3);
				var14.packetBuffer.writeShortAdd(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeIntME(KeyHandler.field131);
				var14.packetBuffer.writeShortAdd(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShortAddLE(PlayerType.field4320);
				var14.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortLE(Decimator.field404);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 46) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 49) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShort(var3);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) {
				Occluder.resumePauseWidget(var1, var0);
				Client.meslayerContinueWidget = class380.widgetDefinition.getWidgetChild(var1, var0);
				FaceNormal.invalidateWidget(Client.meslayerContinueWidget);
			}

			if (var2 == 5) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAddLE(var3);
				var14.packetBuffer.writeShortLE(HealthBarDefinition.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 17) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeIntLE(ModelData0.selectedSpellWidget);
				var14.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeShortAddLE(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShort(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 48) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShort(var3);
					var10.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			NPC var18;
			if (var2 == 13) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteAdd(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 18) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeShortAdd(HealthBarDefinition.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 15) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortLE(Client.selectedSpellItemId);
					var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeIntIME(ModelData0.selectedSpellWidget);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 22) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeShortLE(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShortLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 1002) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 10) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAddLE(var3);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 6) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAdd(HealthBarDefinition.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 2) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeIntLE(ModelData0.selectedSpellWidget);
				var14.packetBuffer.writeShort(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShortLE(Client.selectedSpellItemId);
				var14.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 8) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShort(var3);
					var10.packetBuffer.writeIntLE(ModelData0.selectedSpellWidget);
					var10.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
					var10.packetBuffer.writeByteAdd(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 20) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeShortAdd(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 11) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAdd(var3);
					var10.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 28) {
				var14 = class482.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var14);
				var17 = class380.widgetDefinition.method6348(var1);
				if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) {
					var11 = var17.cs1Instructions[0][1];
					Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
					class136.changeGameOptions(var11);
				}
			}

			if (var2 == 19) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAdd(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShortLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShort(var3);
				var14.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 23) {
				if (Client.isMenuOpen) {
					GrandExchangeOfferOwnWorldComparator.scene.setViewportWalking();
				} else {
					GrandExchangeOfferOwnWorldComparator.scene.menuOpen(SecureUrlRequester.Client_plane, var0, var1, true);
				}
			}

			PacketBufferNode var12;
			if (var2 == 1003) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var18 = Client.npcs[var3];
				if (var18 != null) {
					NPCComposition var19 = var18.definition;
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 != null) {
						var12 = class482.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShortAddLE(var19.id);
						Client.packetWriter.addNode(var12);
					}
				}
			}

			if (var2 == 7) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.field3212, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAddLE(PlayerType.field4320);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeIntME(KeyHandler.field131);
					var10.packetBuffer.writeShortLE(Decimator.field404);
					var10.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 26) {
				class47.method910();
			}

			if (var2 == 1004) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeShortAdd(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAddLE(HealthBarDefinition.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 12) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 51) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortLE(var3);
					var10.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 44) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAddLE(var3);
					var10.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 9) {
				var18 = Client.npcs[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 24) {
				var15 = class380.widgetDefinition.method6348(var1);
				if (var15 != null) {
					boolean var13 = true;
					if (var15.contentType > 0) {
						var13 = Coord.method6334(var15);
					}

					if (var13) {
						var12 = class482.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var12);
					}
				}
			}

			if (var2 == 45) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
					var10.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 50) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class482.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShort(var3);
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 1) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(PlayerType.field4320);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeIntLE(KeyHandler.field131);
				var14.packetBuffer.writeByteSub(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortLE(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeShort(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAddLE(Decimator.field404);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 4) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeShortAddLE(HealthBarDefinition.baseX * 64 + var0);
				var14.packetBuffer.writeByteAdd(Client.field661.method4426(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 21) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class482.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(var3);
				var14.packetBuffer.writeShortAddLE(WorldMapScaleHandler.baseY * 64 + var1);
				var14.packetBuffer.writeByteNeg(Client.field661.method4426(82) ? 1 : 0);
				var14.packetBuffer.writeShortAdd(HealthBarDefinition.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				FaceNormal.invalidateWidget(class380.widgetDefinition.method6348(KeyHandler.field131));
			}

			if (Client.isSpellSelected) {
				ArchiveDiskActionHandler.method6981();
			}

		}
	}
}
