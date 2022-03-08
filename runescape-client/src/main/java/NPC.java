import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cy")
@Implements("NPC")
public final class NPC extends Actor {
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1945650937)
    @Export("canvasHeight")
    public static int canvasHeight;

    @ObfuscatedName("kg")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("hoveredItemContainer")
    static Widget hoveredItemContainer;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lfj;")
    @Export("definition")
    NPCComposition definition;

    NPC() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ILgl;I)V", garbageValue = "-1216199003")
    final void method2265(int var1, class185 var2) {
        int var3 = super.pathX[0];
        int var4 = super.pathY[0];
        if (var1 == 0) {
            --var3;
            ++var4;
        }
        if (var1 == 1) {
            ++var4;
        }
        if (var1 == 2) {
            ++var3;
            ++var4;
        }
        if (var1 == 3) {
            --var3;
        }
        if (var1 == 4) {
            ++var3;
        }
        if (var1 == 5) {
            --var3;
            --var4;
        }
        if (var1 == 6) {
            --var4;
        }
        if (var1 == 7) {
            ++var3;
            --var4;
        }
        if ((super.sequence != (-1)) && (class78.SequenceDefinition_get(super.sequence).field2099 == 1)) {
            super.sequence = -1;
        }
        if (super.pathLength < 9) {
            ++super.pathLength;
        }
        for (int var5 = super.pathLength; var5 > 0; --var5) {
            super.pathX[var5] = super.pathX[var5 - 1];
            super.pathY[var5] = super.pathY[var5 - 1];
            super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
        }
        super.pathX[0] = var3;
        super.pathY[0] = var4;
        super.pathTraversed[0] = var2;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)Lgf;", garbageValue = "39")
    @Export("getModel")
    protected final Model getModel() {
        if (this.definition == null) {
            return null;
        } else {
            SequenceDefinition var1 = ((super.sequence != (-1)) && (super.sequenceDelay == 0)) ? class78.SequenceDefinition_get(super.sequence) : null;
            SequenceDefinition var2 = ((super.movementSequence != (-1)) && ((super.idleSequence != super.movementSequence) || (var1 == null))) ? class78.SequenceDefinition_get(super.movementSequence) : null;
            Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
            if (var3 == null) {
                return null;
            } else {
                var3.calculateBoundsCylinder();
                super.defaultHeight = var3.height;
                if ((super.spotAnimation != (-1)) && (super.spotAnimationFrame != (-1))) {
                    Model var4 = Widget.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
                    if (var4 != null) {
                        var4.offsetBy(0, -super.spotAnimationHeight, 0);
                        Model[] var5 = new Model[]{ var3, var4 };
                        var3 = new Model(var5, 2);
                    }
                }
                if (this.definition.size == 1) {
                    var3.isSingleTile = true;
                }
                if (((super.field1167 != 0) && (Client.cycle >= super.field1162)) && (Client.cycle < super.field1163)) {
                    var3.overrideHue = super.field1164;
                    var3.overrideSaturation = super.field1155;
                    var3.overrideLuminance = super.field1166;
                    var3.overrideAmount = super.field1167;
                } else {
                    var3.overrideAmount = 0;
                }
                return var3;
            }
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "-1453105386")
    final void method2260(int var1, int var2, boolean var3) {
        if ((super.sequence != (-1)) && (class78.SequenceDefinition_get(super.sequence).field2099 == 1)) {
            super.sequence = -1;
        }
        if (!var3) {
            int var4 = var1 - super.pathX[0];
            int var5 = var2 - super.pathY[0];
            if ((((var4 >= (-8)) && (var4 <= 8)) && (var5 >= (-8))) && (var5 <= 8)) {
                if (super.pathLength < 9) {
                    ++super.pathLength;
                }
                for (int var6 = super.pathLength; var6 > 0; --var6) {
                    super.pathX[var6] = super.pathX[var6 - 1];
                    super.pathY[var6] = super.pathY[var6 - 1];
                    super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
                }
                super.pathX[0] = var1;
                super.pathY[0] = var2;
                super.pathTraversed[0] = class185.field2135;
                return;
            }
        }
        super.pathLength = 0;
        super.field1176 = 0;
        super.field1175 = 0;
        super.pathX[0] = var1;
        super.pathY[0] = var2;
        super.x = (super.field1113 * 64) + (super.pathX[0] * 128);
        super.y = (super.field1113 * 64) + (super.pathY[0] * 128);
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1570210948")
    @Export("isVisible")
    final boolean isVisible() {
        return this.definition != null;
    }

    @ObfuscatedName("iw")
    @ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-1849978508")
    @Export("addSceneMenuOptions")
    static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
        if ((Client.isItemSelected == 0) && (!Client.isSpellSelected)) {
            class11.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8;
        for (var8 = 0; var8 < WorldMapSection0.method4702(); ++var8) {
            long var23 = class383.method6818(var8);
            if (var23 != var6) {
                var6 = var23;
                long var13 = ViewportMouse.ViewportMouse_entityTags[var8];
                int var12 = ((int) ((var13 >>> 0) & 127L));
                var12 = var12;
                int var26 = class186.method3690(var8);
                int var14 = class87.method2224(var8);
                int var15 = Skeleton.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
                int var16 = var15;
                if ((var14 == 2) && (Decimator.scene.getObjectFlags(SoundSystem.Client_plane, var12, var26, var23) >= 0)) {
                    ObjectComposition var17 = ParamComposition.getObjectDefinition(var15);
                    if (var17.transforms != null) {
                        var17 = var17.transform();
                    }
                    if (var17 == null) {
                        continue;
                    }
                    if (Client.isItemSelected == 1) {
                        class11.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(65535)) + var17.name, 1, var15, var12, var26);
                    } else if (Client.isSpellSelected) {
                        if ((RouteStrategy.selectedSpellFlags & 4) == 4) {
                            class11.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(65535)) + var17.name, 2, var15, var12, var26);
                        }
                    } else {
                        String[] var18 = var17.actions;
                        if (var18 != null) {
                            for (int var19 = 4; var19 >= 0; --var19) {
                                if (var18[var19] != null) {
                                    short var20 = 0;
                                    if (var19 == 0) {
                                        var20 = 3;
                                    }
                                    if (var19 == 1) {
                                        var20 = 4;
                                    }
                                    if (var19 == 2) {
                                        var20 = 5;
                                    }
                                    if (var19 == 3) {
                                        var20 = 6;
                                    }
                                    if (var19 == 4) {
                                        var20 = 1001;
                                    }
                                    class11.insertMenuItemNoShift(var18[var19], LoginScreenAnimation.colorStartTag(65535) + var17.name, var20, var16, var12, var26);
                                }
                            }
                        }
                        class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(65535) + var17.name, 1002, var17.id, var12, var26);
                    }
                }
                Player var21;
                int var27;
                NPC var28;
                int var35;
                int[] var36;
                if (var14 == 1) {
                    NPC var31 = Client.npcs[var16];
                    if (var31 == null) {
                        continue;
                    }
                    if (((var31.definition.size == 1) && ((var31.x & 127) == 64)) && ((var31.y & 127) == 64)) {
                        for (var27 = 0; var27 < Client.npcCount; ++var27) {
                            var28 = Client.npcs[Client.npcIndices[var27]];
                            if (((((var28 != null) && (var31 != var28)) && (var28.definition.size == 1)) && (var28.x == var31.x)) && (var28.y == var31.y)) {
                                WorldMapAreaData.addNpcToMenu(var28, Client.npcIndices[var27], var12, var26);
                            }
                        }
                        var27 = Players.Players_count;
                        var36 = Players.Players_indices;
                        for (var35 = 0; var35 < var27; ++var35) {
                            var21 = Client.players[var36[var35]];
                            if (((var21 != null) && (var21.x == var31.x)) && (var21.y == var31.y)) {
                                class14.addPlayerToMenu(var21, var36[var35], var12, var26);
                            }
                        }
                    }
                    WorldMapAreaData.addNpcToMenu(var31, var16, var12, var26);
                }
                if (var14 == 0) {
                    Player var32 = Client.players[var16];
                    if (var32 == null) {
                        continue;
                    }
                    if (((var32.x & 127) == 64) && ((var32.y & 127) == 64)) {
                        for (var27 = 0; var27 < Client.npcCount; ++var27) {
                            var28 = Client.npcs[Client.npcIndices[var27]];
                            if ((((var28 != null) && (var28.definition.size == 1)) && (var28.x == var32.x)) && (var28.y == var32.y)) {
                                WorldMapAreaData.addNpcToMenu(var28, Client.npcIndices[var27], var12, var26);
                            }
                        }
                        var27 = Players.Players_count;
                        var36 = Players.Players_indices;
                        for (var35 = 0; var35 < var27; ++var35) {
                            var21 = Client.players[var36[var35]];
                            if ((((var21 != null) && (var32 != var21)) && (var21.x == var32.x)) && (var32.y == var21.y)) {
                                class14.addPlayerToMenu(var21, var36[var35], var12, var26);
                            }
                        }
                    }
                    if (var16 != Client.combatTargetPlayerIndex) {
                        class14.addPlayerToMenu(var32, var16, var12, var26);
                    } else {
                        var4 = var23;
                    }
                }
                if (var14 == 3) {
                    NodeDeque var34 = Client.groundItems[SoundSystem.Client_plane][var12][var26];
                    if (var34 != null) {
                        for (TileItem var33 = ((TileItem) (var34.first())); var33 != null; var33 = ((TileItem) (var34.next()))) {
                            ItemComposition var37 = Client.ItemDefinition_get(var33.id);
                            if (Client.isItemSelected == 1) {
                                class11.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16748608)) + var37.name, 16, var33.id, var12, var26);
                            } else if (Client.isSpellSelected) {
                                if ((RouteStrategy.selectedSpellFlags & 1) == 1) {
                                    class11.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16748608)) + var37.name, 17, var33.id, var12, var26);
                                }
                            } else {
                                String[] var29 = var37.groundActions;
                                for (int var30 = 4; var30 >= 0; --var30) {
                                    if ((var29 != null) && (var29[var30] != null)) {
                                        byte var22 = 0;
                                        if (var30 == 0) {
                                            var22 = 18;
                                        }
                                        if (var30 == 1) {
                                            var22 = 19;
                                        }
                                        if (var30 == 2) {
                                            var22 = 20;
                                        }
                                        if (var30 == 3) {
                                            var22 = 21;
                                        }
                                        if (var30 == 4) {
                                            var22 = 22;
                                        }
                                        class11.insertMenuItemNoShift(var29[var30], LoginScreenAnimation.colorStartTag(16748608) + var37.name, var22, var33.id, var12, var26);
                                    } else if (var30 == 2) {
                                        class11.insertMenuItemNoShift("Take", LoginScreenAnimation.colorStartTag(16748608) + var37.name, 20, var33.id, var12, var26);
                                    }
                                }
                                class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16748608) + var37.name, 1004, var33.id, var12, var26);
                            }
                        }
                    }
                }
            }
        }
        if ((-1L) != var4) {
            var8 = ((int) ((var4 >>> 0) & 127L));
            int var10 = KeyHandler.method355(var4);
            Player var11 = Client.players[Client.combatTargetPlayerIndex];
            class14.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
        }
    }
}