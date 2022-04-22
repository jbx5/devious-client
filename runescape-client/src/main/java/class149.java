import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class149 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-55422083")

	static final void method3138(String var0) {
		Actor.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(descriptor = 
	"(Lcb;IB)V", garbageValue = 
	"-21")

	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1143 >= Client.cycle) {
			UserComparator8.method2578(var0);
		} else {
			int var3;
			int var4;
			int var5;
			int var7;
			int var11;
			if (var0.field1163 >= Client.cycle) {
				if ((((var0.field1163 == Client.cycle) || (var0.sequence == (-1))) || (var0.sequenceDelay != 0)) || ((var0.sequenceFrameCycle + 1) > class163.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame])) {
					var11 = var0.field1163 - var0.field1143;
					var3 = Client.cycle - var0.field1143;
					var4 = (var0.field1150 * 64) + (var0.field1129 * 128);
					var5 = (var0.field1150 * 64) + (var0.field1160 * 128);
					int var12 = (var0.field1150 * 64) + (var0.field1132 * 128);
					var7 = (var0.field1150 * 64) + (var0.field1161 * 128);
					var0.x = ((var12 * var3) + (var4 * (var11 - var3))) / var11;
					var0.y = ((var3 * var7) + (var5 * (var11 - var3))) / var11;
				}

				var0.field1179 = 0;
				var0.orientation = var0.field1135;
				var0.rotation = var0.orientation;
			} else {
				var0.movementSequence = var0.idleSequence;
				if (var0.pathLength == 0) {
					var0.field1179 = 0;
				} else {
					label286 : {
						if ((var0.sequence != (-1)) && (var0.sequenceDelay == 0)) {
							SequenceDefinition var2 = class163.SequenceDefinition_get(var0.sequence);
							if ((var0.field1170 > 0) && (var2.field2159 == 0)) {
								++var0.field1179;
								break label286;
							}

							if ((var0.field1170 <= 0) && (var2.field2158 == 0)) {
								++var0.field1179;
								break label286;
							}
						}

						var11 = var0.x;
						var3 = var0.y;
						var4 = (var0.field1150 * 64) + (var0.pathX[var0.pathLength - 1] * 128);
						var5 = (var0.field1150 * 64) + (var0.pathY[var0.pathLength - 1] * 128);
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
							var7 = (var0.orientation - var0.rotation) & 2047;
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
								if (((var0.orientation != var0.rotation) && (var0.targetIndex == (-1))) && (var0.field1175 != 0)) {
									var9 = 2;
								}

								if (var0.pathLength > 2) {
									var9 = 6;
								}

								if (var0.pathLength > 3) {
									var9 = 8;
								}

								if ((var0.field1179 > 0) && (var0.pathLength > 1)) {
									var9 = 8;
									--var0.field1179;
								}
							} else {
								if (var0.pathLength > 1) {
									var9 = 6;
								}

								if (var0.pathLength > 2) {
									var9 = 8;
								}

								if ((var0.field1179 > 0) && (var0.pathLength > 1)) {
									var9 = 8;
									--var0.field1179;
								}
							}

							if (var6 == class193.field2187) {
								var9 <<= 1;
							} else if (var6 == class193.field2184) {
								var9 >>= 1;
							}

							if (((var9 >= 8) && (var0.walkSequence == var0.movementSequence)) && (var0.runSequence != (-1))) {
								var0.movementSequence = var0.runSequence;
							}

							if ((var11 != var4) || (var5 != var3)) {
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
								if (var0.field1170 > 0) {
									--var0.field1170;
								}
							}
						} else {
							var0.x = var4;
							var0.y = var5;
							--var0.pathLength;
							if (var0.field1170 > 0) {
								--var0.field1170;
							}
						}
					}
				}
			}
		}

		if ((((var0.x < 128) || (var0.y < 128)) || (var0.x >= 13184)) || (var0.y >= 13184)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1143 = 0;
			var0.field1163 = 0;
			var0.x = (var0.pathX[0] * 128) + (var0.field1150 * 64);
			var0.y = (var0.field1150 * 64) + (var0.pathY[0] * 128);
			var0.method2179();
		}

		if ((GrandExchangeEvents.localPlayer == var0) && ((((var0.x < 1536) || (var0.y < 1536)) || (var0.x >= 11776)) || (var0.y >= 11776))) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1143 = 0;
			var0.field1163 = 0;
			var0.x = (var0.field1150 * 64) + (var0.pathX[0] * 128);
			var0.y = (var0.pathY[0] * 128) + (var0.field1150 * 64);
			var0.method2179();
		}

		Skeleton.method4730(var0);
		GrandExchangeOfferWorldComparator.method6006(var0);
	}
}