import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
public class class32 {
   @ObfuscatedName("a")
   static Applet field175 = null;
   @ObfuscatedName("f")
   static String field176 = "";
   @ObfuscatedName("d")
   @Export("Tiles_underlays")
   static byte[][][] Tiles_underlays;
   @ObfuscatedName("r")
   @Export("Tiles_hue")
   static int[] Tiles_hue;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   @Export("pcmPlayerProvider")
   static class51 pcmPlayerProvider;

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1743453877"
   )
   static final int method470(int var0, int var1) {
      int var2 = WorldMapSprite.method5154(var0 - 1, var1 - 1) + WorldMapSprite.method5154(var0 + 1, var1 - 1) + WorldMapSprite.method5154(var0 - 1, var1 + 1) + WorldMapSprite.method5154(1 + var0, var1 + 1);
      int var3 = WorldMapSprite.method5154(var0 - 1, var1) + WorldMapSprite.method5154(1 + var0, var1) + WorldMapSprite.method5154(var0, var1 - 1) + WorldMapSprite.method5154(var0, var1 + 1);
      int var4 = WorldMapSprite.method5154(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "18"
   )
   static int method477(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.LOGOUT) {
         Client.logoutTimer = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
