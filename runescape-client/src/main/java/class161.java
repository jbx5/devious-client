import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class161 extends class172 {
   @ObfuscatedName("a")
   String field1763;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lft;"
   )
   final class162 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lft;Ljava/lang/String;Ljava/lang/String;)V"
   )
   class161(class162 var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1763 = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1797995166"
   )
   public int vmethod3379() {
      return 1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1778696968"
   )
   public String vmethod3380() {
      return this.field1763;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "1811399890"
   )
   static char method3268(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }
}
