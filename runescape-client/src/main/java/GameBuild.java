import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   @Export("LIVE")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   @Export("BUILDLIVE")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   @Export("RC")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   @Export("WIP")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("an")
   @Export("name")
   public final String name;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1881256167
   )
   @Export("buildId")
   final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }
}
