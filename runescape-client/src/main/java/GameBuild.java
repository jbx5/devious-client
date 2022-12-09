import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("LIVE")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("BUILDLIVE")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("RC")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("WIP")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("m")
   @Export("name")
   public final String name;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1115217905
   )
   @Export("buildId")
   final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }
}
