import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("PlayerType_normal")
   PlayerType_normal(0, -1, true, false, true),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("PlayerType_playerModerator")
   PlayerType_playerModerator(1, 0, true, true, true),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("PlayerType_jagexModerator")
   PlayerType_jagexModerator(2, 1, true, true, false),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("PlayerType_ironman")
   PlayerType_ironman(3, 2, false, false, true),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("PlayerType_ultimateIronman")
   PlayerType_ultimateIronman(4, 3, false, false, true),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("PlayerType_hardcoreIronman")
   PlayerType_hardcoreIronman(5, 10, false, false, true),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4149(6, 22, false, false, true),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4156(7, 41, false, false, true),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4153(8, 42, false, false, true),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4154(9, 43, false, false, true),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4155(10, 44, false, false, true),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4145(11, 45, false, false, true),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4157(12, 46, false, false, true),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4158(13, 47, false, false, true),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4159(14, 48, false, false, true),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4160(15, 49, false, false, true),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   field4161(16, 52, false, false, true);

   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1797425475
   )
   @Export("id")
   final int id;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 378599095
   )
   @Export("modIcon")
   public final int modIcon;
   @ObfuscatedName("t")
   @Export("isPrivileged")
   public final boolean isPrivileged;
   @ObfuscatedName("c")
   @Export("isUser")
   public final boolean isUser;

   PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.id = var3;
      this.modIcon = var4;
      this.isPrivileged = var6;
      this.isUser = var7;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
