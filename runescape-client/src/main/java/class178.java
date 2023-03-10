import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public abstract class class178 {
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = 1631893913
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("ab")
   String field1860;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   final class167 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgs;Ljava/lang/String;)V"
   )
   class178(class167 var1, String var2) {
      this.this$0 = var1;
      this.field1860 = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "30"
   )
   public abstract int vmethod3513();

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "217789139"
   )
   public String vmethod3511() {
      return null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1836009680"
   )
   public int vmethod3515() {
      return -1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-52"
   )
   public String method3514() {
      return this.field1860;
   }
}
