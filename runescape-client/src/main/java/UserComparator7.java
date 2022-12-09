import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
   @ObfuscatedName("h")
   @Export("reversed")
   final boolean reversed;

   public UserComparator7(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "-221147899"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "67"
   )
   static boolean method2829(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
      garbageValue = "797678294"
   )
   static void method2828(File var0, File var1) {
      try {
         AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
         Buffer var3 = new Buffer(500);
         var3.writeByte(3);
         var3.writeByte(var1 != null ? 1 : 0);
         var3.writeCESU8(var0.getPath());
         if (var1 != null) {
            var3.writeCESU8("");
         }

         var2.write(var3.array, 0, var3.offset);
         var2.close();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
