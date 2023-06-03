import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Player")
public final class Player extends Actor {
   @ObfuscatedName("ap")
   @Export("Tiles_shapes")
   static byte[][][] Tiles_shapes;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lun;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lmk;"
   )
   @Export("appearance")
   PlayerComposition appearance;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1366672705
   )
   @Export("headIconPk")
   int headIconPk = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1008836279
   )
   @Export("headIconPrayer")
   int headIconPrayer = -1;
   @ObfuscatedName("ab")
   @Export("actions")
   String[] actions = new String[3];
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1188560567
   )
   @Export("combatLevel")
   int combatLevel;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -2012563941
   )
   @Export("skillLevel")
   int skillLevel;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 248170849
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 716052611
   )
   @Export("animationCycleStart")
   int animationCycleStart;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1825194637
   )
   @Export("animationCycleEnd")
   int animationCycleEnd;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1980359243
   )
   int field1107;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1434270451
   )
   @Export("tileHeight2")
   int tileHeight2;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1332745825
   )
   int field1122;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   @Export("model0")
   Model model0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1142394889
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1217084697
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 169941669
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -902424909
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("ai")
   @Export("isUnanimated")
   boolean isUnanimated;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -642589407
   )
   @Export("team")
   int team;
   @ObfuscatedName("aw")
   @Export("isHidden")
   boolean isHidden;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1141765425
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1822002451
   )
   @Export("index")
   int index;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("isFriendTriBool")
   TriBool isFriendTriBool;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("isInFriendsChat")
   TriBool isInFriendsChat;
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("isInClanChat")
   TriBool isInClanChat;
   @ObfuscatedName("bj")
   boolean field1124;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1070117953
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1834042161
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
      this.field1124 = false;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "0"
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
               var9 = class300.ItemDefinition_get(var5[var6] - 512).team;
               if (var9 != 0) {
                  this.team = var9;
               }
            }
         }
      }

      int[] var13 = null;
      if (Client.field512 >= 213) {
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
         if (var9 < 0 || var9 >= class13.field65[var8].length) {
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

      this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapScaleHandler.loginType);
      this.clearIsFriend();
      this.clearIsInFriendsChat();
      this.method2290();
      if (this == Projectile.localPlayer) {
         RunException.field5176 = this.username.getName();
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
               var15[var11] = class161.method3332(var5[var11] - 512, var1);
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

      this.appearance.method6010(var13, var5, var15, var17, var14, var2, var4, var16);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljd;",
      garbageValue = "-1953039490"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.appearance == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapLabelSize.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : WorldMapLabelSize.SequenceDefinition_get(super.movementSequence);
         Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            if (!this.isUnanimated) {
               var3 = this.method2366(var3);
            }

            if (!this.isUnanimated && this.model0 != null) {
               if (Client.cycle >= this.animationCycleEnd) {
                  this.model0 = null;
               }

               if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
                  Model var5 = this.model0;
                  var5.offsetBy(this.field1107 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1122 * 4096 - super.y);
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

                  var5.offsetBy(super.x - this.field1107 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1122 * 4096);
               }
            }

            var3.isSingleTile = true;
            if (super.field1217 != 0 && Client.cycle >= super.field1170 && Client.cycle < super.field1213) {
               var3.overrideHue = super.field1164;
               var3.overrideSaturation = super.field1215;
               var3.overrideLuminance = super.field1196;
               var3.overrideAmount = super.field1217;
               var3.field2761 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "62243914"
   )
   @Export("isFriend")
   boolean isFriend() {
      if (this.isFriendTriBool == TriBool.TriBool_unknown) {
         this.checkIsFriend();
      }

      return this.isFriendTriBool == TriBool.TriBool_true;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1446447522"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.isFriendTriBool = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("checkIsFriend")
   void checkIsFriend() {
      this.isFriendTriBool = ApproximateRouteStrategy.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "15"
   )
   @Export("isFriendsChatMember")
   boolean isFriendsChatMember() {
      if (this.isInFriendsChat == TriBool.TriBool_unknown) {
         this.updateIsInFriendsChat();
      }

      return this.isInFriendsChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-28"
   )
   @Export("clearIsInFriendsChat")
   void clearIsInFriendsChat() {
      this.isInFriendsChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "88"
   )
   @Export("updateIsInFriendsChat")
   void updateIsInFriendsChat() {
      this.isInFriendsChat = class406.friendsChat != null && class406.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "260673707"
   )
   @Export("updateIsInClanChat")
   void updateIsInClanChat() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3200(this.username.getName()) != -1 && var1 != 2) {
            this.isInClanChat = TriBool.TriBool_true;
            return;
         }
      }

      this.isInClanChat = TriBool.TriBool_false;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1545837402"
   )
   void method2290() {
      this.isInClanChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-124"
   )
   @Export("isClanMember")
   boolean isClanMember() {
      if (this.isInClanChat == TriBool.TriBool_unknown) {
         this.updateIsInClanChat();
      }

      return this.isInClanChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-52698941"
   )
   @Export("transformedSize")
   int transformedSize() {
      return this.appearance != null && this.appearance.npcTransformId != -1 ? Bounds.getNpcDefinition(this.appearance.npcTransformId).size : 1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IILie;I)V",
      garbageValue = "2094470882"
   )
   final void method2301(int var1, int var2, class216 var3) {
      if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).field2274 == 1) {
         super.sequence = -1;
      }

      this.method2375();
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if (var3 == class216.field2396) {
               PlayerComposition.method6009(this, var1, var2, class216.field2396);
            }

            this.method2296(var1, var2, var3);
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
      garbageValue = "1799040998"
   )
   @Export("resetPath")
   void resetPath(int var1, int var2) {
      super.pathLength = 0;
      super.field1226 = 0;
      super.field1225 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var3 = this.transformedSize();
      super.x = super.pathX[0] * 128 + var3 * 64;
      super.y = super.pathY[0] * 128 + var3 * 64;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IILie;I)V",
      garbageValue = "-1805329488"
   )
   final void method2296(int var1, int var2, class216 var3) {
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "11"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.appearance != null;
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1085648107"
   )
   static void method2340() {
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
   }

   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1840896945"
   )
   @Export("FriendSystem_invalidateIgnoreds")
   static final void FriendSystem_invalidateIgnoreds() {
      PendingSpawn.method2353();
      if (class406.friendsChat != null) {
         class406.friendsChat.invalidateIgnoreds();
      }

   }
}
