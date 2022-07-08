import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ng")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpe;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1848201845)
	int field4286;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lli;")
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(descriptor = "(Lpe;)V")
	public FriendsList(LoginType var1) {
		super(400);
		this.field4286 = 1;
		this.friendLoginUpdates = new LinkDeque();
		this.loginType = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(S)Lne;", garbageValue = "-7122")
	@Export("newInstance")
	User newInstance() {
		return new Friend();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)[Lne;", garbageValue = "77510907")
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqa;ZB)Z", garbageValue = "-49")
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = ((Friend) (this.getByUsername(var1)));
		if (var3 == null) {
			return false;
		} else {
			return !var2 || var3.world != 0;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqt;IB)V", garbageValue = "1")
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				boolean var3 = var1.readUnsignedByte() == 1;
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated();
					var1.readUnsignedByte();
					var1.readInt();
				}
				var1.readStringCp1252NullTerminated();
				if (var4 != null && var4.hasCleanName()) {
					Friend var11 = ((Friend) (this.getByCurrentUsername(var4)));
					if (var3) {
						Friend var12 = ((Friend) (this.getByCurrentUsername(var5)));
						if (var12 != null && var12 != var11) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}
					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true;
							for (FriendLoginUpdate var13 = ((FriendLoginUpdate) (this.friendLoginUpdates.last())); var13 != null; var13 = ((FriendLoginUpdate) (this.friendLoginUpdates.previous()))) {
								if (var13.username.equals(var4)) {
									if (var6 != 0 && var13.world == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.world != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}
							if (var14) {
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) {
							continue;
						}
						var11 = ((Friend) (this.addLast(var4, var5)));
					}
					if (var6 != var11.world) {
						var11.int2 = ++this.field4286 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * -1691529257) * 1716524007;
						}
						var11.world = var6;
					}
					var11.rank = var7;
					var11.field4299 = var9;
					var11.field4298 = var10;
					continue;
				}
				throw new IllegalStateException();
			}
			this.sort();
			return;
		} 
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V", garbageValue = "1")
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
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortAdd(EnumComposition.selectedItemSlot);
			var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
			var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortLE(var3);
			var8.packetBuffer.writeShort(WorldMapIcon_0.selectedItemId);
			var8.packetBuffer.writeShortLE(ModeWhere.selectedItemWidget);
			var8.packetBuffer.writeShort(var0 + class28.baseX);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortLE(WorldMapLabelSize.baseY + var1);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeShortAddLE(var0 + class28.baseX);
			var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
			var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortLE(NetCache.selectedSpellWidget);
			var8.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortAddLE(WorldMapLabelSize.baseY + var1);
			var8.packetBuffer.writeShortAddLE(var0 + class28.baseX);
			var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortLE(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
			var8.packetBuffer.writeShort(var0 + class28.baseX);
			var8.packetBuffer.writeShortAddLE(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortAdd(var0 + class28.baseX);
			var8.packetBuffer.writeShortAdd(WorldMapLabelSize.baseY + var1);
			var8.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortAddLE(WorldMapLabelSize.baseY + var1);
			var8.packetBuffer.writeShort(var0 + class28.baseX);
			var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortAdd(var3);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeInt(ModeWhere.selectedItemWidget);
					var9.packetBuffer.writeShortLE(EnumComposition.selectedItemSlot);
					var9.packetBuffer.writeShortAddLE(var3);
					var9.packetBuffer.writeShortLE(WorldMapIcon_0.selectedItemId);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeIntLE(NetCache.selectedSpellWidget);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.writeShort(Client.selectedSpellItemId);
					var9.packetBuffer.writeShortAddLE(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAdd(var3);
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortLE(var3);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAdd(var3);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAddLE(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2908, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3);
						var9.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemId);
						var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeShortAdd(EnumComposition.selectedItemSlot);
						var9.packetBuffer.writeInt(ModeWhere.selectedItemWidget);
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
						var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var9.packetBuffer.writeShortAddLE(var3);
						var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeInt(NetCache.selectedSpellWidget);
						var9.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
					var8.packetBuffer.writeInt(ModeWhere.selectedItemWidget);
					var8.packetBuffer.writeShortAddLE(EnumComposition.selectedItemSlot);
					var8.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemId);
					var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAdd(var3);
					var8.packetBuffer.writeShort(var0 + class28.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var3);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAdd(var0 + class28.baseX);
					var8.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeShortLE(Client.selectedSpellItemId);
					var8.packetBuffer.writeShortAdd(WorldMapLabelSize.baseY + var1);
					var8.packetBuffer.writeIntLE(NetCache.selectedSpellWidget);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var0 + class28.baseX);
					var8.packetBuffer.writeShortAdd(var3);
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(WorldMapLabelSize.baseY + var1);
					var8.packetBuffer.writeShortAddLE(var3);
					var8.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAddLE(var0 + class28.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
					var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAdd(var3);
					var8.packetBuffer.writeShortLE(var0 + class28.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var0 + class28.baseX);
					var8.packetBuffer.writeShortAddLE(var3);
					var8.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var0 + class28.baseX);
					var8.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShortAddLE(var3);
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						class356.scene.setViewportWalking();
					} else {
						class356.scene.menuOpen(PacketWriter.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = class140.getWidget(var1);
						if (var16 != null) {
							boolean var11 = true;
							if (var16.contentType > 0) {
								var11 = Message.method1065(var16);
							}
							if (var11) {
								var12 = EnumComposition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher);
								var12.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var12);
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ScriptFrame.getWidgetChild(var1, var0);
							if (var16 != null) {
								WorldMapDecoration.Widget_runOnTargetLeave();
								GrandExchangeOfferAgeComparator.selectSpell(var1, var0, WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = WorldMapIcon_0.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}
								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + class122.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class122.colorStartTag(65280) + var16.spellName + class122.colorStartTag(16777215);
								}
							}
							return;
						}
						if (var2 == 26) {
							Occluder.method4354();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class140.getWidget(var1);
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									class306.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class140.getWidget(var1);
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										class306.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class362.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ScriptFrame.getWidgetChild(var1, var0);
									ChatChannel.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortAddLE(EnumComposition.selectedItemSlot);
								var8.packetBuffer.writeShortLE(var1);
								var8.packetBuffer.writeIntIME(ModeWhere.selectedItemWidget);
								var8.packetBuffer.writeShortAddLE(var0);
								var8.packetBuffer.writeShortAdd(WorldMapIcon_0.selectedItemId);
								var8.packetBuffer.writeShortLE(var3);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else if (var2 == 32) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeIntLE(NetCache.selectedSpellWidget);
								var8.packetBuffer.writeShortAddLE(var0);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else if (var2 == 33) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntLE(var1);
								var8.packetBuffer.writeShortLE(var0);
								var8.packetBuffer.writeShortAddLE(var3);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else if (var2 == 34) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortAddLE(var0);
								var8.packetBuffer.writeShortLE(var1);
								var8.packetBuffer.writeShortAdd(var3);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else if (var2 == 35) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortAdd(var3);
								var8.packetBuffer.writeIntLE(var1);
								var8.packetBuffer.writeShortLE(var0);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else if (var2 == 36) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShortAddLE(var0);
								var8.packetBuffer.writeIntIME(var1);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else if (var2 == 37) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeShortLE(var0);
								var8.packetBuffer.writeShortAdd(var3);
								Client.packetWriter.addNode(var8);
								Client.field599 = 0;
								class1.field4 = class140.getWidget(var1);
								Client.field600 = var0;
							} else {
								if (var2 == 38) {
									WorldMapDecoration.Widget_runOnTargetLeave();
									var16 = class140.getWidget(var1);
									Client.isItemSelected = 1;
									EnumComposition.selectedItemSlot = var0;
									ModeWhere.selectedItemWidget = var1;
									WorldMapIcon_0.selectedItemId = var3;
									ChatChannel.invalidateWidget(var16);
									Client.selectedItemName = class122.colorStartTag(16748608) + EnumComposition.ItemDefinition_get(var3).name + class122.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}
									return;
								}
								if (var2 == 39) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntLE(var1);
									var8.packetBuffer.writeShortAddLE(var0);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field599 = 0;
									class1.field4 = class140.getWidget(var1);
									Client.field600 = var0;
								} else if (var2 == 40) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntIME(var1);
									var8.packetBuffer.writeShortAdd(var0);
									var8.packetBuffer.writeShortLE(var3);
									Client.packetWriter.addNode(var8);
									Client.field599 = 0;
									class1.field4 = class140.getWidget(var1);
									Client.field600 = var0;
								} else if (var2 == 41) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortAdd(var3);
									var8.packetBuffer.writeShortLE(var1);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field599 = 0;
									class1.field4 = class140.getWidget(var1);
									Client.field600 = var0;
								} else if (var2 == 42) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortAdd(var0);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.writeIntIME(var1);
									Client.packetWriter.addNode(var8);
									Client.field599 = 0;
									class1.field4 = class140.getWidget(var1);
									Client.field600 = var0;
								} else if (var2 == 43) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortAddLE(var0);
									var8.packetBuffer.writeIntIME(var1);
									var8.packetBuffer.writeShortAddLE(var3);
									Client.packetWriter.addNode(var8);
									Client.field599 = 0;
									class1.field4 = class140.getWidget(var1);
									Client.field600 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortAdd(var3);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortAddLE(var3);
										var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShortAdd(var3);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortLE(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortLE(var3);
										var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label654 : {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ScriptFrame.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var9.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
													var9.packetBuffer.writeIntLE(NetCache.selectedSpellWidget);
													var9.packetBuffer.writeShortAddLE(var16.itemId);
													var9.packetBuffer.writeShort(var0);
													var9.packetBuffer.writeIntIME(var1);
													Client.packetWriter.addNode(var9);
												}
												break label654;
											}
											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShortAddLE(var0 + class28.baseX);
												var8.packetBuffer.writeShortAdd(var3);
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.writeShortAddLE(WorldMapLabelSize.baseY + var1);
												Client.packetWriter.addNode(var8);
												break label654;
											}
											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var8);
												break label654;
											}
											if (var2 == 1003) {
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
														var12 = EnumComposition.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var12.packetBuffer.writeShortLE(var17.id);
														Client.packetWriter.addNode(var12);
													}
												}
												break label654;
											}
											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShortAddLE(var3);
												Client.packetWriter.addNode(var8);
												break label654;
											}
											if (var2 == 1005) {
												var16 = class140.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													class290.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + EnumComposition.ItemDefinition_get(var3).name);
												} else {
													var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeShortAddLE(var3);
													Client.packetWriter.addNode(var9);
												}
												Client.field599 = 0;
												class1.field4 = class140.getWidget(var1);
												Client.field600 = var0;
												break label654;
											}
											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1008 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													class121.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label654;
											}
										}
										var16 = ScriptFrame.getWidgetChild(var1, var0);
										if (var16 != null) {
											TextureProvider.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
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
			ChatChannel.invalidateWidget(class140.getWidget(ModeWhere.selectedItemWidget));
		}
		if (Client.isSpellSelected) {
			WorldMapDecoration.Widget_runOnTargetLeave();
		}
		if (class1.field4 != null && Client.field599 == 0) {
			ChatChannel.invalidateWidget(class1.field4);
		}
	}
}