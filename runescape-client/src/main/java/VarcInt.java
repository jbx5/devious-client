import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("VarcInt")
public class VarcInt extends DualNode {
   @ObfuscatedName("sk")
   @ObfuscatedSignature(
      descriptor = "Lfn;"
   )
   @Export("guestClanChannel")
   static ClanChannel guestClanChannel;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("VarcInt_archive")
   public static AbstractArchive VarcInt_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("VarcInt_cached")
   static EvictingDualNodeHashTable VarcInt_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lfn;"
   )
   static ClanChannel field1956;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = -1028390641
   )
   @Export("menuX")
   static int menuX;
   @ObfuscatedName("v")
   @Export("persist")
   public boolean persist = false;

   VarcInt() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "-1121101967"
   )
   void method3573(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method3574(var1, var2);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "511684289"
   )
   void method3574(Buffer var1, int var2) {
      if (var2 == 2) {
         this.persist = true;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
      garbageValue = "2144931745"
   )
   public static File method3572(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      JagexCache.JagexCache_locationFile = new File(UserComparator3.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      File var22;
      if (JagexCache.JagexCache_locationFile.exists()) {
         try {
            AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

            Buffer var8;
            int var9;
            for(var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
               var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
               if (var9 == -1) {
                  throw new IOException();
               }
            }

            var8.offset = 0;
            var9 = var8.readUnsignedByte();
            if (var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if (var9 > 1) {
               var10 = var8.readUnsignedByte();
            }

            if (var9 <= 2) {
               var4 = var8.readStringCp1252NullCircumfixed();
               if (var10 == 1) {
                  var5 = var8.readStringCp1252NullCircumfixed();
               }
            } else {
               var4 = var8.readCESU8();
               if (var10 == 1) {
                  var5 = var8.readCESU8();
               }
            }

            var7.close();
         } catch (IOException var20) {
            var20.printStackTrace();
         }

         if (var4 != null) {
            var22 = new File(var4);
            if (!var22.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            var22 = new File(var4, "test.dat");
            if (!WorldMapLabelSize.method4858(var22, true)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && var2 == 0) {
         label124:
         for(int var15 = 0; var15 < class89.cacheSubPaths.length; ++var15) {
            for(int var16 = 0; var16 < class121.cacheParentPaths.length; ++var16) {
               File var17 = new File(class121.cacheParentPaths[var16] + class89.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar);
               if (var17.exists() && WorldMapLabelSize.method4858(new File(var17, "test.dat"), true)) {
                  var4 = var17.toString();
                  var6 = true;
                  break label124;
               }
            }
         }
      }

      if (var4 == null) {
         var4 = UserComparator3.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      if (var5 != null) {
         File var21 = new File(var5);
         var22 = new File(var4);

         try {
            File[] var23 = var21.listFiles();
            File[] var18 = var23;

            for(int var11 = 0; var11 < var18.length; ++var11) {
               File var12 = var18[var11];
               File var13 = new File(var22, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var19) {
            var19.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         UserComparator7.method2828(new File(var4), (File)null);
      }

      return new File(var4);
   }
}
