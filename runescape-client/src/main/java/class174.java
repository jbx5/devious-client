import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class174 extends class177 {
   @ObfuscatedName("hz")
   @Export("secureRandom")
   static SecureRandom secureRandom;
   @ObfuscatedName("kv")
   @ObfuscatedGetter(
      intValue = 1772923873
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1898005083
   )
   int field1864;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgy;"
   )
   final class166 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgy;Ljava/lang/String;I)V"
   )
   class174(class166 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1864 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-41"
   )
   public int vmethod3607() {
      return 0;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "421671702"
   )
   public int vmethod3608() {
      return this.field1864;
   }
}
