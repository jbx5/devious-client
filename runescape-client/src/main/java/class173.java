import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class173 {
   @ObfuscatedName("s")
   public String field1875;
   @ObfuscatedName("z")
   public float[] field1880;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1278868647
   )
   public int field1876;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1484170657
   )
   public int field1878;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1927653763
   )
   public int field1879;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   final class166 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfs;)V"
   )
   class173(class166 var1) {
      this.this$0 = var1;
      this.field1880 = new float[4];
      this.field1876 = 1;
      this.field1878 = 1;
      this.field1879 = 0;
   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)I",
      garbageValue = "-182721901"
   )
   @Export("getWidgetFlags")
   static int getWidgetFlags(Widget var0) {
      IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
      return var1 != null ? var1.integer : var0.flags;
   }
}
