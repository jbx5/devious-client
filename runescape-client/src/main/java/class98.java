import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class98 {
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IZII)V",
      garbageValue = "-741281391"
   )
   public static final void method2629(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         PcmPlayer.field292 = var0;
         ChatChannel.PcmPlayer_stereo = var1;
         TileItem.field1314 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
