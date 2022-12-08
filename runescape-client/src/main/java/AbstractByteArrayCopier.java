import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
   @ObfuscatedName("m")
   @Export("ArchiveDiskActionHandler_thread")
   static Thread ArchiveDiskActionHandler_thread;

   AbstractByteArrayCopier() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "-108"
   )
   @Export("get")
   abstract byte[] get();

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-878200260"
   )
   @Export("set")
   public abstract void set(byte[] var1);
}
