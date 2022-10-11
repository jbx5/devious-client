import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Interpreter")
public class Interpreter {
   @ObfuscatedName("x")
   @Export("Interpreter_intLocals")
   static int[] Interpreter_intLocals;
   @ObfuscatedName("j")
   @Export("Interpreter_arrayLengths")
   static int[] Interpreter_arrayLengths = new int[5];
   @ObfuscatedName("y")
   @Export("Interpreter_arrays")
   static int[][] Interpreter_arrays = new int[5][5000];
   @ObfuscatedName("d")
   @Export("Interpreter_intStack")
   static int[] Interpreter_intStack = new int[1000];
   @ObfuscatedName("r")
   @Export("Interpreter_stringStack")
   static String[] Interpreter_stringStack = new String[1000];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1490326469
   )
   @Export("Interpreter_frameDepth")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "[Lbq;"
   )
   @Export("Interpreter_frames")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("w")
   @Export("Interpreter_calendar")
   static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();
   @ObfuscatedName("m")
   @Export("Interpreter_MONTHS")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("i")
   static boolean field849 = false;
   @ObfuscatedName("e")
   static boolean field850 = false;
   @ObfuscatedName("g")
   static ArrayList field851 = new ArrayList();
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 799495701
   )
   static int field839 = 0;
   @ObfuscatedName("ah")
   static final double field853 = Math.log(2.0);

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lmo;I)I",
      garbageValue = "387592485"
   )
   @Export("compareStrings")
   public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      int var9;
      int var10;
      int var11;
      char var12;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         if (var9 == 198) {
            var11 = 69;
         } else if (var9 == 230) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = (byte)var11;
         if (var10 == 198) {
            var12 = 'E';
         } else if (var10 == 230) {
            var12 = 'e';
         } else if (var10 == 223) {
            var12 = 's';
         } else if (var10 == 338) {
            var12 = 'E';
         } else if (var10 == 339) {
            var12 = 'e';
         } else {
            var12 = 0;
         }

         var8 = (byte)var12;
         var9 = class211.standardizeChar((char)var9, var2);
         var10 = class211.standardizeChar((char)var10, var2);
         if (var9 != var10 && Character.toUpperCase((char)var9) != Character.toUpperCase((char)var10)) {
            var9 = Character.toLowerCase((char)var9);
            var10 = Character.toLowerCase((char)var10);
            if (var10 != var9) {
               return FloorOverlayDefinition.lowercaseChar((char)var9, var2) - FloorOverlayDefinition.lowercaseChar((char)var10, var2);
            }
         }
      }

      var9 = Math.min(var3, var4);

      for(var10 = 0; var10 < var9; ++var10) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var11 != var12 && Character.toUpperCase((char)var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase((char)var11);
            var12 = Character.toLowerCase(var12);
            if (var11 != var12) {
               return FloorOverlayDefinition.lowercaseChar((char)var11, var2) - FloorOverlayDefinition.lowercaseChar(var12, var2);
            }
         }
      }

      var10 = var3 - var4;
      if (var10 != 0) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var12 != var13) {
               return FloorOverlayDefinition.lowercaseChar(var12, var2) - FloorOverlayDefinition.lowercaseChar(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ldb;FI)F",
      garbageValue = "-2092752076"
   )
   static float method1891(class124 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2;
         if (var0.field1485 == var1) {
            var2 = 0.0F;
         } else if (var0.field1486 == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.field1485) / (var0.field1486 - var0.field1485);
         }

         float var3;
         if (var0.field1484) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.field1487[0] - var2, var0.field1487[1], var0.field1487[2], var0.field1487[3]};
            float[] var5 = new float[5];
            int var6 = class376.method7196(var4, 3, 0.0F, true, 1.0F, true, var5);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var3 * (var0.field1488[1] + var3 * (var0.field1488[2] + var3 * var0.field1488[3])) + var0.field1488[0];
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-534066588"
   )
   static void method2003() {
      Tiles.Tiles_underlays = null;
      Tiles.Tiles_overlays = null;
      Tiles.Tiles_shapes = null;
      PlayerCompositionColorTextureOverride.field1852 = null;
      UserComparator7.field1410 = null;
      class32.Tiles_underlays = null;
      Tiles.field995 = null;
      class32.Tiles_hue = null;
      FriendSystem.Tiles_saturation = null;
      DefaultsGroup.Tiles_lightness = null;
      ClanChannelMember.Tiles_hueMultiplier = null;
      class410.field4590 = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "23"
   )
   public static int method2007(int var0, int var1) {
      return (-3 - var0 << 8) + var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqk;B)I",
      garbageValue = "64"
   )
   static int method2005(PacketBuffer var0) {
      int var1 = var0.readBits(2);
      int var2;
      if (var1 == 0) {
         var2 = 0;
      } else if (var1 == 1) {
         var2 = var0.readBits(5);
      } else if (var1 == 2) {
         var2 = var0.readBits(8);
      } else {
         var2 = var0.readBits(11);
      }

      return var2;
   }
}
