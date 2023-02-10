import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
   @ObfuscatedName("c")
   public static short[][] field1435;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("Widget_archive")
   public static AbstractArchive Widget_archive;
   @ObfuscatedName("f")
   @Export("reversed")
   final boolean reversed;

   public UserComparator8(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "528002841"
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
}
