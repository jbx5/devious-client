import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ec")
public class class131 {
	@ObfuscatedName("hz")
	@Export("xteaKeys")
	static int[][] xteaKeys;

	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = 7802385156606399349L)
	long field1565;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -2103686763)
	int field1555 = -1;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lln;")
	IterableNodeDeque field1556 = new IterableNodeDeque();

	@ObfuscatedSignature(descriptor = "(Lqw;)V")
	public class131(Buffer var1) {
		this.method2917(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "1289966239")
	void method2917(Buffer var1) {
		this.field1565 = var1.readLong();
		this.field1555 = var1.readInt();
		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class150(this);
			} else if (var2 == 1) {
				var3 = new class126(this);
			} else if (var2 == 13) {
				var3 = new class143(this);
			} else if (var2 == 4) {
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this);
			} else if (var2 == 2) {
				var3 = new class132(this);
			} else if (var2 == 7) {
				var3 = new class125(this);
			} else if (var2 == 14) {
				var3 = new class129(this);
			} else if (var2 == 8) {
				var3 = new class146(this);
			} else if (var2 == 9) {
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this);
			} else if (var2 == 11) {
				var3 = new class133(this);
			} else if (var2 == 12) {
				var3 = new class137(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}
				var3 = new class147(this);
			}
			((class128) (var3)).vmethod3155(var1);
			this.field1556.addFirst(((Node) (var3)));
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "1189729405")
	public void method2911(ClanSettings var1) {
		if (var1.field1613 == this.field1565 && this.field1555 == var1.field1614) {
			for (class128 var2 = ((class128) (this.field1556.last())); var2 != null; var2 = ((class128) (this.field1556.previous()))) {
				var2.vmethod3154(var1);
			}
			++var1.field1614;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)J", garbageValue = "-15")
	public static final synchronized long method2916() {
		long var0 = System.currentTimeMillis();
		if (var0 < class269.field3174) {
			FriendSystem.field797 += class269.field3174 - var0;
		}
		class269.field3174 = var0;
		return var0 + FriendSystem.field797;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)Lfh;", garbageValue = "45")
	public static FloorUnderlayDefinition method2909(int var0) {
		FloorUnderlayDefinition var1 = ((FloorUnderlayDefinition) (FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}
			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = "(Lcs;I)V", garbageValue = "2018308551")
	static final void method2913(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1142 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = class14.SequenceDefinition_get(var0.sequence);
				if (var0.field1203 > 0 && var1.field2173 == 0) {
					++var0.field1142;
					return;
				}
				if (var0.field1203 <= 0 && var1.field2156 == 0) {
					++var0.field1142;
					return;
				}
			}
			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1202 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1202 * 64;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}
			class192 var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}
				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}
				if (var7 == -1) {
					var7 = var0.walkSequence;
				}
				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC) (var0)).definition.isClickable;
				}
				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1197 != 0) {
						var8 = 2;
					}
					if (var0.pathLength > 2) {
						var8 = 6;
					}
					if (var0.pathLength > 3) {
						var8 = 8;
					}
					if (var0.field1142 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1142;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}
					if (var0.pathLength > 2) {
						var8 = 8;
					}
					if (var0.field1142 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1142;
					}
				}
				if (var5 == class192.field2197) {
					var8 <<= 1;
				} else if (var5 == class192.field2195) {
					var8 >>= 1;
				}
				if (var8 >= 8) {
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1199 != -1) {
						var0.movementSequence = var0.field1199;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1143 != -1) {
						var0.movementSequence = var0.field1143;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1144 != -1) {
						var0.movementSequence = var0.field1144;
					}
				} else if (var8 <= 1) {
					if (var0.movementSequence == var0.walkSequence && var0.field1145 != -1) {
						var0.movementSequence = var0.field1145;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1146 != -1) {
						var0.movementSequence = var0.field1146;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1147 != -1) {
						var0.movementSequence = var0.field1147;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1148 != -1) {
						var0.movementSequence = var0.field1148;
					}
				}
				if (var10 != var3 || var4 != var2) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}
					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}
				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1203 > 0) {
						--var0.field1203;
					}
				}
			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1203 > 0) {
					--var0.field1203;
				}
			}
		}
	}
}