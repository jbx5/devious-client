import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class368 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Log;"
   )
   static final class368 field4337 = new class368();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Log;"
   )
   static final class368 field4335 = new class368();
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Log;"
   )
   static final class368 field4336 = new class368();
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Log;"
   )
   static final class368 field4334 = new class368();

   class368() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lnq;IIIZI)V",
      garbageValue = "2096300363"
   )
   public static void method6892(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      class304.musicPlayerStatus = 1;
      UserComparator9.musicTrackArchive = var0;
      VarbitComposition.musicTrackGroupId = var1;
      class304.musicTrackFileId = var2;
      class304.musicTrackVolume = var3;
      class132.musicTrackBoolean = var4;
      class157.pcmSampleLength = 10000;
   }
}
