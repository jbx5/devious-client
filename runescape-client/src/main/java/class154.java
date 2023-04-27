import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class154 extends class139 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -6441306749678142509L
   )
   long field1752;
   @ObfuscatedName("an")
   String field1749;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 251537025
   )
   int field1748;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class154(class142 var1) {
      this.this$0 = var1;
      this.field1752 = -1L;
      this.field1749 = null;
      this.field1748 = 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1752 = var1.readLong();
      }

      this.field1749 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1748 = var1.readUnsignedShort();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3299(this.field1752, this.field1749, this.field1748);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lme;I)V",
      garbageValue = "-1214282669"
   )
   public static void method3385(Huffman var0) {
      class319.huffman = var0;
   }
}
