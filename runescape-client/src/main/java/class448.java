import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class448 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   public static final class448 field4717 = new class448("application/json");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   static final class448 field4715 = new class448("text/plain");
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1708361053
   )
   @Export("canvasWidth")
   public static int canvasWidth;
   @ObfuscatedName("av")
   String field4716;

   class448(String var1) {
      this.field4716 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-959614296"
   )
   public String method8223() {
      return this.field4716;
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-459894997"
   )
   static final void method8227() {
      if (class14.ClanChat_inClanChat) {
         if (class406.friendsChat != null) {
            class406.friendsChat.sort();
         }

         for(int var0 = 0; var0 < Players.Players_count; ++var0) {
            Player var1 = Client.players[Players.Players_indices[var0]];
            var1.clearIsInFriendsChat();
         }

         class14.ClanChat_inClanChat = false;
      }

   }
}
