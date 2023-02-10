import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class144 extends class139 {
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -214710763
   )
   int field1679;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 89085259
   )
   int field1674;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1840054739
   )
   int field1676;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 432447909
   )
   int field1677;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class144(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1679 = var1.readInt();
      this.field1677 = var1.readInt();
      this.field1674 = var1.readUnsignedByte();
      this.field1676 = var1.readUnsignedByte();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3240(this.field1679, this.field1677, this.field1674, this.field1676);
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "-1463294808"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class153.loadInterface(var0)) {
         class85.updateInterface(WorldMapLabel.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
