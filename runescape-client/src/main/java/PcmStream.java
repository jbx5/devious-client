import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
   @ObfuscatedName("w")
   @Export("active")
   volatile boolean active = true;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   @Export("after")
   PcmStream after;
   @ObfuscatedName("o")
   int field369;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lbo;"
   )
   @Export("sound")
   AbstractSound sound;

   protected PcmStream() {
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("firstSubStream")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("nextSubStream")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedName("n")
   protected abstract int vmethod5793();

   @ObfuscatedName("l")
   @Export("fill")
   protected abstract void fill(int[] var1, int var2, int var3);

   @ObfuscatedName("c")
   @Export("skip")
   protected abstract void skip(int var1);

   @ObfuscatedName("av")
   int vmethod1026() {
      return 255;
   }

   @ObfuscatedName("ec")
   @Export("update")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }
}
