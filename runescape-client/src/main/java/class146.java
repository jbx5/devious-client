import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class146 extends class136 {
   @ObfuscatedName("ti")
   @ObfuscatedGetter(
      intValue = 546062336
   )
   static int field1718;
   @ObfuscatedName("fm")
   static String field1717;
   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1438657739
   )
   int field1712;
   @ObfuscatedName("e")
   String field1719;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class146(class139 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1712 = var1.readInt();
      this.field1719 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3182(this.field1712, this.field1719);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lqs;",
      garbageValue = "1183914569"
   )
   @Export("getDbTableType")
   public static DbTableType getDbTableType(int var0) {
      DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbTableType.field4882.takeFile(39, var0);
         var1 = new DbTableType();
         if (var2 != null) {
            var1.method8431(new Buffer(var2));
         }

         var1.method8433();
         DbTableType.DBTableType_cache.put(var1, (long)var0);
         return var1;
      }
   }
}
