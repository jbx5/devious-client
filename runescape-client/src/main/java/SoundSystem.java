import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
   @ObfuscatedName("al")
   @Export("soundSystemExecutor")
   static ScheduledExecutorService soundSystemExecutor;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("scriptDotWidget")
   static Widget scriptDotWidget;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lbu;"
   )
   @Export("players")
   volatile PcmPlayer[] players = new PcmPlayer[2];

   SoundSystem() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run();
            }
         }
      } catch (Exception var4) {
         class387.RunException_sendStackTrace((String)null, var4);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)Lmq;",
      garbageValue = "-310708295"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = class165.getWidget(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1376777516"
   )
   @Export("loadInterface")
   public static boolean loadInterface(int var0) {
      if (class264.Widget_loadedInterfaces[var0]) {
         return true;
      } else if (!UserComparator3.Widget_archive.tryLoadGroup(var0)) {
         return false;
      } else {
         int var1 = UserComparator3.Widget_archive.getGroupFileCount(var0);
         if (var1 == 0) {
            class264.Widget_loadedInterfaces[var0] = true;
            return true;
         } else {
            if (VerticalAlignment.Widget_interfaceComponents[var0] == null) {
               VerticalAlignment.Widget_interfaceComponents[var0] = new Widget[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if (VerticalAlignment.Widget_interfaceComponents[var0][var2] == null) {
                  byte[] var3 = UserComparator3.Widget_archive.takeFile(var0, var2);
                  if (var3 != null) {
                     VerticalAlignment.Widget_interfaceComponents[var0][var2] = new Widget();
                     VerticalAlignment.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
                     if (var3[0] == -1) {
                        VerticalAlignment.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
                     } else {
                        VerticalAlignment.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
                     }
                  }
               }
            }

            class264.Widget_loadedInterfaces[var0] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1195339231"
   )
   static int method878(int var0) {
      return (int)((Math.log((double)var0) / Interpreter.field851 - 7.0) * 256.0);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "2001743352"
   )
   static int method879(int var0, Script var1, boolean var2) {
      return 2;
   }
}
