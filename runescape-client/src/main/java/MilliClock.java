import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fi")
@Implements("MilliClock")
public class MilliClock extends Clock {
    @ObfuscatedName("w")
    @Export("ItemDefinition_inMembersWorld")
    public static boolean ItemDefinition_inMembersWorld;

    @ObfuscatedName("c")
    long[] field1725;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 793127537)
    int field1723;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 2097716395)
    int field1722;

    @ObfuscatedName("e")
    @ObfuscatedGetter(longValue = -9075716537403747691L)
    long field1728;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 652468747)
    int field1726;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -790386425)
    int field1727;

    public MilliClock() {
        this.field1725 = new long[10];
        this.field1723 = 256;
        this.field1722 = 1;
        this.field1726 = 0;
        this.field1728 = DirectByteArrayCopier.getServerTime();
        for (int var1 = 0; var1 < 10; ++var1) {
            this.field1725[var1] = this.field1728;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2049179835")
    @Export("mark")
    public void mark() {
        for (int var1 = 0; var1 < 10; ++var1) {
            this.field1725[var1] = 0L;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-113")
    @Export("wait")
    public int wait(int var1, int var2) {
        int var3 = this.field1723;
        int var4 = this.field1722;
        this.field1723 = 300;
        this.field1722 = 1;
        this.field1728 = DirectByteArrayCopier.getServerTime();
        if (0L == this.field1725[this.field1727]) {
            this.field1723 = var3;
            this.field1722 = var4;
        } else if (this.field1728 > this.field1725[this.field1727]) {
            this.field1723 = ((int) (((long) (var1 * 2560)) / (this.field1728 - this.field1725[this.field1727])));
        }
        if (this.field1723 < 25) {
            this.field1723 = 25;
        }
        if (this.field1723 > 256) {
            this.field1723 = 256;
            this.field1722 = ((int) (((long) (var1)) - ((this.field1728 - this.field1725[this.field1727]) / 10L)));
        }
        if (this.field1722 > var1) {
            this.field1722 = var1;
        }
        this.field1725[this.field1727] = this.field1728;
        this.field1727 = (this.field1727 + 1) % 10;
        int var5;
        if (this.field1722 > 1) {
            for (var5 = 0; var5 < 10; ++var5) {
                if (0L != this.field1725[var5]) {
                    this.field1725[var5] += ((long) (this.field1722));
                }
            }
        }
        if (this.field1722 < var2) {
            this.field1722 = var2;
        }
        Language.method5813(((long) (this.field1722)));
        for (var5 = 0; this.field1726 < 256; this.field1726 += this.field1723) {
            ++var5;
        }
        this.field1726 &= 255;
        return var5;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZZI)V", garbageValue = "-1844077463")
    @Export("openURL")
    public static void openURL(String var0, boolean var1, boolean var2) {
        if (var1) {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(var0));
                    return;
                } catch (Exception var4) {
                }
            }
            if (class29.field175.startsWith("win")) {
                UrlRequester.method2419(var0, 0, "openjs");
            } else if (class29.field175.startsWith("mac")) {
                UrlRequester.method2419(var0, 1, "openjs");
            } else {
                UrlRequester.method2419(var0, 2, "openjs");
            }
        } else {
            UrlRequester.method2419(var0, 3, "openjs");
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "1")
    public static boolean method3115(int var0) {
        return ((var0 >> 21) & 1) != 0;
    }
}