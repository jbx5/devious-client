import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class8 {
   @ObfuscatedName("at")
   final int field27;
   @ObfuscatedName("an")
   final int field28;
   @ObfuscatedName("av")
   final String field29;

   @ObfuscatedSignature(
      descriptor = "(Ltz;)V"
   )
   class8(Buffer var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
   }

   class8(int var1, int var2, String var3) {
      this.field27 = var1;
      this.field28 = var2;
      this.field29 = var3;
   }

   @ObfuscatedName("at")
   String method55() {
      return Integer.toHexString(this.field27) + Integer.toHexString(this.field28) + this.field29;
   }

   @ObfuscatedName("an")
   int method61() {
      return this.field28;
   }
}
