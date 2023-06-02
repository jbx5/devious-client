import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("FriendSystem")
public class FriendSystem {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsj;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("friendsList")
   public final FriendsList friendsList;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lpg;"
   )
   @Export("ignoreList")
   public final IgnoreList ignoreList;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1563649439
   )
   int field835 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lsj;)V"
   )
   FriendSystem(LoginType var1) {
      this.loginType = var1;
      this.friendsList = new FriendsList(var1);
      this.ignoreList = new IgnoreList(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-151991990"
   )
   boolean method1803() {
      return this.field835 == 2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "694283927"
   )
   final void method1804() {
      this.field835 = 1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "1429504887"
   )
   @Export("readUpdate")
   final void readUpdate(Buffer var1, int var2) {
      this.friendsList.read(var1, var2);
      this.field835 = 2;

      for(int var3 = 0; var3 < Players.Players_count; ++var3) {
         Player var4 = Client.players[Players.Players_indices[var3]];
         var4.clearIsFriend();
      }

      Iterator var5 = Messages.Messages_hashTable.iterator();

      while(var5.hasNext()) {
         Message var6 = (Message)var5.next();
         var6.clearIsFromFriend();
      }

      if (class406.friendsChat != null) {
         class406.friendsChat.clearFriends();
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "116"
   )
   @Export("processFriendUpdates")
   final void processFriendUpdates() {
      for(FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
         if ((long)var1.field4591 < BoundaryObject.method5027() / 1000L - 5L) {
            if (var1.world > 0) {
               class59.addGameMessage(5, "", var1.username + " has logged in.");
            }

            if (var1.world == 0) {
               class59.addGameMessage(5, "", var1.username + " has logged out.");
            }

            var1.remove();
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "42"
   )
   @Export("clear")
   final void clear() {
      this.field835 = 0;
      this.friendsList.clear();
      this.ignoreList.clear();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lun;ZS)Z",
      garbageValue = "-29781"
   )
   @Export("isFriended")
   final boolean isFriended(Username var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(Projectile.localPlayer.username)) {
         return true;
      } else {
         return this.friendsList.isFriended(var1, var2);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lun;I)Z",
      garbageValue = "-777054287"
   )
   @Export("isIgnored")
   final boolean isIgnored(Username var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.ignoreList.contains(var1);
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1535555082"
   )
   @Export("addFriend")
   final void addFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsListIsFull()) {
               class300.method5687();
            } else if (Projectile.localPlayer.username.equals(var2)) {
               ItemComposition.method4018();
            } else if (this.isFriended(var2, false)) {
               class127.method2957(var1);
            } else if (this.isIgnored(var2)) {
               class143.method3132(var1);
            } else {
               PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "111948697"
   )
   @Export("friendsListIsFull")
   final boolean friendsListIsFull() {
      return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "16949"
   )
   @Export("addIgnore")
   final void addIgnore(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.canAddIgnore()) {
               ParamComposition.method3837("Your ignore list is full. Max of 100 for free users, and 400 for members");
            } else if (Projectile.localPlayer.username.equals(var2)) {
               ParamComposition.method3837("You can't add yourself to your own ignore list");
            } else if (this.isIgnored(var2)) {
               ParamComposition.method3837(var1 + " is already on your ignore list");
            } else if (this.isFriended(var2, false)) {
               ParamComposition.method3837("Please remove " + var1 + " from your friend list first");
            } else {
               class7.method51(var1);
            }
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "65"
   )
   @Export("canAddIgnore")
   final boolean canAddIgnore() {
      return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   @Export("removeFriend")
   final void removeFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsList.removeByUsername(var2)) {
               PacketBufferNode.method5665();
               PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }

            for(int var5 = 0; var5 < Players.Players_count; ++var5) {
               Player var4 = Client.players[Players.Players_indices[var5]];
               var4.clearIsFriend();
            }

            Iterator var6 = Messages.Messages_hashTable.iterator();

            while(var6.hasNext()) {
               Message var7 = (Message)var6.next();
               var7.clearIsFromFriend();
            }

            if (class406.friendsChat != null) {
               class406.friendsChat.clearFriends();
            }

         }
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "-1138743001"
   )
   @Export("removeIgnore")
   public final void removeIgnore(String var1, boolean var2) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName()) {
            if (this.ignoreList.removeByUsername(var3)) {
               PacketBufferNode.method5665();
               if (var2) {
                  PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
                  var4.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var1));
                  var4.packetBuffer.writeStringCp1252NullTerminated(var1);
                  Client.packetWriter.addNode(var4);
               }
            }

            Player.FriendSystem_invalidateIgnoreds();
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lun;B)Z",
      garbageValue = "41"
   )
   @Export("isFriendAndHasWorld")
   final boolean isFriendAndHasWorld(Username var1) {
      Friend var2 = (Friend)this.friendsList.getByUsername(var1);
      return var2 != null && var2.hasWorld();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Lmb;",
      garbageValue = "-1490786494"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (class16.Widget_interfaceComponents[var1] == null || class16.Widget_interfaceComponents[var1][var2] == null) {
         boolean var3 = Client.loadInterface(var1);
         if (!var3) {
            return null;
         }
      }

      return class16.Widget_interfaceComponents[var1][var2];
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "(IZZZZI)Lny;",
      garbageValue = "-2038793065"
   )
   @Export("newArchive")
   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      ArchiveDisk var5 = null;
      if (JagexCache.JagexCache_dat2File != null) {
         var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, WorldMapSection0.JagexCache_idxFiles[var0], 1000000);
      }

      return new Archive(var5, ClanChannelMember.masterDisk, var0, var1, var2, var3, var4);
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1072800741"
   )
   @Export("logOut")
   static final void logOut() {
      Client.packetWriter.close();
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
      class490.method8764();
      KitDefinition.KitDefinition_cached.clear();
      ObjectComposition.ObjectDefinition_cached.clear();
      ObjectComposition.ObjectDefinition_cachedModelData.clear();
      ObjectComposition.ObjectDefinition_cachedEntities.clear();
      ObjectComposition.ObjectDefinition_cachedModels.clear();
      class141.method3119();
      ItemComposition.ItemDefinition_cached.clear();
      ItemComposition.ItemDefinition_cachedModels.clear();
      ItemComposition.ItemDefinition_cachedSprites.clear();
      VarcInt.method3617();
      AbstractWorldMapIcon.method5525();
      SecureRandomCallable.method2210();
      class143.method3134();
      GraphicsObject.HitSplatDefinition_cachedSprites.method8721();
      HealthBar.HitSplatDefinition_cached.method8721();
      class291.method5661();
      VarpDefinition.method3584();
      class168.method3398();
      ParamComposition.ParamDefinition_cached.clear();
      WorldMapElement.WorldMapElement_cachedSprites.clear();
      class90.method2280();
      SecureRandomCallable.method2215();
      Client.DBTableIndex_cache.clear();
      Client.DBTableMasterIndex_cache.clear();
      PlayerComposition.PlayerAppearance_cachedModels.clear();
      class33.method460();
      ((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
      Script.Script_cached.clear();
      Client.archive5.method7699();
      class466.field4812.clearFiles();
      Actor.archive7.clearFiles();
      BuddyRankComparator.archive4.clearFiles();
      LoginScreenAnimation.field1244.clearFiles();
      class305.archive9.clearFiles();
      ReflectionCheck.archive6.clearFiles();
      FontName.archive11.clearFiles();
      class180.archive8.clearFiles();
      Language.field4347.clearFiles();
      class53.archive10.clearFiles();
      ViewportMouse.field2770.clearFiles();
      class33.archive12.clearFiles();
      Messages.field1377.clearFiles();
      class36.scene.clear();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].clear();
      }

      Client.field740.method4102();
      System.gc();
      class304.musicPlayerStatus = 1;
      UserComparator9.musicTrackArchive = null;
      VarbitComposition.musicTrackGroupId = -1;
      class304.musicTrackFileId = -1;
      class304.musicTrackVolume = 0;
      class132.musicTrackBoolean = false;
      class157.pcmSampleLength = 2;
      Client.currentTrackGroupId = -1;
      Client.playingJingle = false;
      class145.method3139();
      UserComparator8.updateGameState(10);
   }
}
