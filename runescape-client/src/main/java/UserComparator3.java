import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("d")
   @Export("userHomeDirectory")
   public static String userHomeDirectory;
   @ObfuscatedName("h")
   @Export("reversed")
   final boolean reversed;

   public UserComparator3(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "-1236968818"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.world != var1.world) {
         return this.reversed ? var1.world - var2.world : var2.world - var1.world;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lgd;",
      garbageValue = "1513245443"
   )
   @Export("StructDefinition_getStructDefinition")
   public static StructComposition StructDefinition_getStructDefinition(int var0) {
      StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
         var1 = new StructComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         StructComposition.StructDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "110"
   )
   static void method2848() {
      if (Client.renderSelf) {
         WorldMapAreaData.addPlayerToScene(class155.localPlayer, false);
      }

   }
}
