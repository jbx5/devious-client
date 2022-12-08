import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class199 implements class30 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   Widget field2305 = null;
   @ObfuscatedName("e")
   boolean field2304 = false;
   @ObfuscatedName("v")
   boolean field2306 = false;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1119176744"
   )
   public boolean vmethod4138(int var1) {
      if (this.field2305 == null) {
         return false;
      } else {
         class28 var2 = this.field2305.method6187();
         if (var2 == null) {
            return false;
         } else {
            if (var2.method401(var1)) {
               switch (var1) {
                  case 81:
                     this.field2306 = true;
                     break;
                  case 82:
                     this.field2304 = true;
                     break;
                  default:
                     if (this.method4073(var1)) {
                        class69.invalidateWidget(this.field2305);
                     }
               }
            }

            return var2.method422(var1);
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-916991313"
   )
   public boolean vmethod4099(int var1) {
      switch (var1) {
         case 81:
            this.field2306 = false;
            return false;
         case 82:
            this.field2304 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-258182"
   )
   public boolean vmethod4097(char var1) {
      if (this.field2305 == null) {
         return false;
      } else if (!ObjectSound.method1871(var1)) {
         return false;
      } else {
         class303 var2 = this.field2305.method6167();
         if (var2 != null && var2.method6062()) {
            class28 var3 = this.field2305.method6187();
            if (var3 == null) {
               return false;
            } else {
               if (var3.method411(var1) && var2.method5897(var1)) {
                  class69.invalidateWidget(this.field2305);
               }

               return var3.method398(var1);
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "333814410"
   )
   public boolean vmethod4102(boolean var1) {
      return false;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)V",
      garbageValue = "-158178523"
   )
   public void method4066(Widget var1) {
      this.method4068();
      if (var1 != null) {
         this.field2305 = var1;
         class301 var2 = var1.method6185();
         if (var2 != null) {
            var2.field3466.method5880(true);
            if (var2.field3467 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2255(var1);
               var3.setArgs(var2.field3467);
               AABB.method4611().addFirst(var3);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)Lkd;",
      garbageValue = "11"
   )
   public Widget method4067() {
      return this.field2305;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-73"
   )
   public void method4068() {
      if (this.field2305 != null) {
         class301 var1 = this.field2305.method6185();
         Widget var2 = this.field2305;
         this.field2305 = null;
         if (var1 != null) {
            var1.field3466.method5880(false);
            if (var1.field3467 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2255(var2);
               var3.setArgs(var1.field3467);
               AABB.method4611().addFirst(var3);
            }

         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "175543627"
   )
   boolean method4073(int var1) {
      if (this.field2305 == null) {
         return false;
      } else {
         class303 var2 = this.field2305.method6167();
         if (var2 != null && var2.method6062()) {
            Clipboard var5;
            switch (var1) {
               case 13:
                  this.method4068();
                  return true;
               case 48:
                  if (this.field2304) {
                     var2.method6116();
                  }

                  return true;
               case 65:
                  if (this.field2304) {
                     var5 = BuddyRankComparator.client.method498();
                     var2.method5922(var5);
                  }

                  return true;
               case 66:
                  if (this.field2304) {
                     var5 = BuddyRankComparator.client.method498();
                     var2.method6034(var5);
                  }

                  return true;
               case 67:
                  if (this.field2304) {
                     var5 = BuddyRankComparator.client.method498();
                     var2.method5923(var5);
                  }

                  return true;
               case 84:
                  if (var2.method5942() == 0) {
                     var2.method5897(10);
                  } else if (this.field2306 && var2.method5946()) {
                     var2.method5897(10);
                  } else {
                     class301 var3 = this.field2305.method6185();
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method2255(this.field2305);
                     var4.setArgs(var3.field3465);
                     AABB.method4611().addFirst(var4);
                     this.method4068();
                  }

                  return true;
               case 85:
                  if (this.field2304) {
                     var2.method5900();
                  } else {
                     var2.method5898();
                  }

                  return true;
               case 96:
                  if (this.field2304) {
                     var2.method5911(this.field2306);
                  } else {
                     var2.method5909(this.field2306);
                  }

                  return true;
               case 97:
                  if (this.field2304) {
                     var2.method5903(this.field2306);
                  } else {
                     var2.method5910(this.field2306);
                  }

                  return true;
               case 98:
                  if (this.field2304) {
                     var2.method5924();
                  } else {
                     var2.method6028(this.field2306);
                  }

                  return true;
               case 99:
                  if (this.field2304) {
                     var2.method6001();
                  } else {
                     var2.method5935(this.field2306);
                  }

                  return true;
               case 101:
                  if (this.field2304) {
                     var2.method5901();
                  } else {
                     var2.method5899();
                  }

                  return true;
               case 102:
                  if (this.field2304) {
                     var2.method5907(this.field2306);
                  } else {
                     var2.method6143(this.field2306);
                  }

                  return true;
               case 103:
                  if (this.field2304) {
                     var2.method5908(this.field2306);
                  } else {
                     var2.method5906(this.field2306);
                  }

                  return true;
               case 104:
                  if (this.field2304) {
                     var2.method5917(this.field2306);
                  } else {
                     var2.method5915(this.field2306);
                  }

                  return true;
               case 105:
                  if (this.field2304) {
                     var2.method5918(this.field2306);
                  } else {
                     var2.method5916(this.field2306);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lnv;Lnv;Lnv;I)V",
      garbageValue = "-672132656"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (CollisionMap.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      UrlRequest.loginBoxCenter = Login.loginBoxX + 180;
      int var3;
      int var4;
      int var8;
      int var10;
      int var11;
      int var23;
      int var25;
      int var38;
      if (Login.worldSelectOpen) {
         Archive var37;
         if (GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites == null) {
            var37 = ClientPreferences.archive8;
            var23 = var37.getGroupId("sl_back");
            var38 = var37.getFileId(var23, "");
            SpritePixels[] var40 = SequenceDefinition.method4064(var37, var23, var38);
            GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites = var40;
         }

         IndexedSprite[] var41;
         if (class87.worldSelectFlagSprites == null) {
            var37 = ClientPreferences.archive8;
            var23 = var37.getGroupId("sl_flags");
            var38 = var37.getFileId(var23, "");
            var41 = AbstractWorldMapData.method5238(var37, var23, var38);
            class87.worldSelectFlagSprites = var41;
         }

         if (FloorDecoration.worldSelectArrows == null) {
            var37 = ClientPreferences.archive8;
            var23 = var37.getGroupId("sl_arrows");
            var38 = var37.getFileId(var23, "");
            var41 = AbstractWorldMapData.method5238(var37, var23, var38);
            FloorDecoration.worldSelectArrows = var41;
         }

         if (class280.worldSelectStars == null) {
            var37 = ClientPreferences.archive8;
            var23 = var37.getGroupId("sl_stars");
            var38 = var37.getFileId(var23, "");
            var41 = AbstractWorldMapData.method5238(var37, var23, var38);
            class280.worldSelectStars = var41;
         }

         if (BufferedNetSocket.worldSelectLeftSprite == null) {
            BufferedNetSocket.worldSelectLeftSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(ClientPreferences.archive8, "leftarrow", "");
         }

         if (class140.worldSelectRightSprite == null) {
            class140.worldSelectRightSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(ClientPreferences.archive8, "rightarrow", "");
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
         var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
         if (class280.worldSelectStars != null) {
            class280.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
            var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
            class280.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
            var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
         }

         if (FloorDecoration.worldSelectArrows != null) {
            var3 = Login.xPadding + 280;
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
               FloorDecoration.worldSelectArrows[2].drawAt(var3, 4);
            } else {
               FloorDecoration.worldSelectArrows[0].drawAt(var3, 4);
            }

            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
               FloorDecoration.worldSelectArrows[3].drawAt(var3 + 15, 4);
            } else {
               FloorDecoration.worldSelectArrows[1].drawAt(var3 + 15, 4);
            }

            var0.draw("World", var3 + 32, 17, 16777215, -1);
            var4 = Login.xPadding + 390;
            if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
               FloorDecoration.worldSelectArrows[2].drawAt(var4, 4);
            } else {
               FloorDecoration.worldSelectArrows[0].drawAt(var4, 4);
            }

            if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
               FloorDecoration.worldSelectArrows[3].drawAt(var4 + 15, 4);
            } else {
               FloorDecoration.worldSelectArrows[1].drawAt(var4 + 15, 4);
            }

            var0.draw("Players", var4 + 32, 17, 16777215, -1);
            var23 = Login.xPadding + 500;
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
               FloorDecoration.worldSelectArrows[2].drawAt(var23, 4);
            } else {
               FloorDecoration.worldSelectArrows[0].drawAt(var23, 4);
            }

            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
               FloorDecoration.worldSelectArrows[3].drawAt(var23 + 15, 4);
            } else {
               FloorDecoration.worldSelectArrows[1].drawAt(var23 + 15, 4);
            }

            var0.draw("Location", var23 + 32, 17, 16777215, -1);
            var38 = Login.xPadding + 610;
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
               FloorDecoration.worldSelectArrows[2].drawAt(var38, 4);
            } else {
               FloorDecoration.worldSelectArrows[0].drawAt(var38, 4);
            }

            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
               FloorDecoration.worldSelectArrows[3].drawAt(var38 + 15, 4);
            } else {
               FloorDecoration.worldSelectArrows[1].drawAt(var38 + 15, 4);
            }

            var0.draw("Type", var38 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
         var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
         Login.hoveredWorldIndex = -1;
         if (GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites != null) {
            byte var43 = 88;
            byte var34 = 19;
            var23 = 765 / (var43 + 1) - 1;
            var38 = 480 / (var34 + 1);

            do {
               var25 = var38;
               var8 = var23;
               if (var38 * (var23 - 1) >= World.World_count) {
                  --var23;
               }

               if (var23 * (var38 - 1) >= World.World_count) {
                  --var38;
               }

               if (var23 * (var38 - 1) >= World.World_count) {
                  --var38;
               }
            } while(var38 != var25 || var23 != var8);

            var25 = (765 - var23 * var43) / (var23 + 1);
            if (var25 > 5) {
               var25 = 5;
            }

            var8 = (480 - var34 * var38) / (var38 + 1);
            if (var8 > 5) {
               var8 = 5;
            }

            int var28 = (765 - var23 * var43 - var25 * (var23 - 1)) / 2;
            var10 = (480 - var34 * var38 - var8 * (var38 - 1)) / 2;
            var11 = (var38 + World.World_count - 1) / var38;
            Login.worldSelectPagesCount = var11 - var23;
            if (BufferedNetSocket.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
               BufferedNetSocket.worldSelectLeftSprite.drawAt(8, Language.canvasHeight / 2 - BufferedNetSocket.worldSelectLeftSprite.subHeight / 2);
            }

            if (class140.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
               class140.worldSelectRightSprite.drawAt(CollisionMap.canvasWidth - class140.worldSelectRightSprite.subWidth - 8, Language.canvasHeight / 2 - class140.worldSelectRightSprite.subHeight / 2);
            }

            int var12 = var10 + 23;
            int var13 = var28 + Login.xPadding;
            int var14 = 0;
            boolean var15 = false;
            int var16 = Login.worldSelectPage;

            int var17;
            for(var17 = var16 * var38; var17 < World.World_count && var16 - Login.worldSelectPage < var23; ++var17) {
               World var18 = World.World_worlds[var17];
               boolean var19 = true;
               String var20 = Integer.toString(var18.population);
               if (var18.population == -1) {
                  var20 = "OFF";
                  var19 = false;
               } else if (var18.population > 1980) {
                  var20 = "FULL";
                  var19 = false;
               }

               int var21 = -1;
               int var22 = 0;
               if (var18.isBeta()) {
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1390.field1397;
                  } else {
                     var21 = class104.field1389.field1397;
                  }
               } else if (var18.isDeadman()) {
                  var22 = 16711680;
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1388.field1397;
                  } else {
                     var21 = class104.field1391.field1397;
                  }
               } else if (var18.method1806()) {
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1392.field1397;
                  } else {
                     var21 = class104.field1395.field1397;
                  }
               } else if (var18.isPvp()) {
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1386.field1397;
                  } else {
                     var21 = class104.field1385.field1397;
                  }
               } else if (var18.method1804()) {
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1387.field1397;
                  } else {
                     var21 = class104.field1394.field1397;
                  }
               } else if (var18.method1753()) {
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1396.field1397;
                  } else {
                     var21 = class104.field1393.field1397;
                  }
               }

               if (var21 == -1 || var21 >= GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites.length) {
                  if (var18.isMembersOnly()) {
                     var21 = class104.field1383.field1397;
                  } else {
                     var21 = class104.field1400.field1397;
                  }
               }

               if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var43 && MouseHandler.MouseHandler_y < var34 + var12 && var19) {
                  Login.hoveredWorldIndex = var17;
                  GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var12, 128, 16777215);
                  var15 = true;
               } else {
                  GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites[var21].drawAt(var13, var12);
               }

               if (class87.worldSelectFlagSprites != null) {
                  class87.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
               }

               var0.drawCentered(Integer.toString(var18.id), var13 + 15, var34 / 2 + var12 + 5, var22, -1);
               var1.drawCentered(var20, var13 + 60, var34 / 2 + var12 + 5, 268435455, -1);
               var12 = var12 + var8 + var34;
               ++var14;
               if (var14 >= var38) {
                  var12 = var10 + 23;
                  var13 = var13 + var25 + var43;
                  var14 = 0;
                  ++var16;
               }
            }

            if (var15) {
               var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
               int var29 = var1.ascent + 8;
               int var35 = MouseHandler.MouseHandler_y + 25;
               if (var29 + var35 > 480) {
                  var35 = MouseHandler.MouseHandler_y - 25 - var29;
               }

               Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var35, var17, var29, 16777120);
               Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var35, var17, var29, 0);
               var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var35 + var1.ascent + 4, 0, -1);
            }
         }

         RouteStrategy.rasterProvider.drawFull(0, 0);
      } else {
         SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0);
         class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
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
         String var6;
         String var7;
         short var30;
         if (Client.gameState == 20) {
            ModelData0.titleboxSprite.drawAt(Login.loginBoxX + 180 - ModelData0.titleboxSprite.subWidth / 2, 271 - ModelData0.titleboxSprite.subHeight / 2);
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
               var30 = 200;
               var5 = StructComposition.clientPreferences.method2413() ? TaskHandler.method3447(Login.Login_username) : Login.Login_username;

               for(var6 = var5; var0.stringWidth(var6) > var30; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
               var3 += 15;

               for(var7 = TaskHandler.method3447(Login.Login_password); var0.stringWidth(var7) > var30; var7 = var7.substring(1)) {
               }

               var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
            ModelData0.titleboxSprite.drawAt(Login.loginBoxX, 171);
            short var31;
            if (Login.loginIndex == 0) {
               var31 = 251;
               var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
               var3 = var31 + 30;
               var4 = Login.loginBoxX + 180 - 80;
               var23 = 291;
               Frames.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = Login.loginBoxX + 180 + 80;
               Frames.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
               var31 = 236;
               var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
               var3 = var31 + 15;
               var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180 - 80;
               var23 = 321;
               Frames.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180 + 80;
               Frames.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
            } else if (Login.loginIndex == 2) {
               var31 = 201;
               var0.drawCentered(Login.Login_response1, UrlRequest.loginBoxCenter, var31, 16776960, 0);
               var3 = var31 + 15;
               var0.drawCentered(Login.Login_response2, UrlRequest.loginBoxCenter, var3, 16776960, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, UrlRequest.loginBoxCenter, var3, 16776960, 0);
               var3 += 15;
               var3 += 7;
               var0.draw("Login: ", UrlRequest.loginBoxCenter - 110, var3, 16777215, 0);
               var30 = 200;
               var5 = StructComposition.clientPreferences.method2413() ? TaskHandler.method3447(Login.Login_username) : Login.Login_username;

               for(var6 = var5; var0.stringWidth(var6) > var30; var6 = var6.substring(1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), UrlRequest.loginBoxCenter - 70, var3, 16777215, 0);
               var3 += 15;

               for(var7 = TaskHandler.method3447(Login.Login_password); var0.stringWidth(var7) > var30; var7 = var7.substring(1)) {
               }

               var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), UrlRequest.loginBoxCenter - 108, var3, 16777215, 0);
               var3 += 15;
               var31 = 277;
               var8 = UrlRequest.loginBoxCenter + -117;
               IndexedSprite var9 = class143.method3132(Client.Login_isUsernameRemembered, Login.field939);
               var9.drawAt(var8, var31);
               var8 = var8 + var9.subWidth + 5;
               var1.draw("Remember username", var8, var31 + 13, 16776960, 0);
               var8 = UrlRequest.loginBoxCenter + 24;
               var9 = class143.method3132(StructComposition.clientPreferences.method2413(), Login.field955);
               var9.drawAt(var8, var31);
               var8 = var8 + var9.subWidth + 5;
               var1.draw("Hide username", var8, var31 + 13, 16776960, 0);
               var3 = var31 + 15;
               var10 = UrlRequest.loginBoxCenter - 80;
               var11 = 321;
               Frames.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
               var0.drawCentered("Login", var10, var11 + 5, 16777215, 0);
               var10 = UrlRequest.loginBoxCenter + 80;
               Frames.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
               var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0);
               var31 = 357;
               switch (Login.field928) {
                  case 2:
                     Login.field929 = "Having trouble logging in?";
                     break;
                  default:
                     Login.field929 = "Can't login? Click here.";
               }

               class379.field4467 = new Bounds(UrlRequest.loginBoxCenter, var31, var1.stringWidth(Login.field929), 11);
               class151.field1763 = new Bounds(UrlRequest.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
               var1.drawCentered(Login.field929, UrlRequest.loginBoxCenter, var31, 16777215, 0);
            } else if (Login.loginIndex == 3) {
               var31 = 201;
               var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0);
               var3 = var31 + 20;
               var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var3, 16776960, 0);
               var3 += 15;
               var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var3, 16776960, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180;
               var23 = 276;
               Frames.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180;
               var23 = 326;
               Frames.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
               var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
            } else {
               short var33;
               if (Login.loginIndex == 4) {
                  var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                  var31 = 236;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
                  var3 = var31 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var0.draw("PIN: " + TaskHandler.method3447(class141.otp) + (Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
                  var3 -= 8;
                  var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var3 += 15;
                  var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
                  var23 = var3 - var0.ascent;
                  IndexedSprite var32;
                  if (Login.field930) {
                     var32 = class89.options_buttons_2Sprite;
                  } else {
                     var32 = WorldMapLabel.options_buttons_0Sprite;
                  }

                  var32.drawAt(var4, var23);
                  var3 += 15;
                  var25 = Login.loginBoxX + 180 - 80;
                  var33 = 321;
                  Frames.titlebuttonSprite.drawAt(var25 - 73, var33 - 20);
                  var0.drawCentered("Continue", var25, var33 + 5, 16777215, 0);
                  var25 = Login.loginBoxX + 180 + 80;
                  Frames.titlebuttonSprite.drawAt(var25 - 73, var33 - 20);
                  var0.drawCentered("Cancel", var25, var33 + 5, 16777215, 0);
                  var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var33 + 36, 255, 0);
               } else if (Login.loginIndex == 5) {
                  var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                  var31 = 221;
                  var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
                  var3 = var31 + 15;
                  var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 14;
                  var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3, 16777215, 0);
                  var30 = 174;
                  var5 = StructComposition.clientPreferences.method2413() ? TaskHandler.method3447(Login.Login_username) : Login.Login_username;

                  for(var6 = var5; var0.stringWidth(var6) > var30; var6 = var6.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
                  var3 += 15;
                  var25 = Login.loginBoxX + 180 - 80;
                  var33 = 321;
                  Frames.titlebuttonSprite.drawAt(var25 - 73, var33 - 20);
                  var0.drawCentered("Recover", var25, var33 + 5, 16777215, 0);
                  var25 = Login.loginBoxX + 180 + 80;
                  Frames.titlebuttonSprite.drawAt(var25 - 73, var33 - 20);
                  var0.drawCentered("Back", var25, var33 + 5, 16777215, 0);
                  var33 = 356;
                  var1.drawCentered("Still having trouble logging in?", UrlRequest.loginBoxCenter, var33, 268435455, 0);
               } else {
                  short var36;
                  if (Login.loginIndex == 6) {
                     var31 = 201;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
                     var3 = var31 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180;
                     var36 = 321;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Back", var4, var36 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 7) {
                     if (class155.field1785 && !Client.onMobile) {
                        var31 = 201;
                        var0.drawCentered(Login.Login_response1, UrlRequest.loginBoxCenter, var31, 16776960, 0);
                        var3 = var31 + 15;
                        var0.drawCentered(Login.Login_response2, UrlRequest.loginBoxCenter, var3, 16776960, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, UrlRequest.loginBoxCenter, var3, 16776960, 0);
                        var4 = UrlRequest.loginBoxCenter - 150;
                        var3 += 10;

                        for(var23 = 0; var23 < 8; ++var23) {
                           Frames.titlebuttonSprite.method8993(var4, var3, 30, 40);
                           boolean var26 = var23 == Login.field938 & Client.cycle % 40 < 20;
                           var0.draw((Login.field915[var23] == null ? "" : Login.field915[var23]) + (var26 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
                           if (var23 != 1 && var23 != 3) {
                              var4 += 35;
                           } else {
                              var4 += 50;
                              var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
                           }
                        }

                        var23 = UrlRequest.loginBoxCenter - 80;
                        var38 = 321;
                        Frames.titlebuttonSprite.drawAt(var23 - 73, var38 - 20);
                        var0.drawCentered("Submit", var23, var38 + 5, 16777215, 0);
                        var23 = UrlRequest.loginBoxCenter + 80;
                        Frames.titlebuttonSprite.drawAt(var23 - 73, var38 - 20);
                        var0.drawCentered("Cancel", var23, var38 + 5, 16777215, 0);
                     } else {
                        var31 = 216;
                        var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
                        var3 = var31 + 15;
                        var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var36 = 321;
                        Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                        var0.drawCentered("Set Date of Birth", var4, var36 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                        var0.drawCentered("Back", var4, var36 + 5, 16777215, 0);
                     }
                  } else if (Login.loginIndex == 8) {
                     var31 = 216;
                     var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
                     var3 = var31 + 15;
                     var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var36 = 321;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Privacy Policy", var4, var36 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Back", var4, var36 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 9) {
                     var31 = 221;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
                     var3 = var31 + 25;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 25;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var4 = Login.loginBoxX + 180;
                     var36 = 311;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Try again", var4, var36 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 10) {
                     var3 = Login.loginBoxX + 180;
                     var30 = 209;
                     var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var30, 16776960, 0);
                     var4 = var30 + 20;
                     class299.field3457.drawAt(var3 - 109, var4);
                     class150.field1756.drawAt(var3 - 48, var4 + 18);
                  } else if (Login.loginIndex == 12) {
                     var3 = UrlRequest.loginBoxCenter;
                     var30 = 216;
                     var2.drawCentered("Before using this app, please read and accept our", var3, var30, 16777215, 0);
                     var4 = var30 + 17;
                     var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
                     var4 += 17;
                     var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
                     var4 += 17;
                     var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
                     var3 = UrlRequest.loginBoxCenter - 80;
                     var30 = 311;
                     Frames.titlebuttonSprite.drawAt(var3 - 73, var30 - 20);
                     var0.drawCentered("Accept", var3, var30 + 5, 16777215, 0);
                     var3 = UrlRequest.loginBoxCenter + 80;
                     Frames.titlebuttonSprite.drawAt(var3 - 73, var30 - 20);
                     var0.drawCentered("Decline", var3, var30 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 13) {
                     var31 = 231;
                     var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0);
                     var3 = var31 + 20;
                     var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3, 16777215, 0);
                     var4 = Login.loginBoxX + 180;
                     var31 = 311;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var31 - 20);
                     var0.drawCentered("Back", var4, var31 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 14) {
                     var31 = 201;
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
                           var24 = "Account locked as we suspect it has been stolen.";
                           var5 = Strings.field3910;
                           var6 = "";
                           break;
                        case 2:
                           var24 = "The unpaid balance on your account needs";
                           var5 = "to be resolved before you can play.";
                           var6 = Strings.field3947;
                           break;
                        default:
                           class343.Login_promptCredentials(false);
                     }

                     var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
                     var3 = var31 + 20;
                     var0.drawCentered(var5, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 20;
                     var0.drawCentered(var6, Login.loginBoxX + 180, var3, 16776960, 0);
                     var25 = Login.loginBoxX + 180;
                     var33 = 276;
                     Frames.titlebuttonSprite.drawAt(var25 - 73, var33 - 20);
                     var0.drawCentered("Support Page", var25, var33 + 5, 16777215, 0);
                     var25 = Login.loginBoxX + 180;
                     var33 = 326;
                     Frames.titlebuttonSprite.drawAt(var25 - 73, var33 - 20);
                     var0.drawCentered("Back", var25, var33 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 24) {
                     var31 = 221;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
                     var3 = var31 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180;
                     var36 = 301;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Ok", var4, var36 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 26) {
                     var31 = 216;
                     var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
                     var3 = var31 + 15;
                     var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var36 = 321;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Set Date of Birth", var4, var36 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     Frames.titlebuttonSprite.drawAt(var4 - 73, var36 - 20);
                     var0.drawCentered("Back", var4, var36 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var27 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var27);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, Language.canvasHeight);
            class154.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
            class154.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var27);
         }

         class109.title_muteSprite[StructComposition.clientPreferences.method2428() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && class173.clientLanguage == Language.Language_EN) {
            if (class98.field1340 != null) {
               var3 = Login.xPadding + 5;
               var30 = 463;
               byte var42 = 100;
               byte var39 = 35;
               class98.field1340.drawAt(var3, var30);
               var0.drawCentered("World" + " " + Client.worldId, var42 / 2 + var3, var39 / 2 + var30 - 2, 16777215, 0);
               if (class1.World_request != null) {
                  var1.drawCentered("Loading...", var42 / 2 + var3, var39 / 2 + var30 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var42 / 2 + var3, var39 / 2 + var30 + 12, 16777215, 0);
               }
            } else {
               class98.field1340 = Projectile.SpriteBuffer_getIndexedSpriteByName(ClientPreferences.archive8, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "1920337009"
   )
   static int method4091(int var0, Script var1, boolean var2) {
      return 2;
   }
}
