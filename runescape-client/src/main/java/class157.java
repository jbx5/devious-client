import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class157 extends class139 {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   @Export("pcmPlayerProvider")
   public static class50 pcmPlayerProvider;
   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("hoveredItemContainer")
   static Widget hoveredItemContainer;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1708644211
   )
   int field1779;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 111706787
   )
   int field1777;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class157(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1779 = var1.readInt();
      this.field1777 = var1.readInt();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3234(this.field1779, this.field1777);
   }
}
