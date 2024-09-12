import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class425 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lqv;"
	)
	static class425[] field4721;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 576444347
	)
	static int field4717;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1166807659
	)
	static int field4718;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("am")
	float field4716;
	@ObfuscatedName("ax")
	float field4719;
	@ObfuscatedName("aq")
	float field4720;

	static {
		new class425(0.0F, 0.0F, 0.0F);
		new class425(1.0F, 1.0F, 1.0F);
		new class425(1.0F, 0.0F, 0.0F);
		new class425(0.0F, 1.0F, 0.0F);
		new class425(0.0F, 0.0F, 1.0F);
		field4721 = new class425[0];
		class267.method5564(100);
	}

	public class425(float var1, float var2, float var3) {
		this.field4716 = var1;
		this.field4719 = var2;
		this.field4720 = var3;
	}

	class425() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21813"
	)
	void method8084() {
		synchronized(field4721) {
			if (field4718 < field4717 - 1) {
				field4721[++field4718 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1394689078"
	)
	public void method8078(float var1, float var2, float var3) {
		this.field4716 = var1;
		this.field4719 = var2;
		this.field4720 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	final void method8094() {
		this.field4720 = 0.0F;
		this.field4719 = 0.0F;
		this.field4716 = 0.0F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqv;B)Z",
		garbageValue = "50"
	)
	boolean method8074(class425 var1) {
		return var1.field4716 == this.field4716 && var1.field4719 == this.field4719 && this.field4720 == var1.field4720;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-119"
	)
	final float method8073() {
		return (float)Math.sqrt((double)(this.field4720 * this.field4720 + this.field4716 * this.field4716 + this.field4719 * this.field4719));
	}

	public String toString() {
		return this.field4716 + ", " + this.field4719 + ", " + this.field4720;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Ldy;IB)V",
		garbageValue = "-51"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		SequenceDefinition var3;
		int var4;
		int var5;
		int var12;
		SequenceDefinition var13;
		int var14;
		if (var1.spotAnimation >= Client.cycle) {
			var12 = Math.max(1, var1.spotAnimation - Client.cycle);
			var4 = var1.field1227 * 64 + var1.field1257 * 128;
			var5 = var1.field1227 * 64 + var1.field1248 * 128;
			var1.x += (var4 - var1.x) / var12;
			var1.y += (var5 - var1.y) / var12;
			var1.field1290 = 0;
			var1.orientation = var1.field1291;
		} else {
			int var6;
			int var8;
			int var9;
			if (var1.field1233 >= Client.cycle) {
				boolean var17 = Client.cycle == var1.field1233 || var1.sequence == -1 || var1.sequenceDelay != 0;
				if (!var17) {
					var13 = HealthBarUpdate.SequenceDefinition_get(var1.sequence);
					if (var13 != null && !var13.isCachedModelIdSet()) {
						var17 = var1.sequenceFrameCycle + 1 > var13.frameLengths[var1.sequenceFrame];
					} else {
						var17 = true;
					}
				}

				if (var17) {
					var4 = var1.field1233 - var1.spotAnimation;
					var5 = Client.cycle - var1.spotAnimation;
					var6 = var1.field1227 * 64 + var1.field1257 * 128;
					var14 = var1.field1227 * 64 + var1.field1248 * 128;
					var8 = var1.field1227 * 64 + var1.field1276 * 128;
					var9 = var1.field1227 * 64 + var1.field1231 * 128;
					var1.x = (var5 * var8 + var6 * (var4 - var5)) / var4;
					var1.y = (var5 * var9 + var14 * (var4 - var5)) / var4;
				}

				var1.field1290 = 0;
				var1.orientation = var1.field1291;
				var1.rotation = var1.orientation;
			} else {
				var1.movementSequence = var1.idleSequence;
				if (var1.pathLength == 0) {
					var1.field1290 = 0;
				} else {
					label665: {
						if (var1.sequence != -1 && var1.sequenceDelay == 0) {
							var3 = HealthBarUpdate.SequenceDefinition_get(var1.sequence);
							if (var1.field1298 > 0 && var3.field2302 == 0) {
								++var1.field1290;
								break label665;
							}

							if (var1.field1298 <= 0 && var3.field2327 == 0) {
								++var1.field1290;
								break label665;
							}
						}

						var12 = var1.x;
						var4 = var1.y;
						var5 = var1.pathX[var1.pathLength - 1] * 128 + var1.field1227 * 64;
						var6 = var1.field1227 * 64 + var1.pathY[var1.pathLength - 1] * 128;
						if (var12 < var5) {
							if (var4 < var6) {
								var1.orientation = 1280;
							} else if (var4 > var6) {
								var1.orientation = 1792;
							} else {
								var1.orientation = 1536;
							}
						} else if (var12 > var5) {
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

						MoveSpeed var7 = var1.pathTraversed[var1.pathLength - 1];
						if (var5 - var12 <= 256 && var5 - var12 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
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
								if (var1.rotation != var1.orientation && var1.targetIndex == -1 && var1.field1292 != 0) {
									var10 = 2;
								}

								if (var1.pathLength > 2) {
									var10 = 6;
								}

								if (var1.pathLength > 3) {
									var10 = 8;
								}

								if (var1.field1290 > 0 && var1.pathLength > 1) {
									var10 = 8;
									--var1.field1290;
								}
							} else {
								if (var1.pathLength > 1) {
									var10 = 6;
								}

								if (var1.pathLength > 2) {
									var10 = 8;
								}

								if (var1.field1290 > 0 && var1.pathLength > 1) {
									var10 = 8;
									--var1.field1290;
								}
							}

							if (var7 == MoveSpeed.field3039) {
								var10 <<= 1;
							} else if (var7 == MoveSpeed.field3037) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var1.walkSequence == var1.movementSequence && var1.runSequence != -1) {
									var1.movementSequence = var1.runSequence;
								} else if (var1.walkBackSequence == var1.movementSequence && var1.field1237 != -1) {
									var1.movementSequence = var1.field1237;
								} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1238 != -1) {
									var1.movementSequence = var1.field1238;
								} else if (var1.walkRightSequence == var1.movementSequence && var1.field1280 != -1) {
									var1.movementSequence = var1.field1280;
								}
							} else if (var10 <= 2) {
								if (var1.walkSequence == var1.movementSequence && var1.field1286 != -1) {
									var1.movementSequence = var1.field1286;
								} else if (var1.movementSequence == var1.walkBackSequence && var1.field1240 != -1) {
									var1.movementSequence = var1.field1240;
								} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1241 != -1) {
									var1.movementSequence = var1.field1241;
								} else if (var1.movementSequence == var1.walkRightSequence && var1.field1243 != -1) {
									var1.movementSequence = var1.field1243;
								}
							}

							if (var5 != var12 || var4 != var6) {
								if (var12 < var5) {
									var1.x += var10;
									if (var1.x > var5) {
										var1.x = var5;
									}
								} else if (var12 > var5) {
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
								if (var1.field1298 > 0) {
									--var1.field1298;
								}
							}
						} else {
							var1.x = var5;
							var1.y = var6;
							--var1.pathLength;
							if (var1.field1298 > 0) {
								--var1.field1298;
							}
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1233 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.field1227 * 64 + var1.pathX[0] * 128;
			var1.y = var1.field1227 * 64 + var1.pathY[0] * 128;
			var1.method2635();
		}

		if (var1 == AddRequestTask.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1233 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.field1227 * 64 + var1.pathX[0] * 128;
			var1.y = var1.field1227 * 64 + var1.pathY[0] * 128;
			var1.method2635();
		}

		class153.method3499(var0, var1);
		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			var3 = HealthBarUpdate.SequenceDefinition_get(var1.movementSequence);
			if (var3 != null) {
				if (!var3.isCachedModelIdSet() && var3.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var3.frameIds.length && var1.movementFrameCycle > var3.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						class93.method2538(var3, var1.movementFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
					}

					if (var1.movementFrame >= var3.frameIds.length) {
						if (var3.frameCount > 0) {
							var1.movementFrame -= var3.frameCount;
							if (var3.field2325) {
								++var1.field1267;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var3.frameIds.length || var3.field2325 && var1.field1267 >= var3.field2324) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1267 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class93.method2538(var3, var1.movementFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
					}
				} else if (var3.isCachedModelIdSet()) {
					++var1.movementFrame;
					var4 = var3.method4368();
					if (var1.movementFrame < var4) {
						Canvas.method318(var3, var1.movementFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
					} else {
						if (var3.frameCount > 0) {
							var1.movementFrame -= var3.frameCount;
							if (var3.field2325) {
								++var1.field1267;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var4 || var3.field2325 && var1.field1267 >= var3.field2324) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1267 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						Canvas.method318(var3, var1.movementFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var16 = new IterableNodeHashTableIterator(var1.method2644());

		for (ActorSpotAnim var18 = (ActorSpotAnim)var16.method9565(); var18 != null; var18 = (ActorSpotAnim)var16.next()) {
			if (var18.spotAnimation != -1 && Client.cycle >= var18.field5022) {
				var5 = VarcInt.SpotAnimationDefinition_get(var18.spotAnimation).sequence;
				if (var5 == -1) {
					var18.remove();
					--var1.graphicsCount;
				} else {
					var18.spotAnimationFrame = Math.max(var18.spotAnimationFrame, 0);
					SequenceDefinition var15 = HealthBarUpdate.SequenceDefinition_get(var5);
					if (var15.frameIds != null && !var15.isCachedModelIdSet()) {
						++var18.spotAnimationFrameCycle;
						if (var18.spotAnimationFrame < var15.frameIds.length && var18.spotAnimationFrameCycle > var15.frameLengths[var18.spotAnimationFrame]) {
							var18.spotAnimationFrameCycle = 1;
							++var18.spotAnimationFrame;
							class93.method2538(var15, var18.spotAnimationFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
						}

						if (var18.spotAnimationFrame >= var15.frameIds.length) {
							var18.remove();
							--var1.graphicsCount;
						}
					} else if (var15.isCachedModelIdSet()) {
						++var18.spotAnimationFrame;
						var14 = var15.method4368();
						if (var18.spotAnimationFrame < var14) {
							Canvas.method318(var15, var18.spotAnimationFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
						} else {
							var18.remove();
							--var1.graphicsCount;
						}
					} else {
						var18.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var13 = HealthBarUpdate.SequenceDefinition_get(var1.sequence);
			if (var13.field2302 == 1 && var1.field1298 > 0 && var1.spotAnimation <= Client.cycle && var1.field1233 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var13 = HealthBarUpdate.SequenceDefinition_get(var1.sequence);
			if (var13 == null) {
				var1.sequence = -1;
			} else if (!var13.isCachedModelIdSet() && var13.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var13.frameIds.length && var1.sequenceFrameCycle > var13.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					class93.method2538(var13, var1.sequenceFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
				}

				if (var1.sequenceFrame >= var13.frameIds.length) {
					var1.sequenceFrame -= var13.frameCount;
					++var1.field1272;
					if (var1.field1272 >= var13.field2324) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var13.frameIds.length) {
						class93.method2538(var13, var1.sequenceFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var13.field2320;
			} else if (var13.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var13.method4368();
				if (var1.sequenceFrame < var5) {
					Canvas.method318(var13, var1.sequenceFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
				} else {
					var1.sequenceFrame -= var13.frameCount;
					++var1.field1272;
					if (var1.field1272 >= var13.field2324) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						Canvas.method318(var13, var1.sequenceFrame, var1.x, var1.y, var1 == AddRequestTask.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}
			} else {
				var1.sequence = -1;
			}
		}

		if (var1.sequenceDelay > 0) {
			--var1.sequenceDelay;
		}

	}
}
