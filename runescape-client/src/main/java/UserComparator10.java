import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
   @ObfuscatedName("jf")
   @ObfuscatedGetter(
      intValue = 2114297915
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = -846038315
   )
   @Export("oculusOrbFocalPointY")
   static int oculusOrbFocalPointY;
   @ObfuscatedName("f")
   @Export("reversed")
   final boolean reversed;

   public UserComparator10(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "1557178098"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world && var2.world == Client.worldId) {
         return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgq;",
      garbageValue = "61"
   )
   @Export("getEnum")
   public static EnumComposition getEnum(int var0) {
      EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
         var1 = new EnumComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
