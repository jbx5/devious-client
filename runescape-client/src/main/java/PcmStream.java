import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lay;"
   )
   @Export("after")
   PcmStream after;
   @ObfuscatedName("z")
   int field364;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lbd;"
   )
   @Export("sound")
   AbstractSound sound;
   @ObfuscatedName("w")
   @Export("active")
   volatile boolean active = true;

   protected PcmStream() {
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("firstSubStream")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("nextSubStream")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedName("d")
   protected abstract int vmethod5648();

   @ObfuscatedName("n")
   @Export("fill")
   protected abstract void fill(int[] var1, int var2, int var3);

   @ObfuscatedName("l")
   @Export("skip")
   protected abstract void skip(int var1);

   @ObfuscatedName("ae")
   int vmethod1019() {
      return 255;
   }

   @ObfuscatedName("ew")
   @Export("update")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }
}
