import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class153 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 1391048387397571219L
   )
   long field1775;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = 5035941996955199509L
   )
   long field1771 = -1L;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   IterableNodeDeque field1772 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lqy;)V"
   )
   public class153(Buffer var1) {
      this.method3291(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1859728941"
   )
   void method3291(Buffer var1) {
      this.field1775 = var1.readLong();
      this.field1771 = var1.readLong();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 1) {
            var3 = new class148(this);
         } else if (var2 == 4) {
            var3 = new class159(this);
         } else if (var2 == 3) {
            var3 = new class144(this);
         } else if (var2 == 2) {
            var3 = new class142(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class149(this);
         }

         ((class152)var3).vmethod3336(var1);
         this.field1772.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1429912683"
   )
   public void method3284(ClanChannel var1) {
      if (var1.key == this.field1775 && this.field1771 == var1.field1794) {
         for(class152 var2 = (class152)this.field1772.last(); var2 != null; var2 = (class152)this.field1772.previous()) {
            var2.vmethod3337(var1);
         }

         ++var1.field1794;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)Ljava/lang/String;",
      garbageValue = "-1511389929"
   )
   public static String method3285(Buffer var0) {
      String var1;
      try {
         int var2 = var0.readUShortSmart();
         if (var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class308.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
         String var4 = ClientPacket.decodeStringCp1252(var3, 0, var2);
         var1 = var4;
      } catch (Exception var6) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
