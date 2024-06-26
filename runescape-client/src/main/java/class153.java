import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class153 extends class163 {
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -298078541
	)
	int field1728;
	@ObfuscatedName("ad")
	byte field1727;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -8381223
	)
	int field1730;
	@ObfuscatedName("ak")
	String field1729;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class153(class164 var1) {
		this.this$0 = var1;
		this.field1728 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		this.field1728 = var1.readUnsignedShort();
		this.field1727 = var1.readByte();
		this.field1730 = var1.readUnsignedShort();
		var1.readLong();
		this.field1729 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1728);
		var2.rank = this.field1727;
		var2.world = this.field1730;
		var2.username = new Username(this.field1729);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-622322140"
	)
	public static void method3305() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lmd;S)V",
		garbageValue = "-8990"
	)
	static final void method3312(class320 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var10;
		int var19;
		int var20;
		if (class320.field3379 == var0) {
			var2 = var1.readUnsignedByteAdd();
			var3 = var1.readUnsignedByteSub() & 31;
			var4 = var1.readUnsignedByteSub();
			var5 = var1.readUnsignedByteAdd();
			var6 = (var5 >> 4 & 7) + LoginPacket.field1682;
			var7 = (var5 & 7) + NPC.field1350;
			var20 = var1.readUnsignedByteAdd();
			var19 = var1.readUnsignedShortLE();
			if (var6 >= 0 && var7 >= 0 && var6 < HttpResponse.worldView.sizeX && var7 < HttpResponse.worldView.sizeY) {
				var10 = var3 + 1;
				if (SoundCache.localPlayer.pathX[0] >= var6 - var10 && SoundCache.localPlayer.pathX[0] <= var10 + var6 && SoundCache.localPlayer.pathY[0] >= var7 - var10 && SoundCache.localPlayer.pathY[0] <= var10 + var7 && class105.clientPreferences.getAreaSoundEffectsVolume() != 0 && var2 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var19;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var3 + (var7 << 8) + (var6 << 16);
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var2;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var4;
					Client.field668[Client.soundEffectCount] = var20;
					++Client.soundEffectCount;
				}
			}

		} else {
			if (class320.field3382 == var0) {
				var2 = var1.readUnsignedByteNeg();
				var3 = var1.readUnsignedByteNeg();
				var4 = (var3 >> 4 & 7) + LoginPacket.field1682;
				var5 = (var3 & 7) + NPC.field1350;
				var6 = var1.readUnsignedShort();
				var7 = HttpResponse.worldView.plane;
				if (var4 >= 0 && var5 >= 0 && var4 < HttpResponse.worldView.sizeX && var5 < HttpResponse.worldView.sizeY) {
					NodeDeque var8 = HttpResponse.worldView.groundItems[var7][var4][var5];
					if (var8 != null) {
						for (TileItem var30 = (TileItem)var8.last(); var30 != null; var30 = (TileItem)var8.previous()) {
							if ((var6 & 32767) == var30.id) {
								var30.setFlag(var2);
								break;
							}
						}
					}

					if (var4 >= 0 && var5 >= 0 && var4 < HttpResponse.worldView.sizeX && var5 < HttpResponse.worldView.sizeY) {
						var19 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
						FaceNormal.method5686(var19, var4, var5, var6, var2);
					}

					return;
				}
			}

			if (class320.field3378 == var0) {
				var2 = var1.readUnsignedByte();
				var3 = (var2 >> 4 & 7) + LoginPacket.field1682;
				var4 = (var2 & 7) + NPC.field1350;
				var5 = var1.readUnsignedByteNeg();
				var6 = var5 >> 2;
				var7 = var5 & 3;
				var20 = Client.field579[var6];
				if (var3 >= 0 && var4 >= 0 && var3 < HttpResponse.worldView.sizeX && var4 < HttpResponse.worldView.sizeY) {
					var19 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
					class28.method433(HttpResponse.worldView, var19, var3, var4, var20, -1, var6, var7, 31, 0, -1);
				}

			} else if (class320.field3385 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = (var2 >> 4 & 7) + LoginPacket.field1682;
				var4 = (var2 & 7) + NPC.field1350;
				var5 = var1.readUnsignedByteNeg();
				var6 = var1.readUnsignedShortAdd();
				var7 = var1.readUnsignedShortLE();
				if (var3 >= 0 && var4 >= 0 && var3 < HttpResponse.worldView.sizeX && var4 < HttpResponse.worldView.sizeY) {
					var3 = class376.method7084(var3);
					var4 = class376.method7084(var4);
					var20 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
					GraphicsObject var9 = new GraphicsObject(var7, var20, var3, var4, class169.getTileHeight(HttpResponse.worldView, var3, var4, var20) - var5, var6, Client.cycle);
					HttpResponse.worldView.graphicsObjects.addFirst(var9);
				}

			} else if (class320.field3383 == var0) {
				var2 = var1.readUnsignedIntME();
				var3 = var1.readUnsignedShort();
				var4 = var1.readInt();
				var5 = var1.readUnsignedByteNeg();
				var6 = (var5 >> 4 & 7) + LoginPacket.field1682;
				var7 = (var5 & 7) + NPC.field1350;
				if (var6 >= 0 && var7 >= 0 && var6 < HttpResponse.worldView.sizeX && var7 < HttpResponse.worldView.sizeY) {
					var20 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
					class30.method446(var20, var6, var7, var3, var4, var2);
				}

			} else {
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				if (class320.field3387 == var0) {
					byte var25 = var1.readByte();
					var3 = var1.readUnsignedShortLE();
					byte var27 = var1.readByteNeg();
					var5 = var1.method9613();
					var6 = var1.readUnsignedByte();
					var7 = var1.readUnsignedByteSub();
					var20 = (var7 >> 4 & 7) + LoginPacket.field1682;
					var19 = (var7 & 7) + NPC.field1350;
					var10 = var1.readUnsignedByte() * 4;
					var11 = var1.readUnsignedShortAddLE();
					var12 = var1.readUnsignedShortAdd();
					var13 = var1.readUnsignedShort();
					var14 = var1.readUnsignedByteNeg() * 4;
					var15 = var1.method9607();
					var2 = var25 + var20;
					var4 = var27 + var19;
					if (var20 >= 0 && var19 >= 0 && var20 < HttpResponse.worldView.sizeX && var19 < HttpResponse.worldView.sizeY && var2 >= 0 && var4 >= 0 && var2 < HttpResponse.worldView.sizeX && var4 < HttpResponse.worldView.sizeY && var11 != 65535) {
						var16 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
						class226.method4318(var16, var20, var19, var2, var4, var5, var11, var10, var14, var12, var3, var6, var13, var15);
					}

				} else if (class320.field3381 == var0) {
					var2 = var1.readUnsignedByteNeg();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field579[var3];
					var6 = var1.readUnsignedByteSub();
					var7 = var1.readUnsignedByteSub();
					var20 = (var7 >> 4 & 7) + LoginPacket.field1682;
					var19 = (var7 & 7) + NPC.field1350;
					var10 = var1.readUnsignedShortAdd();
					if (var20 >= 0 && var19 >= 0 && var20 < HttpResponse.worldView.sizeX && var19 < HttpResponse.worldView.sizeY) {
						var11 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
						class28.method433(HttpResponse.worldView, var11, var20, var19, var5, var10, var3, var4, var6, 0, -1);
					}

				} else if (class320.field3388 == var0) {
					var2 = var1.readUnsignedByteNeg();
					var3 = (var2 >> 4 & 7) + LoginPacket.field1682;
					var4 = (var2 & 7) + NPC.field1350;
					var5 = var1.readUnsignedIntLE();
					var6 = var1.readUnsignedShortAddLE();
					var7 = HttpResponse.worldView.plane;
					if (0 <= var3 && var3 < 104 && 0 <= var4 && var4 < 104) {
						var20 = Client.field580 == -1 ? var7 : Client.field580;
						class279.method5357(var20, var3, var4, var6, var5);
					}

				} else {
					if (class320.field3386 == var0) {
						var2 = var1.readUnsignedShort();
						byte var23 = var1.readByteSub();
						var4 = var1.readUnsignedShort();
						byte var26 = var1.readByteNeg();
						byte var28 = var1.readByteAdd();
						byte var29 = var1.readByteNeg();
						var20 = var1.readUnsignedByteSub();
						var19 = (var20 >> 4 & 7) + LoginPacket.field1682;
						var10 = (var20 & 7) + NPC.field1350;
						var11 = var1.readUnsignedByteSub();
						var12 = var11 >> 2;
						var13 = var11 & 3;
						var14 = Client.field579[var12];
						var15 = var1.readUnsignedShortAddLE();
						var16 = var1.readUnsignedShortAdd();
						Player var17;
						if (var16 == Client.localPlayerIndex) {
							var17 = SoundCache.localPlayer;
						} else {
							var17 = HttpResponse.worldView.players[var16];
						}

						if (var17 != null) {
							int var18 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
							StudioGame.method7081(var18, var19, var10, var12, var13, var14, var2, var15, var4, var26, var29, var23, var28, var17);
						}
					}

					if (class320.field3384 == var0) {
						var2 = var1.readUnsignedByteNeg();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field579[var3];
						var6 = var1.readUnsignedByteNeg();
						var7 = (var6 >> 4 & 7) + LoginPacket.field1682;
						var20 = (var6 & 7) + NPC.field1350;
						var19 = var1.readUnsignedShortLE();
						if (0 <= var7 && var7 < 103 && 0 <= var20 && var20 < 103) {
							var10 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
							PendingSpawn var21 = class453.method8355(HttpResponse.worldView, var10, var7, var20, var5);
							if (var21 != null) {
								ObjectComposition var22 = HttpRequest.getObjectDefinition(var21.field1175);
								if (var22.field2203) {
									var21.field1181 = var19;
									return;
								}
							}

							boolean var31 = class111.method2849(var10, var7, var20, var3, var4, var5, var19);
							if (var31) {
								return;
							}

							if (var21 != null) {
								var21.field1181 = var19;
							}
						}

					} else if (class320.field3380 == var0) {
						var2 = var1.readUnsignedShortLE();
						boolean var24 = var1.readUnsignedByteSub() == 1;
						var4 = var1.readUnsignedShortAdd();
						var5 = var1.readUnsignedByteAdd();
						var6 = var1.readUnsignedByteAdd();
						var7 = var1.readUnsignedShort();
						var20 = var1.readUnsignedIntME();
						var19 = var1.readUnsignedByte();
						var10 = (var19 >> 4 & 7) + LoginPacket.field1682;
						var11 = (var19 & 7) + NPC.field1350;
						if (var10 >= 0 && var11 >= 0 && var10 < HttpResponse.worldView.sizeX && var11 < HttpResponse.worldView.sizeY) {
							var12 = Client.field580 == -1 ? HttpResponse.worldView.plane : Client.field580;
							PcmPlayer.addTileItemToGroundItems(var12, var10, var11, var4, var20, var5, var7, var2, var6, var24);
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "40981914"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (Decimator.friendsChat != null) {
			Decimator.friendsChat.invalidateIgnoreds();
		}

	}
}
