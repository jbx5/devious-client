import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class168 {
   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("hoveredItemContainer")
   static Widget hoveredItemContainer;
   @ObfuscatedName("x")
   public String field1818;
   @ObfuscatedName("h")
   public float[] field1816;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -2089790825
   )
   public int field1820;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1039343049
   )
   public int field1821;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -964308241
   )
   public int field1822;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lft;"
   )
   final class162 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lft;)V"
   )
   class168(class162 var1) {
      this.this$0 = var1;
      this.field1816 = new float[4];
      this.field1820 = 1;
      this.field1821 = 1;
      this.field1822 = 0;
   }
}
