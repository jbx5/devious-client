import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("DbRowType")
public class DbRowType extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   static AbstractArchive field4918;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("DBRowType_cache")
   public static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("v")
   @Export("columnTypes")
   Object[][] columnTypes;
   @ObfuscatedName("s")
   int[][] field4919;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1930079777
   )
   @Export("tableId")
   public int tableId = -1;

   DbRowType() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "138870085"
   )
   void method8556(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method8557(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ljava/lang/Object;",
      garbageValue = "18"
   )
   @Export("getColumnType")
   public Object[] getColumnType(int var1) {
      return this.columnTypes == null ? null : this.columnTypes[var1];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "1069329376"
   )
   void method8557(Buffer var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.readUnsignedByte();
         if (this.columnTypes == null) {
            this.columnTypes = new Object[var3][];
            this.field4919 = new int[var3][];
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
                  class463 var15 = class370.method7047(var6[var13]);
                  var11[var14] = var15.method8507(var1);
               }
            }

            var16[var4] = var11;
            this.field4919[var4] = var6;
         }
      } else if (var2 == 4) {
         this.tableId = var1.packBytesToInt();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1520825771"
   )
   void method8558() {
   }

   @ObfuscatedName("lj")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)V",
      garbageValue = "-1866344930"
   )
   static final void method8572(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 324) {
         if (Client.field787 == -1) {
            Client.field787 = var0.spriteId2;
            Client.field788 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field787;
         } else {
            var0.spriteId2 = Client.field788;
         }

      } else if (var1 == 325) {
         if (Client.field787 == -1) {
            Client.field787 = var0.spriteId2;
            Client.field788 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field788;
         } else {
            var0.spriteId2 = Client.field787;
         }

      } else if (var1 == 327) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if (var1 == 328) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }
}
