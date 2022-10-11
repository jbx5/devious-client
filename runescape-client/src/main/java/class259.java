import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public abstract class class259 implements class261 {
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   static GameBuild field2967;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 701715513
   )
   protected int field2969;

   @ObfuscatedSignature(
      descriptor = "(Llq;Lmo;I)V"
   )
   protected class259(StudioGame var1, Language var2, int var3) {
      this.field2969 = var3;
   }
}
