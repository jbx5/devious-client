import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class306 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("ItemDefinition_modelArchive")
   static AbstractArchive ItemDefinition_modelArchive;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "-1827228593"
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

   @ObfuscatedName("lj")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)Lkd;",
      garbageValue = "61354082"
   )
   static Widget method6317(Widget var0) {
      Widget var2 = var0;
      int var4 = Clock.getWidgetFlags(var0);
      int var3 = var4 >> 17 & 7;
      int var5 = var3;
      Widget var1;
      if (var3 == 0) {
         var1 = null;
      } else {
         int var6 = 0;

         while(true) {
            if (var6 >= var5) {
               var1 = var2;
               break;
            }

            var2 = PlayerCompositionColorTextureOverride.getWidget(var2.parentId);
            if (var2 == null) {
               var1 = null;
               break;
            }

            ++var6;
         }
      }

      Widget var7 = var1;
      if (var1 == null) {
         var7 = var0.parent;
      }

      return var7;
   }
}
