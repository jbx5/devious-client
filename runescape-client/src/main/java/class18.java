import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class18 {
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "[Lqp;"
   )
   @Export("JagexCache_idxFiles")
   public static BufferedFile[] JagexCache_idxFiles;
   @ObfuscatedName("gl")
   static int[] field99;
   @ObfuscatedName("oq")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   static Widget field102;
   @ObfuscatedName("f")
   Future field100;
   @ObfuscatedName("w")
   String field103;

   class18(Future var1) {
      this.field100 = var1;
   }

   class18(String var1) {
      this.method276(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "13"
   )
   void method276(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field103 = var1;
      if (this.field100 != null) {
         this.field100.cancel(true);
         this.field100 = null;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "17"
   )
   public final String method277() {
      return this.field103;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "125"
   )
   public boolean method282() {
      return this.field103 != null || this.field100 == null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2116375793"
   )
   public final boolean method279() {
      return this.method282() ? true : this.field100.isDone();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)La;",
      garbageValue = "-1250642886"
   )
   public final class20 method280() {
      if (this.method282()) {
         return new class20(this.field103);
      } else if (!this.method279()) {
         return null;
      } else {
         try {
            return (class20)this.field100.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.method276(var2);
            return new class20(var2);
         }
      }
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2146984996"
   )
   @Export("Widget_runOnTargetLeave")
   static void Widget_runOnTargetLeave() {
      if (Client.isSpellSelected) {
         Widget var0 = class135.getWidgetChild(class9.selectedSpellWidget, Client.selectedSpellChildIndex);
         if (var0 != null && var0.onTargetLeave != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.widget = var0;
            var1.args = var0.onTargetLeave;
            WorldMapAreaData.runScriptEvent(var1);
         }

         Client.selectedSpellItemId = -1;
         Client.isSpellSelected = false;
         LoginScreenAnimation.invalidateWidget(var0);
      }
   }
}
