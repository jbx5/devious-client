import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("Player")
public final class Player extends Actor {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmw;"
   )
   @Export("appearance")
   PlayerComposition appearance;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1875167049
   )
   @Export("headIconPk")
   int headIconPk = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1905401649
   )
   @Export("headIconPrayer")
   int headIconPrayer = -1;
   @ObfuscatedName("aq")
   @Export("actions")
   String[] actions = new String[3];
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1302967875
   )
   @Export("combatLevel")
   int combatLevel;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 761215505
   )
   @Export("skillLevel")
   int skillLevel;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 561204023
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1402262375
   )
   @Export("animationCycleStart")
   int animationCycleStart;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -935505685
   )
   @Export("animationCycleEnd")
   int animationCycleEnd;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1793688517
   )
   int field1094;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1238902143
   )
   @Export("tileHeight2")
   int tileHeight2;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 240546619
   )
   int field1098;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   @Export("model0")
   Model model0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1793206457
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1107395863
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 54499173
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 806621699
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("aj")
   @Export("isUnanimated")
   boolean isUnanimated;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -55850951
   )
   @Export("team")
   int team;
   @ObfuscatedName("az")
   @Export("isHidden")
   boolean isHidden;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1900490645
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1232170701
   )
   @Export("index")
   int index;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("isFriendTriBool")
   TriBool isFriendTriBool;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("isInFriendsChat")
   TriBool isInFriendsChat;
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("isInClanChat")
   TriBool isInClanChat;
   @ObfuscatedName("bi")
   boolean field1110;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 2039538205
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1584800161
   )
   @Export("tileY")
   int tileY;

   Player() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.actions[var1] = "";
      }

      this.combatLevel = 0;
      this.skillLevel = 0;
      this.animationCycleStart = 0;
      this.animationCycleEnd = 0;
      this.isUnanimated = false;
      this.team = 0;
      this.isHidden = false;
      this.isFriendTriBool = TriBool.TriBool_unknown;
      this.isInFriendsChat = TriBool.TriBool_unknown;
      this.isInClanChat = TriBool.TriBool_unknown;
      this.field1110 = false;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1448794473"
   )
   @Export("read")
   final void read(Buffer var1) {
      var1.offset = 0;
      int var2 = var1.readUnsignedByte();
      boolean var3 = true;
      this.headIconPk = var1.readByte();
      this.headIconPrayer = var1.readByte();
      int var4 = -1;
      this.team = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.readUnsignedByte();
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.readUnsignedByte();
            var5[var6] = var8 + (var7 << 8);
            if (var6 == 0 && var5[0] == 65535) {
               var4 = var1.readUnsignedShort();
               break;
            }

            if (var5[var6] >= 512) {
               var9 = HealthBarUpdate.ItemDefinition_get(var5[var6] - 512).team;
               if (var9 != 0) {
                  this.team = var9;
               }
            }
         }
      }

      int[] var13 = null;
      if (Client.field497 >= 213) {
         var13 = new int[12];

         for(var7 = 0; var7 < 12; ++var7) {
            var8 = var1.readUnsignedByte();
            if (var8 == 0) {
               var13[var7] = 0;
            } else {
               var9 = var1.readUnsignedByte();
               var13[var7] = var9 + (var8 << 8);
            }
         }
      }

      int[] var14 = new int[5];

      for(var8 = 0; var8 < 5; ++var8) {
         var9 = var1.readUnsignedByte();
         if (var9 < 0 || var9 >= PlayerComposition.field3507[var8].length) {
            var9 = 0;
         }

         var14[var8] = var9;
      }

      super.idleSequence = var1.readUnsignedShort();
      if (super.idleSequence == 65535) {
         super.idleSequence = -1;
      }

      super.turnLeftSequence = var1.readUnsignedShort();
      if (super.turnLeftSequence == 65535) {
         super.turnLeftSequence = -1;
      }

      super.turnRightSequence = super.turnLeftSequence;
      super.walkSequence = var1.readUnsignedShort();
      if (super.walkSequence == 65535) {
         super.walkSequence = -1;
      }

      super.walkBackSequence = var1.readUnsignedShort();
      if (super.walkBackSequence == 65535) {
         super.walkBackSequence = -1;
      }

      super.walkLeftSequence = var1.readUnsignedShort();
      if (super.walkLeftSequence == 65535) {
         super.walkLeftSequence = -1;
      }

      super.walkRightSequence = var1.readUnsignedShort();
      if (super.walkRightSequence == 65535) {
         super.walkRightSequence = -1;
      }

      super.runSequence = var1.readUnsignedShort();
      if (super.runSequence == 65535) {
         super.runSequence = -1;
      }

      this.username = new Username(var1.readStringCp1252NullTerminated(), class70.loginType);
      this.clearIsFriend();
      this.clearIsInFriendsChat();
      this.method2296();
      if (this == MusicPatchNode.localPlayer) {
         RunException.field5158 = this.username.getName();
      }

      this.combatLevel = var1.readUnsignedByte();
      this.skillLevel = var1.readUnsignedShort();
      this.isHidden = var1.readUnsignedByte() == 1;
      if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
         this.isHidden = false;
      }

      PlayerCompositionColorTextureOverride[] var15 = null;
      boolean var17 = false;
      int var10 = var1.readUnsignedShort();
      var17 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && var10 != 32768) {
         var15 = new PlayerCompositionColorTextureOverride[12];

         for(var11 = 0; var11 < 12; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (var12 == 1) {
               var15[var11] = Projectile.method2116(var5[var11] - 512, var1);
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.actions[var11] = var1.readStringCp1252NullTerminated();
      }

      int var16 = var1.readUnsignedByte();
      if (this.appearance == null) {
         this.appearance = new PlayerComposition();
      }

      this.appearance.method6037(var13, var5, var15, var17, var14, var2, var4, var16);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "-112"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.appearance == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ItemContainer.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : ItemContainer.SequenceDefinition_get(super.movementSequence);
         Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            if (!this.isUnanimated) {
               var3 = this.method2374(var3);
            }

            if (!this.isUnanimated && this.model0 != null) {
               if (Client.cycle >= this.animationCycleEnd) {
                  this.model0 = null;
               }

               if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
                  Model var5 = this.model0;
                  var5.offsetBy(this.field1094 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1098 * 4096 - super.y);
                  if (super.orientation == 512) {
                     var5.rotateY90Ccw();
                     var5.rotateY90Ccw();
                     var5.rotateY90Ccw();
                  } else if (super.orientation == 1024) {
                     var5.rotateY90Ccw();
                     var5.rotateY90Ccw();
                  } else if (super.orientation == 1536) {
                     var5.rotateY90Ccw();
                  }

                  Model[] var6 = new Model[]{var3, var5};
                  var3 = new Model(var6, 2);
                  if (super.orientation == 512) {
                     var5.rotateY90Ccw();
                  } else if (super.orientation == 1024) {
                     var5.rotateY90Ccw();
                     var5.rotateY90Ccw();
                  } else if (super.orientation == 1536) {
                     var5.rotateY90Ccw();
                     var5.rotateY90Ccw();
                     var5.rotateY90Ccw();
                  }

                  var5.offsetBy(super.x - this.field1094 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1098 * 4096);
               }
            }

            var3.isSingleTile = true;
            if (super.field1208 != 0 && Client.cycle >= super.field1168 && Client.cycle < super.field1156) {
               var3.overrideHue = super.field1180;
               var3.overrideSaturation = super.field1199;
               var3.overrideLuminance = super.field1200;
               var3.overrideAmount = super.field1208;
               var3.field2755 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1214578435"
   )
   @Export("isFriend")
   boolean isFriend() {
      if (this.isFriendTriBool == TriBool.TriBool_unknown) {
         this.checkIsFriend();
      }

      return this.isFriendTriBool == TriBool.TriBool_true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.isFriendTriBool = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "94"
   )
   @Export("checkIsFriend")
   void checkIsFriend() {
      this.isFriendTriBool = World.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-120"
   )
   @Export("isFriendsChatMember")
   boolean isFriendsChatMember() {
      if (this.isInFriendsChat == TriBool.TriBool_unknown) {
         this.updateIsInFriendsChat();
      }

      return this.isInFriendsChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2091394919"
   )
   @Export("clearIsInFriendsChat")
   void clearIsInFriendsChat() {
      this.isInFriendsChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "45"
   )
   @Export("updateIsInFriendsChat")
   void updateIsInFriendsChat() {
      this.isInFriendsChat = UserComparator5.friendsChat != null && UserComparator5.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-64"
   )
   @Export("updateIsInClanChat")
   void updateIsInClanChat() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3302(this.username.getName()) != -1 && var1 != 2) {
            this.isInClanChat = TriBool.TriBool_true;
            return;
         }
      }

      this.isInClanChat = TriBool.TriBool_false;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "453146982"
   )
   void method2296() {
      this.isInClanChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   @Export("isClanMember")
   boolean isClanMember() {
      if (this.isInClanChat == TriBool.TriBool_unknown) {
         this.updateIsInClanChat();
      }

      return this.isInClanChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-83"
   )
   @Export("transformedSize")
   int transformedSize() {
      return this.appearance != null && this.appearance.npcTransformId != -1 ? AbstractArchive.getNpcDefinition(this.appearance.npcTransformId).size : 1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IILiu;B)V",
      garbageValue = "-1"
   )
   final void method2308(int var1, int var2, class210 var3) {
      if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2313 == 1) {
         super.sequence = -1;
      }

      this.method2370();
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if (var3 == class210.field2387) {
               Decimator.method1124(this, var1, var2, class210.field2387);
            }

            this.method2302(var1, var2, var3);
         } else {
            this.resetPath(var1, var2);
         }
      } else {
         this.resetPath(var1, var2);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1060497849"
   )
   @Export("resetPath")
   void resetPath(int var1, int var2) {
      super.pathLength = 0;
      super.field1210 = 0;
      super.field1209 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var3 = this.transformedSize();
      super.x = var3 * 64 + super.pathX[0] * 128;
      super.y = super.pathY[0] * 128 + var3 * 64;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IILiu;I)V",
      garbageValue = "475560620"
   )
   final void method2302(int var1, int var2, class210 var3) {
      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var4 = super.pathLength; var4 > 0; --var4) {
         super.pathX[var4] = super.pathX[var4 - 1];
         super.pathY[var4] = super.pathY[var4 - 1];
         super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
      }

      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.pathTraversed[0] = var3;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1666539507"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.appearance != null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "0"
   )
   static int method2357(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1198190304"
   )
   static void method2356() {
      if (class12.clearLoginScreen) {
         Login.titleboxSprite = null;
         class292.titlebuttonSprite = null;
         class396.runesSprite = null;
         class123.leftTitleSprite = null;
         ParamComposition.rightTitleSprite = null;
         Canvas.logoSprite = null;
         class148.title_muteSprite = null;
         Login.options_buttons_0Sprite = null;
         class158.options_buttons_2Sprite = null;
         class476.worldSelectBackSprites = null;
         class16.worldSelectFlagSprites = null;
         DevicePcmPlayerProvider.worldSelectArrows = null;
         World.worldSelectStars = null;
         class319.field3726 = null;
         class121.loginScreenRunesAnimation.method2442();
         class297.musicPlayerStatus = 1;
         class297.musicTrackArchive = null;
         class379.musicTrackGroupId = -1;
         VarpDefinition.musicTrackFileId = -1;
         class100.musicTrackVolume = 0;
         class120.musicTrackBoolean = false;
         class162.pcmSampleLength = 2;
         class177.method3617(true);
         class12.clearLoginScreen = false;
      }
   }
}
