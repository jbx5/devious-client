import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("scriptDotWidget")
   static Widget scriptDotWidget;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1334453607
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -204624613
   )
   @Export("z")
   int z;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -445636047
   )
   @Export("centerX")
   int centerX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1941335121
   )
   @Export("centerY")
   int centerY;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1237306913
   )
   @Export("startX")
   int startX;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 405751931
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 739083279
   )
   @Export("endX")
   int endX;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -904563983
   )
   @Export("startY")
   int startY;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1485400867
   )
   @Export("endY")
   int endY;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 87893493
   )
   int field2798;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1344380565
   )
   @Export("lastDrawn")
   int lastDrawn;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = -8829904473065290459L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -102078043
   )
   @Export("flags")
   int flags = 0;

   GameObject() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-88"
   )
   public static int method4778(int var0) {
      return var0 >>> 4 & class473.field4885;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)[Lsc;",
      garbageValue = "-41"
   )
   @Export("FillMode_values")
   public static FillMode[] FillMode_values() {
      return new FillMode[]{FillMode.field4982, FillMode.field4983, FillMode.SOLID};
   }
}
