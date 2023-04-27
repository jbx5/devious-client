import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class8 {
   @ObfuscatedName("af")
   final int field32;
   @ObfuscatedName("an")
   final int field31;
   @ObfuscatedName("aw")
   final String field33;

   @ObfuscatedSignature(
      descriptor = "(Lsg;)V"
   )
   class8(Buffer var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
   }

   class8(int var1, int var2, String var3) {
      this.field32 = var1;
      this.field31 = var2;
      this.field33 = var3;
   }

   @ObfuscatedName("af")
   String method69() {
      return Integer.toHexString(this.field32) + Integer.toHexString(this.field31) + this.field33;
   }

   @ObfuscatedName("an")
   int method65() {
      return this.field31;
   }
}
