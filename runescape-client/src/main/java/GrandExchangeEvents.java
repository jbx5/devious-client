import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("ay")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("an")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("au")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("ax")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("ab")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lvg;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "-2080507420"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1610694423"
	)
	public static boolean method7388(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class414.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-2081131744"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = null;
		if (var5 >= 0 && ConcurrentMidiTask.topLevelWorldView.worldEntities[var5] != null) {
			var10 = ConcurrentMidiTask.topLevelWorldView.worldEntities[var5].worldView;
		} else if (var5 == -1) {
			var10 = ConcurrentMidiTask.topLevelWorldView;
		}

		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			NPC[] var13 = var10.npcs;
			Player[] var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			if (var2 == 23) {
				if (Client.isMenuOpen) {
					ConcurrentMidiTask.topLevelWorldView.scene.method4108();
				} else {
					ConcurrentMidiTask.topLevelWorldView.scene.menuOpen(ConcurrentMidiTask.topLevelWorldView.plane, var0, var1, true);
				}

				for (int var15 = 0; var15 < ConcurrentMidiTask.topLevelWorldView.worldEntityCount; ++var15) {
					WorldEntity var16 = ConcurrentMidiTask.topLevelWorldView.worldEntities[ConcurrentMidiTask.topLevelWorldView.worldEntityIndices[var15]];
					if (var16 != null) {
						if (Client.isMenuOpen) {
							var16.worldView.scene.method4108();
						} else {
							var16.worldView.scene.menuOpen(var16.worldView.plane, var0, var1, true);
						}
					}
				}
			}

			NPC var18;
			PacketBufferNode var21;
			if (var2 == 12) {
				var18 = var13[var3];
				if (var18 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var21 = class218.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var21.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var21.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var21);
				}
			}

			Player var24;
			if (var2 == 44) {
				var24 = var14[var3];
				if (var24 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var21.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var21.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var21);
				}
			}

			if (var2 == 13) {
				var18 = var13[var3];
				if (var18 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var21 = class218.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var21.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var21);
				}
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
				class219.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
			}

			int var17;
			Widget var22;
			PacketBufferNode var25;
			if (var2 == 28) {
				var25 = class218.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var25);
				var22 = FloorUnderlayDefinition.widgetDefinition.method6544(var1);
				if (var22 != null && var22.cs1Instructions != null && var22.cs1Instructions[0][0] == 5) {
					var17 = var22.cs1Instructions[0][1];
					Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
					class59.changeGameOptions(var17);
				}
			}

			Widget var26;
			if (var2 == 57 || var2 == 1007) {
				var26 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var1, var0);
				if (var26 != null) {
					HttpRequestTask.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
				}
			}

			if (var2 == 22) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var25.packetBuffer.writeShort(var0 + var11);
				var25.packetBuffer.writeShortLE(var3);
				var25.packetBuffer.writeShortAddLE(var12 + var1);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var25.packetBuffer.writeShortAddLE(var12 + var1);
				var25.packetBuffer.writeShortAddLE(var0 + var11);
				var25.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 1002) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var25 = class218.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 18) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShort(var3);
				var25.packetBuffer.writeShort(var12 + var1);
				var25.packetBuffer.writeShort(var0 + var11);
				var25.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 1004) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var25 = class218.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShort(var12 + var1);
				var25.packetBuffer.writeShortAddLE(var3);
				var25.packetBuffer.writeShortLE(var0 + var11);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 17) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShort(var12 + var1);
				var25.packetBuffer.writeShortLE(Client.selectedSpellItemId);
				var25.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var25.packetBuffer.writeShortAdd(var3);
				var25.packetBuffer.writeShortLE(var0 + var11);
				var25.packetBuffer.writeIntLE(MenuAction.selectedSpellWidget);
				var25.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 16) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.field3292, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShortLE(class377.Players_count);
				var25.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var25.packetBuffer.writeShortAddLE(var0 + var11);
				var25.packetBuffer.writeInt(ConcurrentMidiTask.field4799);
				var25.packetBuffer.writeShortAdd(var12 + var1);
				var25.packetBuffer.writeShortAddLE(var3);
				var25.packetBuffer.writeShortAddLE(UrlRequester.field1463);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 26) {
				class60.method1145();
			}

			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.field3297, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShortAdd(var3);
				var25.packetBuffer.writeShortAdd(var12 + var1);
				var25.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var25.packetBuffer.writeIntLE(ConcurrentMidiTask.field4799);
				var25.packetBuffer.writeShortAdd(var0 + var11);
				var25.packetBuffer.writeShort(class377.Players_count);
				var25.packetBuffer.writeShortLE(UrlRequester.field1463);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var25.packetBuffer.writeShortLE(var3);
				var25.packetBuffer.writeShortAddLE(var0 + var11);
				var25.packetBuffer.writeShortLE(var12 + var1);
				Client.packetWriter.addNode(var25);
			}

			PacketBufferNode var19;
			if (var2 == 1003) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var18 = var13[var3];
				if (var18 != null) {
					NPCComposition var23 = var18.definition;
					if (var23.transforms != null) {
						var23 = var23.transform();
					}

					if (var23 != null) {
						var19 = class218.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
						var19.packetBuffer.writeShortAdd(var23.id);
						Client.packetWriter.addNode(var19);
					}
				}
			}

			if (var2 == 14) {
				var24 = var14[var3];
				if (var24 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var21 = class218.getPacketBufferNode(ClientPacket.field3260, Client.packetWriter.isaacCipher);
					var21.packetBuffer.writeShortAdd(UrlRequester.field1463);
					var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var21.packetBuffer.writeIntLE(ConcurrentMidiTask.field4799);
					var21.packetBuffer.writeShort(var3);
					var21.packetBuffer.writeShortAdd(class377.Players_count);
					Client.packetWriter.addNode(var21);
				}
			}

			if (var2 == 20) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var25 = class218.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
				var25.packetBuffer.writeShortAddLE(var3);
				var25.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var25.packetBuffer.writeShortLE(var12 + var1);
				var25.packetBuffer.writeShortAddLE(var0 + var11);
				Client.packetWriter.addNode(var25);
			}

			if (var2 == 47) {
				var24 = var14[var3];
				if (var24 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var21.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var21);
				}
			}

			if (var2 == 25) {
				var26 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var1, var0);
				if (var26 != null) {
					class141.method3259();
					class151.method3371(var1, var0, InvDefinition.Widget_unpackTargetMask(SpriteMask.getWidgetFlags(var26)), var4);
					Client.isItemSelected = 0;
					Client.selectedSpellActionName = RestClientThreadFactory.Widget_getSpellActionName(var26);
					if (Client.selectedSpellActionName == null) {
						Client.selectedSpellActionName = "null";
					}

					if (var26.isIf3) {
						Client.selectedSpellName = var26.dataText + TransformationMatrix.colorStartTag(16777215);
					} else {
						Client.selectedSpellName = TransformationMatrix.colorStartTag(65280) + var26.field3934 + TransformationMatrix.colorStartTag(16777215);
					}
				}

			} else {
				if (var2 == 11) {
					var18 = var13[var3];
					if (var18 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortLE(var3);
						var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 29) {
					var25 = class218.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeInt(var1);
					Client.packetWriter.addNode(var25);
					var22 = FloorUnderlayDefinition.widgetDefinition.method6544(var1);
					if (var22 != null && var22.cs1Instructions != null && var22.cs1Instructions[0][0] == 5) {
						var17 = var22.cs1Instructions[0][1];
						if (Varps.Varps_main[var17] != var22.cs1ComparisonValues[0]) {
							Varps.Varps_main[var17] = var22.cs1ComparisonValues[0];
							class59.changeGameOptions(var17);
						}
					}
				}

				if (var2 == 45) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortLE(var3);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 49) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var21.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 7) {
					var18 = var13[var3];
					if (var18 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.field3295, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShort(UrlRequester.field1463);
						var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var21.packetBuffer.writeShortAddLE(var3);
						var21.packetBuffer.writeIntLE(ConcurrentMidiTask.field4799);
						var21.packetBuffer.writeShortAddLE(class377.Players_count);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 46) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortAdd(var3);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 9) {
					var18 = var13[var3];
					if (var18 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var21.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 50) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var21.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 2) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var25 = class218.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var25.packetBuffer.writeIntME(MenuAction.selectedSpellWidget);
					var25.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
					var25.packetBuffer.writeShort(var3);
					var25.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var25.packetBuffer.writeShortLE(var12 + var1);
					var25.packetBuffer.writeShortAddLE(var0 + var11);
					Client.packetWriter.addNode(var25);
				}

				if (var2 == 15) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortAdd(var3);
						var21.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var21.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var21.packetBuffer.writeInt(MenuAction.selectedSpellWidget);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 21) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var25 = class218.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var25.packetBuffer.writeShortLE(var3);
					var25.packetBuffer.writeShortAddLE(var12 + var1);
					var25.packetBuffer.writeShort(var0 + var11);
					Client.packetWriter.addNode(var25);
				}

				if (var2 == 30 && Client.meslayerContinueWidget == null) {
					SecureRandomCallable.resumePauseWidget(var1, var0);
					Client.meslayerContinueWidget = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var1, var0);
					class416.invalidateWidget(Client.meslayerContinueWidget);
				}

				if (var2 == 5) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var25 = class218.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeShortAdd(var12 + var1);
					var25.packetBuffer.writeShortAddLE(var3);
					var25.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var25.packetBuffer.writeShortAddLE(var0 + var11);
					Client.packetWriter.addNode(var25);
				}

				if (var2 == 51) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var21.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 4) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var25 = class218.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeShortAddLE(var0 + var11);
					var25.packetBuffer.writeShort(var12 + var1);
					var25.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var25.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var25);
				}

				if (var2 == 48) {
					var24 = var14[var3];
					if (var24 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortAdd(var3);
						var21.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 58) {
					var26 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var1, var0);
					if (var26 != null) {
						if (var26.field3913 != null) {
							ScriptEvent var27 = new ScriptEvent();
							var27.widget = var26;
							var27.opIndex = var3;
							var27.targetName = var7;
							var27.args = var26.field3913;
							class421.runScriptEvent(var27);
						}

						var21 = class218.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var21.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var21.packetBuffer.writeShortLE(var0);
						var21.packetBuffer.writeShort(var4);
						var21.packetBuffer.writeIntIME(var1);
						var21.packetBuffer.writeIntLE(MenuAction.selectedSpellWidget);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 24) {
					var26 = FloorUnderlayDefinition.widgetDefinition.method6544(var1);
					if (var26 != null) {
						boolean var20 = true;
						if (var26.contentType > 0) {
							var20 = NPCComposition.method4964(var26);
						}

						if (var20) {
							var19 = class218.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
							var19.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var19);
						}
					}
				}

				if (var2 == 8) {
					var18 = var13[var3];
					if (var18 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShort(var3);
						var21.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var21.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var21.packetBuffer.writeIntLE(MenuAction.selectedSpellWidget);
						var21.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var21);
					}
				}

				if (var2 == 19) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var25 = class218.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeShortAdd(var3);
					var25.packetBuffer.writeShortLE(var0 + var11);
					var25.packetBuffer.writeShort(var12 + var1);
					var25.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var25);
				}

				if (var2 == 1001) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var25 = class218.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
					var25.packetBuffer.writeShortAddLE(var0 + var11);
					var25.packetBuffer.writeShortAddLE(var12 + var1);
					var25.packetBuffer.writeShortAddLE(var3);
					var25.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var25);
				}

				if (var2 == 10) {
					var18 = var13[var3];
					if (var18 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var21 = class218.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var21.packetBuffer.writeShortAddLE(var3);
						var21.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var21);
					}
				}

				if (Client.isItemSelected != 0) {
					Client.isItemSelected = 0;
					class416.invalidateWidget(FloorUnderlayDefinition.widgetDefinition.method6544(ConcurrentMidiTask.field4799));
				}

				if (Client.isSpellSelected) {
					class141.method3259();
				}

			}
		}
	}
}
