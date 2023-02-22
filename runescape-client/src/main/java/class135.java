import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public enum class135 implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1588(0, 0),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1579(1, 1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1580(2, 2),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1581(3, 3),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1589(4, 4),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1583(5, 5),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1584(6, 6),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1585(7, 7),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   field1586(8, 8);

   @ObfuscatedName("bp")
   @Export("garbageCollector")
   static GarbageCollectorMXBean garbageCollector;
   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1601735427
   )
   final int field1582;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 443647549
   )
   final int field1590;

   class135(int var3, int var4) {
      this.field1582 = var3;
      this.field1590 = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1590;
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Object;",
      garbageValue = "1765946215"
   )
   static Object method3074(int var0) {
      return class148.method3171((class467)SpriteMask.findEnumerated(class467.method8480(), var0));
   }
}
