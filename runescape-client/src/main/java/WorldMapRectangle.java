import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
   @ObfuscatedName("uh")
   @ObfuscatedGetter(
      intValue = -621320819
   )
   static int field3006;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1083493055
   )
   @Export("width")
   int width;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 856820921
   )
   @Export("height")
   int height;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1346472301
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 844386227
   )
   @Export("y")
   int y;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   final WorldMapRenderer this$0;

   @ObfuscatedSignature(
      descriptor = "(Ljv;)V"
   )
   WorldMapRectangle(WorldMapRenderer var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "5766018"
   )
   static void method5466(String var0, String var1, String var2) {
      class129.method3124(7);
      class205.setLoginResponseString(var0, var1, var2);
   }
}
