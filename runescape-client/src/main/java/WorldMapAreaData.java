import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ip")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
    @ObfuscatedName("np")
    @ObfuscatedGetter(intValue = 1959926399)
    @Export("selectedItemSlot")
    static int selectedItemSlot;

    @ObfuscatedName("h")
    @Export("worldMapData0Set")
    HashSet worldMapData0Set;

    @ObfuscatedName("q")
    @Export("worldMapData1Set")
    HashSet worldMapData1Set;

    @ObfuscatedName("x")
    @Export("iconList")
    List iconList;

    WorldMapAreaData() {
    }

    @ObfuscatedName("bj")
    @ObfuscatedSignature(descriptor = "(Lpi;Lpi;IZI)V", garbageValue = "131197308")
    @Export("init")
    void init(Buffer var1, Buffer var2, int var3, boolean var4) {
        this.read(var1, var3);
        int var5 = var2.readUnsignedShort();
        this.worldMapData0Set = new HashSet(var5);
        int var6;
        for (var6 = 0; var6 < var5; ++var6) {
            WorldMapData_0 var7 = new WorldMapData_0();
            try {
                var7.init(var2);
            } catch (IllegalStateException var12) {
                continue;
            }
            this.worldMapData0Set.add(var7);
        }
        var6 = var2.readUnsignedShort();
        this.worldMapData1Set = new HashSet(var6);
        for (int var10 = 0; var10 < var6; ++var10) {
            WorldMapData_1 var8 = new WorldMapData_1();
            try {
                var8.init(var2);
            } catch (IllegalStateException var11) {
                continue;
            }
            this.worldMapData1Set.add(var8);
        }
        this.initIconsList(var2, var4);
    }

    @ObfuscatedName("bo")
    @ObfuscatedSignature(descriptor = "(Lpi;ZI)V", garbageValue = "1007802842")
    @Export("initIconsList")
    void initIconsList(Buffer var1, boolean var2) {
        this.iconList = new LinkedList();
        int var3 = var1.readUnsignedShort();
        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readNullableLargeSmart();
            Coord var6 = new Coord(var1.readInt());
            boolean var7 = var1.readUnsignedByte() == 1;
            if (var2 || (!var7)) {
                this.iconList.add(new WorldMapIcon_0(((Coord) (null)), var6, var5, ((WorldMapLabel) (null))));
            }
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
    public static void method4853() {
        while (true) {
            ArchiveDiskAction var0;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                var0 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast()));
            }
            if (var0 == null) {
                return;
            }
            var0.archive.load(var0.archiveDisk, ((int) (var0.key)), var0.data, false);
        } 
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(B)[Lkr;", garbageValue = "-67")
    public static StudioGame[] method4851() {
        return new StudioGame[]{ StudioGame.stellardawn, StudioGame.runescape, StudioGame.game5, StudioGame.oldscape, StudioGame.game4, StudioGame.game3 };
    }

    @ObfuscatedName("ib")
    @ObfuscatedSignature(descriptor = "(Lcy;IIIB)V", garbageValue = "122")
    @Export("addNpcToMenu")
    static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
        NPCComposition var4 = var0.definition;
        if (Client.menuOptionsCount < 400) {
            if (var4.transforms != null) {
                var4 = var4.transform();
            }
            if (var4 != null) {
                if (var4.isInteractable) {
                    if ((!var4.isFollower) || (Client.followerIndex == var1)) {
                        String var5 = var4.name;
                        int var6;
                        int var9;
                        if ((var4.combatLevel != 0) && (var0.field1135 != 0)) {
                            var6 = (var0.field1135 != (-1)) ? (var0.field1135 * (-1122712175)) * 1607900017 : (var4.combatLevel * 1860615845) * 475724077;
                            var9 = WorldMapSprite.localPlayer.combatLevel;
                            int var10 = var9 - var6;
                            String var8;
                            if (var10 < (-9)) {
                                var8 = LoginScreenAnimation.colorStartTag(16711680);
                            } else if (var10 < (-6)) {
                                var8 = LoginScreenAnimation.colorStartTag(16723968);
                            } else if (var10 < (-3)) {
                                var8 = LoginScreenAnimation.colorStartTag(16740352);
                            } else if (var10 < 0) {
                                var8 = LoginScreenAnimation.colorStartTag(16756736);
                            } else if (var10 > 9) {
                                var8 = LoginScreenAnimation.colorStartTag(65280);
                            } else if (var10 > 6) {
                                var8 = LoginScreenAnimation.colorStartTag(4259584);
                            } else if (var10 > 3) {
                                var8 = LoginScreenAnimation.colorStartTag(8453888);
                            } else if (var10 > 0) {
                                var8 = LoginScreenAnimation.colorStartTag(12648192);
                            } else {
                                var8 = LoginScreenAnimation.colorStartTag(16776960);
                            }
                            var5 = (((((var5 + var8) + " ") + " (") + "level-") + var6) + ")";
                        }
                        if (var4.isFollower && Client.followerOpsLowPriority) {
                            class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                        }
                        if (Client.isItemSelected == 1) {
                            class11.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16776960)) + var5, 7, var1, var2, var3);
                        } else if (Client.isSpellSelected) {
                            if ((RouteStrategy.selectedSpellFlags & 2) == 2) {
                                class11.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16776960)) + var5, 8, var1, var2, var3);
                            }
                        } else {
                            var6 = (var4.isFollower && Client.followerOpsLowPriority) ? 2000 : 0;
                            String[] var7 = var4.actions;
                            int var11;
                            if (var7 != null) {
                                for (var11 = 4; var11 >= 0; --var11) {
                                    if ((var7[var11] != null) && (!var7[var11].equalsIgnoreCase("Attack"))) {
                                        var9 = 0;
                                        if (var11 == 0) {
                                            var9 = var6 + 9;
                                        }
                                        if (var11 == 1) {
                                            var9 = var6 + 10;
                                        }
                                        if (var11 == 2) {
                                            var9 = var6 + 11;
                                        }
                                        if (var11 == 3) {
                                            var9 = var6 + 12;
                                        }
                                        if (var11 == 4) {
                                            var9 = var6 + 13;
                                        }
                                        class11.insertMenuItemNoShift(var7[var11], LoginScreenAnimation.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                                    }
                                }
                            }
                            if (var7 != null) {
                                for (var11 = 4; var11 >= 0; --var11) {
                                    if ((var7[var11] != null) && var7[var11].equalsIgnoreCase("Attack")) {
                                        short var12 = 0;
                                        if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
                                            if ((AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption) || ((AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption) && (var4.combatLevel > WorldMapSprite.localPlayer.combatLevel))) {
                                                var12 = 2000;
                                            }
                                            var9 = 0;
                                            if (var11 == 0) {
                                                var9 = var12 + 9;
                                            }
                                            if (var11 == 1) {
                                                var9 = var12 + 10;
                                            }
                                            if (var11 == 2) {
                                                var9 = var12 + 11;
                                            }
                                            if (var11 == 3) {
                                                var9 = var12 + 12;
                                            }
                                            if (var11 == 4) {
                                                var9 = var12 + 13;
                                            }
                                            class11.insertMenuItemNoShift(var7[var11], LoginScreenAnimation.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                                        }
                                    }
                                }
                            }
                            if ((!var4.isFollower) || (!Client.followerOpsLowPriority)) {
                                class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kp")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "20114754")
    static void method4855() {
        for (InterfaceParent var0 = ((InterfaceParent) (Client.interfaceParents.first())); var0 != null; var0 = ((InterfaceParent) (Client.interfaceParents.next()))) {
            int var1 = var0.group;
            if (class13.loadInterface(var1)) {
                boolean var2 = true;
                Widget[] var3 = Widget.Widget_interfaceComponents[var1];
                int var4;
                for (var4 = 0; var4 < var3.length; ++var4) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].isIf3;
                        break;
                    }
                }
                if (!var2) {
                    var4 = ((int) (var0.key));
                    Widget var5 = class130.getWidget(var4);
                    if (var5 != null) {
                        class112.invalidateWidget(var5);
                    }
                }
            }
        }
    }
}