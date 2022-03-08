import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hz")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1986325945)
    @Export("element")
    final int element;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lhp;")
    @Export("label")
    final WorldMapLabel label;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -804430029)
    @Export("subWidth")
    final int subWidth;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1605592337)
    @Export("subHeight")
    final int subHeight;

    @ObfuscatedSignature(descriptor = "(Ljd;Ljd;ILhp;)V")
    WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
        super(var1, var2);
        this.element = var3;
        this.label = var4;
        WorldMapElement var5 = class126.WorldMapElement_get(this.getElement());
        SpritePixels var6 = var5.getSpriteBool(false);
        if (var6 != null) {
            this.subWidth = var6.subWidth;
            this.subHeight = var6.subHeight;
        } else {
            this.subWidth = 0;
            this.subHeight = 0;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-206805537")
    @Export("getElement")
    public int getElement() {
        return this.element;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)Lhp;", garbageValue = "260379500")
    @Export("getLabel")
    WorldMapLabel getLabel() {
        return this.label;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1605473270")
    @Export("getSubWidth")
    int getSubWidth() {
        return this.subWidth;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-985060397")
    @Export("getSubHeight")
    int getSubHeight() {
        return this.subHeight;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZB)I", garbageValue = "6")
    public static int method4690(CharSequence var0, int var1, boolean var2) {
        if ((var1 >= 2) && (var1 <= 36)) {
            boolean var3 = false;
            boolean var4 = false;
            int var5 = 0;
            int var6 = var0.length();
            for (int var7 = 0; var7 < var6; ++var7) {
                char var8 = var0.charAt(var7);
                if (var7 == 0) {
                    if (var8 == '-') {
                        var3 = true;
                        continue;
                    }
                    if (var8 == '+') {
                        continue;
                    }
                }
                int var10;
                if ((var8 >= '0') && (var8 <= '9')) {
                    var10 = var8 - '0';
                } else if ((var8 >= 'A') && (var8 <= 'Z')) {
                    var10 = var8 - '7';
                } else {
                    if ((var8 < 'a') || (var8 > 'z')) {
                        throw new NumberFormatException();
                    }
                    var10 = var8 - 'W';
                }
                if (var10 >= var1) {
                    throw new NumberFormatException();
                }
                if (var3) {
                    var10 = -var10;
                }
                int var9 = (var5 * var1) + var10;
                if ((var9 / var1) != var5) {
                    throw new NumberFormatException();
                }
                var5 = var9;
                var4 = true;
            }
            if (!var4) {
                throw new NumberFormatException();
            } else {
                return var5;
            }
        } else {
            throw new IllegalArgumentException("" + var1);
        }
    }
}