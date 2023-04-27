import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
   @ObfuscatedName("vz")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   @Export("platformInfo")
   static PlatformInfo platformInfo;
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator10(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;I)I",
      garbageValue = "-430449272"
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
}
