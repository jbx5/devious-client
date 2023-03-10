import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("FriendSystem")
public class FriendSystem {
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 620631549
   )
   static int field800;
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   static IndexedSprite field801;
   @ObfuscatedName("md")
   @ObfuscatedSignature(
      descriptor = "Lia;"
   )
   @Export("textureProvider")
   static TextureProvider textureProvider;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lrm;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpy;"
   )
   @Export("friendsList")
   public final FriendsList friendsList;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lpq;"
   )
   @Export("ignoreList")
   public final IgnoreList ignoreList;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1223770545
   )
   int field799 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lrm;)V"
   )
   FriendSystem(LoginType var1) {
      this.loginType = var1;
      this.friendsList = new FriendsList(var1);
      this.ignoreList = new IgnoreList(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1984618151"
   )
   boolean method1888() {
      return this.field799 == 2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-805849904"
   )
   final void method1836() {
      this.field799 = 1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "1609164705"
   )
   @Export("readUpdate")
   final void readUpdate(Buffer var1, int var2) {
      this.friendsList.read(var1, var2);
      this.field799 = 2;

      for(int var3 = 0; var3 < Players.Players_count; ++var3) {
         Player var4 = Client.players[Players.Players_indices[var3]];
         var4.clearIsFriend();
      }

      class289.method5485();
      if (ReflectionCheck.friendsChat != null) {
         ReflectionCheck.friendsChat.clearFriends();
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "173893470"
   )
   @Export("processFriendUpdates")
   final void processFriendUpdates() {
      for(FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
         if ((long)var1.field4512 < WorldMapSection2.method4844() / 1000L - 5L) {
            if (var1.world > 0) {
               MusicPatchNode.addGameMessage(5, "", var1.username + " has logged in.");
            }

            if (var1.world == 0) {
               MusicPatchNode.addGameMessage(5, "", var1.username + " has logged out.");
            }

            var1.remove();
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "63"
   )
   @Export("clear")
   final void clear() {
      this.field799 = 0;
      this.friendsList.clear();
      this.ignoreList.clear();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ltj;ZI)Z",
      garbageValue = "-1897361318"
   )
   @Export("isFriended")
   final boolean isFriended(Username var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(BuddyRankComparator.localPlayer.username)) {
         return true;
      } else {
         return this.friendsList.isFriended(var1, var2);
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltj;B)Z",
      garbageValue = "-77"
   )
   @Export("isIgnored")
   final boolean isIgnored(Username var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.ignoreList.contains(var1);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-24"
   )
   @Export("addFriend")
   final void addFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsListIsFull()) {
               class161.method3341();
            } else if (BuddyRankComparator.localPlayer.username.equals(var2)) {
               class7.method52();
            } else if (this.isFriended(var2, false)) {
               Tiles.method2216(var1 + " is already on your friend list");
            } else if (this.isIgnored(var2)) {
               Tiles.method2216("Please remove " + var1 + " from your ignore list first");
            } else {
               PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.field3070, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1996234524"
   )
   @Export("friendsListIsFull")
   final boolean friendsListIsFull() {
      return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field603 != 1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-936621609"
   )
   @Export("addIgnore")
   final void addIgnore(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.canAddIgnore()) {
               Tiles.method2216("Your ignore list is full. Max of 100 for free users, and 400 for members");
            } else if (BuddyRankComparator.localPlayer.username.equals(var2)) {
               class315.method6278();
            } else if (this.isIgnored(var2)) {
               Tiles.method2216(var1 + " is already on your ignore list");
            } else if (this.isFriended(var2, false)) {
               Tiles.method2216("Please remove " + var1 + " from your friend list first");
            } else {
               PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1019684673"
   )
   @Export("canAddIgnore")
   final boolean canAddIgnore() {
      return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field603 != 1;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "118"
   )
   @Export("removeFriend")
   final void removeFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsList.removeByUsername(var2)) {
               Client.field701 = Client.cycleCntr;
               PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }

            for(int var5 = 0; var5 < Players.Players_count; ++var5) {
               Player var4 = Client.players[Players.Players_indices[var5]];
               var4.clearIsFriend();
            }

            class289.method5485();
            if (ReflectionCheck.friendsChat != null) {
               ReflectionCheck.friendsChat.clearFriends();
            }

         }
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "185621103"
   )
   @Export("removeIgnore")
   public final void removeIgnore(String var1, boolean var2) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName()) {
            if (this.ignoreList.removeByUsername(var3)) {
               Client.field701 = Client.cycleCntr;
               if (var2) {
                  PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
                  var4.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1));
                  var4.packetBuffer.writeStringCp1252NullTerminated(var1);
                  Client.packetWriter.addNode(var4);
               }
            }

            Message.FriendSystem_invalidateIgnoreds();
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Ltj;B)Z",
      garbageValue = "-57"
   )
   @Export("isFriendAndHasWorld")
   final boolean isFriendAndHasWorld(Username var1) {
      Friend var2 = (Friend)this.friendsList.getByUsername(var1);
      return var2 != null && var2.hasWorld();
   }
}
