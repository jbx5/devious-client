import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class296 {
   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "Lco;"
   )
   @Export("localPlayer")
   static Player localPlayer;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)Ljava/lang/String;",
      garbageValue = "-20"
   )
   public static String method5721(Buffer var0) {
      return class28.method435(var0, 32767);
   }
}
