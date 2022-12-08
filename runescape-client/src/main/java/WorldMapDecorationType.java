import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3727(0, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3728(1, 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3729(2, 0),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3736(3, 0),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3742(9, 2),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3730(4, 1),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3733(5, 1),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3734(6, 1),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3735(7, 1),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3732(8, 1),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3737(12, 2),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3738(13, 2),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3739(14, 2),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3740(15, 2),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3741(16, 2),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3743(17, 2),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3751(18, 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3744(19, 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3745(20, 2),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3746(21, 2),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3747(10, 2),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3748(11, 2),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   field3749(22, 3);

   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1868950557
   )
   @Export("id")
   public final int id;

   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "0"
   )
   WorldMapDecorationType(int var3, int var4) {
      this.id = var3;
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

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "224580717"
   )
   static final void method6362(String var0) {
      StringBuilder var10000 = new StringBuilder();
      Object var10001 = null;
      var10000 = var10000.append("Please remove ").append(var0);
      var10001 = null;
      String var1 = var10000.append(" from your ignore list first").toString();
      KitDefinition.addGameMessage(30, "", var1);
   }
}
