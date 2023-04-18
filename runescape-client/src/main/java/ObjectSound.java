import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("objectSounds")
   static NodeDeque objectSounds = new NodeDeque();
   @ObfuscatedName("jw")
   @Export("regionMapArchives")
   static byte[][] regionMapArchives;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 776275305
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 417312384
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 99345247
   )
   @Export("y")
   int y;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -823707049
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1828326483
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1826007749
   )
   int field815;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1671764667
   )
   @Export("soundEffectId")
   int soundEffectId;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   @Export("stream1")
   RawPcmStream stream1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -442346035
   )
   int field824;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1018564833
   )
   int field825;
   @ObfuscatedName("ao")
   @Export("soundEffectIds")
   int[] soundEffectIds;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -428166745
   )
   int field822;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   @Export("stream2")
   RawPcmStream stream2;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   @Export("obj")
   ObjectComposition obj;

   ObjectSound() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "27660078"
   )
   @Export("set")
   void set() {
      int var1 = this.soundEffectId;
      ObjectComposition var2 = this.obj.transform();
      if (var2 != null) {
         this.soundEffectId = var2.ambientSoundId;
         this.field815 = var2.int7 * 128;
         this.field824 = var2.int5;
         this.field825 = var2.int6;
         this.soundEffectIds = var2.soundEffectIds;
      } else {
         this.soundEffectId = -1;
         this.field815 = 0;
         this.field824 = 0;
         this.field825 = 0;
         this.soundEffectIds = null;
      }

      if (var1 != this.soundEffectId && this.stream1 != null) {
         class130.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }

   }
}
