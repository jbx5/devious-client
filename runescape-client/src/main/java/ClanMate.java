import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("ClanMate")
public class ClanMate extends Buddy {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("friend")
   TriBool friend;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lot;"
   )
   @Export("ignored")
   TriBool ignored;

   ClanMate() {
      this.friend = TriBool.TriBool_unknown;
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-387844401"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.friend = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1513918583"
   )
   @Export("isFriend")
   public final boolean isFriend() {
      if (this.friend == TriBool.TriBool_unknown) {
         this.fillIsFriend();
      }

      return this.friend == TriBool.TriBool_true;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-56"
   )
   @Export("fillIsFriend")
   void fillIsFriend() {
      this.friend = WallDecoration.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-951629331"
   )
   @Export("clearIsIgnored")
   void clearIsIgnored() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2040907781"
   )
   @Export("isIgnored")
   public final boolean isIgnored() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored();
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1510976642"
   )
   @Export("fillIsIgnored")
   void fillIsIgnored() {
      this.ignored = WallDecoration.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }
}
