import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("JagexCache")
public class JagexCache {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1493789117
   )
   @Export("idxCount")
   public static int idxCount;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("JagexCache_randomDat")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("JagexCache_dat2File")
   public static BufferedFile JagexCache_dat2File = null;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("JagexCache_idx255File")
   public static BufferedFile JagexCache_idx255File = null;
}
