import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("DualNode")
public class DualNode extends Node {
   @ObfuscatedName("eo")
   @Export("keyDual")
   public long keyDual;
   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("previousDual")
   public DualNode previousDual;
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   @Export("nextDual")
   public DualNode nextDual;

   @ObfuscatedName("ey")
   @Export("removeDual")
   public void removeDual() {
      if (this.nextDual != null) {
         this.nextDual.previousDual = this.previousDual;
         this.previousDual.nextDual = this.nextDual;
         this.previousDual = null;
         this.nextDual = null;
      }
   }
}
