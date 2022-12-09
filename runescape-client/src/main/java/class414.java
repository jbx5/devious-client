import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class414 implements class419 {
   @ObfuscatedName("m")
   @Export("SpriteBuffer_yOffsets")
   public static int[] SpriteBuffer_yOffsets;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = -1436966015
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   public final class444 field4644;

   @ObfuscatedSignature(
      descriptor = "(Lqc;)V"
   )
   class414(class445 var1) {
      this.field4644 = var1;
   }

   @ObfuscatedSignature(
      descriptor = "(Lor;)V"
   )
   public class414(class415 var1) {
      this(new class445(var1));
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-99"
   )
   public int method7867(int var1) {
      return this.field4644.vmethod8265(var1);
   }
}
