import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class8 {
   @ObfuscatedName("aj")
   final int field30;
   @ObfuscatedName("al")
   final int field29;
   @ObfuscatedName("ac")
   final String field31;

   @ObfuscatedSignature(
      descriptor = "(Lsy;)V"
   )
   class8(Buffer var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
   }

   class8(int var1, int var2, String var3) {
      this.field30 = var1;
      this.field29 = var2;
      this.field31 = var3;
   }

   @ObfuscatedName("aj")
   String method58() {
      return Integer.toHexString(this.field30) + Integer.toHexString(this.field29) + this.field31;
   }

   @ObfuscatedName("al")
   int method59() {
      return this.field29;
   }
}
