import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class152 extends class142 {
   @ObfuscatedName("ar")
   @Export("ByteArrayPool_alternativeSizes")
   static int[] ByteArrayPool_alternativeSizes;
   @ObfuscatedName("kn")
   @ObfuscatedGetter(
      intValue = 1005126467
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1108833623
   )
   int field1683;
   @ObfuscatedName("an")
   String field1680;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class152(class145 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1683 = var1.readInt();
      this.field1680 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3219(this.field1683, this.field1680);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "-987"
   )
   public static int method3196(int var0) {
      return var0 >>> 12;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lsl;",
      garbageValue = "1"
   )
   @Export("getDbTableType")
   public static DbTableType getDbTableType(int var0) {
      DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbTableType.field4983.takeFile(39, var0);
         var1 = new DbTableType();
         if (var2 != null) {
            var1.method8792(new Buffer(var2));
         }

         var1.method8787();
         DbTableType.DBTableType_cache.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1415834229"
   )
   static final void method3194(boolean var0) {
      if (var0) {
         Client.field677 = Login.field942 ? class138.field1606 : class138.field1609;
      } else {
         Client.field677 = class10.clientPreferences.method2484(Login.Login_username) ? class138.field1607 : class138.field1608;
      }

   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1622212855"
   )
   static final void method3199(int var0, int var1, int var2, int var3) {
      Client.overheadTextCount = 0;
      boolean var4 = false;
      int var5 = -1;
      int var6 = -1;
      int var7 = Players.Players_count;
      int[] var8 = Players.Players_indices;

      int var9;
      for(var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
         Object var21;
         if (var9 < var7) {
            var21 = Client.players[var8[var9]];
            if (var8[var9] == Client.combatTargetPlayerIndex) {
               var4 = true;
               var5 = var9;
               continue;
            }

            if (var21 == Projectile.localPlayer) {
               var6 = var9;
               continue;
            }
         } else {
            var21 = Client.npcs[Client.npcIndices[var9 - var7]];
         }

         class322.drawActor2d((Actor)var21, var9, var0, var1, var2, var3);
      }

      if (Client.field751 && var6 != -1) {
         class322.drawActor2d(Projectile.localPlayer, var6, var0, var1, var2, var3);
      }

      if (var4) {
         class322.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
      }

      for(var9 = 0; var9 < Client.overheadTextCount; ++var9) {
         int var10 = Client.overheadTextXs[var9];
         int var11 = Client.overheadTextYs[var9];
         int var12 = Client.overheadTextXOffsets[var9];
         int var13 = Client.overheadTextAscents[var9];
         boolean var14 = true;

         while(var14) {
            var14 = false;

            for(int var20 = 0; var20 < var9; ++var20) {
               if (var11 + 2 > Client.overheadTextYs[var20] - Client.overheadTextAscents[var20] && var11 - var13 < Client.overheadTextYs[var20] + 2 && var10 - var12 < Client.overheadTextXs[var20] + Client.overheadTextXOffsets[var20] && var10 + var12 > Client.overheadTextXs[var20] - Client.overheadTextXOffsets[var20] && Client.overheadTextYs[var20] - Client.overheadTextAscents[var20] < var11) {
                  var11 = Client.overheadTextYs[var20] - Client.overheadTextAscents[var20];
                  var14 = true;
               }
            }
         }

         Client.viewportTempX = Client.overheadTextXs[var9];
         Client.viewportTempY = Client.overheadTextYs[var9] = var11;
         String var15 = Client.overheadText[var9];
         if (Client.chatEffects == 0) {
            int var16 = 16776960;
            if (Client.overheadTextColors[var9] < 6) {
               var16 = Client.field577[Client.overheadTextColors[var9]];
            }

            if (Client.overheadTextColors[var9] == 6) {
               var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.overheadTextColors[var9] == 7) {
               var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
            }

            if (Client.overheadTextColors[var9] == 8) {
               var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
            }

            int var17;
            if (Client.overheadTextColors[var9] == 9) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               if (var17 < 50) {
                  var16 = var17 * 1280 + 16711680;
               } else if (var17 < 100) {
                  var16 = 16776960 - (var17 - 50) * 327680;
               } else if (var17 < 150) {
                  var16 = (var17 - 100) * 5 + '\uff00';
               }
            }

            if (Client.overheadTextColors[var9] == 10) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               if (var17 < 50) {
                  var16 = var17 * 5 + 16711680;
               } else if (var17 < 100) {
                  var16 = 16711935 - (var17 - 50) * 327680;
               } else if (var17 < 150) {
                  var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
               }
            }

            if (Client.overheadTextColors[var9] == 11) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               if (var17 < 50) {
                  var16 = 16777215 - var17 * 327685;
               } else if (var17 < 100) {
                  var16 = (var17 - 50) * 327685 + '\uff00';
               } else if (var17 < 150) {
                  var16 = 16777215 - (var17 - 100) * 327680;
               }
            }

            int var18;
            if (Client.overheadTextColors[var9] == 12 && Client.field614[var9] == null) {
               var17 = var15.length();
               Client.field614[var9] = new int[var17];

               for(var18 = 0; var18 < var17; ++var18) {
                  int var19 = (int)((float)var18 / (float)var17 * 64.0F);
                  Client.field614[var9][var18] = class454.field4744[var19 << 10 | 896 | 64];
               }
            }

            if (Client.overheadTextEffects[var9] == 0) {
               class166.fontBold12.method7416(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field614[var9]);
            }

            if (Client.overheadTextEffects[var9] == 1) {
               class166.fontBold12.method7433(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field614[var9]);
            }

            if (Client.overheadTextEffects[var9] == 2) {
               class166.fontBold12.method7434(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field614[var9]);
            }

            if (Client.overheadTextEffects[var9] == 3) {
               class166.fontBold12.method7488(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9], Client.field614[var9]);
            }

            if (Client.overheadTextEffects[var9] == 4) {
               var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class166.fontBold12.stringWidth(var15) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
               class166.fontBold12.method7435(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field614[var9]);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.overheadTextEffects[var9] == 5) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               var18 = 0;
               if (var17 < 25) {
                  var18 = var17 - 25;
               } else if (var17 > 125) {
                  var18 = var17 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class166.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
               class166.fontBold12.method7416(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field614[var9]);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class166.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
         }
      }

   }
}
