import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   @Export("after")
   PcmStream after;
   @ObfuscatedName("a")
   int field383;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lbc;"
   )
   @Export("sound")
   AbstractSound sound;
   @ObfuscatedName("l")
   @Export("active")
   volatile boolean active = true;

   protected PcmStream() {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("firstSubStream")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "()Laa;"
   )
   @Export("nextSubStream")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedName("r")
   protected abstract int vmethod5753();

   @ObfuscatedName("u")
   @Export("fill")
   protected abstract void fill(int[] var1, int var2, int var3);

   @ObfuscatedName("j")
   @Export("skip")
   protected abstract void skip(int var1);

   @ObfuscatedName("af")
   int vmethod1052() {
      return 255;
   }

   @ObfuscatedName("fb")
   @Export("update")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }
}
