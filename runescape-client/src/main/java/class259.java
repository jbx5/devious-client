import net.runelite.mapping.ObfuscatedName;
import java.io.InvalidClassException;
import java.io.IOException;
import java.lang.reflect.Method;
import net.runelite.rs.Reflection;
import java.io.OptionalDataException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.ByteArrayInputStream;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import net.runelite.mapping.Export;
@ObfuscatedName("is")
public class class259 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1948790821)
	static int field2903;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqy;B)V", garbageValue = "28")
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = ((ReflectionCheck) (class33.reflectionChecks.last()));
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);
			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, ((Object) (null)));
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, ((Object) (null)), var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}
						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];
							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}
							Object var11 = Reflection.invoke(var25, ((Object) (null)), var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number) (var11)).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated(((String) (var11)));
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}
			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqy;IB)V", garbageValue = "-89")
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}
		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1111 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (Message.baseY * 64 + var4.pathY[0] >> 13) + (class300.baseX * 8 + var4.pathX[0] >> 13 << 14);
				if (var4.field1164 != -1) {
					Players.Players_orientations[var1] = var4.field1164;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}
				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					WorldMapSectionType.updateExternalPlayer(var0, var1);
				}
			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}
				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1111 = false;
				} else if (var2) {
					var4.field1111 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1111 = false;
					var4.method2230(var6, var7, Players.field1294[var1]);
				}
			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}
				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
					if (var2) {
						var4.field1111 = true;
						var4.tileX = var6;
						var4.tileY = var7;
					} else {
						var4.field1111 = false;
						var4.method2230(var6, var7, Players.field1294[var1]);
					}
				} else {
					var4.resetPath(var6, var7);
					var4.field1111 = false;
				}
			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}
					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}
					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1111 = false;
					} else if (var2) {
						var4.field1111 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1111 = false;
						var4.method2230(var10, var11, Players.field1294[var1]);
					}
					var4.plane = ((byte) (var7 + var4.plane & 3));
					if (Client.localPlayerIndex == var1) {
						FriendSystem.Client_plane = var4.plane;
					}
				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (class300.baseX * 8 + var8 + var4.pathX[0] & 16383) - class300.baseX * 8;
					var11 = (Message.baseY * 64 + var9 + var4.pathY[0] & 16383) - Message.baseY * 64;
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1111 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1111 = false;
							var4.method2230(var10, var11, Players.field1294[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1111 = false;
					}
					var4.plane = ((byte) (var7 + var4.plane & 3));
					if (Client.localPlayerIndex == var1) {
						FriendSystem.Client_plane = var4.plane;
					}
				}
			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(descriptor = "(Lcs;I)V", garbageValue = "1905012149")
	static final void method5188(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) {
			var1 = class14.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class93.method2443(var1, var0.movementFrame, var0.x, var0.y);
					}
					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2174) {
								++var0.field1141;
							}
							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2174 && var0.field1141 >= var1.field2166) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1141 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}
						class93.method2443(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					var2 = var1.method3812();
					if (var0.movementFrame < var2) {
						AttackOption.method2468(var1, var0.movementFrame, var0.x, var0.y);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2174) {
								++var0.field1141;
							}
							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2174 && var0.field1141 >= var1.field2166) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1141 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}
						AttackOption.method2468(var1, var0.movementFrame, var0.x, var0.y);
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
			int var4 = class13.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var4 != -1) {
				SequenceDefinition var5 = class14.SequenceDefinition_get(var4);
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class93.method2443(var5, var0.spotAnimationFrame, var0.x, var0.y);
					}
					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) {
					++var0.spotAnimationFrame;
					int var3 = var5.method3812();
					if (var0.spotAnimationFrame < var3) {
						AttackOption.method2468(var5, var0.spotAnimationFrame, var0.x, var0.y);
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
			var1 = class14.SequenceDefinition_get(var0.sequence);
			if (var1.field2173 == 1 && var0.field1203 > 0 && var0.field1194 <= Client.cycle && var0.field1166 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}
		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = class14.SequenceDefinition_get(var0.sequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						class93.method2443(var1, var0.sequenceFrame, var0.x, var0.y);
					}
					if (var0.sequenceFrame >= var1.frameIds.length) {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1174;
						if (var0.field1174 >= var1.field2166) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
							class93.method2443(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}
					var0.isWalking = var1.field2167;
				} else if (var1.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var2 = var1.method3812();
					if (var0.sequenceFrame < var2) {
						AttackOption.method2468(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1174;
						if (var0.field1174 >= var1.field2166) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) {
							AttackOption.method2468(var1, var0.sequenceFrame, var0.x, var0.y);
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
}