import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class140 extends class139 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 562761175
   )
   int field1647;
   @ObfuscatedName("an")
   boolean field1646;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class140(class142 var1) {
      this.this$0 = var1;
      this.field1647 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1647 = var1.readUnsignedShort();
      this.field1646 = var1.readUnsignedByte() == 1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3313(this.field1647, this.field1646);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "81"
   )
   public static int method3220(int var0) {
      return class295.field3369[var0];
   }
}
