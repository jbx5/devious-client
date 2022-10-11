import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Player")
public final class Player extends Actor {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lks;"
   )
   @Export("appearance")
   PlayerComposition appearance;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -973671885
   )
   @Export("headIconPk")
   int headIconPk = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1139374581
   )
   @Export("headIconPrayer")
   int headIconPrayer = -1;
   @ObfuscatedName("j")
   @Export("actions")
   String[] actions = new String[3];
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -234814145
   )
   @Export("combatLevel")
   int combatLevel;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 937780563
   )
   @Export("skillLevel")
   int skillLevel;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2062844103
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 129983789
   )
   @Export("animationCycleStart")
   int animationCycleStart;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 216240057
   )
   @Export("animationCycleEnd")
   int animationCycleEnd;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1094414963
   )
   int field1095;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1671151533
   )
   @Export("tileHeight2")
   int tileHeight2;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2074914179
   )
   int field1100;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lha;"
   )
   @Export("model0")
   Model model0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 2099943415
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 706149609
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1787519731
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1894548591
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("m")
   @Export("isUnanimated")
   boolean isUnanimated;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1544922815
   )
   @Export("team")
   int team;
   @ObfuscatedName("i")
   @Export("isHidden")
   boolean isHidden;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -934524493
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -2016345547
   )
   @Export("index")
   int index;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isFriendTriBool")
   TriBool isFriendTriBool;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isInFriendsChat")
   TriBool isInFriendsChat;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isInClanChat")
   TriBool isInClanChat;
   @ObfuscatedName("ah")
   boolean field1116;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1234582483
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 873216329
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
      this.field1116 = false;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "-27"
   )
   @Export("read")
   final void read(Buffer var1) {
      var1.offset = 0;
      int var2 = var1.readUnsignedByte();
      int var3 = -1;
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
               var9 = MidiPcmStream.ItemDefinition_get(var5[var6] - 512).team;
               if (var9 != 0) {
                  this.team = var9;
               }
            }
         }
      }

      int[] var25 = new int[5];

      for(var7 = 0; var7 < 5; ++var7) {
         var8 = var1.readUnsignedByte();
         if (var8 < 0 || var8 >= class34.field193[var7].length) {
            var8 = 0;
         }

         var25[var7] = var8;
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

      this.username = new Username(var1.readStringCp1252NullTerminated(), ViewportMouse.loginType);
      this.clearIsFriend();
      this.clearIsInFriendsChat();
      this.method2264();
      if (this == class296.localPlayer) {
         RunException.localPlayerName = this.username.getName();
      }

      this.combatLevel = var1.readUnsignedByte();
      this.skillLevel = var1.readUnsignedShort();
      this.isHidden = var1.readUnsignedByte() == 1;
      if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
         this.isHidden = false;
      }

      PlayerCompositionColorTextureOverride[] var26 = null;
      boolean var27 = false;
      var9 = var1.readUnsignedShort();
      var27 = (var9 >> 15 & 1) == 1;
      int var10;
      if (var9 > 0 && var9 != 32768) {
         var26 = new PlayerCompositionColorTextureOverride[12];

         for(var10 = 0; var10 < 12; ++var10) {
            int var11 = var9 >> 12 - var10 & 1;
            if (var11 == 1) {
               int var15 = var5[var10] - 512;
               int var16 = var1.readUnsignedByte();
               boolean var17 = (var16 & 1) != 0;
               boolean var18 = (var16 & 2) != 0;
               PlayerCompositionColorTextureOverride var19 = new PlayerCompositionColorTextureOverride(var15);
               int var20;
               int[] var21;
               boolean var22;
               int var23;
               short var24;
               if (var17) {
                  var20 = var1.readUnsignedByte();
                  var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                  var22 = var19.playerCompositionRecolorTo != null && var21.length == var19.playerCompositionRecolorTo.length;

                  for(var23 = 0; var23 < 2; ++var23) {
                     if (var21[var23] != 15) {
                        var24 = (short)var1.readUnsignedShort();
                        if (var22) {
                           var19.playerCompositionRecolorTo[var21[var23]] = var24;
                        }
                     }
                  }
               }

               if (var18) {
                  var20 = var1.readUnsignedByte();
                  var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                  var22 = var19.playerCompositionRetextureTo != null && var21.length == var19.playerCompositionRetextureTo.length;

                  for(var23 = 0; var23 < 2; ++var23) {
                     if (var21[var23] != 15) {
                        var24 = (short)var1.readUnsignedShort();
                        if (var22) {
                           var19.playerCompositionRetextureTo[var21[var23]] = var24;
                        }
                     }
                  }
               }

               var26[var10] = var19;
            }
         }
      }

      for(var10 = 0; var10 < 3; ++var10) {
         this.actions[var10] = var1.readStringCp1252NullTerminated();
      }

      if (Client.field789 > 208) {
         var3 = var1.readUnsignedByte();
      }

      if (this.appearance == null) {
         this.appearance = new PlayerComposition();
      }

      this.appearance.method5730(var5, var26, var27, var25, var2, var4, var3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lha;",
      garbageValue = "-157507070"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.appearance == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapElement.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : WorldMapElement.SequenceDefinition_get(super.movementSequence);
         Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            Model var5;
            Model[] var6;
            if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
               var5 = ReflectionCheck.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
               if (var5 != null) {
                  var5.offsetBy(0, -super.spotAnimationHeight, 0);
                  var6 = new Model[]{var3, var5};
                  var3 = new Model(var6, 2);
               }
            }

            if (!this.isUnanimated && this.model0 != null) {
               if (Client.cycle >= this.animationCycleEnd) {
                  this.model0 = null;
               }

               if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
                  var5 = this.model0;
                  var5.offsetBy(this.field1095 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1100 * 4096 - super.y);
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

                  var6 = new Model[]{var3, var5};
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

                  var5.offsetBy(super.x - this.field1095 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1100 * 4096);
               }
            }

            var3.isSingleTile = true;
            if (super.field1202 != 0 && Client.cycle >= super.field1197 && Client.cycle < super.field1198) {
               var3.overrideHue = super.field1199;
               var3.overrideSaturation = super.field1200;
               var3.overrideLuminance = super.field1185;
               var3.overrideAmount = super.field1202;
               var3.field2667 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-119"
   )
   @Export("isFriend")
   boolean isFriend() {
      if (this.isFriendTriBool == TriBool.TriBool_unknown) {
         this.checkIsFriend();
      }

      return this.isFriendTriBool == TriBool.TriBool_true;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-76"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.isFriendTriBool = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-315549965"
   )
   @Export("checkIsFriend")
   void checkIsFriend() {
      this.isFriendTriBool = WallDecoration.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1712140055"
   )
   @Export("isFriendsChatMember")
   boolean isFriendsChatMember() {
      if (this.isInFriendsChat == TriBool.TriBool_unknown) {
         this.updateIsInFriendsChat();
      }

      return this.isInFriendsChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-20159007"
   )
   @Export("clearIsInFriendsChat")
   void clearIsInFriendsChat() {
      this.isInFriendsChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1623340343"
   )
   @Export("updateIsInFriendsChat")
   void updateIsInFriendsChat() {
      this.isInFriendsChat = MenuAction.friendsChat != null && MenuAction.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "262226571"
   )
   @Export("updateIsInClanChat")
   void updateIsInClanChat() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3076(this.username.getName()) != -1 && var1 != 2) {
            this.isInClanChat = TriBool.TriBool_true;
            return;
         }
      }

      this.isInClanChat = TriBool.TriBool_false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   void method2264() {
      this.isInClanChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-163412579"
   )
   @Export("isClanMember")
   boolean isClanMember() {
      if (this.isInClanChat == TriBool.TriBool_unknown) {
         this.updateIsInClanChat();
      }

      return this.isInClanChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "123"
   )
   @Export("transformedSize")
   int transformedSize() {
      return this.appearance != null && this.appearance.npcTransformId != -1 ? HealthBarDefinition.getNpcDefinition(this.appearance.npcTransformId).size : 1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IILgo;I)V",
      garbageValue = "-2010845157"
   )
   final void method2291(int var1, int var2, class202 var3) {
      if (super.sequence != -1 && WorldMapElement.SequenceDefinition_get(super.sequence).field2211 == 1) {
         super.sequence = -1;
      }

      super.field1203 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if (var3 == class202.field2284) {
               Player var4 = this;
               class202 var5 = class202.field2284;
               int var6 = super.pathX[0];
               int var7 = super.pathY[0];
               int var8 = this.transformedSize();
               if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
                  int var10 = this.transformedSize();
                  Client.field790.approxDestinationX = var1;
                  Client.field790.approxDestinationY = var2;
                  Client.field790.approxDestinationSizeX = 1;
                  Client.field790.approxDestinationSizeY = 1;
                  ApproximateRouteStrategy var11 = Client.field790;
                  ApproximateRouteStrategy var12 = var11;
                  CollisionMap var13 = Client.collisionMaps[this.plane];
                  int[] var14 = Client.field693;
                  int[] var15 = Client.field792;
                  int var16 = 0;

                  label550:
                  while(true) {
                     int var17;
                     if (var16 >= 128) {
                        int var18;
                        int var19;
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int[][] var26;
                        int var27;
                        int var28;
                        int var29;
                        boolean var36;
                        boolean var37;
                        byte var39;
                        if (var10 == 1) {
                           var18 = var6;
                           var19 = var7;
                           var20 = 64;
                           var21 = 64;
                           var22 = var6 - var20;
                           var23 = var7 - var21;
                           class203.directions[var20][var21] = 99;
                           class203.distances[var20][var21] = 0;
                           var24 = 0;
                           var25 = 0;
                           class203.bufferX[var24] = var6;
                           class203.bufferY[var24++] = var7;
                           var26 = var13.flags;

                           while(true) {
                              if (var25 == var24) {
                                 class203.field2291 = var18;
                                 class203.field2294 = var19;
                                 var37 = false;
                                 break;
                              }

                              var18 = class203.bufferX[var25];
                              var19 = class203.bufferY[var25];
                              var25 = var25 + 1 & 4095;
                              var20 = var18 - var22;
                              var21 = var19 - var23;
                              var27 = var18 - var13.xInset;
                              var28 = var19 - var13.yInset;
                              if (var12.hasArrived(1, var18, var19, var13)) {
                                 class203.field2291 = var18;
                                 class203.field2294 = var19;
                                 var37 = true;
                                 break;
                              }

                              var29 = class203.distances[var20][var21] + 1;
                              if (var20 > 0 && class203.directions[var20 - 1][var21] == 0 && (var26[var27 - 1][var28] & 19136776) == 0) {
                                 class203.bufferX[var24] = var18 - 1;
                                 class203.bufferY[var24] = var19;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 - 1][var21] = 2;
                                 class203.distances[var20 - 1][var21] = var29;
                              }

                              if (var20 < 127 && class203.directions[var20 + 1][var21] == 0 && (var26[var27 + 1][var28] & 19136896) == 0) {
                                 class203.bufferX[var24] = var18 + 1;
                                 class203.bufferY[var24] = var19;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 + 1][var21] = 8;
                                 class203.distances[var20 + 1][var21] = var29;
                              }

                              if (var21 > 0 && class203.directions[var20][var21 - 1] == 0 && (var26[var27][var28 - 1] & 19136770) == 0) {
                                 class203.bufferX[var24] = var18;
                                 class203.bufferY[var24] = var19 - 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20][var21 - 1] = 1;
                                 class203.distances[var20][var21 - 1] = var29;
                              }

                              if (var21 < 127 && class203.directions[var20][var21 + 1] == 0 && (var26[var27][var28 + 1] & 19136800) == 0) {
                                 class203.bufferX[var24] = var18;
                                 class203.bufferY[var24] = var19 + 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20][var21 + 1] = 4;
                                 class203.distances[var20][var21 + 1] = var29;
                              }

                              if (var20 > 0 && var21 > 0 && class203.directions[var20 - 1][var21 - 1] == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0 && (var26[var27 - 1][var28] & 19136776) == 0 && (var26[var27][var28 - 1] & 19136770) == 0) {
                                 class203.bufferX[var24] = var18 - 1;
                                 class203.bufferY[var24] = var19 - 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 - 1][var21 - 1] = 3;
                                 class203.distances[var20 - 1][var21 - 1] = var29;
                              }

                              if (var20 < 127 && var21 > 0 && class203.directions[var20 + 1][var21 - 1] == 0 && (var26[var27 + 1][var28 - 1] & 19136899) == 0 && (var26[var27 + 1][var28] & 19136896) == 0 && (var26[var27][var28 - 1] & 19136770) == 0) {
                                 class203.bufferX[var24] = var18 + 1;
                                 class203.bufferY[var24] = var19 - 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 + 1][var21 - 1] = 9;
                                 class203.distances[var20 + 1][var21 - 1] = var29;
                              }

                              if (var20 > 0 && var21 < 127 && class203.directions[var20 - 1][var21 + 1] == 0 && (var26[var27 - 1][var28 + 1] & 19136824) == 0 && (var26[var27 - 1][var28] & 19136776) == 0 && (var26[var27][var28 + 1] & 19136800) == 0) {
                                 class203.bufferX[var24] = var18 - 1;
                                 class203.bufferY[var24] = var19 + 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 - 1][var21 + 1] = 6;
                                 class203.distances[var20 - 1][var21 + 1] = var29;
                              }

                              if (var20 < 127 && var21 < 127 && class203.directions[var20 + 1][var21 + 1] == 0 && (var26[var27 + 1][var28 + 1] & 19136992) == 0 && (var26[var27 + 1][var28] & 19136896) == 0 && (var26[var27][var28 + 1] & 19136800) == 0) {
                                 class203.bufferX[var24] = var18 + 1;
                                 class203.bufferY[var24] = var19 + 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 + 1][var21 + 1] = 12;
                                 class203.distances[var20 + 1][var21 + 1] = var29;
                              }
                           }

                           var36 = var37;
                        } else if (var10 == 2) {
                           var18 = var6;
                           var19 = var7;
                           byte var38 = 64;
                           var39 = 64;
                           var22 = var6 - var38;
                           var23 = var7 - var39;
                           class203.directions[var38][var39] = 99;
                           class203.distances[var38][var39] = 0;
                           byte var41 = 0;
                           var25 = 0;
                           class203.bufferX[var41] = var6;
                           var24 = var41 + 1;
                           class203.bufferY[var41] = var7;
                           var26 = var13.flags;

                           while(true) {
                              if (var24 == var25) {
                                 class203.field2291 = var18;
                                 class203.field2294 = var19;
                                 var37 = false;
                                 break;
                              }

                              var18 = class203.bufferX[var25];
                              var19 = class203.bufferY[var25];
                              var25 = var25 + 1 & 4095;
                              var20 = var18 - var22;
                              var21 = var19 - var23;
                              var27 = var18 - var13.xInset;
                              var28 = var19 - var13.yInset;
                              if (var12.hasArrived(2, var18, var19, var13)) {
                                 class203.field2291 = var18;
                                 class203.field2294 = var19;
                                 var37 = true;
                                 break;
                              }

                              var29 = class203.distances[var20][var21] + 1;
                              if (var20 > 0 && class203.directions[var20 - 1][var21] == 0 && (var26[var27 - 1][var28] & 19136782) == 0 && (var26[var27 - 1][var28 + 1] & 19136824) == 0) {
                                 class203.bufferX[var24] = var18 - 1;
                                 class203.bufferY[var24] = var19;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 - 1][var21] = 2;
                                 class203.distances[var20 - 1][var21] = var29;
                              }

                              if (var20 < 126 && class203.directions[var20 + 1][var21] == 0 && (var26[var27 + 2][var28] & 19136899) == 0 && (var26[var27 + 2][var28 + 1] & 19136992) == 0) {
                                 class203.bufferX[var24] = var18 + 1;
                                 class203.bufferY[var24] = var19;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 + 1][var21] = 8;
                                 class203.distances[var20 + 1][var21] = var29;
                              }

                              if (var21 > 0 && class203.directions[var20][var21 - 1] == 0 && (var26[var27][var28 - 1] & 19136782) == 0 && (var26[var27 + 1][var28 - 1] & 19136899) == 0) {
                                 class203.bufferX[var24] = var18;
                                 class203.bufferY[var24] = var19 - 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20][var21 - 1] = 1;
                                 class203.distances[var20][var21 - 1] = var29;
                              }

                              if (var21 < 126 && class203.directions[var20][var21 + 1] == 0 && (var26[var27][var28 + 2] & 19136824) == 0 && (var26[var27 + 1][var28 + 2] & 19136992) == 0) {
                                 class203.bufferX[var24] = var18;
                                 class203.bufferY[var24] = var19 + 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20][var21 + 1] = 4;
                                 class203.distances[var20][var21 + 1] = var29;
                              }

                              if (var20 > 0 && var21 > 0 && class203.directions[var20 - 1][var21 - 1] == 0 && (var26[var27 - 1][var28] & 19136830) == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0 && (var26[var27][var28 - 1] & 19136911) == 0) {
                                 class203.bufferX[var24] = var18 - 1;
                                 class203.bufferY[var24] = var19 - 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 - 1][var21 - 1] = 3;
                                 class203.distances[var20 - 1][var21 - 1] = var29;
                              }

                              if (var20 < 126 && var21 > 0 && class203.directions[var20 + 1][var21 - 1] == 0 && (var26[var27 + 1][var28 - 1] & 19136911) == 0 && (var26[var27 + 2][var28 - 1] & 19136899) == 0 && (var26[var27 + 2][var28] & 19136995) == 0) {
                                 class203.bufferX[var24] = var18 + 1;
                                 class203.bufferY[var24] = var19 - 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 + 1][var21 - 1] = 9;
                                 class203.distances[var20 + 1][var21 - 1] = var29;
                              }

                              if (var20 > 0 && var21 < 126 && class203.directions[var20 - 1][var21 + 1] == 0 && (var26[var27 - 1][var28 + 1] & 19136830) == 0 && (var26[var27 - 1][var28 + 2] & 19136824) == 0 && (var26[var27][var28 + 2] & 19137016) == 0) {
                                 class203.bufferX[var24] = var18 - 1;
                                 class203.bufferY[var24] = var19 + 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 - 1][var21 + 1] = 6;
                                 class203.distances[var20 - 1][var21 + 1] = var29;
                              }

                              if (var20 < 126 && var21 < 126 && class203.directions[var20 + 1][var21 + 1] == 0 && (var26[var27 + 1][var28 + 2] & 19137016) == 0 && (var26[var27 + 2][var28 + 2] & 19136992) == 0 && (var26[var27 + 2][var28 + 1] & 19136995) == 0) {
                                 class203.bufferX[var24] = var18 + 1;
                                 class203.bufferY[var24] = var19 + 1;
                                 var24 = var24 + 1 & 4095;
                                 class203.directions[var20 + 1][var21 + 1] = 12;
                                 class203.distances[var20 + 1][var21 + 1] = var29;
                              }
                           }

                           var36 = var37;
                        } else {
                           var36 = class34.method502(var6, var7, var10, var11, var13);
                        }

                        int var9;
                        label575: {
                           var17 = var6 - 64;
                           var18 = var7 - 64;
                           var19 = class203.field2291;
                           var20 = class203.field2294;
                           if (!var36) {
                              var21 = Integer.MAX_VALUE;
                              var22 = Integer.MAX_VALUE;
                              byte var40 = 10;
                              var24 = var12.approxDestinationX;
                              var25 = var12.approxDestinationY;
                              int var35 = var12.approxDestinationSizeX;
                              var27 = var12.approxDestinationSizeY;

                              for(var28 = var24 - var40; var28 <= var40 + var24; ++var28) {
                                 for(var29 = var25 - var40; var29 <= var40 + var25; ++var29) {
                                    int var30 = var28 - var17;
                                    int var31 = var29 - var18;
                                    if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class203.distances[var30][var31] < 100) {
                                       int var32 = 0;
                                       if (var28 < var24) {
                                          var32 = var24 - var28;
                                       } else if (var28 > var35 + var24 - 1) {
                                          var32 = var28 - (var35 + var24 - 1);
                                       }

                                       int var33 = 0;
                                       if (var29 < var25) {
                                          var33 = var25 - var29;
                                       } else if (var29 > var27 + var25 - 1) {
                                          var33 = var29 - (var27 + var25 - 1);
                                       }

                                       int var34 = var32 * var32 + var33 * var33;
                                       if (var34 < var21 || var34 == var21 && class203.distances[var30][var31] < var22) {
                                          var21 = var34;
                                          var22 = class203.distances[var30][var31];
                                          var19 = var28;
                                          var20 = var29;
                                       }
                                    }
                                 }
                              }

                              if (var21 == Integer.MAX_VALUE) {
                                 var9 = -1;
                                 break label575;
                              }
                           }

                           if (var6 == var19 && var20 == var7) {
                              var14[0] = var19;
                              var15[0] = var20;
                              var9 = 0;
                           } else {
                              var39 = 0;
                              class203.bufferX[var39] = var19;
                              var21 = var39 + 1;
                              class203.bufferY[var39] = var20;

                              for(var22 = var23 = class203.directions[var19 - var17][var20 - var18]; var6 != var19 || var20 != var7; var22 = class203.directions[var19 - var17][var20 - var18]) {
                                 if (var23 != var22) {
                                    var23 = var22;
                                    class203.bufferX[var21] = var19;
                                    class203.bufferY[var21++] = var20;
                                 }

                                 if ((var22 & 2) != 0) {
                                    ++var19;
                                 } else if ((var22 & 8) != 0) {
                                    --var19;
                                 }

                                 if ((var22 & 1) != 0) {
                                    ++var20;
                                 } else if ((var22 & 4) != 0) {
                                    --var20;
                                 }
                              }

                              var24 = 0;

                              while(var21-- > 0) {
                                 var14[var24] = class203.bufferX[var21];
                                 var15[var24++] = class203.bufferY[var21];
                                 if (var24 >= var14.length) {
                                    break;
                                 }
                              }

                              var9 = var24;
                           }
                        }

                        var16 = var9;
                        if (var9 < 1) {
                           break;
                        }

                        var17 = 0;

                        while(true) {
                           if (var17 >= var16 - 1) {
                              break label550;
                           }

                           var4.method2267(Client.field693[var17], Client.field792[var17], var5);
                           ++var17;
                        }
                     }

                     for(var17 = 0; var17 < 128; ++var17) {
                        class203.directions[var16][var17] = 0;
                        class203.distances[var16][var17] = 99999999;
                     }

                     ++var16;
                  }
               }
            }

            this.method2267(var1, var2, var3);
         } else {
            this.resetPath(var1, var2);
         }
      } else {
         this.resetPath(var1, var2);
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1977889478"
   )
   @Export("resetPath")
   void resetPath(int var1, int var2) {
      super.pathLength = 0;
      super.field1211 = 0;
      super.field1172 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var3 = this.transformedSize();
      super.x = var3 * 64 + super.pathX[0] * 128;
      super.y = super.pathY[0] * 128 + var3 * 64;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IILgo;I)V",
      garbageValue = "2044223400"
   )
   final void method2267(int var1, int var2, class202 var3) {
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

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "246357037"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.appearance != null;
   }
}
