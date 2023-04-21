import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public enum class6 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Laq;"
   )
   field17(0, 0);

   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1098467785
   )
   final int field18;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -754086667
   )
   final int field16;

   class6(int var3, int var4) {
      this.field18 = var3;
      this.field16 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field16;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1788010106"
   )
   static int method46() {
      return Rasterizer3D.clips.field2797;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1620071571"
   )
   @Export("Login_promptCredentials")
   static void Login_promptCredentials(boolean var0) {
      if (!ScriptFrame.client.method1431() && !ScriptFrame.client.method1235() && !ScriptFrame.client.method1234()) {
         Login.Login_response1 = "";
         Login.Login_response2 = "Enter your username/email & password.";
         Login.Login_response3 = "";
         class129.method3124(2);
         if (var0) {
            Login.Login_password = "";
         }

         WallDecoration.method5025();
         if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
            Login.currentLoginField = 1;
         } else {
            Login.currentLoginField = 0;
         }

      } else {
         class129.method3124(10);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lon;Lon;Lon;I)V",
      garbageValue = "-1602531743"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      class143.loginBoxCenter = Login.loginBoxX + 180;
      if (Login.worldSelectOpen) {
         Decimator.method1127(var0, var1);
      } else {
         class123.leftTitleSprite.drawAt(Login.xPadding, 0);
         ParamComposition.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
         int var3;
         int var4;
         if (Client.gameState == 0 || Client.gameState == 5) {
            var3 = 20;
            var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
            var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
         }

         String var5;
         String var6;
         short var22;
         if (Client.gameState == 20) {
            Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
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
               var22 = 200;

               for(var5 = class18.method287(); var0.stringWidth(var5) > var22; var5 = var5.substring(0, var5.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
               var3 += 15;

               for(var6 = WorldMapDecorationType.method6573(Login.Login_password); var0.stringWidth(var6) > var22; var6 = var6.substring(1)) {
               }

               var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
            Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
            int var17;
            short var23;
            if (Login.loginIndex == 0) {
               var23 = 251;
               var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
               var3 = var23 + 30;
               var4 = Login.loginBoxX + 180 - 80;
               var17 = 291;
               class292.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
               var0.drawLines("New User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = Login.loginBoxX + 180 + 80;
               class292.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
               var0.drawLines("Existing User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
               var23 = 236;
               var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
               var3 = var23 + 15;
               var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180 - 80;
               var17 = 321;
               class292.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
               var0.drawCentered("Continue", var4, var17 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180 + 80;
               class292.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
               var0.drawCentered("Cancel", var4, var17 + 5, 16777215, 0);
            } else {
               int var7;
               if (Login.loginIndex == 2) {
                  var23 = 201;
                  var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var23, 16776960, 0);
                  var3 = var23 + 15;
                  var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 7;
                  var0.draw("Login: ", class143.loginBoxCenter - 110, var3, 16777215, 0);
                  var22 = 200;

                  for(var5 = class18.method287(); var0.stringWidth(var5) > var22; var5 = var5.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 70, var3, 16777215, 0);
                  var3 += 15;

                  for(var6 = WorldMapDecorationType.method6573(Login.Login_password); var0.stringWidth(var6) > var22; var6 = var6.substring(1)) {
                  }

                  var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 108, var3, 16777215, 0);
                  var3 += 15;
                  var23 = 277;
                  var7 = class143.loginBoxCenter + -117;
                  boolean var9 = Client.Login_isUsernameRemembered;
                  boolean var10 = Login.field890;
                  IndexedSprite var20 = var9 ? (var10 ? Login.field907 : class158.options_buttons_2Sprite) : (var10 ? Login.field893 : Login.options_buttons_0Sprite);
                  var20.drawAt(var7, var23);
                  var7 = var7 + var20.subWidth + 5;
                  var1.draw("Remember username", var7, var23 + 13, 16776960, 0);
                  var7 = class143.loginBoxCenter + 24;
                  boolean var13 = class20.clientPreferences.method2450();
                  boolean var14 = Login.field902;
                  IndexedSprite var12 = var13 ? (var14 ? Login.field907 : class158.options_buttons_2Sprite) : (var14 ? Login.field893 : Login.options_buttons_0Sprite);
                  var12.drawAt(var7, var23);
                  var7 = var7 + var12.subWidth + 5;
                  var1.draw("Hide username", var7, var23 + 13, 16776960, 0);
                  var3 = var23 + 15;
                  int var15 = class143.loginBoxCenter - 80;
                  short var16 = 321;
                  class292.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
                  var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
                  var15 = class143.loginBoxCenter + 80;
                  class292.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
                  var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
                  var23 = 357;
                  switch (Login.field916) {
                     case 2:
                        class18.field97 = "Having trouble logging in?";
                        break;
                     default:
                        class18.field97 = "Can't login? Click here.";
                  }

                  class96.field1295 = new Bounds(class143.loginBoxCenter, var23, var1.stringWidth(class18.field97), 11);
                  class19.field103 = new Bounds(class143.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11);
                  var1.drawCentered(class18.field97, class143.loginBoxCenter, var23, 16777215, 0);
               } else if (Login.loginIndex == 3) {
                  var23 = 201;
                  var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0);
                  var3 = var23 + 20;
                  var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 20;
                  var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var4 = Login.loginBoxX + 180;
                  var17 = 276;
                  class292.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
                  var2.drawCentered("Try again", var4, var17 + 5, 16777215, 0);
                  var4 = Login.loginBoxX + 180;
                  var17 = 326;
                  class292.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
                  var2.drawCentered("Forgotten password?", var4, var17 + 5, 16777215, 0);
               } else {
                  short var8;
                  if (Login.loginIndex == 4) {
                     var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                     var23 = 236;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
                     var3 = var23 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var0.draw("PIN: " + WorldMapDecorationType.method6573(Messages.otp) + (Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
                     var3 -= 8;
                     var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                     var3 += 15;
                     var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                     var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
                     var17 = var3 - var0.ascent;
                     IndexedSprite var24;
                     if (Login.field914) {
                        var24 = class158.options_buttons_2Sprite;
                     } else {
                        var24 = Login.options_buttons_0Sprite;
                     }

                     var24.drawAt(var4, var17);
                     var3 += 15;
                     var7 = Login.loginBoxX + 180 - 80;
                     var8 = 321;
                     class292.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
                     var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
                     var7 = Login.loginBoxX + 180 + 80;
                     class292.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
                     var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
                     var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
                  } else if (Login.loginIndex == 5) {
                     var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                     var23 = 221;
                     var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
                     var3 = var23 + 15;
                     var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var3 += 14;
                     var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3, 16777215, 0);
                     var22 = 174;

                     for(var5 = class18.method287(); var0.stringWidth(var5) > var22; var5 = var5.substring(1)) {
                     }

                     var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
                     var3 += 15;
                     int var19 = Login.loginBoxX + 180 - 80;
                     short var25 = 321;
                     class292.titlebuttonSprite.drawAt(var19 - 73, var25 - 20);
                     var0.drawCentered("Recover", var19, var25 + 5, 16777215, 0);
                     var19 = Login.loginBoxX + 180 + 80;
                     class292.titlebuttonSprite.drawAt(var19 - 73, var25 - 20);
                     var0.drawCentered("Back", var19, var25 + 5, 16777215, 0);
                     var25 = 356;
                     var1.drawCentered("Still having trouble logging in?", class143.loginBoxCenter, var25, 268435455, 0);
                  } else {
                     short var26;
                     if (Login.loginIndex == 6) {
                        var23 = 201;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
                        var3 = var23 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180;
                        var26 = 321;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Back", var4, var26 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 7) {
                        if (WorldMapSectionType.field2983 && !Client.onMobile) {
                           var23 = 201;
                           var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var23, 16776960, 0);
                           var3 = var23 + 15;
                           var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var3, 16776960, 0);
                           var3 += 15;
                           var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var3, 16776960, 0);
                           var4 = class143.loginBoxCenter - 150;
                           var3 += 10;

                           for(var17 = 0; var17 < 8; ++var17) {
                              class292.titlebuttonSprite.method9492(var4, var3, 30, 40);
                              boolean var27 = var17 == Login.field909 & Client.cycle % 40 < 20;
                              var0.draw((Login.field910[var17] == null ? "" : Login.field910[var17]) + (var27 ? class383.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
                              if (var17 != 1 && var17 != 3) {
                                 var4 += 35;
                              } else {
                                 var4 += 50;
                                 var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
                              }
                           }

                           var17 = class143.loginBoxCenter - 80;
                           short var28 = 321;
                           class292.titlebuttonSprite.drawAt(var17 - 73, var28 - 20);
                           var0.drawCentered("Submit", var17, var28 + 5, 16777215, 0);
                           var17 = class143.loginBoxCenter + 80;
                           class292.titlebuttonSprite.drawAt(var17 - 73, var28 - 20);
                           var0.drawCentered("Cancel", var17, var28 + 5, 16777215, 0);
                        } else {
                           var23 = 216;
                           var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
                           var3 = var23 + 15;
                           var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                           var3 += 15;
                           var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                           var3 += 15;
                           var4 = Login.loginBoxX + 180 - 80;
                           var26 = 321;
                           class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                           var0.drawCentered("Set Date of Birth", var4, var26 + 5, 16777215, 0);
                           var4 = Login.loginBoxX + 180 + 80;
                           class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                           var0.drawCentered("Back", var4, var26 + 5, 16777215, 0);
                        }
                     } else if (Login.loginIndex == 8) {
                        var23 = 216;
                        var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0);
                        var3 = var23 + 15;
                        var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var26 = 321;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Privacy Policy", var4, var26 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Back", var4, var26 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 9) {
                        var23 = 221;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
                        var3 = var23 + 25;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 25;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                        var4 = Login.loginBoxX + 180;
                        var26 = 311;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Try again", var4, var26 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 10) {
                        var3 = Login.loginBoxX + 180;
                        var22 = 209;
                        var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0);
                        var4 = var22 + 20;
                        class439.field4717.drawAt(var3 - 109, var4);
                        if (Login.field911.isEmpty()) {
                           class376.field4398.drawAt(var3 - 48, var4 + 18);
                        } else {
                           class376.field4398.drawAt(var3 - 48, var4 + 5);
                           var0.drawCentered(Login.field911, var3, var4 + 68 - 15, 16776960, 0);
                        }
                     } else if (Login.loginIndex == 12) {
                        var3 = class143.loginBoxCenter;
                        var22 = 216;
                        var2.drawCentered("Before using this app, please read and accept our", var3, var22, 16777215, 0);
                        var4 = var22 + 17;
                        var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
                        var3 = class143.loginBoxCenter - 80;
                        var22 = 311;
                        class292.titlebuttonSprite.drawAt(var3 - 73, var22 - 20);
                        var0.drawCentered("Accept", var3, var22 + 5, 16777215, 0);
                        var3 = class143.loginBoxCenter + 80;
                        class292.titlebuttonSprite.drawAt(var3 - 73, var22 - 20);
                        var0.drawCentered("Decline", var3, var22 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 13) {
                        var23 = 231;
                        var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0);
                        var3 = var23 + 20;
                        var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3, 16777215, 0);
                        var4 = Login.loginBoxX + 180;
                        var23 = 311;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 14) {
                        var23 = 201;
                        String var18 = "";
                        var5 = "";
                        var6 = "";
                        switch (Login.Login_banType) {
                           case 0:
                              var18 = "Your account has been involved";
                              var5 = "in serious rule breaking.";
                              var6 = "";
                              break;
                           case 1:
                              var18 = "Your account has been locked due to";
                              var5 = "suspicious activity.";
                              var6 = "Please recover your account.";
                              break;
                           case 2:
                              var18 = "The unpaid balance on your account needs";
                              var5 = "to be resolved before you can play.";
                              var6 = Strings.field3967;
                              break;
                           default:
                              Login_promptCredentials(false);
                        }

                        var0.drawCentered(var18, Login.loginBoxX + 180, var23, 16776960, 0);
                        var3 = var23 + 20;
                        var0.drawCentered(var5, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 20;
                        var0.drawCentered(var6, Login.loginBoxX + 180, var3, 16776960, 0);
                        var7 = Login.loginBoxX + 180;
                        var8 = 276;
                        class292.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
                        if (Login.Login_banType == 1) {
                           var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0);
                        } else {
                           var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0);
                        }

                        var7 = Login.loginBoxX + 180;
                        var8 = 326;
                        class292.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
                        var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 24) {
                        var23 = 221;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
                        var3 = var23 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180;
                        var26 = 301;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Ok", var4, var26 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 32) {
                        var23 = 216;
                        var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
                        var3 = var23 + 15;
                        var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var26 = 321;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Set Date of Birth", var4, var26 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Back", var4, var26 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 33) {
                        var23 = 201;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
                        var3 = var23 + 20;
                        var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 20;
                        var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180;
                        var26 = 276;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var2.drawCentered("Download Launcher", var4, var26 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180;
                        var26 = 326;
                        class292.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var2.drawCentered("Back", var4, var26 + 5, 16777215, 0);
                     }
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var21 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var21);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class262.canvasHeight);
            class121.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
            class121.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var21);
         }

         class148.title_muteSprite[class20.clientPreferences.method2534() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && Language.Language_EN == ClanSettings.clientLanguage) {
            if (class319.field3726 != null) {
               var3 = Login.xPadding + 5;
               var22 = 463;
               byte var30 = 100;
               byte var29 = 35;
               class319.field3726.drawAt(var3, var22);
               var0.drawCentered("World" + " " + Client.worldId, var30 / 2 + var3, var29 / 2 + var22 - 2, 16777215, 0);
               if (class11.World_request != null) {
                  var1.drawCentered("Loading...", var30 / 2 + var3, var29 / 2 + var22 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var30 / 2 + var3, var29 / 2 + var22 + 12, 16777215, 0);
               }
            } else {
               class319.field3726 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "sl_button", "");
            }
         }

      }
   }
}
