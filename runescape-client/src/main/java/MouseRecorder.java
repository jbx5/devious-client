import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("logoSprite")
   static IndexedSprite logoSprite;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   static IndexedSprite field1059;
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "[Lry;"
   )
   @Export("worldSelectArrows")
   static IndexedSprite[] worldSelectArrows;
   @ObfuscatedName("a")
   @Export("isRunning")
   boolean isRunning = true;
   @ObfuscatedName("f")
   @Export("lock")
   Object lock = new Object();
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1285600337
   )
   @Export("index")
   int index = 0;
   @ObfuscatedName("x")
   @Export("xs")
   int[] xs = new int[500];
   @ObfuscatedName("h")
   @Export("ys")
   int[] ys = new int[500];
   @ObfuscatedName("j")
   @Export("millis")
   long[] millis = new long[500];

   MouseRecorder() {
   }

   public void run() {
      for(; this.isRunning; class197.method3946(50L)) {
         synchronized(this.lock) {
            if (this.index < 500) {
               this.xs[this.index] = MouseHandler.MouseHandler_x;
               this.ys[this.index] = MouseHandler.MouseHandler_y;
               this.millis[this.index] = MouseHandler.MouseHandler_millis;
               ++this.index;
            }
         }
      }

   }
}
