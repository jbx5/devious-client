import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lmv;Lmv;I)I",
      garbageValue = "331918730"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "29"
   )
   @Export("hashString")
   public static int hashString(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class31.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "331376374"
   )
   public static int method6684(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Lnv;Lnv;Lnv;I)V",
      garbageValue = "-2021027855"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      class143.loginBoxCenter = Login.loginBoxX + 180;
      if (Login.worldSelectOpen) {
         WorldMapSectionType.method5297(var0, var1);
      } else {
         Login.leftTitleSprite.drawAt(Login.xPadding, 0);
         class275.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         class33.logoSprite.drawAt(Login.xPadding + 382 - class33.logoSprite.subWidth / 2, 18);
         int var3;
         int var4;
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
         String var8;
         short var25;
         if (Client.gameState == 20) {
            class147.titleboxSprite.drawAt(Login.loginBoxX + 180 - class147.titleboxSprite.subWidth / 2, 271 - class147.titleboxSprite.subHeight / 2);
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
               var25 = 200;

               for(var5 = FriendLoginUpdate.method7586(); var0.stringWidth(var5) > var25; var5 = var5.substring(0, var5.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
               var3 += 15;
               var7 = Login.Login_password;
               var6 = KeyHandler.method366('*', var7.length());

               for(var8 = var6; var0.stringWidth(var8) > var25; var8 = var8.substring(1)) {
               }

               var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
            class147.titleboxSprite.drawAt(Login.loginBoxX, 171);
            int var19;
            short var26;
            if (Login.loginIndex == 0) {
               var26 = 251;
               var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var26, 16776960, 0);
               var3 = var26 + 30;
               var4 = Login.loginBoxX + 180 - 80;
               var19 = 291;
               Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
               var0.drawLines("New User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = Login.loginBoxX + 180 + 80;
               Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
               var0.drawLines("Existing User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
               var26 = 236;
               var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16777215, 0);
               var3 = var26 + 15;
               var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180 - 80;
               var19 = 321;
               Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
               var0.drawCentered("Continue", var4, var19 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180 + 80;
               Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
               var0.drawCentered("Cancel", var4, var19 + 5, 16777215, 0);
            } else {
               int var9;
               IndexedSprite var10;
               if (Login.loginIndex == 2) {
                  var26 = 201;
                  var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var26, 16776960, 0);
                  var3 = var26 + 15;
                  var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 7;
                  var0.draw("Login: ", class143.loginBoxCenter - 110, var3, 16777215, 0);
                  var25 = 200;

                  for(var5 = FriendLoginUpdate.method7586(); var0.stringWidth(var5) > var25; var5 = var5.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 70, var3, 16777215, 0);
                  var3 += 15;
                  var7 = Login.Login_password;
                  var6 = KeyHandler.method366('*', var7.length());

                  for(var8 = var6; var0.stringWidth(var8) > var25; var8 = var8.substring(1)) {
                  }

                  var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 108, var3, 16777215, 0);
                  var3 += 15;
                  var26 = 277;
                  var9 = class143.loginBoxCenter + -117;
                  boolean var11 = Client.Login_isUsernameRemembered;
                  boolean var12 = Login.field939;
                  var10 = var11 ? (var12 ? class100.field1335 : Login.options_buttons_2Sprite) : (var12 ? ChatChannel.field1005 : Login.options_buttons_0Sprite);
                  var10.drawAt(var9, var26);
                  var9 = var9 + var10.subWidth + 5;
                  var1.draw("Remember username", var9, var26 + 13, 16776960, 0);
                  var9 = class143.loginBoxCenter + 24;
                  boolean var15 = PacketWriter.clientPreferences.method2484();
                  boolean var16 = Login.field934;
                  IndexedSprite var14 = var15 ? (var16 ? class100.field1335 : Login.options_buttons_2Sprite) : (var16 ? ChatChannel.field1005 : Login.options_buttons_0Sprite);
                  var14.drawAt(var9, var26);
                  var9 = var9 + var14.subWidth + 5;
                  var1.draw("Hide username", var9, var26 + 13, 16776960, 0);
                  var3 = var26 + 15;
                  int var17 = class143.loginBoxCenter - 80;
                  short var18 = 321;
                  Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
                  var0.drawCentered("Login", var17, var18 + 5, 16777215, 0);
                  var17 = class143.loginBoxCenter + 80;
                  Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
                  var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0);
                  var26 = 357;
                  switch (Login.field917) {
                     case 2:
                        BoundaryObject.field2768 = "Having trouble logging in?";
                        break;
                     default:
                        BoundaryObject.field2768 = "Can't login? Click here.";
                  }

                  Calendar.field3727 = new Bounds(class143.loginBoxCenter, var26, var1.stringWidth(BoundaryObject.field2768), 11);
                  class290.field3364 = new Bounds(class143.loginBoxCenter, var26, var1.stringWidth("Still having trouble logging in?"), 11);
                  var1.drawCentered(BoundaryObject.field2768, class143.loginBoxCenter, var26, 16777215, 0);
               } else if (Login.loginIndex == 3) {
                  var26 = 201;
                  var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var26, 16776960, 0);
                  var3 = var26 + 20;
                  var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var4 = Login.loginBoxX + 180;
                  var19 = 276;
                  Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
                  var2.drawCentered("Try again", var4, var19 + 5, 16777215, 0);
                  var4 = Login.loginBoxX + 180;
                  var19 = 326;
                  Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
                  var2.drawCentered("Forgotten password?", var4, var19 + 5, 16777215, 0);
               } else if (Login.loginIndex == 4) {
                  var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                  var26 = 236;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16777215, 0);
                  var3 = var26 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var5 = "PIN: ";
                  var7 = InvDefinition.otp;
                  var6 = KeyHandler.method366('*', var7.length());
                  var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
                  var3 -= 8;
                  var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var3 += 15;
                  var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  int var22 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
                  var9 = var3 - var0.ascent;
                  if (Login.field930) {
                     var10 = Login.options_buttons_2Sprite;
                  } else {
                     var10 = Login.options_buttons_0Sprite;
                  }

                  var10.drawAt(var22, var9);
                  var3 += 15;
                  int var27 = Login.loginBoxX + 180 - 80;
                  short var28 = 321;
                  Login.titlebuttonSprite.drawAt(var27 - 73, var28 - 20);
                  var0.drawCentered("Continue", var27, var28 + 5, 16777215, 0);
                  var27 = Login.loginBoxX + 180 + 80;
                  Login.titlebuttonSprite.drawAt(var27 - 73, var28 - 20);
                  var0.drawCentered("Cancel", var27, var28 + 5, 16777215, 0);
                  var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var28 + 36, 255, 0);
               } else {
                  int var21;
                  if (Login.loginIndex == 5) {
                     var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                     var26 = 221;
                     var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
                     var3 = var26 + 15;
                     var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var3 += 14;
                     var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3, 16777215, 0);
                     var25 = 174;

                     for(var5 = FriendLoginUpdate.method7586(); var0.stringWidth(var5) > var25; var5 = var5.substring(1)) {
                     }

                     var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
                     var3 += 15;
                     int var23 = Login.loginBoxX + 180 - 80;
                     var21 = 321;
                     Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20);
                     var0.drawCentered("Recover", var23, var21 + 5, 16777215, 0);
                     var23 = Login.loginBoxX + 180 + 80;
                     Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20);
                     var0.drawCentered("Back", var23, var21 + 5, 16777215, 0);
                     var21 = 356;
                     var1.drawCentered("Still having trouble logging in?", class143.loginBoxCenter, var21, 268435455, 0);
                  } else if (Login.loginIndex == 6) {
                     var26 = 201;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
                     var3 = var26 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180;
                     var19 = 321;
                     Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
                     var0.drawCentered("Back", var4, var19 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 7) {
                     if (class209.field2376 && !Client.onMobile) {
                        var26 = 201;
                        var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var26, 16776960, 0);
                        var3 = var26 + 15;
                        var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var3, 16776960, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var3, 16776960, 0);
                        var4 = class143.loginBoxCenter - 150;
                        var3 += 10;

                        for(var19 = 0; var19 < 8; ++var19) {
                           Login.titlebuttonSprite.method9071(var4, var3, 30, 40);
                           boolean var32 = var19 == Login.field925 & Client.cycle % 40 < 20;
                           var0.draw((Login.field926[var19] == null ? "" : Login.field926[var19]) + (var32 ? class149.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
                           if (var19 != 1 && var19 != 3) {
                              var4 += 35;
                           } else {
                              var4 += 50;
                              var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
                           }
                        }

                        var19 = class143.loginBoxCenter - 80;
                        short var33 = 321;
                        Login.titlebuttonSprite.drawAt(var19 - 73, var33 - 20);
                        var0.drawCentered("Submit", var19, var33 + 5, 16777215, 0);
                        var19 = class143.loginBoxCenter + 80;
                        Login.titlebuttonSprite.drawAt(var19 - 73, var33 - 20);
                        var0.drawCentered("Cancel", var19, var33 + 5, 16777215, 0);
                     } else {
                        var26 = 216;
                        var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var26, 16776960, 0);
                        var3 = var26 + 15;
                        var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var19 = 321;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
                        var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20);
                        var0.drawCentered("Back", var4, var19 + 5, 16777215, 0);
                     }
                  } else {
                     short var29;
                     if (Login.loginIndex == 8) {
                        var26 = 216;
                        var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var26, 16776960, 0);
                        var3 = var26 + 15;
                        var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var29 = 321;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var0.drawCentered("Privacy Policy", var4, var29 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var0.drawCentered("Back", var4, var29 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 9) {
                        var26 = 221;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
                        var3 = var26 + 25;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 25;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                        var4 = Login.loginBoxX + 180;
                        var29 = 311;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var0.drawCentered("Try again", var4, var29 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 10) {
                        var3 = Login.loginBoxX + 180;
                        var25 = 209;
                        var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
                        var4 = var25 + 20;
                        class19.field109.drawAt(var3 - 109, var4);
                        if (Login.field927.isEmpty()) {
                           Canvas.field140.drawAt(var3 - 48, var4 + 18);
                        } else {
                           Canvas.field140.drawAt(var3 - 48, var4 + 5);
                           var0.drawCentered(Login.field927, var3, var4 + 68 - 15, 16776960, 0);
                        }
                     } else if (Login.loginIndex == 12) {
                        var3 = class143.loginBoxCenter;
                        var25 = 216;
                        var2.drawCentered("Before using this app, please read and accept our", var3, var25, 16777215, 0);
                        var4 = var25 + 17;
                        var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
                        var3 = class143.loginBoxCenter - 80;
                        var25 = 311;
                        Login.titlebuttonSprite.drawAt(var3 - 73, var25 - 20);
                        var0.drawCentered("Accept", var3, var25 + 5, 16777215, 0);
                        var3 = class143.loginBoxCenter + 80;
                        Login.titlebuttonSprite.drawAt(var3 - 73, var25 - 20);
                        var0.drawCentered("Decline", var3, var25 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 13) {
                        var26 = 231;
                        var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var26, 16777215, 0);
                        var3 = var26 + 20;
                        var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3, 16777215, 0);
                        var4 = Login.loginBoxX + 180;
                        var26 = 311;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
                        var0.drawCentered("Back", var4, var26 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 14) {
                        var26 = 201;
                        String var20 = "";
                        var5 = "";
                        var6 = "";
                        switch (Login.Login_banType) {
                           case 0:
                              var20 = "Your account has been involved";
                              var5 = "in serious rule breaking.";
                              var6 = "";
                              break;
                           case 1:
                              var20 = "Your account has been locked due to";
                              var5 = "suspicious activity.";
                              var6 = "Please recover your account.";
                              break;
                           case 2:
                              var20 = "The unpaid balance on your account needs";
                              var5 = "to be resolved before you can play.";
                              var6 = Strings.field3881;
                              break;
                           default:
                              UserComparator6.Login_promptCredentials(false);
                        }

                        var0.drawCentered(var20, Login.loginBoxX + 180, var26, 16776960, 0);
                        var3 = var26 + 20;
                        var0.drawCentered(var5, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 20;
                        var0.drawCentered(var6, Login.loginBoxX + 180, var3, 16776960, 0);
                        var21 = Login.loginBoxX + 180;
                        short var30 = 276;
                        Login.titlebuttonSprite.drawAt(var21 - 73, var30 - 20);
                        if (Login.Login_banType == 1) {
                           var0.drawCentered("Recover Account", var21, var30 + 5, 16777215, 0);
                        } else {
                           var0.drawCentered("View Appeal Options", var21, var30 + 5, 16777215, 0);
                        }

                        var21 = Login.loginBoxX + 180;
                        var30 = 326;
                        Login.titlebuttonSprite.drawAt(var21 - 73, var30 - 20);
                        var0.drawCentered("Back", var21, var30 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 24) {
                        var26 = 221;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16777215, 0);
                        var3 = var26 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180;
                        var29 = 301;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var0.drawCentered("Ok", var4, var29 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 26) {
                        var26 = 216;
                        var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var26, 16776960, 0);
                        var3 = var26 + 15;
                        var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var29 = 321;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var0.drawCentered("Set Date of Birth", var4, var29 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var0.drawCentered("Back", var4, var29 + 5, 16777215, 0);
                     }
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var24 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var24);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class127.canvasHeight);
            class305.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
            class305.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var24);
         }

         Login.title_muteSprite[PacketWriter.clientPreferences.method2570() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && class36.clientLanguage == Language.Language_EN) {
            if (Login.field935 != null) {
               var3 = Login.xPadding + 5;
               var25 = 463;
               byte var31 = 100;
               byte var34 = 35;
               Login.field935.drawAt(var3, var25);
               var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var3, var34 / 2 + var25 - 2, 16777215, 0);
               if (ClanChannel.World_request != null) {
                  var1.drawCentered("Loading...", var31 / 2 + var3, var34 / 2 + var25 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var31 / 2 + var3, var34 / 2 + var25 + 12, 16777215, 0);
               }
            } else {
               Login.field935 = VarcInt.SpriteBuffer_getIndexedSpriteByName(WorldMapEvent.archive8, "sl_button", "");
            }
         }

      }
   }
}
