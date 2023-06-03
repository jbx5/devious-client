import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public enum class137 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1601(0, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1593(1, 1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1594(2, 2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1595(3, 3),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1592(4, 4),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1597(5, 5),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1598(6, 6),
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1599(7, 7),
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1600(8, 8);

   @ObfuscatedName("ux")
   @ObfuscatedGetter(
      intValue = 974564480
   )
   static int field1605;
   @ObfuscatedName("hj")
   static SecureRandom field1603;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1599000033
   )
   final int field1602;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 851635983
   )
   final int field1596;

   class137(int var3, int var4) {
      this.field1602 = var3;
      this.field1596 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1596;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "959853468"
   )
   static final float method3092(int var0) {
      float var1 = 10075.0F - (float)var0;
      return (1.0075567F * var1 - 75.56675F) / var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ltl;ILdh;II)V",
      garbageValue = "-1720676100"
   )
   static final void method3090(PacketBuffer var0, int var1, Player var2, int var3) {
      byte var4 = class216.field2397.field2393;
      int var5;
      int var6;
      if ((var3 & 32) != 0) {
         var5 = var0.readUnsignedShortAddLE();
         if (var5 == 65535) {
            var5 = -1;
         }

         var6 = var0.readUnsignedByteAdd();
         ServerPacket.performPlayerAnimation(var2, var5, var6);
      }

      int var7;
      int var10;
      int var11;
      if ((var3 & 256) != 0) {
         var5 = var0.readUnsignedShortLE();
         var6 = var5 >> 8;
         var7 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0;
         PlayerType var8 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var0.readUnsignedByteAdd());
         boolean var9 = var0.readUnsignedByte() == 1;
         var10 = var0.readUnsignedByteAdd();
         var11 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var12 = false;
            if (var8.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var2.username)) {
               var12 = true;
            }

            if (!var12 && Client.field626 == 0 && !var2.isHidden) {
               Players.field1342.offset = 0;
               var0.readBytesLE(Players.field1342.array, 0, var10);
               Players.field1342.offset = 0;
               String var13 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(Players.field1342)));
               var2.overheadText = var13.trim();
               var2.field1189 = var5 >> 8;
               var2.field1177 = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               byte[] var14 = null;
               int var15;
               if (var7 > 0 && var7 <= 8) {
                  var14 = new byte[var7];

                  for(var15 = 0; var15 < var7; ++var15) {
                     var14[var15] = var0.readByteNeg();
                  }
               }

               var2.field1224 = class169.method3407(var14);
               var2.field1165 = var9;
               var2.field1174 = var2 != Projectile.localPlayer && var8.isUser && "" != Client.field736 && var13.toLowerCase().indexOf(Client.field736) == -1;
               if (var8.isPrivileged) {
                  var15 = var9 ? 91 : 1;
               } else {
                  var15 = var9 ? 90 : 2;
               }

               if (var8.modIcon != -1) {
                  class59.addGameMessage(var15, class100.method2624(var8.modIcon) + var2.username.getName(), var13);
               } else {
                  class59.addGameMessage(var15, var2.username.getName(), var13);
               }
            }
         }

         var0.offset = var11 + var10 + var7;
      }

      if ((var3 & 16384) != 0) {
         var4 = var0.readByteAdd();
      }

      int var19;
      int var22;
      if ((var3 & 65536) != 0) {
         var5 = var0.readUnsignedByteSub();

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = var0.readUnsignedByte();
            var19 = var0.readUnsignedShortLE();
            var22 = var0.readUnsignedIntME();
            var2.updateSpotAnimation(var7, var19, var22 >> 16, var22 & '\uffff');
         }
      }

      if ((var3 & 4096) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.actions[var5] = var0.readStringCp1252NullTerminated();
         }
      }

      if ((var3 & 2048) != 0) {
         class216[] var16 = Players.field1328;
         class216[] var17 = new class216[]{class216.field2394, class216.field2395, class216.field2396, class216.field2397};
         var16[var1] = (class216)GameObject.findEnumerated(var17, var0.readByteNeg());
      }

      int var24;
      if ((var3 & 64) != 0) {
         var5 = var0.readUnsignedShort();
         PlayerType var18 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var0.readUnsignedByteAdd());
         boolean var21 = var0.readUnsignedByteNeg() == 1;
         var19 = var0.readUnsignedByte();
         var22 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var23 = false;
            if (var18.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var2.username)) {
               var23 = true;
            }

            if (!var23 && Client.field626 == 0 && !var2.isHidden) {
               Players.field1342.offset = 0;
               var0.readBytesLE(Players.field1342.array, 0, var19);
               Players.field1342.offset = 0;
               String var20 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(Players.field1342)));
               var2.overheadText = var20.trim();
               var2.field1189 = var5 >> 8;
               var2.field1177 = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               var2.field1224 = null;
               var2.field1165 = var21;
               var2.field1174 = var2 != Projectile.localPlayer && var18.isUser && "" != Client.field736 && var20.toLowerCase().indexOf(Client.field736) == -1;
               if (var18.isPrivileged) {
                  var24 = var21 ? 91 : 1;
               } else {
                  var24 = var21 ? 90 : 2;
               }

               if (var18.modIcon != -1) {
                  class59.addGameMessage(var24, class100.method2624(var18.modIcon) + var2.username.getName(), var20);
               } else {
                  class59.addGameMessage(var24, var2.username.getName(), var20);
               }
            }
         }

         var0.offset = var22 + var19;
      }

      if ((var3 & 1) != 0) {
         var5 = var0.readUnsignedByteAdd();
         if (var5 > 0) {
            for(var6 = 0; var6 < var5; ++var6) {
               var19 = -1;
               var22 = -1;
               var10 = -1;
               var7 = var0.readUShortSmart();
               if (var7 == 32767) {
                  var7 = var0.readUShortSmart();
                  var22 = var0.readUShortSmart();
                  var19 = var0.readUShortSmart();
                  var10 = var0.readUShortSmart();
               } else if (var7 != 32766) {
                  var22 = var0.readUShortSmart();
               } else {
                  var7 = -1;
               }

               var11 = var0.readUShortSmart();
               var2.addHitSplat(var7, var22, var19, var10, Client.cycle, var11);
            }
         }

         var6 = var0.readUnsignedByteNeg();
         if (var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var19 = var0.readUShortSmart();
               var22 = var0.readUShortSmart();
               if (var22 != 32767) {
                  var10 = var0.readUShortSmart();
                  var11 = var0.readUnsignedByteSub();
                  var24 = var22 > 0 ? var0.readUnsignedByteSub() : var11;
                  var2.addHealthBar(var19, Client.cycle, var22, var10, var11, var24);
               } else {
                  var2.removeHealthBar(var19);
               }
            }
         }
      }

      if ((var3 & 16) != 0) {
         var2.targetIndex = var0.readUnsignedShortLE();
         var2.targetIndex += var0.readUnsignedByteAdd() << 16;
         var5 = 16777215;
         if (var2.targetIndex == var5) {
            var2.targetIndex = -1;
         }
      }

      if ((var3 & 1024) != 0) {
         var2.field1203 = var0.readByteNeg();
         var2.field1205 = var0.readByteAdd();
         var2.field1173 = var0.readByteNeg();
         var2.field1206 = var0.readByte();
         var2.spotAnimation = var0.readUnsignedShortAdd() + Client.cycle;
         var2.field1208 = var0.readUnsignedShort() + Client.cycle;
         var2.field1209 = var0.readUnsignedShortLE();
         if (var2.field1124) {
            var2.field1203 += var2.tileX;
            var2.field1205 += var2.tileY;
            var2.field1173 += var2.tileX;
            var2.field1206 += var2.tileY;
            var2.pathLength = 0;
         } else {
            var2.field1203 += var2.pathX[0];
            var2.field1205 += var2.pathY[0];
            var2.field1173 += var2.pathX[0];
            var2.field1206 += var2.pathY[0];
            var2.pathLength = 1;
         }

         var2.field1226 = 0;
      }

      if ((var3 & 128) != 0) {
         var2.overheadText = var0.readStringCp1252NullTerminated();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            class59.addGameMessage(2, var2.username.getName(), var2.overheadText);
         } else if (var2 == Projectile.localPlayer) {
            class59.addGameMessage(2, var2.username.getName(), var2.overheadText);
         }

         var2.field1165 = false;
         var2.field1189 = 0;
         var2.field1177 = 0;
         var2.overheadTextCyclesRemaining = 150;
      }

      if ((var3 & 4) != 0) {
         var5 = var0.readUnsignedByteSub();
         byte[] var27 = new byte[var5];
         Buffer var26 = new Buffer(var27);
         var0.method9155(var27, 0, var5);
         Players.field1332[var1] = var26;
         var2.read(var26);
      }

      if ((var3 & 2) != 0) {
         var2.field1228 = var0.readUnsignedShortAddLE();
         if (var2.pathLength == 0) {
            var2.orientation = var2.field1228;
            var2.method2375();
         }
      }

      if ((var3 & '耀') != 0) {
         var2.field1170 = Client.cycle + var0.readUnsignedShort();
         var2.field1213 = Client.cycle + var0.readUnsignedShort();
         var2.field1164 = var0.readByte();
         var2.field1215 = var0.readByteAdd();
         var2.field1196 = var0.readByte();
         var2.field1217 = (byte)var0.readUnsignedByte();
      }

      if (var2.field1124) {
         if (var4 == 127) {
            var2.resetPath(var2.tileX, var2.tileY);
         } else {
            class216 var25;
            if (var4 != class216.field2397.field2393) {
               class216[] var28 = new class216[]{class216.field2394, class216.field2395, class216.field2396, class216.field2397};
               var25 = (class216)GameObject.findEnumerated(var28, var4);
            } else {
               var25 = Players.field1328[var1];
            }

            var2.method2301(var2.tileX, var2.tileY, var25);
         }
      }

   }
}
