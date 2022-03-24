import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Laz;")

	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;
	@ObfuscatedName("de")
	@ObfuscatedSignature(descriptor = 
	"Lcr;")

	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(intValue = 
	-490207969)

	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(descriptor = 
	"Lnj;")

	static AbstractSocket field1378;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;I)I", garbageValue = 
	"-554483430")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(descriptor = 
	"(Lco;II)V", garbageValue = 
	"-1008327534")

	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var3;
		int var4;
		int var11;
		if (var0.field1179 >= Client.cycle) {
			ModeWhere.method6145(var0);
		} else if (var0.field1180 >= Client.cycle) {
			class16.method215(var0);
		} else {
			var0.movementSequence = var0.idleSequence;
			if (var0.pathLength == 0) {
				var0.field1197 = 0;
			} else {
				label409 : {
					if ((var0.sequence != (-1)) && (var0.sequenceDelay == 0)) {
						SequenceDefinition var2 = ItemContainer.SequenceDefinition_get(var0.sequence);
						if ((var0.field1134 > 0) && (var2.field2162 == 0)) {
							++var0.field1197;
							break label409;
						}

						if ((var0.field1134 <= 0) && (var2.field2171 == 0)) {
							++var0.field1197;
							break label409;
						}
					}

					var11 = var0.x;
					var3 = var0.y;
					var4 = (var0.field1145 * 64) + (var0.pathX[var0.pathLength - 1] * 128);
					int var5 = (var0.field1145 * 64) + (var0.pathY[var0.pathLength - 1] * 128);
					if (var11 < var4) {
						if (var3 < var5) {
							var0.orientation = 1280;
						} else if (var3 > var5) {
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536;
						}
					} else if (var11 > var4) {
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

					class193 var6 = var0.pathTraversed[var0.pathLength - 1];
					if (((((var4 - var11) <= 256) && ((var4 - var11) >= (-256))) && ((var5 - var3) <= 256)) && ((var5 - var3) >= (-256))) {
						int var7 = (var0.orientation - var0.rotation) & 2047;
						if (var7 > 1024) {
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence;
						if ((var7 >= (-256)) && (var7 <= 256)) {
							var8 = var0.walkSequence;
						} else if ((var7 >= 256) && (var7 < 768)) {
							var8 = var0.walkRightSequence;
						} else if ((var7 >= (-768)) && (var7 <= (-256))) {
							var8 = var0.walkLeftSequence;
						}

						if (var8 == (-1)) {
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8;
						int var9 = 4;
						boolean var10 = true;
						if (var0 instanceof NPC) {
							var10 = ((NPC) (var0)).definition.isClickable;
						}

						if (var10) {
							if (((var0.orientation != var0.rotation) && (var0.targetIndex == (-1))) && (var0.field1192 != 0)) {
								var9 = 2;
							}

							if (var0.pathLength > 2) {
								var9 = 6;
							}

							if (var0.pathLength > 3) {
								var9 = 8;
							}

							if ((var0.field1197 > 0) && (var0.pathLength > 1)) {
								var9 = 8;
								--var0.field1197;
							}
						} else {
							if (var0.pathLength > 1) {
								var9 = 6;
							}

							if (var0.pathLength > 2) {
								var9 = 8;
							}

							if ((var0.field1197 > 0) && (var0.pathLength > 1)) {
								var9 = 8;
								--var0.field1197;
							}
						}

						if (var6 == class193.field2191) {
							var9 <<= 1;
						} else if (var6 == class193.field2195) {
							var9 >>= 1;
						}

						if (((var9 >= 8) && (var0.walkSequence == var0.movementSequence)) && (var0.runSequence != (-1))) {
							var0.movementSequence = var0.runSequence;
						}

						if ((var4 != var11) || (var5 != var3)) {
							if (var11 < var4) {
								var0.x += var9;
								if (var0.x > var4) {
									var0.x = var4;
								}
							} else if (var11 > var4) {
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

						if ((var4 == var0.x) && (var5 == var0.y)) {
							--var0.pathLength;
							if (var0.field1134 > 0) {
								--var0.field1134;
							}
						}
					} else {
						var0.x = var4;
						var0.y = var5;
						--var0.pathLength;
						if (var0.field1134 > 0) {
							--var0.field1134;
						}
					}
				}
			}
		}

		if ((((var0.x < 128) || (var0.y < 128)) || (var0.x >= 13184)) || (var0.y >= 13184)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1179 = 0;
			var0.field1180 = 0;
			var0.x = (var0.pathX[0] * 128) + (var0.field1145 * 64);
			var0.y = (var0.field1145 * 64) + (var0.pathY[0] * 128);
			var0.method2205();
		}

		if ((class19.localPlayer == var0) && ((((var0.x < 1536) || (var0.y < 1536)) || (var0.x >= 11776)) || (var0.y >= 11776))) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1179 = 0;
			var0.field1180 = 0;
			var0.x = (var0.pathX[0] * 128) + (var0.field1145 * 64);
			var0.y = (var0.pathY[0] * 128) + (var0.field1145 * 64);
			var0.method2205();
		}

		if (var0.field1192 != 0) {
			if (var0.targetIndex != (-1)) {
				Object var13 = null;
				if (var0.targetIndex < 32768) {
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var13 = Client.players[var0.targetIndex - 32768];
				}

				if (var13 != null) {
					var3 = var0.x - ((Actor) (var13)).x;
					var4 = var0.y - ((Actor) (var13)).y;
					if ((var3 != 0) || (var4 != 0)) {
						var0.orientation = ((int) (Math.atan2(((double) (var3)), ((double) (var4))) * 325.949)) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if ((var0.field1160 != (-1)) && ((var0.pathLength == 0) || (var0.field1197 > 0))) {
				var0.orientation = var0.field1160;
				var0.field1160 = -1;
			}

			var11 = (var0.orientation - var0.rotation) & 2047;
			if ((var11 == 0) && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var11 != 0) {
				++var0.field1131;
				boolean var14;
				if (var11 > 1024) {
					var0.rotation -= (var0.field1183) ? var11 : (var0.field1192 * 763690023) * (-1413434473);
					var14 = true;
					if ((var11 < var0.field1192) || (var11 > (2048 - var0.field1192))) {
						var0.rotation = var0.orientation;
						var14 = false;
					}

					if (((!var0.field1183) && (var0.movementSequence == var0.idleSequence)) && ((var0.field1131 > 25) || var14)) {
						if (var0.turnLeftSequence != (-1)) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += (var0.field1183) ? var11 : (var0.field1192 * 763690023) * (-1413434473);
					var14 = true;
					if ((var11 < var0.field1192) || (var11 > (2048 - var0.field1192))) {
						var0.rotation = var0.orientation;
						var14 = false;
					}

					if (((!var0.field1183) && (var0.idleSequence == var0.movementSequence)) && ((var0.field1131 > 25) || var14)) {
						if (var0.turnRightSequence != (-1)) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
				var0.field1183 = false;
			} else {
				var0.field1131 = 0;
			}
		}

		WorldMapSectionType.method4950(var0);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;IIIIIIB)V", garbageValue = 
	"32")

	static final void method2624(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field556) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field556 = false;
		int var7;
		if ((MouseHandler.MouseHandler_currentButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_currentButton == 4))) {
			if ((((var5 >= var1) && (var5 < (var1 + 16))) && (var6 >= var2)) && (var6 < (var2 + 16))) {
				var0.scrollY -= 4;
				class290.invalidateWidget(var0);
			} else if ((((var5 >= var1) && (var5 < (var1 + 16))) && (var6 >= ((var3 + var2) - 16))) && (var6 < (var3 + var2))) {
				var0.scrollY += 4;
				class290.invalidateWidget(var0);
			} else if ((((var5 >= (var1 - Client.alternativeScrollbarWidth)) && (var5 < ((Client.alternativeScrollbarWidth + var1) + 16))) && (var6 >= (var2 + 16))) && (var6 < ((var3 + var2) - 16))) {
				var7 = (var3 * (var3 - 32)) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = ((var6 - var2) - 16) - (var7 / 2);
				int var9 = (var3 - 32) - var7;
				var0.scrollY = (var8 * (var4 - var3)) / var9;
				class290.invalidateWidget(var0);
				Client.field556 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if ((((var5 >= (var1 - var7)) && (var6 >= var2)) && (var5 < (var1 + 16))) && (var6 <= (var3 + var2))) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class290.invalidateWidget(var0);
			}
		}

	}
}