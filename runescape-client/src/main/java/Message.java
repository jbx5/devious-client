import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Message")
public class Message extends DualNode {
   @ObfuscatedName("ta")
   @ObfuscatedGetter(
      intValue = -2024309333
   )
   static int field485;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1273905497
   )
   static int field486;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1665485635
   )
   @Export("count")
   int count;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -489792901
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1931818865
   )
   @Export("type")
   int type;
   @ObfuscatedName("s")
   @Export("sender")
   String sender;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lsi;"
   )
   @Export("senderUsername")
   Username senderUsername;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isFromFriend0")
   TriBool isFromFriend0;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("isFromIgnored0")
   TriBool isFromIgnored0;
   @ObfuscatedName("n")
   @Export("prefix")
   String prefix;
   @ObfuscatedName("l")
   @Export("text")
   String text;

   Message(int var1, String var2, String var3, String var4) {
      this.isFromFriend0 = TriBool.TriBool_unknown;
      this.isFromIgnored0 = TriBool.TriBool_unknown;
      this.set(var1, var2, var3, var4);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1059828352"
   )
   @Export("set")
   void set(int var1, String var2, String var3, String var4) {
      int var5 = ++Messages.Messages_count - 1;
      this.count = var5;
      this.cycle = Client.cycle;
      this.type = var1;
      this.sender = var2;
      this.fillSenderUsername();
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend();
      this.clearIsFromIgnored();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1277277139"
   )
   @Export("clearIsFromFriend")
   void clearIsFromFriend() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "28"
   )
   @Export("isFromFriend")
   final boolean isFromFriend() {
      if (this.isFromFriend0 == TriBool.TriBool_unknown) {
         this.fillIsFromFriend();
      }

      return this.isFromFriend0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "330583161"
   )
   @Export("fillIsFromFriend")
   void fillIsFromFriend() {
      this.isFromFriend0 = WorldMapElement.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-2"
   )
   @Export("clearIsFromIgnored")
   void clearIsFromIgnored() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1151238306"
   )
   @Export("isFromIgnored")
   final boolean isFromIgnored() {
      if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
         this.fillIsFromIgnored();
      }

      return this.isFromIgnored0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("fillIsFromIgnored")
   void fillIsFromIgnored() {
      this.isFromIgnored0 = WorldMapElement.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1789118280"
   )
   @Export("fillSenderUsername")
   final void fillSenderUsername() {
      if (this.sender != null) {
         this.senderUsername = new Username(class6.method48(this.sender), WorldMapCacheName.loginType);
      } else {
         this.senderUsername = null;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lbq;",
      garbageValue = "109"
   )
   @Export("Messages_getByChannelAndID")
   static Message Messages_getByChannelAndID(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2.getMessage(var1);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-163362829"
   )
   static final int method1192(int var0, int var1) {
      int var2 = method1157(var0 - 1, var1 - 1) + method1157(1 + var0, var1 - 1) + method1157(var0 - 1, var1 + 1) + method1157(var0 + 1, var1 + 1);
      int var3 = method1157(var0 - 1, var1) + method1157(1 + var0, var1) + method1157(var0, var1 - 1) + method1157(var0, var1 + 1);
      int var4 = method1157(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-118"
   )
   static final int method1157(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1433470376"
   )
   @Export("getWindowedMode")
   static int getWindowedMode() {
      return Client.isResizable ? 2 : 1;
   }
}
