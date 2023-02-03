import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   static Archive field3448;
   @ObfuscatedName("fz")
   static String field3449;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -501004757
   )
   int field3436;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   MusicPatchNode2 field3429;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lkk;"
   )
   @Export("patch")
   MusicPatch patch;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lav;"
   )
   @Export("rawSound")
   RawSound rawSound;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -929709331
   )
   int field3430;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1784343281
   )
   int field3431;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -343643839
   )
   int field3432;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 212901617
   )
   int field3433;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1550445119
   )
   int field3434;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -617025829
   )
   int field3428;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 473859487
   )
   int field3439;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1546436608
   )
   int field3437;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 440623153
   )
   int field3438;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2031609351
   )
   int field3442;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1612229217
   )
   int field3440;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1418296901
   )
   int field3426;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1966879653
   )
   int field3441;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 396629489
   )
   int field3443;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lab;"
   )
   @Export("stream")
   RawPcmStream stream;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1144966453
   )
   int field3445;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 866450541
   )
   int field3446;

   MusicPatchNode() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "42680220"
   )
   void method5828() {
      this.patch = null;
      this.rawSound = null;
      this.field3429 = null;
      this.stream = null;
   }
}
