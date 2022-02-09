import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kn")
public class class293 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkn;")
    static final class293 field3485;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkn;")
    static final class293 field3483;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 796657837)
    final int field3484;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 494317377)
    final int field3482;

    static {
        field3485 = new class293(51, 27, 800, 0, 16, 16);
        field3483 = new class293(25, 28, 800, 656, 40, 40);
    }

    class293(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.field3484 = var5;
        this.field3482 = var6;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Lfy;", garbageValue = "606619398")
    public static HitSplatDefinition method5480(int var0) {
        HitSplatDefinition var1 = ((HitSplatDefinition) (HitSplatDefinition.HitSplatDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
            var1 = new HitSplatDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            HitSplatDefinition.HitSplatDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-657313045")
    static int method5482(int var0, int var1, int var2) {
        if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
            return 0;
        } else {
            return (var0 > 0) && ((Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0) ? var0 - 1 : var0;
        }
    }

    @ObfuscatedName("gq")
    @ObfuscatedSignature(descriptor = "(Lcq;B)V", garbageValue = "1")
    static final void method5481(Actor var0) {
        var0.isWalking = false;
        SequenceDefinition var1;
        int var2;
        if (var0.movementSequence != (-1)) {
            var1 = class78.SequenceDefinition_get(var0.movementSequence);
            if (var1 != null) {
                if ((!var1.isCachedModelIdSet()) && (var1.frameIds != null)) {
                    ++var0.movementFrameCycle;
                    if ((var0.movementFrame < var1.frameIds.length) && (var0.movementFrameCycle > var1.frameLengths[var0.movementFrame])) {
                        var0.movementFrameCycle = 1;
                        ++var0.movementFrame;
                        Projectile.method1958(var1, var0.movementFrame, var0.x, var0.y);
                    }
                    if (var0.movementFrame >= var1.frameIds.length) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        Projectile.method1958(var1, var0.movementFrame, var0.x, var0.y);
                    }
                } else if (var1.isCachedModelIdSet()) {
                    ++var0.movementFrame;
                    var2 = var1.method3637();
                    if (var0.movementFrame < var2) {
                        class333.method6126(var1, var0.movementFrame, var0.x, var0.y);
                    } else {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        class333.method6126(var1, var0.movementFrame, var0.x, var0.y);
                    }
                } else {
                    var0.movementSequence = -1;
                }
            } else {
                var0.movementSequence = -1;
            }
        }
        if ((var0.spotAnimation != (-1)) && (Client.cycle >= var0.field1177)) {
            if (var0.spotAnimationFrame < 0) {
                var0.spotAnimationFrame = 0;
            }
            int var4 = Widget.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
            if (var4 != (-1)) {
                SequenceDefinition var5 = class78.SequenceDefinition_get(var4);
                if ((var5 != null) && (var5.frameIds != null)) {
                    ++var0.spotAnimationFrameCycle;
                    if ((var0.spotAnimationFrame < var5.frameIds.length) && (var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame])) {
                        var0.spotAnimationFrameCycle = 1;
                        ++var0.spotAnimationFrame;
                        Projectile.method1958(var5, var0.spotAnimationFrame, var0.x, var0.y);
                    }
                    if ((var0.spotAnimationFrame >= var5.frameIds.length) && ((var0.spotAnimationFrame < 0) || (var0.spotAnimationFrame >= var5.frameIds.length))) {
                        var0.spotAnimation = -1;
                    }
                } else if (var5.isCachedModelIdSet()) {
                    ++var0.spotAnimationFrame;
                    int var3 = var5.method3637();
                    if (var0.spotAnimationFrame < var3) {
                        class333.method6126(var5, var0.spotAnimationFrame, var0.x, var0.y);
                    } else if ((var0.spotAnimationFrame < 0) || (var0.spotAnimationFrame >= var3)) {
                        var0.spotAnimation = -1;
                    }
                } else {
                    var0.spotAnimation = -1;
                }
            } else {
                var0.spotAnimation = -1;
            }
        }
        if ((var0.sequence != (-1)) && (var0.sequenceDelay <= 1)) {
            var1 = class78.SequenceDefinition_get(var0.sequence);
            if ((((var1.field2107 == 1) && (var0.field1176 > 0)) && (var0.field1157 <= Client.cycle)) && (var0.field1158 < Client.cycle)) {
                var0.sequenceDelay = 1;
                return;
            }
        }
        if ((var0.sequence != (-1)) && (var0.sequenceDelay == 0)) {
            var1 = class78.SequenceDefinition_get(var0.sequence);
            if (var1 != null) {
                if ((!var1.isCachedModelIdSet()) && (var1.frameIds != null)) {
                    ++var0.sequenceFrameCycle;
                    if ((var0.sequenceFrame < var1.frameIds.length) && (var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame])) {
                        var0.sequenceFrameCycle = 1;
                        ++var0.sequenceFrame;
                        Projectile.method1958(var1, var0.sequenceFrame, var0.x, var0.y);
                    }
                    if (var0.sequenceFrame >= var1.frameIds.length) {
                        var0.sequenceFrame -= var1.frameCount;
                        ++var0.field1129;
                        if (var0.field1129 >= var1.field2108) {
                            var0.sequence = -1;
                        } else if ((var0.sequenceFrame >= 0) && (var0.sequenceFrame < var1.frameIds.length)) {
                            Projectile.method1958(var1, var0.sequenceFrame, var0.x, var0.y);
                        } else {
                            var0.sequence = -1;
                        }
                    }
                    var0.isWalking = var1.field2102;
                } else if (var1.isCachedModelIdSet()) {
                    ++var0.sequenceFrame;
                    var2 = var1.method3602().method2693();
                    if (var0.sequenceFrame < var2) {
                        class333.method6126(var1, var0.sequenceFrame, var0.x, var0.y);
                    } else {
                        var0.sequenceFrame -= var1.frameCount;
                        ++var0.field1129;
                        if (var0.field1129 >= var1.field2108) {
                            var0.sequence = -1;
                        } else if ((var0.sequenceFrame >= 0) && (var0.sequenceFrame < var2)) {
                            class333.method6126(var1, var0.sequenceFrame, var0.x, var0.y);
                        } else {
                            var0.sequence = -1;
                        }
                    }
                } else {
                    var0.sequence = -1;
                }
            } else {
                var0.sequence = -1;
            }
        }
        if (var0.sequenceDelay > 0) {
            --var0.sequenceDelay;
        }
    }
}