import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("Script")
public class Script extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("Script_cached")
   static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("dq")
   static boolean field972;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = 2134394913
   )
   @Export("widgetDragDuration")
   static int widgetDragDuration;
   @ObfuscatedName("px")
   @ObfuscatedSignature(
      descriptor = "[Lkn;"
   )
   static Widget[] field971;
   @ObfuscatedName("f")
   String field962;
   @ObfuscatedName("c")
   @Export("opcodes")
   int[] opcodes;
   @ObfuscatedName("x")
   @Export("intOperands")
   int[] intOperands;
   @ObfuscatedName("h")
   @Export("stringOperands")
   String[] stringOperands;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1624364019
   )
   @Export("localIntCount")
   int localIntCount;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -2093681401
   )
   @Export("localStringCount")
   int localStringCount;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1508495137
   )
   @Export("intArgumentCount")
   int intArgumentCount;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1760588085
   )
   @Export("stringArgumentCount")
   int stringArgumentCount;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "[Lpe;"
   )
   @Export("switches")
   IterableNodeHashTable[] switches;

   Script() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IS)[Lpe;",
      garbageValue = "10134"
   )
   @Export("newIterableNodeHashTable")
   IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
      return new IterableNodeHashTable[var1];
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lfz;",
      garbageValue = "-1956190631"
   )
   @Export("KitDefinition_get")
   public static KitDefinition KitDefinition_get(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
         var1 = new KitDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.KitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1548637382"
   )
   static void method2120() {
      Tiles.Tiles_minPlane = 99;
      Tiles.Tiles_underlays = new short[4][104][104];
      Tiles.Tiles_overlays = new short[4][104][104];
      Tiles.Tiles_shapes = new byte[4][104][104];
      PlayerCompositionColorTextureOverride.field1852 = new byte[4][104][104];
      UserComparator7.field1410 = new int[4][105][105];
      class32.Tiles_underlays = new byte[4][105][105];
      Tiles.field995 = new int[105][105];
      class32.Tiles_hue = new int[104];
      FriendSystem.Tiles_saturation = new int[104];
      DefaultsGroup.Tiles_lightness = new int[104];
      ClanChannelMember.Tiles_hueMultiplier = new int[104];
      class410.field4590 = new int[104];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)[Llq;",
      garbageValue = "19"
   )
   public static StudioGame[] method2127() {
      return new StudioGame[]{StudioGame.runescape, StudioGame.game4, StudioGame.game5, StudioGame.stellardawn, StudioGame.game3, StudioGame.oldscape};
   }
}
