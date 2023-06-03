import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lby;"
   )
   @Export("after")
   PcmStream after;
   @ObfuscatedName("ar")
   int field353;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lcr;"
   )
   @Export("sound")
   AbstractSound sound;
   @ObfuscatedName("az")
   @Export("active")
   volatile boolean active = true;

   protected PcmStream() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Lby;"
   )
   @Export("firstSubStream")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lby;"
   )
   @Export("nextSubStream")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedName("ak")
   protected abstract int vmethod5920();

   @ObfuscatedName("ae")
   @Export("fill")
   protected abstract void fill(int[] var1, int var2, int var3);

   @ObfuscatedName("ao")
   @Export("skip")
   protected abstract void skip(int var1);

   @ObfuscatedName("bz")
   int vmethod1017() {
      return 255;
   }

   @ObfuscatedName("fy")
   @Export("update")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }
}
