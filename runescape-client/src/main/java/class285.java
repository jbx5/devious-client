import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("js")
public class class285 {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "Lkx;")
	static StudioGame field3313;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-739713756")
	public static int method5516(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(descriptor = "(Lcj;II)V", garbageValue = "-2146563022")
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1184 >= Client.cycle) {
			GrandExchangeOfferTotalQuantityComparator.method5970(var0);
		} else if (var0.field1194 >= Client.cycle) {
			if (var0.field1194 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > ScriptFrame.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
				var2 = var0.field1194 - var0.field1184;
				var3 = Client.cycle - var0.field1184;
				var4 = var0.field1205 * 64 + var0.field1140 * 128;
				int var5 = var0.field1205 * 64 + var0.field1182 * 128;
				int var6 = var0.field1205 * 64 + var0.field1181 * 128;
				int var7 = var0.field1205 * 64 + var0.field1183 * 128;
				var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2;
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2;
			}
			var0.field1202 = 0;
			var0.orientation = var0.field1186;
			var0.rotation = var0.orientation;
		} else {
			KitDefinition.method3439(var0);
		}
		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1184 = 0;
			var0.field1194 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1205 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1205 * 64;
			var0.method2182();
		}
		if (class101.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1184 = 0;
			var0.field1194 = 0;
			var0.x = var0.field1205 * 64 + var0.pathX[0] * 128;
			var0.y = var0.field1205 * 64 + var0.pathY[0] * 128;
			var0.method2182();
		}
		Script.method1977(var0);
		var0.isWalking = false;
		SequenceDefinition var8;
		if (var0.movementSequence != -1) {
			var8 = ScriptFrame.SequenceDefinition_get(var0.movementSequence);
			if (var8 != null) {
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var8.frameIds.length && var0.movementFrameCycle > var8.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class120.method2761(var8, var0.movementFrame, var0.x, var0.y);
					}
					if (var0.movementFrame >= var8.frameIds.length) {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						class120.method2761(var8, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var8.isCachedModelIdSet()) {
					++var0.movementFrame;
					var3 = var8.method3835();
					if (var0.movementFrame < var3) {
						GrandExchangeOfferWorldComparator.method5997(var8, var0.movementFrame, var0.x, var0.y);
					} else {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						GrandExchangeOfferWorldComparator.method5997(var8, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}
		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1178) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}
			var2 = ObjectSound.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var2 != -1) {
				SequenceDefinition var9 = ScriptFrame.SequenceDefinition_get(var2);
				if (var9 != null && var9.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var9.frameIds.length && var0.spotAnimationFrameCycle > var9.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class120.method2761(var9, var0.spotAnimationFrame, var0.x, var0.y);
					}
					if (var0.spotAnimationFrame >= var9.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var9.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else if (var9.isCachedModelIdSet()) {
					++var0.spotAnimationFrame;
					var4 = var9.method3835();
					if (var0.spotAnimationFrame < var4) {
						GrandExchangeOfferWorldComparator.method5997(var9, var0.spotAnimationFrame, var0.x, var0.y);
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var8 = ScriptFrame.SequenceDefinition_get(var0.sequence);
			if (var8.field2187 == 1 && var0.field1203 > 0 && var0.field1184 <= Client.cycle && var0.field1194 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}
		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var8 = ScriptFrame.SequenceDefinition_get(var0.sequence);
			if (var8 == null) {
				var0.sequence = -1;
			} else if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					class120.method2761(var8, var0.sequenceFrame, var0.x, var0.y);
				}
				if (var0.sequenceFrame >= var8.frameIds.length) {
					var0.sequenceFrame -= var8.frameCount;
					++var0.field1190;
					if (var0.field1190 >= var8.field2186) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
						class120.method2761(var8, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}
				var0.isWalking = var8.field2182;
			} else if (var8.isCachedModelIdSet()) {
				++var0.sequenceFrame;
				var3 = var8.method3836().method2767();
				if (var0.sequenceFrame < var3) {
					GrandExchangeOfferWorldComparator.method5997(var8, var0.sequenceFrame, var0.x, var0.y);
				} else {
					var0.sequenceFrame -= var8.frameCount;
					++var0.field1190;
					if (var0.field1190 >= var8.field2186) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
						GrandExchangeOfferWorldComparator.method5997(var8, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}
			} else {
				var0.sequence = -1;
			}
		}
		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(descriptor = "(IIIIIIII)V", garbageValue = "1607228102")
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != PacketWriter.Client_plane) {
				return;
			}
			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = class356.scene.getBoundaryObjectTag(var0, var2, var3);
			}
			if (var1 == 1) {
				var7 = class356.scene.getWallDecorationTag(var0, var2, var3);
			}
			if (var1 == 2) {
				var7 = class356.scene.getGameObjectTag(var0, var2, var3);
			}
			if (var1 == 3) {
				var7 = class356.scene.getFloorDecorationTag(var0, var2, var3);
			}
			int var12;
			if (var7 != 0L) {
				var12 = class356.scene.getObjectFlags(var0, var2, var3, var7);
				int var14 = Decimator.Entity_unpackID(var7);
				int var15 = var12 & 31;
				int var16 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					class356.scene.removeBoundaryObject(var0, var2, var3);
					var13 = class162.getObjectDefinition(var14);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3883(var2, var3, var15, var16, var13.boolean1);
					}
				}
				if (var1 == 1) {
					class356.scene.removeWallDecoration(var0, var2, var3);
				}
				if (var1 == 2) {
					class356.scene.removeGameObject(var0, var2, var3);
					var13 = class162.getObjectDefinition(var14);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}
				if (var1 == 3) {
					class356.scene.removeFloorDecoration(var0, var2, var3);
					var13 = class162.getObjectDefinition(var14);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3886(var2, var3);
					}
				}
			}
			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}
				class142.method3050(var0, var12, var2, var3, var4, var5, var6, class356.scene, Client.collisionMaps[var0]);
			}
		}
	}
}