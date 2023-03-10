import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
   @ObfuscatedName("aj")
   int field397;

   @ObfuscatedName("aj")
   @Export("remove2")
   abstract void remove2();

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lbc;)I"
   )
   @Export("update")
   abstract int update();
}
