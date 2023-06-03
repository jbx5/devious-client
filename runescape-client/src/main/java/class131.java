import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class131 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1554 = new class131(0, 0, (String)null, -1, -1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1540 = new class131(1, 1, (String)null, 0, 2);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1541 = new class131(2, 2, (String)null, 1, 2);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1557 = new class131(3, 3, (String)null, 2, 2);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1543 = new class131(4, 4, (String)null, 3, 1);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1553 = new class131(5, 5, (String)null, 4, 1);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1545 = new class131(6, 6, (String)null, 5, 1);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1546 = new class131(7, 7, (String)null, 6, 3);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1547 = new class131(8, 8, (String)null, 7, 3);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1548 = new class131(9, 9, (String)null, 8, 3);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1542 = new class131(10, 10, (String)null, 0, 7);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1550 = new class131(11, 11, (String)null, 1, 7);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1544 = new class131(12, 12, (String)null, 2, 7);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1552 = new class131(13, 13, (String)null, 3, 7);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1549 = new class131(14, 14, (String)null, 4, 7);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1551 = new class131(15, 15, (String)null, 5, 7);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   static final class131 field1555 = new class131(16, 16, (String)null, 0, 5);
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1549039255
   )
   final int field1556;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 530600191
   )
   final int field1539;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 100469303
   )
   final int field1558;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;II)V",
      garbageValue = "-1"
   )
   class131(int var1, int var2, String var3, int var4, int var5) {
      this.field1556 = var1;
      this.field1539 = var2;
      this.field1558 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1539;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1904770530"
   )
   int method3017() {
      return this.field1558;
   }
}
