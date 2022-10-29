import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class7 {
   @ObfuscatedName("vx")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   @Export("worldMap")
   static WorldMap worldMap;
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   static Archive field32;
   @ObfuscatedName("a")
   ExecutorService field25 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("f")
   Future field33;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   final Buffer field27;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lx;"
   )
   final class3 field28;

   @ObfuscatedSignature(
      descriptor = "(Lqr;Lx;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field27 = var1;
      this.field28 = var2;
      this.method46();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "417065643"
   )
   public boolean method33() {
      return this.field33.isDone();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-23"
   )
   public void method34() {
      this.field25.shutdown();
      this.field25 = null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Lqr;",
      garbageValue = "1477518174"
   )
   public Buffer method35() {
      try {
         return (Buffer)this.field33.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "81"
   )
   void method46() {
      this.field33 = this.field25.submit(new class1(this, this.field27, this.field28));
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;",
      garbageValue = "180"
   )
   public static File method50(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      JagexCache.JagexCache_locationFile = new File(class37.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      Buffer var8;
      File var26;
      if (JagexCache.JagexCache_locationFile.exists()) {
         try {
            AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

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
         } catch (IOException var24) {
            var24.printStackTrace();
         }

         if (var4 != null) {
            var26 = new File(var4);
            if (!var26.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            var26 = new File(var4, "test.dat");
            if (!class31.method464(var26, true)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && var2 == 0) {
         label147:
         for(int var15 = 0; var15 < AbstractWorldMapIcon.cacheSubPaths.length; ++var15) {
            for(int var16 = 0; var16 < GrandExchangeOffer.cacheParentPaths.length; ++var16) {
               File var17 = new File(GrandExchangeOffer.cacheParentPaths[var16] + AbstractWorldMapIcon.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar);
               if (var17.exists()) {
                  File var11 = new File(var17, "test.dat");

                  boolean var27;
                  try {
                     RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
                     int var13 = var12.read();
                     var12.seek(0L);
                     var12.write(var13);
                     var12.seek(0L);
                     var12.close();
                     var11.delete();
                     var27 = true;
                  } catch (Exception var22) {
                     var27 = false;
                  }

                  if (var27) {
                     var4 = var17.toString();
                     var6 = true;
                     break label147;
                  }
               }
            }
         }
      }

      if (var4 == null) {
         var4 = class37.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var25;
      if (var5 != null) {
         var25 = new File(var5);
         var26 = new File(var4);

         try {
            File[] var29 = var25.listFiles();
            File[] var18 = var29;

            for(int var19 = 0; var19 < var18.length; ++var19) {
               File var28 = var18[var19];
               File var20 = new File(var26, var28.getName());
               boolean var14 = var28.renameTo(var20);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var23) {
            var23.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         var25 = new File(var4);
         var8 = null;

         try {
            AccessFile var30 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
            Buffer var31 = new Buffer(500);
            var31.writeByte(3);
            var31.writeByte(var8 != null ? 1 : 0);
            var31.writeCESU8(var25.getPath());
            if (var8 != null) {
               var31.writeCESU8("");
            }

            var30.write(var31.array, 0, var31.offset);
            var30.close();
         } catch (IOException var21) {
            var21.printStackTrace();
         }
      }

      return new File(var4);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-673824409"
   )
   static int method49(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IIIIIII)V",
      garbageValue = "-1273062084"
   )
   static final void method32(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.field571) {
         Client.alternativeScrollbarWidth = 32;
      } else {
         Client.alternativeScrollbarWidth = 0;
      }

      Client.field571 = false;
      int var7;
      if (MouseHandler.MouseHandler_currentButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            class143.invalidateWidget(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            class143.invalidateWidget(var0);
         } else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            class143.invalidateWidget(var0);
            Client.field571 = true;
         }
      }

      if (Client.mouseWheelRotation != 0) {
         var7 = var0.width;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += Client.mouseWheelRotation * 45;
            class143.invalidateWidget(var0);
         }
      }

   }

   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      descriptor = "(Lck;ZI)V",
      garbageValue = "563332048"
   )
   @Export("closeInterface")
   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var2 = var0.group;
      int var3 = (int)var0.key;
      var0.remove();
      if (var1) {
         WorldMapAreaData.method5265(var2);
      }

      class144.method3062(var2);
      Widget var4 = class281.getWidget(var3);
      if (var4 != null) {
         class143.invalidateWidget(var4);
      }

      if (Client.rootInterface != -1) {
         WallDecoration.runIntfCloseListeners(Client.rootInterface, 1);
      }

   }
}
