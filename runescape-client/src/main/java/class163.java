import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class163 extends class145 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -837953891
	)
	int field1792;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1269869285
	)
	int field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class163(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1792 = var1.readInt();
		this.field1793 = var1.readInt();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3335(this.field1792, this.field1793);
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lng;II)V",
		garbageValue = "1981220516"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !PcmPlayer.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && PcmPlayer.isComponentHidden(var3) && var3 != class134.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						WorldMapRenderer.method4881(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = class341.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = MilliClock.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; UserComparator5.invalidateWidget(var3)) {
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
								int var7 = var6.method4065();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								UserComparator5.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3782 != 0 && !var3.isIf3) {
						int var9 = var3.field3782 >> 16;
						var5 = var3.field3782 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						UserComparator5.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
