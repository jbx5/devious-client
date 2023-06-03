import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class101 {
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = -272656609
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 926313171
   )
   int field1305;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 741085457
   )
   int field1302;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1854704015
   )
   int field1303;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 2114279233
   )
   int field1304;

   class101(int var1, int var2, int var3, int var4) {
      this.field1305 = var1;
      this.field1302 = var2;
      this.field1303 = var3;
      this.field1304 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1658985569"
   )
   int method2628() {
      return this.field1305;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-9232805"
   )
   int method2629() {
      return this.field1302;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-880543502"
   )
   int method2639() {
      return this.field1303;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "22"
   )
   int method2631() {
      return this.field1304;
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1592485699"
   )
   static int method2635(int var0) {
      return var0 * 3 + 600;
   }
}
