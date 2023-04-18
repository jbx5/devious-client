import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oo")
public class class385 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -637669769
   )
   int field4459;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -124524353
   )
   int field4461;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1468527107
   )
   int field4460;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1354689229
   )
   int field4458;

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field4459).length();
      int var3 = 10 - Integer.toString(this.field4460).length();
      int var4 = 10 - Integer.toString(this.field4461).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field4459 + var5 + "Created: " + this.field4461 + var7 + "Total used: " + this.field4460 + var6 + "Max-In-Use: " + this.field4458;
   }
}
