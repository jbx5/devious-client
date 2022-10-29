import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("FriendSystem")
public class FriendSystem {
   @ObfuscatedName("l")
   @Export("Tiles_saturation")
   static int[] Tiles_saturation;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("friendsList")
   public final FriendsList friendsList;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("ignoreList")
   public final IgnoreList ignoreList;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 334169297
   )
   int field814 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lqu;)V"
   )
   FriendSystem(LoginType var1) {
      this.loginType = var1;
      this.friendsList = new FriendsList(var1);
      this.ignoreList = new IgnoreList(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1547874236"
   )
   boolean method1818() {
      return this.field814 == 2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2081175355"
   )
   final void method1842() {
      this.field814 = 1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-1301657243"
   )
   @Export("readUpdate")
   final void readUpdate(Buffer var1, int var2) {
      this.friendsList.read(var1, var2);
      this.field814 = 2;

      for(int var3 = 0; var3 < Players.Players_count; ++var3) {
         Player var4 = Client.players[Players.Players_indices[var3]];
         var4.clearIsFriend();
      }

      Iterator var5 = Messages.Messages_hashTable.iterator();

      while(var5.hasNext()) {
         Message var6 = (Message)var5.next();
         var6.clearIsFromFriend();
      }

      if (MenuAction.friendsChat != null) {
         MenuAction.friendsChat.clearFriends();
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("processFriendUpdates")
   final void processFriendUpdates() {
      for(FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
         if ((long)var1.field4477 < UserComparator8.method2748() / 1000L - 5L) {
            if (var1.world > 0) {
               MouseHandler.addGameMessage(5, "", var1.username + " has logged in.");
            }

            if (var1.world == 0) {
               MouseHandler.addGameMessage(5, "", var1.username + " has logged out.");
            }

            var1.remove();
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-47"
   )
   @Export("clear")
   final void clear() {
      this.field814 = 0;
      this.friendsList.clear();
      this.ignoreList.clear();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrg;ZI)Z",
      garbageValue = "181698123"
   )
   @Export("isFriended")
   final boolean isFriended(Username var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class296.localPlayer.username)) {
         return true;
      } else {
         return this.friendsList.isFriended(var1, var2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lrg;I)Z",
      garbageValue = "271722372"
   )
   @Export("isIgnored")
   final boolean isIgnored(Username var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.ignoreList.contains(var1);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "-27197"
   )
   @Export("addFriend")
   final void addFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsListIsFull()) {
               UserComparator4.method2732();
            } else if (class296.localPlayer.username.equals(var2)) {
               class11.method101("You can't add yourself to your own friend list");
            } else if (this.isFriended(var2, false)) {
               UserComparator4.method2739(var1);
            } else if (this.isIgnored(var2)) {
               MusicPatchNode2.method5441(var1);
            } else {
               SoundSystem.method859(var1);
            }
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "8"
   )
   @Export("friendsListIsFull")
   final boolean friendsListIsFull() {
      return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field778 != 1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2035906343"
   )
   @Export("addIgnore")
   final void addIgnore(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.canAddIgnore()) {
               class11.method101("Your ignore list is full. Max of 100 for free users, and 400 for members");
            } else if (class296.localPlayer.username.equals(var2)) {
               class11.method101("You can't add yourself to your own ignore list");
            } else if (this.isIgnored(var2)) {
               DefaultsGroup.method7565(var1);
            } else if (this.isFriended(var2, false)) {
               LoginScreenAnimation.method2350(var1);
            } else {
               PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "319936245"
   )
   @Export("canAddIgnore")
   final boolean canAddIgnore() {
      return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field778 != 1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1370133803"
   )
   @Export("removeFriend")
   final void removeFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsList.removeByUsername(var2)) {
               Client.field701 = Client.cycleCntr;
               PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
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

            if (MenuAction.friendsChat != null) {
               MenuAction.friendsChat.clearFriends();
            }

         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1582566104"
   )
   @Export("removeIgnore")
   final void removeIgnore(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.ignoreList.removeByUsername(var2)) {
               Client.field701 = Client.cycleCntr;
               PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }

            FontName.FriendSystem_invalidateIgnoreds();
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lrg;I)Z",
      garbageValue = "410030854"
   )
   @Export("isFriendAndHasWorld")
   final boolean isFriendAndHasWorld(Username var1) {
      Friend var2 = (Friend)this.friendsList.getByUsername(var1);
      return var2 != null && var2.hasWorld();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(S)Loy;",
      garbageValue = "-15572"
   )
   public static class406 method1847() {
      synchronized(class406.field4561) {
         if (class406.field4560 == 0) {
            return new class406();
         } else {
            class406.field4561[--class406.field4560].method7633();
            return class406.field4561[class406.field4560];
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Llx;II)V",
      garbageValue = "154671982"
   )
   static void method1825(Archive var0, int var1) {
      if (var0.field4140) {
         if (var1 <= NetCache.field4174) {
            throw new RuntimeException("");
         }

         if (var1 < NetCache.field4179) {
            NetCache.field4179 = var1;
         }
      } else {
         if (var1 >= NetCache.field4179) {
            throw new RuntimeException("");
         }

         if (var1 > NetCache.field4174) {
            NetCache.field4174 = var1;
         }
      }

      if (Messages.field1361 != null) {
         Messages.field1361.offset = var1 * 8 + 5;
         if (Messages.field1361.offset >= Messages.field1361.array.length) {
            if (!var0.field4140) {
               throw new RuntimeException("");
            }

            var0.method6306();
         } else {
            int var2 = Messages.field1361.readInt();
            int var3 = Messages.field1361.readInt();
            var0.loadIndex(var2, var3);
         }

      } else {
         class158.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
         NetCache.NetCache_archives[var1] = var0;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[Lcb;",
      garbageValue = "-1372063677"
   )
   static AttackOption[] method1778() {
      return new AttackOption[]{AttackOption.field1285, AttackOption.field1289, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden};
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-564682770"
   )
   public static void method1845() {
      try {
         JagexCache.JagexCache_dat2File.close();

         for(int var0 = 0; var0 < JagexCache.idxCount; ++var0) {
            JagexCache.JagexCache_idxFiles[var0].close();
         }

         JagexCache.JagexCache_idx255File.close();
         JagexCache.JagexCache_randomDat.close();
      } catch (Exception var2) {
      }

   }
}
