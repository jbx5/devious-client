import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class141 extends class140 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -230028297
   )
   int field1615;
   @ObfuscatedName("al")
   boolean field1616;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class141(class143 var1) {
      this.this$0 = var1;
      this.field1615 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1615 = var1.readUnsignedShort();
      this.field1616 = var1.readUnsignedByte() == 1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3206(this.field1615, this.field1616);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Loe;Loe;Loe;B)V",
      garbageValue = "-39"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      Login.loginBoxCenter = Login.loginBoxX + 180;
      int var3;
      int var4;
      int var9;
      int var11;
      int var12;
      int var18;
      int var19;
      int var23;
      int var25;
      int var26;
      int var27;
      int var28;
      if (Login.worldSelectOpen) {
         if (WorldMapSection2.worldSelectBackSprites == null) {
            WorldMapSection2.worldSelectBackSprites = class279.method5454(class143.archive8, "sl_back", "");
         }

         Archive var45;
         IndexedSprite[] var54;
         if (class279.worldSelectFlagSprites == null) {
            var45 = class143.archive8;
            var23 = var45.getGroupId("sl_flags");
            var27 = var45.getFileId(var23, "");
            var54 = class456.method8334(var45, var23, var27);
            class279.worldSelectFlagSprites = var54;
         }

         if (class353.worldSelectArrows == null) {
            var45 = class143.archive8;
            var23 = var45.getGroupId("sl_arrows");
            var27 = var45.getFileId(var23, "");
            var54 = class456.method8334(var45, var23, var27);
            class353.worldSelectArrows = var54;
         }

         if (class293.worldSelectStars == null) {
            var45 = class143.archive8;
            var23 = var45.getGroupId("sl_stars");
            var27 = var45.getFileId(var23, "");
            var54 = class456.method8334(var45, var23, var27);
            class293.worldSelectStars = var54;
         }

         if (class12.worldSelectLeftSprite == null) {
            class12.worldSelectLeftSprite = class368.SpriteBuffer_getIndexedSpriteByName(class143.archive8, "leftarrow", "");
         }

         if (class208.worldSelectRightSprite == null) {
            class208.worldSelectRightSprite = class368.SpriteBuffer_getIndexedSpriteByName(class143.archive8, "rightarrow", "");
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
         var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
         if (class293.worldSelectStars != null) {
            class293.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
            var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
            class293.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
            var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
         }

         if (class353.worldSelectArrows != null) {
            var3 = Login.xPadding + 280;
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
               class353.worldSelectArrows[2].drawAt(var3, 4);
            } else {
               class353.worldSelectArrows[0].drawAt(var3, 4);
            }

            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
               class353.worldSelectArrows[3].drawAt(var3 + 15, 4);
            } else {
               class353.worldSelectArrows[1].drawAt(var3 + 15, 4);
            }

            var0.draw("World", var3 + 32, 17, 16777215, -1);
            var4 = Login.xPadding + 390;
            if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
               class353.worldSelectArrows[2].drawAt(var4, 4);
            } else {
               class353.worldSelectArrows[0].drawAt(var4, 4);
            }

            if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
               class353.worldSelectArrows[3].drawAt(var4 + 15, 4);
            } else {
               class353.worldSelectArrows[1].drawAt(var4 + 15, 4);
            }

            var0.draw("Players", var4 + 32, 17, 16777215, -1);
            var23 = Login.xPadding + 500;
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
               class353.worldSelectArrows[2].drawAt(var23, 4);
            } else {
               class353.worldSelectArrows[0].drawAt(var23, 4);
            }

            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
               class353.worldSelectArrows[3].drawAt(var23 + 15, 4);
            } else {
               class353.worldSelectArrows[1].drawAt(var23 + 15, 4);
            }

            var0.draw("Location", var23 + 32, 17, 16777215, -1);
            var27 = Login.xPadding + 610;
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
               class353.worldSelectArrows[2].drawAt(var27, 4);
            } else {
               class353.worldSelectArrows[0].drawAt(var27, 4);
            }

            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
               class353.worldSelectArrows[3].drawAt(var27 + 15, 4);
            } else {
               class353.worldSelectArrows[1].drawAt(var27 + 15, 4);
            }

            var0.draw("Type", var27 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
         var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
         Login.hoveredWorldIndex = -1;
         if (WorldMapSection2.worldSelectBackSprites != null) {
            byte var52 = 88;
            byte var41 = 19;
            var23 = 765 / (var52 + 1) - 1;
            var27 = 480 / (var41 + 1);

            do {
               var25 = var27;
               var26 = var23;
               if (var27 * (var23 - 1) >= World.World_count) {
                  --var23;
               }

               if (var23 * (var27 - 1) >= World.World_count) {
                  --var27;
               }

               if (var23 * (var27 - 1) >= World.World_count) {
                  --var27;
               }
            } while(var27 != var25 || var23 != var26);

            var25 = (765 - var23 * var52) / (var23 + 1);
            if (var25 > 5) {
               var25 = 5;
            }

            var26 = (480 - var27 * var41) / (var27 + 1);
            if (var26 > 5) {
               var26 = 5;
            }

            var9 = (765 - var52 * var23 - var25 * (var23 - 1)) / 2;
            var28 = (480 - var27 * var41 - var26 * (var27 - 1)) / 2;
            var11 = (var27 + World.World_count - 1) / var27;
            Login.worldSelectPagesCount = var11 - var23;
            if (class12.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
               class12.worldSelectLeftSprite.drawAt(8, class143.canvasHeight / 2 - class12.worldSelectLeftSprite.subHeight / 2);
            }

            if (class208.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
               class208.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class208.worldSelectRightSprite.subWidth - 8, class143.canvasHeight / 2 - class208.worldSelectRightSprite.subHeight / 2);
            }

            var12 = var28 + 23;
            int var39 = var9 + Login.xPadding;
            int var32 = 0;
            boolean var33 = false;
            int var42 = Login.worldSelectPage;

            int var43;
            for(var43 = var27 * var42; var43 < World.World_count && var42 - Login.worldSelectPage < var23; ++var43) {
               World var34 = class260.World_worlds[var43];
               boolean var44 = true;
               String var20 = Integer.toString(var34.population);
               if (var34.population == -1) {
                  var20 = "OFF";
                  var44 = false;
               } else if (var34.population > 1980) {
                  var20 = "FULL";
                  var44 = false;
               }

               int var21 = -1;
               int var22 = 0;
               if (var34.isBeta()) {
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1360.field1352;
                  } else {
                     var21 = class105.field1355.field1352;
                  }
               } else if (var34.isDeadman()) {
                  var22 = 16711680;
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1350.field1352;
                  } else {
                     var21 = class105.field1349.field1352;
                  }
               } else if (var34.method1820()) {
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1345.field1352;
                  } else {
                     var21 = class105.field1353.field1352;
                  }
               } else if (var34.isPvp()) {
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1354.field1352;
                  } else {
                     var21 = class105.field1347.field1352;
                  }
               } else if (var34.method1789()) {
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1356.field1352;
                  } else {
                     var21 = class105.field1348.field1352;
                  }
               } else if (var34.method1790()) {
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1351.field1352;
                  } else {
                     var21 = class105.field1357.field1352;
                  }
               }

               if (var21 == -1 || var21 >= WorldMapSection2.worldSelectBackSprites.length) {
                  if (var34.isMembersOnly()) {
                     var21 = class105.field1358.field1352;
                  } else {
                     var21 = class105.field1359.field1352;
                  }
               }

               if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var39 + var52 && MouseHandler.MouseHandler_y < var12 + var41 && var44) {
                  Login.hoveredWorldIndex = var43;
                  WorldMapSection2.worldSelectBackSprites[var21].drawTransOverlayAt(var39, var12, 128, 16777215);
                  var33 = true;
               } else {
                  WorldMapSection2.worldSelectBackSprites[var21].drawAt(var39, var12);
               }

               if (class279.worldSelectFlagSprites != null) {
                  class279.worldSelectFlagSprites[(var34.isMembersOnly() ? 8 : 0) + var34.location].drawAt(var39 + 29, var12);
               }

               var0.drawCentered(Integer.toString(var34.id), var39 + 15, var41 / 2 + var12 + 5, var22, -1);
               var1.drawCentered(var20, var39 + 60, var41 / 2 + var12 + 5, 268435455, -1);
               var12 = var12 + var41 + var26;
               ++var32;
               if (var32 >= var27) {
                  var12 = var28 + 23;
                  var39 = var39 + var52 + var25;
                  var32 = 0;
                  ++var42;
               }
            }

            if (var33) {
               var43 = var1.stringWidth(class260.World_worlds[Login.hoveredWorldIndex].activity) + 6;
               var18 = var1.ascent + 8;
               var19 = MouseHandler.MouseHandler_y + 25;
               if (var19 + var18 > 480) {
                  var19 = MouseHandler.MouseHandler_y - 25 - var18;
               }

               Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var43 / 2, var19, var43, var18, 16777120);
               Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var43 / 2, var19, var43, var18, 0);
               var1.drawCentered(class260.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var19 + var1.ascent + 4, 0, -1);
            }
         }

         StudioGame.rasterProvider.drawFull(0, 0);
      } else {
         Login.leftTitleSprite.drawAt(Login.xPadding, 0);
         class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
         if (Client.gameState == 0 || Client.gameState == 5) {
            var3 = 20;
            var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
            var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
         }

         String var5;
         String var7;
         String var8;
         char[] var10;
         short var35;
         if (Client.gameState == 20) {
            WorldMapSprite.titleboxSprite.drawAt(Login.loginBoxX + 180 - WorldMapSprite.titleboxSprite.subWidth / 2, 271 - WorldMapSprite.titleboxSprite.subHeight / 2);
            var3 = 201;
            var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3, 16776960, 0);
            var3 += 15;
            var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
            var3 += 15;
            var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
            var3 += 15;
            var3 += 7;
            if (Login.loginIndex != 4 && Login.loginIndex != 10) {
               var0.draw("Login: ", Login.loginBoxX + 180 - 110, var3, 16777215, 0);
               var35 = 200;

               for(var5 = UserComparator3.method2868(); var0.stringWidth(var5) > var35; var5 = var5.substring(0, var5.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
               var3 += 15;
               var7 = Login.Login_password;
               var9 = var7.length();
               var10 = new char[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var10[var11] = '*';
               }

               var8 = new String(var10);

               for(var8 = var8; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) {
               }

               var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
            WorldMapSprite.titleboxSprite.drawAt(Login.loginBoxX, 171);
            short var36;
            if (Login.loginIndex == 0) {
               var36 = 251;
               var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var36, 16776960, 0);
               var3 = var36 + 30;
               var4 = Login.loginBoxX + 180 - 80;
               var23 = 291;
               Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = Login.loginBoxX + 180 + 80;
               Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
               var36 = 236;
               var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var36, 16777215, 0);
               var3 = var36 + 15;
               var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180 - 80;
               var23 = 321;
               Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180 + 80;
               Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
            } else {
               String var6;
               if (Login.loginIndex == 2) {
                  var36 = 201;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var36, 16776960, 0);
                  var3 = var36 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 7;
                  var0.draw("Login: ", Login.loginBoxCenter - 110, var3, 16777215, 0);
                  var35 = 200;
                  char[] var29;
                  String var30;
                  if (!WorldMapSectionType.clientPreferences.method2429()) {
                     var6 = Login.Login_username;
                  } else {
                     var8 = Login.Login_username;
                     var28 = var8.length();
                     var29 = new char[var28];

                     for(var12 = 0; var12 < var28; ++var12) {
                        var29[var12] = '*';
                     }

                     var30 = new String(var29);
                     var6 = var30;
                  }

                  for(var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var3, 16777215, 0);
                  var3 += 15;
                  var8 = Login.Login_password;
                  var28 = var8.length();
                  var29 = new char[var28];

                  for(var12 = 0; var12 < var28; ++var12) {
                     var29[var12] = '*';
                  }

                  var30 = new String(var29);

                  for(var30 = var30; var0.stringWidth(var30) > var35; var30 = var30.substring(1)) {
                  }

                  var0.draw("Password: " + var30 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var3, 16777215, 0);
                  var3 += 15;
                  var36 = 277;
                  var28 = Login.loginBoxCenter + -117;
                  boolean var38 = Client.Login_isUsernameRemembered;
                  boolean var13 = Login.field900;
                  IndexedSprite var53 = var38 ? (var13 ? KitDefinition.field1941 : Login.options_buttons_2Sprite) : (var13 ? ArchiveLoader.field1017 : Login.options_buttons_0Sprite);
                  var53.drawAt(var28, var36);
                  var28 = var28 + var53.subWidth + 5;
                  var1.draw("Remember username", var28, var36 + 13, 16776960, 0);
                  var28 = Login.loginBoxCenter + 24;
                  boolean var16 = WorldMapSectionType.clientPreferences.method2429();
                  boolean var17 = Login.field913;
                  IndexedSprite var15 = var16 ? (var17 ? KitDefinition.field1941 : Login.options_buttons_2Sprite) : (var17 ? ArchiveLoader.field1017 : Login.options_buttons_0Sprite);
                  var15.drawAt(var28, var36);
                  var28 = var28 + var15.subWidth + 5;
                  var1.draw("Hide username", var28, var36 + 13, 16776960, 0);
                  var3 = var36 + 15;
                  var18 = Login.loginBoxCenter - 80;
                  var19 = 321;
                  Login.titlebuttonSprite.drawAt(var18 - 73, var19 - 20);
                  var0.drawCentered("Login", var18, var19 + 5, 16777215, 0);
                  var18 = Login.loginBoxCenter + 80;
                  Login.titlebuttonSprite.drawAt(var18 - 73, var19 - 20);
                  var0.drawCentered("Cancel", var18, var19 + 5, 16777215, 0);
                  var36 = 357;
                  switch (Login.field887) {
                     case 2:
                        InvDefinition.field1884 = "Having trouble logging in?";
                        break;
                     default:
                        InvDefinition.field1884 = "Can't login? Click here.";
                  }

                  WorldMapSectionType.field2932 = new Bounds(Login.loginBoxCenter, var36, var1.stringWidth(InvDefinition.field1884), 11);
                  DevicePcmPlayerProvider.field118 = new Bounds(Login.loginBoxCenter, var36, var1.stringWidth("Still having trouble logging in?"), 11);
                  var1.drawCentered(InvDefinition.field1884, Login.loginBoxCenter, var36, 16777215, 0);
               } else if (Login.loginIndex == 3) {
                  var36 = 201;
                  var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var36, 16776960, 0);
                  var3 = var36 + 20;
                  var1.drawCentered("You may need to use the Jagex Launcher to continue playing.", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 20;
                  var1.drawCentered("<col=ffd200>Download it here.</col>", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var4 = Login.loginBoxX + 180;
                  var23 = 276;
                  Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                  var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
                  var4 = Login.loginBoxX + 180;
                  var23 = 326;
                  Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                  var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
               } else if (Login.loginIndex == 4) {
                  var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                  var36 = 236;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var36, 16777215, 0);
                  var3 = var36 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var5 = "PIN: ";
                  var7 = NetFileRequest.otp;
                  var9 = var7.length();
                  var10 = new char[var9];

                  for(var11 = 0; var11 < var9; ++var11) {
                     var10[var11] = '*';
                  }

                  var8 = new String(var10);
                  var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
                  var3 -= 8;
                  var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var3 += 15;
                  var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var26 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
                  var9 = var3 - var0.ascent;
                  IndexedSprite var37;
                  if (Login.field914) {
                     var37 = Login.options_buttons_2Sprite;
                  } else {
                     var37 = Login.options_buttons_0Sprite;
                  }

                  var37.drawAt(var26, var9);
                  var3 += 15;
                  var11 = Login.loginBoxX + 180 - 80;
                  short var40 = 321;
                  Login.titlebuttonSprite.drawAt(var11 - 73, var40 - 20);
                  var0.drawCentered("Continue", var11, var40 + 5, 16777215, 0);
                  var11 = Login.loginBoxX + 180 + 80;
                  Login.titlebuttonSprite.drawAt(var11 - 73, var40 - 20);
                  var0.drawCentered("Cancel", var11, var40 + 5, 16777215, 0);
                  var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var40 + 36, 255, 0);
               } else if (Login.loginIndex == 5) {
                  var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                  var36 = 221;
                  var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var36, 16776960, 0);
                  var3 = var36 + 15;
                  var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 14;
                  var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3, 16777215, 0);
                  var35 = 174;

                  for(var5 = UserComparator3.method2868(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
                  var3 += 15;
                  var27 = Login.loginBoxX + 180 - 80;
                  var25 = 321;
                  Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
                  var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
                  var27 = Login.loginBoxX + 180 + 80;
                  Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
                  var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
                  var25 = 356;
                  var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var25, 268435455, 0);
               } else if (Login.loginIndex == 6) {
                  var36 = 201;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var36, 16776960, 0);
                  var3 = var36 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var4 = Login.loginBoxX + 180;
                  var23 = 321;
                  Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                  var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
               } else if (Login.loginIndex == 7) {
                  if (class157.field1742 && !Client.onMobile) {
                     var36 = 201;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var36, 16776960, 0);
                     var3 = var36 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var3, 16776960, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var3, 16776960, 0);
                     var4 = Login.loginBoxCenter - 150;
                     var3 += 10;

                     for(var23 = 0; var23 < 8; ++var23) {
                        Login.titlebuttonSprite.method9034(var4, var3, 30, 40);
                        boolean var49 = var23 == Login.field909 & Client.cycle % 40 < 20;
                        var0.draw((Login.field908[var23] == null ? "" : Login.field908[var23]) + (var49 ? Canvas.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
                        if (var23 != 1 && var23 != 3) {
                           var4 += 35;
                        } else {
                           var4 += 50;
                           var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
                        }
                     }

                     var23 = Login.loginBoxCenter - 80;
                     short var50 = 321;
                     Login.titlebuttonSprite.drawAt(var23 - 73, var50 - 20);
                     var0.drawCentered("Submit", var23, var50 + 5, 16777215, 0);
                     var23 = Login.loginBoxCenter + 80;
                     Login.titlebuttonSprite.drawAt(var23 - 73, var50 - 20);
                     var0.drawCentered("Cancel", var23, var50 + 5, 16777215, 0);
                  } else {
                     var36 = 216;
                     var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var36, 16776960, 0);
                     var3 = var36 + 15;
                     var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var23 = 321;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                     var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                     var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
                  }
               } else {
                  short var46;
                  if (Login.loginIndex == 8) {
                     var36 = 216;
                     var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var36, 16776960, 0);
                     var3 = var36 + 15;
                     var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var46 = 321;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var46 - 20);
                     var0.drawCentered("Privacy Policy", var4, var46 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var46 - 20);
                     var0.drawCentered("Back", var4, var46 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 9) {
                     var36 = 221;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var36, 16776960, 0);
                     var3 = var36 + 25;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 25;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var4 = Login.loginBoxX + 180;
                     var46 = 311;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var46 - 20);
                     var0.drawCentered("Try again", var4, var46 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 10) {
                     var3 = Login.loginBoxX + 180;
                     var35 = 209;
                     var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0);
                     var4 = var35 + 20;
                     GrandExchangeOfferOwnWorldComparator.field478.drawAt(var3 - 109, var4);
                     if (Login.field911.isEmpty()) {
                        class72.field882.drawAt(var3 - 48, var4 + 18);
                     } else {
                        class72.field882.drawAt(var3 - 48, var4 + 5);
                        var0.drawCentered(Login.field911, var3, var4 + 68 - 15, 16776960, 0);
                     }
                  } else if (Login.loginIndex == 12) {
                     var3 = Login.loginBoxCenter;
                     var35 = 216;
                     var2.drawCentered("Before using this app, please read and accept our", var3, var35, 16777215, 0);
                     var4 = var35 + 17;
                     var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
                     var4 += 17;
                     var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
                     var4 += 17;
                     var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
                     var3 = Login.loginBoxCenter - 80;
                     var35 = 311;
                     Login.titlebuttonSprite.drawAt(var3 - 73, var35 - 20);
                     var0.drawCentered("Accept", var3, var35 + 5, 16777215, 0);
                     var3 = Login.loginBoxCenter + 80;
                     Login.titlebuttonSprite.drawAt(var3 - 73, var35 - 20);
                     var0.drawCentered("Decline", var3, var35 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 13) {
                     var36 = 231;
                     var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var36, 16777215, 0);
                     var3 = var36 + 20;
                     var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3, 16777215, 0);
                     var4 = Login.loginBoxX + 180;
                     var36 = 311;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Back", var4, var36 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 14) {
                     var36 = 201;
                     String var24 = "";
                     var5 = "";
                     var6 = "";
                     switch (Login.Login_banType) {
                        case 0:
                           var24 = "Your account has been involved";
                           var5 = "in serious rule breaking.";
                           var6 = "";
                           break;
                        case 1:
                           var24 = "Your account has been locked due to";
                           var5 = "suspicious activity.";
                           var6 = "Please recover your account.";
                           break;
                        case 2:
                           var24 = "The unpaid balance on your account needs";
                           var5 = "to be resolved before you can play.";
                           var6 = Strings.field3882;
                           break;
                        default:
                           FontName.Login_promptCredentials(false);
                     }

                     var0.drawCentered(var24, Login.loginBoxX + 180, var36, 16776960, 0);
                     var3 = var36 + 20;
                     var0.drawCentered(var5, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 20;
                     var0.drawCentered(var6, Login.loginBoxX + 180, var3, 16776960, 0);
                     var25 = Login.loginBoxX + 180;
                     short var47 = 276;
                     Login.titlebuttonSprite.drawAt(var25 - 73, var47 - 20);
                     if (Login.Login_banType == 1) {
                        var0.drawCentered("Recover Account", var25, var47 + 5, 16777215, 0);
                     } else {
                        var0.drawCentered("View Appeal Options", var25, var47 + 5, 16777215, 0);
                     }

                     var25 = Login.loginBoxX + 180;
                     var47 = 326;
                     Login.titlebuttonSprite.drawAt(var25 - 73, var47 - 20);
                     var0.drawCentered("Back", var25, var47 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 24) {
                     var36 = 221;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var36, 16777215, 0);
                     var3 = var36 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180;
                     var46 = 301;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var46 - 20);
                     var0.drawCentered("Ok", var4, var46 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 26) {
                     var36 = 216;
                     var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var36, 16776960, 0);
                     var3 = var36 + 15;
                     var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var46 = 321;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var46 - 20);
                     var0.drawCentered("Set Date of Birth", var4, var46 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var46 - 20);
                     var0.drawCentered("Back", var4, var46 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var31 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var31);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class143.canvasHeight);
            ArchiveDiskActionHandler.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
            ArchiveDiskActionHandler.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var31);
         }

         class139.title_muteSprite[WorldMapSectionType.clientPreferences.method2445() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && Language.Language_EN == class69.clientLanguage) {
            if (FriendSystem.field801 != null) {
               var3 = Login.xPadding + 5;
               var35 = 463;
               byte var48 = 100;
               byte var51 = 35;
               FriendSystem.field801.drawAt(var3, var35);
               var0.drawCentered("World" + " " + Client.worldId, var48 / 2 + var3, var51 / 2 + var35 - 2, 16777215, 0);
               if (class16.World_request != null) {
                  var1.drawCentered("Loading...", var48 / 2 + var3, var51 / 2 + var35 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var48 / 2 + var3, var51 / 2 + var35 + 12, 16777215, 0);
               }
            } else {
               FriendSystem.field801 = class368.SpriteBuffer_getIndexedSpriteByName(class143.archive8, "sl_button", "");
            }
         }

      }
   }
}
