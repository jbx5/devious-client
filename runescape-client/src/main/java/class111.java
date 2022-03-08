import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dz")
public class class111 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 201695505)
    int field1377;

    @ObfuscatedName("l")
    float field1384;

    @ObfuscatedName("s")
    float field1379;

    @ObfuscatedName("e")
    float field1380;

    @ObfuscatedName("r")
    float field1381;

    @ObfuscatedName("o")
    float field1378;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Ldz;")
    class111 field1383;

    class111() {
        this.field1379 = Float.MAX_VALUE;
        this.field1380 = Float.MAX_VALUE;
        this.field1381 = Float.MAX_VALUE;
        this.field1378 = Float.MAX_VALUE;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-2016120567")
    void method2526(Buffer var1, int var2) {
        this.field1377 = var1.readShort();
        this.field1384 = var1.method7374();
        this.field1379 = var1.method7374();
        this.field1380 = var1.method7374();
        this.field1381 = var1.method7374();
        this.field1378 = var1.method7374();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1284094423")
    static void method2525() {
        Tiles.Tiles_underlays = null;
        Tiles.Tiles_overlays = null;
        Tiles.Tiles_shapes = null;
        Tiles.field998 = null;
        class78.field1033 = null;
        class260.field3078 = null;
        class19.field106 = null;
        class7.Tiles_hue = null;
        RouteStrategy.Tiles_saturation = null;
        AbstractByteArrayCopier.Tiles_lightness = null;
        class1.Tiles_hueMultiplier = null;
        VarcInt.field1789 = null;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1072080196")
    public static void method2528(int var0) {
        if (class265.musicPlayerStatus != 0) {
            class167.musicTrackVolume = var0;
        } else {
            class265.midiPcmStream.setPcmStreamVolume(var0);
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1649782483")
    @Export("iLog")
    public static int iLog(int var0) {
        int var1 = 0;
        if ((var0 < 0) || (var0 >= 65536)) {
            var0 >>>= 16;
            var1 += 16;
        }
        if (var0 >= 256) {
            var0 >>>= 8;
            var1 += 8;
        }
        if (var0 >= 16) {
            var0 >>>= 4;
            var1 += 4;
        }
        if (var0 >= 4) {
            var0 >>>= 2;
            var1 += 2;
        }
        if (var0 >= 1) {
            var0 >>>= 1;
            ++var1;
        }
        return var0 + var1;
    }

    @ObfuscatedName("ex")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "223640438")
    @Export("updateGameState")
    static void updateGameState(int var0) {
        if (var0 != Client.gameState) {
            if (Client.gameState == 0) {
                class414.client.method449();
            }
            if ((((var0 == 20) || (var0 == 40)) || (var0 == 45)) || (var0 == 50)) {
                WorldMapLabelSize.method4321(0);
                Client.field530 = 0;
                Client.field531 = 0;
                Client.timer.method6232(var0);
                if (var0 != 20) {
                    Friend.method6297(false);
                }
            }
            if (((var0 != 20) && (var0 != 40)) && (JagexCache.field1699 != null)) {
                JagexCache.field1699.close();
                JagexCache.field1699 = null;
            }
            if (Client.gameState == 25) {
                Client.field621 = 0;
                Client.field498 = 0;
                Client.field558 = 1;
                Client.field559 = 0;
                Client.field560 = 1;
            }
            int var1;
            if ((var0 != 5) && (var0 != 10)) {
                if (var0 == 20) {
                    var1 = (Client.gameState == 11) ? 4 : 0;
                    HealthBarUpdate.method2182(Tile.archive10, Message.archive8, false, var1);
                } else if (var0 == 11) {
                    HealthBarUpdate.method2182(Tile.archive10, Message.archive8, false, 4);
                } else if (var0 == 50) {
                    UserComparator7.setLoginResponseString("", "Updating date of birth...", "");
                    HealthBarUpdate.method2182(Tile.archive10, Message.archive8, false, 7);
                } else {
                    ModeWhere.method5819();
                }
            } else {
                var1 = (Skeleton.method3892()) ? 0 : 12;
                HealthBarUpdate.method2182(Tile.archive10, Message.archive8, true, var1);
            }
            Client.gameState = var0;
        }
    }

    @ObfuscatedName("ja")
    @ObfuscatedSignature(descriptor = "([Ljz;IIIIIIIB)V", garbageValue = "66")
    @Export("updateInterface")
    static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        for (int var8 = 0; var8 < var0.length; ++var8) {
            Widget var9 = var0[var8];
            if (((var9 != null) && (var9.parentId == var1)) && ((((((!var9.isIf3) || (var9.type == 0)) || var9.hasListener) || (Language.getWidgetFlags(var9) != 0)) || (var9 == Client.clickedWidgetParent)) || (var9.contentType == 1338))) {
                if (var9.isIf3) {
                    if (class260.isComponentHidden(var9)) {
                        continue;
                    }
                } else if (((var9.type == 0) && (var9 != class242.mousedOverWidgetIf1)) && class260.isComponentHidden(var9)) {
                    continue;
                }
                int var10 = var9.x + var6;
                int var11 = var7 + var9.y;
                int var12;
                int var13;
                int var14;
                int var15;
                int var17;
                int var18;
                if (var9.type == 2) {
                    var12 = var2;
                    var13 = var3;
                    var14 = var4;
                    var15 = var5;
                } else {
                    int var16;
                    if (var9.type == 9) {
                        var16 = var10;
                        var17 = var11;
                        var18 = var10 + var9.width;
                        int var19 = var11 + var9.height;
                        if (var18 < var10) {
                            var16 = var18;
                            var18 = var10;
                        }
                        if (var19 < var11) {
                            var17 = var19;
                            var19 = var11;
                        }
                        ++var18;
                        ++var19;
                        var12 = (var16 > var2) ? var16 : var2;
                        var13 = (var17 > var3) ? var17 : var3;
                        var14 = (var18 < var4) ? var18 : var4;
                        var15 = (var19 < var5) ? var19 : var5;
                    } else {
                        var16 = var10 + var9.width;
                        var17 = var11 + var9.height;
                        var12 = (var10 > var2) ? var10 : var2;
                        var13 = (var11 > var3) ? var11 : var3;
                        var14 = (var16 < var4) ? var16 : var4;
                        var15 = (var17 < var5) ? var17 : var5;
                    }
                }
                if (var9 == Client.clickedWidget) {
                    Client.field648 = true;
                    Client.field686 = var10;
                    Client.field687 = var11;
                }
                boolean var33 = false;
                if (var9.field3338) {
                    switch (Client.field666) {
                        case 0 :
                            var33 = true;
                        case 1 :
                        default :
                            break;
                        case 2 :
                            if (Client.field667 == (var9.id >>> 16)) {
                                var33 = true;
                            }
                            break;
                        case 3 :
                            if (var9.id == Client.field667) {
                                var33 = true;
                            }
                    }
                }
                if ((var33 || (!var9.isIf3)) || ((var12 < var14) && (var13 < var15))) {
                    if (var9.isIf3) {
                        ScriptEvent var26;
                        if (var9.noClickThrough) {
                            if ((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
                                for (var26 = ((ScriptEvent) (Client.scriptEvents.last())); var26 != null; var26 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
                                    if (var26.isMouseInputEvent) {
                                        var26.remove();
                                        var26.widget.containsMouse = false;
                                    }
                                }
                                if (ByteArrayPool.widgetDragDuration == 0) {
                                    Client.clickedWidget = null;
                                    Client.clickedWidgetParent = null;
                                }
                                if (!Client.isMenuOpen) {
                                    class87.addCancelMenuEntry();
                                }
                            }
                        } else if ((((var9.noScrollThrough && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
                            for (var26 = ((ScriptEvent) (Client.scriptEvents.last())); var26 != null; var26 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
                                if (var26.isMouseInputEvent && (var26.widget.onScroll == var26.args)) {
                                    var26.remove();
                                }
                            }
                        }
                    }
                    var17 = MouseHandler.MouseHandler_x;
                    var18 = MouseHandler.MouseHandler_y;
                    if (MouseHandler.MouseHandler_lastButton != 0) {
                        var17 = MouseHandler.MouseHandler_lastPressedX;
                        var18 = MouseHandler.MouseHandler_lastPressedY;
                    }
                    boolean var34 = (((var17 >= var12) && (var18 >= var13)) && (var17 < var14)) && (var18 < var15);
                    if (var9.contentType == 1337) {
                        if (((!Client.isLoading) && (!Client.isMenuOpen)) && var34) {
                            NPC.addSceneMenuOptions(var17, var18, var12, var13);
                        }
                    } else if (var9.contentType == 1338) {
                        class91.checkIfMinimapClicked(var9, var10, var11);
                    } else {
                        if (var9.contentType == 1400) {
                            Huffman.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height);
                        }
                        if ((!Client.isMenuOpen) && var34) {
                            if (var9.contentType == 1400) {
                                Huffman.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
                            } else {
                                GrandExchangeEvents.Widget_addToMenu(var9, var17 - var10, var18 - var11);
                            }
                        }
                        boolean var21;
                        int var23;
                        if (var33) {
                            for (int var20 = 0; var20 < var9.field3339.length; ++var20) {
                                var21 = false;
                                boolean var27 = false;
                                if ((!var21) && (var9.field3339[var20] != null)) {
                                    for (var23 = 0; var23 < var9.field3339[var20].length; ++var23) {
                                        boolean var24 = false;
                                        if (var9.field3254 != null) {
                                            var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3339[var20][var23]];
                                        }
                                        if (class274.method5296(var9.field3339[var20][var23]) || var24) {
                                            var21 = true;
                                            if ((var9.field3254 != null) && (var9.field3254[var20] > Client.cycle)) {
                                                break;
                                            }
                                            byte var32 = var9.field3397[var20][var23];
                                            if ((var32 == 0) || ((((((var32 & 8) == 0) || (((!KeyHandler.KeyHandler_pressedKeys[86]) && (!KeyHandler.KeyHandler_pressedKeys[82])) && (!KeyHandler.KeyHandler_pressedKeys[81]))) && (((var32 & 2) == 0) || KeyHandler.KeyHandler_pressedKeys[86])) && (((var32 & 1) == 0) || KeyHandler.KeyHandler_pressedKeys[82])) && (((var32 & 4) == 0) || KeyHandler.KeyHandler_pressedKeys[81]))) {
                                                var27 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var27) {
                                    if (var20 < 10) {
                                        GameEngine.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
                                    } else if (var20 == 10) {
                                        WorldMapRectangle.Widget_runOnTargetLeave();
                                        PendingSpawn.selectSpell(var9.id, var9.childIndex, class135.Widget_unpackTargetMask(Language.getWidgetFlags(var9)), var9.itemId);
                                        Client.selectedSpellActionName = WorldMapEvent.Widget_getSpellActionName(var9);
                                        if (Client.selectedSpellActionName == null) {
                                            Client.selectedSpellActionName = "null";
                                        }
                                        Client.selectedSpellName = var9.dataText + LoginScreenAnimation.colorStartTag(16777215);
                                    }
                                    var23 = var9.field3341[var20];
                                    if (var9.field3254 == null) {
                                        var9.field3254 = new int[var9.field3339.length];
                                    }
                                    if (var9.field3342 == null) {
                                        var9.field3342 = new int[var9.field3339.length];
                                    }
                                    if (var23 != 0) {
                                        if (var9.field3254[var20] == 0) {
                                            var9.field3254[var20] = (var23 + Client.cycle) + var9.field3342[var20];
                                        } else {
                                            var9.field3254[var20] = var23 + Client.cycle;
                                        }
                                    } else {
                                        var9.field3254[var20] = Integer.MAX_VALUE;
                                    }
                                }
                                if ((!var21) && (var9.field3254 != null)) {
                                    var9.field3254[var20] = 0;
                                }
                            }
                        }
                        if (var9.isIf3) {
                            if ((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
                                var34 = true;
                            } else {
                                var34 = false;
                            }
                            boolean var35 = false;
                            if (((MouseHandler.MouseHandler_currentButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_currentButton == 4))) && var34) {
                                var35 = true;
                            }
                            var21 = false;
                            if ((((((MouseHandler.MouseHandler_lastButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) && (MouseHandler.MouseHandler_lastPressedX >= var12)) && (MouseHandler.MouseHandler_lastPressedY >= var13)) && (MouseHandler.MouseHandler_lastPressedX < var14)) && (MouseHandler.MouseHandler_lastPressedY < var15)) {
                                var21 = true;
                            }
                            if (var21) {
                                class11.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
                            }
                            if (var9.contentType == 1400) {
                                Huffman.worldMap.method6886(var17, var18, var34 & var35, var34 & var21);
                            }
                            if ((((Client.clickedWidget != null) && (var9 != Client.clickedWidget)) && var34) && class10.method87(Language.getWidgetFlags(var9))) {
                                Client.draggedOnWidget = var9;
                            }
                            if (var9 == Client.clickedWidgetParent) {
                                Client.field682 = true;
                                Client.field606 = var10;
                                Client.field561 = var11;
                            }
                            if (var9.hasListener) {
                                ScriptEvent var22;
                                if ((var34 && (Client.mouseWheelRotation != 0)) && (var9.onScroll != null)) {
                                    var22 = new ScriptEvent();
                                    var22.isMouseInputEvent = true;
                                    var22.widget = var9;
                                    var22.mouseY = Client.mouseWheelRotation;
                                    var22.args = var9.onScroll;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if (((Client.clickedWidget != null) || (class20.dragInventoryWidget != null)) || Client.isMenuOpen) {
                                    var21 = false;
                                    var35 = false;
                                    var34 = false;
                                }
                                if ((!var9.isClicked) && var21) {
                                    var9.isClicked = true;
                                    if (var9.onClick != null) {
                                        var22 = new ScriptEvent();
                                        var22.isMouseInputEvent = true;
                                        var22.widget = var9;
                                        var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
                                        var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
                                        var22.args = var9.onClick;
                                        Client.scriptEvents.addFirst(var22);
                                    }
                                }
                                if ((var9.isClicked && var35) && (var9.onClickRepeat != null)) {
                                    var22 = new ScriptEvent();
                                    var22.isMouseInputEvent = true;
                                    var22.widget = var9;
                                    var22.mouseX = MouseHandler.MouseHandler_x - var10;
                                    var22.mouseY = MouseHandler.MouseHandler_y - var11;
                                    var22.args = var9.onClickRepeat;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if (var9.isClicked && (!var35)) {
                                    var9.isClicked = false;
                                    if (var9.onRelease != null) {
                                        var22 = new ScriptEvent();
                                        var22.isMouseInputEvent = true;
                                        var22.widget = var9;
                                        var22.mouseX = MouseHandler.MouseHandler_x - var10;
                                        var22.mouseY = MouseHandler.MouseHandler_y - var11;
                                        var22.args = var9.onRelease;
                                        Client.field709.addFirst(var22);
                                    }
                                }
                                if (var35 && (var9.onHold != null)) {
                                    var22 = new ScriptEvent();
                                    var22.isMouseInputEvent = true;
                                    var22.widget = var9;
                                    var22.mouseX = MouseHandler.MouseHandler_x - var10;
                                    var22.mouseY = MouseHandler.MouseHandler_y - var11;
                                    var22.args = var9.onHold;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((!var9.containsMouse) && var34) {
                                    var9.containsMouse = true;
                                    if (var9.onMouseOver != null) {
                                        var22 = new ScriptEvent();
                                        var22.isMouseInputEvent = true;
                                        var22.widget = var9;
                                        var22.mouseX = MouseHandler.MouseHandler_x - var10;
                                        var22.mouseY = MouseHandler.MouseHandler_y - var11;
                                        var22.args = var9.onMouseOver;
                                        Client.scriptEvents.addFirst(var22);
                                    }
                                }
                                if ((var9.containsMouse && var34) && (var9.onMouseRepeat != null)) {
                                    var22 = new ScriptEvent();
                                    var22.isMouseInputEvent = true;
                                    var22.widget = var9;
                                    var22.mouseX = MouseHandler.MouseHandler_x - var10;
                                    var22.mouseY = MouseHandler.MouseHandler_y - var11;
                                    var22.args = var9.onMouseRepeat;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if (var9.containsMouse && (!var34)) {
                                    var9.containsMouse = false;
                                    if (var9.onMouseLeave != null) {
                                        var22 = new ScriptEvent();
                                        var22.isMouseInputEvent = true;
                                        var22.widget = var9;
                                        var22.mouseX = MouseHandler.MouseHandler_x - var10;
                                        var22.mouseY = MouseHandler.MouseHandler_y - var11;
                                        var22.args = var9.onMouseLeave;
                                        Client.field709.addFirst(var22);
                                    }
                                }
                                if (var9.onTimer != null) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.onTimer;
                                    Client.field708.addFirst(var22);
                                }
                                ScriptEvent var25;
                                int var36;
                                int var37;
                                if ((var9.onVarTransmit != null) && (Client.changedVarpCount > var9.field3402)) {
                                    if ((var9.varTransmitTriggers != null) && ((Client.changedVarpCount - var9.field3402) <= 32)) {
                                        label817 : for (var37 = var9.field3402; var37 < Client.changedVarpCount; ++var37) {
                                            var23 = Client.changedVarps[var37 & 31];
                                            for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
                                                if (var23 == var9.varTransmitTriggers[var36]) {
                                                    var25 = new ScriptEvent();
                                                    var25.widget = var9;
                                                    var25.args = var9.onVarTransmit;
                                                    Client.scriptEvents.addFirst(var25);
                                                    break label817;
                                                }
                                            }
                                        }
                                    } else {
                                        var22 = new ScriptEvent();
                                        var22.widget = var9;
                                        var22.args = var9.onVarTransmit;
                                        Client.scriptEvents.addFirst(var22);
                                    }
                                    var9.field3402 = Client.changedVarpCount;
                                }
                                if ((var9.onInvTransmit != null) && (Client.field494 > var9.field3403)) {
                                    if ((var9.invTransmitTriggers != null) && ((Client.field494 - var9.field3403) <= 32)) {
                                        label793 : for (var37 = var9.field3403; var37 < Client.field494; ++var37) {
                                            var23 = Client.changedItemContainers[var37 & 31];
                                            for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
                                                if (var23 == var9.invTransmitTriggers[var36]) {
                                                    var25 = new ScriptEvent();
                                                    var25.widget = var9;
                                                    var25.args = var9.onInvTransmit;
                                                    Client.scriptEvents.addFirst(var25);
                                                    break label793;
                                                }
                                            }
                                        }
                                    } else {
                                        var22 = new ScriptEvent();
                                        var22.widget = var9;
                                        var22.args = var9.onInvTransmit;
                                        Client.scriptEvents.addFirst(var22);
                                    }
                                    var9.field3403 = Client.field494;
                                }
                                if ((var9.onStatTransmit != null) && (Client.changedSkillsCount > var9.field3370)) {
                                    if ((var9.statTransmitTriggers != null) && ((Client.changedSkillsCount - var9.field3370) <= 32)) {
                                        label769 : for (var37 = var9.field3370; var37 < Client.changedSkillsCount; ++var37) {
                                            var23 = Client.changedSkills[var37 & 31];
                                            for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
                                                if (var23 == var9.statTransmitTriggers[var36]) {
                                                    var25 = new ScriptEvent();
                                                    var25.widget = var9;
                                                    var25.args = var9.onStatTransmit;
                                                    Client.scriptEvents.addFirst(var25);
                                                    break label769;
                                                }
                                            }
                                        }
                                    } else {
                                        var22 = new ScriptEvent();
                                        var22.widget = var9;
                                        var22.args = var9.onStatTransmit;
                                        Client.scriptEvents.addFirst(var22);
                                    }
                                    var9.field3370 = Client.changedSkillsCount;
                                }
                                if ((Client.chatCycle > var9.field3401) && (var9.onChatTransmit != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.onChatTransmit;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field600 > var9.field3401) && (var9.onFriendTransmit != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.onFriendTransmit;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field664 > var9.field3401) && (var9.onClanTransmit != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.onClanTransmit;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field701 > var9.field3401) && (var9.field3328 != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.field3328;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field503 > var9.field3401) && (var9.field3271 != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.field3271;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field703 > var9.field3401) && (var9.onStockTransmit != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.onStockTransmit;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field652 > var9.field3401) && (var9.field3385 != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.field3385;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                if ((Client.field705 > var9.field3401) && (var9.onMiscTransmit != null)) {
                                    var22 = new ScriptEvent();
                                    var22.widget = var9;
                                    var22.args = var9.onMiscTransmit;
                                    Client.scriptEvents.addFirst(var22);
                                }
                                var9.field3401 = Client.cycleCntr;
                                if (var9.onKey != null) {
                                    for (var37 = 0; var37 < Client.field729; ++var37) {
                                        ScriptEvent var31 = new ScriptEvent();
                                        var31.widget = var9;
                                        var31.keyTyped = Client.field731[var37];
                                        var31.keyPressed = Client.field684[var37];
                                        var31.args = var9.onKey;
                                        Client.scriptEvents.addFirst(var31);
                                    }
                                }
                                ScriptEvent var30;
                                int[] var38;
                                if (var9.field3374 != null) {
                                    var38 = class123.method2720();
                                    for (var23 = 0; var23 < var38.length; ++var23) {
                                        var30 = new ScriptEvent();
                                        var30.widget = var9;
                                        var30.keyTyped = var38[var23];
                                        var30.args = var9.field3374;
                                        Client.scriptEvents.addFirst(var30);
                                    }
                                }
                                if (var9.field3321 != null) {
                                    var38 = GameObject.method4297();
                                    for (var23 = 0; var23 < var38.length; ++var23) {
                                        var30 = new ScriptEvent();
                                        var30.widget = var9;
                                        var30.keyTyped = var38[var23];
                                        var30.args = var9.field3321;
                                        Client.scriptEvents.addFirst(var30);
                                    }
                                }
                            }
                        }
                        if (!var9.isIf3) {
                            if (((Client.clickedWidget != null) || (class20.dragInventoryWidget != null)) || Client.isMenuOpen) {
                                continue;
                            }
                            if ((((((var9.mouseOverRedirect >= 0) || (var9.mouseOverColor != 0)) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
                                if (var9.mouseOverRedirect >= 0) {
                                    class242.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
                                } else {
                                    class242.mousedOverWidgetIf1 = var9;
                                }
                            }
                            if (((((var9.type == 8) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
                                class126.field1516 = var9;
                            }
                            if (var9.scrollHeight > var9.height) {
                                PlatformInfo.method6860(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
                            }
                        }
                        if (var9.type == 0) {
                            updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                            if (var9.children != null) {
                                updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                            }
                            InterfaceParent var28 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var9.id)))));
                            if (var28 != null) {
                                if ((((((var28.type == 0) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) && (!Client.isMenuOpen)) {
                                    for (ScriptEvent var29 = ((ScriptEvent) (Client.scriptEvents.last())); var29 != null; var29 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
                                        if (var29.isMouseInputEvent) {
                                            var29.remove();
                                            var29.widget.containsMouse = false;
                                        }
                                    }
                                    if (ByteArrayPool.widgetDragDuration == 0) {
                                        Client.clickedWidget = null;
                                        Client.clickedWidgetParent = null;
                                    }
                                    if (!Client.isMenuOpen) {
                                        class87.addCancelMenuEntry();
                                    }
                                }
                                class123.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }
}