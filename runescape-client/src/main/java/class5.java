import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class5 implements class2 {
   @ObfuscatedName("aj")
   final MessageDigest field11 = this.method20();

   @ObfuscatedSignature(
      descriptor = "(Lap;)V"
   )
   class5(class8 var1) {
   }

   @ObfuscatedName("aj")
   boolean method16(int var1, String var2, long var3) {
      byte[] var5 = this.method19(var2, var3);
      return method17(var5) >= var1;
   }

   @ObfuscatedName("ab")
   byte[] method19(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field11.reset();

      try {
         this.field11.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field11.digest();
   }

   @ObfuscatedName("an")
   MessageDigest method20() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ObfuscatedName("al")
   static int method17(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         byte var4 = var2[var3];
         int var5 = method28(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfuscatedName("ac")
   static int method28(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for(int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            ++var1;
         }
      }

      return var1;
   }
}
