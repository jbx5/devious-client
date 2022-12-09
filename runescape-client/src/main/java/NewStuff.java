import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class NewStuff {
   @ObfuscatedName("g")
   public static short[] field2017;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lld;"
   )
   @Export("NetCache_currentResponse")
   public static NetFileRequest NetCache_currentResponse;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -9039616709688449403L
   )
   public long field2018;
   @ObfuscatedName("e")
   int[] field2013;
   @ObfuscatedName("v")
   short[] field2015;
   @ObfuscatedName("x")
   short[] field2016;

   public NewStuff(long var1, int[] var3, short[] var4, short[] var5) {
      this.field2018 = var1;
      this.field2013 = var3;
      this.field2015 = var4;
      this.field2016 = var5;
   }
}
