import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("tk")
   @ObfuscatedSignature(
      descriptor = "Lbi;"
   )
   @Export("pcmPlayer0")
   static PcmPlayer pcmPlayer0;
   @ObfuscatedName("at")
   @Export("isRunning")
   boolean isRunning = true;
   @ObfuscatedName("an")
   @Export("lock")
   Object lock = new Object();
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -413684111
   )
   @Export("index")
   int index = 0;
   @ObfuscatedName("as")
   @Export("xs")
   int[] xs = new int[500];
   @ObfuscatedName("ax")
   @Export("ys")
   int[] ys = new int[500];
   @ObfuscatedName("ap")
   @Export("millis")
   long[] millis = new long[500];

   MouseRecorder() {
   }

   public void run() {
      for(; this.isRunning; FloorDecoration.method4357(50L)) {
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1925901423"
   )
   static void method2260() {
      Players.Players_count = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         Players.field1332[var0] = null;
         Players.field1328[var0] = class216.field2395;
      }

   }

   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-22181255"
   )
   @Export("menuSort")
   static final void menuSort() {
      boolean var0 = false;

      while(!var0) {
         var0 = true;

         for(int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) {
            if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
               String var2 = Client.menuTargets[var1];
               Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
               Client.menuTargets[var1 + 1] = var2;
               String var3 = Client.menuActions[var1];
               Client.menuActions[var1] = Client.menuActions[var1 + 1];
               Client.menuActions[var1 + 1] = var3;
               int var4 = Client.menuOpcodes[var1];
               Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
               Client.menuOpcodes[var1 + 1] = var4;
               var4 = Client.menuArguments1[var1];
               Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
               Client.menuArguments1[var1 + 1] = var4;
               var4 = Client.menuArguments2[var1];
               Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
               Client.menuArguments2[var1 + 1] = var4;
               var4 = Client.menuIdentifiers[var1];
               Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
               Client.menuIdentifiers[var1 + 1] = var4;
               var4 = Client.menuItemIds[var1];
               Client.menuItemIds[var1] = Client.menuItemIds[var1 + 1];
               Client.menuItemIds[var1 + 1] = var4;
               boolean var5 = Client.menuShiftClick[var1];
               Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
               Client.menuShiftClick[var1 + 1] = var5;
               var0 = false;
            }
         }
      }

   }
}
