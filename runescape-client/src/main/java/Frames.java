import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("gu")
@Implements("Frames")
public class Frames extends DualNode {
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    public static AbstractArchive field2379;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 1948507169)
    static int field2377;

    @ObfuscatedName("av")
    @Export("fontHelvetica13")
    static java.awt.Font fontHelvetica13;

    @ObfuscatedName("il")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("modIconSprites")
    static IndexedSprite[] modIconSprites;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "[Lge;")
    @Export("frames")
    Animation[] frames;

    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;IZ)V", garbageValue = "0")
    public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
        NodeDeque var5 = new NodeDeque();
        int var6 = var1.getGroupFileCount(var3);
        this.frames = new Animation[var6];
        int[] var7 = var1.getGroupFileIds(var3);
        for (int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.takeFile(var3, var7[var8]);
            Skeleton var10 = null;
            int var11 = ((var9[0] & 255) << 8) | (var9[1] & 255);
            for (Skeleton var12 = ((Skeleton) (var5.last())); var12 != null; var12 = ((Skeleton) (var5.previous()))) {
                if (var11 == var12.id) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13 = var2.getFile(var11, 0);
                var10 = new Skeleton(var11, var13);
                var5.addFirst(var10);
            }
            this.frames[var7[var8]] = new Animation(var9, var10);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-1224868018")
    @Export("hasAlphaTransform")
    public boolean hasAlphaTransform(int var1) {
        return this.frames[var1].hasAlphaTransform;
    }

    @ObfuscatedName("lu")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-1045407302")
    static void method4098(Buffer var0, int var1) {
        byte[] var2 = var0.array;
        if (Client.randomDatData == null) {
            Client.randomDatData = new byte[24];
        }
        class338.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
        if (JagexCache.JagexCache_randomDat != null) {
            try {
                JagexCache.JagexCache_randomDat.seek(0L);
                JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
            } catch (Exception var4) {
            }
        }
    }
}