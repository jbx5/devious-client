import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
   AbstractSocket() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1050513320"
   )
   @Export("isAvailable")
   public abstract boolean isAvailable(int var1) throws IOException;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-16"
   )
   @Export("available")
   public abstract int available() throws IOException;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1910038551"
   )
   @Export("readUnsignedByte")
   public abstract int readUnsignedByte() throws IOException;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "2022338375"
   )
   @Export("read")
   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "43"
   )
   @Export("write")
   public abstract void write(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "985050188"
   )
   @Export("close")
   public abstract void close();

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lfj;",
      garbageValue = "1371636425"
   )
   @Export("KitDefinition_get")
   public static KitDefinition KitDefinition_get(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
         var1 = new KitDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.KitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
