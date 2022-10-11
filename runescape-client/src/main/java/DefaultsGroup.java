import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("DefaultsGroup")
public class DefaultsGroup {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   static final DefaultsGroup field4533 = new DefaultsGroup(3);
   @ObfuscatedName("s")
   @Export("Tiles_lightness")
   static int[] Tiles_lightness;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2076033797
   )
   @Export("group")
   final int group;

   DefaultsGroup(int var1) {
      this.group = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1557286602"
   )
   static final void method7565(String var0) {
      class11.method101(var0 + " is already on your ignore list");
   }
}
