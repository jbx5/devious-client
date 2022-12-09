import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("DbTableType")
public class DbTableType extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static AbstractArchive field4882;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("DBTableType_cache")
   public static EvictingDualNodeHashTable DBTableType_cache = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("v")
   @Export("types")
   public int[][] types;
   @ObfuscatedName("x")
   @Export("defaultValues")
   public Object[][] defaultValues;

   DbTableType() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "98"
   )
   void method8431(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method8440(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "1"
   )
   void method8440(Buffer var1, int var2) {
      if (var2 == 1) {
         int var3 = var1.readUnsignedByte();
         if (this.types == null) {
            this.types = new int[var3][];
         }

         for(int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
            int var5 = var4 & 127;
            boolean var6 = (var4 & 128) != 0;
            int[] var7 = new int[var1.readUnsignedByte()];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.readUShortSmart();
            }

            this.types[var5] = var7;
            if (var6) {
               if (this.defaultValues == null) {
                  this.defaultValues = new Object[this.types.length][];
               }

               Object[][] var17 = this.defaultValues;
               int var11 = var1.readUShortSmart();
               Object[] var12 = new Object[var7.length * var11];

               for(int var13 = 0; var13 < var11; ++var13) {
                  for(int var14 = 0; var14 < var7.length; ++var14) {
                     int var15 = var14 + var7.length * var13;
                     class456 var16 = class9.method82(var7[var14]);
                     var12[var15] = var16.method8396(var1);
                  }
               }

               var17[var5] = var12;
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "783882667"
   )
   void method8433() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "-770809944"
   )
   public static String method8435(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class299.charToByteCp1252(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "3912"
   )
   public static int method8447(int var0) {
      return var0 >>> 4 & class462.field4898;
   }
}
