import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("WorldMapLabel")
public class WorldMapLabel {
   @ObfuscatedName("aj")
   @Export("text")
   String text;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1074567771
   )
   @Export("width")
   int width;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1212449241
   )
   @Export("height")
   int height;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   @Export("size")
   WorldMapLabelSize size;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IILjd;)V"
   )
   WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
      this.text = var1;
      this.width = var2;
      this.height = var3;
      this.size = var4;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1857576391"
   )
   @Export("stringCp1252NullTerminatedByteSize")
   public static int stringCp1252NullTerminatedByteSize(String var0) {
      return var0.length() + 1;
   }
}
