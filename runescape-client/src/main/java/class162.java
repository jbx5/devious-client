import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class162 extends class173 {
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive6")
   static Archive archive6;
   @ObfuscatedName("h")
   String field1823;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   final class163 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfk;Ljava/lang/String;Ljava/lang/String;)V"
   )
   class162(class163 var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1823 = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "16"
   )
   public int vmethod3504() {
      return 1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "380048809"
   )
   public String vmethod3505() {
      return this.field1823;
   }
}
