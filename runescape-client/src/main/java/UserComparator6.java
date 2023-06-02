import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
   @ObfuscatedName("at")
   @Export("reversed")
   final boolean reversed;

   public UserComparator6(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqg;Lqg;I)I",
      garbageValue = "2036982649"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
      garbageValue = "38"
   )
   @Export("getFile")
   static File getFile(String var0) {
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "([BIILiz;[Lic;I)V",
      garbageValue = "-2003499120"
   )
   static final void method2895(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
      Buffer var5 = new Buffer(var0);
      int var6 = -1;

      while(true) {
         int var7 = var5.readIncrSmallSmart();
         if (var7 == 0) {
            return;
         }

         var6 += var7;
         int var8 = 0;

         while(true) {
            int var9 = var5.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var8 += var9 - 1;
            int var10 = var8 & 63;
            int var11 = var8 >> 6 & 63;
            int var12 = var8 >> 12;
            int var13 = var5.readUnsignedByte();
            int var14 = var13 >> 2;
            int var15 = var13 & 3;
            int var16 = var11 + var1;
            int var17 = var10 + var2;
            if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
               int var18 = var12;
               if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
                  var18 = var12 - 1;
               }

               CollisionMap var19 = null;
               if (var18 >= 0) {
                  var19 = var4[var18];
               }

               SpriteMask.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
            }
         }
      }
   }
}
