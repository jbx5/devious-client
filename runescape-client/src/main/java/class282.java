import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("js")
public class class282 {
	@ObfuscatedName("nm")
	@ObfuscatedGetter(intValue = 1739476279)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIB)Lbb;", garbageValue = "-83")
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		return var2.getMessage(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-322600603")
	public static boolean method5436(int var0) {
		return (var0 >> 28 & 1) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "2064384403")
	public static int method5435(byte[] var0, int var1, int var2) {
		int var3 = -1;
		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}
		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1548687437")
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (ParamComposition.loadInterface(var0)) {
				Widget[] var1 = class358.Widget_interfaceComponents[var0];
				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						GraphicsObject.runScript(var4, 5000000, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = "(Lgh;IIII)V", garbageValue = "1702625955")
	static void method5426(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && ClanMate.clientPreferences.method2226() != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = var4 >> 4 & 7;
					int var9 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var7;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(descriptor = "([Lkn;IB)V", garbageValue = "48")
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Tiles.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && Tiles.isComponentHidden(var3) && var3 != class113.mousedOverWidgetIf1) {
						continue;
					}
					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}
					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						var5 = var4.group;
						if (ParamComposition.loadInterface(var5)) {
							drawModelComponents(class358.Widget_interfaceComponents[var5], -1);
						}
					}
				}
				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = WorldMapRegion.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}
						if (var5 != -1) {
							SequenceDefinition var6 = ByteArrayPool.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.field599; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class125.invalidateWidget(var3)) {
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
								var3.modelFrame += Client.field599;
								int var7 = var6.method3729();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}
								class125.invalidateWidget(var3);
							}
						}
					}
					if (var3.field3414 != 0 && !var3.isIf3) {
						int var9 = var3.field3414 >> 16;
						var5 = var3.field3414 << 16 >> 16;
						var9 *= Client.field599;
						var5 *= Client.field599;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class125.invalidateWidget(var3);
					}
				}
			}
		}
	}
}