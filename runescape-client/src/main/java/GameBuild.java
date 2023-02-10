import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   @Export("LIVE")
   public static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   @Export("BUILDLIVE")
   public static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   @Export("RC")
   public static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   @Export("WIP")
   public static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "Lho;"
   )
   @Export("textureProvider")
   static TextureProvider textureProvider;
   @ObfuscatedName("z")
   @Export("name")
   public final String name;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -207916577
   )
   @Export("buildId")
   public final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }
}
