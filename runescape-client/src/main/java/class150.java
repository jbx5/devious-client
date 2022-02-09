import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ef")
public class class150 extends class126 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -714152859)
    int field1680;

    @ObfuscatedName("l")
    @ObfuscatedGetter(longValue = -3879933819233761611L)
    long field1681;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class150(class129 var1) {
        this.this$0 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1680 = var1.readInt();
        this.field1681 = var1.readLong();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2869(this.field1680, this.field1681);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpc;I)V", garbageValue = "214617962")
    static final void method3025(PacketBuffer var0) {
        int var1 = 0;
        var0.importIndex();
        byte[] var10000;
        int var2;
        int var4;
        int var5;
        for (var2 = 0; var2 < Players.Players_count; ++var2) {
            var5 = Players.Players_indices[var2];
            if ((Players.field1276[var5] & 1) == 0) {
                if (var1 > 0) {
                    --var1;
                    var10000 = Players.field1276;
                    var10000[var5] = ((byte) (var10000[var5] | 2));
                } else {
                    var4 = var0.readBits(1);
                    if (var4 == 0) {
                        var1 = class4.method15(var0);
                        var10000 = Players.field1276;
                        var10000[var5] = ((byte) (var10000[var5] | 2));
                    } else {
                        ApproximateRouteStrategy.readPlayerUpdate(var0, var5);
                    }
                }
            }
        }
        var0.exportIndex();
        if (var1 != 0) {
            throw new RuntimeException();
        } else {
            var0.importIndex();
            for (var2 = 0; var2 < Players.Players_count; ++var2) {
                var5 = Players.Players_indices[var2];
                if ((Players.field1276[var5] & 1) != 0) {
                    if (var1 > 0) {
                        --var1;
                        var10000 = Players.field1276;
                        var10000[var5] = ((byte) (var10000[var5] | 2));
                    } else {
                        var4 = var0.readBits(1);
                        if (var4 == 0) {
                            var1 = class4.method15(var0);
                            var10000 = Players.field1276;
                            var10000[var5] = ((byte) (var10000[var5] | 2));
                        } else {
                            ApproximateRouteStrategy.readPlayerUpdate(var0, var5);
                        }
                    }
                }
            }
            var0.exportIndex();
            if (var1 != 0) {
                throw new RuntimeException();
            } else {
                var0.importIndex();
                for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
                    var5 = Players.Players_emptyIndices[var2];
                    if ((Players.field1276[var5] & 1) != 0) {
                        if (var1 > 0) {
                            --var1;
                            var10000 = Players.field1276;
                            var10000[var5] = ((byte) (var10000[var5] | 2));
                        } else {
                            var4 = var0.readBits(1);
                            if (var4 == 0) {
                                var1 = class4.method15(var0);
                                var10000 = Players.field1276;
                                var10000[var5] = ((byte) (var10000[var5] | 2));
                            } else if (class16.updateExternalPlayer(var0, var5)) {
                                var10000 = Players.field1276;
                                var10000[var5] = ((byte) (var10000[var5] | 2));
                            }
                        }
                    }
                }
                var0.exportIndex();
                if (var1 != 0) {
                    throw new RuntimeException();
                } else {
                    var0.importIndex();
                    for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
                        var5 = Players.Players_emptyIndices[var2];
                        if ((Players.field1276[var5] & 1) == 0) {
                            if (var1 > 0) {
                                --var1;
                                var10000 = Players.field1276;
                                var10000[var5] = ((byte) (var10000[var5] | 2));
                            } else {
                                var4 = var0.readBits(1);
                                if (var4 == 0) {
                                    var1 = class4.method15(var0);
                                    var10000 = Players.field1276;
                                    var10000[var5] = ((byte) (var10000[var5] | 2));
                                } else if (class16.updateExternalPlayer(var0, var5)) {
                                    var10000 = Players.field1276;
                                    var10000[var5] = ((byte) (var10000[var5] | 2));
                                }
                            }
                        }
                    }
                    var0.exportIndex();
                    if (var1 != 0) {
                        throw new RuntimeException();
                    } else {
                        Players.Players_count = 0;
                        Players.Players_emptyIdxCount = 0;
                        for (var2 = 1; var2 < 2048; ++var2) {
                            var10000 = Players.field1276;
                            var10000[var2] = ((byte) (var10000[var2] >> 1));
                            Player var3 = Client.players[var2];
                            if (var3 != null) {
                                Players.Players_indices[(++Players.Players_count) - 1] = var2;
                            } else {
                                Players.Players_emptyIndices[(++Players.Players_emptyIdxCount) - 1] = var2;
                            }
                        }
                    }
                }
            }
        }
    }
}