import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class85 {
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      descriptor = "Ldo;"
   )
   @Export("mouseRecorder")
   static MouseRecorder mouseRecorder;
   @ObfuscatedName("un")
   @ObfuscatedGetter(
      intValue = -2102251341
   )
   static int field1044;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BILjava/lang/CharSequence;I)I",
      garbageValue = "-1165374649"
   )
   public static int method2241(byte[] var0, int var1, CharSequence var2) {
      int var3 = var2.length();
      int var4 = var1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var2.charAt(var5);
         if (var6 <= 127) {
            var0[var4++] = (byte)var6;
         } else if (var6 <= 2047) {
            var0[var4++] = (byte)(192 | var6 >> 6);
            var0[var4++] = (byte)(128 | var6 & 63);
         } else {
            var0[var4++] = (byte)(224 | var6 >> 12);
            var0[var4++] = (byte)(128 | var6 >> 6 & 63);
            var0[var4++] = (byte)(128 | var6 & 63);
         }
      }

      return var4 - var1;
   }
}
