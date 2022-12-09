import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public final class class317 {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1457607137"
   )
   static final void method6371(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      Object var10001 = null;
      String var1 = var10000.append(" is already on your ignore list").toString();
      KitDefinition.addGameMessage(30, "", var1);
   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      descriptor = "(Lkd;Lgr;IIZS)V",
      garbageValue = "229"
   )
   @Export("addWidgetItemMenuItem")
   static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.inventoryActions;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         class37.insertMenuItem(var7, MouseRecorder.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4);
      }

   }
}
