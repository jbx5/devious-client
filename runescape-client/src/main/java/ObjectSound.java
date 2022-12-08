import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("objectSounds")
   static NodeDeque objectSounds = new NodeDeque();
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1401561861
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1199351805
   )
   @Export("x")
   int x;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1317524287
   )
   @Export("y")
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -661899648
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1301434539
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1369887985
   )
   int field847;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lgn;"
   )
   @Export("obj")
   ObjectComposition obj;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1499670769
   )
   @Export("soundEffectId")
   int soundEffectId;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lap;"
   )
   @Export("stream1")
   RawPcmStream stream1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -384288947
   )
   int field842;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1911815479
   )
   int field839;
   @ObfuscatedName("i")
   @Export("soundEffectIds")
   int[] soundEffectIds;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1274533343
   )
   int field850;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lap;"
   )
   @Export("stream2")
   RawPcmStream stream2;

   ObjectSound() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1596084359"
   )
   @Export("set")
   void set() {
      int var1 = this.soundEffectId;
      ObjectComposition var2 = this.obj.transform();
      if (var2 != null) {
         this.soundEffectId = var2.ambientSoundId;
         this.field847 = var2.int7 * 128;
         this.field842 = var2.int5;
         this.field839 = var2.int6;
         this.soundEffectIds = var2.soundEffectIds;
      } else {
         this.soundEffectId = -1;
         this.field847 = 0;
         this.field842 = 0;
         this.field839 = 0;
         this.soundEffectIds = null;
      }

      if (var1 != this.soundEffectId && this.stream1 != null) {
         ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1783942898"
   )
   public static boolean method1871(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (var0 != 0) {
            char[] var1 = class358.cp1252AsciiExtension;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
      garbageValue = "11"
   )
   @Export("insertMenuItemNoShift")
   public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
      class37.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
   }
}
