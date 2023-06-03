import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Message")
public class Message extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 961309107
   )
   @Export("count")
   int count;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1113939995
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 346611537
   )
   @Export("type")
   int type;
   @ObfuscatedName("as")
   @Export("sender")
   String sender;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lun;"
   )
   @Export("senderUsername")
   Username senderUsername;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("isFromFriend0")
   TriBool isFromFriend0;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   @Export("isFromIgnored0")
   TriBool isFromIgnored0;
   @ObfuscatedName("ak")
   @Export("prefix")
   String prefix;
   @ObfuscatedName("ae")
   @Export("text")
   String text;

   Message(int var1, String var2, String var3, String var4) {
      this.isFromFriend0 = TriBool.TriBool_unknown;
      this.isFromIgnored0 = TriBool.TriBool_unknown;
      this.set(var1, var2, var3, var4);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "945112131"
   )
   @Export("set")
   void set(int var1, String var2, String var3, String var4) {
      this.count = MouseHandler.method653();
      this.cycle = Client.cycle;
      this.type = var1;
      this.sender = var2;
      this.fillSenderUsername();
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend();
      this.clearIsFromIgnored();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-120112985"
   )
   @Export("clearIsFromFriend")
   void clearIsFromFriend() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1188560567"
   )
   @Export("isFromFriend")
   final boolean isFromFriend() {
      if (this.isFromFriend0 == TriBool.TriBool_unknown) {
         this.fillIsFromFriend();
      }

      return this.isFromFriend0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2008692528"
   )
   @Export("fillIsFromFriend")
   void fillIsFromFriend() {
      this.isFromFriend0 = ApproximateRouteStrategy.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1782755292"
   )
   @Export("clearIsFromIgnored")
   void clearIsFromIgnored() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-217217904"
   )
   @Export("isFromIgnored")
   final boolean isFromIgnored() {
      if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
         this.fillIsFromIgnored();
      }

      return this.isFromIgnored0 == TriBool.TriBool_true;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("fillIsFromIgnored")
   void fillIsFromIgnored() {
      this.isFromIgnored0 = ApproximateRouteStrategy.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-97"
   )
   @Export("fillSenderUsername")
   final void fillSenderUsername() {
      if (this.sender != null) {
         this.senderUsername = new Username(Canvas.method326(this.sender), WorldMapScaleHandler.loginType);
      } else {
         this.senderUsername = null;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "110"
   )
   static final void method1161(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
      } else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(I)Loy;",
      garbageValue = "1839299213"
   )
   public static NodeDeque method1177() {
      return Client.scriptEvents;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)Z",
      garbageValue = "-1461828852"
   )
   static final boolean method1172(int var0, int var1, int var2, int var3, int var4) {
      PendingSpawn var5 = null;

      for(PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) {
            var5 = var6;
            break;
         }
      }

      if (var5 != null) {
         var5.field1143 = var4;
         return true;
      } else {
         return false;
      }
   }
}
