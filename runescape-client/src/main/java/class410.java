import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public enum class410 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4587(3, 1),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4585(0, 2),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4588(1, 3),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4586(2, 10);

   @ObfuscatedName("b")
   static int[] field4590;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 379824825
   )
   final int field4584;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 195227197
   )
   final int field4589;

   class410(int var3, int var4) {
      this.field4584 = var3;
      this.field4589 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4589;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Llg;Ljava/lang/String;Ljava/lang/String;I)[Lry;",
      garbageValue = "-1746831361"
   )
   public static IndexedSprite[] method7741(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      return class147.method3146(var0, var3, var4);
   }
}
