import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class8 {
   @ObfuscatedName("a")
   final int field36;
   @ObfuscatedName("f")
   final int field35;
   @ObfuscatedName("c")
   final String field37;

   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   class8(Buffer var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
   }

   class8(int var1, int var2, String var3) {
      this.field36 = var1;
      this.field35 = var2;
      this.field37 = var3;
   }

   @ObfuscatedName("a")
   String method52() {
      return Integer.toHexString(this.field36) + Integer.toHexString(this.field35) + this.field37;
   }

   @ObfuscatedName("f")
   int method54() {
      return this.field35;
   }
}
