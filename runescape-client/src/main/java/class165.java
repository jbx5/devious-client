import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class165 extends class158 {
   @ObfuscatedName("at")
   String field1784;
   @ObfuscatedName("an")
   byte field1782;
   @ObfuscatedName("av")
   byte field1780;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgh;"
   )
   final class159 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgh;)V"
   )
   class165(class159 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-986564571"
   )
   void vmethod3370(Buffer var1) {
      this.field1784 = var1.readStringCp1252NullTerminatedOrNull();
      if (this.field1784 != null) {
         var1.readUnsignedByte();
         this.field1782 = var1.readByte();
         this.field1780 = var1.readByte();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgv;I)V",
      garbageValue = "1284013379"
   )
   void vmethod3371(ClanChannel var1) {
      var1.name = this.field1784;
      if (this.field1784 != null) {
         var1.field1766 = this.field1782;
         var1.field1767 = this.field1780;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsv;ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "87"
   )
   static String method3374(IterableNodeHashTable var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "([BB)Ldd;",
      garbageValue = "2"
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
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class128.method2970(var8) : 1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.put(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var1.field992 = var2.readStringCp1252NullTerminatedOrNull();
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-98"
   )
   public static void method3378() {
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }
}
