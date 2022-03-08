import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jt")
public class class282 {
    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "884747568")
    static int method5358(int var0, Script var1, boolean var2) {
        Widget var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.itemId;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
            if (var3.itemId != (-1)) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.itemQuantity;
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETID) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.childIndex;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-602520262")
    @Export("forceDisconnect")
    static final void forceDisconnect(int var0) {
        class133.logOut();
        switch (var0) {
            case 1 :
                class374.method6776();
                break;
            case 2 :
                Player.method2159(24);
                UserComparator7.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
        }
    }

    @ObfuscatedName("gn")
    @ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-983073929")
    @Export("drawEntities")
    static final void drawEntities(int var0, int var1, int var2, int var3) {
        ++Client.viewportDrawCount;
        if (((WorldMapSprite.localPlayer.x >> 7) == Client.destinationX) && ((WorldMapSprite.localPlayer.y >> 7) == Client.destinationY)) {
            Client.destinationX = 0;
        }
        if (Client.renderSelf) {
            AbstractWorldMapData.addPlayerToScene(WorldMapSprite.localPlayer, false);
        }
        NetFileRequest.method5572();
        PacketBufferNode.addNpcsToScene(true);
        int var4 = Players.Players_count;
        int[] var5 = Players.Players_indices;
        int var6;
        for (var6 = 0; var6 < var4; ++var6) {
            if ((var5[var6] != Client.combatTargetPlayerIndex) && (var5[var6] != Client.localPlayerIndex)) {
                AbstractWorldMapData.addPlayerToScene(Client.players[var5[var6]], true);
            }
        }
        PacketBufferNode.addNpcsToScene(false);
        for (Projectile var36 = ((Projectile) (Client.projectiles.last())); var36 != null; var36 = ((Projectile) (Client.projectiles.previous()))) {
            if ((var36.plane == SoundSystem.Client_plane) && (Client.cycle <= var36.cycleEnd)) {
                if (Client.cycle >= var36.cycleStart) {
                    if (var36.targetIndex > 0) {
                        NPC var40 = Client.npcs[var36.targetIndex - 1];
                        if (((((var40 != null) && (var40.x >= 0)) && (var40.x < 13312)) && (var40.y >= 0)) && (var40.y < 13312)) {
                            var36.setDestination(var40.x, var40.y, class92.getTileHeight(var40.x, var40.y, var36.plane) - var36.endHeight, Client.cycle);
                        }
                    }
                    if (var36.targetIndex < 0) {
                        var6 = (-var36.targetIndex) - 1;
                        Player var41;
                        if (var6 == Client.localPlayerIndex) {
                            var41 = WorldMapSprite.localPlayer;
                        } else {
                            var41 = Client.players[var6];
                        }
                        if (((((var41 != null) && (var41.x >= 0)) && (var41.x < 13312)) && (var41.y >= 0)) && (var41.y < 13312)) {
                            var36.setDestination(var41.x, var41.y, class92.getTileHeight(var41.x, var41.y, var36.plane) - var36.endHeight, Client.cycle);
                        }
                    }
                    var36.advance(Client.field566);
                    Decimator.scene.drawEntity(SoundSystem.Client_plane, ((int) (var36.x)), ((int) (var36.y)), ((int) (var36.z)), 60, var36, var36.yaw, -1L, false);
                }
            } else {
                var36.remove();
            }
        }
        ClientPacket.method4978();
        class124.setViewportShape(var0, var1, var2, var3, true);
        var0 = Client.viewportOffsetX;
        var1 = Client.viewportOffsetY;
        var2 = Client.viewportWidth;
        var3 = Client.viewportHeight;
        Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
        Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
        var4 = Client.camAngleX;
        if ((Client.field590 / 256) > var4) {
            var4 = Client.field590 / 256;
        }
        if (Client.field753[4] && ((Client.field733[4] + 128) > var4)) {
            var4 = Client.field733[4] + 128;
        }
        int var37 = Client.camAngleY & 2047;
        var6 = class29.oculusOrbFocalPointX;
        int var7 = SpriteMask.field3218;
        int var8 = class121.oculusOrbFocalPointY;
        int var11 = (var4 * 3) + 600;
        InterfaceParent.method2084(var6, var7, var8, var4, var37, var11, var3);
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        if (!Client.isCameraLocked) {
            if (class424.clientPreferences.roofsHidden) {
                var13 = SoundSystem.Client_plane;
            } else {
                label630 : {
                    var14 = 3;
                    if (class7.cameraPitch < 310) {
                        if (Client.oculusOrbState == 1) {
                            var15 = class29.oculusOrbFocalPointX >> 7;
                            var16 = class121.oculusOrbFocalPointY >> 7;
                        } else {
                            var15 = WorldMapSprite.localPlayer.x >> 7;
                            var16 = WorldMapSprite.localPlayer.y >> 7;
                        }
                        var17 = class414.cameraX >> 7;
                        var18 = GrandExchangeOfferOwnWorldComparator.cameraZ >> 7;
                        if ((((var17 < 0) || (var18 < 0)) || (var17 >= 104)) || (var18 >= 104)) {
                            var13 = SoundSystem.Client_plane;
                            break label630;
                        }
                        if ((((var15 < 0) || (var16 < 0)) || (var15 >= 104)) || (var16 >= 104)) {
                            var13 = SoundSystem.Client_plane;
                            break label630;
                        }
                        if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) {
                            var14 = SoundSystem.Client_plane;
                        }
                        if (var15 > var17) {
                            var19 = var15 - var17;
                        } else {
                            var19 = var17 - var15;
                        }
                        if (var16 > var18) {
                            var20 = var16 - var18;
                        } else {
                            var20 = var18 - var16;
                        }
                        if (var19 > var20) {
                            var21 = (var20 * 65536) / var19;
                            var22 = 32768;
                            while (var17 != var15) {
                                if (var17 < var15) {
                                    ++var17;
                                } else if (var17 > var15) {
                                    --var17;
                                }
                                if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) {
                                    var14 = SoundSystem.Client_plane;
                                }
                                var22 += var21;
                                if (var22 >= 65536) {
                                    var22 -= 65536;
                                    if (var18 < var16) {
                                        ++var18;
                                    } else if (var18 > var16) {
                                        --var18;
                                    }
                                    if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) {
                                        var14 = SoundSystem.Client_plane;
                                    }
                                }
                            } 
                        } else if (var20 > 0) {
                            var21 = (var19 * 65536) / var20;
                            var22 = 32768;
                            while (var18 != var16) {
                                if (var18 < var16) {
                                    ++var18;
                                } else if (var18 > var16) {
                                    --var18;
                                }
                                if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) {
                                    var14 = SoundSystem.Client_plane;
                                }
                                var22 += var21;
                                if (var22 >= 65536) {
                                    var22 -= 65536;
                                    if (var17 < var15) {
                                        ++var17;
                                    } else if (var17 > var15) {
                                        --var17;
                                    }
                                    if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) {
                                        var14 = SoundSystem.Client_plane;
                                    }
                                }
                            } 
                        }
                    }
                    if ((((WorldMapSprite.localPlayer.x >= 0) && (WorldMapSprite.localPlayer.y >= 0)) && (WorldMapSprite.localPlayer.x < 13312)) && (WorldMapSprite.localPlayer.y < 13312)) {
                        if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][WorldMapSprite.localPlayer.x >> 7][WorldMapSprite.localPlayer.y >> 7] & 4) != 0) {
                            var14 = SoundSystem.Client_plane;
                        }
                        var13 = var14;
                    } else {
                        var13 = SoundSystem.Client_plane;
                    }
                }
            }
            var12 = var13;
        } else {
            if (class424.clientPreferences.roofsHidden) {
                var13 = SoundSystem.Client_plane;
            } else {
                var14 = class92.getTileHeight(class414.cameraX, GrandExchangeOfferOwnWorldComparator.cameraZ, SoundSystem.Client_plane);
                if (((var14 - WorldMapDecoration.cameraY) < 800) && ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][class414.cameraX >> 7][GrandExchangeOfferOwnWorldComparator.cameraZ >> 7] & 4) != 0)) {
                    var13 = SoundSystem.Client_plane;
                } else {
                    var13 = 3;
                }
            }
            var12 = var13;
        }
        var13 = class414.cameraX;
        var14 = WorldMapDecoration.cameraY;
        var15 = GrandExchangeOfferOwnWorldComparator.cameraZ;
        var16 = class7.cameraPitch;
        var17 = class7.cameraYaw;
        for (var18 = 0; var18 < 5; ++var18) {
            if (Client.field753[var18]) {
                var19 = ((int) (((Math.random() * ((double) ((Client.field754[var18] * 2) + 1))) - ((double) (Client.field754[var18]))) + (Math.sin(((double) (Client.field757[var18])) * (((double) (Client.field500[var18])) / 100.0)) * ((double) (Client.field733[var18])))));
                if (var18 == 0) {
                    class414.cameraX += var19;
                }
                if (var18 == 1) {
                    WorldMapDecoration.cameraY += var19;
                }
                if (var18 == 2) {
                    GrandExchangeOfferOwnWorldComparator.cameraZ += var19;
                }
                if (var18 == 3) {
                    class7.cameraYaw = (var19 + class7.cameraYaw) & 2047;
                }
                if (var18 == 4) {
                    class7.cameraPitch += var19;
                    if (class7.cameraPitch < 128) {
                        class7.cameraPitch = 128;
                    }
                    if (class7.cameraPitch > 383) {
                        class7.cameraPitch = 383;
                    }
                }
            }
        }
        var18 = MouseHandler.MouseHandler_x;
        var19 = MouseHandler.MouseHandler_y;
        if (MouseHandler.MouseHandler_lastButton != 0) {
            var18 = MouseHandler.MouseHandler_lastPressedX;
            var19 = MouseHandler.MouseHandler_lastPressedY;
        }
        if ((((var18 >= var0) && (var18 < (var0 + var2))) && (var19 >= var1)) && (var19 < (var3 + var1))) {
            var20 = var18 - var0;
            var21 = var19 - var1;
            ViewportMouse.ViewportMouse_x = var20;
            ViewportMouse.ViewportMouse_y = var21;
            ViewportMouse.ViewportMouse_isInViewport = true;
            ViewportMouse.ViewportMouse_entityCount = 0;
            ViewportMouse.ViewportMouse_false0 = false;
        } else {
            class18.method260();
        }
        class122.playPcmPlayers();
        Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
        class122.playPcmPlayers();
        var20 = Rasterizer3D.Rasterizer3D_zoom;
        Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
        Decimator.scene.draw(class414.cameraX, WorldMapDecoration.cameraY, GrandExchangeOfferOwnWorldComparator.cameraZ, class7.cameraPitch, class7.cameraYaw, var12);
        Rasterizer3D.Rasterizer3D_zoom = var20;
        class122.playPcmPlayers();
        Decimator.scene.clearTempGameObjects();
        Client.overheadTextCount = 0;
        boolean var42 = false;
        var22 = -1;
        int var23 = -1;
        int var24 = Players.Players_count;
        int[] var25 = Players.Players_indices;
        int var26;
        for (var26 = 0; var26 < (var24 + Client.npcCount); ++var26) {
            Object var39;
            if (var26 < var24) {
                var39 = Client.players[var25[var26]];
                if (var25[var26] == Client.combatTargetPlayerIndex) {
                    var42 = true;
                    var22 = var26;
                    continue;
                }
                if (var39 == WorldMapSprite.localPlayer) {
                    var23 = var26;
                    continue;
                }
            } else {
                var39 = Client.npcs[Client.npcIndices[var26 - var24]];
            }
            class19.drawActor2d(((Actor) (var39)), var26, var0, var1, var2, var3);
        }
        if (Client.renderSelf && (var23 != (-1))) {
            class19.drawActor2d(WorldMapSprite.localPlayer, var23, var0, var1, var2, var3);
        }
        if (var42) {
            class19.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var22, var0, var1, var2, var3);
        }
        for (var26 = 0; var26 < Client.overheadTextCount; ++var26) {
            int var27 = Client.overheadTextXs[var26];
            int var28 = Client.overheadTextYs[var26];
            int var29 = Client.overheadTextXOffsets[var26];
            int var30 = Client.overheadTextAscents[var26];
            boolean var31 = true;
            while (var31) {
                var31 = false;
                for (int var38 = 0; var38 < var26; ++var38) {
                    if ((((((var28 + 2) > (Client.overheadTextYs[var38] - Client.overheadTextAscents[var38])) && ((var28 - var30) < (Client.overheadTextYs[var38] + 2))) && ((var27 - var29) < (Client.overheadTextXOffsets[var38] + Client.overheadTextXs[var38]))) && ((var27 + var29) > (Client.overheadTextXs[var38] - Client.overheadTextXOffsets[var38]))) && ((Client.overheadTextYs[var38] - Client.overheadTextAscents[var38]) < var28)) {
                        var28 = Client.overheadTextYs[var38] - Client.overheadTextAscents[var38];
                        var31 = true;
                    }
                }
            } 
            Client.viewportTempX = Client.overheadTextXs[var26];
            Client.viewportTempY = Client.overheadTextYs[var26] = var28;
            String var32 = Client.overheadText[var26];
            if (Client.chatEffects == 0) {
                int var33 = 16776960;
                if (Client.overheadTextColors[var26] < 6) {
                    var33 = Client.field723[Client.overheadTextColors[var26]];
                }
                if (Client.overheadTextColors[var26] == 6) {
                    var33 = ((Client.viewportDrawCount % 20) < 10) ? 16711680 : 16776960;
                }
                if (Client.overheadTextColors[var26] == 7) {
                    var33 = ((Client.viewportDrawCount % 20) < 10) ? 255 : '￿';
                }
                if (Client.overheadTextColors[var26] == 8) {
                    var33 = ((Client.viewportDrawCount % 20) < 10) ? '뀀' : 8454016;
                }
                int var34;
                if (Client.overheadTextColors[var26] == 9) {
                    var34 = 150 - Client.overheadTextCyclesRemaining[var26];
                    if (var34 < 50) {
                        var33 = (var34 * 1280) + 16711680;
                    } else if (var34 < 100) {
                        var33 = 16776960 - ((var34 - 50) * 327680);
                    } else if (var34 < 150) {
                        var33 = ((var34 - 100) * 5) + 65280;
                    }
                }
                if (Client.overheadTextColors[var26] == 10) {
                    var34 = 150 - Client.overheadTextCyclesRemaining[var26];
                    if (var34 < 50) {
                        var33 = (var34 * 5) + 16711680;
                    } else if (var34 < 100) {
                        var33 = 16711935 - ((var34 - 50) * 327680);
                    } else if (var34 < 150) {
                        var33 = (((var34 - 100) * 327680) + 255) - ((var34 - 100) * 5);
                    }
                }
                if (Client.overheadTextColors[var26] == 11) {
                    var34 = 150 - Client.overheadTextCyclesRemaining[var26];
                    if (var34 < 50) {
                        var33 = 16777215 - (var34 * 327685);
                    } else if (var34 < 100) {
                        var33 = ((var34 - 50) * 327685) + 65280;
                    } else if (var34 < 150) {
                        var33 = 16777215 - ((var34 - 100) * 327680);
                    }
                }
                if (Client.overheadTextEffects[var26] == 0) {
                    class408.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0);
                }
                if (Client.overheadTextEffects[var26] == 1) {
                    class408.fontBold12.drawCenteredWave(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount);
                }
                if (Client.overheadTextEffects[var26] == 2) {
                    class408.fontBold12.drawCenteredWave2(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount);
                }
                if (Client.overheadTextEffects[var26] == 3) {
                    class408.fontBold12.drawCenteredShake(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var26]);
                }
                if (Client.overheadTextEffects[var26] == 4) {
                    var34 = ((150 - Client.overheadTextCyclesRemaining[var26]) * (class408.fontBold12.stringWidth(var32) + 100)) / 150;
                    Rasterizer2D.Rasterizer2D_expandClip((var0 + Client.viewportTempX) - 50, var1, (var0 + Client.viewportTempX) + 50, var3 + var1);
                    class408.fontBold12.draw(var32, ((var0 + Client.viewportTempX) + 50) - var34, Client.viewportTempY + var1, var33, 0);
                    Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
                }
                if (Client.overheadTextEffects[var26] == 5) {
                    var34 = 150 - Client.overheadTextCyclesRemaining[var26];
                    int var35 = 0;
                    if (var34 < 25) {
                        var35 = var34 - 25;
                    } else if (var34 > 125) {
                        var35 = var34 - 125;
                    }
                    Rasterizer2D.Rasterizer2D_expandClip(var0, ((Client.viewportTempY + var1) - class408.fontBold12.ascent) - 1, var0 + var2, (Client.viewportTempY + var1) + 5);
                    class408.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, (var35 + Client.viewportTempY) + var1, var33, 0);
                    Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
                }
            } else {
                class408.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
            }
        }
        class371.method6674(var0, var1);
        ((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).animate(Client.field566);
        SoundCache.method785();
        class414.cameraX = var13;
        WorldMapDecoration.cameraY = var14;
        GrandExchangeOfferOwnWorldComparator.cameraZ = var15;
        class7.cameraPitch = var16;
        class7.cameraYaw = var17;
        if (Client.isLoading) {
            byte var43 = 0;
            var22 = (var43 + NetCache.NetCache_pendingPriorityWritesCount) + NetCache.NetCache_pendingPriorityResponsesCount;
            if (var22 == 0) {
                Client.isLoading = false;
            }
        }
        if (Client.isLoading) {
            Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
            Calendar.drawLoadingMessage("Loading - please wait.", false);
        }
    }
}