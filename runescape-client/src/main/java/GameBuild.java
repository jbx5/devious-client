import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("LIVE")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("BUILDLIVE")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("RC")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("WIP")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("h")
   @Export("name")
   public final String name;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1087843529
   )
   @Export("buildId")
   final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "46"
   )
   static int method6255(int var0, Script var1, boolean var2) {
      if (var0 == 7108) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class248.method5163() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
