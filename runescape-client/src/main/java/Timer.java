import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("Timer")
public class Timer {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 5479086345961262657L
   )
   long field4466 = -1L;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 7491885951486581889L
   )
   long field4465 = -1L;
   @ObfuscatedName("v")
   public boolean field4471 = false;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -5312585389182625375L
   )
   long field4467 = 0L;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 3970913436350721287L
   )
   long field4473 = 0L;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      longValue = 1046205818457274059L
   )
   long field4469 = 0L;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 878992559
   )
   int field4470 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1339019647
   )
   int field4464 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 150418445
   )
   int field4472 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1757486459
   )
   int field4468 = 0;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1022354551"
   )
   public void method7381() {
      this.field4466 = class153.method3317();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1441360663"
   )
   public void method7379() {
      if (-1L != this.field4466) {
         this.field4473 = class153.method3317() - this.field4466;
         this.field4466 = -1L;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-21"
   )
   public void method7393(int var1) {
      this.field4465 = class153.method3317();
      this.field4470 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1971822075"
   )
   public void method7380() {
      if (this.field4465 != -1L) {
         this.field4467 = class153.method3317() - this.field4465;
         this.field4465 = -1L;
      }

      ++this.field4472;
      this.field4471 = true;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "35"
   )
   public void method7386() {
      this.field4471 = false;
      this.field4464 = 0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1398178117"
   )
   public void method7382() {
      this.method7380();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "8909785"
   )
   @Export("write")
   public void write(Buffer var1) {
      ServerPacket.method5560(var1, this.field4473);
      ServerPacket.method5560(var1, this.field4467);
      ServerPacket.method5560(var1, this.field4469);
      var1.writeShort(this.field4470);
      var1.writeShort(this.field4464);
      var1.writeShort(this.field4472);
      var1.writeShort(this.field4468);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-96"
   )
   static void method7404() {
      Tiles.Tiles_underlays = null;
      class172.Tiles_overlays = null;
      Tiles.Tiles_shapes = null;
      Tiles.field1012 = null;
      class312.field3717 = null;
      Tiles.Tiles_underlays2 = null;
      class323.field3794 = null;
      class100.Tiles_hue = null;
      class161.Tiles_saturation = null;
      Tiles.Tiles_lightness = null;
      class463.Tiles_hueMultiplier = null;
      SceneTilePaint.field2764 = null;
   }
}
