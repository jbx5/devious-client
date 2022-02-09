import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ny")
public abstract class class376 extends class242 implements class427 {
    @ObfuscatedSignature(descriptor = "(Lkr;Llu;I)V")
    protected class376(StudioGame var1, Language var2, int var3) {
        super(var1, var2, var3);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Lnu;", garbageValue = "-1605592337")
    protected abstract class378 vmethod7211(int var1);

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "12")
    public int method6782() {
        return super.field2806;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/Object;", garbageValue = "-1833568936")
    public Object vmethod7649(int var1) {
        class378 var2 = this.vmethod7211(var1);
        return (var2 != null) && var2.method6799() ? var2.method6800() : null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;I)Lpo;", garbageValue = "1706426985")
    public class428 method6784(Buffer var1) {
        int var2 = var1.readUnsignedShort();
        class378 var3 = this.vmethod7211(var2);
        class428 var4 = new class428(var2);
        Class var5 = var3.field4270.field4492;
        if (var5 == Integer.class) {
            var4.field4575 = var1.readInt();
        } else if (var5 == Long.class) {
            var4.field4575 = var1.readLong();
        } else if (var5 == String.class) {
            var4.field4575 = var1.readStringCp1252NullCircumfixed();
        } else {
            if (!class423.class.isAssignableFrom(var5)) {
                throw new IllegalStateException();
            }
            try {
                class423 var6 = ((class423) (var5.newInstance()));
                var6.method7625(var1);
                var4.field4575 = var6;
            } catch (InstantiationException var7) {
            } catch (IllegalAccessException var8) {
            }
        }
        return var4;
    }

    @ObfuscatedName("jp")
    @ObfuscatedSignature(descriptor = "(Ljz;IB)I", garbageValue = "7")
    static final int method6791(Widget var0, int var1) {
        if ((var0.cs1Instructions != null) && (var1 < var0.cs1Instructions.length)) {
            try {
                int[] var2 = var0.cs1Instructions[var1];
                int var3 = 0;
                int var4 = 0;
                byte var5 = 0;
                while (true) {
                    int var6 = var2[var4++];
                    int var7 = 0;
                    byte var8 = 0;
                    if (var6 == 0) {
                        return var3;
                    }
                    if (var6 == 1) {
                        var7 = Client.currentLevels[var2[var4++]];
                    }
                    if (var6 == 2) {
                        var7 = Client.levels[var2[var4++]];
                    }
                    if (var6 == 3) {
                        var7 = Client.experience[var2[var4++]];
                    }
                    int var9;
                    Widget var10;
                    int var11;
                    int var12;
                    if (var6 == 4) {
                        var9 = var2[var4++] << 16;
                        var9 += var2[var4++];
                        var10 = class130.getWidget(var9);
                        var11 = var2[var4++];
                        if ((var11 != (-1)) && ((!Client.ItemDefinition_get(var11).isMembersOnly) || Client.isMembersWorld)) {
                            for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
                                if ((var11 + 1) == var10.itemIds[var12]) {
                                    var7 += var10.itemQuantities[var12];
                                }
                            }
                        }
                    }
                    if (var6 == 5) {
                        var7 = Varps.Varps_main[var2[var4++]];
                    }
                    if (var6 == 6) {
                        var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
                    }
                    if (var6 == 7) {
                        var7 = (Varps.Varps_main[var2[var4++]] * 100) / 46875;
                    }
                    if (var6 == 8) {
                        var7 = WorldMapSprite.localPlayer.combatLevel;
                    }
                    if (var6 == 9) {
                        for (var9 = 0; var9 < 25; ++var9) {
                            if (Skills.Skills_enabled[var9]) {
                                var7 += Client.levels[var9];
                            }
                        }
                    }
                    if (var6 == 10) {
                        var9 = var2[var4++] << 16;
                        var9 += var2[var4++];
                        var10 = class130.getWidget(var9);
                        var11 = var2[var4++];
                        if ((var11 != (-1)) && ((!Client.ItemDefinition_get(var11).isMembersOnly) || Client.isMembersWorld)) {
                            for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
                                if ((var11 + 1) == var10.itemIds[var12]) {
                                    var7 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var6 == 11) {
                        var7 = Client.runEnergy;
                    }
                    if (var6 == 12) {
                        var7 = Client.weight;
                    }
                    if (var6 == 13) {
                        var9 = Varps.Varps_main[var2[var4++]];
                        int var13 = var2[var4++];
                        var7 = ((var9 & (1 << var13)) != 0) ? 1 : 0;
                    }
                    if (var6 == 14) {
                        var9 = var2[var4++];
                        var7 = class375.getVarbit(var9);
                    }
                    if (var6 == 15) {
                        var8 = 1;
                    }
                    if (var6 == 16) {
                        var8 = 2;
                    }
                    if (var6 == 17) {
                        var8 = 3;
                    }
                    if (var6 == 18) {
                        var7 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX;
                    }
                    if (var6 == 19) {
                        var7 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY;
                    }
                    if (var6 == 20) {
                        var7 = var2[var4++];
                    }
                    if (var8 == 0) {
                        if (var5 == 0) {
                            var3 += var7;
                        }
                        if (var5 == 1) {
                            var3 -= var7;
                        }
                        if ((var5 == 2) && (var7 != 0)) {
                            var3 /= var7;
                        }
                        if (var5 == 3) {
                            var3 *= var7;
                        }
                        var5 = 0;
                    } else {
                        var5 = var8;
                    }
                } 
            } catch (Exception var14) {
                return -1;
            }
        } else {
            return -2;
        }
    }
}