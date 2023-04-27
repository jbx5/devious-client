import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
   @ObfuscatedName("sb")
   @ObfuscatedSignature(
      descriptor = "Lps;"
   )
   @Export("friendsChat")
   static FriendsChat friendsChat;
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator5(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;I)I",
      garbageValue = "318450924"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0) {
         if (var2.world == 0) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world != 0) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-397121414"
   )
   @Export("addGameMessage")
   static void addGameMessage(int var0, String var1, String var2) {
      class136.addChatMessage(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "(Lnd;Ljava/lang/String;I)V",
      garbageValue = "967968354"
   )
   static void method2920(Archive var0, String var1) {
      ArchiveLoader var2 = new ArchiveLoader(var0, var1);
      Client.archiveLoaders.add(var2);
      Client.field529 += var2.groupCount;
   }
}
