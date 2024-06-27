import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 570349149
	)
	static int field3672;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lna;[IIIII)V",
		garbageValue = "-1315319686"
	)
	void method6401(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3608[var1.field3685] & 4) != 0 && var1.field3680 < 0) {
			int var6 = this.superStream.field3613[var1.field3685] / PcmPlayer.field263;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3695) / var6;
				if (var7 > var4) {
					var1.field3695 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3695 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field263 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3611[var1.field3685] == 0) {
					var1.stream = RawPcmStream.method908(var1.rawSound, var10.method923(), var10.method914(), var10.method1010());
				} else {
					var1.stream = RawPcmStream.method908(var1.rawSound, var10.method923(), 0, var10.method1010());
					this.superStream.method6205(var1, var1.table.field3654[var1.field3675] < 0);
					var1.stream.method919(var8, var10.method914());
				}

				if (var1.table.field3654[var1.field3675] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method921(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method916()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lna;II)V",
		garbageValue = "454354783"
	)
	void method6393(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3608[var1.field3685] & 4) != 0 && var1.field3680 < 0) {
			int var3 = this.superStream.field3613[var1.field3685] / PcmPlayer.field263;
			int var4 = (var3 + 1048575 - var1.field3695) / var3;
			var1.field3695 = var3 * var2 + var1.field3695 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3611[var1.field3685] == 0) {
					var1.stream = RawPcmStream.method908(var1.rawSound, var1.stream.method923(), var1.stream.method914(), var1.stream.method1010());
				} else {
					var1.stream = RawPcmStream.method908(var1.rawSound, var1.stream.method923(), 0, var1.stream.method1010());
					this.superStream.method6205(var1, var1.table.field3654[var1.field3675] < 0);
				}

				if (var1.table.field3654[var1.field3675] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3695 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("av")
	protected int vmethod6390() {
		return 0;
	}

	@ObfuscatedName("ab")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6256(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3691) {
						this.method6401(var6, var1, var4, var5, var5 + var4);
						var6.field3691 -= var5;
						break;
					}

					this.method6401(var6, var1, var4, var6.field3691, var5 + var4);
					var4 += var6.field3691;
					var5 -= var6.field3691;
				} while(!this.superStream.method6278(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ae")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6256(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3691) {
						this.method6393(var3, var2);
						var3.field3691 -= var2;
						break;
					}

					this.method6393(var3, var3.field3691);
					var2 -= var3.field3691;
				} while(!this.superStream.method6278(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-215069565"
	)
	public static int method6418(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnx;Lne;ZI)V",
		garbageValue = "1239073100"
	)
	public static void method6417(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3838 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3838.equipment = Arrays.copyOf(var0.field3838.field3771, var0.field3838.field3771.length);
			var0.field3838.method6538();
		}

	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		class7.method55(false);
		Client.field778 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class279.regionLandArchives.length; ++var1) {
			if (UrlRequest.regionMapArchiveIds[var1] != -1 && class279.regionLandArchives[var1] == null) {
				class279.regionLandArchives[var1] = class157.archive9.takeFile(UrlRequest.regionMapArchiveIds[var1], 0);
				if (class279.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field778;
				}
			}

			if (class131.regionLandArchiveIds[var1] != -1 && ModeWhere.regionMapArchives[var1] == null) {
				ModeWhere.regionMapArchives[var1] = class157.archive9.takeFileEncrypted(class131.regionLandArchiveIds[var1], 0, UserComparator10.xteaKeys[var1]);
				if (ModeWhere.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field778;
				}
			}
		}

		if (!var0) {
			Client.field575 = 1;
		} else {
			Client.field573 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class279.regionLandArchives.length; ++var1) {
				byte[] var17 = ModeWhere.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class76.regions[var1] >> 8) * 64 - class511.topLevelWorldView.baseX;
					var4 = (class76.regions[var1] & 255) * 64 - class511.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class4.method16(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field575 = 2;
			} else {
				if (Client.field575 != 0) {
					class59.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class157.method3347();
				class511.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class511.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class511.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				class157.method3347();
				class224.method4301();
				var1 = class279.regionLandArchives.length;
				class60.method1172();
				class7.method55(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class76.regions[var2] >> 8) * 64 - class511.topLevelWorldView.baseX;
						var4 = (class76.regions[var2] & 255) * 64 - class511.topLevelWorldView.baseY;
						var16 = class279.regionLandArchives[var2];
						if (var16 != null) {
							class157.method3347();
							Login.method2220(class511.topLevelWorldView, var16, var3, var4, Skeleton.field2915 * 8 - 48, PlayerUpdateManager.field1418 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class76.regions[var2] >> 8) * 64 - class511.topLevelWorldView.baseX;
						var4 = (class76.regions[var2] & 255) * 64 - class511.topLevelWorldView.baseY;
						var16 = class279.regionLandArchives[var2];
						if (var16 == null && PlayerUpdateManager.field1418 < 800) {
							class157.method3347();
							TextureProvider.method5720(class511.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					class7.method55(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = ModeWhere.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class76.regions[var2] >> 8) * 64 - class511.topLevelWorldView.baseX;
							var5 = (class76.regions[var2] & 255) * 64 - class511.topLevelWorldView.baseY;
							class157.method3347();
							class235.method4451(class511.topLevelWorldView, var15, var4, var5);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						class157.method3347();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class76.regions.length; ++var12) {
										if (class76.regions[var12] == var11 && class279.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											FileSystem.method4224(class511.topLevelWorldView, class279.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									ScriptFrame.method1193(class511.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								TextureProvider.method5720(class511.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class7.method55(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class157.method3347();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class76.regions.length; ++var11) {
										if (class76.regions[var11] == var10 && ModeWhere.regionMapArchives[var11] != null) {
											Tiles.method2287(class511.topLevelWorldView, ModeWhere.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				class7.method55(true);
				class157.method3347();
				class36.method709(class511.topLevelWorldView);
				class7.method55(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class511.topLevelWorldView.plane) {
					var2 = class511.topLevelWorldView.plane;
				}

				if (var2 < class511.topLevelWorldView.plane - 1) {
					var2 = class511.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class511.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class511.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class237.method4498(class511.topLevelWorldView, var3, var4);
					}
				}

				class157.method3347();
				class498.method8901();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class415.client.hasFrame()) {
					var19 = class170.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (Skeleton.field2915 - 6) / 8;
					var4 = (Skeleton.field2915 + 6) / 8;
					var5 = (PlayerUpdateManager.field1418 - 6) / 8;
					var6 = (PlayerUpdateManager.field1418 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class157.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class157.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class157.method3347();
				class328.method6151();
				var19 = class170.getPacketBufferNode(ClientPacket.field3317, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				FriendLoginUpdate.method8525();
				Client.field509 = false;
			}
		}
	}
}
