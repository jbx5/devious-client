import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1745719425
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 943830507
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -600062291
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 799207299
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 137130919
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1808411713
	)
	@Export("z")
	int z;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -842084923
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2077503945
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("aa")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = class151.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = HttpMethod.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "244690834"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method4106()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class151.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-65"
	)
	static boolean method2140(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-644531348"
	)
	static final void method2141(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1245 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = HttpMethod.SequenceDefinition_get(var0.sequence);
				if (var0.field1215 > 0 && var1.field2244 == 0) {
					++var0.field1245;
					return;
				}

				if (var0.field1215 <= 0 && var1.field2226 == 0) {
					++var0.field1245;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.field1175 * 423432192 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.field1175 * 423432192 + var0.pathY[var0.pathLength - 1] * 128;
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

			class231 var5 = var0.pathTraversed[var0.pathLength - 1];
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
					var9 = ((NPC)var0).definition.isClipped;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1240 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1245 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1245;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1245 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1245;
					}
				}

				if (var5 == class231.field2459) {
					var8 <<= 1;
				} else if (var5 == class231.field2456) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1187 != -1) {
						var0.movementSequence = var0.field1187;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1186 != -1) {
						var0.movementSequence = var0.field1186;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1218 != -1) {
						var0.movementSequence = var0.field1218;
					}
				} else if (var8 <= 2) {
					if (var0.movementSequence == var0.walkSequence && var0.field1188 != -1) {
						var0.movementSequence = var0.field1188;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1178 != -1) {
						var0.movementSequence = var0.field1178;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1190 != -1) {
						var0.movementSequence = var0.field1190;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1191 != -1) {
						var0.movementSequence = var0.field1191;
					}
				}

				if (var10 != var3 || var2 != var4) {
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
					if (var0.field1215 > 0) {
						--var0.field1215;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1215 > 0) {
					--var0.field1215;
				}

			}
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IILir;I)V",
		garbageValue = "-275020148"
	)
	static final void method2132(Player var0, int var1, int var2, class231 var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				class232 var7 = Client.field691;
				int var10 = var0.transformedSize();
				Client.field801.approxDestinationX = var1;
				Client.field801.approxDestinationY = var2;
				Client.field801.approxDestinationSizeX = 1;
				Client.field801.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var11 = Client.field801;
				int var12 = var7.method4556(var4, var5, var10, var11, Client.collisionMaps[var0.plane], true, Client.field802, Client.field803);
				if (var12 >= 1) {
					for (int var13 = 0; var13 < var12 - 1; ++var13) {
						var0.method2415(Client.field802[var13], Client.field803[var13], var3);
					}

				}
			}
		}
	}

	public GraphicsObject() {
	}
}
