import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("ArchiveLoader")
public class ArchiveLoader {
   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "Lqz;"
   )
   static AbstractSocket field1037;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive")
   final Archive archive;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1189006953
   )
   @Export("groupCount")
   final int groupCount;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1731597009
   )
   @Export("loadedCount")
   int loadedCount = 0;

   @ObfuscatedSignature(
      descriptor = "(Lny;Ljava/lang/String;)V"
   )
   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.groupCount = var1.getGroupCount();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-58994437"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      this.loadedCount = 0;

      for(int var1 = 0; var1 < this.groupCount; ++var1) {
         if (!this.archive.method6657(var1) || this.archive.method6685(var1)) {
            ++this.loadedCount;
         }
      }

      return this.loadedCount >= this.groupCount;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;ZB)Z",
      garbageValue = "-31"
   )
   static boolean method2217(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1476778115"
   )
   static int method2220(int var0, int var1) {
      for(int var2 = 0; var2 < 8; ++var2) {
         if (var1 <= var0 + 30) {
            return var2;
         }

         var0 += 30;
         var0 += var2 != 1 && var2 != 3 ? 5 : 20;
      }

      return 0;
   }
}
