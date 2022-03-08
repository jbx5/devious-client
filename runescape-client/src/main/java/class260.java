import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jh")
public final class class260 {
    @ObfuscatedName("s")
    static final HashMap field3081;

    @ObfuscatedName("w")
    static byte[][][] field3078;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Lpt;")
    @Export("leftTitleSprite")
    static SpritePixels leftTitleSprite;

    static {
        field3081 = new HashMap();
        TimeZone var0;
        synchronized(field3081) {
            TimeZone var2 = ((TimeZone) (field3081.get("Europe/London")));
            if (var2 == null) {
                var2 = TimeZone.getTimeZone("Europe/London");
                field3081.put("Europe/London", var2);
            }
            var0 = var2;
        }
        java.util.Calendar.getInstance(var0);
    }

    @ObfuscatedName("gi")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "14")
    static final void method5000(int var0, int var1) {
        if (var0 < 128) {
            var0 = 128;
        }
        if (var0 > 383) {
            var0 = 383;
        }
        if (class7.cameraPitch < var0) {
            class7.cameraPitch = ((((var0 - class7.cameraPitch) * WallDecoration.field2573) / 1000) + class7.cameraPitch) + WorldMapSectionType.field2723;
            if (class7.cameraPitch > var0) {
                class7.cameraPitch = var0;
            }
        }
        if (class7.cameraPitch > var0) {
            class7.cameraPitch -= (((class7.cameraPitch - var0) * WallDecoration.field2573) / 1000) + WorldMapSectionType.field2723;
            if (class7.cameraPitch < var0) {
                class7.cameraPitch = var0;
            }
        }
        int var2 = var1 - class7.cameraYaw;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < (-1024)) {
            var2 += 2048;
        }
        if (var2 > 0) {
            class7.cameraYaw = (class7.cameraYaw + WorldMapSectionType.field2723) + ((var2 * WallDecoration.field2573) / 1000);
            class7.cameraYaw &= 2047;
        }
        if (var2 < 0) {
            class7.cameraYaw -= (((-var2) * WallDecoration.field2573) / 1000) + WorldMapSectionType.field2723;
            class7.cameraYaw &= 2047;
        }
        int var3 = var1 - class7.cameraYaw;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < (-1024)) {
            var3 += 2048;
        }
        if (((var3 < 0) && (var2 > 0)) || ((var3 > 0) && (var2 < 0))) {
            class7.cameraYaw = var1;
        }
    }

    @ObfuscatedName("lq")
    @ObfuscatedSignature(descriptor = "(Ljz;I)Z", garbageValue = "-1191528713")
    @Export("isComponentHidden")
    static boolean isComponentHidden(Widget var0) {
        return var0.isHidden;
    }
}