import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
   @ObfuscatedName("is")
   @ObfuscatedGetter(
      longValue = 5862111519352583623L
   )
   static long field3475;
   @ObfuscatedName("kt")
   @ObfuscatedGetter(
      intValue = -1083546353
   )
   @Export("cameraPitch")
   static int cameraPitch;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1596696575
   )
   int field3490;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("table")
   MusicPatch table;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lbp;"
   )
   @Export("rawSound")
   RawSound rawSound;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   MusicPatchNode2 field3498;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -631674899
   )
   int field3479;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1344709951
   )
   int field3480;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1002792537
   )
   int field3481;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1760371745
   )
   int field3482;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -858622521
   )
   int field3491;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1283450195
   )
   int field3484;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 687341709
   )
   int field3485;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1840287783
   )
   int field3486;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1291900711
   )
   int field3487;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -2044186109
   )
   int field3488;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2036982649
   )
   int field3489;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 709421089
   )
   int field3495;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1859620619
   )
   int field3493;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -637817183
   )
   int field3492;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   @Export("stream")
   RawPcmStream stream;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1607235797
   )
   int field3494;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1193260211
   )
   int field3483;

   MusicPatchNode() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "106225511"
   )
   void method5948() {
      this.table = null;
      this.rawSound = null;
      this.field3498 = null;
      this.stream = null;
   }
}
