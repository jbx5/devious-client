import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class373 {
   @ObfuscatedName("in")
   @ObfuscatedGetter(
      intValue = -569629553
   )
   static int field4406;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 419940411
   )
   int field4407;

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class373(int var1, boolean var2) {
      this.field4407 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-32"
   )
   public int method7186() {
      return this.field4407;
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1754373528"
   )
   static final void method7183(boolean var0) {
      if (var0) {
         Client.field535 = Login.field930 ? class135.field1623 : class135.field1625;
      } else {
         Client.field535 = PacketWriter.clientPreferences.method2507(Login.Login_username) ? class135.field1626 : class135.field1624;
      }

   }
}
