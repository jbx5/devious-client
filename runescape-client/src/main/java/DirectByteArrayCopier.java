import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("f")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "2088056836"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1513593399"
   )
   @Export("set")
   public void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1425254255"
   )
   static boolean method6408() {
      return (Client.drawPlayerNames & 4) != 0;
   }
}
