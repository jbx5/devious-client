import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class169 extends class172 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1787613319
   )
   int field1826;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lft;"
   )
   final class162 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lft;Ljava/lang/String;I)V"
   )
   class169(class162 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1826 = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1797995166"
   )
   public int vmethod3379() {
      return 0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1317234476"
   )
   public int vmethod3378() {
      return this.field1826;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Llg;II)Z",
      garbageValue = "-91991866"
   )
   static boolean method3362(AbstractArchive var0, int var1) {
      byte[] var2 = var0.takeFileFlat(var1);
      if (var2 == null) {
         return false;
      } else {
         class335.SpriteBuffer_decode(var2);
         return true;
      }
   }
}
