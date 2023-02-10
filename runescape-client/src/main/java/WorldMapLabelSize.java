import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
   @ObfuscatedName("vv")
   @ObfuscatedGetter(
      intValue = 644356761
   )
   @Export("foundItemIndex")
   static int foundItemIndex;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   @Export("WorldMapLabelSize_small")
   public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   @Export("WorldMapLabelSize_medium")
   public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   @Export("WorldMapLabelSize_large")
   public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   static AbstractSocket field2818;
   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("dragInventoryWidget")
   static Widget dragInventoryWidget;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1770879535
   )
   final int field2815;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 816325489
   )
   final int field2823;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 399849031
   )
   final int field2820;

   WorldMapLabelSize(int var1, int var2, int var3) {
      this.field2815 = var1;
      this.field2823 = var2;
      this.field2820 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(FI)Z",
      garbageValue = "-1217223454"
   )
   boolean method4887(float var1) {
      return var1 >= (float)this.field2820;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1114113"
   )
   public static int method4893(int var0) {
      return var0 >>> 12;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([BB)Lba;",
      garbageValue = "-50"
   )
   @Export("newScript")
   static Script newScript(byte[] var0) {
      Script var1 = new Script();
      Buffer var2 = new Buffer(var0);
      var2.offset = var2.array.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.array.length - 2 - var3 - 12;
      var2.offset = var4;
      int var5 = var2.readInt();
      var1.localIntCount = var2.readUnsignedShort();
      var1.localStringCount = var2.readUnsignedShort();
      var1.intArgumentCount = var2.readUnsignedShort();
      var1.stringArgumentCount = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.switches = var1.newIterableNodeHashTable(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class4.method21(var8) : 1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.put(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var1.field981 = var2.readStringCp1252NullTerminatedOrNull();
      var1.opcodes = new int[var5];
      var1.intOperands = new int[var5];
      var1.stringOperands = new String[var5];

      for(var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if (var8 == 3) {
            var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.intOperands[var7] = var2.readInt();
         } else {
            var1.intOperands[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }
}
