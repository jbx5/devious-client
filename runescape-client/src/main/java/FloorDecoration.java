import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -43638231
   )
   @Export("z")
   int z;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -468843923
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1864438201
   )
   @Export("y")
   int y;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 6840749953580079071L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1783992821
   )
   @Export("flags")
   int flags;

   FloorDecoration() {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-164841108"
   )
   static void method4315() {
      if (class290.loadWorlds()) {
         Login.worldSelectOpen = true;
         Login.worldSelectPage = 0;
         Login.worldSelectPagesCount = 0;
      }

   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1521078230"
   )
   static final void method4314(int var0, int var1, int var2, int var3) {
      Client.overheadTextCount = 0;
      boolean var4 = false;
      int var5 = -1;
      int var6 = -1;
      int var7 = Players.Players_count;
      int[] var8 = Players.Players_indices;

      int var9;
      for(var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
         Object var20;
         if (var9 < var7) {
            var20 = Client.players[var8[var9]];
            if (var8[var9] == Client.combatTargetPlayerIndex) {
               var4 = true;
               var5 = var9;
               continue;
            }

            if (var20 == class387.localPlayer) {
               var6 = var9;
               continue;
            }
         } else {
            var20 = Client.npcs[Client.npcIndices[var9 - var7]];
         }

         class374.drawActor2d((Actor)var20, var9, var0, var1, var2, var3);
      }

      if (Client.renderSelf && var6 != -1) {
         class374.drawActor2d(class387.localPlayer, var6, var0, var1, var2, var3);
      }

      if (var4) {
         class374.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
      }

      for(var9 = 0; var9 < Client.overheadTextCount; ++var9) {
         int var10 = Client.overheadTextXs[var9];
         int var11 = Client.overheadTextYs[var9];
         int var12 = Client.overheadTextXOffsets[var9];
         int var13 = Client.overheadTextAscents[var9];
         boolean var14 = true;

         while(var14) {
            var14 = false;

            for(int var19 = 0; var19 < var9; ++var19) {
               if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) {
                  var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19];
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
               var16 = Client.field758[Client.overheadTextColors[var9]];
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

            if (Client.overheadTextEffects[var9] == 0) {
               class19.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
            }

            if (Client.overheadTextEffects[var9] == 1) {
               class19.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var9] == 2) {
               class19.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var9] == 3) {
               class19.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
            }

            if (Client.overheadTextEffects[var9] == 4) {
               var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class19.fontBold12.stringWidth(var15) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
               class19.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.overheadTextEffects[var9] == 5) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               int var18 = 0;
               if (var17 < 25) {
                  var18 = var17 - 25;
               } else if (var17 > 125) {
                  var18 = var17 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class19.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
               class19.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class19.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
         }
      }

   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-808127633"
   )
   static final void method4313(int var0) {
      if (var0 >= 0) {
         int var1 = Client.menuArguments1[var0];
         int var2 = Client.menuArguments2[var0];
         int var3 = Client.menuOpcodes[var0];
         int var4 = Client.menuIdentifiers[var0];
         int var5 = Client.menuItemIds[var0];
         String var6 = Client.menuActions[var0];
         String var7 = Client.menuTargets[var0];
         FileSystem.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
      }
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lkz;I)Ljava/lang/String;",
      garbageValue = "949347159"
   )
   static String method4312(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = Language.method6780(var1, var2 - 1);
               String var5;
               if (var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
