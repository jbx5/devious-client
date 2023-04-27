import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public abstract class class273 implements class275 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1813265095
   )
   protected int field3071;

   @ObfuscatedSignature(
      descriptor = "(Lmr;Lnx;I)V"
   )
   protected class273(StudioGame var1, Language var2, int var3) {
      this.field3071 = var3;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-975091517"
   )
   static void method5614() {
      ByteArrayPool.field4472.clear();
      ByteArrayPool.field4472.add(100);
      ByteArrayPool.field4472.add(5000);
      ByteArrayPool.field4472.add(10000);
      ByteArrayPool.field4472.add(30000);
   }
}
