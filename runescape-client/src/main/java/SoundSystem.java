import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
   @ObfuscatedName("co")
   @Export("otp")
   static String otp;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Lbi;"
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
         class260.RunException_sendStackTrace((String)null, var4);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ldz;IIB)V",
      garbageValue = "99"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      if (TileItem.isWorldMapEvent(var0.type)) {
         class183.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var6 = class147.WorldMapElement_get(class183.worldMapEvent.mapElement);
         var4 = class412.getWorldMapScript(var0.type, var6.objectId, var6.category);
      } else {
         int var5 = (Integer)var3[0];
         var4 = class190.getScript(var5);
      }

      if (var4 != null) {
         class125.runScriptLogic(var0, var4, var1, var2);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "([FI)V",
      garbageValue = "-838943376"
   )
   static void method815(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = (float)(1.0 + ((double)var0[1] - 2.0) * (double)var0[1] + (double)(var0[0] * (var0[0] - 2.0F + var0[1])));
         if (var1 + class125.field1463 > 0.0F) {
            World.method1753(var0);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Ldq;",
      garbageValue = "-910083542"
   )
   static class90[] method817() {
      return new class90[]{class90.field1090, class90.field1096, class90.field1091, class90.field1094, class90.field1093, class90.field1092};
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      descriptor = "(Lmb;IIZI)V",
      garbageValue = "170850099"
   )
   @Export("alignWidgetSize")
   static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if (var0.widthAlignment == 0) {
         var0.width = var0.rawWidth;
      } else if (var0.widthAlignment == 1) {
         var0.width = var1 - var0.rawWidth;
      } else if (var0.widthAlignment == 2) {
         var0.width = var0.rawWidth * var1 >> 14;
      }

      if (var0.heightAlignment == 0) {
         var0.height = var0.rawHeight;
      } else if (var0.heightAlignment == 1) {
         var0.height = var2 - var0.rawHeight;
      } else if (var0.heightAlignment == 2) {
         var0.height = var2 * var0.rawHeight >> 14;
      }

      if (var0.widthAlignment == 4) {
         var0.width = var0.field3619 * var0.height / var0.field3620;
      }

      if (var0.heightAlignment == 4) {
         var0.height = var0.field3620 * var0.width / var0.field3619;
      }

      if (var0.contentType == 1337) {
         Client.viewportWidget = var0;
      }

      if (var0.type == 12) {
         var0.method6380().method6061(var0.width, var0.height);
      }

      if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.widget = var0;
         var6.args = var0.onResize;
         Client.scriptEvents.addFirst(var6);
      }

   }
}
