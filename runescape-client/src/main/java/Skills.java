import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ka")
@Implements("Skills")
public class Skills {
    @ObfuscatedName("l")
    @Export("Skills_enabled")
    public static final boolean[] Skills_enabled;

    @ObfuscatedName("s")
    @Export("Skills_experienceTable")
    public static int[] Skills_experienceTable;

    static {
        Skills_enabled = new boolean[]{ true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
        Skills_experienceTable = new int[99];
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = ((int) (((double) (var2)) + (300.0 * Math.pow(2.0, ((double) (var2)) / 7.0))));
            var0 += var3;
            Skills_experienceTable[var1] = var0 / 4;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(CB)C", garbageValue = "-24")
    static char method5473(char var0) {
        if (var0 == 198) {
            return 'E';
        } else if (var0 == 230) {
            return 'e';
        } else if (var0 == 223) {
            return 's';
        } else if (var0 == 338) {
            return 'E';
        } else {
            return ((char) (var0 == 339 ? 'e' : '\u0000'));
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "-1901343962")
    @Export("hashString")
    public static int hashString(CharSequence var0) {
        int var1 = var0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; ++var3) {
            var2 = ((var2 << 5) - var2) + UserComparator8.charToByteCp1252(var0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-887111276")
    public static boolean method5475(int var0) {
        return ((var0 >> 30) & 1) != 0;
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "158659145")
    static final int method5471(int var0, int var1) {
        int var2 = ((class10.method103(var0 + 45365, var1 + 91923, 4) - 128) + ((class10.method103(var0 + 10294, 37821 + var1, 2) - 128) >> 1)) + ((class10.method103(var0, var1, 1) - 128) >> 2);
        var2 = ((int) (((double) (var2)) * 0.3)) + 35;
        if (var2 < 10) {
            var2 = 10;
        } else if (var2 > 60) {
            var2 = 60;
        }
        return var2;
    }

    @ObfuscatedName("aa")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "656683502")
    static int method5476(int var0, Script var1, boolean var2) {
        int var3;
        if (var0 == ScriptOpcodes.OC_NAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = Client.ItemDefinition_get(var3).name;
            return 1;
        } else {
            int var4;
            ItemComposition var5;
            if (var0 == ScriptOpcodes.OC_OP) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Client.ItemDefinition_get(var3);
                if (((var4 >= 1) && (var4 <= 5)) && (var5.groundActions[var4 - 1] != null)) {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var5.groundActions[var4 - 1];
                } else {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                }
                return 1;
            } else if (var0 == ScriptOpcodes.OC_IOP) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var5 = Client.ItemDefinition_get(var3);
                if (((var4 >= 1) && (var4 <= 5)) && (var5.inventoryActions[var4 - 1] != null)) {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var5.inventoryActions[var4 - 1];
                } else {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                }
                return 1;
            } else if (var0 == ScriptOpcodes.OC_COST) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.ItemDefinition_get(var3).price;
                return 1;
            } else if (var0 == ScriptOpcodes.OC_STACKABLE) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Client.ItemDefinition_get(var3).isStackable == 1) ? 1 : 0;
                return 1;
            } else {
                ItemComposition var7;
                if (var0 == ScriptOpcodes.OC_CERT) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    var7 = Client.ItemDefinition_get(var3);
                    if ((var7.noteTemplate == (-1)) && (var7.note >= 0)) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.note;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.OC_UNCERT) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    var7 = Client.ItemDefinition_get(var3);
                    if ((var7.noteTemplate >= 0) && (var7.note >= 0)) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.note;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.OC_MEMBERS) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Client.ItemDefinition_get(var3).isMembersOnly) ? 1 : 0;
                    return 1;
                } else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    var7 = Client.ItemDefinition_get(var3);
                    if ((var7.placeholderTemplate == (-1)) && (var7.placeholder >= 0)) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.placeholder;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    var7 = Client.ItemDefinition_get(var3);
                    if ((var7.placeholderTemplate >= 0) && (var7.placeholder >= 0)) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.placeholder;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.OC_FIND) {
                    String var6 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    class16.findItemDefinitions(var6, var4 == 1);
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = FloorDecoration.foundItemIdCount;
                    return 1;
                } else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
                    if (var0 == ScriptOpcodes.OC_FINDRESET) {
                        RouteStrategy.foundItemIndex = 0;
                        return 1;
                    } else if (var0 == 4213) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = Client.ItemDefinition_get(var3).getShiftClickIndex();
                        if (var4 == (-1)) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4;
                        } else {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4 + 1;
                        }
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    if ((class133.foundItemIds != null) && (RouteStrategy.foundItemIndex < FloorDecoration.foundItemIdCount)) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class133.foundItemIds[(++RouteStrategy.foundItemIndex) - 1] & '￿';
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                    }
                    return 1;
                }
            }
        }
    }

    @ObfuscatedName("ii")
    @ObfuscatedSignature(descriptor = "([Ljz;IIIIIIIII)V", garbageValue = "1177185555")
    @Export("drawInterface")
    static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
        Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
        for (int var9 = 0; var9 < var0.length; ++var9) {
            Widget var10 = var0[var9];
            if ((var10 != null) && ((var10.parentId == var1) || ((var1 == (-1412584499)) && (var10 == Client.clickedWidget)))) {
                int var11;
                if (var8 == (-1)) {
                    Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
                    Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
                    Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
                    Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
                    var11 = (++Client.rootWidgetCount) - 1;
                } else {
                    var11 = var8;
                }
                var10.rootIndex = var11;
                var10.cycle = Client.cycle;
                if ((!var10.isIf3) || (!class260.isComponentHidden(var10))) {
                    if (var10.contentType > 0) {
                        class28.method406(var10);
                    }
                    int var12 = var10.x + var6;
                    int var13 = var7 + var10.y;
                    int var14 = var10.transparencyTop;
                    int var15;
                    int var16;
                    if (var10 == Client.clickedWidget) {
                        if ((var1 != (-1412584499)) && (!var10.isScrollBar)) {
                            WorldMapElement.field1784 = var0;
                            WorldMapData_1.field2676 = var6;
                            ParamComposition.field1938 = var7;
                            continue;
                        }
                        if (Client.isDraggingWidget && Client.field682) {
                            var15 = MouseHandler.MouseHandler_x;
                            var16 = MouseHandler.MouseHandler_y;
                            var15 -= Client.widgetClickX;
                            var16 -= Client.widgetClickY;
                            if (var15 < Client.field606) {
                                var15 = Client.field606;
                            }
                            if ((var15 + var10.width) > (Client.field606 + Client.clickedWidgetParent.width)) {
                                var15 = (Client.field606 + Client.clickedWidgetParent.width) - var10.width;
                            }
                            if (var16 < Client.field561) {
                                var16 = Client.field561;
                            }
                            if ((var16 + var10.height) > (Client.field561 + Client.clickedWidgetParent.height)) {
                                var16 = (Client.field561 + Client.clickedWidgetParent.height) - var10.height;
                            }
                            var12 = var15;
                            var13 = var16;
                        }
                        if (!var10.isScrollBar) {
                            var14 = 128;
                        }
                    }
                    int var17;
                    int var18;
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.type == 2) {
                        var15 = var2;
                        var16 = var3;
                        var17 = var4;
                        var18 = var5;
                    } else if (var10.type == 9) {
                        var19 = var12;
                        var20 = var13;
                        var21 = var12 + var10.width;
                        var22 = var13 + var10.height;
                        if (var21 < var12) {
                            var19 = var21;
                            var21 = var12;
                        }
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }
                        ++var21;
                        ++var22;
                        var15 = (var19 > var2) ? var19 : var2;
                        var16 = (var20 > var3) ? var20 : var3;
                        var17 = (var21 < var4) ? var21 : var4;
                        var18 = (var22 < var5) ? var22 : var5;
                    } else {
                        var19 = var12 + var10.width;
                        var20 = var13 + var10.height;
                        var15 = (var12 > var2) ? var12 : var2;
                        var16 = (var13 > var3) ? var13 : var3;
                        var17 = (var19 < var4) ? var19 : var4;
                        var18 = (var20 < var5) ? var20 : var5;
                    }
                    if ((!var10.isIf3) || ((var15 < var17) && (var16 < var18))) {
                        if (var10.contentType != 0) {
                            if (var10.contentType == 1336) {
                                if (Client.displayFps) {
                                    var13 += 15;
                                    Players.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var42 = Runtime.getRuntime();
                                    var20 = ((int) ((var42.totalMemory() - var42.freeMemory()) / 1024L));
                                    var21 = 16776960;
                                    if ((var20 > 327680) && (!Client.isLowDetail)) {
                                        var21 = 16711680;
                                    }
                                    Players.fontPlain12.drawRightAligned(("Mem:" + var20) + "k", var12 + var10.width, var13, var21, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.contentType == 1337) {
                                Client.viewportX = var12;
                                Client.viewportY = var13;
                                class282.drawEntities(var12, var13, var10.width, var10.height);
                                Client.field713[var10.rootIndex] = true;
                                Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                continue;
                            }
                            if (var10.contentType == 1338) {
                                ReflectionCheck.drawMinimap(var10, var12, var13, var11);
                                Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                continue;
                            }
                            if (var10.contentType == 1339) {
                                NPCComposition.drawCompass(var10, var12, var13, var11);
                                Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                continue;
                            }
                            if (var10.contentType == 1400) {
                                Huffman.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                            }
                            if (var10.contentType == 1401) {
                                Huffman.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                            }
                            if (var10.contentType == 1402) {
                                Login.loginScreenRunesAnimation.draw(var12, Client.cycle);
                            }
                        }
                        if (var10.type == 0) {
                            if (((!var10.isIf3) && class260.isComponentHidden(var10)) && (var10 != class242.mousedOverWidgetIf1)) {
                                continue;
                            }
                            if (!var10.isIf3) {
                                if (var10.scrollY > (var10.scrollHeight - var10.height)) {
                                    var10.scrollY = var10.scrollHeight - var10.height;
                                }
                                if (var10.scrollY < 0) {
                                    var10.scrollY = 0;
                                }
                            }
                            drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                            if (var10.children != null) {
                                drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                            }
                            InterfaceParent var30 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var10.id)))));
                            if (var30 != null) {
                                UserComparator5.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
                            }
                            Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                            Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                        }
                        if ((Client.isResizable || Client.field715[var11]) || (Client.gameDrawingMode > 1)) {
                            if (((var10.type == 0) && (!var10.isIf3)) && (var10.scrollHeight > var10.height)) {
                                Interpreter.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
                            }
                            if (var10.type != 1) {
                                int var23;
                                int var24;
                                int var25;
                                int var26;
                                if (var10.type == 2) {
                                    var19 = 0;
                                    for (var20 = 0; var20 < var10.rawHeight; ++var20) {
                                        for (var21 = 0; var21 < var10.rawWidth; ++var21) {
                                            var22 = var12 + (var21 * (var10.paddingX + 32));
                                            var23 = var13 + (var20 * (var10.paddingY + 32));
                                            if (var19 < 20) {
                                                var22 += var10.inventoryXOffsets[var19];
                                                var23 += var10.inventoryYOffsets[var19];
                                            }
                                            if (var10.itemIds[var19] <= 0) {
                                                if ((var10.inventorySprites != null) && (var19 < 20)) {
                                                    SpritePixels var46 = var10.getInventorySprite(var19);
                                                    if (var46 != null) {
                                                        var46.drawTransBgAt(var22, var23);
                                                    } else if (Widget.field3262) {
                                                        class112.invalidateWidget(var10);
                                                    }
                                                }
                                            } else {
                                                boolean var37 = false;
                                                boolean var38 = false;
                                                var26 = var10.itemIds[var19] - 1;
                                                if ((((((var22 + 32) > var2) && (var22 < var4)) && ((var23 + 32) > var3)) && (var23 < var5)) || ((var10 == class20.dragInventoryWidget) && (var19 == Client.dragItemSlotSource))) {
                                                    SpritePixels var35;
                                                    if (((Client.isItemSelected == 1) && (var19 == WorldMapAreaData.selectedItemSlot)) && (var10.id == class133.selectedItemWidget)) {
                                                        var35 = class370.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
                                                    } else {
                                                        var35 = class370.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
                                                    }
                                                    if (var35 != null) {
                                                        if ((var10 == class20.dragInventoryWidget) && (var19 == Client.dragItemSlotSource)) {
                                                            var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
                                                            var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
                                                            if ((var24 < 5) && (var24 > (-5))) {
                                                                var24 = 0;
                                                            }
                                                            if ((var25 < 5) && (var25 > (-5))) {
                                                                var25 = 0;
                                                            }
                                                            if (Client.itemDragDuration < 5) {
                                                                var24 = 0;
                                                                var25 = 0;
                                                            }
                                                            var35.drawTransAt(var24 + var22, var23 + var25, 128);
                                                            if (var1 != (-1)) {
                                                                Widget var28 = var0[var1 & 65535];
                                                                int var29;
                                                                if (((var25 + var23) < Rasterizer2D.Rasterizer2D_yClipStart) && (var28.scrollY > 0)) {
                                                                    var29 = (((Rasterizer2D.Rasterizer2D_yClipStart - var23) - var25) * Client.field566) / 3;
                                                                    if (var29 > (Client.field566 * 10)) {
                                                                        var29 = Client.field566 * 10;
                                                                    }
                                                                    if (var29 > var28.scrollY) {
                                                                        var29 = var28.scrollY;
                                                                    }
                                                                    var28.scrollY -= var29;
                                                                    Client.draggedWidgetY += var29;
                                                                    class112.invalidateWidget(var28);
                                                                }
                                                                if ((((var23 + var25) + 32) > Rasterizer2D.Rasterizer2D_yClipEnd) && (var28.scrollY < (var28.scrollHeight - var28.height))) {
                                                                    var29 = ((((var25 + var23) + 32) - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field566) / 3;
                                                                    if (var29 > (Client.field566 * 10)) {
                                                                        var29 = Client.field566 * 10;
                                                                    }
                                                                    if (var29 > ((var28.scrollHeight - var28.height) - var28.scrollY)) {
                                                                        var29 = (var28.scrollHeight - var28.height) - var28.scrollY;
                                                                    }
                                                                    var28.scrollY += var29;
                                                                    Client.draggedWidgetY -= var29;
                                                                    class112.invalidateWidget(var28);
                                                                }
                                                            }
                                                        } else if ((var10 == WorldMapSectionType.field2720) && (var19 == Client.field611)) {
                                                            var35.drawTransAt(var22, var23, 128);
                                                        } else {
                                                            var35.drawTransBgAt(var22, var23);
                                                        }
                                                    } else {
                                                        class112.invalidateWidget(var10);
                                                    }
                                                }
                                            }
                                            ++var19;
                                        }
                                    }
                                } else if (var10.type == 3) {
                                    if (SceneTilePaint.runCs1(var10)) {
                                        var19 = var10.color2;
                                        if ((var10 == class242.mousedOverWidgetIf1) && (var10.mouseOverColor2 != 0)) {
                                            var19 = var10.mouseOverColor2;
                                        }
                                    } else {
                                        var19 = var10.color;
                                        if ((var10 == class242.mousedOverWidgetIf1) && (var10.mouseOverColor != 0)) {
                                            var19 = var10.mouseOverColor;
                                        }
                                    }
                                    if (var10.fill) {
                                        switch (var10.fillMode.field4590) {
                                            case 1 :
                                                Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
                                                break;
                                            case 2 :
                                                Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
                                                break;
                                            default :
                                                if (var14 == 0) {
                                                    Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
                                                } else {
                                                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
                                    } else {
                                        Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                    }
                                } else {
                                    Font var39;
                                    if (var10.type == 4) {
                                        var39 = var10.getFont();
                                        if (var39 == null) {
                                            if (Widget.field3262) {
                                                class112.invalidateWidget(var10);
                                            }
                                        } else {
                                            String var44 = var10.text;
                                            if (SceneTilePaint.runCs1(var10)) {
                                                var20 = var10.color2;
                                                if ((var10 == class242.mousedOverWidgetIf1) && (var10.mouseOverColor2 != 0)) {
                                                    var20 = var10.mouseOverColor2;
                                                }
                                                if (var10.text2.length() > 0) {
                                                    var44 = var10.text2;
                                                }
                                            } else {
                                                var20 = var10.color;
                                                if ((var10 == class242.mousedOverWidgetIf1) && (var10.mouseOverColor != 0)) {
                                                    var20 = var10.mouseOverColor;
                                                }
                                            }
                                            if (var10.isIf3 && (var10.itemId != (-1))) {
                                                ItemComposition var45 = Client.ItemDefinition_get(var10.itemId);
                                                var44 = var45.name;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }
                                                if (((var45.isStackable == 1) || (var10.itemQuantity != 1)) && (var10.itemQuantity != (-1))) {
                                                    var44 = ((((LoginScreenAnimation.colorStartTag(16748608) + var44) + "</col>") + " ") + 'x') + Widget.formatItemStacks(var10.itemQuantity);
                                                }
                                            }
                                            if (var10 == Client.meslayerContinueWidget) {
                                                var44 = "Please wait...";
                                                var20 = var10.color;
                                            }
                                            if (!var10.isIf3) {
                                                var44 = class124.method2725(var44, var10);
                                            }
                                            var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                                        }
                                    } else if (var10.type == 5) {
                                        SpritePixels var40;
                                        if (!var10.isIf3) {
                                            var40 = var10.getSprite(SceneTilePaint.runCs1(var10));
                                            if (var40 != null) {
                                                var40.drawTransBgAt(var12, var13);
                                            } else if (Widget.field3262) {
                                                class112.invalidateWidget(var10);
                                            }
                                        } else {
                                            if (var10.itemId != (-1)) {
                                                var40 = class370.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                            } else {
                                                var40 = var10.getSprite(false);
                                            }
                                            if (var40 == null) {
                                                if (Widget.field3262) {
                                                    class112.invalidateWidget(var10);
                                                }
                                            } else {
                                                var20 = var40.width;
                                                var21 = var40.height;
                                                if (!var10.spriteTiling) {
                                                    var22 = (var10.width * 4096) / var20;
                                                    if (var10.spriteAngle != 0) {
                                                        var40.method7802((var10.width / 2) + var12, (var10.height / 2) + var13, var10.spriteAngle, var22);
                                                    } else if (var14 != 0) {
                                                        var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                                    } else if ((var20 == var10.width) && (var21 == var10.height)) {
                                                        var40.drawTransBgAt(var12, var13);
                                                    } else {
                                                        var40.drawScaledAt(var12, var13, var10.width, var10.height);
                                                    }
                                                } else {
                                                    Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
                                                    var22 = ((var20 - 1) + var10.width) / var20;
                                                    var23 = ((var21 - 1) + var10.height) / var21;
                                                    for (var24 = 0; var24 < var22; ++var24) {
                                                        for (var25 = 0; var25 < var23; ++var25) {
                                                            if (var10.spriteAngle != 0) {
                                                                var40.method7802(((var20 / 2) + var12) + (var24 * var20), ((var21 / 2) + var13) + (var21 * var25), var10.spriteAngle, 4096);
                                                            } else if (var14 != 0) {
                                                                var40.drawTransAt(var12 + (var24 * var20), var13 + (var25 * var21), 256 - (var14 & 255));
                                                            } else {
                                                                var40.drawTransBgAt(var12 + (var20 * var24), var13 + (var21 * var25));
                                                            }
                                                        }
                                                    }
                                                    Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                                }
                                            }
                                        }
                                    } else {
                                        ItemComposition var33;
                                        if (var10.type == 6) {
                                            boolean var36 = SceneTilePaint.runCs1(var10);
                                            if (var36) {
                                                var20 = var10.sequenceId2;
                                            } else {
                                                var20 = var10.sequenceId;
                                            }
                                            Model var41 = null;
                                            var22 = 0;
                                            if (var10.itemId != (-1)) {
                                                var33 = Client.ItemDefinition_get(var10.itemId);
                                                if (var33 != null) {
                                                    var33 = var33.getCountObj(var10.itemQuantity);
                                                    var41 = var33.getModel(1);
                                                    if (var41 != null) {
                                                        var41.calculateBoundsCylinder();
                                                        var22 = var41.height / 2;
                                                    } else {
                                                        class112.invalidateWidget(var10);
                                                    }
                                                }
                                            } else if (var10.modelType == 5) {
                                                if (var10.modelId == 0) {
                                                    var41 = Client.playerAppearance.getModel(((SequenceDefinition) (null)), -1, ((SequenceDefinition) (null)), -1);
                                                } else {
                                                    var41 = WorldMapSprite.localPlayer.getModel();
                                                }
                                            } else if (var20 == (-1)) {
                                                var41 = var10.getModel(((SequenceDefinition) (null)), -1, var36, WorldMapSprite.localPlayer.appearance);
                                                if ((var41 == null) && Widget.field3262) {
                                                    class112.invalidateWidget(var10);
                                                }
                                            } else {
                                                SequenceDefinition var47 = class78.SequenceDefinition_get(var20);
                                                var41 = var10.getModel(var47, var10.modelFrame, var36, WorldMapSprite.localPlayer.appearance);
                                                if ((var41 == null) && Widget.field3262) {
                                                    class112.invalidateWidget(var10);
                                                }
                                            }
                                            Rasterizer3D.method3787((var10.width / 2) + var12, (var10.height / 2) + var13);
                                            var23 = (Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom) >> 16;
                                            var24 = (Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom) >> 16;
                                            if (var41 != null) {
                                                if (!var10.isIf3) {
                                                    var41.method4215(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                                } else {
                                                    var41.calculateBoundsCylinder();
                                                    if (var10.modelOrthog) {
                                                        var41.method4154(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, (var22 + var23) + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                                    } else {
                                                        var41.method4215(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, (var22 + var23) + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                                    }
                                                }
                                            }
                                            Rasterizer3D.Rasterizer3D_method3();
                                        } else {
                                            if (var10.type == 7) {
                                                var39 = var10.getFont();
                                                if (var39 == null) {
                                                    if (Widget.field3262) {
                                                        class112.invalidateWidget(var10);
                                                    }
                                                    continue;
                                                }
                                                var20 = 0;
                                                for (var21 = 0; var21 < var10.rawHeight; ++var21) {
                                                    for (var22 = 0; var22 < var10.rawWidth; ++var22) {
                                                        if (var10.itemIds[var20] > 0) {
                                                            var33 = Client.ItemDefinition_get(var10.itemIds[var20] - 1);
                                                            String var34;
                                                            if ((var33.isStackable != 1) && (var10.itemQuantities[var20] == 1)) {
                                                                var34 = (LoginScreenAnimation.colorStartTag(16748608) + var33.name) + "</col>";
                                                            } else {
                                                                var34 = ((((LoginScreenAnimation.colorStartTag(16748608) + var33.name) + "</col>") + " ") + 'x') + Widget.formatItemStacks(var10.itemQuantities[var20]);
                                                            }
                                                            var25 = var12 + (var22 * (var10.paddingX + 115));
                                                            var26 = var13 + ((var10.paddingY + 12) * var21);
                                                            if (var10.textXAlignment == 0) {
                                                                var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                                            } else if (var10.textXAlignment == 1) {
                                                                var39.drawCentered(var34, (var10.width / 2) + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
                                                            } else {
                                                                var39.drawRightAligned(var34, (var25 + var10.width) - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
                                                            }
                                                        }
                                                        ++var20;
                                                    }
                                                }
                                            }
                                            if (((var10.type == 8) && (var10 == class126.field1516)) && (Client.field734 == Client.field506)) {
                                                var19 = 0;
                                                var20 = 0;
                                                Font var31 = Players.fontPlain12;
                                                String var32 = var10.text;
                                                String var43;
                                                for (var32 = class124.method2725(var32, var10); var32.length() > 0; var20 = (var20 + var31.ascent) + 1) {
                                                    var24 = var32.indexOf("<br>");
                                                    if (var24 != (-1)) {
                                                        var43 = var32.substring(0, var24);
                                                        var32 = var32.substring(var24 + 4);
                                                    } else {
                                                        var43 = var32;
                                                        var32 = "";
                                                    }
                                                    var25 = var31.stringWidth(var43);
                                                    if (var25 > var19) {
                                                        var19 = var25;
                                                    }
                                                }
                                                var19 += 6;
                                                var20 += 7;
                                                var24 = ((var12 + var10.width) - 5) - var19;
                                                var25 = (var13 + var10.height) + 5;
                                                if (var24 < (var12 + 5)) {
                                                    var24 = var12 + 5;
                                                }
                                                if ((var19 + var24) > var4) {
                                                    var24 = var4 - var19;
                                                }
                                                if ((var20 + var25) > var5) {
                                                    var25 = var5 - var20;
                                                }
                                                Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
                                                Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
                                                var32 = var10.text;
                                                var26 = (var25 + var31.ascent) + 2;
                                                for (var32 = class124.method2725(var32, var10); var32.length() > 0; var26 = (var26 + var31.ascent) + 1) {
                                                    int var27 = var32.indexOf("<br>");
                                                    if (var27 != (-1)) {
                                                        var43 = var32.substring(0, var27);
                                                        var32 = var32.substring(var27 + 4);
                                                    } else {
                                                        var43 = var32;
                                                        var32 = "";
                                                    }
                                                    var31.draw(var43, var24 + 3, var26, 0, -1);
                                                }
                                            }
                                            if (var10.type == 9) {
                                                if (var10.field3298) {
                                                    var19 = var12;
                                                    var20 = var13 + var10.height;
                                                    var21 = var12 + var10.width;
                                                    var22 = var13;
                                                } else {
                                                    var19 = var12;
                                                    var20 = var13;
                                                    var21 = var12 + var10.width;
                                                    var22 = var13 + var10.height;
                                                }
                                                if (var10.lineWid == 1) {
                                                    Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
                                                } else {
                                                    WorldMapLabel.method4763(var19, var20, var21, var22, var10.color, var10.lineWid);
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
        }
    }
}