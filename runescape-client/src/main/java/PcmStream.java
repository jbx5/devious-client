import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lbj;"
   )
   @Export("after")
   PcmStream after;
   @ObfuscatedName("ae")
   int field349;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lce;"
   )
   @Export("sound")
   AbstractSound sound;
   @ObfuscatedName("ag")
   @Export("active")
   volatile boolean active = true;

   protected PcmStream() {
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("firstSubStream")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("nextSubStream")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedName("aq")
   protected abstract int vmethod5700();

   @ObfuscatedName("ap")
   @Export("fill")
   protected abstract void fill(int[] var1, int var2, int var3);

   @ObfuscatedName("ak")
   @Export("skip")
   protected abstract void skip(int var1);

   @ObfuscatedName("by")
   int vmethod1024() {
      return 255;
   }

   @ObfuscatedName("gz")
   @Export("update")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }
}
