import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -873938955
   )
   @Export("gameCyclesToDo")
   static int gameCyclesToDo;
   @ObfuscatedName("af")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   DirectByteArrayCopier() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "-302524425"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1503790515"
   )
   @Export("set")
   void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }
}
