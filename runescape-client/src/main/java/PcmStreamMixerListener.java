import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
   @ObfuscatedName("a")
   int field411;

   @ObfuscatedName("a")
   @Export("remove2")
   abstract void remove2();

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lal;)I"
   )
   @Export("update")
   abstract int update();
}
