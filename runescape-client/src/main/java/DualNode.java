import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("DualNode")
public class DualNode extends Node {
   @ObfuscatedName("de")
   @Export("keyDual")
   public long keyDual;
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Lpu;"
   )
   @Export("previousDual")
   public DualNode previousDual;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Lpu;"
   )
   @Export("nextDual")
   public DualNode nextDual;

   @ObfuscatedName("dj")
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
