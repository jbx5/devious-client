import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class138 extends class139 {
   @ObfuscatedName("uu")
   @ObfuscatedGetter(
      intValue = -1514927571
   )
   static int field1637;
   @ObfuscatedName("aq")
   @Export("SpriteBuffer_spriteHeights")
   public static int[] SpriteBuffer_spriteHeights;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -469795657
   )
   int field1640;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class138(class142 var1) {
      this.this$0 = var1;
      this.field1640 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1640 = var1.readUnsignedShort();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3307(this.field1640);
   }

   @ObfuscatedName("af")
   static double method3201(double var0) {
      return Math.exp(var0 * -var0 / 2.0) / Math.sqrt(6.283185307179586);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "-1407581500"
   )
   @Export("getFile")
   public static File getFile(String var0) {
      if (!FileSystem.FileSystem_hasPermissions) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(class513.FileSystem_cacheDir, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  FileSystem.FileSystem_cacheFiles.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[IIIB)V",
      garbageValue = "1"
   )
   public static void method3212(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method3212(var0, var1, var2, var5 - 1);
         method3212(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "82"
   )
   static void method3210() {
      Login.worldSelectOpen = false;
      class123.leftTitleSprite.drawAt(Login.xPadding, 0);
      ParamComposition.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
      Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "468091997"
   )
   @Export("updateGameState")
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 30) {
            Client.field722.method4181();
         }

         if (Client.gameState == 0) {
            ScriptFrame.client.method644();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            class284.method5687(0);
            Client.field523 = 0;
            Client.field524 = 0;
            Client.timer.method7603(var0);
            if (var0 != 20) {
               class14.method180(false);
            }
         }

         if (var0 != 20 && var0 != 40 && class333.field3824 != null) {
            class333.field3824.close();
            class333.field3824 = null;
         }

         if (Client.gameState == 25) {
            Client.field621 = 0;
            Client.field559 = 0;
            Client.field725 = 1;
            Client.field557 = 0;
            Client.field558 = 1;
         }

         int var1;
         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               var1 = Client.gameState == 11 ? 4 : 0;
               KeyHandler.method366(NetFileRequest.archive10, class452.archive8, false, var1);
            } else if (var0 == 11) {
               KeyHandler.method366(NetFileRequest.archive10, class452.archive8, false, 4);
            } else if (var0 == 50) {
               class205.setLoginResponseString("", "Updating date of birth...", "");
               KeyHandler.method366(NetFileRequest.archive10, class452.archive8, false, 7);
            } else {
               Player.method2356();
            }
         } else {
            var1 = class134.method3178() ? 0 : 12;
            KeyHandler.method366(NetFileRequest.archive10, class452.archive8, true, var1);
         }

         Client.gameState = var0;
      }
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      descriptor = "(Lcb;IIB)V",
      garbageValue = "46"
   )
   static final void method3205(MenuAction var0, int var1, int var2) {
      if (var0 != null) {
         class17.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.action, var0.target, var1, var2);
      }

   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIS)V",
      garbageValue = "2663"
   )
   static final void method3204(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      SceneTilePaint.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
   }
}
