import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
   @ObfuscatedName("f")
   int field417;

   @ObfuscatedName("f")
   @Export("remove2")
   abstract void remove2();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lay;)I"
   )
   @Export("update")
   abstract int update();
}
