import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("WorldMapLabel")
public class WorldMapLabel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[[Lkz;"
   )
   @Export("Widget_interfaceComponents")
   public static Widget[][] Widget_interfaceComponents;
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = 1971001137
   )
   @Export("selectedItemWidget")
   static int selectedItemWidget;
   @ObfuscatedName("f")
   @Export("text")
   String text;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1718779497
   )
   @Export("width")
   int width;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1498015633
   )
   @Export("height")
   int height;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   @Export("size")
   WorldMapLabelSize size;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IILip;)V"
   )
   WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
      this.text = var1;
      this.width = var2;
      this.height = var3;
      this.size = var4;
   }
}
