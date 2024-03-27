import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4531("", 0, new class390[]{class390.field4505, class390.field4504}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4521("", 1, new class390[]{class390.field4506, class390.field4505, class390.field4504}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4523("", 2, new class390[]{class390.field4506, class390.field4503, class390.field4505}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4522("", 3, new class390[]{class390.field4506}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4524("", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4525("", 5, new class390[]{class390.field4506, class390.field4505}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4530("", 6, new class390[]{class390.field4505}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4527("", 8, new class390[]{class390.field4506, class390.field4505}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4533("", 9, new class390[]{class390.field4506, class390.field4503}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4529("", 10, new class390[]{class390.field4506}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4534("", 11, new class390[]{class390.field4506}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4520("", 12, new class390[]{class390.field4506, class390.field4505}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4532("", 13, new class390[]{class390.field4506});

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1960789161
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field4528;

	static {
		method7203();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpj;)V"
	)
	ModeWhere(String var3, int var4, class390[] var5) {
		this.field4528 = new HashSet();
		this.id = var4;
		class390[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class390 var8 = var6[var7];
			this.field4528.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4528 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "29"
	)
	public static void method7206(AbstractArchive var0) {
		DbTableType.field5163 = var0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpm;",
		garbageValue = "1915834439"
	)
	static ModeWhere[] method7203() {
		return new ModeWhere[]{field4522, field4525, field4521, field4527, field4533, field4529, field4520, field4523, field4524, field4532, field4534, field4530, field4531};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I[B[BB)V",
		garbageValue = "-2"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3836 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3836 = new byte[11][];
			var0.field3820 = new byte[11][];
			var0.field3821 = new int[11];
			var0.field3738 = new int[11];
		}

		var0.field3836[var1] = var2;
		if (var2 != null) {
			var0.field3818 = true;
		} else {
			var0.field3818 = false;

			for (int var4 = 0; var4 < var0.field3836.length; ++var4) {
				if (var0.field3836[var4] != null) {
					var0.field3818 = true;
					break;
				}
			}
		}

		var0.field3820[var1] = var3;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lde;II)V",
		garbageValue = "-1486010157"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var13;
		int var18;
		if (var0.spotAnimation >= Client.cycle) {
			Players.method2716(var0);
		} else {
			int var8;
			if (var0.field1256 >= Client.cycle) {
				boolean var11 = var0.field1256 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
				if (!var11) {
					SequenceDefinition var12 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence);
					if (var12 != null && !var12.isCachedModelIdSet()) {
						var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame];
					} else {
						var11 = true;
					}
				}

				if (var11) {
					var3 = var0.field1256 - var0.spotAnimation;
					var4 = Client.cycle - var0.spotAnimation;
					var5 = var0.field1251 * 128 + var0.field1249 * 64;
					var13 = var0.field1238 * 128 + var0.field1249 * 64;
					var7 = var0.field1258 * 128 + var0.field1249 * 64;
					var8 = var0.field1253 * 128 + var0.field1249 * 64;
					var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3;
					var0.y = (var8 * var4 + var13 * (var3 - var4)) / var3;
				}

				var0.field1257 = 0;
				var0.orientation = var0.field1203;
				var0.rotation = var0.orientation;
			} else {
				var0.movementSequence = var0.idleSequence;
				if (var0.pathLength == 0) {
					var0.field1257 = 0;
				} else {
					label496: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) {
							var2 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence);
							if (var0.field1274 > 0 && var2.field2398 == 0) {
								++var0.field1257;
								break label496;
							}

							if (var0.field1274 <= 0 && var2.field2399 == 0) {
								++var0.field1257;
								break label496;
							}
						}

						var18 = var0.x;
						var3 = var0.y;
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1249 * 64;
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1249 * 64;
						if (var18 < var4) {
							if (var3 < var5) {
								var0.orientation = 1280;
							} else if (var3 > var5) {
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536;
							}
						} else if (var18 > var4) {
							if (var3 < var5) {
								var0.orientation = 768;
							} else if (var3 > var5) {
								var0.orientation = 256;
							} else {
								var0.orientation = 512;
							}
						} else if (var3 < var5) {
							var0.orientation = 1024;
						} else if (var3 > var5) {
							var0.orientation = 0;
						}

						class233 var6 = var0.pathTraversed[var0.pathLength - 1];
						if (var4 - var18 <= 256 && var4 - var18 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
							var7 = var0.orientation - var0.rotation & 2047;
							if (var7 > 1024) {
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence;
							if (var7 >= -256 && var7 <= 256) {
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) {
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) {
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) {
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8;
							int var9 = 4;
							boolean var10 = true;
							if (var0 instanceof NPC) {
								var10 = ((NPC)var0).definition.isClipped;
							}

							if (var10) {
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1268 != 0) {
									var9 = 2;
								}

								if (var0.pathLength > 2) {
									var9 = 6;
								}

								if (var0.pathLength > 3) {
									var9 = 8;
								}

								if (var0.field1257 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1257;
								}
							} else {
								if (var0.pathLength > 1) {
									var9 = 6;
								}

								if (var0.pathLength > 2) {
									var9 = 8;
								}

								if (var0.field1257 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1257;
								}
							}

							if (var6 == class233.field2485) {
								var9 <<= 1;
							} else if (var6 == class233.field2483) {
								var9 >>= 1;
							}

							if (var9 >= 8) {
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
									var0.movementSequence = var0.runSequence;
								} else if (var0.walkBackSequence == var0.movementSequence && var0.field1213 != -1) {
									var0.movementSequence = var0.field1213;
								} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1214 != -1) {
									var0.movementSequence = var0.field1214;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1215 != -1) {
									var0.movementSequence = var0.field1215;
								}
							} else if (var9 <= 2) {
								if (var0.movementSequence == var0.walkSequence && var0.field1264 != -1) {
									var0.movementSequence = var0.field1264;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1269 != -1) {
									var0.movementSequence = var0.field1269;
								} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1218 != -1) {
									var0.movementSequence = var0.field1218;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1226 != -1) {
									var0.movementSequence = var0.field1226;
								}
							}

							if (var4 != var18 || var5 != var3) {
								if (var18 < var4) {
									var0.x += var9;
									if (var0.x > var4) {
										var0.x = var4;
									}
								} else if (var18 > var4) {
									var0.x -= var9;
									if (var0.x < var4) {
										var0.x = var4;
									}
								}

								if (var3 < var5) {
									var0.y += var9;
									if (var0.y > var5) {
										var0.y = var5;
									}
								} else if (var3 > var5) {
									var0.y -= var9;
									if (var0.y < var5) {
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) {
								--var0.pathLength;
								if (var0.field1274 > 0) {
									--var0.field1274;
								}
							}
						} else {
							var0.x = var4;
							var0.y = var5;
							--var0.pathLength;
							if (var0.field1274 > 0) {
								--var0.field1274;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1256 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1249 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1249 * 64;
			var0.method2393();
		}

		if (class133.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1256 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1249 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1249 * 64;
			var0.method2393();
		}

		if (var0.targetIndex != -1) {
			var2 = null;
			var3 = 65536;
			Object var15;
			if (var0.targetIndex < var3) {
				var15 = Client.npcs[var0.targetIndex];
			} else {
				var15 = Client.players[var0.targetIndex - var3];
			}

			if (var15 != null) {
				var4 = var0.x - ((Actor)var15).x;
				var5 = var0.y - ((Actor)var15).y;
				if (var4 != 0 || var5 != 0) {
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047;
					var0.orientation = var7;
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		if (var0.pathLength == 0 || var0.field1257 > 0) {
			var18 = -1;
			if (var0.field1237 != -1 && var0.field1216 != -1) {
				var3 = var0.field1237 * 128 - GrandExchangeOfferOwnWorldComparator.baseX * 8192 + 64;
				var4 = var0.field1216 * 128 - DevicePcmPlayerProvider.baseY * 8192 + 64;
				var5 = var0.x - var3;
				var13 = var0.y - var4;
				if (var5 != 0 || var13 != 0) {
					var7 = (int)(Math.atan2((double)var5, (double)var13) * 325.94932345220167D) & 2047;
					var18 = var7;
				}
			} else if (var0.field1272 != -1) {
				var18 = var0.field1272;
			}

			if (var18 != -1) {
				var0.orientation = var18;
				if (var0.field1239) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2419();
		}

		var18 = var0.orientation - var0.rotation & 2047;
		if (var18 != 0) {
			boolean var16 = true;
			boolean var17 = true;
			++var0.field1267;
			var5 = var18 > 1024 ? -1 : 1;
			var0.rotation += var5 * var0.field1268;
			boolean var19 = true;
			if (var18 < var0.field1268 || var18 > 2048 - var0.field1268) {
				var0.rotation = var0.orientation;
				var19 = false;
			}

			if (var0.field1268 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1267 > 25 || var19)) {
				if (var5 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var5 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1267 = 0;
		}

		class484.method8581(var0);
	}
}
