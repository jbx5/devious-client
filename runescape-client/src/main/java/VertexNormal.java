import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "Lfy;"
   )
   @Export("socketTask")
   static Task socketTask;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1046360711
   )
   @Export("x")
   int x;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1848636231
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -209584019
   )
   @Export("z")
   int z;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -867877795
   )
   @Export("magnitude")
   int magnitude;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lhw;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "-546159612"
   )
   @Export("decompressBytes")
   static final byte[] decompressBytes(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if (var3 < 0 || AbstractArchive.field4157 != 0 && var3 > AbstractArchive.field4157) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var6 = new byte[var3];
         var1.readBytes(var6, 0, var3);
         return var6;
      } else {
         int var4 = var1.readInt();
         if (var4 >= 0 && (AbstractArchive.field4157 == 0 || var4 <= AbstractArchive.field4157)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
            } else {
               AbstractArchive.gzipDecompressor.decompress(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
