import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lbp;"
   )
   @Export("after")
   PcmStream after;
   @ObfuscatedName("av")
   int field365;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lcu;"
   )
   @Export("sound")
   AbstractSound sound;
   @ObfuscatedName("am")
   @Export("active")
   volatile boolean active = true;

   protected PcmStream() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("firstSubStream")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("nextSubStream")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedName("al")
   protected abstract int vmethod5949();

   @ObfuscatedName("at")
   @Export("fill")
   protected abstract void fill(int[] var1, int var2, int var3);

   @ObfuscatedName("ay")
   @Export("skip")
   protected abstract void skip(int var1);

   @ObfuscatedName("ba")
   int vmethod1060() {
      return 255;
   }

   @ObfuscatedName("fz")
   @Export("update")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }
}
