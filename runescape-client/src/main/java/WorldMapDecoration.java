import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1019858505
   )
   @Export("objectDefinitionId")
   final int objectDefinitionId;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1874940309
   )
   @Export("decoration")
   final int decoration;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1995099473
   )
   @Export("rotation")
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lig;",
      garbageValue = "-122"
   )
   static RouteStrategy method5461(int var0, int var1) {
      Client.field804.approxDestinationX = var0;
      Client.field804.approxDestinationY = var1;
      Client.field804.approxDestinationSizeX = 1;
      Client.field804.approxDestinationSizeY = 1;
      return Client.field804;
   }
}
