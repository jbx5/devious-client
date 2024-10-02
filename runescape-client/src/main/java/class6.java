import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public enum class6 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	field10(0, 0);

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("sw")
	static boolean field13;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -127788433
	)
	public final int field8;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 760951583
	)
	final int field11;

	class6(int var3, int var4) {
		this.field8 = var3;
		this.field11 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field11;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "1286630730"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1286083242"
	)
	static int method40(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return PacketWriter.method3110(var0, var1, var2);
		} else if (var0 < 1100) {
			return PcmPlayer.method840(var0, var1, var2);
		} else if (var0 < 1200) {
			return ClientPreferences.method2815(var0, var1, var2);
		} else if (var0 < 1300) {
			return MenuAction.method2302(var0, var1, var2);
		} else if (var0 < 1400) {
			return ClanChannelMember.method3494(var0, var1, var2);
		} else if (var0 < 1500) {
			return WidgetDefinition.method6853(var0, var1, var2);
		} else if (var0 < 1600) {
			return Decimator.method1146(var0, var1, var2);
		} else if (var0 < 1700) {
			return World.method1981(var0, var1, var2);
		} else if (var0 < 1800) {
			return World.method1949(var0, var1, var2);
		} else if (var0 < 1900) {
			return AABB.method5140(var0, var1, var2);
		} else if (var0 < 2000) {
			return GrandExchangeOfferOwnWorldComparator.method1257(var0, var1, var2);
		} else if (var0 < 2100) {
			return PcmPlayer.method840(var0, var1, var2);
		} else if (var0 < 2200) {
			return ClientPreferences.method2815(var0, var1, var2);
		} else if (var0 < 2300) {
			return MenuAction.method2302(var0, var1, var2);
		} else if (var0 < 2400) {
			return ClanChannelMember.method3494(var0, var1, var2);
		} else if (var0 < 2500) {
			return WidgetDefinition.method6853(var0, var1, var2);
		} else if (var0 < 2600) {
			return class271.method5645(var0, var1, var2);
		} else if (var0 < 2700) {
			return class60.method1196(var0, var1, var2);
		} else if (var0 < 2800) {
			return Decimator.method1161(var0, var1, var2);
		} else if (var0 < 2900) {
			return class338.method6702(var0, var1, var2);
		} else if (var0 < 3000) {
			return GrandExchangeOfferOwnWorldComparator.method1257(var0, var1, var2);
		} else if (var0 < 3200) {
			return WorldMapAreaData.method6287(var0, var1, var2);
		} else if (var0 < 3300) {
			return GraphicsObject.method2282(var0, var1, var2);
		} else if (var0 < 3400) {
			return class321.method6402(var0, var1, var2);
		} else if (var0 < 3500) {
			return MusicPatch.method6710(var0, var1, var2);
		} else if (var0 < 3600) {
			return class36.method706(var0, var1, var2);
		} else if (var0 < 3700) {
			return FloatProjection.method5138(var0, var1, var2);
		} else if (var0 < 3800) {
			return WorldMapDecoration.method6190(var0, var1, var2);
		} else if (var0 < 3900) {
			return GrandExchangeOfferNameComparator.method7670(var0, var1, var2);
		} else if (var0 < 4000) {
			return RouteStrategy.method5666(var0, var1, var2);
		} else if (var0 < 4100) {
			return Calendar.method7404(var0, var1, var2);
		} else if (var0 < 4200) {
			return GrandExchangeEvents.method7649(var0, var1, var2);
		} else if (var0 < 4300) {
			return HealthBarDefinition.method3913(var0, var1, var2);
		} else if (var0 < 5100) {
			return DynamicObject.method2398(var0, var1, var2);
		} else if (var0 < 5400) {
			return World.method1983(var0, var1, var2);
		} else if (var0 < 5600) {
			return class535.method9740(var0, var1, var2);
		} else if (var0 < 5700) {
			return class190.method3947(var0, var1, var2);
		} else if (var0 < 6300) {
			return class455.method8693(var0, var1, var2);
		} else if (var0 < 6600) {
			return class96.method2612(var0, var1, var2);
		} else if (var0 < 6700) {
			return ScriptEvent.method2520(var0, var1, var2);
		} else if (var0 < 6800) {
			return VertexNormal.method5414(var0, var1, var2);
		} else if (var0 < 6900) {
			return ScriptFrame.method1215(var0, var1, var2);
		} else if (var0 < 7000) {
			return DelayFadeTask.method8590(var0, var1, var2);
		} else if (var0 < 7100) {
			return MusicPatch.method6712(var0, var1, var2);
		} else if (var0 < 7200) {
			return HorizontalAlignment.method3953(var0, var1, var2);
		} else if (var0 < 7500) {
			return WorldMapElement.method3845(var0, var1, var2);
		} else if (var0 < 7600) {
			return class77.method2303(var0, var1, var2);
		} else if (var0 < 7700) {
			return SequenceDefinition.method4362(var0, var1, var2);
		} else if (var0 < 8000) {
			return HealthBarUpdate.method2693(var0, var1, var2);
		} else {
			return var0 < 8100 ? class133.method3274(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	public static int method36(int var0, int var1, int var2) {
		int var3 = class354.method6857(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	public static void method41() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "([Lny;IB)V",
		garbageValue = "127"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class172.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && class172.isComponentHidden(var3) && var3 != class275.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (TaskHandler.widgetDefinition.loadInterface(var5)) {
							drawModelComponents(TaskHandler.widgetDefinition.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = PacketWriter.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = HealthBarUpdate.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; SecureRandomCallable.invalidateWidget(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
									++var3.modelFrame;
									if (var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount;
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.graphicsCycle;
								int var7 = var6.method4368();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								SecureRandomCallable.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3909 != 0 && !var3.isIf3) {
						int var9 = var3.field3909 >> 16;
						var5 = var3.field3909 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						SecureRandomCallable.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
