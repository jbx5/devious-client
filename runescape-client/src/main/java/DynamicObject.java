import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bc")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1992615399)
    @Export("id")
    int id;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1317067285)
    @Export("type")
    int type;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -206062303)
    @Export("orientation")
    int orientation;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 957350903)
    @Export("plane")
    int plane;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -713175869)
    @Export("x")
    int x;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -210754635)
    @Export("y")
    int y;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lgm;")
    @Export("sequenceDefinition")
    SequenceDefinition sequenceDefinition;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1627064681)
    @Export("frame")
    int frame;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -1083644335)
    @Export("cycleStart")
    int cycleStart;

    @ObfuscatedSignature(descriptor = "(IIIIIIIZLgp;)V")
    DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
        this.id = var1;
        this.type = var2;
        this.orientation = var3;
        this.plane = var4;
        this.x = var5;
        this.y = var6;
        if (var7 != (-1)) {
            this.sequenceDefinition = class78.SequenceDefinition_get(var7);
            this.frame = 0;
            this.cycleStart = Client.cycle - 1;
            if (((this.sequenceDefinition.field2109 == 0) && (var9 != null)) && (var9 instanceof DynamicObject)) {
                DynamicObject var10 = ((DynamicObject) (var9));
                if (this.sequenceDefinition == var10.sequenceDefinition) {
                    this.frame = var10.frame;
                    this.cycleStart = var10.cycleStart;
                    return;
                }
            }
            if (var8 && (this.sequenceDefinition.frameCount != (-1))) {
                if (!this.sequenceDefinition.isCachedModelIdSet()) {
                    this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.frameIds.length))));
                    this.cycleStart -= ((int) (Math.random() * ((double) (this.sequenceDefinition.frameLengths[this.frame]))));
                } else {
                    this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.method3637()))));
                }
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)Lgf;", garbageValue = "39")
    @Export("getModel")
    protected final Model getModel() {
        int var2;
        if (this.sequenceDefinition != null) {
            int var1 = Client.cycle - this.cycleStart;
            if ((var1 > 100) && (this.sequenceDefinition.frameCount > 0)) {
                var1 = 100;
            }
            if (this.sequenceDefinition.isCachedModelIdSet()) {
                var2 = this.sequenceDefinition.method3637();
                this.frame += var1;
                var1 = 0;
                if (this.frame >= var2) {
                    this.frame = var2 - this.sequenceDefinition.frameCount;
                    if ((this.frame < 0) || (this.frame > var2)) {
                        this.sequenceDefinition = null;
                    }
                }
            } else {
                label82 : {
                    do {
                        do {
                            if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
                                break label82;
                            }
                            var1 -= this.sequenceDefinition.frameLengths[this.frame];
                            ++this.frame;
                        } while (this.frame < this.sequenceDefinition.frameIds.length );
                        this.frame -= this.sequenceDefinition.frameCount;
                    } while ((this.frame >= 0) && (this.frame < this.sequenceDefinition.frameIds.length) );
                    this.sequenceDefinition = null;
                }
            }
            this.cycleStart = Client.cycle - var1;
        }
        ObjectComposition var12 = ParamComposition.getObjectDefinition(this.id);
        if (var12.transforms != null) {
            var12 = var12.transform();
        }
        if (var12 == null) {
            return null;
        } else {
            int var3;
            if ((this.orientation != 1) && (this.orientation != 3)) {
                var2 = var12.sizeX;
                var3 = var12.sizeY;
            } else {
                var2 = var12.sizeY;
                var3 = var12.sizeX;
            }
            int var4 = (var2 >> 1) + this.x;
            int var5 = ((var2 + 1) >> 1) + this.x;
            int var6 = (var3 >> 1) + this.y;
            int var7 = ((var3 + 1) >> 1) + this.y;
            int[][] var8 = Tiles.Tiles_heights[this.plane];
            int var9 = (((var8[var4][var7] + var8[var4][var6]) + var8[var5][var6]) + var8[var5][var7]) >> 2;
            int var10 = (this.x << 7) + (var2 << 6);
            int var11 = (this.y << 7) + (var3 << 6);
            return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;IIB)Llv;", garbageValue = "15")
    public static Font method1996(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
        return !class125.method2744(var0, var2, var3) ? null : Clock.method3125(var1.takeFile(var2, var3));
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-911650493")
    static void method1998() {
        if ((Login.Login_username == null) || (Login.Login_username.length() <= 0)) {
            if (class424.clientPreferences.rememberedUsername != null) {
                Login.Login_username = class424.clientPreferences.rememberedUsername;
                Client.Login_isUsernameRemembered = true;
            } else {
                Client.Login_isUsernameRemembered = false;
            }
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Ljz;II)V", garbageValue = "-1250618442")
    @Export("Widget_setKeyIgnoreHeld")
    static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
        if (var0.field3339 == null) {
            throw new RuntimeException();
        } else {
            if (var0.field3254 == null) {
                var0.field3254 = new int[var0.field3339.length];
            }
            var0.field3254[var1] = Integer.MAX_VALUE;
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "1245279724")
    @Export("isCharPrintable")
    public static boolean isCharPrintable(char var0) {
        if ((var0 >= ' ') && (var0 <= '~')) {
            return true;
        } else if ((var0 >= 160) && (var0 <= 255)) {
            return true;
        } else {
            return ((((var0 == 8364) || (var0 == 338)) || (var0 == 8212)) || (var0 == 339)) || (var0 == 376);
        }
    }
}