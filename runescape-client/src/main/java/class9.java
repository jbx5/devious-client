import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class9 implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   public static final class9 field37 = new class9(0, "POST", true, true);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   public static final class9 field33 = new class9(1, "GET", true, false);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   static final class9 field34 = new class9(2, "PUT", false, true);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   static final class9 field35 = new class9(3, "PATCH", false, true);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   static final class9 field36 = new class9(4, "DELETE", false, true);
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1353386787
   )
   int field39;
   @ObfuscatedName("av")
   String field38;
   @ObfuscatedName("aq")
   boolean field41;
   @ObfuscatedName("ap")
   boolean field40;

   class9(int var1, String var2, boolean var3, boolean var4) {
      this.field39 = var1;
      this.field38 = var2;
      this.field41 = var3;
      this.field40 = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field39;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1979721546"
   )
   boolean method62() {
      return this.field41;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1838962601"
   )
   public String method63() {
      return this.field38;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "534305297"
   )
   boolean method64() {
      return this.field40;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ldx;I)V",
      garbageValue = "-2025110230"
   )
   @Export("runScriptEvent")
   public static void runScriptEvent(ScriptEvent var0) {
      class14.runScript(var0, 500000, 475000);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ltw;"
   )
   @Export("newRunException")
   public static RunException newRunException(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.message = var2.message + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }
}
