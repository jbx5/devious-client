import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ClientPreferences")
public class ClientPreferences {
   @ObfuscatedName("au")
   @Export("roofsHidden")
   boolean roofsHidden;
   @ObfuscatedName("ab")
   @Export("hideUsername")
   boolean hideUsername = false;
   @ObfuscatedName("aq")
   @Export("titleMusicDisabled")
   boolean titleMusicDisabled;
   @ObfuscatedName("al")
   @Export("displayFps")
   boolean displayFps = false;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 971082243
   )
   int field1260;
   @ObfuscatedName("aa")
   @Export("brightness")
   double brightness = 0.8;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -461734757
   )
   @Export("musicVolume")
   int musicVolume = 127;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1738472395
   )
   @Export("soundEffectsVolume")
   int soundEffectsVolume = 127;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1655566467
   )
   @Export("areaSoundEffectsVolume")
   int areaSoundEffectsVolume = 127;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -934134045
   )
   int field1255 = -1;
   @ObfuscatedName("ag")
   @Export("rememberedUsername")
   String rememberedUsername = null;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1016688579
   )
   @Export("windowMode")
   int windowMode = 1;
   @ObfuscatedName("av")
   @Export("parameters")
   final Map parameters = new LinkedHashMap();

   ClientPreferences() {
      this.method2445(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lsg;)V"
   )
   ClientPreferences(Buffer var1) {
      if (var1 != null && var1.array != null) {
         int var2 = var1.readUnsignedByte();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.readUnsignedByte() == 1) {
               this.roofsHidden = true;
            }

            if (var2 > 1) {
               this.titleMusicDisabled = var1.readUnsignedByte() == 1;
            }

            if (var2 > 3) {
               this.windowMode = var1.readUnsignedByte();
            }

            if (var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.parameters.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
            }

            if (var2 > 5) {
               this.hideUsername = var1.readBoolean();
            }

            if (var2 > 6) {
               this.brightness = (double)var1.readUnsignedByte() / 100.0;
               this.musicVolume = var1.readUnsignedByte();
               this.soundEffectsVolume = var1.readUnsignedByte();
               this.areaSoundEffectsVolume = var1.readUnsignedByte();
            }

            if (var2 > 7) {
               this.field1255 = var1.readUnsignedByte();
            }

            if (var2 > 8) {
               this.displayFps = var1.readUnsignedByte() == 1;
            }

            if (var2 > 9) {
               this.field1260 = var1.readInt();
            }
         } else {
            this.method2445(true);
         }
      } else {
         this.method2445(true);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-299950185"
   )
   void method2445(boolean var1) {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lsg;",
      garbageValue = "43"
   )
   @Export("toBuffer")
   Buffer toBuffer() {
      Buffer var1 = new Buffer(417, true);
      var1.writeByte(10);
      var1.writeByte(this.roofsHidden ? 1 : 0);
      var1.writeByte(this.titleMusicDisabled ? 1 : 0);
      var1.writeByte(this.windowMode);
      var1.writeByte(this.parameters.size());
      Iterator var2 = this.parameters.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.writeInt((Integer)var3.getKey());
         var1.writeInt((Integer)var3.getValue());
      }

      var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
      var1.writeBoolean(this.hideUsername);
      var1.writeByte((int)(this.brightness * 100.0));
      var1.writeByte(this.musicVolume);
      var1.writeByte(this.soundEffectsVolume);
      var1.writeByte(this.areaSoundEffectsVolume);
      var1.writeByte(this.field1255);
      var1.writeByte(this.displayFps ? 1 : 0);
      var1.writeInt(this.field1260);
      return var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1505559794"
   )
   void method2448(boolean var1) {
      this.roofsHidden = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1957276732"
   )
   boolean method2513() {
      return this.roofsHidden;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1926536328"
   )
   void method2449(boolean var1) {
      this.hideUsername = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2084960938"
   )
   boolean method2450() {
      return this.hideUsername;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-527699713"
   )
   void method2531(boolean var1) {
      this.titleMusicDisabled = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1197954221"
   )
   boolean method2534() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1980083738"
   )
   void method2483(boolean var1) {
      this.displayFps = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-837037786"
   )
   void method2443() {
      this.method2483(!this.displayFps);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "-12734"
   )
   boolean method2455() {
      return this.displayFps;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-3"
   )
   void method2540(int var1) {
      this.field1260 = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1671764667"
   )
   int method2467() {
      return this.field1260;
   }

   @ObfuscatedName("ah")
   void method2458(double var1) {
      this.brightness = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)D",
      garbageValue = "1864449029"
   )
   double method2459() {
      return this.brightness;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-935900203"
   )
   void method2460(int var1) {
      this.musicVolume = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1131552164"
   )
   int method2461() {
      return this.musicVolume;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-957604712"
   )
   @Export("updateSoundEffectVolume")
   void updateSoundEffectVolume(int var1) {
      this.soundEffectsVolume = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1406684169"
   )
   int method2463() {
      return this.soundEffectsVolume;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "745434039"
   )
   void method2464(int var1) {
      this.areaSoundEffectsVolume = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2076733437"
   )
   int method2465() {
      return this.areaSoundEffectsVolume;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-472730554"
   )
   void method2466(String var1) {
      this.rememberedUsername = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-598675425"
   )
   String method2473() {
      return this.rememberedUsername;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1008471336"
   )
   void method2468(int var1) {
      this.field1255 = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-964267539"
   )
   int method2469() {
      return this.field1255;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1521769017"
   )
   void method2470(int var1) {
      this.windowMode = var1;
      class100.savePreferences();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "106"
   )
   int method2471() {
      return this.windowMode;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)V",
      garbageValue = "66"
   )
   void method2488(String var1, int var2) {
      int var3 = this.method2487(var1);
      if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
         Iterator var4 = this.parameters.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.parameters.put(var3, var2);
      class100.savePreferences();
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "-11"
   )
   boolean method2456(String var1) {
      int var2 = this.method2487(var1);
      return this.parameters.containsKey(var2);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "4"
   )
   int method2474(String var1) {
      int var2 = this.method2487(var1);
      return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1030951960"
   )
   int method2487(String var1) {
      return Actor.method2400(var1.toLowerCase());
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lsq;ILdv;IB)V",
      garbageValue = "-111"
   )
   static final void method2501(PacketBuffer var0, int var1, Player var2, int var3) {
      byte var4 = class210.field2390.field2391;
      int var5;
      if ((var3 & 2) != 0) {
         var5 = var0.readUnsignedByteAdd();
         byte[] var6 = new byte[var5];
         Buffer var7 = new Buffer(var6);
         var0.readBytes(var6, 0, var5);
         Players.field1333[var1] = var7;
         var2.read(var7);
      }

      int var13;
      if ((var3 & 16) != 0) {
         var5 = var0.readUnsignedShortAdd();
         if (var5 == 65535) {
            var5 = -1;
         }

         var13 = var0.readUnsignedByteNeg();
         FloorDecoration.performPlayerAnimation(var2, var5, var13);
      }

      if ((var3 & 4) != 0) {
         var2.targetIndex = var0.readUnsignedShortAddLE();
         var2.targetIndex += var0.readUnsignedByteAdd() << 16;
         var5 = 16777215;
         if (var2.targetIndex == var5) {
            var2.targetIndex = -1;
         }
      }

      if ((var3 & 128) != 0) {
         var2.overheadText = var0.readStringCp1252NullTerminated();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            UserComparator5.addGameMessage(2, var2.username.getName(), var2.overheadText);
         } else if (var2 == MusicPatchNode.localPlayer) {
            UserComparator5.addGameMessage(2, var2.username.getName(), var2.overheadText);
         }

         var2.field1176 = false;
         var2.field1161 = 0;
         var2.field1206 = 0;
         var2.overheadTextCyclesRemaining = 150;
      }

      int var8;
      int var9;
      int var12;
      int var14;
      if ((var3 & 64) != 0) {
         var5 = var0.readUnsignedByte();
         int var10;
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
                  var12 = var9 > 0 ? var0.readUnsignedByteNeg() : var16;
                  var2.addHealthBar(var8, Client.cycle, var9, var10, var16, var12);
               } else {
                  var2.removeHealthBar(var8);
               }
            }
         }
      }

      if ((var3 & 1) != 0) {
         var2.field1172 = var0.readUnsignedShort();
         if (var2.pathLength == 0) {
            var2.orientation = var2.field1172;
            var2.method2370();
         }
      }

      if ((var3 & 32) != 0) {
         var5 = var0.readUnsignedShortAdd();
         PlayerType var17 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var0.readUnsignedByte());
         boolean var22 = var0.readUnsignedByteNeg() == 1;
         var8 = var0.readUnsignedByteAdd();
         var9 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var20 = false;
            if (var17.isUser && World.friendSystem.isIgnored(var2.username)) {
               var20 = true;
            }

            if (!var20 && Client.field608 == 0 && !var2.isHidden) {
               Players.field1343.offset = 0;
               var0.readBytes(Players.field1343.array, 0, var8);
               Players.field1343.offset = 0;
               String var11 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(Players.field1343)));
               var2.overheadText = var11.trim();
               var2.field1161 = var5 >> 8;
               var2.field1206 = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               var2.field1176 = var22;
               var2.field1144 = var2 != MusicPatchNode.localPlayer && var17.isUser && "" != Client.field718 && var11.toLowerCase().indexOf(Client.field718) == -1;
               if (var17.isPrivileged) {
                  var12 = var22 ? 91 : 1;
               } else {
                  var12 = var22 ? 90 : 2;
               }

               if (var17.modIcon != -1) {
                  UserComparator5.addGameMessage(var12, ArchiveDiskActionHandler.method6619(var17.modIcon) + var2.username.getName(), var11);
               } else {
                  UserComparator5.addGameMessage(var12, var2.username.getName(), var11);
               }
            }
         }

         var0.offset = var9 + var8;
      }

      if ((var3 & 4096) != 0) {
         var5 = var0.readUnsignedShort();
         var13 = var0.readUnsignedIntIME();
         var2.updateSpotAnimation(0, var5, var13 >> 16, var13 & '\uffff');
      }

      if ((var3 & 1024) != 0) {
         var2.field1187 = var0.readByte();
         var2.field1189 = var0.readByteSub();
         var2.field1188 = var0.readByteNeg();
         var2.field1207 = var0.readByteNeg();
         var2.spotAnimation = var0.readUnsignedShortAddLE() + Client.cycle;
         var2.field1192 = var0.readUnsignedShort() + Client.cycle;
         var2.field1193 = var0.readUnsignedShortAddLE();
         if (var2.field1110) {
            var2.field1187 += var2.tileX;
            var2.field1189 += var2.tileY;
            var2.field1188 += var2.tileX;
            var2.field1207 += var2.tileY;
            var2.pathLength = 0;
         } else {
            var2.field1187 += var2.pathX[0];
            var2.field1189 += var2.pathY[0];
            var2.field1188 += var2.pathX[0];
            var2.field1207 += var2.pathY[0];
            var2.pathLength = 1;
         }

         var2.field1210 = 0;
      }

      if ((var3 & 512) != 0) {
         class210[] var15 = Players.field1332;
         class210[] var19 = new class210[]{class210.field2389, class210.field2390, class210.field2388, class210.field2387};
         var15[var1] = (class210)StructComposition.findEnumerated(var19, var0.readByteAdd());
      }

      if ((var3 & 2048) != 0) {
         var4 = var0.readByte();
      }

      if ((var3 & 8192) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.actions[var5] = var0.readStringCp1252NullTerminated();
         }
      }

      if ((var3 & '耀') != 0) {
         var2.field1168 = Client.cycle + var0.readUnsignedShortAddLE();
         var2.field1156 = Client.cycle + var0.readUnsignedShort();
         var2.field1180 = var0.readByte();
         var2.field1199 = var0.readByte();
         var2.field1200 = var0.readByteAdd();
         var2.field1208 = (byte)var0.readUnsignedByteNeg();
      }

      if ((var3 & 65536) != 0) {
         var5 = var0.readUnsignedByteSub();

         for(var13 = 0; var13 < var5; ++var13) {
            var14 = var0.readUnsignedByteNeg();
            var8 = var0.readUnsignedShortAddLE();
            var9 = var0.readInt();
            var2.updateSpotAnimation(var14, var8, var9 >> 16, var9 & '\uffff');
         }
      }

      if (var2.field1110) {
         if (var4 == 127) {
            var2.resetPath(var2.tileX, var2.tileY);
         } else {
            class210 var21;
            if (var4 != class210.field2390.field2391) {
               class210[] var18 = new class210[]{class210.field2389, class210.field2390, class210.field2388, class210.field2387};
               var21 = (class210)StructComposition.findEnumerated(var18, var4);
            } else {
               var21 = Players.field1332[var1];
            }

            var2.method2308(var2.tileX, var2.tileY, var21);
         }
      }

   }
}
