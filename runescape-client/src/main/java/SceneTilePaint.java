import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("gj")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
    @ObfuscatedName("su")
    @ObfuscatedGetter(intValue = -757547801)
    static int field2543;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -931774183)
    @Export("swColor")
    int swColor;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1062280427)
    @Export("seColor")
    int seColor;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 341127599)
    @Export("neColor")
    int neColor;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1226345495)
    @Export("nwColor")
    int nwColor;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1491481341)
    @Export("texture")
    int texture;

    @ObfuscatedName("o")
    @Export("isFlat")
    boolean isFlat;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 325680491)
    @Export("rgb")
    int rgb;

    SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.isFlat = true;
        this.swColor = var1;
        this.seColor = var2;
        this.neColor = var3;
        this.nwColor = var4;
        this.texture = var5;
        this.rgb = var6;
        this.isFlat = var7;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)J", garbageValue = "44")
    static long method4271() {
        try {
            URL var0 = new URL(StructComposition.method3387("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            Buffer var4 = new Buffer(new byte[1000]);
            do {
                int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
                if (var5 == (-1)) {
                    var4.offset = 0;
                    long var7 = var4.readLong();
                    return var7;
                }
                var4.offset += var5;
            } while (var4.offset < 1000 );
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("gm")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "513711216")
    static final void method4270(int var0, int var1, int var2) {
        if (class414.cameraX < var0) {
            class414.cameraX = ((((var0 - class414.cameraX) * class4.field17) / 1000) + class414.cameraX) + field2543;
            if (class414.cameraX > var0) {
                class414.cameraX = var0;
            }
        }
        if (class414.cameraX > var0) {
            class414.cameraX -= (((class414.cameraX - var0) * class4.field17) / 1000) + field2543;
            if (class414.cameraX < var0) {
                class414.cameraX = var0;
            }
        }
        if (WorldMapDecoration.cameraY < var1) {
            WorldMapDecoration.cameraY = ((((var1 - WorldMapDecoration.cameraY) * class4.field17) / 1000) + WorldMapDecoration.cameraY) + field2543;
            if (WorldMapDecoration.cameraY > var1) {
                WorldMapDecoration.cameraY = var1;
            }
        }
        if (WorldMapDecoration.cameraY > var1) {
            WorldMapDecoration.cameraY -= (((WorldMapDecoration.cameraY - var1) * class4.field17) / 1000) + field2543;
            if (WorldMapDecoration.cameraY < var1) {
                WorldMapDecoration.cameraY = var1;
            }
        }
        if (GrandExchangeOfferOwnWorldComparator.cameraZ < var2) {
            GrandExchangeOfferOwnWorldComparator.cameraZ = ((((var2 - GrandExchangeOfferOwnWorldComparator.cameraZ) * class4.field17) / 1000) + GrandExchangeOfferOwnWorldComparator.cameraZ) + field2543;
            if (GrandExchangeOfferOwnWorldComparator.cameraZ > var2) {
                GrandExchangeOfferOwnWorldComparator.cameraZ = var2;
            }
        }
        if (GrandExchangeOfferOwnWorldComparator.cameraZ > var2) {
            GrandExchangeOfferOwnWorldComparator.cameraZ -= (((GrandExchangeOfferOwnWorldComparator.cameraZ - var2) * class4.field17) / 1000) + field2543;
            if (GrandExchangeOfferOwnWorldComparator.cameraZ < var2) {
                GrandExchangeOfferOwnWorldComparator.cameraZ = var2;
            }
        }
    }

    @ObfuscatedName("ix")
    @ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-577436570")
    static final void method4268(int var0, int var1, int var2, int var3) {
        for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
            if (((((Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4]) > var0) && (Client.rootWidgetXs[var4] < (var0 + var2))) && ((Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4]) > var1)) && (Client.rootWidgetYs[var4] < (var3 + var1))) {
                Client.field713[var4] = true;
            }
        }
    }

    @ObfuscatedName("jn")
    @ObfuscatedSignature(descriptor = "(Ljz;B)Z", garbageValue = "-79")
    @Export("runCs1")
    static final boolean runCs1(Widget var0) {
        if (var0.cs1Comparisons == null) {
            return false;
        } else {
            for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
                int var2 = class376.method6791(var0, var1);
                int var3 = var0.cs1ComparisonValues[var1];
                if (var0.cs1Comparisons[var1] == 2) {
                    if (var2 >= var3) {
                        return false;
                    }
                } else if (var0.cs1Comparisons[var1] == 3) {
                    if (var2 <= var3) {
                        return false;
                    }
                } else if (var0.cs1Comparisons[var1] == 4) {
                    if (var2 == var3) {
                        return false;
                    }
                } else if (var2 != var3) {
                    return false;
                }
            }
            return true;
        }
    }
}