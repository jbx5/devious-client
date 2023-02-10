import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class316 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1503687097"
   )
   @Export("isWorldMapEvent")
   public static boolean isWorldMapEvent(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }
}
