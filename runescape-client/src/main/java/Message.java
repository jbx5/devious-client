import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Message")
public class Message extends DualNode {
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -1440610023
   )
   static int field466;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 942307721
   )
   @Export("count")
   int count;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -47229187
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1374498605
   )
   @Export("type")
   int type;
   @ObfuscatedName("ab")
   @Export("sender")
   String sender;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("senderUsername")
   Username senderUsername;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("isFromFriend0")
   TriBool isFromFriend0;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("isFromIgnored0")
   TriBool isFromIgnored0;
   @ObfuscatedName("aq")
   @Export("prefix")
   String prefix;
   @ObfuscatedName("ap")
   @Export("text")
   String text;

   Message(int var1, String var2, String var3, String var4) {
      this.isFromFriend0 = TriBool.TriBool_unknown;
      this.isFromIgnored0 = TriBool.TriBool_unknown;
      this.set(var1, var2, var3, var4);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-761013975"
   )
   @Export("set")
   void set(int var1, String var2, String var3, String var4) {
      this.count = class389.method7352();
      this.cycle = Client.cycle;
      this.type = var1;
      this.sender = var2;
      this.fillSenderUsername();
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend();
      this.clearIsFromIgnored();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2143541112"
   )
   @Export("clearIsFromFriend")
   void clearIsFromFriend() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "77"
   )
   @Export("isFromFriend")
   final boolean isFromFriend() {
      if (this.isFromFriend0 == TriBool.TriBool_unknown) {
         this.fillIsFromFriend();
      }

      return this.isFromFriend0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2058761768"
   )
   @Export("fillIsFromFriend")
   void fillIsFromFriend() {
      this.isFromFriend0 = class6.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "65"
   )
   @Export("clearIsFromIgnored")
   void clearIsFromIgnored() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2122860427"
   )
   @Export("isFromIgnored")
   final boolean isFromIgnored() {
      if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
         this.fillIsFromIgnored();
      }

      return this.isFromIgnored0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-393430924"
   )
   @Export("fillIsFromIgnored")
   void fillIsFromIgnored() {
      this.isFromIgnored0 = class6.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-441414367"
   )
   @Export("fillSenderUsername")
   final void fillSenderUsername() {
      if (this.sender != null) {
         this.senderUsername = new Username(ItemComposition.method3982(this.sender), Occluder.loginType);
      } else {
         this.senderUsername = null;
      }

   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2086403655"
   )
   @Export("FriendSystem_invalidateIgnoreds")
   static final void FriendSystem_invalidateIgnoreds() {
      class33.method475();
      if (ReflectionCheck.friendsChat != null) {
         ReflectionCheck.friendsChat.invalidateIgnoreds();
      }

   }
}
