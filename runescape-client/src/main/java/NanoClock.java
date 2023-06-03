import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("NanoClock")
public class NanoClock extends Clock {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -8751691574289395541L
   )
   @Export("lastTimeNano")
   long lastTimeNano = System.nanoTime();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1909200559"
   )
   @Export("mark")
   public void mark() {
      this.lastTimeNano = System.nanoTime();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-4"
   )
   @Export("wait")
   public int wait(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.lastTimeNano - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      FloorDecoration.method4357(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.lastTimeNano < var7); this.lastTimeNano += (long)var1 * 1000000L) {
         ++var9;
      }

      if (this.lastTimeNano < var7) {
         this.lastTimeNano = var7;
      }

      return var9;
   }
}
