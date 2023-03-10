import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("DbRowType")
public class DbRowType extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   public static AbstractArchive field4881;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("DBRowType_cache")
   public static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ac")
   @Export("columnTypes")
   Object[][] columnTypes;
   @ObfuscatedName("ab")
   int[][] field4880;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1115242547
   )
   @Export("tableId")
   public int tableId = -1;

   DbRowType() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "-19"
   )
   void method8519(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method8522(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ljava/lang/Object;",
      garbageValue = "-99"
   )
   @Export("getColumnType")
   public Object[] getColumnType(int var1) {
      return this.columnTypes == null ? null : this.columnTypes[var1];
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-2101784162"
   )
   void method8522(Buffer var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.readUnsignedByte();
         if (this.columnTypes == null) {
            this.columnTypes = new Object[var3][];
            this.field4880 = new int[var3][];
         }

         for(int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
            int var5 = var1.readUnsignedByte();
            int[] var6 = new int[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = var1.readUShortSmart();
            }

            this.columnTypes[var4] = Clock.method3525(var1, var6);
            this.field4880[var4] = var6;
         }
      } else if (var2 == 4) {
         this.tableId = var1.packBytesToInt();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "8396928"
   )
   void method8524() {
   }
}
