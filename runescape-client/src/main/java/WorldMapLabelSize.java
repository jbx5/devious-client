import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("hy")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("tx")
	@ObfuscatedGetter(intValue = 250890624)
	static int field2673;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lhy;")
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lhy;")
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lhy;")
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);

	@ObfuscatedName("jz")
	@ObfuscatedGetter(intValue = 797881643)
	@Export("cameraX")
	static int cameraX;

	@ObfuscatedName("pf")
	@ObfuscatedGetter(intValue = -1936766189)
	static int field2667;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -33133369)
	final int field2663;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 405844709)
	final int field2660;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1054164177)
	final int field2661;

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2663 = var1;
		this.field2660 = var2;
		this.field2661 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(FB)Z", garbageValue = "-55")
	boolean method4533(float var1) {
		return var1 >= ((float) (this.field2661));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V", garbageValue = "1029928300")
	static void method4535(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance);
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lhy;", garbageValue = "487763242")
	static WorldMapLabelSize method4534(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{ WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium };
		WorldMapLabelSize[] var2 = var1;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field2660) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqy;S)V", garbageValue = "30541")
	static final void method4532(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();
		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1293[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1293;
					var10000[var5] = ((byte) (var10000[var5] | 2));
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = class78.method2158(var0);
						var10000 = Players.field1293;
						var10000[var5] = ((byte) (var10000[var5] | 2));
					} else {
						class259.readPlayerUpdate(var0, var5);
					}
				}
			}
		}
		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();
			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1293[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1293;
						var10000[var5] = ((byte) (var10000[var5] | 2));
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = class78.method2158(var0);
							var10000 = Players.field1293;
							var10000[var5] = ((byte) (var10000[var5] | 2));
						} else {
							class259.readPlayerUpdate(var0, var5);
						}
					}
				}
			}
			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();
				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1293[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1293;
							var10000[var5] = ((byte) (var10000[var5] | 2));
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = class78.method2158(var0);
								var10000 = Players.field1293;
								var10000[var5] = ((byte) (var10000[var5] | 2));
							} else if (WorldMapSectionType.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1293;
								var10000[var5] = ((byte) (var10000[var5] | 2));
							}
						}
					}
				}
				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();
					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1293[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1293;
								var10000[var5] = ((byte) (var10000[var5] | 2));
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = class78.method2158(var0);
									var10000 = Players.field1293;
									var10000[var5] = ((byte) (var10000[var5] | 2));
								} else if (WorldMapSectionType.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1293;
									var10000[var5] = ((byte) (var10000[var5] | 2));
								}
							}
						}
					}
					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;
						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1293;
							var10000[var2] = ((byte) (var10000[var2] >> 1));
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(ILku;IIIII[FB)Lku;", garbageValue = "94")
	static Widget method4542(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = ((int) (var7[0] * ((float) (var1.width))));
		var8.rawY = ((int) (((float) (var1.height)) * var7[1]));
		var8.rawWidth = ((int) (((float) (var1.width)) * var7[2]));
		var8.rawHeight = ((int) (var7[3] * ((float) (var1.height))));
		return var8;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "641313023")
	static int method4539(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(descriptor = "([Lku;II)V", garbageValue = "-2014511302")
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !ModeWhere.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && ModeWhere.isComponentHidden(var3) && var3 != FontName.mousedOverWidgetIf1) {
						continue;
					}
					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}
					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						ReflectionCheck.method610(var4.group);
					}
				}
				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = FriendSystem.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}
						if (var5 != -1) {
							SequenceDefinition var6 = class14.SequenceDefinition_get(var5);
							for (var3.modelFrameCycle += Client.field744; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class220.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}
					if (var3.field3422 != 0 && !var3.isIf3) {
						int var8 = var3.field3422 >> 16;
						var5 = var3.field3422 << 16 >> 16;
						var8 *= Client.field744;
						var5 *= Client.field744;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class220.invalidateWidget(var3);
					}
				}
			}
		}
	}
}