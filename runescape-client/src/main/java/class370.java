import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nq")
public final class class370 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "[Lnq;")
    public static class370[] field4235;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1478906637)
    static int field4230;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1121135707)
    public static int field4231;

    @ObfuscatedName("dw")
    @Export("mouseCam")
    static boolean mouseCam;

    @ObfuscatedName("e")
    float field4229;

    @ObfuscatedName("r")
    float field4233;

    @ObfuscatedName("o")
    float field4234;

    @ObfuscatedName("i")
    float field4232;

    static {
        field4235 = new class370[0];
        FloorOverlayDefinition.method3588(100);
        new class370();
    }

    public class370() {
        this.method6643();
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1568150924")
    public void method6642() {
        synchronized(field4235) {
            if (field4231 < (field4230 - 1)) {
                field4235[(++field4231) - 1] = this;
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(FFFFI)V", garbageValue = "-1359780471")
    void method6646(float var1, float var2, float var3, float var4) {
        this.field4229 = var1;
        this.field4233 = var2;
        this.field4234 = var3;
        this.field4232 = var4;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(FFFFI)V", garbageValue = "-1630309161")
    public void method6669(float var1, float var2, float var3, float var4) {
        float var5 = ((float) (Math.sin(((double) (var4 * 0.5F)))));
        float var6 = ((float) (Math.cos(((double) (var4 * 0.5F)))));
        this.field4229 = var5 * var1;
        this.field4233 = var5 * var2;
        this.field4234 = var3 * var5;
        this.field4232 = var6;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-123573412")
    public final void method6643() {
        this.field4234 = 0.0F;
        this.field4233 = 0.0F;
        this.field4229 = 0.0F;
        this.field4232 = 1.0F;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lnq;B)V", garbageValue = "102")
    public final void method6663(class370 var1) {
        this.method6646((((var1.field4229 * this.field4232) + (var1.field4232 * this.field4229)) + (this.field4234 * var1.field4233)) - (var1.field4234 * this.field4233), ((var1.field4233 * this.field4232) + ((var1.field4232 * this.field4233) - (var1.field4229 * this.field4234))) + (var1.field4234 * this.field4229), (((this.field4234 * var1.field4232) + (this.field4233 * var1.field4229)) - (var1.field4233 * this.field4229)) + (this.field4232 * var1.field4234), (((var1.field4232 * this.field4232) - (this.field4229 * var1.field4229)) - (var1.field4233 * this.field4233)) - (var1.field4234 * this.field4234));
    }

    public boolean equals(Object var1) {
        if (!(var1 instanceof class370)) {
            return false;
        } else {
            class370 var2 = ((class370) (var1));
            return (((this.field4229 == var2.field4229) && (var2.field4233 == this.field4233)) && (var2.field4234 == this.field4234)) && (var2.field4232 == this.field4232);
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        var2 = this.field4229 + (var2 * 31.0F);
        var2 = (31.0F * var2) + this.field4233;
        var2 = this.field4234 + (31.0F * var2);
        var2 = this.field4232 + (var2 * 31.0F);
        return ((int) (var2));
    }

    public String toString() {
        return (((((this.field4229 + ",") + this.field4233) + ",") + this.field4234) + ",") + this.field4232;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "117")
    @Export("isKeyDown")
    public static final boolean isKeyDown() {
        synchronized(KeyHandler.KeyHandler_instance) {
            if (KeyHandler.field144 == KeyHandler.field140) {
                return false;
            } else {
                class160.field1749 = KeyHandler.field132[KeyHandler.field140];
                ClanSettings.field1610 = KeyHandler.field136[KeyHandler.field140];
                KeyHandler.field140 = (KeyHandler.field140 + 1) & 127;
                return true;
            }
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(IIIIIZI)Lpt;", garbageValue = "113583255")
    @Export("getItemSprite")
    public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
        if (var1 == (-1)) {
            var4 = 0;
        } else if ((var4 == 2) && (var1 != 1)) {
            var4 = 1;
        }
        long var6 = ((((((long) (var3)) << 42) + (((long) (var4)) << 40)) + ((long) (var0))) + (((long) (var1)) << 16)) + (((long) (var2)) << 38);
        SpritePixels var8;
        if (!var5) {
            var8 = ((SpritePixels) (ItemComposition.ItemDefinition_cachedSprites.get(var6)));
            if (var8 != null) {
                return var8;
            }
        }
        ItemComposition var9 = Client.ItemDefinition_get(var0);
        if ((var1 > 1) && (var9.countobj != null)) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; ++var11) {
                if ((var1 >= var9.countco[var11]) && (var9.countco[var11] != 0)) {
                    var10 = var9.countobj[var11];
                }
            }
            if (var10 != (-1)) {
                var9 = Client.ItemDefinition_get(var10);
            }
        }
        Model var21 = var9.getModel(1);
        if (var21 == null) {
            return null;
        } else {
            SpritePixels var22 = null;
            if (var9.noteTemplate != (-1)) {
                var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
                if (var22 == null) {
                    return null;
                }
            } else if (var9.notedId != (-1)) {
                var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
                if (var22 == null) {
                    return null;
                }
            } else if (var9.placeholderTemplate != (-1)) {
                var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
                if (var22 == null) {
                    return null;
                }
            }
            int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
            int var13 = Rasterizer2D.Rasterizer2D_width;
            int var14 = Rasterizer2D.Rasterizer2D_height;
            int[] var15 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var15);
            var8 = new SpritePixels(36, 32);
            Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
            Rasterizer2D.Rasterizer2D_clear();
            Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
            Rasterizer3D.method3787(16, 16);
            Rasterizer3D.field2261 = false;
            if (var9.placeholderTemplate != (-1)) {
                var22.drawTransBgAt(0, 0);
            }
            int var16 = var9.zoom2d;
            if (var5) {
                var16 = ((int) (((double) (var16)) * 1.5));
            } else if (var2 == 2) {
                var16 = ((int) (((double) (var16)) * 1.04));
            }
            int var17 = (var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d]) >> 16;
            int var18 = (var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d]) >> 16;
            var21.calculateBoundsCylinder();
            var21.method4215(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, ((var21.height / 2) + var17) + var9.offsetY2d, var18 + var9.offsetY2d);
            if (var9.notedId != (-1)) {
                var22.drawTransBgAt(0, 0);
            }
            if (var2 >= 1) {
                var8.outline(1);
            }
            if (var2 >= 2) {
                var8.outline(16777215);
            }
            if (var3 != 0) {
                var8.shadow(var3);
            }
            Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
            if (var9.noteTemplate != (-1)) {
                var22.drawTransBgAt(0, 0);
            }
            if ((var4 == 1) || ((var4 == 2) && (var9.isStackable == 1))) {
                Font var19 = class67.ItemDefinition_fontPlain11;
                String var20;
                if (var1 < 100000) {
                    var20 = ("<col=ffff00>" + var1) + "</col>";
                } else if (var1 < 10000000) {
                    var20 = (("<col=ffffff>" + (var1 / 1000)) + "K") + "</col>";
                } else {
                    var20 = (("<col=00ff80>" + (var1 / 1000000)) + "M") + "</col>";
                }
                var19.draw(var20, 0, 9, 16776960, 1);
            }
            if (!var5) {
                ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
            }
            Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
            Rasterizer2D.Rasterizer2D_setClipArray(var15);
            Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
            Rasterizer3D.field2261 = true;
            return var8;
        }
    }
}