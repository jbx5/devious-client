import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class323 {
   @ObfuscatedName("wd")
   @ObfuscatedGetter(
      longValue = -8156142729726467959L
   )
   static long field3740;

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-411015869"
   )
   @Export("playPcmPlayers")
   static final void playPcmPlayers() {
      if (HorizontalAlignment.pcmPlayer1 != null) {
         HorizontalAlignment.pcmPlayer1.run();
      }

      if (class28.pcmPlayer0 != null) {
         class28.pcmPlayer0.run();
      }

   }
}
