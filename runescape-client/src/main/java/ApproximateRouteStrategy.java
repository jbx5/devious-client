import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("w")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -541999579
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1628203189
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	ApproximateRouteStrategy() {
	} // L: 12277

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILgj;I)Z",
		garbageValue = "-385329000"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12281
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2062628259"
	)
	public static int method1169(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-2056812499"
	)
	public static void method1170(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 310
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 312
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 313
			} catch (Exception var3) { // L: 315
			}
		}

	} // L: 317

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1849517626"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2793
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2796
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2799
		KitDefinition.KitDefinition_cached.clear(); // L: 2802
		MusicPatch.method5606(); // L: 2804
		NPCComposition.NpcDefinition_cached.clear(); // L: 2806
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2807
		ItemComposition.ItemDefinition_cached.clear(); // L: 2810
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 2811
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 2812
		UserComparator8.method2742(); // L: 2814
		class97.method2584(); // L: 2815
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2817
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2820
		class127.HitSplatDefinition_cachedSprites.method7724(); // L: 2822
		class150.HitSplatDefinition_cached.method7724(); // L: 2823
		class97.method2587(); // L: 2824
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 2826
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 2827
		AttackOption.method2557(); // L: 2829
		ParamComposition.ParamDefinition_cached.clear(); // L: 2831
		class287.method5687(); // L: 2833
		Ignored.method6968(); // L: 2834
		DbRowType.DBRowType_cache.clear(); // L: 2836
		Client.DBTableIndex_cache.clear(); // L: 2838
		Client.DBTableMasterIndex_cache.clear(); // L: 2839
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2841
		class292.method5724(); // L: 2843
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2844
		Script.Script_cached.clear(); // L: 2845
		DevicePcmPlayerProvider.archive5.clearFiles(); // L: 2846
		HorizontalAlignment.field1926.clearFiles(); // L: 2847
		class301.archive7.clearFiles(); // L: 2848
		UserComparator10.archive4.clearFiles(); // L: 2849
		class434.archive9.clearFiles(); // L: 2850
		class14.archive6.clearFiles(); // L: 2851
		FaceNormal.archive11.clearFiles(); // L: 2852
		ChatChannel.archive8.clearFiles(); // L: 2853
		class83.field1081.clearFiles(); // L: 2854
		class163.archive10.clearFiles(); // L: 2855
		class283.field3325.clearFiles(); // L: 2856
		class102.archive12.clearFiles(); // L: 2857
		PcmPlayer.field308.clearFiles(); // L: 2858
		MusicPatchNode.scene.clear(); // L: 2860

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2861
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2862
		TaskHandler.method3435(2); // L: 2863
		Client.currentTrackGroupId = -1; // L: 2864
		Client.playingJingle = false; // L: 2865
		class303.method5918(); // L: 2866
		Coord.updateGameState(10); // L: 2867
	} // L: 2868

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1905973140"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = JagexCache.getWidgetChild(var1, var2); // L: 9269
		if (var5 != null) { // L: 9270
			if (var5.onOp != null) { // L: 9271
				ScriptEvent var6 = new ScriptEvent(); // L: 9272
				var6.widget = var5; // L: 9273
				var6.opIndex = var0; // L: 9274
				var6.targetName = var4; // L: 9275
				var6.args = var5.onOp; // L: 9276
				class348.runScriptEvent(var6); // L: 9277
			}

			boolean var11 = true; // L: 9279
			if (var5.contentType > 0) { // L: 9280
				var11 = SoundSystem.method817(var5);
			}

			if (var11) { // L: 9281
				int var8 = class97.getWidgetFlags(var5); // L: 9283
				int var9 = var0 - 1; // L: 9284
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9286
				if (var7) { // L: 9288
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9291
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher); // L: 9293
						var10.packetBuffer.writeInt(var1); // L: 9294
						var10.packetBuffer.writeShort(var2); // L: 9295
						var10.packetBuffer.writeShort(var3); // L: 9296
						Client.packetWriter.addNode(var10); // L: 9297
					}

					if (var0 == 2) { // L: 9299
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher); // L: 9301
						var10.packetBuffer.writeInt(var1); // L: 9302
						var10.packetBuffer.writeShort(var2); // L: 9303
						var10.packetBuffer.writeShort(var3); // L: 9304
						Client.packetWriter.addNode(var10); // L: 9305
					}

					if (var0 == 3) { // L: 9307
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher); // L: 9309
						var10.packetBuffer.writeInt(var1); // L: 9310
						var10.packetBuffer.writeShort(var2); // L: 9311
						var10.packetBuffer.writeShort(var3); // L: 9312
						Client.packetWriter.addNode(var10); // L: 9313
					}

					if (var0 == 4) { // L: 9315
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher); // L: 9317
						var10.packetBuffer.writeInt(var1); // L: 9318
						var10.packetBuffer.writeShort(var2); // L: 9319
						var10.packetBuffer.writeShort(var3); // L: 9320
						Client.packetWriter.addNode(var10); // L: 9321
					}

					if (var0 == 5) { // L: 9323
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher); // L: 9325
						var10.packetBuffer.writeInt(var1); // L: 9326
						var10.packetBuffer.writeShort(var2); // L: 9327
						var10.packetBuffer.writeShort(var3); // L: 9328
						Client.packetWriter.addNode(var10); // L: 9329
					}

					if (var0 == 6) { // L: 9331
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher); // L: 9333
						var10.packetBuffer.writeInt(var1); // L: 9334
						var10.packetBuffer.writeShort(var2); // L: 9335
						var10.packetBuffer.writeShort(var3); // L: 9336
						Client.packetWriter.addNode(var10); // L: 9337
					}

					if (var0 == 7) { // L: 9339
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher); // L: 9341
						var10.packetBuffer.writeInt(var1); // L: 9342
						var10.packetBuffer.writeShort(var2); // L: 9343
						var10.packetBuffer.writeShort(var3); // L: 9344
						Client.packetWriter.addNode(var10); // L: 9345
					}

					if (var0 == 8) { // L: 9347
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher); // L: 9349
						var10.packetBuffer.writeInt(var1); // L: 9350
						var10.packetBuffer.writeShort(var2); // L: 9351
						var10.packetBuffer.writeShort(var3); // L: 9352
						Client.packetWriter.addNode(var10); // L: 9353
					}

					if (var0 == 9) { // L: 9355
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher); // L: 9357
						var10.packetBuffer.writeInt(var1); // L: 9358
						var10.packetBuffer.writeShort(var2); // L: 9359
						var10.packetBuffer.writeShort(var3); // L: 9360
						Client.packetWriter.addNode(var10); // L: 9361
					}

					if (var0 == 10) { // L: 9363
						var10 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher); // L: 9365
						var10.packetBuffer.writeInt(var1); // L: 9366
						var10.packetBuffer.writeShort(var2); // L: 9367
						var10.packetBuffer.writeShort(var3); // L: 9368
						Client.packetWriter.addNode(var10); // L: 9369
					}

				}
			}
		}
	} // L: 9289 9371
}
