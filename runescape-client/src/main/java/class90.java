import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public enum class90 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   field1091(0, -1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   field1090(1, 2),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   field1096(2, 3),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   field1092(3, 4),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   field1093(4, 5),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   field1094(5, 6);

   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -599705559
   )
   final int field1095;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 2044227431
   )
   final int field1089;

   class90(int var3, int var4) {
      this.field1095 = var3;
      this.field1089 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1089;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-190718887"
   )
   public static void method2280() {
      DbTableType.DBTableType_cache.clear();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)Ley;",
      garbageValue = "1399066247"
   )
   static class127 method2279(int var0) {
      class127 var1 = (class127)GameObject.findEnumerated(ObjectSound.method1875(), var0);
      if (var1 == null) {
         var1 = class127.field1494;
      }

      return var1;
   }
}
