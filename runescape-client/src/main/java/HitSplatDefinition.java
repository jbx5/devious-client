import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   public static AbstractArchive field2136;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   public static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("HitSplatDefinition_cached")
   public static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -190562641
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1122576807
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2128627617
   )
   public int field2142 = 70;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1456888261
   )
   int field2137 = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 178659185
   )
   int field2128 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1540253033
   )
   int field2139 = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 79970133
   )
   int field2130 = -1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 734281613
   )
   public int field2141 = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -551205167
   )
   public int field2148 = 0;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -652363921
   )
   public int field2143 = -1;
   @ObfuscatedName("q")
   String field2144 = "";
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1154293603
   )
   public int field2145 = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -175467331
   )
   public int field2146 = 0;
   @ObfuscatedName("g")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1894453127
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 73075505
   )
   @Export("transformVarp")
   int transformVarp = -1;

   HitSplatDefinition() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "-76"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "-1689532457"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field2137 = var1.readNullableLargeSmart();
      } else if (var2 == 4) {
         this.field2139 = var1.readNullableLargeSmart();
      } else if (var2 == 5) {
         this.field2128 = var1.readNullableLargeSmart();
      } else if (var2 == 6) {
         this.field2130 = var1.readNullableLargeSmart();
      } else if (var2 == 7) {
         this.field2141 = var1.readShort();
      } else if (var2 == 8) {
         this.field2144 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field2142 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2148 = var1.readShort();
      } else if (var2 == 11) {
         this.field2143 = 0;
      } else if (var2 == 12) {
         this.field2145 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2146 = var1.readShort();
      } else if (var2 == 14) {
         this.field2143 = var1.readUnsignedShort();
      } else if (var2 == 17 || var2 == 18) {
         this.transformVarbit = var1.readUnsignedShort();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformVarp = var1.readUnsignedShort();
         if (this.transformVarp == 65535) {
            this.transformVarp = -1;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)Lgb;",
      garbageValue = "-65"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = SecureRandomFuture.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? ChatChannel.method2224(var2) : null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-690048949"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field2144;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + ParamComposition.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Lrs;",
      garbageValue = "1965935121"
   )
   public SpritePixels method3877() {
      if (this.field2137 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2137);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2137, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2137);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Lrs;",
      garbageValue = "-28423300"
   )
   public SpritePixels method3879() {
      if (this.field2128 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2128);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2128, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2128);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(S)Lrs;",
      garbageValue = "-13683"
   )
   public SpritePixels method3884() {
      if (this.field2139 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2139);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2139, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2139);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Lrs;",
      garbageValue = "1628743674"
   )
   public SpritePixels method3875() {
      if (this.field2130 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2130);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2130, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2130);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(S)Lnv;",
      garbageValue = "-3862"
   )
   @Export("getFont")
   public Font getFont() {
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class33.method488(field2136, HitSplatDefinition_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lru;ILcl;IB)V",
      garbageValue = "-77"
   )
   static final void method3902(PacketBuffer var0, int var1, Player var2, int var3) {
      byte var4 = class208.field2363.field2359;
      if ((var3 & 1024) != 0) {
         var2.field1176 = Client.cycle + var0.readUnsignedShortLE();
         var2.field1221 = Client.cycle + var0.readUnsignedShortAdd();
         var2.field1180 = var0.readByteNeg();
         var2.field1227 = var0.readByteAdd();
         var2.field1224 = var0.readByteSub();
         var2.field1225 = (byte)var0.readUnsignedByteSub();
      }

      int var5;
      if ((var3 & 4) != 0) {
         var5 = var0.readUnsignedByteAdd();
         byte[] var6 = new byte[var5];
         Buffer var7 = new Buffer(var6);
         var0.readBytesLE(var6, 0, var5);
         Players.field1341[var1] = var7;
         var2.read(var7);
      }

      int var8;
      int var9;
      int var12;
      if ((var3 & 8) != 0) {
         var5 = var0.readUnsignedShortLE();
         PlayerType var17 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var0.readUnsignedByteNeg());
         boolean var13 = var0.readUnsignedByteSub() == 1;
         var8 = var0.readUnsignedByteSub();
         var9 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var10 = false;
            if (var17.isUser && WorldMapElement.friendSystem.isIgnored(var2.username)) {
               var10 = true;
            }

            if (!var10 && Client.field626 == 0 && !var2.isHidden) {
               Players.field1351.offset = 0;
               var0.readBytes(Players.field1351.array, 0, var8);
               Players.field1351.offset = 0;
               String var11 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(Players.field1351)));
               var2.overheadText = var11.trim();
               var2.field1161 = var5 >> 8;
               var2.field1185 = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               var2.field1181 = var13;
               var2.field1166 = var2 != class387.localPlayer && var17.isUser && "" != Client.field738 && var11.toLowerCase().indexOf(Client.field738) == -1;
               if (var17.isPrivileged) {
                  var12 = var13 ? 91 : 1;
               } else {
                  var12 = var13 ? 90 : 2;
               }

               if (var17.modIcon != -1) {
                  class280.addGameMessage(var12, ObjectSound.method1919(var17.modIcon) + var2.username.getName(), var11);
               } else {
                  class280.addGameMessage(var12, var2.username.getName(), var11);
               }
            }
         }

         var0.offset = var8 + var9;
      }

      if ((var3 & 16384) != 0) {
         class208[] var14 = Players.field1340;
         class208[] var19 = new class208[]{class208.field2360, class208.field2363, class208.field2362, class208.field2366};
         var14[var1] = (class208)class4.findEnumerated(var19, var0.readByteAdd());
      }

      if ((var3 & 4096) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.actions[var5] = var0.readStringCp1252NullTerminated();
         }
      }

      if ((var3 & 128) != 0) {
         var2.field1195 = var0.readUnsignedShort();
         if (var2.pathLength == 0) {
            var2.orientation = var2.field1195;
            var2.field1195 = -1;
         }
      }

      if ((var3 & 2048) != 0) {
         var2.spotAnimation = var0.readUnsignedShortAddLE();
         var5 = var0.readInt();
         var2.spotAnimationHeight = var5 >> 16;
         var2.field1207 = (var5 & '\uffff') + Client.cycle;
         var2.spotAnimationFrame = 0;
         var2.spotAnimationFrameCycle = 0;
         if (var2.field1207 > Client.cycle) {
            var2.spotAnimationFrame = -1;
         }

         if (var2.spotAnimation == 65535) {
            var2.spotAnimation = -1;
         }
      }

      if ((var3 & 1) != 0) {
         var2.overheadText = var0.readStringCp1252NullTerminated();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            class280.addGameMessage(2, var2.username.getName(), var2.overheadText);
         } else if (var2 == class387.localPlayer) {
            class280.addGameMessage(2, var2.username.getName(), var2.overheadText);
         }

         var2.field1181 = false;
         var2.field1161 = 0;
         var2.field1185 = 0;
         var2.overheadTextCyclesRemaining = 150;
      }

      int var15;
      if ((var3 & 2) != 0) {
         var5 = var0.readUnsignedShortAddLE();
         if (var5 == 65535) {
            var5 = -1;
         }

         var15 = var0.readUnsignedByteSub();
         PendingSpawn.performPlayerAnimation(var2, var5, var15);
      }

      if ((var3 & 32) != 0) {
         var5 = var0.readUnsignedByteAdd();
         int var16;
         int var20;
         int var21;
         if (var5 > 0) {
            for(var15 = 0; var15 < var5; ++var15) {
               var8 = -1;
               var9 = -1;
               var20 = -1;
               var21 = var0.readUShortSmart();
               if (var21 == 32767) {
                  var21 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  var8 = var0.readUShortSmart();
                  var20 = var0.readUShortSmart();
               } else if (var21 != 32766) {
                  var9 = var0.readUShortSmart();
               } else {
                  var21 = -1;
               }

               var16 = var0.readUShortSmart();
               var2.addHitSplat(var21, var9, var8, var20, Client.cycle, var16);
            }
         }

         var15 = var0.readUnsignedByteSub();
         if (var15 > 0) {
            for(var21 = 0; var21 < var15; ++var21) {
               var8 = var0.readUShortSmart();
               var9 = var0.readUShortSmart();
               if (var9 != 32767) {
                  var20 = var0.readUShortSmart();
                  var16 = var0.readUnsignedByteAdd();
                  var12 = var9 > 0 ? var0.readUnsignedByteAdd() : var16;
                  var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12);
               } else {
                  var2.removeHealthBar(var8);
               }
            }
         }
      }

      if ((var3 & 256) != 0) {
         var2.field1211 = var0.readByte();
         var2.field1213 = var0.readByteSub();
         var2.field1212 = var0.readByteNeg();
         var2.field1214 = var0.readByteAdd();
         var2.field1215 = var0.readUnsignedShortLE() + Client.cycle;
         var2.field1189 = var0.readUnsignedShortAddLE() + Client.cycle;
         var2.field1217 = var0.readUnsignedShortAddLE();
         if (var2.field1132) {
            var2.field1211 += var2.tileX;
            var2.field1213 += var2.tileY;
            var2.field1212 += var2.tileX;
            var2.field1214 += var2.tileY;
            var2.pathLength = 0;
         } else {
            var2.field1211 += var2.pathX[0];
            var2.field1213 += var2.pathY[0];
            var2.field1212 += var2.pathX[0];
            var2.field1214 += var2.pathY[0];
            var2.pathLength = 1;
         }

         var2.field1230 = 0;
      }

      if ((var3 & 512) != 0) {
         var4 = var0.readByteSub();
      }

      if ((var3 & 16) != 0) {
         var2.targetIndex = var0.readUnsignedShortLE();
         if (class323.isLargePlayerInfo) {
            var2.targetIndex += var0.readUnsignedByte() << 16;
            var5 = 16777215;
         } else {
            var5 = 65535;
         }

         if (var2.targetIndex == var5) {
            var2.targetIndex = -1;
         }
      }

      if (var2.field1132) {
         if (var4 == 127) {
            var2.resetPath(var2.tileX, var2.tileY);
         } else {
            class208 var22;
            if (var4 != class208.field2363.field2359) {
               class208[] var18 = new class208[]{class208.field2360, class208.field2363, class208.field2362, class208.field2366};
               var22 = (class208)class4.findEnumerated(var18, var4);
            } else {
               var22 = Players.field1340[var1];
            }

            var2.method2361(var2.tileX, var2.tileY, var22);
         }
      }

   }
}
