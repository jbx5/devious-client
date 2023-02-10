import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("FriendSystem")
public class FriendSystem {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   @Export("friendsList")
   public final FriendsList friendsList;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   @Export("ignoreList")
   public final IgnoreList ignoreList;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -77560523
   )
   int field824 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lqj;)V"
   )
   FriendSystem(LoginType var1) {
      this.loginType = var1;
      this.friendsList = new FriendsList(var1);
      this.ignoreList = new IgnoreList(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "-26998"
   )
   boolean method1907() {
      return this.field824 == 2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "2407"
   )
   final void method1856() {
      this.field824 = 1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IB)V",
      garbageValue = "-46"
   )
   @Export("readUpdate")
   final void readUpdate(Buffer var1, int var2) {
      this.friendsList.read(var1, var2);
      this.field824 = 2;

      for(int var3 = 0; var3 < Players.Players_count; ++var3) {
         Player var4 = Client.players[Players.Players_indices[var3]];
         var4.clearIsFriend();
      }

      Iterator var5 = Messages.Messages_hashTable.iterator();

      while(var5.hasNext()) {
         Message var6 = (Message)var5.next();
         var6.clearIsFromFriend();
      }

      if (class463.friendsChat != null) {
         class463.friendsChat.clearFriends();
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "100"
   )
   @Export("processFriendUpdates")
   final void processFriendUpdates() {
      for(FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
         if ((long)var1.field4556 < class153.method3317() / 1000L - 5L) {
            if (var1.world > 0) {
               class280.addGameMessage(5, "", var1.username + " has logged in.");
            }

            if (var1.world == 0) {
               class280.addGameMessage(5, "", var1.username + " has logged out.");
            }

            var1.remove();
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-16593"
   )
   @Export("clear")
   final void clear() {
      this.field824 = 0;
      this.friendsList.clear();
      this.ignoreList.clear();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lsi;ZI)Z",
      garbageValue = "-1227333084"
   )
   @Export("isFriended")
   final boolean isFriended(Username var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class387.localPlayer.username)) {
         return true;
      } else {
         return this.friendsList.isFriended(var1, var2);
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lsi;B)Z",
      garbageValue = "-68"
   )
   @Export("isIgnored")
   final boolean isIgnored(Username var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.ignoreList.contains(var1);
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "610172535"
   )
   @Export("addFriend")
   final void addFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsListIsFull()) {
               method1903();
            } else if (class387.localPlayer.username.equals(var2)) {
               UserComparator6.method2973();
            } else if (this.isFriended(var2, false)) {
               Decimator.method1115(var1 + " is already on your friend list");
            } else if (this.isIgnored(var2)) {
               class6.method52(var1);
            } else {
               WorldMapElement.method3631(var1);
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "22745263"
   )
   @Export("friendsListIsFull")
   final boolean friendsListIsFull() {
      return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1660462621"
   )
   @Export("addIgnore")
   final void addIgnore(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.canAddIgnore()) {
               RouteStrategy.method4218();
            } else if (class387.localPlayer.username.equals(var2)) {
               ChatChannel.method2213();
            } else if (this.isIgnored(var2)) {
               class31.method471(var1);
            } else if (this.isFriended(var2, false)) {
               UserComparator9.method2943(var1);
            } else {
               class380.method7375(var1);
            }
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "802889644"
   )
   @Export("canAddIgnore")
   final boolean canAddIgnore() {
      return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "450503844"
   )
   @Export("removeFriend")
   final void removeFriend(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.friendsList.removeByUsername(var2)) {
               UserComparator7.method2926();
               PacketBufferNode var3 = Renderable.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var1));
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

            if (class463.friendsChat != null) {
               class463.friendsChat.clearFriends();
            }

         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-992361699"
   )
   @Export("removeIgnore")
   final void removeIgnore(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName()) {
            if (this.ignoreList.removeByUsername(var2)) {
               UserComparator7.method2926();
               PacketBufferNode var3 = Renderable.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var1));
               var3.packetBuffer.writeStringCp1252NullTerminated(var1);
               Client.packetWriter.addNode(var3);
            }

            FontName.FriendSystem_invalidateIgnoreds();
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Lsi;B)Z",
      garbageValue = "-42"
   )
   @Export("isFriendAndHasWorld")
   final boolean isFriendAndHasWorld(Username var1) {
      Friend var2 = (Friend)this.friendsList.getByUsername(var1);
      return var2 != null && var2.hasWorld();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "31"
   )
   static boolean method1874(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1466707418"
   )
   static void method1908() {
      if (Login.Login_username == null || Login.Login_username.length() <= 0) {
         if (PacketWriter.clientPreferences.method2545() != null) {
            Login.Login_username = PacketWriter.clientPreferences.method2545();
            Client.Login_isUsernameRemembered = true;
         } else {
            Client.Login_isUsernameRemembered = false;
         }

      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(FFFFLda;I)V",
      garbageValue = "2116224706"
   )
   static void method1909(float var0, float var1, float var2, float var3, class125 var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.field1535 = var7 - var6 - var8;
      var4.field1534 = var8 + var8 + var8;
      var4.field1537 = var5 + var5 + var5;
      var4.field1532 = var0;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1439216327"
   )
   static final void method1903() {
      Decimator.method1115("Your friend list is full. Max of 200 for free users, and 400 for members");
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "-53"
   )
   static int method1855(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.GETWINDOWMODE) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Message.getWindowedMode();
         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.SETWINDOWMODE) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               class160.setWindowedMode(var3);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2505();
            return 1;
         } else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
            if (var0 == 5310) {
               --class302.Interpreter_intStackSize;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               PacketWriter.clientPreferences.method2504(var3);
            }

            return 1;
         }
      }
   }
}
