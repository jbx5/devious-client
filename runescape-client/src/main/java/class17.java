import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
class class17 implements SSLSession {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Lb;)V"
   )
   class17(class12 var1) {
      this.this$1 = var1;
   }

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public long getLastAccessedTime() {
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
      return this.this$1.field68;
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public int getPeerPort() {
      return 0;
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public void invalidate() {
      throw new UnsupportedOperationException();
   }

   public String getProtocol() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IB)Lbq;",
      garbageValue = "27"
   )
   @Export("Messages_getMessage")
   static Message Messages_getMessage(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "6666"
   )
   static void method270() {
      Login.worldSelectOpen = false;
      Login.leftTitleSprite.drawAt(Login.xPadding, 0);
      class275.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
      class33.logoSprite.drawAt(Login.xPadding + 382 - class33.logoSprite.subWidth / 2, 18);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1123154021"
   )
   static int method225(int var0, Script var1, boolean var2) {
      if (var0 == 6809) {
         int var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         ObjectComposition var4 = class463.getObjectDefinition(var3);
         Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-106"
   )
   static int method274(int var0) {
      return var0 * 3 + 600;
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "2130757009"
   )
   static long method246() {
      return Client.field631;
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(Lru;I)V",
      garbageValue = "-1378183509"
   )
   static final void method221(PacketBuffer var0) {
      var0.importIndex();
      int var1 = var0.readBits(8);
      int var2;
      if (var1 < Client.npcCount) {
         for(var2 = var1; var2 < Client.npcCount; ++var2) {
            Client.field635[++Client.field634 - 1] = Client.npcIndices[var2];
         }
      }

      if (var1 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         for(var2 = 0; var2 < var1; ++var2) {
            int var3 = Client.npcIndices[var2];
            NPC var4 = Client.npcs[var3];
            int var5 = var0.readBits(1);
            if (var5 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = var3;
               var4.npcCycle = Client.cycle;
            } else {
               int var6 = var0.readBits(2);
               if (var6 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = var3;
                  var4.npcCycle = Client.cycle;
                  Client.field558[++Client.field557 - 1] = var3;
               } else {
                  int var7;
                  int var8;
                  if (var6 == 1) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     var7 = var0.readBits(3);
                     var4.method2624(var7, class208.field2360);
                     var8 = var0.readBits(1);
                     if (var8 == 1) {
                        Client.field558[++Client.field557 - 1] = var3;
                     }
                  } else if (var6 == 2) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     if (var0.readBits(1) == 1) {
                        var7 = var0.readBits(3);
                        var4.method2624(var7, class208.field2362);
                        var8 = var0.readBits(3);
                        var4.method2624(var8, class208.field2362);
                     } else {
                        var7 = var0.readBits(3);
                        var4.method2624(var7, class208.field2366);
                     }

                     var7 = var0.readBits(1);
                     if (var7 == 1) {
                        Client.field558[++Client.field557 - 1] = var3;
                     }
                  } else if (var6 == 3) {
                     Client.field635[++Client.field634 - 1] = var3;
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "1234597482"
   )
   static final void method229(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0 ? var6 : -var6;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8;
      if (var8 < var9) {
         var10 = var9;
      }

      if (var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if (var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
         var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var7 + var15 + var1;
         Rasterizer3D.method4334(var17, var18, var19);
         Rasterizer3D.method4339(var21, var22, var23, var17, var18, var19, var4);
         Rasterizer3D.method4334(var17, var19, var20);
         Rasterizer3D.method4339(var21, var23, var24, var17, var19, var20, var4);
      }
   }
}
