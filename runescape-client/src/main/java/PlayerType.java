import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("PlayerType_normal")
   PlayerType_normal(0, -1, true, false, true),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("PlayerType_playerModerator")
   PlayerType_playerModerator(1, 0, true, true, true),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("PlayerType_jagexModerator")
   PlayerType_jagexModerator(2, 1, true, true, false),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("PlayerType_ironman")
   PlayerType_ironman(3, 2, false, false, true),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("PlayerType_ultimateIronman")
   PlayerType_ultimateIronman(4, 3, false, false, true),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("PlayerType_hardcoreIronman")
   PlayerType_hardcoreIronman(5, 10, false, false, true),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4141(6, 22, false, false, true),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4136(7, 41, false, false, true),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4139(8, 42, false, false, true),
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4138(9, 43, false, false, true),
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4144(10, 44, false, false, true),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4140(11, 45, false, false, true),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4146(12, 46, false, false, true),
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4142(13, 47, false, false, true),
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4143(14, 48, false, false, true),
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4129(15, 49, false, false, true),
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   field4137(16, 52, false, false, true);

   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1099813619
   )
   @Export("id")
   final int id;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1649299643
   )
   @Export("modIcon")
   public final int modIcon;
   @ObfuscatedName("at")
   @Export("isPrivileged")
   public final boolean isPrivileged;
   @ObfuscatedName("af")
   @Export("isUser")
   public final boolean isUser;

   PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.id = var3;
      this.modIcon = var4;
      this.isPrivileged = var6;
      this.isUser = var7;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lrm;I)I",
      garbageValue = "-227471320"
   )
   static final int method6363(LoginType var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch (var0.field4826) {
            case 2:
               return 20;
            default:
               return 12;
         }
      }
   }
}
