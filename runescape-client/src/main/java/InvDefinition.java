import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("InvDefinition_archive")
   static AbstractArchive InvDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("InvDefinition_cached")
   static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 908828749
   )
   @Export("size")
   public int size = 0;

   InvDefinition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "-80"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "610924423"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 2) {
         this.size = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(BI)C",
      garbageValue = "82246052"
   )
   public static char method3569(byte var0) {
      int var1 = var0 & 255;
      if (var1 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var1, 16));
      } else {
         if (var1 >= 128 && var1 < 160) {
            char var2 = class382.cp1252AsciiExtension[var1 - 128];
            if (var2 == 0) {
               var2 = '?';
            }

            var1 = var2;
         }

         return (char)var1;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lph;Lph;Lph;I)V",
      garbageValue = "-1390726040"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (class448.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      class485.loginBoxCenter = Login.loginBoxX + 180;
      if (Login.worldSelectOpen) {
         ClientPreferences.method2433(var0, var1);
      } else {
         Decimator.leftTitleSprite.drawAt(Login.xPadding, 0);
         Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18);
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
            class481.titleboxSprite.drawAt(Login.loginBoxX + 180 - class481.titleboxSprite.subWidth / 2, 271 - class481.titleboxSprite.subHeight / 2);
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

               for(var5 = UserComparator10.method2879(); var0.stringWidth(var5) > var25; var5 = var5.substring(0, var5.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var3, 16777215, 0);
               var3 += 15;
               var7 = Login.Login_password;
               var6 = GrandExchangeOfferAgeComparator.method6832('*', var7.length());

               for(var8 = var6; var0.stringWidth(var8) > var25; var8 = var8.substring(1)) {
               }

               var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
            class481.titleboxSprite.drawAt(Login.loginBoxX, 171);
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
                  var0.drawCentered(Login.Login_response1, class485.loginBoxCenter, var26, 16776960, 0);
                  var3 = var26 + 15;
                  var0.drawCentered(Login.Login_response2, class485.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var0.drawCentered(Login.Login_response3, class485.loginBoxCenter, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 7;
                  var0.draw("Login: ", class485.loginBoxCenter - 110, var3, 16777215, 0);
                  var25 = 200;

                  for(var5 = UserComparator10.method2879(); var0.stringWidth(var5) > var25; var5 = var5.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Strings.colorStartTag(16776960) + "|" : ""), class485.loginBoxCenter - 70, var3, 16777215, 0);
                  var3 += 15;
                  var7 = Login.Login_password;
                  var6 = GrandExchangeOfferAgeComparator.method6832('*', var7.length());

                  for(var8 = var6; var0.stringWidth(var8) > var25; var8 = var8.substring(1)) {
                  }

                  var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Strings.colorStartTag(16776960) + "|" : ""), class485.loginBoxCenter - 108, var3, 16777215, 0);
                  var3 += 15;
                  var26 = 277;
                  var9 = class485.loginBoxCenter + -117;
                  boolean var11 = Client.Login_isUsernameRemembered;
                  boolean var12 = Login.field947;
                  var10 = var11 ? (var12 ? NPC.field1290 : class177.options_buttons_2Sprite) : (var12 ? DynamicObject.field1008 : class104.options_buttons_0Sprite);
                  var10.drawAt(var9, var26);
                  var9 = var9 + var10.subWidth + 5;
                  var1.draw("Remember username", var9, var26 + 13, 16776960, 0);
                  var9 = class485.loginBoxCenter + 24;
                  boolean var15 = class10.clientPreferences.method2472();
                  boolean var16 = Login.field941;
                  IndexedSprite var14 = var15 ? (var16 ? NPC.field1290 : class177.options_buttons_2Sprite) : (var16 ? DynamicObject.field1008 : class104.options_buttons_0Sprite);
                  var14.drawAt(var9, var26);
                  var9 = var9 + var14.subWidth + 5;
                  var1.draw("Hide username", var9, var26 + 13, 16776960, 0);
                  var3 = var26 + 15;
                  int var17 = class485.loginBoxCenter - 80;
                  short var18 = 321;
                  Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
                  var0.drawCentered("Login", var17, var18 + 5, 16777215, 0);
                  var17 = class485.loginBoxCenter + 80;
                  Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
                  var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0);
                  var26 = 357;
                  switch (Login.field929) {
                     case 2:
                        WorldMapDecorationType.field3787 = "Having trouble logging in?";
                        break;
                     default:
                        WorldMapDecorationType.field3787 = "Can't login? Click here.";
                  }

                  FriendsList.field4572 = new Bounds(class485.loginBoxCenter, var26, var1.stringWidth(WorldMapDecorationType.field3787), 11);
                  Calendar.field3770 = new Bounds(class485.loginBoxCenter, var26, var1.stringWidth("Still having trouble logging in?"), 11);
                  var1.drawCentered(WorldMapDecorationType.field3787, class485.loginBoxCenter, var26, 16777215, 0);
               } else if (Login.loginIndex == 3) {
                  var26 = 201;
                  var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var26, 16776960, 0);
                  var3 = var26 + 20;
                  var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var3, 16776960, 0);
                  var3 += 20;
                  var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var3, 16776960, 0);
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
                  var7 = SoundSystem.otp;
                  var6 = GrandExchangeOfferAgeComparator.method6832('*', var7.length());
                  var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? Strings.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var3, 16777215, 0);
                  var3 -= 8;
                  var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  var3 += 15;
                  var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3, 16776960, 0);
                  int var22 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
                  var9 = var3 - var0.ascent;
                  if (Login.field942) {
                     var10 = class177.options_buttons_2Sprite;
                  } else {
                     var10 = class104.options_buttons_0Sprite;
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

                     for(var5 = UserComparator10.method2879(); var0.stringWidth(var5) > var25; var5 = var5.substring(1)) {
                     }

                     var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Strings.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var3, 16777215, 0);
                     var3 += 15;
                     int var23 = Login.loginBoxX + 180 - 80;
                     var21 = 321;
                     Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20);
                     var0.drawCentered("Recover", var23, var21 + 5, 16777215, 0);
                     var23 = Login.loginBoxX + 180 + 80;
                     Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20);
                     var0.drawCentered("Back", var23, var21 + 5, 16777215, 0);
                     var21 = 356;
                     var1.drawCentered("Still having trouble logging in?", class485.loginBoxCenter, var21, 268435455, 0);
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
                     if (class112.field1401 && !Client.onMobile) {
                        var26 = 201;
                        var0.drawCentered(Login.Login_response1, class485.loginBoxCenter, var26, 16776960, 0);
                        var3 = var26 + 15;
                        var0.drawCentered(Login.Login_response2, class485.loginBoxCenter, var3, 16776960, 0);
                        var3 += 15;
                        var0.drawCentered(Login.Login_response3, class485.loginBoxCenter, var3, 16776960, 0);
                        var4 = class485.loginBoxCenter - 150;
                        var3 += 10;

                        for(var19 = 0; var19 < 8; ++var19) {
                           Login.titlebuttonSprite.method9367(var4, var3, 30, 40);
                           boolean var31 = var19 == Login.field935 & Client.cycle % 40 < 20;
                           var0.draw((Login.field938[var19] == null ? "" : Login.field938[var19]) + (var31 ? Strings.colorStartTag(16776960) + "|" : ""), var4 + 10, var3 + 27, 16777215, 0);
                           if (var19 != 1 && var19 != 3) {
                              var4 += 35;
                           } else {
                              var4 += 50;
                              var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var3 + 27, 16777215, 0);
                           }
                        }

                        var19 = class485.loginBoxCenter - 80;
                        short var32 = 321;
                        Login.titlebuttonSprite.drawAt(var19 - 73, var32 - 20);
                        var0.drawCentered("Submit", var19, var32 + 5, 16777215, 0);
                        var19 = class485.loginBoxCenter + 80;
                        Login.titlebuttonSprite.drawAt(var19 - 73, var32 - 20);
                        var0.drawCentered("Cancel", var19, var32 + 5, 16777215, 0);
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
                        ParamComposition.field2110.drawAt(var3 - 109, var4);
                        if (Login.field939.isEmpty()) {
                           UserComparator8.field1416.drawAt(var3 - 48, var4 + 18);
                        } else {
                           UserComparator8.field1416.drawAt(var3 - 48, var4 + 5);
                           var0.drawCentered(Login.field939, var3, var4 + 68 - 15, 16776960, 0);
                        }
                     } else if (Login.loginIndex == 12) {
                        var3 = class485.loginBoxCenter;
                        var25 = 216;
                        var2.drawCentered("Before using this app, please read and accept our", var3, var25, 16777215, 0);
                        var4 = var25 + 17;
                        var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("By accepting, you agree to these documents.", var3, var4, 16777215, 0);
                        var3 = class485.loginBoxCenter - 80;
                        var25 = 311;
                        Login.titlebuttonSprite.drawAt(var3 - 73, var25 - 20);
                        var0.drawCentered("Accept", var3, var25 + 5, 16777215, 0);
                        var3 = class485.loginBoxCenter + 80;
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
                              var6 = Strings.field4010;
                              break;
                           default:
                              ViewportMouse.Login_promptCredentials(false);
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
                     } else if (Login.loginIndex == 32) {
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
                     } else if (Login.loginIndex == 33) {
                        var26 = 201;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
                        var3 = var26 + 20;
                        var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 20;
                        var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = Login.loginBoxX + 180;
                        var29 = 276;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var2.drawCentered("Download Launcher", var4, var29 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180;
                        var29 = 326;
                        Login.titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
                        var2.drawCentered("Back", var4, var29 + 5, 16777215, 0);
                     }
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var24 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var24);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, WorldMapID.canvasHeight);
            class237.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
            class237.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var24);
         }

         SpriteMask.title_muteSprite[class10.clientPreferences.method2437() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && Language.Language_EN == TriBool.clientLanguage) {
            if (class19.field97 != null) {
               var3 = Login.xPadding + 5;
               var25 = 463;
               byte var33 = 100;
               byte var34 = 35;
               class19.field97.drawAt(var3, var25);
               var0.drawCentered("World" + " " + Client.worldId, var33 / 2 + var3, var34 / 2 + var25 - 2, 16777215, 0);
               if (World.World_request != null) {
                  var1.drawCentered("Loading...", var33 / 2 + var3, var34 / 2 + var25 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var33 / 2 + var3, var34 / 2 + var25 + 12, 16777215, 0);
               }
            } else {
               class19.field97 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(class180.archive8, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1380828843"
   )
   static final void method3561(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      } else if (var0 > 383) {
         var0 = 383;
      }

      if (MusicPatchNode.cameraPitch < var0) {
         MusicPatchNode.cameraPitch = (var0 - MusicPatchNode.cameraPitch) * class209.field2322 / 1000 + MusicPatchNode.cameraPitch + BufferedSource.field4636;
         if (MusicPatchNode.cameraPitch > var0) {
            MusicPatchNode.cameraPitch = var0;
         }
      } else if (MusicPatchNode.cameraPitch > var0) {
         MusicPatchNode.cameraPitch -= (MusicPatchNode.cameraPitch - var0) * class209.field2322 / 1000 + BufferedSource.field4636;
         if (MusicPatchNode.cameraPitch < var0) {
            MusicPatchNode.cameraPitch = var0;
         }
      }

      var1 &= 2047;
      int var2 = var1 - class291.cameraYaw;
      if (var2 > 1024) {
         var2 -= 2048;
      } else if (var2 < -1024) {
         var2 += 2048;
      }

      if (var2 > 0) {
         class291.cameraYaw = class291.cameraYaw + BufferedSource.field4636 + var2 * class209.field2322 / 1000;
         class291.cameraYaw &= 2047;
      } else if (var2 < 0) {
         class291.cameraYaw -= BufferedSource.field4636 + -var2 * class209.field2322 / 1000;
         class291.cameraYaw &= 2047;
      }

      int var3 = var1 - class291.cameraYaw;
      if (var3 > 1024) {
         var3 -= 2048;
      } else if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
         class291.cameraYaw = var1;
      }

   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;I)V",
      garbageValue = "-1766452484"
   )
   @Export("widgetDefaultMenuAction")
   static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = class158.getWidgetChild(var1, var2);
      if (var5 != null) {
         if (var5.onOp != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.widget = var5;
            var6.opIndex = var0;
            var6.targetName = var4;
            var6.args = var5.onOp;
            Clock.runScriptEvent(var6);
         }

         boolean var8 = true;
         if (var5.contentType > 0) {
            var8 = FloorOverlayDefinition.method4043(var5);
         }

         if (var8) {
            if (class60.method1131(StudioGame.getWidgetFlags(var5), var0 - 1)) {
               PacketBufferNode var7;
               if (var0 == 1) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 2) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 3) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 4) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 5) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 6) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 7) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 8) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 9) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 10) {
                  var7 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

            }
         }
      }
   }
}
