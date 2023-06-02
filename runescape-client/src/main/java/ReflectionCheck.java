import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive6")
   static Archive archive6;
   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      descriptor = "[Ltm;"
   )
   @Export("headIconHintSprites")
   static SpritePixels[] headIconHintSprites;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 989275023
   )
   @Export("id")
   int id;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 68756671
   )
   @Export("size")
   int size;
   @ObfuscatedName("av")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("as")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("ax")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("ap")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("ab")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("ak")
   @Export("arguments")
   byte[][][] arguments;

   ReflectionCheck() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;Lsv;I)Lsv;",
      garbageValue = "1995679010"
   )
   @Export("readStringIntParameters")
   static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if (var1 == null) {
         var3 = class128.method2970(var2);
         var1 = new IterableNodeHashTable(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.readMedium();
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
         } else {
            var6 = new IntegerNode(var0.readInt());
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-66"
   )
   static void method669() {
      if (Login.clearLoginScreen) {
         class481.titleboxSprite = null;
         Login.titlebuttonSprite = null;
         Login.runesSprite = null;
         Decimator.leftTitleSprite = null;
         Login.rightTitleSprite = null;
         class13.logoSprite = null;
         SpriteMask.title_muteSprite = null;
         class104.options_buttons_0Sprite = null;
         class177.options_buttons_2Sprite = null;
         class16.worldSelectBackSprites = null;
         class134.worldSelectFlagSprites = null;
         class1.worldSelectArrows = null;
         class342.worldSelectStars = null;
         class19.field97 = null;
         class237.loginScreenRunesAnimation.method2402();
         class304.musicPlayerStatus = 1;
         UserComparator9.musicTrackArchive = null;
         VarbitComposition.musicTrackGroupId = -1;
         class304.musicTrackFileId = -1;
         class304.musicTrackVolume = 0;
         class132.musicTrackBoolean = false;
         class157.pcmSampleLength = 2;
         if (NetCache.NetCache_socket != null) {
            try {
               Buffer var0 = new Buffer(4);
               var0.writeByte(2);
               var0.writeMedium(0);
               NetCache.NetCache_socket.write(var0.array, 0, 4);
            } catch (IOException var3) {
               try {
                  NetCache.NetCache_socket.close();
               } catch (Exception var2) {
               }

               ++NetCache.NetCache_ioExceptions;
               NetCache.NetCache_socket = null;
            }
         }

         Login.clearLoginScreen = false;
      }
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "(IIZB)V",
      garbageValue = "22"
   )
   static final void method670(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class208.field2314 || PlayerCompositionColorTextureOverride.field1891 != var1) {
         class208.field2314 = var0;
         PlayerCompositionColorTextureOverride.field1891 = var1;
         UserComparator8.updateGameState(25);
         AABB.drawLoadingMessage("Loading - please wait.", true);
         int var3 = class213.baseX * 64;
         int var4 = class101.baseY * 64;
         class213.baseX = (var0 - 6) * 8;
         class101.baseY = (var1 - 6) * 8;
         int var5 = class213.baseX * 64 - var3;
         int var6 = class101.baseY * 64 - var4;
         var3 = class213.baseX * 64;
         var4 = class101.baseY * 64;

         int var7;
         int var9;
         int[] var10000;
         for(var7 = 0; var7 < 65536; ++var7) {
            NPC var19 = Client.npcs[var7];
            if (var19 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var10000 = var19.pathX;
                  var10000[var9] -= var5;
                  var10000 = var19.pathY;
                  var10000[var9] -= var6;
               }

               var19.x -= var5 * 128;
               var19.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Player var22 = Client.players[var7];
            if (var22 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var10000 = var22.pathX;
                  var10000[var9] -= var5;
                  var10000 = var22.pathY;
                  var10000[var9] -= var6;
               }

               var22.x -= var5 * 128;
               var22.y -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var8 = 104;
         byte var21 = 1;
         if (var5 < 0) {
            var20 = 103;
            var8 = -1;
            var21 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if (var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var8 != var13; var13 += var21) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var6 + var14;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
                  } else {
                     Client.groundItems[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
            var18.x -= var5;
            var18.y -= var6;
            if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
               var18.remove();
            }
         }

         if (Client.destinationX != 0) {
            Client.destinationX -= var5;
            Client.destinationY -= var6;
         }

         Client.soundEffectCount = 0;
         Client.isCameraLocked = false;
         class208.cameraX -= var5 << 7;
         ByteArrayPool.cameraZ -= var6 << 7;
         ModeWhere.oculusOrbFocalPointX -= var5 << 7;
         GrandExchangeEvents.oculusOrbFocalPointY -= var6 << 7;
         Client.field747 = -1;
         Client.graphicsObjects.clear();
         Client.projectiles.clear();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14].clear();
         }

      }
   }
}
