import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("DbRowType")
public class DbRowType extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static AbstractArchive field4889;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("DBRowType_cache")
   static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("v")
   @Export("columnTypes")
   Object[][] columnTypes;
   @ObfuscatedName("x")
   int[][] field4892;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2001738031
   )
   @Export("tableId")
   public int tableId = -1;

   DbRowType() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "-1689842467"
   )
   void method8456(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method8460(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)[Ljava/lang/Object;",
      garbageValue = "-1711583640"
   )
   @Export("getColumnType")
   public Object[] getColumnType(int var1) {
      return this.columnTypes == null ? null : this.columnTypes[var1];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "-14"
   )
   void method8460(Buffer var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.readUnsignedByte();
         if (this.columnTypes == null) {
            this.columnTypes = new Object[var3][];
            this.field4892 = new int[var3][];
         }

         for(int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
            int var5 = var1.readUnsignedByte();
            int[] var6 = new int[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = var1.readUShortSmart();
            }

            Object[][] var16 = this.columnTypes;
            int var10 = var1.readUShortSmart();
            Object[] var11 = new Object[var6.length * var10];

            for(int var12 = 0; var12 < var10; ++var12) {
               for(int var13 = 0; var13 < var6.length; ++var13) {
                  int var14 = var13 + var6.length * var12;
                  class456 var15 = class9.method82(var6[var13]);
                  var11[var14] = var15.method8396(var1);
               }
            }

            var16[var4] = var11;
            this.field4892[var4] = var6;
         }
      } else if (var2 == 4) {
         this.tableId = var1.packBytesToInt();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1976644812"
   )
   void method8459() {
   }
}
