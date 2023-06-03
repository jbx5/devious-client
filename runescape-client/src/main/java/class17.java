import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
class class17 implements SSLSession {
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive15")
   static Archive archive15;
   @ObfuscatedName("gm")
   @Export("worldHost")
   static String worldHost;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Laj;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Laj;)V"
   )
   class17(class12 var1) {
      this.this$1 = var1;
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.this$1.field59;
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public void invalidate() {
      throw new UnsupportedOperationException();
   }

   public boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public int getPeerPort() {
      return 0;
   }

   public long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public String getProtocol() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;S)V",
      garbageValue = "17225"
   )
   public static void method244(AbstractArchive var0) {
      StructComposition.StructDefinition_archive = var0;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Lcc;",
      garbageValue = "1813917490"
   )
   @Export("worldListStart")
   static World worldListStart() {
      World.World_listCount = 0;
      return class171.getNextWorldListWorld();
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-1"
   )
   static final int method269() {
      if (class10.clientPreferences.method2434()) {
         return Clock.Client_plane;
      } else {
         int var0 = 3;
         if (MusicPatchNode.cameraPitch < 310) {
            int var1;
            int var2;
            if (Client.oculusOrbState == 1) {
               var1 = ModeWhere.oculusOrbFocalPointX >> 7;
               var2 = GrandExchangeEvents.oculusOrbFocalPointY >> 7;
            } else {
               var1 = Projectile.localPlayer.x >> 7;
               var2 = Projectile.localPlayer.y >> 7;
            }

            int var3 = class208.cameraX >> 7;
            int var4 = ByteArrayPool.cameraZ >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
               return Clock.Client_plane;
            }

            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
               return Clock.Client_plane;
            }

            if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) {
               var0 = Clock.Client_plane;
            }

            int var5;
            if (var1 > var3) {
               var5 = var1 - var3;
            } else {
               var5 = var3 - var1;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            int var8;
            if (var5 > var6) {
               var7 = var6 * 65536 / var5;
               var8 = 32768;

               while(var3 != var1) {
                  if (var3 < var1) {
                     ++var3;
                  } else if (var3 > var1) {
                     --var3;
                  }

                  if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) {
                     var0 = Clock.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) {
                        var0 = Clock.Client_plane;
                     }
                  }
               }
            } else if (var6 > 0) {
               var7 = var5 * 65536 / var6;
               var8 = 32768;

               while(var4 != var2) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) {
                     var0 = Clock.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var3 < var1) {
                        ++var3;
                     } else if (var3 > var1) {
                        --var3;
                     }

                     if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) {
                        var0 = Clock.Client_plane;
                     }
                  }
               }
            }
         }

         if (Projectile.localPlayer.x >= 0 && Projectile.localPlayer.y >= 0 && Projectile.localPlayer.x < 13312 && Projectile.localPlayer.y < 13312) {
            if ((Tiles.Tiles_renderFlags[Clock.Client_plane][Projectile.localPlayer.x >> 7][Projectile.localPlayer.y >> 7] & 4) != 0) {
               var0 = Clock.Client_plane;
            }

            return var0;
         } else {
            return Clock.Client_plane;
         }
      }
   }
}
