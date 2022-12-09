import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   field2008(2, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   @Export("HorizontalAlignment_centered")
   HorizontalAlignment_centered(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   field2010(0, 2);

   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1932312333
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 200031989
   )
   @Export("id")
   final int id;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "-3876"
   )
   public static int method3659(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lqx;ILcj;II)V",
      garbageValue = "1288077313"
   )
   static final void method3660(PacketBuffer var0, int var1, Player var2, int var3) {
      byte var4 = class204.field2354.field2358;
      if ((var3 & 8192) != 0) {
         var2.field1196 = var0.readByteSub();
         var2.field1185 = var0.readByte();
         var2.field1230 = var0.readByteSub();
         var2.field1213 = var0.readByteAdd();
         var2.field1233 = var0.readUnsignedShortLE() + Client.cycle;
         var2.field1234 = var0.readUnsignedShortAdd() + Client.cycle;
         var2.field1235 = var0.readUnsignedShort();
         if (var2.field1133) {
            var2.field1196 += var2.tileX;
            var2.field1185 += var2.tileY;
            var2.field1230 += var2.tileX;
            var2.field1213 += var2.tileY;
            var2.pathLength = 0;
         } else {
            var2.field1196 += var2.pathX[0];
            var2.field1185 += var2.pathY[0];
            var2.field1230 += var2.pathX[0];
            var2.field1213 += var2.pathY[0];
            var2.pathLength = 1;
         }

         var2.field1252 = 0;
      }

      if ((var3 & 32) != 0) {
         var2.overheadText = var0.readStringCp1252NullTerminated();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            KitDefinition.addGameMessage(2, var2.username.getName(), var2.overheadText);
         } else if (var2 == class155.localPlayer) {
            KitDefinition.addGameMessage(2, var2.username.getName(), var2.overheadText);
         }

         var2.isAutoChatting = false;
         var2.overheadTextColor = 0;
         var2.overheadTextEffect = 0;
         var2.overheadTextCyclesRemaining = 150;
      }

      int var5;
      if ((var3 & 4096) != 0) {
         var2.spotAnimation = var0.readUnsignedShort();
         var5 = var0.readUnsignedIntME();
         var2.spotAnimationHeight = var5 >> 16;
         var2.field1227 = (var5 & '\uffff') + Client.cycle;
         var2.spotAnimationFrame = 0;
         var2.spotAnimationFrameCycle = 0;
         if (var2.field1227 > Client.cycle) {
            var2.spotAnimationFrame = -1;
         }

         if (var2.spotAnimation == 65535) {
            var2.spotAnimation = -1;
         }
      }

      int var6;
      if ((var3 & 8) != 0) {
         var5 = var0.readUnsignedShortAdd();
         if (var5 == 65535) {
            var5 = -1;
         }

         var6 = var0.readUnsignedByte();
         class262.performPlayerAnimation(var2, var5, var6);
      }

      if ((var3 & 256) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.actions[var5] = var0.readStringCp1252NullTerminated();
         }
      }

      if ((var3 & 16) != 0) {
         var2.targetIndex = var0.readUnsignedShortAddLE();
         if (class200.isLargePlayerInfo) {
            var2.targetIndex += var0.readUnsignedByte() << 16;
            var5 = 16777215;
         } else {
            var5 = 65535;
         }

         if (var2.targetIndex == var5) {
            var2.targetIndex = -1;
         }
      }

      if ((var3 & 16384) != 0) {
         var2.field1238 = Client.cycle + var0.readUnsignedShortAdd();
         var2.field1200 = Client.cycle + var0.readUnsignedShortLE();
         var2.field1240 = var0.readByteNeg();
         var2.field1220 = var0.readByteNeg();
         var2.field1232 = var0.readByte();
         var2.field1243 = (byte)var0.readUnsignedByteAdd();
      }

      if ((var3 & 128) != 0) {
         var2.field1190 = var0.readUnsignedShortAddLE();
         if (var2.pathLength == 0) {
            var2.orientation = var2.field1190;
            var2.field1190 = -1;
         }
      }

      if ((var3 & 4) != 0) {
         var5 = var0.readUnsignedByteSub();
         byte[] var13 = new byte[var5];
         Buffer var7 = new Buffer(var13);
         var0.readBytesLE(var13, 0, var5);
         Players.field1372[var1] = var7;
         var2.read(var7);
      }

      if ((var3 & 1024) != 0) {
         var4 = var0.readByte();
      }

      int var8;
      int var9;
      int var12;
      if ((var3 & 2) != 0) {
         var5 = var0.readUnsignedShortAddLE();
         PlayerType var19 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var0.readUnsignedByteSub());
         boolean var14 = var0.readUnsignedByteSub() == 1;
         var8 = var0.readUnsignedByteAdd();
         var9 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var10 = false;
            if (var19.isUser && DefaultsGroup.friendSystem.isIgnored(var2.username)) {
               var10 = true;
            }

            if (!var10 && Client.field691 == 0 && !var2.isHidden) {
               Players.field1382.offset = 0;
               var0.readBytesLE(Players.field1382.array, 0, var8);
               Players.field1382.offset = 0;
               String var11 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(Players.field1382)));
               var2.overheadText = var11.trim();
               var2.overheadTextColor = var5 >> 8;
               var2.overheadTextEffect = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               var2.isAutoChatting = var14;
               var2.field1187 = var2 != class155.localPlayer && var19.isUser && "" != Client.field744 && var11.toLowerCase().indexOf(Client.field744) == -1;
               if (var19.isPrivileged) {
                  var12 = var14 ? 91 : 1;
               } else {
                  var12 = var14 ? 90 : 2;
               }

               if (var19.modIcon != -1) {
                  KitDefinition.addGameMessage(var12, class456.method8410(var19.modIcon) + var2.username.getName(), var11);
               } else {
                  KitDefinition.addGameMessage(var12, var2.username.getName(), var11);
               }
            }
         }

         var0.offset = var9 + var8;
      }

      if ((var3 & 1) != 0) {
         var5 = var0.readUnsignedByte();
         int var16;
         int var18;
         int var21;
         if (var5 > 0) {
            for(var6 = 0; var6 < var5; ++var6) {
               var8 = -1;
               var9 = -1;
               var18 = -1;
               var21 = var0.readUShortSmart();
               if (var21 == 32767) {
                  var21 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  var8 = var0.readUShortSmart();
                  var18 = var0.readUShortSmart();
               } else if (var21 != 32766) {
                  var9 = var0.readUShortSmart();
               } else {
                  var21 = -1;
               }

               var16 = var0.readUShortSmart();
               var2.addHitSplat(var21, var9, var8, var18, Client.cycle, var16);
            }
         }

         var6 = var0.readUnsignedByteSub();
         if (var6 > 0) {
            for(var21 = 0; var21 < var6; ++var21) {
               var8 = var0.readUShortSmart();
               var9 = var0.readUShortSmart();
               if (var9 != 32767) {
                  var18 = var0.readUShortSmart();
                  var16 = var0.readUnsignedByteAdd();
                  var12 = var9 > 0 ? var0.readUnsignedByte() : var16;
                  var2.addHealthBar(var8, Client.cycle, var9, var18, var16, var12);
               } else {
                  var2.removeHealthBar(var8);
               }
            }
         }
      }

      if ((var3 & 2048) != 0) {
         class204[] var15 = Players.field1379;
         class204[] var17 = new class204[]{class204.field2356, class204.field2354, class204.field2357, class204.field2355};
         var15[var1] = (class204)World.findEnumerated(var17, var0.readByte());
      }

      if (var2.field1133) {
         if (var4 == 127) {
            var2.resetPath(var2.tileX, var2.tileY);
         } else {
            class204 var22;
            if (var4 != class204.field2354.field2358) {
               class204[] var20 = new class204[]{class204.field2356, class204.field2354, class204.field2357, class204.field2355};
               var22 = (class204)World.findEnumerated(var20, var4);
            } else {
               var22 = Players.field1379[var1];
            }

            var2.method2298(var2.tileX, var2.tileY, var22);
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-784516572"
   )
   public static void method3658() {
      HitSplatDefinition.HitSplatDefinition_cached.clear();
      HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
      HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1959220052"
   )
   public static void method3653() {
      Widget.Widget_cachedSprites.clear();
      Widget.Widget_cachedModels.clear();
      Widget.Widget_cachedFonts.clear();
      Widget.Widget_cachedSpriteMasks.clear();
   }
}
