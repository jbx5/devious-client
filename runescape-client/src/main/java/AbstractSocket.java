import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
   AbstractSocket() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1620434704"
   )
   @Export("isAvailable")
   public abstract boolean isAvailable(int var1) throws IOException;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1875273278"
   )
   @Export("available")
   public abstract int available() throws IOException;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "7042"
   )
   @Export("readUnsignedByte")
   public abstract int readUnsignedByte() throws IOException;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "-1864209340"
   )
   @Export("read")
   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1825322520"
   )
   @Export("write")
   public abstract void write(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "78"
   )
   @Export("close")
   public abstract void close();

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      descriptor = "(Lgg;IIII)V",
      garbageValue = "377152430"
   )
   static void method7484(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && BufferedSink.clientPreferences.method2411() != 0) {
         if (var0.field2214 != null && var0.field2214.containsKey(var1)) {
            int var4 = (Integer)var0.field2214.get(var1);
            if (var4 != 0) {
               int var7 = var4 >> 8;
               int var8 = var4 >> 4 & 7;
               int var9 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var10 = (var2 - 64) / 128;
               int var11 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
               ++Client.soundEffectCount;
            }

         }
      }
   }
}
