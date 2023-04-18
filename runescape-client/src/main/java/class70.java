import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class70 {
   @ObfuscatedName("af")
   static final BigInteger field885 = new BigInteger("10001", 16);
   @ObfuscatedName("an")
   static final BigInteger field887 = new BigInteger("caa2a7bee781b3652a5a550b5318cb074141ad9dbd06389622fbd58a3947aeb27e79771809fb6e20de92d7cdbe34830805ebad9bb17640a45878eea57edbb1d808a6122150c097b7a4960054ccc5e98fc0a139709f6f1a3dbf0bfc4559d63ba568b3860a7d477756bd21bb37f989b4522af2d3ee6af1781654acbafd740072c1", 16);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   @Export("loginType")
   static LoginType loginType;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "698228402"
   )
   public static int method2044(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIII)D",
      garbageValue = "-426403722"
   )
   static double method2045(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0;
      if (!(var3 <= 0.0) && !(var3 >= 1.0)) {
         double var5;
         double var7;
         switch (var2) {
            case 0:
               return var3;
            case 1:
               return 1.0 - Math.cos(Math.PI * var3 / 2.0);
            case 2:
               return Math.sin(var3 * Math.PI / 2.0);
            case 3:
               return -(Math.cos(var3 * Math.PI) - 1.0) / 2.0;
            case 4:
               return var3 * var3;
            case 5:
               return 1.0 - (1.0 - var3) * (1.0 - var3);
            case 6:
               return var3 < 0.5 ? var3 * var3 * 2.0 : 1.0 - Math.pow(2.0 + var3 * -2.0, 2.0) / 2.0;
            case 7:
               return var3 * var3 * var3;
            case 8:
               return 1.0 - Math.pow(1.0 - var3, 3.0);
            case 9:
               return var3 < 0.5 ? 4.0 * var3 * var3 * var3 : 1.0 - Math.pow(2.0 + -2.0 * var3, 3.0) / 2.0;
            case 10:
               return var3 * var3 * var3 * var3;
            case 11:
               return 1.0 - Math.pow(1.0 - var3, 4.0);
            case 12:
               return var3 < 0.5 ? var3 * var3 * var3 * var3 * 8.0 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 4.0) / 2.0;
            case 13:
               return var3 * var3 * var3 * var3 * var3;
            case 14:
               return 1.0 - Math.pow(1.0 - var3, 5.0);
            case 15:
               return var3 < 0.5 ? var3 * var3 * var3 * 8.0 * var3 * var3 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 5.0) / 2.0;
            case 16:
               return Math.pow(2.0, var3 * 10.0 - 10.0);
            case 17:
               return 1.0 - Math.pow(2.0, var3 * -10.0);
            case 18:
               return var3 < 0.5 ? Math.pow(2.0, 20.0 * var3 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, 10.0 + var3 * -20.0)) / 2.0;
            case 19:
               return 1.0 - Math.sqrt(1.0 - Math.pow(var3, 2.0));
            case 20:
               return Math.sqrt(1.0 - Math.pow(var3 - 1.0, 2.0));
            case 21:
               return var3 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var3, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * var3, 2.0)) + 1.0) / 2.0;
            case 22:
               var5 = 1.70158;
               var7 = 2.70158;
               return var3 * 2.70158 * var3 * var3 - 1.70158 * var3 * var3;
            case 23:
               var5 = 1.70158;
               var7 = 2.70158;
               return 1.0 + 2.70158 * Math.pow(var3 - 1.0, 3.0) + 1.70158 * Math.pow(var3 - 1.0, 2.0);
            case 24:
               var5 = 1.70158;
               var7 = 2.5949095;
               return var3 < 0.5 ? Math.pow(2.0 * var3, 2.0) * (7.189819 * var3 - 2.5949095) / 2.0 : (Math.pow(var3 * 2.0 - 2.0, 2.0) * (2.5949095 + (var3 * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0;
            case 25:
               var5 = 2.0943951023931953;
               return -Math.pow(2.0, var3 * 10.0 - 10.0) * Math.sin((10.0 * var3 - 10.75) * 2.0943951023931953);
            case 26:
               var5 = 2.0943951023931953;
               return Math.pow(2.0, -10.0 * var3) * Math.sin((var3 * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            case 27:
               var5 = 1.3962634015954636;
               var7 = Math.sin((20.0 * var3 - 11.125) * 1.3962634015954636);
               return var3 < 0.5 ? -(Math.pow(2.0, var3 * 20.0 - 10.0) * var7) / 2.0 : Math.pow(2.0, -20.0 * var3 + 10.0) * var7 / 2.0 + 1.0;
            default:
               return var3;
         }
      } else {
         return var3 <= 0.0 ? 0.0 : 1.0;
      }
   }
}
