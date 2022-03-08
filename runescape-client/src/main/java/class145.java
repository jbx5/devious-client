import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("eq")
public class class145 extends class126 {
    @ObfuscatedName("w")
    @Export("Widget_loadedInterfaces")
    public static boolean[] Widget_loadedInterfaces;

    @ObfuscatedName("bc")
    @Export("otp")
    static String otp;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 392490561)
    int field1651;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class145(class129 var1) {
        this.this$0 = var1;
        this.field1651 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1651 = var1.readUnsignedShort();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2858(this.field1651);
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(Lgn;[Lgi;B)V", garbageValue = "-83")
    static final void method2976(Scene var0, CollisionMap[] var1) {
        int var2;
        int var3;
        int var4;
        int var5;
        for (var2 = 0; var2 < 4; ++var2) {
            for (var3 = 0; var3 < 104; ++var3) {
                for (var4 = 0; var4 < 104; ++var4) {
                    if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
                        var5 = var2;
                        if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            var1[var5].setBlockedByFloor(var3, var4);
                        }
                    }
                }
            }
        }
        Tiles.rndHue += ((int) (Math.random() * 5.0)) - 2;
        if (Tiles.rndHue < (-8)) {
            Tiles.rndHue = -8;
        }
        if (Tiles.rndHue > 8) {
            Tiles.rndHue = 8;
        }
        Tiles.rndLightness += ((int) (Math.random() * 5.0)) - 2;
        if (Tiles.rndLightness < (-16)) {
            Tiles.rndLightness = -16;
        }
        if (Tiles.rndLightness > 16) {
            Tiles.rndLightness = 16;
        }
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var10000;
        int var17;
        int var18;
        for (var2 = 0; var2 < 4; ++var2) {
            byte[][] var44 = class260.field3078[var2];
            boolean var53 = true;
            boolean var54 = true;
            boolean var6 = true;
            boolean var7 = true;
            boolean var8 = true;
            var9 = ((int) (Math.sqrt(5100.0)));
            var10 = (var9 * 768) >> 8;
            int var19;
            int var20;
            for (var11 = 1; var11 < 103; ++var11) {
                for (var12 = 1; var12 < 103; ++var12) {
                    var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
                    var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
                    var15 = ((int) (Math.sqrt(((double) (((var13 * var13) + (var14 * var14)) + 65536)))));
                    var16 = (var13 << 8) / var15;
                    var17 = 65536 / var15;
                    var18 = (var14 << 8) / var15;
                    var19 = ((((var18 * (-50)) + (var16 * (-50))) + (var17 * (-10))) / var10) + 96;
                    var20 = ((((var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2)) + (var44[var12 + 1][var11] >> 3)) + (var44[var12][var11 + 1] >> 3)) + (var44[var12][var11] >> 1);
                    class19.field106[var12][var11] = var19 - var20;
                }
            }
            for (var11 = 0; var11 < 104; ++var11) {
                class7.Tiles_hue[var11] = 0;
                RouteStrategy.Tiles_saturation[var11] = 0;
                AbstractByteArrayCopier.Tiles_lightness[var11] = 0;
                class1.Tiles_hueMultiplier[var11] = 0;
                VarcInt.field1789[var11] = 0;
            }
            for (var11 = -5; var11 < 109; ++var11) {
                for (var12 = 0; var12 < 104; ++var12) {
                    var13 = var11 + 5;
                    int var10002;
                    if ((var13 >= 0) && (var13 < 104)) {
                        var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255;
                        if (var14 > 0) {
                            var16 = var14 - 1;
                            FloorUnderlayDefinition var48 = ((FloorUnderlayDefinition) (FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get(((long) (var16)))));
                            FloorUnderlayDefinition var50;
                            if (var48 != null) {
                                var50 = var48;
                            } else {
                                byte[] var49 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16);
                                var48 = new FloorUnderlayDefinition();
                                if (var49 != null) {
                                    var48.decode(new Buffer(var49), var16);
                                }
                                var48.postDecode();
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var48, ((long) (var16)));
                                var50 = var48;
                            }
                            var10000 = class7.Tiles_hue;
                            var10000[var12] += var50.hue;
                            var10000 = RouteStrategy.Tiles_saturation;
                            var10000[var12] += var50.saturation;
                            var10000 = AbstractByteArrayCopier.Tiles_lightness;
                            var10000[var12] += var50.lightness;
                            var10000 = class1.Tiles_hueMultiplier;
                            var10000[var12] += var50.hueMultiplier;
                            var10002 = VarcInt.field1789[var12]++;
                        }
                    }
                    var14 = var11 - 5;
                    if ((var14 >= 0) && (var14 < 104)) {
                        var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255;
                        if (var15 > 0) {
                            var17 = var15 - 1;
                            FloorUnderlayDefinition var61 = ((FloorUnderlayDefinition) (FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get(((long) (var17)))));
                            FloorUnderlayDefinition var52;
                            if (var61 != null) {
                                var52 = var61;
                            } else {
                                byte[] var51 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17);
                                var61 = new FloorUnderlayDefinition();
                                if (var51 != null) {
                                    var61.decode(new Buffer(var51), var17);
                                }
                                var61.postDecode();
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var61, ((long) (var17)));
                                var52 = var61;
                            }
                            var10000 = class7.Tiles_hue;
                            var10000[var12] -= var52.hue;
                            var10000 = RouteStrategy.Tiles_saturation;
                            var10000[var12] -= var52.saturation;
                            var10000 = AbstractByteArrayCopier.Tiles_lightness;
                            var10000[var12] -= var52.lightness;
                            var10000 = class1.Tiles_hueMultiplier;
                            var10000[var12] -= var52.hueMultiplier;
                            var10002 = VarcInt.field1789[var12]--;
                        }
                    }
                }
                if ((var11 >= 1) && (var11 < 103)) {
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    for (var17 = -5; var17 < 109; ++var17) {
                        var18 = var17 + 5;
                        if ((var18 >= 0) && (var18 < 104)) {
                            var12 += class7.Tiles_hue[var18];
                            var13 += RouteStrategy.Tiles_saturation[var18];
                            var14 += AbstractByteArrayCopier.Tiles_lightness[var18];
                            var15 += class1.Tiles_hueMultiplier[var18];
                            var16 += VarcInt.field1789[var18];
                        }
                        var19 = var17 - 5;
                        if ((var19 >= 0) && (var19 < 104)) {
                            var12 -= class7.Tiles_hue[var19];
                            var13 -= RouteStrategy.Tiles_saturation[var19];
                            var14 -= AbstractByteArrayCopier.Tiles_lightness[var19];
                            var15 -= class1.Tiles_hueMultiplier[var19];
                            var16 -= VarcInt.field1789[var19];
                        }
                        if (((var17 >= 1) && (var17 < 103)) && (((!Client.isLowDetail) || ((Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0)) || ((Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0))) {
                            if (var2 < Tiles.Tiles_minPlane) {
                                Tiles.Tiles_minPlane = var2;
                            }
                            var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255;
                            int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255;
                            if ((var20 > 0) || (var21 > 0)) {
                                int var22 = Tiles.Tiles_heights[var2][var11][var17];
                                int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
                                int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
                                int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
                                int var26 = class19.field106[var11][var17];
                                int var27 = class19.field106[var11 + 1][var17];
                                int var28 = class19.field106[var11 + 1][var17 + 1];
                                int var29 = class19.field106[var11][var17 + 1];
                                int var30 = -1;
                                int var31 = -1;
                                int var32;
                                int var33;
                                int var34;
                                if (var20 > 0) {
                                    var32 = (var12 * 256) / var15;
                                    var33 = var13 / var16;
                                    var34 = var14 / var16;
                                    var30 = KitDefinition.hslToRgb(var32, var33, var34);
                                    var32 = (var32 + Tiles.rndHue) & 255;
                                    var34 += Tiles.rndLightness;
                                    if (var34 < 0) {
                                        var34 = 0;
                                    } else if (var34 > 255) {
                                        var34 = 255;
                                    }
                                    var31 = KitDefinition.hslToRgb(var32, var33, var34);
                                }
                                FloorOverlayDefinition var35;
                                if (var2 > 0) {
                                    boolean var59 = true;
                                    if ((var20 == 0) && (Tiles.Tiles_shapes[var2][var11][var17] != 0)) {
                                        var59 = false;
                                    }
                                    if (var21 > 0) {
                                        var34 = var21 - 1;
                                        var35 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var34)))));
                                        FloorOverlayDefinition var45;
                                        if (var35 != null) {
                                            var45 = var35;
                                        } else {
                                            byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34);
                                            var35 = new FloorOverlayDefinition();
                                            if (var36 != null) {
                                                var35.decode(new Buffer(var36), var34);
                                            }
                                            var35.postDecode();
                                            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, ((long) (var34)));
                                            var45 = var35;
                                        }
                                        if (!var45.hideUnderlay) {
                                            var59 = false;
                                        }
                                    }
                                    if (((var59 && (var23 == var22)) && (var22 == var24)) && (var22 == var25)) {
                                        var10000 = class78.field1033[var2][var11];
                                        var10000[var17] |= 2340;
                                    }
                                }
                                var32 = 0;
                                if (var31 != (-1)) {
                                    var32 = Rasterizer3D.Rasterizer3D_colorPalette[ItemComposition.method3571(var31, 96)];
                                }
                                if (var21 == 0) {
                                    var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, ItemComposition.method3571(var30, var26), ItemComposition.method3571(var30, var27), ItemComposition.method3571(var30, var28), ItemComposition.method3571(var30, var29), 0, 0, 0, 0, var32, 0);
                                } else {
                                    var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
                                    byte var60 = Tiles.field998[var2][var11][var17];
                                    int var46 = var21 - 1;
                                    FloorOverlayDefinition var37 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var46)))));
                                    if (var37 != null) {
                                        var35 = var37;
                                    } else {
                                        byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var46);
                                        var37 = new FloorOverlayDefinition();
                                        if (var38 != null) {
                                            var37.decode(new Buffer(var38), var46);
                                        }
                                        var37.postDecode();
                                        FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, ((long) (var46)));
                                        var35 = var37;
                                    }
                                    int var47 = var35.texture;
                                    int var39;
                                    int var40;
                                    int var41;
                                    int var42;
                                    if (var47 >= 0) {
                                        var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var47);
                                        var39 = -1;
                                    } else if (var35.primaryRgb == 16711935) {
                                        var39 = -2;
                                        var47 = -1;
                                        var40 = -2;
                                    } else {
                                        var39 = KitDefinition.hslToRgb(var35.hue, var35.saturation, var35.lightness);
                                        var41 = (var35.hue + Tiles.rndHue) & 255;
                                        var42 = var35.lightness + Tiles.rndLightness;
                                        if (var42 < 0) {
                                            var42 = 0;
                                        } else if (var42 > 255) {
                                            var42 = 255;
                                        }
                                        var40 = KitDefinition.hslToRgb(var41, var35.saturation, var42);
                                    }
                                    var41 = 0;
                                    if (var40 != (-2)) {
                                        var41 = Rasterizer3D.Rasterizer3D_colorPalette[IgnoreList.method6264(var40, 96)];
                                    }
                                    if (var35.secondaryRgb != (-1)) {
                                        var42 = (var35.secondaryHue + Tiles.rndHue) & 255;
                                        int var43 = var35.secondaryLightness + Tiles.rndLightness;
                                        if (var43 < 0) {
                                            var43 = 0;
                                        } else if (var43 > 255) {
                                            var43 = 255;
                                        }
                                        var40 = KitDefinition.hslToRgb(var42, var35.secondarySaturation, var43);
                                        var41 = Rasterizer3D.Rasterizer3D_colorPalette[IgnoreList.method6264(var40, 96)];
                                    }
                                    var0.addTile(var2, var11, var17, var33, var60, var47, var22, var23, var24, var25, ItemComposition.method3571(var30, var26), ItemComposition.method3571(var30, var27), ItemComposition.method3571(var30, var28), ItemComposition.method3571(var30, var29), IgnoreList.method6264(var39, var26), IgnoreList.method6264(var39, var27), IgnoreList.method6264(var39, var28), IgnoreList.method6264(var39, var29), var32, var41);
                                }
                            }
                        }
                    }
                }
            }
            for (var11 = 1; var11 < 103; ++var11) {
                for (var12 = 1; var12 < 103; ++var12) {
                    var0.setTileMinPlane(var2, var12, var11, class293.method5482(var2, var12, var11));
                }
            }
            Tiles.Tiles_underlays[var2] = null;
            Tiles.Tiles_overlays[var2] = null;
            Tiles.Tiles_shapes[var2] = null;
            Tiles.field998[var2] = null;
            class260.field3078[var2] = null;
        }
        var0.method3927(-50, -10, -50);
        for (var2 = 0; var2 < 104; ++var2) {
            for (var3 = 0; var3 < 104; ++var3) {
                if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
                    var0.setLinkBelow(var2, var3);
                }
            }
        }
        var2 = 1;
        var3 = 2;
        var4 = 4;
        for (var5 = 0; var5 < 4; ++var5) {
            if (var5 > 0) {
                var2 <<= 3;
                var3 <<= 3;
                var4 <<= 3;
            }
            for (int var55 = 0; var55 <= var5; ++var55) {
                for (int var56 = 0; var56 <= 104; ++var56) {
                    for (int var57 = 0; var57 <= 104; ++var57) {
                        short var58;
                        if ((class78.field1033[var55][var57][var56] & var2) != 0) {
                            var9 = var56;
                            var10 = var56;
                            var11 = var55;
                            for (var12 = var55; (var9 > 0) && ((class78.field1033[var55][var57][var9 - 1] & var2) != 0); --var9) {
                            }
                            while ((var10 < 104) && ((class78.field1033[var55][var57][var10 + 1] & var2) != 0)) {
                                ++var10;
                            } 
                            label473 : while (var11 > 0) {
                                for (var13 = var9; var13 <= var10; ++var13) {
                                    if ((class78.field1033[var11 - 1][var57][var13] & var2) == 0) {
                                        break label473;
                                    }
                                }
                                --var11;
                            } 
                            label462 : while (var12 < var5) {
                                for (var13 = var9; var13 <= var10; ++var13) {
                                    if ((class78.field1033[var12 + 1][var57][var13] & var2) == 0) {
                                        break label462;
                                    }
                                }
                                ++var12;
                            } 
                            var13 = ((var10 - var9) + 1) * ((var12 + 1) - var11);
                            if (var13 >= 8) {
                                var58 = 240;
                                var15 = Tiles.Tiles_heights[var12][var57][var9] - var58;
                                var16 = Tiles.Tiles_heights[var11][var57][var9];
                                Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, (var10 * 128) + 128, var15, var16);
                                for (var17 = var11; var17 <= var12; ++var17) {
                                    for (var18 = var9; var18 <= var10; ++var18) {
                                        var10000 = class78.field1033[var17][var57];
                                        var10000[var18] &= ~var2;
                                    }
                                }
                            }
                        }
                        if ((class78.field1033[var55][var57][var56] & var3) != 0) {
                            var9 = var57;
                            var10 = var57;
                            var11 = var55;
                            for (var12 = var55; (var9 > 0) && ((class78.field1033[var55][var9 - 1][var56] & var3) != 0); --var9) {
                            }
                            while ((var10 < 104) && ((class78.field1033[var55][var10 + 1][var56] & var3) != 0)) {
                                ++var10;
                            } 
                            label526 : while (var11 > 0) {
                                for (var13 = var9; var13 <= var10; ++var13) {
                                    if ((class78.field1033[var11 - 1][var13][var56] & var3) == 0) {
                                        break label526;
                                    }
                                }
                                --var11;
                            } 
                            label515 : while (var12 < var5) {
                                for (var13 = var9; var13 <= var10; ++var13) {
                                    if ((class78.field1033[var12 + 1][var13][var56] & var3) == 0) {
                                        break label515;
                                    }
                                }
                                ++var12;
                            } 
                            var13 = ((var10 - var9) + 1) * ((var12 + 1) - var11);
                            if (var13 >= 8) {
                                var58 = 240;
                                var15 = Tiles.Tiles_heights[var12][var9][var56] - var58;
                                var16 = Tiles.Tiles_heights[var11][var9][var56];
                                Scene.Scene_addOccluder(var5, 2, var9 * 128, (var10 * 128) + 128, var56 * 128, var56 * 128, var15, var16);
                                for (var17 = var11; var17 <= var12; ++var17) {
                                    for (var18 = var9; var18 <= var10; ++var18) {
                                        var10000 = class78.field1033[var17][var18];
                                        var10000[var56] &= ~var3;
                                    }
                                }
                            }
                        }
                        if ((class78.field1033[var55][var57][var56] & var4) != 0) {
                            var9 = var57;
                            var10 = var57;
                            var11 = var56;
                            for (var12 = var56; (var11 > 0) && ((class78.field1033[var55][var57][var11 - 1] & var4) != 0); --var11) {
                            }
                            while ((var12 < 104) && ((class78.field1033[var55][var57][var12 + 1] & var4) != 0)) {
                                ++var12;
                            } 
                            label579 : while (var9 > 0) {
                                for (var13 = var11; var13 <= var12; ++var13) {
                                    if ((class78.field1033[var55][var9 - 1][var13] & var4) == 0) {
                                        break label579;
                                    }
                                }
                                --var9;
                            } 
                            label568 : while (var10 < 104) {
                                for (var13 = var11; var13 <= var12; ++var13) {
                                    if ((class78.field1033[var55][var10 + 1][var13] & var4) == 0) {
                                        break label568;
                                    }
                                }
                                ++var10;
                            } 
                            if ((((var10 - var9) + 1) * ((var12 - var11) + 1)) >= 4) {
                                var13 = Tiles.Tiles_heights[var55][var9][var11];
                                Scene.Scene_addOccluder(var5, 4, var9 * 128, (var10 * 128) + 128, var11 * 128, (var12 * 128) + 128, var13, var13);
                                for (var14 = var9; var14 <= var10; ++var14) {
                                    for (var15 = var11; var15 <= var12; ++var15) {
                                        var10000 = class78.field1033[var55][var14];
                                        var10000[var15] &= ~var4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}