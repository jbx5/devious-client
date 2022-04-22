import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("v")
	static boolean field2151;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1013494467)

	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("q")
	public Map field2144;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1880627603)

	int field2152;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	2046803879)

	int field2160;
	@ObfuscatedName("p")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("w")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("k")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("d")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-1070190955)

	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("u")
	int[] field2146;
	@ObfuscatedName("t")
	boolean[] field2156;
	@ObfuscatedName("g")
	public boolean field2154;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	118490245)

	public int field2155;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	1252279117)

	@Export("shield")
	public int shield;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	221867971)

	@Export("weapon")
	public int weapon;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	290936429)

	public int field2138;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-1964566761)

	public int field2159;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	1376607035)

	public int field2158;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1493621085)

	public int field2161;
	static 
	{
		field2151 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2152 = 0;
		this.field2160 = 0;
		this.frameCount = -1;
		this.field2154 = false;
		this.field2155 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2138 = 99;
		this.field2159 = -1;
		this.field2158 = -1;
		this.field2161 = 2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;S)V", garbageValue = 
	"-208")

	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-1513978235")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2146 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2146[var4] = var1.readUnsignedByte();
			}

			this.field2146[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2154 = true;
		} else if (var2 == 5) {
			this.field2155 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2138 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2159 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2158 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2161 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) {
			this.SequenceDefinition_cachedModelId = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2144 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2144.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2152 = var1.readUnsignedShort();
			this.field2160 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2156 = new boolean[256];

			for (var3 = 0; var3 < this.field2156.length; ++var3) {
				this.field2156[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2156[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	@Export("postDecode")
	void postDecode() {
		if (this.field2159 == (-1)) {
			if ((this.field2146 == null) && (this.field2156 == null)) {
				this.field2159 = 0;
			} else {
				this.field2159 = 2;
			}
		}

		if (this.field2158 == (-1)) {
			if ((this.field2146 == null) && (this.field2156 == null)) {
				this.field2158 = 0;
			} else {
				this.field2158 = 2;
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Liq;II)Liq;", garbageValue = 
	"741452141")

	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class115.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class342.method6314(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2768());
				var4.method5000(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Liq;III)Liq;", garbageValue = 
	"-2020846308")

	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class115.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class122 var4 = class342.method6314(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2768());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5000(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Liq;IS)Liq;", garbageValue = 
	"21409")

	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class115.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class342.method6314(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2768());
				var4.method5000(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Liq;ILgw;IB)Liq;", garbageValue = 
	"4")

	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if ((field2151 && (!this.isCachedModelIdSet())) && (!var3.isCachedModelIdSet())) {
			return this.method3791(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			class122 var8;
			if (this.isCachedModelIdSet()) {
				var8 = this.method3801();
				if (var3.isCachedModelIdSet() && (this.field2156 == null)) {
					var5.method5000(var8, var2);
					return var5;
				}

				var5.method4965(var8, var2, this.field2156, false);
			} else {
				var2 = this.frameIds[var2];
				var7 = class115.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if ((!var3.isCachedModelIdSet()) && ((this.field2146 == null) || (var4 == (-1)))) {
					var5.animate(var7, var2);
					return var5;
				}

				if ((this.field2146 == null) || (var4 == (-1))) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4981(var7, var2, this.field2146, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var8 = var3.method3801();
				var5.method4965(var8, var4, this.field2156, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var9 = class115.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var9 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4981(var9, var4, this.field2146, true);
			}

			if (var6 && (var7 != null)) {
				var5.method4981(var7, var2, this.field2146, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Liq;ILgw;II)Liq;", garbageValue = 
	"136721627")

	Model method3791(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class115.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class115.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel((!var5.hasAlphaTransform(var2)) & (!var6.hasAlphaTransform(var4)));
				var7.animate2(var5, var2, var6, var4, this.field2146);
				return var7;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Liq;II)Liq;", garbageValue = 
	"242613872")

	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class115.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if ((this.chatFrameIds != null) && (var2 < this.chatFrameIds.length)) {
					var6 = this.chatFrameIds[var2];
					var5 = class115.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if ((var5 != null) && (var6 != 65535)) {
					var7 = var1.toSharedSequenceModel((!var4.hasAlphaTransform(var3)) & (!var5.hasAlphaTransform(var6)));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-2016485024")

	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2003317016")

	public int method3844() {
		return this.field2160 - this.field2152;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)Ldo;", garbageValue = 
	"-1683695849")

	public class122 method3801() {
		return this.isCachedModelIdSet() ? class342.method6314(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"646079411")

	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (((GrandExchangeEvents.localPlayer.x >> 7) == Client.destinationX) && ((GrandExchangeEvents.localPlayer.y >> 7) == Client.destinationY)) {
			Client.destinationX = 0;
		}

		LoginPacket.method5192();
		if ((Client.combatTargetPlayerIndex >= 0) && (Client.players[Client.combatTargetPlayerIndex] != null)) {
			ArchiveLoader.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		MusicPatch.addNpcsToScene(true);
		Varcs.method2463();
		MusicPatch.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = ((Projectile) (Client.projectiles.last())); var4 != null; var4 = ((Projectile) (Client.projectiles.previous()))) {
			if ((var4.plane == class18.Client_plane) && (Client.cycle <= var4.cycleEnd)) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var23 = Client.npcs[var4.targetIndex - 1];
						if (((((var23 != null) && (var23.x >= 0)) && (var23.x < 13312)) && (var23.y >= 0)) && (var23.y < 13312)) {
							var4.setDestination(var23.x, var23.y, WorldMapLabel.getTileHeight(var23.x, var23.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = (-var4.targetIndex) - 1;
						Player var25;
						if (var6 == Client.localPlayerIndex) {
							var25 = GrandExchangeEvents.localPlayer;
						} else {
							var25 = Client.players[var6];
						}

						if (((((var25 != null) && (var25.x >= 0)) && (var25.x < 13312)) && (var25.y >= 0)) && (var25.y < 13312)) {
							var4.setDestination(var25.x, var25.y, WorldMapLabel.getTileHeight(var25.x, var25.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field556);
					ArchiveLoader.scene.drawEntity(class18.Client_plane, ((int) (var4.x)), ((int) (var4.y)), ((int) (var4.z)), 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		class128.method2854();
		class17.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var22 = Client.camAngleX;
		if ((Client.field718 / 256) > var22) {
			var22 = Client.field718 / 256;
		}

		if (Client.field546[4] && ((Client.field636[4] + 128) > var22)) {
			var22 = Client.field636[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		var6 = class10.oculusOrbFocalPointX;
		int var7 = Decimator.field397;
		int var8 = ClientPacket.oculusOrbFocalPointY;
		int var9 = (var22 * 3) + 600;
		int var10 = class13.method164(var9, var3);
		int var11 = (2048 - var22) & 2047;
		int var12 = (2048 - var5) & 2047;
		int var13 = 0;
		int var14 = 0;
		int var15 = var10;
		int var16;
		int var17;
		int var18;
		if (var11 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var11];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var18 = ((var14 * var17) - (var16 * var10)) >> 16;
			var15 = ((var16 * var14) + (var10 * var17)) >> 16;
			var14 = var18;
		}

		if (var12 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var12];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
			var18 = ((var17 * var13) + (var15 * var16)) >> 16;
			var15 = ((var15 * var17) - (var13 * var16)) >> 16;
			var13 = var18;
		}

		if (Client.isCameraLocked) {
			class93.field1253 = var6 - var13;
			PcmPlayer.field294 = var7 - var14;
			WorldMapElement.field1837 = var8 - var15;
			ObjectComposition.field2065 = var22;
			class21.field116 = var5;
		} else {
			WorldMapLabelSize.cameraX = var6 - var13;
			ItemContainer.cameraY = var7 - var14;
			class154.cameraZ = var8 - var15;
			class147.cameraPitch = var22;
			class21.cameraYaw = var5;
		}

		if ((((Client.oculusOrbState == 1) && (Client.staffModLevel >= 2)) && ((Client.cycle % 50) == 0)) && (((class10.oculusOrbFocalPointX >> 7) != (GrandExchangeEvents.localPlayer.x >> 7)) || ((ClientPacket.oculusOrbFocalPointY >> 7) != (GrandExchangeEvents.localPlayer.y >> 7)))) {
			var16 = GrandExchangeEvents.localPlayer.plane;
			var17 = (class10.oculusOrbFocalPointX >> 7) + GrandExchangeOfferOwnWorldComparator.baseX;
			var18 = (ClientPacket.oculusOrbFocalPointY >> 7) + VarcInt.baseY;
			StructComposition.method3619(var17, var18, var16, true);
		}

		int var19;
		int var20;
		int var21;
		if (!Client.isCameraLocked) {
			if (class131.clientPreferences.method2263()) {
				var12 = class18.Client_plane;
			} else {
				label405 : {
					var13 = 3;
					if (class147.cameraPitch < 310) {
						label402 : {
							if (Client.oculusOrbState == 1) {
								var14 = class10.oculusOrbFocalPointX >> 7;
								var15 = ClientPacket.oculusOrbFocalPointY >> 7;
							} else {
								var14 = GrandExchangeEvents.localPlayer.x >> 7;
								var15 = GrandExchangeEvents.localPlayer.y >> 7;
							}

							var16 = WorldMapLabelSize.cameraX >> 7;
							var17 = class154.cameraZ >> 7;
							if ((((var16 >= 0) && (var17 >= 0)) && (var16 < 104)) && (var17 < 104)) {
								if ((((var14 >= 0) && (var15 >= 0)) && (var14 < 104)) && (var15 < 104)) {
									if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) {
										var13 = class18.Client_plane;
									}

									if (var14 > var16) {
										var18 = var14 - var16;
									} else {
										var18 = var16 - var14;
									}

									if (var15 > var17) {
										var19 = var15 - var17;
									} else {
										var19 = var17 - var15;
									}

									if (var18 > var19) {
										var20 = (var19 * 65536) / var18;
										var21 = 32768;

										while (true) {
											if (var14 == var16) {
												break label402;
											}

											if (var16 < var14) {
												++var16;
											} else if (var16 > var14) {
												--var16;
											}

											if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) {
												var13 = class18.Client_plane;
											}

											var21 += var20;
											if (var21 >= 65536) {
												var21 -= 65536;
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}

												if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) {
													var13 = class18.Client_plane;
												}
											}
										} 
									} else {
										if (var19 > 0) {
											var20 = (var18 * 65536) / var19;
											var21 = 32768;

											while (var15 != var17) {
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}

												if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) {
													var13 = class18.Client_plane;
												}

												var21 += var20;
												if (var21 >= 65536) {
													var21 -= 65536;
													if (var16 < var14) {
														++var16;
													} else if (var16 > var14) {
														--var16;
													}

													if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) {
														var13 = class18.Client_plane;
													}
												}
											} 
										}
										break label402;
									}
								}

								var12 = class18.Client_plane;
								break label405;
							}

							var12 = class18.Client_plane;
							break label405;
						}
					}

					if ((((GrandExchangeEvents.localPlayer.x >= 0) && (GrandExchangeEvents.localPlayer.y >= 0)) && (GrandExchangeEvents.localPlayer.x < 13312)) && (GrandExchangeEvents.localPlayer.y < 13312)) {
						if ((Tiles.Tiles_renderFlags[class18.Client_plane][GrandExchangeEvents.localPlayer.x >> 7][GrandExchangeEvents.localPlayer.y >> 7] & 4) != 0) {
							var13 = class18.Client_plane;
						}

						var12 = var13;
					} else {
						var12 = class18.Client_plane;
					}
				}
			}

			var11 = var12;
		} else {
			if (class131.clientPreferences.method2263()) {
				var12 = class18.Client_plane;
			} else {
				var13 = WorldMapLabel.getTileHeight(WorldMapLabelSize.cameraX, class154.cameraZ, class18.Client_plane);
				if (((var13 - ItemContainer.cameraY) < 800) && ((Tiles.Tiles_renderFlags[class18.Client_plane][WorldMapLabelSize.cameraX >> 7][class154.cameraZ >> 7] & 4) != 0)) {
					var12 = class18.Client_plane;
				} else {
					var12 = 3;
				}
			}

			var11 = var12;
		}

		var12 = WorldMapLabelSize.cameraX;
		var13 = ItemContainer.cameraY;
		var14 = class154.cameraZ;
		var15 = class147.cameraPitch;
		var16 = class21.cameraYaw;

		for (var17 = 0; var17 < 5; ++var17) {
			if (Client.field546[var17]) {
				var18 = ((int) (((Math.random() * ((double) ((Client.field756[var17] * 2) + 1))) - ((double) (Client.field756[var17]))) + (Math.sin((((double) (Client.field674[var17])) / 100.0) * ((double) (Client.field600[var17]))) * ((double) (Client.field636[var17])))));
				if (var17 == 0) {
					WorldMapLabelSize.cameraX += var18;
				}

				if (var17 == 1) {
					ItemContainer.cameraY += var18;
				}

				if (var17 == 2) {
					class154.cameraZ += var18;
				}

				if (var17 == 3) {
					class21.cameraYaw = (var18 + class21.cameraYaw) & 2047;
				}

				if (var17 == 4) {
					class147.cameraPitch += var18;
					if (class147.cameraPitch < 128) {
						class147.cameraPitch = 128;
					}

					if (class147.cameraPitch > 383) {
						class147.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x;
		var18 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var17 = MouseHandler.MouseHandler_lastPressedX;
			var18 = MouseHandler.MouseHandler_lastPressedY;
		}

		if ((((var17 >= var0) && (var17 < (var0 + var2))) && (var18 >= var1)) && (var18 < (var3 + var1))) {
			var19 = var17 - var0;
			var20 = var18 - var1;
			ViewportMouse.ViewportMouse_x = var19;
			ViewportMouse.ViewportMouse_y = var20;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			class82.method2104();
		}

		class116.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class116.playPcmPlayers();
		var19 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		ArchiveLoader.scene.draw(WorldMapLabelSize.cameraX, ItemContainer.cameraY, class154.cameraZ, class147.cameraPitch, class21.cameraYaw, var11);
		Rasterizer3D.Rasterizer3D_zoom = var19;
		class116.playPcmPlayers();
		ArchiveLoader.scene.clearTempGameObjects();
		MouseRecorder.method2096(var0, var1, var2, var3);
		class12.method158(var0, var1);
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).animate(Client.field556);
		class260.method5173();
		WorldMapLabelSize.cameraX = var12;
		ItemContainer.cameraY = var13;
		class154.cameraZ = var14;
		class147.cameraPitch = var15;
		class21.cameraYaw = var16;
		if (Client.isLoading) {
			byte var24 = 0;
			var21 = (var24 + NetCache.NetCache_pendingPriorityWritesCount) + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var21 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			MusicPatch.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}