import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hs")
@Implements("NewStuff")
public class NewStuff {
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 354011115
   )
   @Export("menuY")
   static int menuY;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = 1293909845241469211L
   )
   public long field1989;
   @ObfuscatedName("an")
   int[] field1987;
   @ObfuscatedName("av")
   short[] field1988;
   @ObfuscatedName("as")
   short[] field1991;
   @ObfuscatedName("ax")
   public boolean field1990 = false;

   public NewStuff(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      this.field1989 = var1;
      this.field1987 = var3;
      this.field1988 = var4;
      this.field1991 = var5;
      this.field1990 = var6;
   }
}
