import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class388 {
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIILhu;II)V",
      garbageValue = "2037948415"
   )
   static void method7347(int var0, int var1, int var2, ObjectComposition var3, int var4) {
      ObjectSound var5 = new ObjectSound();
      var5.plane = var0;
      var5.x = var1 * 128;
      var5.y = var2 * 128;
      int var6 = var3.sizeX;
      int var7 = var3.sizeY;
      if (var4 == 1 || var4 == 3) {
         var6 = var3.sizeY;
         var7 = var3.sizeX;
      }

      var5.maxX = (var6 + var1) * 128;
      var5.maxY = (var7 + var2) * 128;
      var5.soundEffectId = var3.ambientSoundId;
      var5.field812 = var3.int7 * 128;
      var5.field806 = var3.int5;
      var5.field808 = var3.int6;
      var5.soundEffectIds = var3.soundEffectIds;
      if (var3.transforms != null) {
         var5.obj = var3;
         var5.set();
      }

      ObjectSound.objectSounds.addFirst(var5);
      if (var5.soundEffectIds != null) {
         var5.field818 = var5.field806 + (int)(Math.random() * (double)(var5.field808 - var5.field806));
      }

   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "792599380"
   )
   static int method7348(int var0, Script var1, boolean var2) {
      if (var0 == 7108) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class381.method7304() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
