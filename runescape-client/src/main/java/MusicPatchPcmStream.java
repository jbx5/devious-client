import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   static Widget field3411;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("superStream")
   MidiPcmStream superStream;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("queue")
   NodeDeque queue = new NodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Laz;"
   )
   @Export("mixer")
   PcmStreamMixer mixer = new PcmStreamMixer();

   @ObfuscatedSignature(
      descriptor = "(Lka;)V"
   )
   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkx;[IIIII)V",
      garbageValue = "771309267"
   )
   void method5762(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if ((this.superStream.field3356[var1.field3427] & 4) != 0 && var1.field3415 < 0) {
         int var6 = this.superStream.field3372[var1.field3427] / (PcmPlayer.field325 * 22050);

         while(true) {
            int var7 = (var6 + 1048575 - var1.field3434) / var6;
            if (var7 > var4) {
               var1.field3434 += var4 * var6;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field3434 += var7 * var6 - 1048576;
            int var8 = PcmPlayer.field325 * 22050 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (this.superStream.field3358[var1.field3427] == 0) {
               var1.stream = RawPcmStream.method1029(var1.rawSound, var10.method918(), var10.method964(), var10.method921());
            } else {
               var1.stream = RawPcmStream.method1029(var1.rawSound, var10.method918(), 0, var10.method921());
               this.superStream.method5637(var1, var1.patch.field3399[var1.field3419] < 0);
               var1.stream.method914(var8, var10.method964());
            }

            if (var1.patch.field3399[var1.field3419] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var10.method916(var8);
            var10.fill(var2, var3, var5 - var3);
            if (var10.method976()) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "-81280386"
   )
   void method5755(MusicPatchNode var1, int var2) {
      if ((this.superStream.field3356[var1.field3427] & 4) != 0 && var1.field3415 < 0) {
         int var3 = this.superStream.field3372[var1.field3427] / (PcmPlayer.field325 * 22050);
         int var4 = (var3 + 1048575 - var1.field3434) / var3;
         var1.field3434 = var3 * var2 + var1.field3434 & 1048575;
         if (var4 <= var2) {
            if (this.superStream.field3358[var1.field3427] == 0) {
               var1.stream = RawPcmStream.method1029(var1.rawSound, var1.stream.method918(), var1.stream.method964(), var1.stream.method921());
            } else {
               var1.stream = RawPcmStream.method1029(var1.rawSound, var1.stream.method918(), 0, var1.stream.method921());
               this.superStream.method5637(var1, var1.patch.field3399[var1.field3419] < 0);
            }

            if (var1.patch.field3399[var1.field3419] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var2 = var1.field3434 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (var1 == null) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (var1 == null) {
            return null;
         }
      } while(var1.stream == null);

      return var1.stream;
   }

   @ObfuscatedName("r")
   protected int vmethod5753() {
      return 0;
   }

   @ObfuscatedName("u")
   @Export("fill")
   protected void fill(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5598(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3433) {
                  this.method5762(var6, var1, var4, var5, var4 + var5);
                  var6.field3433 -= var5;
                  break;
               }

               this.method5762(var6, var1, var4, var6.field3433, var5 + var4);
               var4 += var6.field3433;
               var5 -= var6.field3433;
            } while(!this.superStream.method5599(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("j")
   @Export("skip")
   protected void skip(int var1) {
      this.mixer.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method5598(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3433) {
                  this.method5755(var3, var2);
                  var3.field3433 -= var2;
                  break;
               }

               this.method5755(var3, var3.field3433);
               var2 -= var3.field3433;
            } while(!this.superStream.method5599(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "255"
   )
   static int method5774(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-1863786248"
   )
   static int method5751(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else if (var0 == 1707) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.method6172() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return class300.method5846(var3);
      } else {
         return var0 == 1709 ? LoginScreenAnimation.method2380(var3) : 2;
      }
   }
}
