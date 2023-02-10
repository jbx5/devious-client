import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3752(0, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3749(1, 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3745(2, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3746(3, 0),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3751(9, 2),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3748(4, 1),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3744(5, 1),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3750(6, 1),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3757(7, 1),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3747(8, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3756(12, 2),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3754(13, 2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3755(14, 2),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3753(15, 2),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3760(16, 2),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3758(17, 2),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3759(18, 2),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3743(19, 2),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3761(20, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3762(21, 2),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3763(10, 2),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3764(11, 2),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field3765(22, 3);

   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1086301515
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "91461371"
   )
   public static void method6425() {
      VarbitComposition.VarbitDefinition_cached.clear();
   }

   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "(I)Lqf;",
      garbageValue = "1722547378"
   )
   @Export("getWorldMap")
   static WorldMap getWorldMap() {
      return GrandExchangeOfferUnitPriceComparator.worldMap;
   }
}
