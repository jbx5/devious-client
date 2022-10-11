import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("ViewportMouse")
public class ViewportMouse {
   @ObfuscatedName("a")
   @Export("ViewportMouse_isInViewport")
   public static boolean ViewportMouse_isInViewport = false;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2023674943
   )
   @Export("ViewportMouse_x")
   public static int ViewportMouse_x = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 394514007
   )
   @Export("ViewportMouse_y")
   public static int ViewportMouse_y = 0;
   @ObfuscatedName("x")
   @Export("ViewportMouse_false0")
   public static boolean ViewportMouse_false0 = false;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1396336149
   )
   static int field2672;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -986845707
   )
   static int field2677;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1068694509
   )
   static int field2674;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2075893891
   )
   static int field2675;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 836673267
   )
   @Export("ViewportMouse_entityCount")
   public static int ViewportMouse_entityCount = 0;
   @ObfuscatedName("o")
   @Export("ViewportMouse_entityTags")
   public static long[] ViewportMouse_entityTags = new long[1000];
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("loginType")
   static LoginType loginType;
}
