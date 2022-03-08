import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ke")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
    @ObfuscatedName("l")
    @Export("GrandExchangeEvents_ageComparator")
    public static Comparator GrandExchangeEvents_ageComparator;

    @ObfuscatedName("s")
    @Export("GrandExchangeEvents_priceComparator")
    public static Comparator GrandExchangeEvents_priceComparator;

    @ObfuscatedName("e")
    @Export("GrandExchangeEvents_nameComparator")
    public static Comparator GrandExchangeEvents_nameComparator;

    @ObfuscatedName("r")
    @Export("GrandExchangeEvents_quantityComparator")
    public static Comparator GrandExchangeEvents_quantityComparator;

    @ObfuscatedName("mv")
    @ObfuscatedSignature(descriptor = "Lbh;")
    @Export("tempMenuAction")
    static MenuAction tempMenuAction;

    @ObfuscatedName("c")
    @Export("events")
    public final List events;

    static {
        GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
        new GrandExchangeOfferWorldComparator();
        GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
        GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
        GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
    }

    @ObfuscatedSignature(descriptor = "(Lpi;Z)V", garbageValue = "1")
    public GrandExchangeEvents(Buffer var1, boolean var2) {
        int var3 = var1.readUnsignedShort();
        boolean var4 = var1.readUnsignedByte() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = var1.readUnsignedShort();
        this.events = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; ++var7) {
            this.events.add(new GrandExchangeEvent(var1, var5, var3));
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;ZB)V", garbageValue = "1")
    @Export("sort")
    public void sort(Comparator var1, boolean var2) {
        if (var2) {
            Collections.sort(this.events, var1);
        } else {
            Collections.sort(this.events, Collections.reverseOrder(var1));
        }
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)I", garbageValue = "28376")
    @Export("stringCp1252NullTerminatedByteSize")
    public static int stringCp1252NullTerminatedByteSize(String var0) {
        return var0.length() + 1;
    }

    @ObfuscatedName("ir")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2146066795")
    @Export("incrementMenuEntries")
    static final void incrementMenuEntries() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < (Client.menuOptionsCount - 1); ++var1) {
                if ((Client.menuOpcodes[var1] < 1000) && (Client.menuOpcodes[var1 + 1] > 1000)) {
                    String var2 = Client.menuTargets[var1];
                    Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
                    Client.menuTargets[var1 + 1] = var2;
                    String var3 = Client.menuActions[var1];
                    Client.menuActions[var1] = Client.menuActions[var1 + 1];
                    Client.menuActions[var1 + 1] = var3;
                    int var4 = Client.menuOpcodes[var1];
                    Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
                    Client.menuOpcodes[var1 + 1] = var4;
                    var4 = Client.menuArguments1[var1];
                    Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
                    Client.menuArguments1[var1 + 1] = var4;
                    var4 = Client.menuArguments2[var1];
                    Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
                    Client.menuArguments2[var1 + 1] = var4;
                    var4 = Client.menuIdentifiers[var1];
                    Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
                    Client.menuIdentifiers[var1 + 1] = var4;
                    boolean var5 = Client.menuShiftClick[var1];
                    Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
                    Client.menuShiftClick[var1 + 1] = var5;
                    var0 = false;
                }
            }
        } 
    }

    @ObfuscatedName("jf")
    @ObfuscatedSignature(descriptor = "(Ljz;III)V", garbageValue = "1063145695")
    @Export("Widget_addToMenu")
    static final void Widget_addToMenu(Widget var0, int var1, int var2) {
        if (var0.buttonType == 1) {
            class11.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
        }
        String var3;
        if ((var0.buttonType == 2) && (!Client.isSpellSelected)) {
            var3 = WorldMapEvent.Widget_getSpellActionName(var0);
            if (var3 != null) {
                class11.insertMenuItemNoShift(var3, LoginScreenAnimation.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
            }
        }
        if (var0.buttonType == 3) {
            class11.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
        }
        if (var0.buttonType == 4) {
            class11.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
        }
        if (var0.buttonType == 5) {
            class11.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
        }
        if ((var0.buttonType == 6) && (Client.meslayerContinueWidget == null)) {
            class11.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
        }
        int var4;
        int var15;
        if (var0.type == 2) {
            var15 = 0;
            for (var4 = 0; var4 < var0.height; ++var4) {
                for (int var17 = 0; var17 < var0.width; ++var17) {
                    int var18 = (var0.paddingX + 32) * var17;
                    int var7 = (var0.paddingY + 32) * var4;
                    if (var15 < 20) {
                        var18 += var0.inventoryXOffsets[var15];
                        var7 += var0.inventoryYOffsets[var15];
                    }
                    if ((((var1 >= var18) && (var2 >= var7)) && (var1 < (var18 + 32))) && (var2 < (var7 + 32))) {
                        Client.dragItemSlotDestination = var15;
                        NPC.hoveredItemContainer = var0;
                        if (var0.itemIds[var15] > 0) {
                            ItemComposition var8 = Client.ItemDefinition_get(var0.itemIds[var15] - 1);
                            if ((Client.isItemSelected == 1) && Skills.method5475(Language.getWidgetFlags(var0))) {
                                if ((var0.id != class133.selectedItemWidget) || (var15 != WorldMapAreaData.selectedItemSlot)) {
                                    class11.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16748608)) + var8.name, 31, var8.id, var15, var0.id);
                                }
                            } else if (Client.isSpellSelected && Skills.method5475(Language.getWidgetFlags(var0))) {
                                if ((RouteStrategy.selectedSpellFlags & 16) == 16) {
                                    class11.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + LoginScreenAnimation.colorStartTag(16748608)) + var8.name, 32, var8.id, var15, var0.id);
                                }
                            } else {
                                String[] var9 = var8.inventoryActions;
                                int var10 = -1;
                                if (Client.shiftClickDrop && KeyHandler.method324()) {
                                    var10 = var8.getShiftClickIndex();
                                }
                                if (Skills.method5475(Language.getWidgetFlags(var0))) {
                                    for (int var11 = 4; var11 >= 3; --var11) {
                                        if (var10 != var11) {
                                            class318.addWidgetItemMenuItem(var0, var8, var15, var11, false);
                                        }
                                    }
                                }
                                int var12 = Language.getWidgetFlags(var0);
                                boolean var19 = ((var12 >> 31) & 1) != 0;
                                if (var19) {
                                    class11.insertMenuItemNoShift("Use", LoginScreenAnimation.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id);
                                }
                                Object var10000 = null;
                                int var13;
                                if (Skills.method5475(Language.getWidgetFlags(var0))) {
                                    for (var13 = 2; var13 >= 0; --var13) {
                                        if (var13 != var10) {
                                            class318.addWidgetItemMenuItem(var0, var8, var15, var13, false);
                                        }
                                    }
                                    if (var10 >= 0) {
                                        class318.addWidgetItemMenuItem(var0, var8, var15, var10, true);
                                    }
                                }
                                var9 = var0.itemActions;
                                if (var9 != null) {
                                    for (var13 = 4; var13 >= 0; --var13) {
                                        if (var9[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 39;
                                            }
                                            if (var13 == 1) {
                                                var14 = 40;
                                            }
                                            if (var13 == 2) {
                                                var14 = 41;
                                            }
                                            if (var13 == 3) {
                                                var14 = 42;
                                            }
                                            if (var13 == 4) {
                                                var14 = 43;
                                            }
                                            class11.insertMenuItemNoShift(var9[var13], LoginScreenAnimation.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id);
                                        }
                                    }
                                }
                                class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id);
                            }
                        }
                    }
                    ++var15;
                }
            }
        }
        if (var0.isIf3) {
            if (Client.isSpellSelected) {
                if (MilliClock.method3115(Language.getWidgetFlags(var0)) && ((RouteStrategy.selectedSpellFlags & 32) == 32)) {
                    class11.insertMenuItemNoShift(Client.selectedSpellActionName, (((Client.selectedSpellName + " ") + "->") + " ") + var0.dataText, 58, 0, var0.childIndex, var0.id);
                }
            } else {
                for (var15 = 9; var15 >= 5; --var15) {
                    String var16;
                    if ((!ClientPacket.method4979(Language.getWidgetFlags(var0), var15)) && (var0.onOp == null)) {
                        var16 = null;
                    } else if ((((var0.actions != null) && (var0.actions.length > var15)) && (var0.actions[var15] != null)) && (var0.actions[var15].trim().length() != 0)) {
                        var16 = var0.actions[var15];
                    } else {
                        var16 = null;
                    }
                    if (var16 != null) {
                        class11.insertMenuItemNoShift(var16, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id);
                    }
                }
                var3 = WorldMapEvent.Widget_getSpellActionName(var0);
                if (var3 != null) {
                    class11.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
                }
                for (var4 = 4; var4 >= 0; --var4) {
                    String var5;
                    if ((!ClientPacket.method4979(Language.getWidgetFlags(var0), var4)) && (var0.onOp == null)) {
                        var5 = null;
                    } else if ((((var0.actions != null) && (var0.actions.length > var4)) && (var0.actions[var4] != null)) && (var0.actions[var4].trim().length() != 0)) {
                        var5 = var0.actions[var4];
                    } else {
                        var5 = null;
                    }
                    if (var5 != null) {
                        ArchiveLoader.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
                    }
                }
                if (class133.method2813(Language.getWidgetFlags(var0))) {
                    class11.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
                }
            }
        }
    }
}