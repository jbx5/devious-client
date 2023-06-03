import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("at")
   @Export("reversed")
   final boolean reversed;

   public BuddyRankComparator(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqg;Lqg;B)I",
      garbageValue = "13"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.rank != var1.rank) {
         return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lmb;I)Ljava/lang/String;",
      garbageValue = "-745287011"
   )
   static String method2892(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = ClanChannelMember.method3137(var1, var2 - 1);
               String var5;
               if (var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("nc")
   @ObfuscatedSignature(
      descriptor = "(Lmb;B)Ljava/lang/String;",
      garbageValue = "-40"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
