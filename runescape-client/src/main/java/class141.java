import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("eb")
public class class141 extends class126 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(longValue = 3417280475220638637L)
    long field1633;

    @ObfuscatedName("l")
    String field1634;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 392397209)
    int field1632;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class141(class129 var1) {
        this.this$0 = var1;
        this.field1633 = -1L;
        this.field1634 = null;
        this.field1632 = 0;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        if (var1.readUnsignedByte() != 255) {
            --var1.offset;
            this.field1633 = var1.readLong();
        }
        this.field1634 = var1.readStringCp1252NullTerminatedOrNull();
        this.field1632 = var1.readUnsignedShort();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2859(this.field1633, this.field1634, this.field1632);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "810169814")
    static int method2942(int var0, int var1) {
        ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
        if (var2 == null) {
            return 0;
        } else if (var1 == (-1)) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
                if (var2.ids[var4] == var1) {
                    var3 += var2.quantities[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("av")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "363387027")
    static int method2944(int var0, Script var1, boolean var2) {
        int var3;
        if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].type();
            return 1;
        } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].id;
            return 1;
        } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].unitPrice;
            return 1;
        } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].totalQuantity;
            return 1;
        } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].currentQuantity;
            return 1;
        } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].currentPrice;
            return 1;
        } else {
            int var13;
            if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                var13 = Client.grandExchangeOffers[var3].status();
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 0) ? 1 : 0;
                return 1;
            } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                var13 = Client.grandExchangeOffers[var3].status();
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 2) ? 1 : 0;
                return 1;
            } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                var13 = Client.grandExchangeOffers[var3].status();
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 5) ? 1 : 0;
                return 1;
            } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                var13 = Client.grandExchangeOffers[var3].status();
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 1) ? 1 : 0;
                return 1;
            } else {
                boolean var12;
                if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
                    var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                    if (class135.grandExchangeEvents != null) {
                        class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
                    var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                    if (class135.grandExchangeEvents != null) {
                        class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
                    Interpreter.Interpreter_intStackSize -= 2;
                    var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
                    boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
                    if (class135.grandExchangeEvents != null) {
                        Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                        class135.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
                    var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                    if (class135.grandExchangeEvents != null) {
                        class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
                    var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                    if (class135.grandExchangeEvents != null) {
                        class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class135.grandExchangeEvents == null) ? 0 : class135.grandExchangeEvents.events.size();
                    return 1;
                } else {
                    GrandExchangeEvent var4;
                    if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.world;
                        return 1;
                    } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4.getOfferName();
                        return 1;
                    } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4.getPreviousOfferName();
                        return 1;
                    } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        long var5 = (DirectByteArrayCopier.getServerTime() - class140.field1626) - var4.age;
                        int var7 = ((int) (var5 / 3600000L));
                        int var8 = ((int) ((var5 - ((long) (var7 * 3600000))) / 60000L));
                        int var9 = ((int) (((var5 - ((long) (var7 * 3600000))) - ((long) (var8 * 60000))) / 1000L));
                        String var10 = (((((var7 + ":") + (var8 / 10)) + (var8 % 10)) + ":") + (var9 / 10)) + (var9 % 10);
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var10;
                        return 1;
                    } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.totalQuantity;
                        return 1;
                    } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.unitPrice;
                        return 1;
                    } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = ((GrandExchangeEvent) (class135.grandExchangeEvents.events.get(var3)));
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.id;
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ju")
    @ObfuscatedSignature(descriptor = "(Ljz;IIZI)V", garbageValue = "1099824756")
    @Export("alignWidgetSize")
    static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
        int var4 = var0.width;
        int var5 = var0.height;
        if (var0.widthAlignment == 0) {
            var0.width = var0.rawWidth;
        } else if (var0.widthAlignment == 1) {
            var0.width = var1 - var0.rawWidth;
        } else if (var0.widthAlignment == 2) {
            var0.width = (var0.rawWidth * var1) >> 14;
        }
        if (var0.heightAlignment == 0) {
            var0.height = var0.rawHeight;
        } else if (var0.heightAlignment == 1) {
            var0.height = var2 - var0.rawHeight;
        } else if (var0.heightAlignment == 2) {
            var0.height = (var2 * var0.rawHeight) >> 14;
        }
        if (var0.widthAlignment == 4) {
            var0.width = (var0.height * var0.field3281) / var0.field3282;
        }
        if (var0.heightAlignment == 4) {
            var0.height = (var0.width * var0.field3282) / var0.field3281;
        }
        if (var0.contentType == 1337) {
            Client.viewportWidget = var0;
        }
        if ((var3 && (var0.onResize != null)) && ((var4 != var0.width) || (var5 != var0.height))) {
            ScriptEvent var6 = new ScriptEvent();
            var6.widget = var0;
            var6.args = var0.onResize;
            Client.scriptEvents.addFirst(var6);
        }
    }
}