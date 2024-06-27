import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class230 extends Node {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 175701861
	)
	public int field2445;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1937087623
	)
	public int field2443;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1374695771
	)
	public int field2440;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	public Widget field2444;

	@ObfuscatedSignature(
		descriptor = "(IIILnx;)V"
	)
	public class230(int var1, int var2, int var3, Widget var4) {
		this.field2440 = var1;
		this.field2445 = var2;
		this.field2443 = var3;
		this.field2444 = var4;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;IB)V",
		garbageValue = "-13"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		if (var1.spotAnimation >= Client.cycle) {
			WorldMapScaleHandler.method5152(var1);
		} else {
			int var4;
			int var5;
			int var6;
			int var8;
			int var9;
			if (var1.field1260 >= Client.cycle) {
				boolean var12 = Client.cycle == var1.field1260 || var1.sequence == -1 || var1.sequenceDelay != 0;
				if (!var12) {
					SequenceDefinition var13 = class353.SequenceDefinition_get(var1.sequence);
					if (var13 != null && !var13.isCachedModelIdSet()) {
						var12 = var1.sequenceFrameCycle + 1 > var13.frameLengths[var1.sequenceFrame];
					} else {
						var12 = true;
					}
				}

				if (var12) {
					var4 = var1.field1260 - var1.spotAnimation;
					var5 = Client.cycle - var1.spotAnimation;
					var6 = var1.field1194 * 64 + var1.field1242 * 128;
					int var14 = var1.field1194 * 64 + var1.field1244 * 128;
					var8 = var1.field1194 * 64 + var1.field1243 * 128;
					var9 = var1.field1194 * 64 + var1.field1245 * 128;
					var1.x = (var5 * var8 + var6 * (var4 - var5)) / var4;
					var1.y = (var9 * var5 + var14 * (var4 - var5)) / var4;
				}

				var1.field1264 = 0;
				var1.orientation = var1.field1248;
				var1.rotation = var1.orientation;
			} else {
				var1.movementSequence = var1.idleSequence;
				if (var1.pathLength == 0) {
					var1.field1264 = 0;
				} else {
					label375: {
						if (var1.sequence != -1 && var1.sequenceDelay == 0) {
							SequenceDefinition var3 = class353.SequenceDefinition_get(var1.sequence);
							if (var1.field1265 > 0 && var3.field2303 == 0) {
								++var1.field1264;
								break label375;
							}

							if (var1.field1265 <= 0 && var3.field2283 == 0) {
								++var1.field1264;
								break label375;
							}
						}

						int var15 = var1.x;
						var4 = var1.y;
						var5 = var1.field1194 * 64 + var1.pathX[var1.pathLength - 1] * 128;
						var6 = var1.pathY[var1.pathLength - 1] * 128 + var1.field1194 * 64;
						if (var15 < var5) {
							if (var4 < var6) {
								var1.orientation = 1280;
							} else if (var4 > var6) {
								var1.orientation = 1792;
							} else {
								var1.orientation = 1536;
							}
						} else if (var15 > var5) {
							if (var4 < var6) {
								var1.orientation = 768;
							} else if (var4 > var6) {
								var1.orientation = 256;
							} else {
								var1.orientation = 512;
							}
						} else if (var4 < var6) {
							var1.orientation = 1024;
						} else if (var4 > var6) {
							var1.orientation = 0;
						}

						class238 var7 = var1.pathTraversed[var1.pathLength - 1];
						if (var5 - var15 <= 256 && var5 - var15 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
							var8 = var1.orientation - var1.rotation & 2047;
							if (var8 > 1024) {
								var8 -= 2048;
							}

							var9 = var1.walkBackSequence;
							if (var8 >= -256 && var8 <= 256) {
								var9 = var1.walkSequence;
							} else if (var8 >= 256 && var8 < 768) {
								var9 = var1.walkRightSequence;
							} else if (var8 >= -768 && var8 <= -256) {
								var9 = var1.walkLeftSequence;
							}

							if (var9 == -1) {
								var9 = var1.walkSequence;
							}

							var1.movementSequence = var9;
							int var10 = 4;
							boolean var11 = true;
							if (var1 instanceof NPC) {
								var11 = ((NPC)var1).definition.isClipped;
							}

							if (var11) {
								if (var1.rotation != var1.orientation && var1.targetIndex == -1 && var1.field1259 != 0) {
									var10 = 2;
								}

								if (var1.pathLength > 2) {
									var10 = 6;
								}

								if (var1.pathLength > 3) {
									var10 = 8;
								}

								if (var1.field1264 > 0 && var1.pathLength > 1) {
									var10 = 8;
									--var1.field1264;
								}
							} else {
								if (var1.pathLength > 1) {
									var10 = 6;
								}

								if (var1.pathLength > 2) {
									var10 = 8;
								}

								if (var1.field1264 > 0 && var1.pathLength > 1) {
									var10 = 8;
									--var1.field1264;
								}
							}

							if (var7 == class238.field2509) {
								var10 <<= 1;
							} else if (var7 == class238.field2520) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var1.walkSequence == var1.movementSequence && var1.runSequence != -1) {
									var1.movementSequence = var1.runSequence;
								} else if (var1.walkBackSequence == var1.movementSequence && var1.field1262 != -1) {
									var1.movementSequence = var1.field1262;
								} else if (var1.movementSequence == var1.walkLeftSequence && var1.field1219 != -1) {
									var1.movementSequence = var1.field1219;
								} else if (var1.walkRightSequence == var1.movementSequence && var1.field1202 != -1) {
									var1.movementSequence = var1.field1202;
								}
							} else if (var10 <= 2) {
								if (var1.movementSequence == var1.walkSequence && var1.field1205 != -1) {
									var1.movementSequence = var1.field1205;
								} else if (var1.walkBackSequence == var1.movementSequence && var1.field1208 != -1) {
									var1.movementSequence = var1.field1208;
								} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1249 != -1) {
									var1.movementSequence = var1.field1249;
								} else if (var1.movementSequence == var1.walkRightSequence && var1.field1210 != -1) {
									var1.movementSequence = var1.field1210;
								}
							}

							if (var5 != var15 || var4 != var6) {
								if (var15 < var5) {
									var1.x += var10;
									if (var1.x > var5) {
										var1.x = var5;
									}
								} else if (var15 > var5) {
									var1.x -= var10;
									if (var1.x < var5) {
										var1.x = var5;
									}
								}

								if (var4 < var6) {
									var1.y += var10;
									if (var1.y > var6) {
										var1.y = var6;
									}
								} else if (var4 > var6) {
									var1.y -= var10;
									if (var1.y < var6) {
										var1.y = var6;
									}
								}
							}

							if (var5 == var1.x && var6 == var1.y) {
								--var1.pathLength;
								if (var1.field1265 > 0) {
									--var1.field1265;
								}
							}
						} else {
							var1.x = var5;
							var1.y = var6;
							--var1.pathLength;
							if (var1.field1265 > 0) {
								--var1.field1265;
							}
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1260 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1194 * 64;
			var1.y = var1.pathY[0] * 128 + var1.field1194 * 64;
			var1.method2483();
		}

		if (var1 == SoundCache.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1260 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1194 * 64;
			var1.y = var1.field1194 * 64 + var1.pathY[0] * 128;
			var1.method2483();
		}

		class161.method3429(var0, var1);
		class386.method7176(var1);
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	static void method4374() {
		if (Client.oculusOrbState == 1) {
			Client.field712 = true;
		}

	}
}
