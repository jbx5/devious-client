import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public enum FillMode implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   @Export("SOLID")
   SOLID(0, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   field4998(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   field4997(2, 2);

   @ObfuscatedName("p")
   @Export("operatingSystemName")
   public static String operatingSystemName;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1399928939
   )
   public final int field4995;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2002378091
   )
   final int field4999;

   FillMode(int var3, int var4) {
      this.field4995 = var3;
      this.field4999 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4999;
   }
}
