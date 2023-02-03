import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("PlayerType_normal")
   PlayerType_normal(0, -1, true, false, true),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("PlayerType_playerModerator")
   PlayerType_playerModerator(1, 0, true, true, true),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("PlayerType_jagexModerator")
   PlayerType_jagexModerator(2, 1, true, true, false),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("PlayerType_ironman")
   PlayerType_ironman(3, 2, false, false, true),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("PlayerType_ultimateIronman")
   PlayerType_ultimateIronman(4, 3, false, false, true),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("PlayerType_hardcoreIronman")
   PlayerType_hardcoreIronman(5, 10, false, false, true),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4169(6, 22, false, false, true),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4175(7, 41, false, false, true),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4176(8, 42, false, false, true),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4177(9, 43, false, false, true),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4178(10, 44, false, false, true),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4190(11, 45, false, false, true),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4180(12, 46, false, false, true),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4174(13, 47, false, false, true),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4182(14, 48, false, false, true),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4179(15, 49, false, false, true),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   field4184(16, 52, false, false, true);

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = 1503996647
   )
   @Export("menuHeight")
   static int menuHeight;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1320966741
   )
   @Export("id")
   final int id;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -940748969
   )
   @Export("modIcon")
   public final int modIcon;
   @ObfuscatedName("x")
   @Export("isPrivileged")
   public final boolean isPrivileged;
   @ObfuscatedName("a")
   @Export("isUser")
   public final boolean isUser;

   PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.id = var3;
      this.modIcon = var4;
      this.isPrivileged = var6;
      this.isUser = var7;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
