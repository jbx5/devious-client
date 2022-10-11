import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public abstract class class151 extends Node {
   class151() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "85"
   )
   abstract void vmethod3238(Buffer var1);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)V",
      garbageValue = "-1303116736"
   )
   abstract void vmethod3239(ClanChannel var1);

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1802358692"
   )
   static boolean method3180(int var0) {
      for(int var1 = 0; var1 < Client.field679; ++var1) {
         if (Client.field737[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
