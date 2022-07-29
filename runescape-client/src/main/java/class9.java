import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("a")
public class class9 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "La;")
	public static final class9 field43 = new class9(0, "POST", true, true);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "La;")
	public static final class9 field41 = new class9(1, "GET", true, false);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "La;")
	static final class9 field38 = new class9(2, "PUT", false, true);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "La;")
	static final class9 field39 = new class9(3, "PATCH", false, true);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "La;")
	static final class9 field40 = new class9(4, "DELETE", false, true);

	@ObfuscatedName("fy")
	@ObfuscatedGetter(intValue = -975874631)
	static int field42;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1575723661)
	int field47;

	@ObfuscatedName("z")
	String field46;

	@ObfuscatedName("j")
	boolean field37;

	@ObfuscatedName("h")
	boolean field44;

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field47 = var1;
		this.field46 = var2;
		this.field37 = var3;
		this.field44 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field47;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
	boolean method68() {
		return this.field37;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1777015253")
	public String method79() {
		return this.field46;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-38")
	boolean method70() {
		return this.field44;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Llu;IB)V", garbageValue = "92")
	public static void method81(Archive var0, int var1) {
		Skills.field3568.offset = var1 * 8 + 5;
		if (Skills.field3568.offset >= Skills.field3568.array.length) {
			if (var0.field3994) {
				var0.method5816();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var2 = Skills.field3568.readInt();
			int var3 = Skills.field3568.readInt();
			var0.loadIndex(var2, var3);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "30")
	static final void method80() {
		VarpDefinition.method3352();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		KitDefinition.KitDefinition_cached.clear();
		CollisionMap.method3890();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		Message.method1062();
		class145.method3087();
		VarbitComposition.VarbitDefinition_cached.clear();
		UserComparator1.method8034();
		class398.HitSplatDefinition_cachedSprites.method7552();
		class6.HitSplatDefinition_cached.method7552();
		ItemComposition.method3782();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		StructComposition.StructDefinition_cached.clear();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		DbTableType.DBTableType_cache.clear();
		class92.method2441();
		Client.DBTableIndex_cache.clear();
		Client.DBTableMasterIndex_cache.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).clear();
		Script.Script_cached.clear();
		Calendar.archive5.clearFiles();
		Calendar.field3297.clearFiles();
		Skills.archive7.clearFiles();
		WorldMapArchiveLoader.archive4.clearFiles();
		class21.archive9.clearFiles();
		MouseHandler.archive6.clearFiles();
		TaskHandler.archive11.clearFiles();
		AbstractWorldMapData.archive8.clearFiles();
		class293.field3349.clearFiles();
		Actor.archive10.clearFiles();
		WorldMapRegion.field2708.clearFiles();
		class117.archive12.clearFiles();
		BuddyRankComparator.field1380.clearFiles();
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V", garbageValue = "422213026")
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}
		PacketBufferNode var9;
		if (var2 == 1) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = class433.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAdd(class300.baseX * 8 + var0);
			var9.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.selectedItemSlot);
			var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
			var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var9.packetBuffer.writeShortAddLE(class358.selectedItemId);
			var9.packetBuffer.writeIntIME(GraphicsObject.selectedItemWidget);
			var9.packetBuffer.writeShortLE(var3);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 2) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = class433.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
			var9.packetBuffer.writeShort(Message.baseY * 64 + var1);
			var9.packetBuffer.writeShortLE(class300.baseX * 8 + var0);
			var9.packetBuffer.writeShort(Client.selectedSpellItemId);
			var9.packetBuffer.writeIntIME(class113.selectedSpellWidget);
			var9.packetBuffer.writeShortAdd(var3);
			var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = class433.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(class300.baseX * 8 + var0);
			var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 4) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = class433.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(var3);
			var9.packetBuffer.writeShortAddLE(class300.baseX * 8 + var0);
			var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
			var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 5) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = class433.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var9.packetBuffer.writeShortAddLE(Message.baseY * 64 + var1);
			var9.packetBuffer.writeShortAdd(var3);
			var9.packetBuffer.writeShort(class300.baseX * 8 + var0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 6) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = class433.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(class300.baseX * 8 + var0);
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var9.packetBuffer.writeShortAddLE(var3);
			var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
			Client.packetWriter.addNode(var9);
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAddLE(var3);
					var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.selectedItemSlot);
					var10.packetBuffer.writeShortLE(class358.selectedItemId);
					var10.packetBuffer.writeIntLE(GraphicsObject.selectedItemWidget);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.writeInt(class113.selectedSpellWidget);
					var10.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
					var10.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortLE(var3);
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAdd(var3);
					var10.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class433.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShort(var3);
					var10.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3];
					if (var16 != null) {
						Client.mouseCrossX = var7;
						Client.mouseCrossY = var8;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var10 = class433.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.selectedItemSlot);
						var10.packetBuffer.writeShortAddLE(class358.selectedItemId);
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var10.packetBuffer.writeShortAddLE(var3);
						var10.packetBuffer.writeIntIME(GraphicsObject.selectedItemWidget);
						Client.packetWriter.addNode(var10);
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3];
					if (var16 != null) {
						Client.mouseCrossX = var7;
						Client.mouseCrossY = var8;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var10.packetBuffer.writeShortAddLE(var3);
						var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var10.packetBuffer.writeShortAddLE(class113.selectedSpellWidget);
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						Client.packetWriter.addNode(var10);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAdd(var3);
					var9.packetBuffer.writeIntIME(GraphicsObject.selectedItemWidget);
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(class358.selectedItemId);
					var9.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.selectedItemSlot);
					var9.packetBuffer.writeShortAddLE(class300.baseX * 8 + var0);
					var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 17) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeIntLE(class113.selectedSpellWidget);
					var9.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
					var9.packetBuffer.writeShort(Client.selectedSpellItemId);
					var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
					var9.packetBuffer.writeShortAdd(class300.baseX * 8 + var0);
					var9.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 18) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAddLE(var3);
					var9.packetBuffer.writeShort(class300.baseX * 8 + var0);
					var9.packetBuffer.writeShortAddLE(Message.baseY * 64 + var1);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 19) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortLE(Message.baseY * 64 + var1);
					var9.packetBuffer.writeShortAddLE(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortLE(class300.baseX * 8 + var0);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 20) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeShortAddLE(Message.baseY * 64 + var1);
					var9.packetBuffer.writeShortLE(class300.baseX * 8 + var0);
					var9.packetBuffer.writeByteNeg(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 21) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortAdd(Message.baseY * 64 + var1);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.writeShortAdd(class300.baseX * 8 + var0);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 22) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = class433.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortAdd(Message.baseY * 64 + var1);
					var9.packetBuffer.writeShortAddLE(class300.baseX * 8 + var0);
					var9.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						Decimator.scene.setViewportWalking();
					} else {
						Decimator.scene.menuOpen(FriendSystem.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var17;
					if (var2 == 24) {
						var17 = FloorUnderlayDefinition.getWidget(var1);
						if (var17 != null) {
							boolean var12 = true;
							if (var17.contentType > 0) {
								var12 = ArchiveLoader.method2131(var17);
							}
							if (var12) {
								var11 = class433.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher);
								var11.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var11);
							}
						}
					} else {
						if (var2 == 25) {
							var17 = class293.getWidgetChild(var1, var0);
							if (var17 != null) {
								class362.Widget_runOnTargetLeave();
								class21.selectSpell(var1, var0, BoundaryObject.Widget_unpackTargetMask(class67.getWidgetFlags(var17)), var4);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = IgnoreList.Widget_getSpellActionName(var17);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}
								if (var17.isIf3) {
									Client.selectedSpellName = var17.dataText + class82.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class82.colorStartTag(65280) + var17.spellName + class82.colorStartTag(16777215);
								}
							}
							return;
						}
						if (var2 == 26) {
							class181.method3547();
						} else {
							int var13;
							Widget var15;
							if (var2 == 28) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var9);
								var15 = FloorUnderlayDefinition.getWidget(var1);
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
									var13 = var15.cs1Instructions[0][1];
									Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13];
									class155.changeGameOptions(var13);
								}
							} else if (var2 == 29) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var9);
								var15 = FloorUnderlayDefinition.getWidget(var1);
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
									var13 = var15.cs1Instructions[0][1];
									if (Varps.Varps_main[var13] != var15.cs1ComparisonValues[0]) {
										Varps.Varps_main[var13] = var15.cs1ComparisonValues[0];
										class155.changeGameOptions(var13);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									WorldMapSection2.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class293.getWidgetChild(var1, var0);
									class220.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeShortLE(var0);
								var9.packetBuffer.writeInt(GraphicsObject.selectedItemWidget);
								var9.packetBuffer.writeIntIME(var1);
								var9.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.selectedItemSlot);
								var9.packetBuffer.writeShortLE(var4);
								var9.packetBuffer.writeShort(class358.selectedItemId);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else if (var2 == 32) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeIntLE(var1);
								var9.packetBuffer.writeShortAddLE(var0);
								var9.packetBuffer.writeInt(class113.selectedSpellWidget);
								var9.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
								var9.packetBuffer.writeShortAdd(var4);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else if (var2 == 33) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeIntLE(var1);
								var9.packetBuffer.writeShortLE(var4);
								var9.packetBuffer.writeShortLE(var0);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else if (var2 == 34) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeShort(var4);
								var9.packetBuffer.writeInt(var1);
								var9.packetBuffer.writeShortAdd(var0);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else if (var2 == 35) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeShortLE(var0);
								var9.packetBuffer.writeShortAddLE(var1);
								var9.packetBuffer.writeShort(var4);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else if (var2 == 36) {
								var9 = class433.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeShortAddLE(var1);
								var9.packetBuffer.writeShortLE(var4);
								var9.packetBuffer.writeShortAddLE(var0);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else if (var2 == 37) {
								var9 = class433.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeShortAdd(var4);
								var9.packetBuffer.writeIntIME(var1);
								var9.packetBuffer.writeShortLE(var0);
								Client.packetWriter.addNode(var9);
								Client.field601 = 0;
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
								Client.field602 = var0;
							} else {
								if (var2 == 38) {
									class362.Widget_runOnTargetLeave();
									var17 = FloorUnderlayDefinition.getWidget(var1);
									Client.isItemSelected = 1;
									GrandExchangeOfferOwnWorldComparator.selectedItemSlot = var0;
									GraphicsObject.selectedItemWidget = var1;
									class358.selectedItemId = var4;
									class220.invalidateWidget(var17);
									Client.selectedItemName = class82.colorStartTag(16748608) + class258.ItemDefinition_get(var4).name + class82.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}
									return;
								}
								if (var2 == 39) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher);
									var9.packetBuffer.writeShortAddLE(var4);
									var9.packetBuffer.writeIntLE(var1);
									var9.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var9);
									Client.field601 = 0;
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
									Client.field602 = var0;
								} else if (var2 == 40) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2924, Client.packetWriter.isaacCipher);
									var9.packetBuffer.writeShortLE(var4);
									var9.packetBuffer.writeShortAddLE(var1);
									var9.packetBuffer.writeShortAdd(var0);
									Client.packetWriter.addNode(var9);
									Client.field601 = 0;
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
									Client.field602 = var0;
								} else if (var2 == 41) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher);
									var9.packetBuffer.writeShortAddLE(var1);
									var9.packetBuffer.writeShortLE(var4);
									var9.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var9);
									Client.field601 = 0;
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
									Client.field602 = var0;
								} else if (var2 == 42) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2944, Client.packetWriter.isaacCipher);
									var9.packetBuffer.writeShortAddLE(var1);
									var9.packetBuffer.writeShort(var0);
									var9.packetBuffer.writeShortAdd(var4);
									Client.packetWriter.addNode(var9);
									Client.field601 = 0;
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
									Client.field602 = var0;
								} else if (var2 == 43) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher);
									var9.packetBuffer.writeShortAdd(var0);
									var9.packetBuffer.writeShortLE(var4);
									var9.packetBuffer.writeIntLE(var1);
									Client.packetWriter.addNode(var9);
									Client.field601 = 0;
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
									Client.field602 = var0;
								} else if (var2 == 44) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeShortLE(var3);
										var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeShortLE(var3);
										var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeShortAdd(var3);
										var10.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.writeShortLE(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.writeShortAddLE(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = class433.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeShort(var3);
										var10.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else {
									label653 : {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = class293.getWidgetChild(var1, var0);
												if (var17 != null) {
													var10 = class433.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var10.packetBuffer.writeShortAdd(var0);
													var10.packetBuffer.writeIntIME(var1);
													var10.packetBuffer.writeShortLE(Client.selectedSpellItemId);
													var10.packetBuffer.writeIntME(class113.selectedSpellWidget);
													var10.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
													var10.packetBuffer.writeShort(var4);
													Client.packetWriter.addNode(var10);
												}
												break label653;
											}
											if (var2 == 1001) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var9 = class433.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var9.packetBuffer.writeShort(Message.baseY * 64 + var1);
												var9.packetBuffer.writeShort(class300.baseX * 8 + var0);
												var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var9.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var9);
												break label653;
											}
											if (var2 == 1002) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var9 = class433.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var9.packetBuffer.writeShortLE(var3);
												Client.packetWriter.addNode(var9);
												break label653;
											}
											if (var2 == 1003) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var14 = Client.npcs[var3];
												if (var14 != null) {
													NPCComposition var18 = var14.definition;
													if (var18.transforms != null) {
														var18 = var18.transform();
													}
													if (var18 != null) {
														var11 = class433.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var11.packetBuffer.writeShortAddLE(var18.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label653;
											}
											if (var2 == 1004) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var9 = class433.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var9.packetBuffer.writeShortLE(var3);
												Client.packetWriter.addNode(var9);
												break label653;
											}
											if (var2 == 1005) {
												var17 = FloorUnderlayDefinition.getWidget(var1);
												if (var17 != null && var17.itemQuantities[var0] >= 100000) {
													FileSystem.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + class258.ItemDefinition_get(var4).name);
												} else {
													var10 = class433.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
													var10.packetBuffer.writeShortLE(var4);
													Client.packetWriter.addNode(var10);
												}
												Client.field601 = 0;
												class121.field1488 = FloorUnderlayDefinition.getWidget(var1);
												Client.field602 = var0;
												break label653;
											}
											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1008 || var2 == 1011 || var2 == 1010 || var2 == 1012) {
													class344.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label653;
											}
										}
										var17 = class293.getWidgetChild(var1, var0);
										if (var17 != null) {
											ArchiveLoader.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
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
			class220.invalidateWidget(FloorUnderlayDefinition.getWidget(GraphicsObject.selectedItemWidget));
		}
		if (Client.isSpellSelected) {
			class362.Widget_runOnTargetLeave();
		}
		if (class121.field1488 != null && Client.field601 == 0) {
			class220.invalidateWidget(class121.field1488);
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-408298670")
	static void method82() {
		if (Client.oculusOrbState == 1) {
			Client.field701 = true;
		}
	}
}