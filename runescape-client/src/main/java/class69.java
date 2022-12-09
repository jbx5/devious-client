import java.awt.Image;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class69 {
   @ObfuscatedName("m")
   static final BigInteger field889 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("q")
   static final BigInteger field887 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   @ObfuscatedName("ay")
   static Image field892;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "-2063697993"
   )
   static SecureRandom method2031() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      descriptor = "(Lkd;B)V",
      garbageValue = "55"
   )
   @Export("invalidateWidget")
   public static void invalidateWidget(Widget var0) {
      if (var0 != null && var0.cycle == Client.field808) {
         Client.field731[var0.rootIndex] = true;
      }

   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   @Export("Widget_resetModelFrames")
   static final void Widget_resetModelFrames(int var0) {
      if (Players.loadInterface(var0)) {
         Widget[] var1 = class71.Widget_interfaceComponents[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }

      }
   }
}
