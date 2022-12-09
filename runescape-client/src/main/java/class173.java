import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public abstract class class173 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -389562639
   )
   @Export("gameCyclesToDo")
   static int gameCyclesToDo;
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("clientLanguage")
   static Language clientLanguage;
   @ObfuscatedName("x")
   String field1900;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   final class163 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfk;Ljava/lang/String;)V"
   )
   class173(class163 var1, String var2) {
      this.this$0 = var1;
      this.field1900 = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "16"
   )
   public abstract int vmethod3504();

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "380048809"
   )
   public String vmethod3505() {
      return null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-736426895"
   )
   public int vmethod3511() {
      return -1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1768788528"
   )
   public String method3503() {
      return this.field1900;
   }
}
