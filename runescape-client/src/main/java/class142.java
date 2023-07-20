import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class142 extends class143 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1117255129
	)
	int field1644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class142(class146 var1) {
		this.this$0 = var1;
		this.field1644 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1644 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3277(this.field1644);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "-51"
	)
	static int method3122(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class301.method5746(var0, var1, var2);
		} else if (var0 < 1100) {
			return UserComparator10.method2903(var0, var1, var2);
		} else if (var0 < 1200) {
			return SecureRandomFuture.method2151(var0, var1, var2);
		} else if (var0 < 1300) {
			return class60.method1195(var0, var1, var2);
		} else if (var0 < 1400) {
			return class9.method83(var0, var1, var2);
		} else if (var0 < 1500) {
			return class20.method297(var0, var1, var2);
		} else if (var0 < 1600) {
			return class10.method84(var0, var1, var2);
		} else if (var0 < 1700) {
			return class423.method7819(var0, var1, var2);
		} else if (var0 < 1800) {
			return Player.method2365(var0, var1, var2);
		} else if (var0 < 1900) {
			return WorldMapIcon_1.method5097(var0, var1, var2);
		} else if (var0 < 2000) {
			return class319.method6071(var0, var1, var2);
		} else if (var0 < 2100) {
			return UserComparator10.method2903(var0, var1, var2);
		} else if (var0 < 2200) {
			return SecureRandomFuture.method2151(var0, var1, var2);
		} else if (var0 < 2300) {
			return class60.method1195(var0, var1, var2);
		} else if (var0 < 2400) {
			return class9.method83(var0, var1, var2);
		} else if (var0 < 2500) {
			return class20.method297(var0, var1, var2);
		} else if (var0 < 2600) {
			return VarcInt.method3638(var0, var1, var2);
		} else if (var0 < 2700) {
			return class47.method879(var0, var1, var2);
		} else if (var0 < 2800) {
			return ClanChannel.method3381(var0, var1, var2);
		} else if (var0 < 2900) {
			return HealthBarUpdate.method2423(var0, var1, var2);
		} else if (var0 < 3000) {
			return class319.method6071(var0, var1, var2);
		} else if (var0 < 3200) {
			return class9.method77(var0, var1, var2);
		} else if (var0 < 3300) {
			return ViewportMouse.method4923(var0, var1, var2);
		} else if (var0 < 3400) {
			return ApproximateRouteStrategy.method1246(var0, var1, var2);
		} else if (var0 < 3500) {
			return FloorDecoration.method4387(var0, var1, var2);
		} else if (var0 < 3600) {
			return class467.method8435(var0, var1, var2);
		} else if (var0 < 3700) {
			return class92.method2366(var0, var1, var2);
		} else if (var0 < 3800) {
			return Interpreter.method2073(var0, var1, var2);
		} else if (var0 < 3900) {
			return class345.method6645(var0, var1, var2);
		} else if (var0 < 4000) {
			return Occluder.method4753(var0, var1, var2);
		} else if (var0 < 4100) {
			return MouseRecorder.method2297(var0, var1, var2);
		} else if (var0 < 4200) {
			return FriendSystem.method1934(var0, var1, var2);
		} else if (var0 < 4300) {
			return class339.method6628(var0, var1, var2);
		} else if (var0 < 5100) {
			return class335.method6600(var0, var1, var2);
		} else if (var0 < 5400) {
			return class113.method2836(var0, var1, var2);
		} else if (var0 < 5600) {
			return WorldMapRectangle.method5512(var0, var1, var2);
		} else if (var0 < 5700) {
			return RouteStrategy.method4230(var0, var1, var2);
		} else if (var0 < 6300) {
			return ApproximateRouteStrategy.method1247(var0, var1, var2);
		} else if (var0 < 6600) {
			return class167.method3413(var0, var1, var2);
		} else if (var0 < 6700) {
			return WorldMapRectangle.method5511(var0, var1, var2);
		} else if (var0 < 6800) {
			return GrandExchangeOfferOwnWorldComparator.method1249(var0, var1, var2);
		} else if (var0 < 6900) {
			return class12.method167(var0, var1, var2);
		} else if (var0 < 7000) {
			return MouseRecorder.method2295(var0, var1, var2);
		} else if (var0 < 7100) {
			return class159.method3327(var0, var1, var2);
		} else if (var0 < 7200) {
			return class219.method4284(var0, var1, var2);
		} else if (var0 < 7300) {
			return class30.method447(var0, var1, var2);
		} else if (var0 < 7500) {
			return class18.method274(var0, var1, var2);
		} else if (var0 < 7600) {
			return WorldMapScaleHandler.method5645(var0, var1, var2);
		} else {
			return var0 < 7700 ? MenuAction.method2084(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "([Lmt;II)V",
		garbageValue = "-535637665"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !WorldMapDecorationType.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && WorldMapDecorationType.isComponentHidden(var3) && var3 != WorldMapScaleHandler.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (Login.loadInterface(var5)) {
							drawModelComponents(ArchiveLoader.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = GrandExchangeOfferOwnWorldComparator.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = class135.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class200.invalidateWidget(var3)) {
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
								int var7 = var6.method4074();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								class200.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3680 != 0 && !var3.isIf3) {
						int var9 = var3.field3680 >> 16;
						var5 = var3.field3680 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class200.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
