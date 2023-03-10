import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class137 extends class140 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1725738051
   )
   int field1605;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1808263
   )
   int field1602;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1958108075
   )
   int field1601;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1879712205
   )
   int field1603;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class137(class143 var1) {
      this.this$0 = var1;
      this.field1605 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1605 = var1.readUnsignedShort();
      this.field1602 = var1.readInt();
      this.field1601 = var1.readUnsignedByte();
      this.field1603 = var1.readUnsignedByte();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3200(this.field1605, this.field1602, this.field1601, this.field1603);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "951788277"
   )
   public static void method3086(AbstractArchive var0) {
      StructComposition.StructDefinition_archive = var0;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1523830717"
   )
   static final int method3080(int var0, int var1) {
      int var2 = class11.method102(var0 - 1, var1 - 1) + class11.method102(1 + var0, var1 - 1) + class11.method102(var0 - 1, 1 + var1) + class11.method102(var0 + 1, var1 + 1);
      int var3 = class11.method102(var0 - 1, var1) + class11.method102(1 + var0, var1) + class11.method102(var0, var1 - 1) + class11.method102(var0, var1 + 1);
      int var4 = class11.method102(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
