import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class151 extends class136 {
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   static Bounds field1763;
   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -1587606096227734853L
   )
   long field1767;
   @ObfuscatedName("e")
   String field1760;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -976971951
   )
   int field1761;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class151(class139 var1) {
      this.this$0 = var1;
      this.field1767 = -1L;
      this.field1760 = null;
      this.field1761 = 0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1767 = var1.readLong();
      }

      this.field1760 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1761 = var1.readUnsignedShort();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3210(this.field1767, this.field1760, this.field1761);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;B)V",
      garbageValue = "116"
   )
   public static void method3273(AbstractArchive var0) {
   }
}
