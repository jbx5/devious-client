import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class148 extends class129 {
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1789853223
	)
	int field1700;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class148(class132 var1) {
		this.this$0 = var1;
		this.field1700 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1700 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3123(this.field1700); // L: 153
	} // L: 154

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method3260() {
		Tiles.Tiles_minPlane = 99; // L: 48
		class152.Tiles_underlays = new byte[4][104][104]; // L: 49
		class294.Tiles_overlays = new byte[4][104][104]; // L: 50
		Tiles.Tiles_shapes = new byte[4][104][104]; // L: 51
		Tiles.field1001 = new byte[4][104][104]; // L: 52
		ChatChannel.field996 = new int[4][105][105]; // L: 53
		SoundCache.field328 = new byte[4][105][105]; // L: 54
		Tiles.field1002 = new int[105][105]; // L: 55
		TextureProvider.Tiles_hue = new int[104]; // L: 56
		FontName.Tiles_saturation = new int[104]; // L: 57
		class436.Tiles_lightness = new int[104]; // L: 58
		class434.Tiles_hueMultiplier = new int[104]; // L: 59
		Tiles.field1008 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1094464901"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = MusicPatchNode.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5766
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (0L != var5) { // L: 5767
			var7 = MusicPatchNode.scene.getObjectFlags(var0, var1, var2, var5); // L: 5768
			var8 = var7 >> 6 & 3; // L: 5769
			var9 = var7 & 31; // L: 5770
			var10 = var3; // L: 5771
			boolean var12 = var5 != 0L; // L: 5774
			if (var12) { // L: 5775
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 5778
				var12 = !var13; // L: 5780
			}

			if (var12) { // L: 5784
				var10 = var4;
			}

			int[] var19 = class11.sceneMinimapSprite.pixels; // L: 5785
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5786
			var14 = class156.Entity_unpackID(var5); // L: 5787
			ObjectComposition var15 = PlayerComposition.getObjectDefinition(var14); // L: 5788
			if (var15.mapSceneId != -1) { // L: 5789
				IndexedSprite var16 = WorldMapArea.mapSceneSprites[var15.mapSceneId]; // L: 5790
				if (var16 != null) { // L: 5791
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5792
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5793
					var16.drawAt(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 5794
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5798
					if (var8 == 0) { // L: 5799
						var19[var26] = var10; // L: 5800
						var19[var26 + 512] = var10; // L: 5801
						var19[var26 + 1024] = var10; // L: 5802
						var19[var26 + 1536] = var10; // L: 5803
					} else if (var8 == 1) { // L: 5805
						var19[var26] = var10; // L: 5806
						var19[var26 + 1] = var10; // L: 5807
						var19[var26 + 2] = var10; // L: 5808
						var19[var26 + 3] = var10; // L: 5809
					} else if (var8 == 2) { // L: 5811
						var19[var26 + 3] = var10; // L: 5812
						var19[var26 + 512 + 3] = var10; // L: 5813
						var19[var26 + 1024 + 3] = var10; // L: 5814
						var19[var26 + 1536 + 3] = var10; // L: 5815
					} else if (var8 == 3) { // L: 5817
						var19[var26 + 1536] = var10; // L: 5818
						var19[var26 + 1536 + 1] = var10; // L: 5819
						var19[var26 + 1536 + 2] = var10; // L: 5820
						var19[var26 + 1536 + 3] = var10; // L: 5821
					}
				}

				if (var9 == 3) { // L: 5824
					if (var8 == 0) { // L: 5825
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 5826
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 5827
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5828
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5830
					if (var8 == 3) { // L: 5831
						var19[var26] = var10; // L: 5832
						var19[var26 + 512] = var10; // L: 5833
						var19[var26 + 1024] = var10; // L: 5834
						var19[var26 + 1536] = var10; // L: 5835
					} else if (var8 == 0) { // L: 5837
						var19[var26] = var10; // L: 5838
						var19[var26 + 1] = var10; // L: 5839
						var19[var26 + 2] = var10; // L: 5840
						var19[var26 + 3] = var10; // L: 5841
					} else if (var8 == 1) { // L: 5843
						var19[var26 + 3] = var10; // L: 5844
						var19[var26 + 512 + 3] = var10; // L: 5845
						var19[var26 + 1024 + 3] = var10; // L: 5846
						var19[var26 + 1536 + 3] = var10; // L: 5847
					} else if (var8 == 2) { // L: 5849
						var19[var26 + 1536] = var10; // L: 5850
						var19[var26 + 1536 + 1] = var10; // L: 5851
						var19[var26 + 1536 + 2] = var10; // L: 5852
						var19[var26 + 1536 + 3] = var10; // L: 5853
					}
				}
			}
		}

		var5 = MusicPatchNode.scene.getGameObjectTag(var0, var1, var2); // L: 5858
		if (0L != var5) { // L: 5859
			var7 = MusicPatchNode.scene.getObjectFlags(var0, var1, var2, var5); // L: 5860
			var8 = var7 >> 6 & 3; // L: 5861
			var9 = var7 & 31; // L: 5862
			var10 = class156.Entity_unpackID(var5); // L: 5863
			ObjectComposition var20 = PlayerComposition.getObjectDefinition(var10); // L: 5864
			if (var20.mapSceneId != -1) { // L: 5865
				IndexedSprite var28 = WorldMapArea.mapSceneSprites[var20.mapSceneId]; // L: 5866
				if (var28 != null) { // L: 5867
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 5868
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 5869
					var28.drawAt(var26 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48); // L: 5870
				}
			} else if (var9 == 9) { // L: 5873
				int var25 = 15658734; // L: 5874
				boolean var27 = var5 != 0L; // L: 5877
				if (var27) { // L: 5878
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 5881
					var27 = !var21; // L: 5883
				}

				if (var27) { // L: 5887
					var25 = 15597568;
				}

				int[] var22 = class11.sceneMinimapSprite.pixels; // L: 5888
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5889
				if (var8 != 0 && var8 != 2) { // L: 5890
					var22[var29] = var25; // L: 5897
					var22[var29 + 1 + 512] = var25; // L: 5898
					var22[var29 + 1024 + 2] = var25; // L: 5899
					var22[var29 + 1536 + 3] = var25; // L: 5900
				} else {
					var22[var29 + 1536] = var25; // L: 5891
					var22[var29 + 1 + 1024] = var25; // L: 5892
					var22[var29 + 512 + 2] = var25; // L: 5893
					var22[var29 + 3] = var25; // L: 5894
				}
			}
		}

		var5 = MusicPatchNode.scene.getFloorDecorationTag(var0, var1, var2); // L: 5904
		if (var5 != 0L) { // L: 5905
			var7 = class156.Entity_unpackID(var5); // L: 5906
			ObjectComposition var23 = PlayerComposition.getObjectDefinition(var7); // L: 5907
			if (var23.mapSceneId != -1) { // L: 5908
				IndexedSprite var24 = WorldMapArea.mapSceneSprites[var23.mapSceneId]; // L: 5909
				if (var24 != null) { // L: 5910
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5911
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5912
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var11 + 48); // L: 5913
				}
			}
		}

	} // L: 5917

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982981660"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class120.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, Client.packetWriter.isaacCipher); // L: 11970
		var0.packetBuffer.writeByte(0); // L: 11971
		Client.packetWriter.addNode(var0); // L: 11972
	} // L: 11973
}
