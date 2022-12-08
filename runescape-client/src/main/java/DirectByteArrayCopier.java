import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("h")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "-108"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-878200260"
   )
   @Export("set")
   public void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }
}
