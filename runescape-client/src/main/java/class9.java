import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class9 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   public static final class9 field43 = new class9(0, "POST", true, true);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   public static final class9 field33 = new class9(1, "GET", true, false);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   static final class9 field42 = new class9(2, "PUT", false, true);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   static final class9 field35 = new class9(3, "PATCH", false, true);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   static final class9 field36 = new class9(4, "DELETE", false, true);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   @Export("rightTitleSprite")
   static SpritePixels rightTitleSprite;
   @ObfuscatedName("bx")
   static String field41;
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive7")
   static Archive archive7;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1316615471
   )
   int field45;
   @ObfuscatedName("f")
   String field37;
   @ObfuscatedName("r")
   boolean field34;
   @ObfuscatedName("u")
   boolean field40;

   class9(int var1, String var2, boolean var3, boolean var4) {
      this.field45 = var1;
      this.field37 = var2;
      this.field34 = var3;
      this.field40 = var4;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2030872852"
   )
   boolean method69() {
      return this.field34;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field45;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "923368011"
   )
   public String method70() {
      return this.field37;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "12"
   )
   boolean method71() {
      return this.field40;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lqr;",
      garbageValue = "2126474190"
   )
   public static class456 method82(int var0) {
      int var1 = class454.field4866[var0];
      if (var1 == 1) {
         return class456.field4874;
      } else if (var1 == 2) {
         return class456.field4871;
      } else {
         return var1 == 3 ? class456.field4870 : null;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "6"
   )
   @Export("changeWorldSelectSorting")
   static void changeWorldSelectSorting(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (World.World_sortOption1[var5] != var0) {
            var2[var4] = World.World_sortOption1[var5];
            var3[var4] = World.World_sortOption2[var5];
            ++var4;
         }
      }

      World.World_sortOption1 = var2;
      World.World_sortOption2 = var3;
      class420.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lkd;IIIB)V",
      garbageValue = "0"
   )
   @Export("Widget_setKeyRate")
   static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
      if (var0.field3630 == null) {
         throw new RuntimeException();
      } else {
         var0.field3630[var1] = var2;
         var0.field3625[var1] = var3;
      }
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1971964072"
   )
   static final void method80() {
      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      if (Client.oculusOrbState == 0) {
         var0 = class155.localPlayer.x;
         var1 = class155.localPlayer.y;
         if (class29.oculusOrbFocalPointX - var0 < -500 || class29.oculusOrbFocalPointX - var0 > 500 || class14.oculusOrbFocalPointY - var1 < -500 || class14.oculusOrbFocalPointY - var1 > 500) {
            class29.oculusOrbFocalPointX = var0;
            class14.oculusOrbFocalPointY = var1;
         }

         if (var0 != class29.oculusOrbFocalPointX) {
            class29.oculusOrbFocalPointX += (var0 - class29.oculusOrbFocalPointX) / 16;
         }

         if (var1 != class14.oculusOrbFocalPointY) {
            class14.oculusOrbFocalPointY += (var1 - class14.oculusOrbFocalPointY) / 16;
         }

         var2 = class29.oculusOrbFocalPointX >> 7;
         var3 = class14.oculusOrbFocalPointY >> 7;
         var4 = SpotAnimationDefinition.getTileHeight(class29.oculusOrbFocalPointX, class14.oculusOrbFocalPointY, class383.Client_plane);
         var5 = 0;
         int var6;
         if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for(var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
               for(int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                  int var8 = class383.Client_plane;
                  if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
                     ++var8;
                  }

                  int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
                  if (var9 > var5) {
                     var5 = var9;
                  }
               }
            }
         }

         var6 = var5 * 192;
         if (var6 > 98048) {
            var6 = 98048;
         }

         if (var6 < 32768) {
            var6 = 32768;
         }

         if (var6 > Client.field604) {
            Client.field604 += (var6 - Client.field604) / 24;
         } else if (var6 < Client.field604) {
            Client.field604 += (var6 - Client.field604) / 80;
         }

         ApproximateRouteStrategy.field498 = SpotAnimationDefinition.getTileHeight(class155.localPlayer.x, class155.localPlayer.y, class383.Client_plane) - Client.camFollowHeight;
      } else if (Client.oculusOrbState == 1) {
         if (Client.field529 && class155.localPlayer != null) {
            var0 = class155.localPlayer.pathX[0];
            var1 = class155.localPlayer.pathY[0];
            if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
               class29.oculusOrbFocalPointX = class155.localPlayer.x;
               var2 = SpotAnimationDefinition.getTileHeight(class155.localPlayer.x, class155.localPlayer.y, class383.Client_plane) - Client.camFollowHeight;
               if (var2 < ApproximateRouteStrategy.field498) {
                  ApproximateRouteStrategy.field498 = var2;
               }

               class14.oculusOrbFocalPointY = class155.localPlayer.y;
               Client.field529 = false;
            }
         }

         short var10 = -1;
         if (Client.field747.method4106(33)) {
            var10 = 0;
         } else if (Client.field747.method4106(49)) {
            var10 = 1024;
         }

         if (Client.field747.method4106(48)) {
            if (var10 == 0) {
               var10 = 1792;
            } else if (var10 == 1024) {
               var10 = 1280;
            } else {
               var10 = 1536;
            }
         } else if (Client.field747.method4106(50)) {
            if (var10 == 0) {
               var10 = 256;
            } else if (var10 == 1024) {
               var10 = 768;
            } else {
               var10 = 512;
            }
         }

         byte var11 = 0;
         if (Client.field747.method4106(35)) {
            var11 = -1;
         } else if (Client.field747.method4106(51)) {
            var11 = 1;
         }

         var2 = 0;
         if (var10 >= 0 || var11 != 0) {
            var2 = Client.field747.method4106(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
            var2 *= 16;
            Client.field596 = var10;
            Client.field597 = var11;
         }

         if (Client.field638 < var2) {
            Client.field638 += var2 / 8;
            if (Client.field638 > var2) {
               Client.field638 = var2;
            }
         } else if (Client.field638 > var2) {
            Client.field638 = Client.field638 * 9 / 10;
         }

         if (Client.field638 > 0) {
            var3 = Client.field638 / 16;
            if (Client.field596 >= 0) {
               var0 = Client.field596 - class128.cameraYaw & 2047;
               var4 = Rasterizer3D.Rasterizer3D_sine[var0];
               var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
               class29.oculusOrbFocalPointX += var4 * var3 / 65536;
               class14.oculusOrbFocalPointY += var5 * var3 / 65536;
            }

            if (Client.field597 != 0) {
               ApproximateRouteStrategy.field498 += var3 * Client.field597;
               if (ApproximateRouteStrategy.field498 > 0) {
                  ApproximateRouteStrategy.field498 = 0;
               }
            }
         } else {
            Client.field596 = -1;
            Client.field597 = -1;
         }

         if (Client.field747.method4106(13)) {
            Client.packetWriter.addNode(class136.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
            Client.oculusOrbState = 0;
         }
      }

      if (MouseHandler.MouseHandler_currentButton == 4 && SceneTilePaint.mouseCam) {
         var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
         Client.camAngleDX = var0 * 2;
         Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
         var1 = Client.field591 - MouseHandler.MouseHandler_x;
         Client.camAngleDY = var1 * 2;
         Client.field591 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field591) / 2 : MouseHandler.MouseHandler_x;
      } else {
         if (Client.field747.method4106(96)) {
            Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
         } else if (Client.field747.method4106(97)) {
            Client.camAngleDY += (24 - Client.camAngleDY) / 2;
         } else {
            Client.camAngleDY /= 2;
         }

         if (Client.field747.method4106(98)) {
            Client.camAngleDX += (12 - Client.camAngleDX) / 2;
         } else if (Client.field747.method4106(99)) {
            Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
         } else {
            Client.camAngleDX /= 2;
         }

         Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
         Client.field591 = MouseHandler.MouseHandler_x;
      }

      Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
      Client.camAngleX += Client.camAngleDX / 2;
      if (Client.camAngleX < 128) {
         Client.camAngleX = 128;
      }

      if (Client.camAngleX > 383) {
         Client.camAngleX = 383;
      }

   }

   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      descriptor = "(Lcx;ZB)V",
      garbageValue = "93"
   )
   @Export("closeInterface")
   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var2 = var0.group;
      int var3 = (int)var0.key;
      var0.remove();
      if (var1) {
         HitSplatDefinition.method3850(var2);
      }

      VarpDefinition.method3547(var2);
      Widget var4 = PlayerCompositionColorTextureOverride.getWidget(var3);
      if (var4 != null) {
         class69.invalidateWidget(var4);
      }

      if (Client.rootInterface != -1) {
         GrandExchangeOfferAgeComparator.runIntfCloseListeners(Client.rootInterface, 1);
      }

   }
}
