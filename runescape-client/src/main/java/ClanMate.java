import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("ClanMate")
public class ClanMate extends Buddy {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Loh;"
   )
   @Export("friend")
   TriBool friend;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Loh;"
   )
   @Export("ignored")
   TriBool ignored;

   ClanMate() {
      this.friend = TriBool.TriBool_unknown;
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.friend = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-452939679"
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
      descriptor = "(I)V",
      garbageValue = "-346316887"
   )
   @Export("fillIsFriend")
   void fillIsFriend() {
      this.friend = DefaultsGroup.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2101166054"
   )
   @Export("clearIsIgnored")
   void clearIsIgnored() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "1"
   )
   @Export("isIgnored")
   public final boolean isIgnored() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored();
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "68"
   )
   @Export("fillIsIgnored")
   void fillIsIgnored() {
      this.ignored = DefaultsGroup.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }
}
