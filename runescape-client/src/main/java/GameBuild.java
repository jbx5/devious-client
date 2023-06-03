import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnt;"
   )
   @Export("LIVE")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnt;"
   )
   @Export("BUILDLIVE")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lnt;"
   )
   @Export("RC")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lnt;"
   )
   @Export("WIP")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Lng;"
   )
   static StudioGame field3841;
   @ObfuscatedName("ax")
   @Export("name")
   public final String name;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 243254949
   )
   @Export("buildId")
   final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }
}
