import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
   @ObfuscatedName("at")
   int field407;

   @ObfuscatedName("at")
   @Export("remove2")
   abstract void remove2();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lbe;)I"
   )
   @Export("update")
   abstract int update();
}
