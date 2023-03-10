import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("ClanMate")
public class ClanMate extends Buddy {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("friend")
   TriBool friend;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("ignored")
   TriBool ignored;

   ClanMate() {
      this.friend = TriBool.TriBool_unknown;
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "124"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.friend = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   @Export("isFriend")
   public final boolean isFriend() {
      if (this.friend == TriBool.TriBool_unknown) {
         this.fillIsFriend();
      }

      return this.friend == TriBool.TriBool_true;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "713912709"
   )
   @Export("fillIsFriend")
   void fillIsFriend() {
      this.friend = class6.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "613175438"
   )
   @Export("clearIsIgnored")
   void clearIsIgnored() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "63"
   )
   @Export("isIgnored")
   public final boolean isIgnored() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored();
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "193686662"
   )
   @Export("fillIsIgnored")
   void fillIsIgnored() {
      this.ignored = class6.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "37"
   )
   @Export("addCancelMenuEntry")
   static void addCancelMenuEntry() {
      class60.method1159();
      Client.menuActions[0] = "Cancel";
      Client.menuTargets[0] = "";
      Client.menuOpcodes[0] = 1006;
      Client.menuShiftClick[0] = false;
      Client.menuOptionsCount = 1;
   }
}
