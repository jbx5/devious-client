import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("UrlRequest")
public class UrlRequest {
   @ObfuscatedName("tq")
   @ObfuscatedGetter(
      intValue = -178026771
   )
   static int field1398;
   @ObfuscatedName("a")
   @Export("url")
   final URL url;
   @ObfuscatedName("f")
   @Export("isDone0")
   volatile boolean isDone0;
   @ObfuscatedName("c")
   @Export("response0")
   volatile byte[] response0;

   UrlRequest(URL var1) {
      this.url = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1609199470"
   )
   @Export("isDone")
   public boolean isDone() {
      return this.isDone0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "-452781351"
   )
   @Export("getResponse")
   public byte[] getResponse() {
      return this.response0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-738571360"
   )
   public String method2716() {
      return this.url.toString();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lnl;Lnl;Lnl;S)V",
      garbageValue = "5023"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      Canvas.loginBoxCenter = Login.loginBoxX + 180;
      if (Login.worldSelectOpen) {
         Client.method1227(var0, var1);
      } else {
         class313.leftTitleSprite.drawAt(Login.xPadding, 0);
         HealthBar.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         MouseRecorder.logoSprite.drawAt(Login.xPadding + 382 - MouseRecorder.logoSprite.subWidth / 2, 18);
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
         String var7;
         short var23;
         if (Client.gameState == 20) {
            class356.titleboxSprite.drawAt(Login.loginBoxX + 180 - class356.titleboxSprite.subWidth / 2, 271 - class356.titleboxSprite.subHeight / 2);
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
               var23 = 200;
               var5 = BufferedSink.clientPreferences.method2381() ? ClientPacket.method5373(Login.Login_username) : Login.Login_username;

               for(var6 = var5; var0.stringWidth(var6) > var23; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
               var3 += 15;

               for(var7 = ClientPacket.method5373(Login.Login_password); var0.stringWidth(var7) > var23; var7 = var7.substring(1)) {
               }

               var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
            class356.titleboxSprite.drawAt(Login.loginBoxX, 171);
            int var18;
            short var24;
            if (Login.loginIndex == 0) {
               var24 = 251;
               var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var24, 16776960, 0);
               var3 = var24 + 30;
               var4 = Login.loginBoxX + 180 - 80;
               var18 = 291;
               class143.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
               var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = Login.loginBoxX + 180 + 80;
               class143.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
               var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
               var24 = 236;
               var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var24, 16777215, 0);
               var3 = var24 + 15;
               var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180 - 80;
               var18 = 321;
               class143.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
               var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180 + 80;
               class143.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
               var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0);
            } else if (Login.loginIndex == 2) {
               var24 = 201;
               var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var24, 16776960, 0);
               var3 = var24 + 15;
               var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var3, 16776960, 0);
               var3 += 15;
               var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var3, 16776960, 0);
               var3 += 15;
               var3 += 7;
               var0.draw("Login: ", Canvas.loginBoxCenter - 110, var3, 16777215, 0);
               var23 = 200;
               var5 = BufferedSink.clientPreferences.method2381() ? ClientPacket.method5373(Login.Login_username) : Login.Login_username;

               for(var6 = var5; var0.stringWidth(var6) > var23; var6 = var6.substring(1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 70, var3, 16777215, 0);
               var3 += 15;

               for(var7 = ClientPacket.method5373(Login.Login_password); var0.stringWidth(var7) > var23; var7 = var7.substring(1)) {
               }

               var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 108, var3, 16777215, 0);
               var3 += 15;
               var24 = 277;
               int var8 = Canvas.loginBoxCenter + -117;
               boolean var10 = Client.Login_isUsernameRemembered;
               boolean var11 = Login.field916;
               IndexedSprite var9 = var10 ? (var11 ? class341.field4230 : class181.options_buttons_2Sprite) : (var11 ? MouseRecorder.field1059 : Login.options_buttons_0Sprite);
               var9.drawAt(var8, var24);
               var8 = var8 + var9.subWidth + 5;
               var1.draw("Remember username", var8, var24 + 13, 16776960, 0);
               var8 = Canvas.loginBoxCenter + 24;
               boolean var14 = BufferedSink.clientPreferences.method2381();
               boolean var15 = Login.field917;
               IndexedSprite var13 = var14 ? (var15 ? class341.field4230 : class181.options_buttons_2Sprite) : (var15 ? MouseRecorder.field1059 : Login.options_buttons_0Sprite);
               var13.drawAt(var8, var24);
               var8 = var8 + var13.subWidth + 5;
               var1.draw("Hide username", var8, var24 + 13, 16776960, 0);
               var3 = var24 + 15;
               int var16 = Canvas.loginBoxCenter - 80;
               short var17 = 321;
               class143.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
               var0.drawCentered("Login", var16, var17 + 5, 16777215, 0);
               var16 = Canvas.loginBoxCenter + 80;
               class143.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
               var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0);
               var24 = 357;
               switch (Login.field925) {
                  case 2:
                     class17.field95 = "Having trouble logging in?";
                     break;
                  default:
                     class17.field95 = "Can't login? Click here.";
               }

               class459.field4855 = new Bounds(Canvas.loginBoxCenter, var24, var1.stringWidth(class17.field95), 11);
               WorldMapID.field2925 = new Bounds(Canvas.loginBoxCenter, var24, var1.stringWidth("Still having trouble logging in?"), 11);
               var1.drawCentered(class17.field95, Canvas.loginBoxCenter, var24, 16777215, 0);
            } else if (Login.loginIndex == 3) {
               var24 = 201;
               var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var24, 16776960, 0);
               var3 = var24 + 20;
               var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var3, 16776960, 0);
               var3 += 15;
               var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var3, 16776960, 0);
               var3 += 15;
               var4 = Login.loginBoxX + 180;
               var18 = 276;
               class143.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
               var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
               var4 = Login.loginBoxX + 180;
               var18 = 326;
               class143.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
               var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0);
            } else {
               int var20;
               short var26;
               if (Login.loginIndex == 4) {
                  var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                  var24 = 236;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var24, 16777215, 0);
                  var3 = var24 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                  var3 += 15;
                  var0.draw("PIN: " + ClientPacket.method5373(class355.otp) + (Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
                  var3 -= 8;
                  var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var3 += 15;
                  var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
                  var18 = var3 - var0.ascent;
                  IndexedSprite var25;
                  if (Login.field900) {
                     var25 = class181.options_buttons_2Sprite;
                  } else {
                     var25 = Login.options_buttons_0Sprite;
                  }

                  var25.drawAt(var4, var18);
                  var3 += 15;
                  var20 = Login.loginBoxX + 180 - 80;
                  var26 = 321;
                  class143.titlebuttonSprite.drawAt(var20 - 73, var26 - 20);
                  var0.drawCentered("Continue", var20, var26 + 5, 16777215, 0);
                  var20 = Login.loginBoxX + 180 + 80;
                  class143.titlebuttonSprite.drawAt(var20 - 73, var26 - 20);
                  var0.drawCentered("Cancel", var20, var26 + 5, 16777215, 0);
                  var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var26 + 36, 255, 0);
               } else if (Login.loginIndex == 5) {
                  var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                  var24 = 221;
                  var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var24, 16776960, 0);
                  var3 = var24 + 15;
                  var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 14;
                  var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3, 16777215, 0);
                  var23 = 174;
                  var5 = BufferedSink.clientPreferences.method2381() ? ClientPacket.method5373(Login.Login_username) : Login.Login_username;

                  for(var6 = var5; var0.stringWidth(var6) > var23; var6 = var6.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
                  var3 += 15;
                  var20 = Login.loginBoxX + 180 - 80;
                  var26 = 321;
                  class143.titlebuttonSprite.drawAt(var20 - 73, var26 - 20);
                  var0.drawCentered("Recover", var20, var26 + 5, 16777215, 0);
                  var20 = Login.loginBoxX + 180 + 80;
                  class143.titlebuttonSprite.drawAt(var20 - 73, var26 - 20);
                  var0.drawCentered("Back", var20, var26 + 5, 16777215, 0);
                  var26 = 356;
                  var1.drawCentered("Still having trouble logging in?", Canvas.loginBoxCenter, var26, 268435455, 0);
               } else {
                  short var27;
                  if (Login.loginIndex == 6) {
                     var24 = 201;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var24, 16776960, 0);
                     var3 = var24 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180;
                     var27 = 321;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Back", var4, var27 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 7) {
                     if (ItemContainer.field1020 && !Client.onMobile) {
                        var24 = 201;
                        var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var24, 16776960, 0);
                        var3 = var24 + 15;
                        var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var3, 16776960, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var3, 16776960, 0);
                        var4 = Canvas.loginBoxCenter - 150;
                        var3 += 10;

                        for(var18 = 0; var18 < 8; ++var18) {
                           class143.titlebuttonSprite.method8806(var4, var3, 30, 40);
                           boolean var21 = var18 == Login.field913 & Client.cycle % 40 < 20;
                           var0.draw((Login.field914[var18] == null ? "" : Login.field914[var18]) + (var21 ? GameObject.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
                           if (var18 != 1 && var18 != 3) {
                              var4 += 35;
                           } else {
                              var4 += 50;
                              var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
                           }
                        }

                        var18 = Canvas.loginBoxCenter - 80;
                        short var28 = 321;
                        class143.titlebuttonSprite.drawAt(var18 - 73, var28 - 20);
                        var0.drawCentered("Submit", var18, var28 + 5, 16777215, 0);
                        var18 = Canvas.loginBoxCenter + 80;
                        class143.titlebuttonSprite.drawAt(var18 - 73, var28 - 20);
                        var0.drawCentered("Cancel", var18, var28 + 5, 16777215, 0);
                     } else {
                        var24 = 216;
                        var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var24, 16776960, 0);
                        var3 = var24 + 15;
                        var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180 - 80;
                        var27 = 321;
                        class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                        var0.drawCentered("Set Date of Birth", var4, var27 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180 + 80;
                        class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                        var0.drawCentered("Back", var4, var27 + 5, 16777215, 0);
                     }
                  } else if (Login.loginIndex == 8) {
                     var24 = 216;
                     var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var24, 16776960, 0);
                     var3 = var24 + 15;
                     var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var27 = 321;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Privacy Policy", var4, var27 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Back", var4, var27 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 9) {
                     var24 = 221;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var24, 16776960, 0);
                     var3 = var24 + 25;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 25;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                     var4 = Login.loginBoxX + 180;
                     var27 = 311;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Try again", var4, var27 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 10) {
                     var3 = Login.loginBoxX + 180;
                     var23 = 209;
                     var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
                     var4 = var23 + 20;
                     class362.field4314.drawAt(var3 - 109, var4);
                     class138.field1609.drawAt(var3 - 48, var4 + 18);
                  } else if (Login.loginIndex == 12) {
                     var3 = Canvas.loginBoxCenter;
                     var23 = 216;
                     var2.drawCentered("Before using this app, please read and accept our", var3, var23, 16777215, 0);
                     var4 = var23 + 17;
                     var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
                     var4 += 17;
                     var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
                     var4 += 17;
                     var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
                     var3 = Canvas.loginBoxCenter - 80;
                     var23 = 311;
                     class143.titlebuttonSprite.drawAt(var3 - 73, var23 - 20);
                     var0.drawCentered("Accept", var3, var23 + 5, 16777215, 0);
                     var3 = Canvas.loginBoxCenter + 80;
                     class143.titlebuttonSprite.drawAt(var3 - 73, var23 - 20);
                     var0.drawCentered("Decline", var3, var23 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 13) {
                     var24 = 231;
                     var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var24, 16777215, 0);
                     var3 = var24 + 20;
                     var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3, 16777215, 0);
                     var4 = Login.loginBoxX + 180;
                     var24 = 311;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var24 - 20);
                     var0.drawCentered("Back", var4, var24 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 14) {
                     var24 = 201;
                     String var19 = "";
                     var5 = "";
                     var6 = "";
                     switch (Login.Login_banType) {
                        case 0:
                           var19 = "Your account has been involved";
                           var5 = "in serious rule breaking.";
                           var6 = "";
                           break;
                        case 1:
                           var19 = "Account locked as we suspect it has been stolen.";
                           var5 = Strings.field3859;
                           var6 = "";
                           break;
                        case 2:
                           var19 = "The unpaid balance on your account needs";
                           var5 = "to be resolved before you can play.";
                           var6 = Strings.field3896;
                           break;
                        default:
                           FriendsChat.Login_promptCredentials(false);
                     }

                     var0.drawCentered(var19, Login.loginBoxX + 180, var24, 16776960, 0);
                     var3 = var24 + 20;
                     var0.drawCentered(var5, Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 20;
                     var0.drawCentered(var6, Login.loginBoxX + 180, var3, 16776960, 0);
                     var20 = Login.loginBoxX + 180;
                     var26 = 276;
                     class143.titlebuttonSprite.drawAt(var20 - 73, var26 - 20);
                     var0.drawCentered("Support Page", var20, var26 + 5, 16777215, 0);
                     var20 = Login.loginBoxX + 180;
                     var26 = 326;
                     class143.titlebuttonSprite.drawAt(var20 - 73, var26 - 20);
                     var0.drawCentered("Back", var20, var26 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 24) {
                     var24 = 221;
                     var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var24, 16777215, 0);
                     var3 = var24 + 15;
                     var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16777215, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180;
                     var27 = 301;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Ok", var4, var27 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 26) {
                     var24 = 216;
                     var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var24, 16776960, 0);
                     var3 = var24 + 15;
                     var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3, 16776960, 0);
                     var3 += 15;
                     var4 = Login.loginBoxX + 180 - 80;
                     var27 = 321;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Set Date of Birth", var4, var27 + 5, 16777215, 0);
                     var4 = Login.loginBoxX + 180 + 80;
                     class143.titlebuttonSprite.drawAt(var4 - 73, var27 - 20);
                     var0.drawCentered("Back", var4, var27 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var22 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var22);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class10.canvasHeight);
            GraphicsObject.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
            GraphicsObject.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var22);
         }

         class16.title_muteSprite[BufferedSink.clientPreferences.method2383() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && class103.clientLanguage == Language.Language_EN) {
            if (WorldMapManager.field2822 != null) {
               var3 = Login.xPadding + 5;
               var23 = 463;
               byte var30 = 100;
               byte var29 = 35;
               WorldMapManager.field2822.drawAt(var3, var23);
               var0.drawCentered("World" + " " + Client.worldId, var30 / 2 + var3, var29 / 2 + var23 - 2, 16777215, 0);
               if (class96.World_request != null) {
                  var1.drawCentered("Loading...", var30 / 2 + var3, var29 / 2 + var23 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var30 / 2 + var3, var29 / 2 + var23 + 12, 16777215, 0);
               }
            } else {
               WorldMapManager.field2822 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(class142.archive8, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-17"
   )
   public static void method2726() {
      SequenceDefinition.SequenceDefinition_cached.clear();
      SequenceDefinition.SequenceDefinition_cachedFrames.clear();
      SequenceDefinition.SequenceDefinition_cachedModel.clear();
   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1905849101"
   )
   static final void method2717(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      }

      if (var0 > 383) {
         var0 = 383;
      }

      if (class408.cameraPitch < var0) {
         class408.cameraPitch = (var0 - class408.cameraPitch) * HealthBarDefinition.field1912 / 1000 + class408.cameraPitch + MouseHandler.field254;
         if (class408.cameraPitch > var0) {
            class408.cameraPitch = var0;
         }
      }

      if (class408.cameraPitch > var0) {
         class408.cameraPitch -= (class408.cameraPitch - var0) * HealthBarDefinition.field1912 / 1000 + MouseHandler.field254;
         if (class408.cameraPitch < var0) {
            class408.cameraPitch = var0;
         }
      }

      int var2 = var1 - WorldMapSection1.cameraYaw;
      if (var2 > 1024) {
         var2 -= 2048;
      }

      if (var2 < -1024) {
         var2 += 2048;
      }

      if (var2 > 0) {
         WorldMapSection1.cameraYaw = WorldMapSection1.cameraYaw + MouseHandler.field254 + var2 * HealthBarDefinition.field1912 / 1000;
         WorldMapSection1.cameraYaw &= 2047;
      }

      if (var2 < 0) {
         WorldMapSection1.cameraYaw -= -var2 * HealthBarDefinition.field1912 / 1000 + MouseHandler.field254;
         WorldMapSection1.cameraYaw &= 2047;
      }

      int var3 = var1 - WorldMapSection1.cameraYaw;
      if (var3 > 1024) {
         var3 -= 2048;
      }

      if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
         WorldMapSection1.cameraYaw = var1;
      }

   }
}
