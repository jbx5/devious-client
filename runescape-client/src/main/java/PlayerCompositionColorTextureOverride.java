import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
   @ObfuscatedName("sc")
   static boolean field1875;
   @ObfuscatedName("ac")
   @Export("playerCompositionRecolorTo")
   public short[] playerCompositionRecolorTo;
   @ObfuscatedName("ab")
   @Export("playerCompositionRetextureTo")
   public short[] playerCompositionRetextureTo;

   PlayerCompositionColorTextureOverride(int var1) {
      ItemComposition var2 = ParamComposition.ItemDefinition_get(var1);
      if (var2.method3983()) {
         this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
         System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
      }

      if (var2.method3926()) {
         this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
         System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "-1529721231"
   )
   public static void method3538(AbstractArchive var0) {
      EnumComposition.EnumDefinition_archive = var0;
   }
}
