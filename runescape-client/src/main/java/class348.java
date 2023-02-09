import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class348 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   static final class348 field4310 = new class348();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   static final class348 field4309 = new class348();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   static final class348 field4308 = new class348();

   class348() {
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lln;II)Z",
      garbageValue = "1714134370"
   )
   public static boolean method6766(AbstractArchive var0, int var1) {
      byte[] var2 = var0.takeFileFlat(var1);
      if (var2 == null) {
         return false;
      } else {
         FriendLoginUpdate.SpriteBuffer_decode(var2);
         return true;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IZII)V",
      garbageValue = "-1212696730"
   )
   public static final void method6767(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         class284.field3321 = var0;
         PcmPlayer.PcmPlayer_stereo = var1;
         WorldMapCacheName.field3010 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
