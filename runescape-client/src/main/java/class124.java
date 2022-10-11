import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class124 {
   @ObfuscatedName("gk")
   static String field1482;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = -1449113459
   )
   @Export("selectedSpellWidget")
   static int selectedSpellWidget;
   @ObfuscatedName("a")
   boolean field1481;
   @ObfuscatedName("f")
   boolean field1480;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   class123 field1490;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   class123 field1489;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Ldo;"
   )
   class120[] field1493;
   @ObfuscatedName("j")
   boolean field1484;
   @ObfuscatedName("y")
   float field1485;
   @ObfuscatedName("d")
   float field1486;
   @ObfuscatedName("n")
   float[] field1487 = new float[4];
   @ObfuscatedName("r")
   float[] field1488 = new float[4];
   @ObfuscatedName("l")
   boolean field1483 = true;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -879029379
   )
   int field1479 = 0;
   @ObfuscatedName("p")
   float[] field1491;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -13209129
   )
   int field1492;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1975601725
   )
   int field1496;
   @ObfuscatedName("u")
   float field1494;
   @ObfuscatedName("z")
   float field1495;

   class124() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)I",
      garbageValue = "-995665478"
   )
   int method2874(Buffer var1, int var2) {
      int var3 = var1.readUnsignedShort();
      ArchiveDiskActionHandler.method6280(var1.readUnsignedByte());
      this.field1490 = GraphicsObject.method2016(var1.readUnsignedByte());
      this.field1489 = GraphicsObject.method2016(var1.readUnsignedByte());
      this.field1481 = var1.readUnsignedByte() != 0;
      this.field1493 = new class120[var3];
      class120 var4 = null;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         class120 var6 = new class120();
         var6.method2811(var1, var2);
         this.field1493[var5] = var6;
         if (var4 != null) {
            var4.field1444 = var6;
         }

         var4 = var6;
      }

      this.field1492 = this.field1493[0].field1441;
      this.field1496 = this.field1493[this.method2880() - 1].field1441;
      this.field1491 = new float[this.method2877() + 1];

      for(var5 = this.method2897(); var5 <= this.method2876(); ++var5) {
         this.field1491[var5 - this.method2897()] = class132.method2966(this, (float)var5);
      }

      this.field1493 = null;
      this.field1494 = class132.method2966(this, (float)(this.method2897() - 1));
      this.field1495 = class132.method2966(this, (float)(this.method2876() + 1));
      return var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "-1595735261"
   )
   public float method2885(int var1) {
      if (var1 < this.method2897()) {
         return this.field1494;
      } else {
         return var1 > this.method2876() ? this.field1495 : this.field1491[var1 - this.method2897()];
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1672426313"
   )
   int method2897() {
      return this.field1492;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-55"
   )
   int method2876() {
      return this.field1496;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1973809325"
   )
   int method2877() {
      return this.method2876() - this.method2897();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(FI)I",
      garbageValue = "-20292312"
   )
   int method2878(float var1) {
      if (this.field1479 < 0 || !((float)this.field1493[this.field1479].field1441 <= var1) || this.field1493[this.field1479].field1444 != null && !((float)this.field1493[this.field1479].field1444.field1441 > var1)) {
         if (!(var1 < (float)this.method2897()) && !(var1 > (float)this.method2876())) {
            int var2 = this.method2880();
            int var3 = this.field1479;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var5 + var4 >> 1;
                  if (var1 < (float)this.field1493[var6].field1441) {
                     if (var1 > (float)this.field1493[var6 - 1].field1441) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)this.field1493[var6].field1441)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)this.field1493[var6 + 1].field1441) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while(var4 <= var5);
            }

            if (var3 != this.field1479) {
               this.field1479 = var3;
               this.field1483 = true;
            }

            return this.field1479;
         } else {
            return -1;
         }
      } else {
         return this.field1479;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(FB)Ldo;",
      garbageValue = "-12"
   )
   class120 method2879(float var1) {
      int var2 = this.method2878(var1);
      return var2 >= 0 && var2 < this.field1493.length ? this.field1493[var2] : null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-894478953"
   )
   int method2880() {
      return this.field1493 == null ? 0 : this.field1493.length;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
      garbageValue = "125"
   )
   @Export("getFile")
   public static File getFile(String var0) {
      if (!FileSystem.FileSystem_hasPermissions) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  FileSystem.FileSystem_cacheFiles.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
               }

               throw new RuntimeException();
            }
         }
      }
   }
}
