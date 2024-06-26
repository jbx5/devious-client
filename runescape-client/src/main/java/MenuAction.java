import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = -363728951
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2062474031
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1267834327
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 891244755
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -214451643
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1511342341
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -919022825
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("aj")
	@Export("action")
	String action;
	@ObfuscatedName("av")
	@Export("target")
	String target;

	MenuAction() {
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-37"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = null;
		if (var5 >= 0 && class511.topLevelWorldView.worldEntities[var5] != null) {
			var10 = class511.topLevelWorldView.worldEntities[var5].worldView;
		} else if (var5 == -1) {
			var10 = class511.topLevelWorldView;
		}

		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			NPC[] var13 = var10.npcs;
			Player[] var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			PacketBufferNode var15;
			if (var2 == 1002) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var15);
			}

			PacketBufferNode var16;
			NPC var21;
			if (var2 == 7) {
				var21 = var13[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.field3295, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeInt(HttpResponse.field94);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShort(class328.field3560);
					var16.packetBuffer.writeShortAdd(class30.Players_count);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 17) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeInt(Message.selectedSpellWidget);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeShort(var0 + var11);
				Client.packetWriter.addNode(var15);
			}

			Player var22;
			if (var2 == 50) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 23) {
				if (Client.isMenuOpen) {
					class511.topLevelWorldView.scene.method5470();
				} else {
					class511.topLevelWorldView.scene.menuOpen(class511.topLevelWorldView.plane, var0, var1, true);
				}

				for (int var18 = 0; var18 < class511.topLevelWorldView.worldEntityCount; ++var18) {
					WorldEntity var23 = class511.topLevelWorldView.worldEntities[class511.topLevelWorldView.worldEntityIndices[var18]];
					if (var23 != null) {
						if (Client.isMenuOpen) {
							var23.worldView.scene.method5470();
						} else {
							var23.worldView.scene.menuOpen(var23.worldView.plane, var0, var1, true);
						}
					}
				}
			}

			if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 9) {
				var21 = var13[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 44) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 22) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortLE(var0 + var11);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 48) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 15) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShort(Client.selectedSpellItemId);
					var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
					var16.packetBuffer.writeShort(var3);
					var16.packetBuffer.writeIntIME(Message.selectedSpellWidget);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.field3363, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShortLE(class30.Players_count);
				var15.packetBuffer.writeInt(HttpResponse.field94);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeShortAdd(class328.field3560);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 51) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortLE(var3);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 1004) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var15 = class170.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 47) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 14) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.field3318, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShort(class30.Players_count);
					var16.packetBuffer.writeShort(class328.field3560);
					var16.packetBuffer.writeInt(HttpResponse.field94);
					var16.packetBuffer.writeShortAdd(var3);
					var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			int var17;
			Widget var24;
			if (var2 == 29) {
				var15 = class170.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var15);
				var24 = ModeWhere.widgetDefinition.method6519(var1);
				if (var24 != null && var24.cs1Instructions != null && var24.cs1Instructions[0][0] == 5) {
					var17 = var24.cs1Instructions[0][1];
					if (Varps.Varps_main[var17] != var24.cs1ComparisonValues[0]) {
						Varps.Varps_main[var17] = var24.cs1ComparisonValues[0];
						SecureRandomFuture.changeGameOptions(var17);
					}
				}
			}

			if (var2 == 20) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 49) {
				var22 = var14[var3];
				if (var22 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 13) {
				var21 = var13[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeShortAddLE(var3);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 19) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			}

			Widget var27;
			if (var2 == 57 || var2 == 1007) {
				var27 = ModeWhere.widgetDefinition.getWidgetChild(var1, var0);
				if (var27 != null) {
					SongTask.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
				}
			}

			if (var2 == 58) {
				var27 = ModeWhere.widgetDefinition.getWidgetChild(var1, var0);
				if (var27 != null) {
					if (var27.field3939 != null) {
						ScriptEvent var25 = new ScriptEvent();
						var25.widget = var27;
						var25.opIndex = var3;
						var25.targetName = var7;
						var25.args = var27.field3939;
						Projectile.runScriptEvent(var25);
					}

					var16 = class170.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeIntME(Message.selectedSpellWidget);
					var16.packetBuffer.writeIntIME(var1);
					var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
					var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var16.packetBuffer.writeShortAddLE(var0);
					var16.packetBuffer.writeShortAdd(var4);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 18) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var0 + var11);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 1001) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}

			PacketBufferNode var20;
			if (var2 == 24) {
				var27 = ModeWhere.widgetDefinition.method6519(var1);
				if (var27 != null) {
					boolean var19 = true;
					if (var27.contentType > 0) {
						var19 = class155.method3331(var27);
					}

					if (var19) {
						var20 = class170.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
						var20.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var20);
					}
				}
			}

			if (var2 == 1003) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var21 = var13[var3];
				if (var21 != null) {
					NPCComposition var26 = var21.definition;
					if (var26.transforms != null) {
						var26 = var26.transform();
					}

					if (var26 != null) {
						var20 = class170.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
						var20.packetBuffer.writeShortAdd(var26.id);
						Client.packetWriter.addNode(var20);
					}
				}
			}

			if (var2 == 12) {
				var21 = var13[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var16 = class170.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var16.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var16);
				}
			}

			if (var2 == 16) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.field3306, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(class30.Players_count);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeInt(HttpResponse.field94);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortLE(class328.field3560);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
				VertexNormal.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
			}

			if (var2 == 26) {
				class109.method2818();
			}

			if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class170.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeIntLE(Message.selectedSpellWidget);
				var15.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 25) {
				var27 = ModeWhere.widgetDefinition.getWidgetChild(var1, var0);
				if (var27 != null) {
					Canvas.method322();
					Projection.method5744(var1, var0, BoundaryObject.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var27)), var4);
					Client.isItemSelected = 0;
					Client.selectedSpellActionName = class142.Widget_getSpellActionName(var27);
					if (Client.selectedSpellActionName == null) {
						Client.selectedSpellActionName = "null";
					}

					if (var27.isIf3) {
						Client.selectedSpellName = var27.dataText + NpcOverrides.colorStartTag(16777215);
					} else {
						Client.selectedSpellName = NpcOverrides.colorStartTag(65280) + var27.field3960 + NpcOverrides.colorStartTag(16777215);
					}
				}

			} else {
				if (var2 == 45) {
					var22 = var14[var3];
					if (var22 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				}

				if (var2 == 21) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class170.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var15.packetBuffer.writeShortAdd(var0 + var11);
					var15.packetBuffer.writeShortAdd(var12 + var1);
					var15.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 8) {
					var21 = var13[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class170.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeInt(Message.selectedSpellWidget);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				}

				if (var2 == 10) {
					var21 = var13[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class170.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				}

				if (var2 == 28) {
					var15 = class170.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeInt(var1);
					Client.packetWriter.addNode(var15);
					var24 = ModeWhere.widgetDefinition.method6519(var1);
					if (var24 != null && var24.cs1Instructions != null && var24.cs1Instructions[0][0] == 5) {
						var17 = var24.cs1Instructions[0][1];
						Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
						SecureRandomFuture.changeGameOptions(var17);
					}
				}

				if (var2 == 30 && Client.meslayerContinueWidget == null) {
					ClanSettings.resumePauseWidget(var1, var0);
					Client.meslayerContinueWidget = ModeWhere.widgetDefinition.getWidgetChild(var1, var0);
					TriBool.invalidateWidget(Client.meslayerContinueWidget);
				}

				if (var2 == 11) {
					var21 = var13[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class170.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				}

				if (var2 == 46) {
					var22 = var14[var3];
					if (var22 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class170.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				}

				if (Client.isItemSelected != 0) {
					Client.isItemSelected = 0;
					TriBool.invalidateWidget(ModeWhere.widgetDefinition.method6519(HttpResponse.field94));
				}

				if (Client.isSpellSelected) {
					Canvas.method322();
				}

			}
		}
	}
}
