import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class453 extends class455 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -932824093
   )
   int field4794 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 832355601
   )
   int field4798 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -659525431
   )
   int field4795 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 886000043
   )
   int field4793 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -322141147
   )
   int field4797 = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1604089707
   )
   int field4796 = 0;

   public class453(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.field4794 = var1;
      this.field4798 = var2;
      this.field4795 = var3;
      this.field4793 = var4;
      this.field4797 = var5;
      this.field4796 = var6;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2116561795"
   )
   public int vmethod8438() {
      double var1 = this.method8447();
      return (int)Math.round((double)(this.field4793 - this.field4794) * var1 + (double)this.field4794);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2107399454"
   )
   public int vmethod8433() {
      double var1 = this.method8447();
      return (int)Math.round(var1 * (double)(this.field4797 - this.field4798) + (double)this.field4798);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int vmethod8434() {
      double var1 = this.method8447();
      return (int)Math.round((double)this.field4795 + (double)(this.field4796 - this.field4795) * var1);
   }
}
