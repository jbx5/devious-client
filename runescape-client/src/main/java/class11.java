import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ax")
class class11 implements TlsAuthentication {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lay;"
   )
   final class13 this$2;

   @ObfuscatedSignature(
      descriptor = "(Lay;)V"
   )
   class11(class13 var1) {
      this.this$2 = var1;
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      return null;
   }

   public void notifyServerCertificate(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.field61 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1451823981"
   )
   public static int method100(int var0) {
      return class279.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "447191923"
   )
   static final int method102(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2041492110"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      int var1 = Login.loginIndex;
      if (var0 == -3) {
         Tile.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         Tile.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         Tile.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         class14.method173(3);
         Login.field887 = 1;
      } else if (var0 == 4) {
         class14.method173(14);
         Login.Login_banType = 0;
      } else if (var0 == 5) {
         Login.field887 = 2;
         Tile.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
      } else if (var0 == 68 || !Client.onMobile && var0 == 6) {
         Tile.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      } else if (var0 == 7) {
         Tile.setLoginResponseString("This world is full.", "Please use a different world.", "");
      } else if (var0 == 8) {
         Tile.setLoginResponseString("Unable to connect.", "Login server offline.", "");
      } else if (var0 == 9) {
         Tile.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
      } else if (var0 == 10) {
         Tile.setLoginResponseString("Unable to connect.", "Bad session id.", "");
      } else if (var0 == 11) {
         Tile.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
      } else if (var0 == 12) {
         Tile.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if (var0 == 13) {
         Tile.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
      } else if (var0 == 14) {
         Tile.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 16) {
         Tile.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if (var0 == 17) {
         Tile.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
      } else if (var0 == 18) {
         class14.method173(14);
         Login.Login_banType = 1;
      } else if (var0 == 19) {
         Tile.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if (var0 == 20) {
         Tile.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if (var0 == 22) {
         Tile.setLoginResponseString("Malformed login packet.", "Please try again.", "");
      } else if (var0 == 23) {
         Tile.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 24) {
         Tile.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
      } else if (var0 == 25) {
         Tile.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if (var0 == 26) {
         Tile.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if (var0 == 27) {
         Tile.setLoginResponseString("", "Service unavailable.", "");
      } else if (var0 == 31) {
         Tile.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if (var0 == 32) {
         class14.method173(14);
         Login.Login_banType = 2;
      } else if (var0 == 37) {
         Tile.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if (var0 == 38) {
         Tile.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if (var0 == 55) {
         class14.method173(8);
      } else {
         if (var0 == 56) {
            Tile.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
            class19.updateGameState(11);
            return;
         }

         if (var0 == 57) {
            Tile.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
            class19.updateGameState(11);
            return;
         }

         if (var0 == 61) {
            Tile.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class14.method173(7);
         } else {
            if (var0 == 62) {
               class19.updateGameState(10);
               class14.method173(9);
               Tile.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
               return;
            }

            if (var0 == 63) {
               class19.updateGameState(10);
               class14.method173(9);
               Tile.setLoginResponseString("You were signed out.", "Please sign in again.", "");
               return;
            }

            if (var0 == 65 || var0 == 67) {
               class19.updateGameState(10);
               class14.method173(9);
               Tile.setLoginResponseString("Failed to login.", "Please try again.", "");
               return;
            }

            if (var0 == 71) {
               class19.updateGameState(10);
               class14.method173(7);
               Tile.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               class19.updateGameState(10);
               class14.method173(6);
               Tile.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
            } else if (var0 == 72) {
               class19.updateGameState(10);
               class14.method173(26);
            } else {
               Tile.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
            }
         }
      }

      class19.updateGameState(10);
      boolean var3 = var1 != Decimator.method1114();
      if (!var3 && Client.field519.method8928()) {
         class14.method173(9);
      }

   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1903844308"
   )
   static final void method98() {
      PendingSpawn.method2351(class364.field4333, Coord.field3432, class307.field3449);
      class278.method5449(WorldMapRectangle.field2963, class28.field154);
      if (class381.cameraX == class364.field4333 && class351.cameraY == Coord.field3432 && class471.cameraZ == class307.field3449 && class311.cameraPitch == WorldMapRectangle.field2963 && class110.cameraYaw == class28.field154) {
         Client.field737 = false;
         Client.isCameraLocked = false;
         class167.field1800 = 0;
         Canvas.field123 = 0;
         MidiPcmStream.field3361 = 0;
         GrandExchangeOfferUnitPriceComparator.field4269 = 0;
         Skeleton.field2505 = 0;
         class313.field3676 = 0;
         class19.field104 = 0;
         class4.field7 = 0;
         WorldMapSectionType.field2937 = 0;
         class269.field3033 = 0;
      }

   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "19"
   )
   static final void method99() {
      for(Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
         if (var0.plane == TaskHandler.Client_plane && Client.cycle <= var0.cycleEnd) {
            if (Client.cycle >= var0.cycleStart) {
               if (var0.targetIndex > 0) {
                  NPC var1 = Client.npcs[var0.targetIndex - 1];
                  if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.setDestination(var1.x, var1.y, WorldMapDecorationType.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               if (var0.targetIndex < 0) {
                  int var2 = -var0.targetIndex - 1;
                  Player var3;
                  if (var2 == Client.localPlayerIndex) {
                     var3 = BuddyRankComparator.localPlayer;
                  } else {
                     var3 = Client.players[var2];
                  }

                  if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
                     var0.setDestination(var3.x, var3.y, WorldMapDecorationType.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               var0.advance(Client.graphicsCycle);
               class1.scene.drawEntity(TaskHandler.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
            }
         } else {
            var0.remove();
         }
      }

   }

   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)Z",
      garbageValue = "906710391"
   )
   static final boolean method103(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 205) {
         Client.logoutTimer = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.changeAppearance(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.method5786(var2, var3 == 1);
         }

         if (var1 == 324) {
            Client.playerAppearance.method5787(0);
         }

         if (var1 == 325) {
            Client.playerAppearance.method5787(1);
         }

         if (var1 == 326) {
            PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher);
            Client.playerAppearance.write(var4.packetBuffer);
            Client.packetWriter.addNode(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
