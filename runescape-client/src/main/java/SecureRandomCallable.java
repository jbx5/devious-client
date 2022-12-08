import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;

   SecureRandomCallable() {
   }

   public Object call() {
      return class69.method2031();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IB)Lha;",
      garbageValue = "6"
   )
   @Export("getFrames")
   static Frames getFrames(int var0) {
      Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
         AbstractArchive var4 = BuddyRankComparator.SequenceDefinition_skeletonsArchive;
         boolean var5 = true;
         int[] var6 = var3.getGroupFileIds(var0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.getFile(var0, var6[var7]);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.getFile(var9, 0);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         Frames var2;
         if (!var5) {
            var2 = null;
         } else {
            try {
               var2 = new Frames(var3, var4, var0, false);
            } catch (Exception var12) {
               var2 = null;
            }
         }

         if (var2 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
         }

         return var2;
      }
   }
}
