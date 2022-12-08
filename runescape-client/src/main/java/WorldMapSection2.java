import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iu")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1092602777
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -939702515
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1065150765
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 346902175
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 337769061
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1809147725
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -651808565
   )
   int field2845;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -957154991
   )
   int field2844;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -394773385
   )
   int field2841;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 403564879
   )
   int field2848;

   WorldMapSection2() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lit;B)V",
      garbageValue = "86"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2845) {
         var1.regionLowX = this.field2845;
      }

      if (var1.regionHighX < this.field2841) {
         var1.regionHighX = this.field2841;
      }

      if (var1.regionLowY > this.field2844) {
         var1.regionLowY = this.field2844;
      }

      if (var1.regionHighY < this.field2848) {
         var1.regionHighY = this.field2848;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "986597458"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIS)Z",
      garbageValue = "-11823"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.field2845 && var1 >> 6 <= this.field2841 && var2 >> 6 >= this.field2844 && var2 >> 6 <= this.field2848;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "-52"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2845 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2844 * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(III)Lky;",
      garbageValue = "1584933614"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.field2845 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field2844 * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1737950913"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.field2845 = var1.readUnsignedShort();
      this.field2844 = var1.readUnsignedShort();
      this.field2841 = var1.readUnsignedShort();
      this.field2848 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1114752689"
   )
   public static boolean method4907(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-1887108041"
   )
   static int method4905(int var0, Script var1, boolean var2) {
      Widget var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.IF_GETOP) {
         if (var0 == ScriptOpcodes.IF_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }
}
