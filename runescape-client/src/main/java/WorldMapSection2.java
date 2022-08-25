import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hs")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("af")
	protected static String field2693;

	@ObfuscatedName("hn")
	@ObfuscatedSignature(descriptor = "Lmg;")
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -137422977)
	@Export("minPlane")
	int minPlane;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1423393629)
	@Export("planes")
	int planes;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 247134525)
	@Export("regionStartX")
	int regionStartX;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1123861549)
	@Export("regionStartY")
	int regionStartY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1869034957)
	@Export("regionEndX")
	int regionEndX;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1040460307)
	@Export("regionEndY")
	int regionEndY;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 698009939)
	int field2703;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1367759899)
	int field2700;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1215718131)
	int field2701;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -843132573)
	int field2696;

	WorldMapSection2() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lht;I)V", garbageValue = "362337348")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2703) {
			var1.regionLowX = this.field2703;
		}
		if (var1.regionHighX < this.field2701) {
			var1.regionHighX = this.field2701;
		}
		if (var1.regionLowY > this.field2700) {
			var1.regionLowY = this.field2700;
		}
		if (var1.regionHighY < this.field2696) {
			var1.regionHighY = this.field2696;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIIS)Z", garbageValue = "-6948")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1464078865")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2703 && var1 >> 6 <= this.field2701 && var2 >> 6 >= this.field2700 && var2 >> 6 <= this.field2696;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "2119764221")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ this.field2703 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2700 * 64 - this.regionStartY * 64) };
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lku;", garbageValue = "-1688632698")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2703 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2700 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "-89")
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2703 = var1.readUnsignedShort();
		this.field2700 = var1.readUnsignedShort();
		this.field2701 = var1.readUnsignedShort();
		this.field2696 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-39")
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II)I", garbageValue = "1283436399")
	public static int method4509(CharSequence var0, int var1) {
		return WorldMapIcon_0.method4838(var0, var1, true);
	}

	@ObfuscatedName("q")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return ((int) (var0 >>> 17 & 4294967295L));
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = "(Lcx;II)V", garbageValue = "-347899176")
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var3;
		int var4;
		int var16;
		if (var0.field1182 >= Client.cycle) {
			ApproximateRouteStrategy.method1068(var0);
		} else {
			int var5;
			int var7;
			int var8;
			if (var0.field1183 >= Client.cycle) {
				boolean var11 = var0.field1183 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
				if (!var11) {
					SequenceDefinition var12 = ByteArrayPool.SequenceDefinition_get(var0.sequence);
					if (var12 != null && !var12.isCachedModelIdSet()) {
						var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame];
					} else {
						var11 = true;
					}
				}
				if (var11) {
					var3 = var0.field1183 - var0.field1182;
					var4 = Client.cycle - var0.field1182;
					var5 = var0.field1178 * 128 + var0.field1190 * 373555200;
					int var13 = var0.field1127 * 128 + var0.field1190 * 373555200;
					var7 = var0.field1179 * 128 + var0.field1190 * 373555200;
					var8 = var0.field1181 * 128 + var0.field1190 * 373555200;
					var0.x = (var4 * var7 + var5 * (var3 - var4)) / var3;
					var0.y = (var4 * var8 + var13 * (var3 - var4)) / var3;
				}
				var0.field1200 = 0;
				var0.orientation = var0.field1136;
				var0.rotation = var0.orientation;
			} else {
				var0.movementSequence = var0.idleSequence;
				if (var0.pathLength == 0) {
					var0.field1200 = 0;
				} else {
					label510 : {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) {
							SequenceDefinition var2 = ByteArrayPool.SequenceDefinition_get(var0.sequence);
							if (var0.field1201 > 0 && var2.field2179 == 0) {
								++var0.field1200;
								break label510;
							}
							if (var0.field1201 <= 0 && var2.field2180 == 0) {
								++var0.field1200;
								break label510;
							}
						}
						var16 = var0.x;
						var3 = var0.y;
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1190 * 373555200;
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1190 * 373555200;
						if (var16 < var4) {
							if (var3 < var5) {
								var0.orientation = 1280;
							} else if (var3 > var5) {
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536;
							}
						} else if (var16 > var4) {
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
						class192 var6 = var0.pathTraversed[var0.pathLength - 1];
						if (var4 - var16 <= 256 && var4 - var16 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
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
								var10 = ((NPC) (var0)).definition.isClickable;
							}
							if (var10) {
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1180 != 0) {
									var9 = 2;
								}
								if (var0.pathLength > 2) {
									var9 = 6;
								}
								if (var0.pathLength > 3) {
									var9 = 8;
								}
								if (var0.field1200 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1200;
								}
							} else {
								if (var0.pathLength > 1) {
									var9 = 6;
								}
								if (var0.pathLength > 2) {
									var9 = 8;
								}
								if (var0.field1200 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1200;
								}
							}
							if (var6 == class192.field2207) {
								var9 <<= 1;
							} else if (var6 == class192.field2209) {
								var9 >>= 1;
							}
							if (var9 >= 8) {
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
									var0.movementSequence = var0.runSequence;
								} else if (var0.walkBackSequence == var0.movementSequence && var0.field1140 != -1) {
									var0.movementSequence = var0.field1140;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1141 != -1) {
									var0.movementSequence = var0.field1141;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1149 != -1) {
									var0.movementSequence = var0.field1149;
								}
							} else if (var9 <= 1) {
								if (var0.movementSequence == var0.walkSequence && var0.field1143 != -1) {
									var0.movementSequence = var0.field1143;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1170 != -1) {
									var0.movementSequence = var0.field1170;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1145 != -1) {
									var0.movementSequence = var0.field1145;
								} else if (var0.movementSequence == var0.walkRightSequence && var0.field1150 != -1) {
									var0.movementSequence = var0.field1150;
								}
							}
							if (var16 != var4 || var5 != var3) {
								if (var16 < var4) {
									var0.x += var9;
									if (var0.x > var4) {
										var0.x = var4;
									}
								} else if (var16 > var4) {
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
								if (var0.field1201 > 0) {
									--var0.field1201;
								}
							}
						} else {
							var0.x = var4;
							var0.y = var5;
							--var0.pathLength;
							if (var0.field1201 > 0) {
								--var0.field1201;
							}
						}
					}
				}
			}
		}
		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1182 = 0;
			var0.field1183 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1190 * 373555200;
			var0.y = var0.pathY[0] * 128 + var0.field1190 * 373555200;
			var0.method2149();
		}
		if (ScriptFrame.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1182 = 0;
			var0.field1183 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1190 * 373555200;
			var0.y = var0.pathY[0] * 128 + var0.field1190 * 373555200;
			var0.method2149();
		}
		if (var0.field1180 != 0) {
			if (var0.targetIndex != -1) {
				Object var14 = null;
				if (var0.targetIndex < 32768) {
					var14 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var14 = Client.players[var0.targetIndex - '耀'];
				}
				if (var14 != null) {
					var3 = var0.x - ((Actor) (var14)).x;
					var4 = var0.y - ((Actor) (var14)).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = ((int) (Math.atan2(((double) (var3)), ((double) (var4))) * 325.949)) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}
			if (var0.field1162 != -1 && (var0.pathLength == 0 || var0.field1200 > 0)) {
				var0.orientation = var0.field1162;
				var0.field1162 = -1;
			}
			var16 = var0.orientation - var0.rotation & 2047;
			if (var16 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
			if (var16 != 0) {
				++var0.field1194;
				boolean var15;
				if (var16 > 1024) {
					var0.rotation -= (var0.field1163) ? var16 : var0.field1180;
					var15 = true;
					if (var16 < var0.field1180 || var16 > 2048 - var0.field1180) {
						var0.rotation = var0.orientation;
						var15 = false;
					}
					if (!var0.field1163 && var0.movementSequence == var0.idleSequence && (var0.field1194 > 25 || var15)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += (var0.field1163) ? var16 : var0.field1180;
					var15 = true;
					if (var16 < var0.field1180 || var16 > 2048 - var0.field1180) {
						var0.rotation = var0.orientation;
						var15 = false;
					}
					if (!var0.field1163 && var0.movementSequence == var0.idleSequence && (var0.field1194 > 25 || var15)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}
				var0.rotation &= 2047;
				var0.field1163 = false;
			} else {
				var0.field1194 = 0;
			}
		}
		method4493(var0);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(descriptor = "(Lcx;I)V", garbageValue = "1824990148")
	static final void method4493(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) {
			var1 = ByteArrayPool.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class282.method5426(var1, var0.movementFrame, var0.x, var0.y);
					}
					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2178) {
								++var0.field1167;
							}
							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2178 && var0.field1167 >= var1.field2177) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1167 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}
						class282.method5426(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					var2 = var1.method3729();
					if (var0.movementFrame < var2) {
						WorldMapRectangle.method4912(var1, var0.movementFrame, var0.x, var0.y);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2178) {
								++var0.field1167;
							}
							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2178 && var0.field1167 >= var1.field2177) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1167 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}
						WorldMapRectangle.method4912(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}
		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1176) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}
			int var4 = ArchiveDisk.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var4 != -1) {
				SequenceDefinition var5 = ByteArrayPool.SequenceDefinition_get(var4);
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class282.method5426(var5, var0.spotAnimationFrame, var0.x, var0.y);
					}
					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) {
					++var0.spotAnimationFrame;
					int var3 = var5.method3729();
					if (var0.spotAnimationFrame < var3) {
						WorldMapRectangle.method4912(var5, var0.spotAnimationFrame, var0.x, var0.y);
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) {
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
			var1 = ByteArrayPool.SequenceDefinition_get(var0.sequence);
			if (var1.field2179 == 1 && var0.field1201 > 0 && var0.field1182 <= Client.cycle && var0.field1183 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}
		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = ByteArrayPool.SequenceDefinition_get(var0.sequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						class282.method5426(var1, var0.sequenceFrame, var0.x, var0.y);
					}
					if (var0.sequenceFrame >= var1.frameIds.length) {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1172;
						if (var0.field1172 >= var1.field2177) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
							class282.method5426(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}
					var0.isWalking = var1.field2173;
				} else if (var1.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var2 = var1.method3729();
					if (var0.sequenceFrame < var2) {
						WorldMapRectangle.method4912(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1172;
						if (var0.field1172 >= var1.field2177) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) {
							WorldMapRectangle.method4912(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1;
				}
			} else {
				var0.sequence = -1;
			}
		}
		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "293828807")
	static final int method4502() {
		float var0 = 200.0F * (((float) (ClanMate.clientPreferences.method2220())) - 0.5F);
		return 100 - Math.round(var0);
	}
}