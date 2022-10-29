import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
class class380 implements Comparator {
   @ObfuscatedName("ph")
   @ObfuscatedGetter(
      intValue = 2044611391
   )
   static int field4439;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   final class381 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lnb;)V"
   )
   class380(class381 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lng;Lng;B)I",
      garbageValue = "54"
   )
   int method7202(class382 var1, class382 var2) {
      if (var1.field4451 > var2.field4451) {
         return 1;
      } else {
         return var1.field4451 < var2.field4451 ? -1 : 0;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method7202((class382)var1, (class382)var2);
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IB)Ljava/lang/String;",
      garbageValue = "69"
   )
   static String method7205(Widget var0, int var1) {
      int var3 = class197.getWidgetFlags(var0);
      boolean var2 = (var3 >> var1 + 1 & 1) != 0;
      if (!var2 && var0.onOp == null) {
         return null;
      } else {
         return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
      }
   }
}
