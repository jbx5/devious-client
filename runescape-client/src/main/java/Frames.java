import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Frames")
public class Frames extends DualNode {
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1398646947
   )
   static int field2593;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lig;"
   )
   @Export("frames")
   Animation[] frames;

   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;IZ)V"
   )
   Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      NodeDeque var5 = new NodeDeque();
      int var6 = var1.getGroupFileCount(var3);
      this.frames = new Animation[var6];
      int[] var7 = var1.getGroupFileIds(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.takeFile(var3, var7[var8]);
         Skeleton var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
            if (var11 == var12.id) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13;
            if (var4) {
               var13 = var2.getFile(0, var11);
            } else {
               var13 = var2.getFile(var11, 0);
            }

            var10 = new Skeleton(var11, var13);
            var5.addFirst(var10);
         }

         this.frames[var7[var8]] = new Animation(var9, var10);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1355530944"
   )
   @Export("hasAlphaTransform")
   public boolean hasAlphaTransform(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lsq;ILdh;II)V",
      garbageValue = "1494438010"
   )
   static final void method4561(PacketBuffer var0, int var1, Player var2, int var3) {
      byte var4 = class211.field2336.field2338;
      int var5;
      if ((var3 & 8192) != 0) {
         var2.spotAnimation = var0.readUnsignedShortAdd();
         var5 = var0.readUnsignedIntLE();
         var2.spotAnimationHeight = var5 >> 16;
         var2.field1190 = (var5 & '\uffff') + Client.cycle;
         var2.spotAnimationFrame = 0;
         var2.spotAnimationFrameCycle = 0;
         if (var2.field1190 > Client.cycle) {
            var2.spotAnimationFrame = -1;
         }

         if (var2.spotAnimation == 65535) {
            var2.spotAnimation = -1;
         }
      }

      if ((var3 & 64) != 0) {
         var5 = var0.readUnsignedByte();
         byte[] var6 = new byte[var5];
         Buffer var7 = new Buffer(var6);
         var0.method8608(var6, 0, var5);
         Players.field1335[var1] = var7;
         var2.read(var7);
      }

      if ((var3 & 4096) != 0) {
         var2.field1192 = var0.readByteAdd();
         var2.field1194 = var0.readByteAdd();
         var2.field1202 = var0.readByteAdd();
         var2.field1195 = var0.readByteNeg();
         var2.field1196 = var0.readUnsignedShort() + Client.cycle;
         var2.field1197 = var0.readUnsignedShortAddLE() + Client.cycle;
         var2.field1162 = var0.readUnsignedShortLE();
         if (var2.field1111) {
            var2.field1192 += var2.tileX;
            var2.field1194 += var2.tileY;
            var2.field1202 += var2.tileX;
            var2.field1195 += var2.tileY;
            var2.pathLength = 0;
         } else {
            var2.field1192 += var2.pathX[0];
            var2.field1194 += var2.pathY[0];
            var2.field1202 += var2.pathX[0];
            var2.field1195 += var2.pathY[0];
            var2.pathLength = 1;
         }

         var2.field1215 = 0;
      }

      int var8;
      int var9;
      int var12;
      int var13;
      if ((var3 & 4) != 0) {
         var5 = var0.readUnsignedByteSub();
         int var10;
         int var14;
         int var16;
         if (var5 > 0) {
            for(var13 = 0; var13 < var5; ++var13) {
               var8 = -1;
               var9 = -1;
               var10 = -1;
               var14 = var0.readUShortSmart();
               if (var14 == 32767) {
                  var14 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  var8 = var0.readUShortSmart();
                  var10 = var0.readUShortSmart();
               } else if (var14 != 32766) {
                  var9 = var0.readUShortSmart();
               } else {
                  var14 = -1;
               }

               var16 = var0.readUShortSmart();
               var2.addHitSplat(var14, var9, var8, var10, Client.cycle, var16);
            }
         }

         var13 = var0.readUnsignedByteAdd();
         if (var13 > 0) {
            for(var14 = 0; var14 < var13; ++var14) {
               var8 = var0.readUShortSmart();
               var9 = var0.readUShortSmart();
               if (var9 != 32767) {
                  var10 = var0.readUShortSmart();
                  var16 = var0.readUnsignedByteSub();
                  var12 = var9 > 0 ? var0.readUnsignedByteSub() : var16;
                  var2.addHealthBar(var8, Client.cycle, var9, var10, var16, var12);
               } else {
                  var2.removeHealthBar(var8);
               }
            }
         }
      }

      if ((var3 & 256) != 0) {
         var4 = var0.readByteSub();
      }

      if ((var3 & 1) != 0) {
         var5 = var0.readUnsignedShortAdd();
         PlayerType var17 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var0.readUnsignedByteSub());
         boolean var19 = var0.readUnsignedByteNeg() == 1;
         var8 = var0.readUnsignedByteNeg();
         var9 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var18 = false;
            if (var17.isUser && class6.friendSystem.isIgnored(var2.username)) {
               var18 = true;
            }

            if (!var18 && Client.field667 == 0 && !var2.isHidden) {
               Players.field1330.offset = 0;
               var0.readBytesLE(Players.field1330.array, 0, var8);
               Players.field1330.offset = 0;
               String var11 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(Players.field1330)));
               var2.overheadText = var11.trim();
               var2.field1163 = var5 >> 8;
               var2.field1156 = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               var2.field1160 = var19;
               var2.field1161 = var2 != BuddyRankComparator.localPlayer && var17.isUser && "" != Client.field637 && var11.toLowerCase().indexOf(Client.field637) == -1;
               if (var17.isPrivileged) {
                  var12 = var19 ? 91 : 1;
               } else {
                  var12 = var19 ? 90 : 2;
               }

               if (var17.modIcon != -1) {
                  MusicPatchNode.addGameMessage(var12, class7.method53(var17.modIcon) + var2.username.getName(), var11);
               } else {
                  MusicPatchNode.addGameMessage(var12, var2.username.getName(), var11);
               }
            }
         }

         var0.offset = var9 + var8;
      }

      if ((var3 & 16384) != 0) {
         Players.field1332[var1] = (class211)SpriteMask.findEnumerated(VarcInt.method3594(), var0.readByteAdd());
      }

      if ((var3 & 16) != 0) {
         var5 = var0.readUnsignedShort();
         if (var5 == 65535) {
            var5 = -1;
         }

         var13 = var0.readUnsignedByteNeg();
         Language.performPlayerAnimation(var2, var5, var13);
      }

      if ((var3 & 2048) != 0) {
         var2.field1201 = Client.cycle + var0.readUnsignedShort();
         var2.field1159 = Client.cycle + var0.readUnsignedShortLE();
         var2.field1203 = var0.readByteAdd();
         var2.field1185 = var0.readByte();
         var2.field1165 = var0.readByteNeg();
         var2.field1206 = (byte)var0.readUnsignedByteSub();
      }

      if ((var3 & 128) != 0) {
         var2.field1164 = var0.readUnsignedShortAdd();
         if (var2.pathLength == 0) {
            var2.orientation = var2.field1164;
            var2.method2362();
         }
      }

      if ((var3 & 32) != 0) {
         var2.overheadText = var0.readStringCp1252NullTerminated();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            MusicPatchNode.addGameMessage(2, var2.username.getName(), var2.overheadText);
         } else if (var2 == BuddyRankComparator.localPlayer) {
            MusicPatchNode.addGameMessage(2, var2.username.getName(), var2.overheadText);
         }

         var2.field1160 = false;
         var2.field1163 = 0;
         var2.field1156 = 0;
         var2.overheadTextCyclesRemaining = 150;
      }

      if ((var3 & 1024) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.actions[var5] = var0.readStringCp1252NullTerminated();
         }
      }

      if ((var3 & 8) != 0) {
         var2.targetIndex = var0.readUnsignedShortLE();
         var2.targetIndex += var0.readUnsignedByteNeg() << 16;
         var5 = 16777215;
         if (var2.targetIndex == var5) {
            var2.targetIndex = -1;
         }
      }

      if (var2.field1111) {
         if (var4 == 127) {
            var2.resetPath(var2.tileX, var2.tileY);
         } else {
            class211 var15;
            if (var4 != class211.field2336.field2338) {
               var15 = (class211)SpriteMask.findEnumerated(VarcInt.method3594(), var4);
            } else {
               var15 = Players.field1332[var1];
            }

            var2.method2336(var2.tileX, var2.tileY, var15);
         }
      }

   }

   @ObfuscatedName("md")
   @ObfuscatedSignature(
      descriptor = "(IIIILsn;Llx;I)V",
      garbageValue = "1091031252"
   )
   @Export("worldToMinimap")
   static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = Client.camAngleY & 2047;
         int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
         int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.width / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class136.redHintArrowSprite.method9078(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class149.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
      }

   }
}
