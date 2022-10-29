import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class129 extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1307484353
   )
   int field1540;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[[Ldb;"
   )
   public class124[][] field1539 = null;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "[[Ldb;"
   )
   class124[][] field1538 = null;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lhv;"
   )
   public Skeleton field1541;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 444658097
   )
   int field1542 = 0;
   @ObfuscatedName("j")
   boolean field1543;

   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;IZ)V"
   )
   class129(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.field1540 = var3;
      byte[] var5 = var1.takeFile(this.field1540 >> 16 & '\uffff', this.field1540 & '\uffff');
      Buffer var6 = new Buffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9;
      if (var4) {
         var9 = var2.getFile(0, var8);
      } else {
         var9 = var2.getFile(var8, 0);
      }

      this.field1541 = new Skeleton(var8, var9);
      this.method2921(var6, var7);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "569723886"
   )
   void method2921(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1542 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      this.field1538 = new class124[this.field1541.method4263().method4246()][];
      this.field1539 = new class124[this.field1541.method4262()][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var6 = var1.readUnsignedByte();
         class125[] var7 = new class125[]{class125.field1510, class125.field1503, class125.field1501, class125.field1502, class125.field1499, class125.field1504};
         class125 var8 = (class125)WallDecoration.findEnumerated(var7, var6);
         if (var8 == null) {
            var8 = class125.field1510;
         }

         int var13 = var1.readShortSmart();
         class126 var9 = ItemContainer.method2225(var1.readUnsignedByte());
         class124 var10 = new class124();
         var10.method2874(var1, var2);
         int var11 = var8.method2901();
         class124[][] var12;
         if (var8 == class125.field1503) {
            var12 = this.field1538;
         } else {
            var12 = this.field1539;
         }

         if (var12[var13] == null) {
            var12[var13] = new class124[var11];
         }

         var12[var13][var9.method2907()] = var10;
         if (var8 == class125.field1499) {
            this.field1543 = true;
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1403093085"
   )
   public int method2923() {
      return this.field1542;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1355661796"
   )
   public boolean method2928() {
      return this.field1543;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ILdi;IIB)V",
      garbageValue = "57"
   )
   public void method2940(int var1, class122 var2, int var3, int var4) {
      class407 var5 = Coord.method5706();
      this.method2925(var5, var3, var2, var1);
      this.method2920(var5, var3, var2, var1);
      this.method2926(var5, var3, var2, var1);
      var2.method2847(var5);
      var5.method7695();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lov;ILdi;IB)V",
      garbageValue = "1"
   )
   void method2925(class407 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method2845(this.field1542);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1538[var2] != null) {
         class124 var9 = this.field1538[var2][0];
         class124 var10 = this.field1538[var2][1];
         class124 var11 = this.field1538[var2][2];
         if (var9 != null) {
            var6 = var9.method2885(var4);
         }

         if (var10 != null) {
            var7 = var10.method2885(var4);
         }

         if (var11 != null) {
            var8 = var11.method2885(var4);
         }
      }

      class406 var16 = FriendSystem.method1847();
      var16.method7638(1.0F, 0.0F, 0.0F, var6);
      class406 var14 = FriendSystem.method1847();
      var14.method7638(0.0F, 1.0F, 0.0F, var7);
      class406 var15 = FriendSystem.method1847();
      var15.method7638(0.0F, 0.0F, 1.0F, var8);
      class406 var12 = FriendSystem.method1847();
      var12.method7615(var15);
      var12.method7615(var16);
      var12.method7615(var14);
      class407 var13 = Coord.method5706();
      var13.method7653(var12);
      var1.method7652(var13);
      var16.method7623();
      var14.method7623();
      var15.method7623();
      var12.method7623();
      var13.method7695();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lov;ILdi;IB)V",
      garbageValue = "-7"
   )
   void method2926(class407 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method2834(this.field1542);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1538[var2] != null) {
         class124 var9 = this.field1538[var2][3];
         class124 var10 = this.field1538[var2][4];
         class124 var11 = this.field1538[var2][5];
         if (var9 != null) {
            var6 = var9.method2885(var4);
         }

         if (var10 != null) {
            var7 = var10.method2885(var4);
         }

         if (var11 != null) {
            var8 = var11.method2885(var4);
         }
      }

      var1.field4566[12] = var6;
      var1.field4566[13] = var7;
      var1.field4566[14] = var8;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lov;ILdi;II)V",
      garbageValue = "-1585869503"
   )
   void method2920(class407 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method2835(this.field1542);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1538[var2] != null) {
         class124 var9 = this.field1538[var2][6];
         class124 var10 = this.field1538[var2][7];
         class124 var11 = this.field1538[var2][8];
         if (var9 != null) {
            var6 = var9.method2885(var4);
         }

         if (var10 != null) {
            var7 = var10.method2885(var4);
         }

         if (var11 != null) {
            var8 = var11.method2885(var4);
         }
      }

      class407 var12 = Coord.method5706();
      var12.method7650(var6, var7, var8);
      var1.method7652(var12);
      var12.method7695();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)I",
      garbageValue = "-2135954243"
   )
   static int method2946(Widget var0) {
      if (var0.type != 11) {
         Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize - 1] = "";
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
         Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var0.method6136(var1);
         return 1;
      }
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-849892544"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      int var1 = Login.loginIndex;
      if (var0 == -3) {
         MusicPatchNode2.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         MusicPatchNode2.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         MusicPatchNode2.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         GrandExchangeOfferOwnWorldComparator.method1171(3);
         Login.field925 = 1;
      } else if (var0 == 4) {
         GrandExchangeOfferOwnWorldComparator.method1171(14);
         Login.Login_banType = 0;
      } else if (var0 == 5) {
         Login.field925 = 2;
         MusicPatchNode2.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
      } else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
         if (var0 == 7) {
            MusicPatchNode2.setLoginResponseString("This world is full.", "Please use a different world.", "");
         } else if (var0 == 8) {
            MusicPatchNode2.setLoginResponseString("Unable to connect.", "Login server offline.", "");
         } else if (var0 == 9) {
            MusicPatchNode2.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
         } else if (var0 == 10) {
            MusicPatchNode2.setLoginResponseString("Unable to connect.", "Bad session id.", "");
         } else if (var0 == 11) {
            MusicPatchNode2.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
         } else if (var0 == 12) {
            MusicPatchNode2.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
         } else if (var0 == 13) {
            MusicPatchNode2.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
         } else if (var0 == 14) {
            MusicPatchNode2.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 16) {
            MusicPatchNode2.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
         } else if (var0 == 17) {
            MusicPatchNode2.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
         } else if (var0 == 18) {
            GrandExchangeOfferOwnWorldComparator.method1171(14);
            Login.Login_banType = 1;
         } else if (var0 == 19) {
            MusicPatchNode2.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
         } else if (var0 == 20) {
            MusicPatchNode2.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
         } else if (var0 == 22) {
            MusicPatchNode2.setLoginResponseString("Malformed login packet.", "Please try again.", "");
         } else if (var0 == 23) {
            MusicPatchNode2.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 24) {
            MusicPatchNode2.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
         } else if (var0 == 25) {
            MusicPatchNode2.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
         } else if (var0 == 26) {
            MusicPatchNode2.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
         } else if (var0 == 27) {
            MusicPatchNode2.setLoginResponseString("", "Service unavailable.", "");
         } else if (var0 == 31) {
            MusicPatchNode2.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
         } else if (var0 == 32) {
            GrandExchangeOfferOwnWorldComparator.method1171(14);
            Login.Login_banType = 2;
         } else if (var0 == 37) {
            MusicPatchNode2.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
         } else if (var0 == 38) {
            MusicPatchNode2.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
         } else if (var0 == 55) {
            GrandExchangeOfferOwnWorldComparator.method1171(8);
         } else {
            if (var0 == 56) {
               MusicPatchNode2.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
               class21.updateGameState(11);
               return;
            }

            if (var0 == 57) {
               MusicPatchNode2.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
               class21.updateGameState(11);
               return;
            }

            if (var0 == 61) {
               MusicPatchNode2.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
               GrandExchangeOfferOwnWorldComparator.method1171(7);
            } else {
               if (var0 == 62) {
                  class21.updateGameState(10);
                  GrandExchangeOfferOwnWorldComparator.method1171(9);
                  MusicPatchNode2.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
                  return;
               }

               if (var0 == 63) {
                  class21.updateGameState(10);
                  GrandExchangeOfferOwnWorldComparator.method1171(9);
                  MusicPatchNode2.setLoginResponseString("You were signed out.", "Please sign in again.", "");
                  return;
               }

               if (var0 == 65 || var0 == 67) {
                  class21.updateGameState(10);
                  GrandExchangeOfferOwnWorldComparator.method1171(9);
                  MusicPatchNode2.setLoginResponseString("Failed to login.", "Please try again.", "");
                  return;
               }

               if (var0 == 71) {
                  class21.updateGameState(10);
                  GrandExchangeOfferOwnWorldComparator.method1171(7);
                  MusicPatchNode2.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
               } else if (var0 == 73) {
                  class21.updateGameState(10);
                  GrandExchangeOfferOwnWorldComparator.method1171(6);
                  MusicPatchNode2.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
               } else if (var0 == 72) {
                  class21.updateGameState(10);
                  GrandExchangeOfferOwnWorldComparator.method1171(26);
               } else {
                  MusicPatchNode2.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
               }
            }
         }
      } else {
         MusicPatchNode2.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      }

      class21.updateGameState(10);
      int var4 = Login.loginIndex;
      boolean var5 = var1 != var4;
      if (!var5 && Client.field615.method8675()) {
         GrandExchangeOfferOwnWorldComparator.method1171(9);
      }

   }
}
