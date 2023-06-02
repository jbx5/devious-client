import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class398 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1354356261
   )
   int field4474;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -958339659
   )
   int field4471;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1613220953
   )
   int field4473;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 36361065
   )
   int field4472;

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field4474).length();
      int var3 = 10 - Integer.toString(this.field4473).length();
      int var4 = 10 - Integer.toString(this.field4471).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field4474 + var5 + "Created: " + this.field4471 + var7 + "Total used: " + this.field4473 + var6 + "Max-In-Use: " + this.field4472;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2097430369"
   )
   public static int method7591(int var0, int var1) {
      return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167) & 2047;
   }
}
