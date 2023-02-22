import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
   @ObfuscatedName("aj")
   @Export("reversed")
   final boolean reversed;

   public UserComparator8(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpt;Lpt;I)I",
      garbageValue = "-870240222"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world) {
         if (var2.world != Client.worldId) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world == Client.worldId) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "643209545"
   )
   public static int method2849(int var0, int var1, int var2) {
      int var3 = class206.method4069(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1768721944"
   )
   static final void method2847() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints == -1) {
            var0.delay = 0;
            class27.method383(var0);
         } else {
            var0.remove();
         }
      }

   }
}
