import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class120 {
   @ObfuscatedName("ay")
   @Export("musicTrackBoolean")
   public static boolean musicTrackBoolean;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -834721191
   )
   int field1452;
   @ObfuscatedName("an")
   float field1455;
   @ObfuscatedName("aw")
   float field1451 = Float.MAX_VALUE;
   @ObfuscatedName("ac")
   float field1449 = Float.MAX_VALUE;
   @ObfuscatedName("au")
   float field1453 = Float.MAX_VALUE;
   @ObfuscatedName("ab")
   float field1450 = Float.MAX_VALUE;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lev;"
   )
   class120 field1454;

   class120() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "652967441"
   )
   void method2974(Buffer var1, int var2) {
      this.field1452 = var1.readShort();
      this.field1455 = var1.method9064();
      this.field1451 = var1.method9064();
      this.field1449 = var1.method9064();
      this.field1453 = var1.method9064();
      this.field1450 = var1.method9064();
   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-44"
   )
   @Export("setTapToDrop")
   static void setTapToDrop(boolean var0) {
      Client.tapToDrop = var0;
   }
}
