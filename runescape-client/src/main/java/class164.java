import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class164 extends class140 {
   @ObfuscatedName("ae")
   @Export("cacheParentPaths")
   static String[] cacheParentPaths;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 95186683
   )
   int field1779;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = 3563919649523510515L
   )
   long field1778;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class164(class143 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1779 = var1.readInt();
      this.field1778 = var1.readLong();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3210(this.field1779, this.field1778);
   }
}
