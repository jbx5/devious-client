import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class378 {
   @ObfuscatedName("lc")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIB)V",
      garbageValue = "29"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Players.loadInterface(var0)) {
         class144.updateInterface(class71.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
