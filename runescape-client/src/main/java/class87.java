import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class87 implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ldd;"
   )
   field1069(0, -1),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ldd;"
   )
   field1071(1, 1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ldd;"
   )
   field1070(2, 7),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ldd;"
   )
   field1076(3, 8),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ldd;"
   )
   field1072(4, 9);

   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1913812595
   )
   final int field1073;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1146836647
   )
   final int field1074;

   class87(int var3, int var4) {
      this.field1073 = var3;
      this.field1074 = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1074;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "2129812496"
   )
   public static void method2286(String var0, String var1, int var2, int var3) throws IOException {
      class188.idxCount = var3;
      class7.cacheGamebuild = var2;

      try {
         ChatChannel.operatingSystemName = System.getProperty("os.name");
      } catch (Exception var32) {
         ChatChannel.operatingSystemName = "Unknown";
      }

      class122.formattedOperatingSystemName = ChatChannel.operatingSystemName.toLowerCase();

      try {
         class16.userHomeDirectory = System.getProperty("user.home");
         if (class16.userHomeDirectory != null) {
            class16.userHomeDirectory = class16.userHomeDirectory + "/";
         }
      } catch (Exception var31) {
      }

      try {
         if (class122.formattedOperatingSystemName.startsWith("win")) {
            if (class16.userHomeDirectory == null) {
               class16.userHomeDirectory = System.getenv("USERPROFILE");
            }
         } else if (class16.userHomeDirectory == null) {
            class16.userHomeDirectory = System.getenv("HOME");
         }

         if (class16.userHomeDirectory != null) {
            class16.userHomeDirectory = class16.userHomeDirectory + "/";
         }
      } catch (Exception var30) {
      }

      if (class16.userHomeDirectory == null) {
         class16.userHomeDirectory = "~/";
      }

      class164.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class16.userHomeDirectory, "/tmp/", ""};
      StudioGame.cacheSubPaths = new String[]{".jagex_cache_" + class7.cacheGamebuild, ".file_store_" + class7.cacheGamebuild};
      int var18 = 0;

      label263:
      while(var18 < 4) {
         String var6 = var18 == 0 ? "" : "" + var18;
         ClanChannelMember.JagexCache_locationFile = new File(class16.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
         String var7 = null;
         String var8 = null;
         boolean var9 = false;
         int var12;
         int var14;
         File var37;
         if (ClanChannelMember.JagexCache_locationFile.exists()) {
            try {
               AccessFile var10 = new AccessFile(ClanChannelMember.JagexCache_locationFile, "rw", 10000L);

               Buffer var11;
               for(var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
                  var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
                  if (var12 == -1) {
                     throw new IOException();
                  }
               }

               var11.offset = 0;
               var12 = var11.readUnsignedByte();
               if (var12 < 1 || var12 > 3) {
                  throw new IOException("" + var12);
               }

               int var13 = 0;
               if (var12 > 1) {
                  var13 = var11.readUnsignedByte();
               }

               if (var12 <= 2) {
                  var7 = var11.readStringCp1252NullCircumfixed();
                  if (var13 == 1) {
                     var8 = var11.readStringCp1252NullCircumfixed();
                  }
               } else {
                  var7 = var11.readCESU8();
                  if (var13 == 1) {
                     var8 = var11.readCESU8();
                  }
               }

               var10.close();
            } catch (IOException var34) {
               var34.printStackTrace();
            }

            if (var7 != null) {
               var37 = new File(var7);
               if (!var37.exists()) {
                  var7 = null;
               }
            }

            if (var7 != null) {
               var37 = new File(var7, "test.dat");

               boolean var40;
               try {
                  RandomAccessFile var19 = new RandomAccessFile(var37, "rw");
                  var14 = var19.read();
                  var19.seek(0L);
                  var19.write(var14);
                  var19.seek(0L);
                  var19.close();
                  var37.delete();
                  var40 = true;
               } catch (Exception var29) {
                  var40 = false;
               }

               if (!var40) {
                  var7 = null;
               }
            }
         }

         if (var7 == null && var18 == 0) {
            label238:
            for(int var20 = 0; var20 < StudioGame.cacheSubPaths.length; ++var20) {
               for(int var21 = 0; var21 < class164.cacheParentPaths.length; ++var21) {
                  File var22 = new File(class164.cacheParentPaths[var21] + StudioGame.cacheSubPaths[var20] + File.separatorChar + var0 + File.separatorChar);
                  if (var22.exists()) {
                     File var23 = new File(var22, "test.dat");

                     boolean var41;
                     try {
                        RandomAccessFile var15 = new RandomAccessFile(var23, "rw");
                        int var16 = var15.read();
                        var15.seek(0L);
                        var15.write(var16);
                        var15.seek(0L);
                        var15.close();
                        var23.delete();
                        var41 = true;
                     } catch (Exception var28) {
                        var41 = false;
                     }

                     if (var41) {
                        var7 = var22.toString();
                        var9 = true;
                        break label238;
                     }
                  }
               }
            }
         }

         if (var7 == null) {
            var7 = class16.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
            var9 = true;
         }

         if (var8 != null) {
            File var36 = new File(var8);
            var37 = new File(var7);

            try {
               File[] var45 = var36.listFiles();
               File[] var43 = var45;

               for(var14 = 0; var14 < var43.length; ++var14) {
                  File var42 = var43[var14];
                  File var24 = new File(var37, var42.getName());
                  boolean var17 = var42.renameTo(var24);
                  if (!var17) {
                     throw new IOException();
                  }
               }
            } catch (Exception var33) {
               var33.printStackTrace();
            }

            var9 = true;
         }

         if (var9) {
            class329.method6346(new File(var7), (File)null);
         }

         File var5 = new File(var7);
         SoundCache.cacheDir = var5;
         if (!SoundCache.cacheDir.exists()) {
            SoundCache.cacheDir.mkdirs();
         }

         File[] var35 = SoundCache.cacheDir.listFiles();
         if (var35 != null) {
            File[] var38 = var35;

            for(int var25 = 0; var25 < var38.length; ++var25) {
               File var26 = var38[var25];

               boolean var44;
               try {
                  RandomAccessFile var39 = new RandomAccessFile(var26, "rw");
                  var12 = var39.read();
                  var39.seek(0L);
                  var39.write(var12);
                  var39.seek(0L);
                  var39.close();
                  var44 = true;
               } catch (Exception var27) {
                  var44 = false;
               }

               if (!var44) {
                  ++var18;
                  continue label263;
               }
            }
         }
         break;
      }

      class126.method2965(SoundCache.cacheDir);
      ChatChannel.method2153();
      JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class126.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
      JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class126.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      JagexCache.JagexCache_idxFiles = new BufferedFile[class188.idxCount];

      for(var18 = 0; var18 < class188.idxCount; ++var18) {
         JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class126.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
      }

   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1923414943"
   )
   static int method2277(int var0) {
      return (int)((Math.log((double)var0) / Interpreter.field839 - 7.0) * 256.0);
   }
}
