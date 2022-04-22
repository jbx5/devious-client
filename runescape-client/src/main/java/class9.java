import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class9 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lo;")

	static final class9 field28;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lo;")

	public static final class9 field37;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lo;")

	static final class9 field38;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lo;")

	static final class9 field29;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lo;")

	static final class9 field30;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1242087125)

	static int field35;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1758617613)

	int field31;
	@ObfuscatedName("s")
	String field32;
	@ObfuscatedName("l")
	boolean field27;
	@ObfuscatedName("q")
	boolean field34;
	static 
	{
		field28 = new class9(0, "POST", true, true);
		field37 = new class9(1, "GET", true, false);
		field38 = new class9(2, "PUT", false, true);
		field29 = new class9(3, "PATCH", false, true);
		field30 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field31 = var1;
		this.field32 = var2;
		this.field27 = var3;
		this.field34 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field31;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(S)Z", garbageValue = 
	"5017")

	boolean method63() {
		return this.field27;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1928506926")

	String method62() {
		return this.field32;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"905166088")

	boolean method66() {
		return this.field34;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(ZZI)Lqq;", garbageValue = 
	"1901588068")

	static IndexedSprite method73(boolean var0, boolean var1) {
		return var0 ? var1 ? ParamComposition.field1983 : class54.options_buttons_2Sprite : var1 ? class93.field1254 : WorldMapSection2.options_buttons_0Sprite;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(descriptor = 
	"(IIIILjava/lang/String;Ljava/lang/String;III)V", garbageValue = 
	"1522440534")

	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortLE(class432.selectedItemSlot);
			var8.packetBuffer.writeShortLE(Varcs.selectedItemId);
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeIntME(TaskHandler.selectedItemWidget);
			var8.packetBuffer.writeShortAdd(VarcInt.baseY + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortAddLE(VarcInt.baseY + var1);
			var8.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
			var8.packetBuffer.writeShortAdd(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
			var8.packetBuffer.writeIntME(Timer.selectedSpellWidget);
			var8.packetBuffer.writeShortLE(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortAdd(VarcInt.baseY + var1);
			var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(VarcInt.baseY + var1);
			var8.packetBuffer.writeShortAddLE(var3);
			var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortAdd(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
			var8.packetBuffer.writeShort(VarcInt.baseY + var1);
			var8.packetBuffer.writeShortAdd(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortAddLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
			var8.packetBuffer.writeShortAdd(var3);
			var8.packetBuffer.writeShortAdd(VarcInt.baseY + var1);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.writeIntIME(TaskHandler.selectedItemWidget);
					var9.packetBuffer.writeShortAddLE(Varcs.selectedItemId);
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortAdd(class432.selectedItemSlot);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.writeIntLE(Timer.selectedSpellWidget);
					var9.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAddLE(Varcs.selectedItemId);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeShortAdd(class432.selectedItemSlot);
						var9.packetBuffer.writeIntIME(TaskHandler.selectedItemWidget);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
						var9.packetBuffer.writeShortAdd(var3);
						var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeInt(Timer.selectedSpellWidget);
						var9.packetBuffer.writeShort(Client.selectedSpellItemId);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAdd(class432.selectedItemSlot);
					var8.packetBuffer.writeShortAdd(var3);
					var8.packetBuffer.writeShortAdd(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					var8.packetBuffer.writeShortAddLE(VarcInt.baseY + var1);
					var8.packetBuffer.writeIntIME(TaskHandler.selectedItemWidget);
					var8.packetBuffer.writeShort(Varcs.selectedItemId);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(Client.selectedSpellItemId);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortLE(var3);
					var8.packetBuffer.writeInt(Timer.selectedSpellWidget);
					var8.packetBuffer.writeShort(VarcInt.baseY + var1);
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeShortAdd(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAddLE(var3);
					var8.packetBuffer.writeShort(VarcInt.baseY + var1);
					var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(VarcInt.baseY + var1);
					var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAdd(VarcInt.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					var8.packetBuffer.writeShortAddLE(VarcInt.baseY + var1);
					var8.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAddLE(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
					var8.packetBuffer.writeShortLE(VarcInt.baseY + var1);
					var8.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						ArchiveLoader.scene.setViewportWalking();
					} else {
						ArchiveLoader.scene.menuOpen(class18.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = class127.getWidget(var1);
						if (var16 != null) {
							boolean var11 = true;
							if (var16.contentType > 0) {
								var11 = ModeWhere.method6100(var16);
							}

							if (var11) {
								var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.WIDGET_TYPE_1, Client.packetWriter.isaacCipher);
								var10.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var10);
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ItemComposition.getWidgetChild(var1, var0);
							if (var16 != null) {
								FriendSystem.Widget_runOnTargetLeave();
								Renderable.selectSpell(var1, var0, WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = class152.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + UserComparator9.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = (UserComparator9.colorStartTag(65280) + var16.spellName) + UserComparator9.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class20.method294();
						} else {
							int var12;
							Widget var14;
							if (var2 == 28) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.WIDGET_TYPE_1, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class127.getWidget(var1);
								if (((var14 != null) && (var14.cs1Instructions != null)) && (var14.cs1Instructions[0][0] == 5)) {
									var12 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
									WorldMapLabel.changeGameOptions(var12);
								}
							} else if (var2 == 29) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.WIDGET_TYPE_1, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class127.getWidget(var1);
								if (((var14 != null) && (var14.cs1Instructions != null)) && (var14.cs1Instructions[0][0] == 5)) {
									var12 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var12] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var12] = var14.cs1ComparisonValues[0];
										WorldMapLabel.changeGameOptions(var12);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class268.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ItemComposition.getWidgetChild(var1, var0);
									class346.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELDU, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntIME(TaskHandler.selectedItemWidget);
								var8.packetBuffer.writeShortLE(class432.selectedItemSlot);
								var8.packetBuffer.writeIntLE(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeShortLE(Varcs.selectedItemId);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else if (var2 == 32) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELDT, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortAdd(var3);
								var8.packetBuffer.writeIntIME(Timer.selectedSpellWidget);
								var8.packetBuffer.writeShortAdd(var0);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else if (var2 == 33) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELD1, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeIntLE(var1);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else if (var2 == 34) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELD2, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntLE(var1);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else if (var2 == 35) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELD3, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeIntLE(var1);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else if (var2 == 36) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELD4, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortLE(var3);
								var8.packetBuffer.writeIntLE(var1);
								var8.packetBuffer.writeShortAddLE(var0);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else if (var2 == 37) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPHELD5, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntIME(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShortAddLE(var0);
								Client.packetWriter.addNode(var8);
								Client.field610 = 0;
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
								Client.field611 = var0;
							} else {
								if (var2 == 38) {
									FriendSystem.Widget_runOnTargetLeave();
									var16 = class127.getWidget(var1);
									Client.isItemSelected = 1;
									class432.selectedItemSlot = var0;
									TaskHandler.selectedItemWidget = var1;
									Varcs.selectedItemId = var3;
									class346.invalidateWidget(var16);
									Client.selectedItemName = (UserComparator9.colorStartTag(16748608) + class19.ItemDefinition_get(var3).name) + UserComparator9.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF1_BUTTON1, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.writeShortAdd(var0);
									var8.packetBuffer.writeShortLE(var3);
									Client.packetWriter.addNode(var8);
									Client.field610 = 0;
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
									Client.field611 = var0;
								} else if (var2 == 40) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF1_BUTTON2, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntIME(var1);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.writeShortAdd(var3);
									Client.packetWriter.addNode(var8);
									Client.field610 = 0;
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
									Client.field611 = var0;
								} else if (var2 == 41) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF1_BUTTON3, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortAdd(var3);
									var8.packetBuffer.writeIntLE(var1);
									var8.packetBuffer.writeShortAddLE(var0);
									Client.packetWriter.addNode(var8);
									Client.field610 = 0;
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
									Client.field611 = var0;
								} else if (var2 == 42) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF1_BUTTON4, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortAddLE(var0);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.writeShortLE(var3);
									Client.packetWriter.addNode(var8);
									Client.field610 = 0;
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
									Client.field611 = var0;
								} else if (var2 == 43) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortAddLE(var0);
									var8.packetBuffer.writeShortAddLE(var3);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field610 = 0;
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
									Client.field611 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortLE(var3);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortLE(var3);
										var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortAddLE(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortAddLE(var3);
										var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if ((var2 != 1007) && (var2 != 57)) {
									if (var2 == 58) {
										var16 = ItemComposition.getWidgetChild(var1, var0);
										if (var16 != null) {
											var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
											var9.packetBuffer.writeShort(Client.selectedSpellItemId);
											var9.packetBuffer.writeIntIME(Timer.selectedSpellWidget);
											var9.packetBuffer.writeShortAdd(var16.itemId);
											var9.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
											var9.packetBuffer.writeInt(var1);
											var9.packetBuffer.writeShortAdd(var0);
											Client.packetWriter.addNode(var9);
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
										var8.packetBuffer.writeShortLE(var3);
										var8.packetBuffer.writeShortAdd(var0 + GrandExchangeOfferOwnWorldComparator.baseX);
										var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var8.packetBuffer.writeShort(VarcInt.baseY + var1);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPLOC6, Client.packetWriter.isaacCipher);
										var8.packetBuffer.writeShortAddLE(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var13 = Client.npcs[var3];
										if (var13 != null) {
											NPCComposition var17 = var13.definition;
											if (var17.transforms != null) {
												var17 = var17.transform();
											}

											if (var17 != null) {
												var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher);
												var10.packetBuffer.writeShortLE(var17.id);
												Client.packetWriter.addNode(var10);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ6, Client.packetWriter.isaacCipher);
										var8.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1005) {
										var16 = class127.getWidget(var1);
										if ((var16 != null) && (var16.itemQuantities[var0] >= 100000)) {
											Actor.addGameMessage(27, "", (var16.itemQuantities[var0] + " x ") + class19.ItemDefinition_get(var3).name);
										} else {
											var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.OPOBJ6, Client.packetWriter.isaacCipher);
											var9.packetBuffer.writeShortAdd(var3);
											Client.packetWriter.addNode(var9);
										}

										Client.field610 = 0;
										GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1);
										Client.field611 = var0;
									} else if (((((var2 == 1011) || (var2 == 1010)) || (var2 == 1009)) || (var2 == 1008)) || (var2 == 1012)) {
										ScriptFrame.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var16 = ItemComposition.getWidgetChild(var1, var0);
									if (var16 != null) {
										WorldMapLabelSize.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			class346.invalidateWidget(class127.getWidget(TaskHandler.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			FriendSystem.Widget_runOnTargetLeave();
		}

		if ((GrandExchangeOfferAgeComparator.field4011 != null) && (Client.field610 == 0)) {
			class346.invalidateWidget(GrandExchangeOfferAgeComparator.field4011);
		}

	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIB)V", garbageValue = 
	"-53")

	static final void method74(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = (var6 >= 0) ? var6 : -var6;
		int var9 = (var7 >= 0) ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = (var5 * var12) >> 17;
			int var14 = ((var5 * var12) + 1) >> 17;
			int var15 = (var5 * var11) >> 17;
			int var16 = ((var5 * var11) + 1) >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = (var0 + var6) - var14;
			int var20 = (var0 + var13) + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = (var7 + var1) - var16;
			int var24 = (var7 + var15) + var1;
			Rasterizer3D.method4673(var17, var18, var19);
			Rasterizer3D.method4617(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4673(var17, var19, var20);
			Rasterizer3D.method4617(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}