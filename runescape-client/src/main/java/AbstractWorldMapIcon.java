import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ix")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Ljd;")
    @Export("coord2")
    public final Coord coord2;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Ljd;")
    @Export("coord1")
    public final Coord coord1;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -931002521)
    @Export("screenX")
    int screenX;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 867732049)
    @Export("screenY")
    int screenY;

    @ObfuscatedSignature(descriptor = "(Ljd;Ljd;)V")
    AbstractWorldMapIcon(Coord var1, Coord var2) {
        this.coord1 = var1;
        this.coord2 = var2;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-206805537")
    @Export("getElement")
    public abstract int getElement();

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)Lhp;", garbageValue = "260379500")
    @Export("getLabel")
    abstract WorldMapLabel getLabel();

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1605473270")
    @Export("getSubWidth")
    abstract int getSubWidth();

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-985060397")
    @Export("getSubHeight")
    abstract int getSubHeight();

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-699029278")
    @Export("fitsScreen")
    boolean fitsScreen(int var1, int var2) {
        if (this.elementFitsScreen(var1, var2)) {
            return true;
        } else {
            return this.labelFitsScreen(var1, var2);
        }
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1825050776")
    @Export("hasValidElement")
    boolean hasValidElement() {
        return this.getElement() >= 0;
    }

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1705583854")
    @Export("elementFitsScreen")
    boolean elementFitsScreen(int var1, int var2) {
        if (!this.hasValidElement()) {
            return false;
        } else {
            WorldMapElement var3 = class126.WorldMapElement_get(this.getElement());
            int var4 = this.getSubWidth();
            int var5 = this.getSubHeight();
            switch (var3.horizontalAlignment.value) {
                case 0 :
                    if ((var1 > (this.screenX - var4)) && (var1 <= this.screenX)) {
                        break;
                    }
                    return false;
                case 1 :
                    if ((var1 >= (this.screenX - (var4 / 2))) && (var1 <= ((var4 / 2) + this.screenX))) {
                        break;
                    }
                    return false;
                case 2 :
                    if ((var1 < this.screenX) || (var1 >= (var4 + this.screenX))) {
                        return false;
                    }
            }
            switch (var3.verticalAlignment.value) {
                case 0 :
                    if ((var2 >= (this.screenY - (var5 / 2))) && (var2 <= ((var5 / 2) + this.screenY))) {
                        break;
                    }
                    return false;
                case 1 :
                    if ((var2 >= this.screenY) && (var2 < (var5 + this.screenY))) {
                        break;
                    }
                    return false;
                case 2 :
                    if ((var2 <= (this.screenY - var5)) || (var2 > this.screenY)) {
                        return false;
                    }
            }
            return true;
        }
    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1805773116")
    @Export("labelFitsScreen")
    boolean labelFitsScreen(int var1, int var2) {
        WorldMapLabel var3 = this.getLabel();
        if (var3 == null) {
            return false;
        } else if ((var1 >= (this.screenX - (var3.width / 2))) && (var1 <= ((var3.width / 2) + this.screenX))) {
            return (var2 >= this.screenY) && (var2 <= (var3.height + this.screenY));
        } else {
            return false;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;I)V", garbageValue = "-1438320366")
    public static void method4803(AbstractArchive var0, AbstractArchive var1) {
        HealthBarDefinition.HealthBarDefinition_archive = var0;
        HealthBarDefinition.field1806 = var1;
    }
}