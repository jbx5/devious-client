import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("objectSounds")
   static NodeDeque objectSounds = new NodeDeque();
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -816284393
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2004718041
   )
   @Export("x")
   int x;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 599655883
   )
   @Export("y")
   int y;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 396792949
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -125593713
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1811939217
   )
   int field812;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1092434559
   )
   @Export("soundEffectId")
   int soundEffectId;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lbn;"
   )
   @Export("stream1")
   RawPcmStream stream1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1375364183
   )
   int field806;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1479769427
   )
   int field808;
   @ObfuscatedName("ax")
   @Export("soundEffectIds")
   int[] soundEffectIds;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 485843781
   )
   int field818;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lbn;"
   )
   @Export("stream2")
   RawPcmStream stream2;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lhu;"
   )
   @Export("obj")
   ObjectComposition obj;

   ObjectSound() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "79523440"
   )
   @Export("set")
   void set() {
      int var1 = this.soundEffectId;
      ObjectComposition var2 = this.obj.transform();
      if (var2 != null) {
         this.soundEffectId = var2.ambientSoundId;
         this.field812 = var2.int7 * 128;
         this.field806 = var2.int5;
         this.field808 = var2.int6;
         this.soundEffectIds = var2.soundEffectIds;
      } else {
         this.soundEffectId = -1;
         this.field812 = 0;
         this.field806 = 0;
         this.field808 = 0;
         this.soundEffectIds = null;
      }

      if (var1 != this.soundEffectId && this.stream1 != null) {
         class323.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }

   }
}
