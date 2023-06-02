import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
final class class309 implements Callable {
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   static ClanSettings field3452;
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   public static AbstractArchive field3453;
   // $FF: synthetic field
   final PriorityQueue val$waves;
   // $FF: synthetic field
   final AtomicBoolean val$cancelled;

   class309(PriorityQueue var1, AtomicBoolean var2) {
      this.val$waves = var1;
      this.val$cancelled = var2;
   }

   public Object call() {
      while(!this.val$waves.isEmpty() && !this.val$cancelled.get()) {
         ((class310)this.val$waves.peek()).field3456.method1039();
         this.val$waves.remove();
      }

      return null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IZIZB)V",
      garbageValue = "1"
   )
   @Export("sortWorldList")
   static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
      if (World.World_worlds != null) {
         ViewportMouse.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
      }

   }
}
