import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
@Implements("ClanMate")
public class ClanMate extends Buddy {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("friend")
   TriBool friend;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   @Export("ignored")
   TriBool ignored;

   ClanMate() {
      this.friend = TriBool.TriBool_unknown;
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "12"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.friend = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1838290453"
   )
   @Export("isFriend")
   public final boolean isFriend() {
      if (this.friend == TriBool.TriBool_unknown) {
         this.fillIsFriend();
      }

      return this.friend == TriBool.TriBool_true;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1501907889"
   )
   @Export("fillIsFriend")
   void fillIsFriend() {
      this.friend = World.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "629220603"
   )
   @Export("clearIsIgnored")
   void clearIsIgnored() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1806675774"
   )
   @Export("isIgnored")
   public final boolean isIgnored() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored();
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1171286552"
   )
   @Export("fillIsIgnored")
   void fillIsIgnored() {
      this.ignored = World.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }
}
