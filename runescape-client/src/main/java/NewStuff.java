import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hv")
@Implements("NewStuff")
public class NewStuff {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -1176524468931644747L
   )
   public long field2002;
   @ObfuscatedName("an")
   int[] field2001;
   @ObfuscatedName("aw")
   short[] field2000;
   @ObfuscatedName("ac")
   short[] field2003;
   @ObfuscatedName("au")
   public boolean field2004 = false;

   public NewStuff(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      this.field2002 = var1;
      this.field2001 = var3;
      this.field2000 = var4;
      this.field2003 = var5;
      this.field2004 = var6;
   }
}
