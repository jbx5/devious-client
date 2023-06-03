import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ho")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("SpotAnimationDefinition_archive")
   static AbstractArchive SpotAnimationDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("SpotAnimationDefinition_modelArchive")
   static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("SpotAnimationDefinition_cached")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("SpotAnimationDefinition_cachedModels")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("jc")
   @Export("xteaKeys")
   static int[][] xteaKeys;
   @ObfuscatedName("sf")
   @ObfuscatedSignature(
      descriptor = "Ltx;"
   )
   @Export("privateChatMode")
   static PrivateChatMode privateChatMode;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -353303845
   )
   @Export("id")
   int id;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 901346361
   )
   @Export("archive")
   int archive;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -92560425
   )
   @Export("sequence")
   public int sequence = -1;
   @ObfuscatedName("ak")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("ae")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("af")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("ao")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -33661509
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -973947101
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 261658215
   )
   @Export("orientation")
   int orientation = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1109298941
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -818946995
   )
   @Export("contrast")
   int contrast = 0;

   SpotAnimationDefinition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-1476524281"
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "-2099355738"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.archive = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.sequence = var1.readUnsignedShort();
      } else if (var2 == 4) {
         this.widthScale = var1.readUnsignedShort();
      } else if (var2 == 5) {
         this.heightScale = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.orientation = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.ambient = var1.readUnsignedByte();
      } else if (var2 == 8) {
         this.contrast = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorFrom = new short[var3];
            this.recolorTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorFrom[var4] = (short)var1.readUnsignedShort();
               this.recolorTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureFrom = new short[var3];
            this.retextureTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureFrom[var4] = (short)var1.readUnsignedShort();
               this.retextureTo[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Ljd;",
      garbageValue = "72733370"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      Model var2 = this.method3764();
      Model var3;
      if (this.sequence != -1 && var1 != -1) {
         var3 = WorldMapLabelSize.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
      } else {
         var3 = var2.toSharedSpotAnimationModel(true);
      }

      if (this.widthScale != 128 || this.heightScale != 128) {
         var3.scale(this.widthScale, this.heightScale, this.widthScale);
      }

      if (this.orientation != 0) {
         if (this.orientation == 90) {
            var3.rotateY90Ccw();
         }

         if (this.orientation == 180) {
            var3.rotateY90Ccw();
            var3.rotateY90Ccw();
         }

         if (this.orientation == 270) {
            var3.rotateY90Ccw();
            var3.rotateY90Ccw();
            var3.rotateY90Ccw();
         }
      }

      return var3;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Ljd;",
      garbageValue = "117"
   )
   public final Model method3764() {
      Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
      if (var1 == null) {
         ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (this.recolorFrom != null) {
            for(var3 = 0; var3 < this.recolorFrom.length; ++var3) {
               var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for(var3 = 0; var3 < this.retextureFrom.length; ++var3) {
               var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
            }
         }

         var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
      }

      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Loj;IB)Llm;",
      garbageValue = "-50"
   )
   public static PacketBufferNode method3778(int var0, String var1, Language var2, int var3) {
      PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByte(0);
      int var5 = var4.packetBuffer.offset;
      var4.packetBuffer.writeByte(var0);
      String var6 = var1.toLowerCase();
      int var7 = 0;
      byte[] var8 = null;
      if (var6.startsWith("yellow:")) {
         var7 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var6.startsWith("red:")) {
         var7 = 1;
         var1 = var1.substring("red:".length());
      } else if (var6.startsWith("green:")) {
         var7 = 2;
         var1 = var1.substring("green:".length());
      } else if (var6.startsWith("cyan:")) {
         var7 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var6.startsWith("purple:")) {
         var7 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var6.startsWith("white:")) {
         var7 = 5;
         var1 = var1.substring("white:".length());
      } else if (var6.startsWith("flash1:")) {
         var7 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var6.startsWith("flash2:")) {
         var7 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var6.startsWith("flash3:")) {
         var7 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var6.startsWith("glow1:")) {
         var7 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var6.startsWith("glow2:")) {
         var7 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var6.startsWith("glow3:")) {
         var7 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var6.startsWith("rainbow:")) {
         var7 = 12;
         var1 = var1.substring("rainbow:".length());
      } else if (var6.startsWith("pattern")) {
         boolean var10 = true;
         boolean var11 = true;
         int var12 = "pattern".length();
         int var13 = 0;
         byte[] var14 = new byte[8];

         byte[] var9;
         while(true) {
            int var15 = var13 + var12;
            if (var15 >= var6.length()) {
               var9 = null;
               break;
            }

            char var16 = var6.charAt(var15);
            if (var16 == ':') {
               if (var13 == 0) {
                  var9 = null;
               } else {
                  byte[] var17 = new byte[var13];
                  System.arraycopy(var14, 0, var17, 0, var13);
                  var9 = var17;
               }
               break;
            }

            if (var14.length == var13) {
               var9 = null;
               break;
            }

            if (var16 >= '0' && var16 <= '9') {
               var16 = (char)(var16 - 48);
            } else {
               if (var16 < 'a' || var16 > 'z') {
                  var9 = null;
                  break;
               }

               var16 = (char)(var16 - 87);
            }

            var14[var13++] = (byte)var16;
         }

         var8 = var9;
         if (var9 != null) {
            var7 = var9.length + 12;
            var1 = var1.substring("pattern".length() + var9.length + 1);
         }
      }

      var6 = var1.toLowerCase();
      byte var18 = 0;
      if (var6.startsWith("wave:")) {
         var18 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var6.startsWith("wave2:")) {
         var18 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var6.startsWith("shake:")) {
         var18 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var6.startsWith("scroll:")) {
         var18 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var6.startsWith("slide:")) {
         var18 = 5;
         var1 = var1.substring("slide:".length());
      }

      var4.packetBuffer.writeByte(var7);
      var4.packetBuffer.writeByte(var18);
      if (var8 != null && Client.field512 >= 214) {
         for(int var19 = 0; var19 < var8.length; ++var19) {
            var4.packetBuffer.writeByte(var8[var19]);
         }
      }

      class324.method6006(var4.packetBuffer, var1);
      if (var0 == class337.field3778.rsOrdinal()) {
         var4.packetBuffer.writeByte(var3);
      }

      var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
      return var4;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "-1461228191"
   )
   static int method3777(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (ApproximateRouteStrategy.friendSystem.field835 == 0) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
         } else if (ApproximateRouteStrategy.friendSystem.field835 == 1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)ApproximateRouteStrategy.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ApproximateRouteStrategy.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ApproximateRouteStrategy.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               class10.method102(var5, var9);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               ApproximateRouteStrategy.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               ApproximateRouteStrategy.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               ApproximateRouteStrategy.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               boolean var6 = true;
               ApproximateRouteStrategy.friendSystem.removeIgnore(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               var5 = Canvas.method326(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.isFriended(new Username(var5, WorldMapScaleHandler.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (class406.friendsChat != null) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class406.friendsChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (class406.friendsChat != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class406.friendsChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class406.friendsChat != null && var3 < class406.friendsChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class406.friendsChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class406.friendsChat != null && var3 < class406.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class406.friendsChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class406.friendsChat != null && var3 < class406.friendsChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class406.friendsChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class406.friendsChat != null ? class406.friendsChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               NPC.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class406.friendsChat != null ? class406.friendsChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               class7.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               class441.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!ApproximateRouteStrategy.friendSystem.method1803()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)ApproximateRouteStrategy.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               var5 = Canvas.method326(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var5, WorldMapScaleHandler.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class406.friendsChat != null && var3 < class406.friendsChat.getSize() && class406.friendsChat.get(var3).getUsername().equals(Projectile.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (class406.friendsChat != null && class406.friendsChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class406.friendsChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class406.friendsChat != null && var3 < class406.friendsChat.getSize() && ((ClanMate)class406.friendsChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  ApproximateRouteStrategy.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     ApproximateRouteStrategy.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     ApproximateRouteStrategy.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     ApproximateRouteStrategy.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class406.friendsChat != null) {
                        class406.friendsChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class406.friendsChat != null) {
                        class406.friendsChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (class406.friendsChat != null) {
                        class406.friendsChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (class406.friendsChat != null && var3 < class406.friendsChat.getSize() && ((ClanMate)class406.friendsChat.get(var3)).isIgnored()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
