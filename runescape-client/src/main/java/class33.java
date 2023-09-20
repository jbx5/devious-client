import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class33 {
	@ObfuscatedName("ay")
	public static short[][] field187;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 861053849
	)
	int field177;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -122370825
	)
	int field181;

	class33(int var1, int var2) {
		this.field177 = var1;
		this.field181 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)Z",
		garbageValue = "-114567882"
	)
	boolean method475(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field177) {
			case 1:
				return var1.vmethod4264(this.field181);
			case 2:
				return var1.vmethod4251(this.field181);
			case 3:
				return var1.vmethod4275((char)this.field181);
			case 4:
				return var1.vmethod4254(this.field181 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lud;",
		garbageValue = "1018953264"
	)
	static SpritePixels method479(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "973188034"
	)
	public static void method476() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "102"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 16) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3225, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(Actor.field1263);
			var9.packetBuffer.writeByteSub(var3);
			var9.packetBuffer.writeShortLE(class4.field10);
			var9.packetBuffer.method9244(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShort(class129.field1520);
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.writeByteSub(class19.baseY * 64 + var1);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class434.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
		}

		Widget var10;
		int var11;
		if (var2 == 28) {
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var9);
			var10 = widgetDefinition.method6240(var1);
			if (var10 != null && var10.cs1Instructions != null && var10.cs1Instructions[0][0] == 5) {
				var11 = var10.cs1Instructions[0][1];
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
				ScriptEvent.changeGameOptions(var11);
			}
		}

		if (var2 == 4) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3204, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(var3);
			var9.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.method9244(class20.baseX * 64 + var0);
			var9.packetBuffer.writeByteSub(class19.baseY * 64 + var1);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 1) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9258(class4.field10);
			var9.packetBuffer.writeByteSub(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShort(Actor.field1263);
			var9.packetBuffer.method9244(class129.field1520);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.writeShortAdd(class19.baseY * 64 + var1);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 20) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3222, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteSub(class19.baseY * 64 + var1);
			var9.packetBuffer.writeShortAdd(var3);
			var9.packetBuffer.writeShortAdd(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		PacketBufferNode var14;
		NPC var15;
		if (var2 == 7) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9244(Actor.field1263);
				var14.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeInt(class4.field10);
				var14.packetBuffer.writeByteSub(var3);
				var14.packetBuffer.writeShortAdd(class129.field1520);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 6) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3212, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteSub(class19.baseY * 64 + var1);
			var9.packetBuffer.writeShortAdd(var3);
			var9.packetBuffer.writeShortAdd(class20.baseX * 64 + var0);
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

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
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortLE(class4.field10);
				var14.packetBuffer.method9244(Actor.field1263);
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.method9244(var3);
				var14.packetBuffer.writeShortAdd(class129.field1520);
				Client.packetWriter.addNode(var14);
			}
		}

		Widget var17;
		if (var2 == 57 || var2 == 1007) {
			var17 = widgetDefinition.method6241(var1, var0);
			if (var17 != null) {
				TextureProvider.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 48) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3218, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeByteSub(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 50) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 23) {
			if (Client.isMenuOpen) {
				class10.scene.setViewportWalking();
			} else {
				class10.scene.menuOpen(class87.Client_plane, var0, var1, true);
			}
		}

		if (var2 == 13) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeByteSub(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		PacketBufferNode var12;
		if (var2 == 1003) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var15 = Client.npcs[var3];
			if (var15 != null) {
				NPCComposition var18 = var15.definition;
				if (var18.transforms != null) {
					var18 = var18.transform();
				}

				if (var18 != null) {
					var12 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeShortAdd(var18.id);
					Client.packetWriter.addNode(var12);
				}
			}
		}

		if (var2 == 21) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(var3);
			var9.packetBuffer.writeShort(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1);
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 44) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 11) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 5) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAdd(class19.baseY * 64 + var1);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeByteSub(class20.baseX * 64 + var0);
			var9.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 15) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShort(Client.field686);
				var14.packetBuffer.method9244(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeIntME(JagexCache.field1841);
				var14.packetBuffer.writeByteSub(var3);
				var14.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 51) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeByteSub(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 22) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1);
			var9.packetBuffer.writeByteSub(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShortAdd(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 24) {
			var17 = widgetDefinition.method6240(var1);
			if (var17 != null) {
				boolean var13 = true;
				if (var17.contentType > 0) {
					var13 = EnumComposition.method3761(var17);
				}

				if (var13) {
					var12 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeInt(var1);
					Client.packetWriter.addNode(var12);
				}
			}
		}

		if (var2 == 2) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
			var9.packetBuffer.writeShort(class20.baseX * 64 + var0);
			var9.packetBuffer.method9258(JagexCache.field1841);
			var9.packetBuffer.writeByteSub(var3);
			var9.packetBuffer.writeByteSub(class19.baseY * 64 + var1);
			var9.packetBuffer.method9244(Client.field686);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 30 && Client.meslayerContinueWidget == null) {
			class174.resumePauseWidget(var1, var0);
			Client.meslayerContinueWidget = widgetDefinition.method6241(var1, var0);
			ClanChannelMember.invalidateWidget(Client.meslayerContinueWidget);
		}

		if (var2 == 12) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 9) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3203, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9244(var3);
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 49) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeByteSub(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 19) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAdd(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1);
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.method9244(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 1002) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 17) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3228, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(var3);
			var9.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.writeInt(JagexCache.field1841);
			var9.packetBuffer.writeShort(Client.field686);
			var9.packetBuffer.writeShortAdd(class19.baseY * 64 + var1);
			var9.packetBuffer.writeShortAdd(class20.baseX * 64 + var0);
			var9.packetBuffer.writeByteSub(Client.selectedSpellChildIndex);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 46) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9244(var3);
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShortAdd(class19.baseY * 64 + var1);
			var9.packetBuffer.writeShortAdd(var3);
			var9.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 45) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 10) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
				var14.packetBuffer.method9244(var3);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 1004) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1);
			var9.packetBuffer.writeShort(class20.baseX * 64 + var0);
			var9.packetBuffer.method9244(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 58) {
			var17 = widgetDefinition.method6241(var1, var0);
			if (var17 != null) {
				if (var17.field3785 != null) {
					ScriptEvent var19 = new ScriptEvent();
					var19.widget = var17;
					var19.opIndex = var3;
					var19.targetName = var6;
					var19.args = var17.field3785;
					Interpreter.runScriptEvent(var19);
				}

				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeInt(var1);
				var14.packetBuffer.method9244(var4);
				var14.packetBuffer.method9258(JagexCache.field1841);
				var14.packetBuffer.writeShortAdd(Client.field686);
				var14.packetBuffer.writeShortAdd(var0);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 18) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method9244(class19.baseY * 64 + var1);
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0);
			var9.packetBuffer.method9244(class20.baseX * 64 + var0);
			var9.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 1001) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.method9244(class19.baseY * 64 + var1);
			var9.packetBuffer.method9244(class20.baseX * 64 + var0);
			var9.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 29) {
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var9);
			var10 = widgetDefinition.method6240(var1);
			if (var10 != null && var10.cs1Instructions != null && var10.cs1Instructions[0][0] == 5) {
				var11 = var10.cs1Instructions[0][1];
				if (Varps.Varps_main[var11] != var10.cs1ComparisonValues[0]) {
					Varps.Varps_main[var11] = var10.cs1ComparisonValues[0];
					ScriptEvent.changeGameOptions(var11);
				}
			}
		}

		if (var2 == 47) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeByteNeg(Client.field755.method4280(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}
		}

		if (var2 == 26) {
			GrandExchangeOfferOwnWorldComparator.method1240();
		}

		if (var2 == 25) {
			var17 = widgetDefinition.method6241(var1, var0);
			if (var17 != null) {
				class286.method5663();
				class478.method8514(var1, var0, KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var17)), var4);
				Client.isItemSelected = 0;
				Client.selectedSpellActionName = class155.Widget_getSpellActionName(var17);
				if (Client.selectedSpellActionName == null) {
					Client.selectedSpellActionName = "null";
				}

				if (var17.isIf3) {
					Client.selectedSpellName = var17.dataText + Client.colorStartTag(16777215);
				} else {
					Client.selectedSpellName = Client.colorStartTag(65280) + var17.field3806 + Client.colorStartTag(16777215);
				}
			}

		} else {
			if (var2 == 8) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3229, Client.packetWriter.isaacCipher);
					var14.packetBuffer.method9258(JagexCache.field1841);
					var14.packetBuffer.method9244(Client.field686);
					var14.packetBuffer.writeShortAddLE(Client.field755.method4280(82) ? 1 : 0);
					var14.packetBuffer.writeByteSub(Client.selectedSpellChildIndex);
					var14.packetBuffer.writeShortAdd(var3);
					Client.packetWriter.addNode(var14);
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				ClanChannelMember.invalidateWidget(widgetDefinition.method6240(class4.field10));
			}

			if (Client.isSpellSelected) {
				class286.method5663();
			}

		}
	}
}
