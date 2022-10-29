import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class153 extends class135 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1481780439
   )
   int field1720;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1421693743
   )
   int field1719;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class153(class138 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1720 = var1.readInt();
      this.field1719 = var1.readInt();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3116(this.field1720, this.field1719);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lqj;",
      garbageValue = "35817219"
   )
   @Export("getDbRowType")
   public static DbRowType getDbRowType(int var0) {
      DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbRowType.field4848.takeFile(38, var0);
         var1 = new DbRowType();
         if (var2 != null) {
            var1.method8306(new Buffer(var2));
         }

         var1.method8309();
         DbRowType.DBRowType_cache.put(var1, (long)var0);
         return var1;
      }
   }
}
