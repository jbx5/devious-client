import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("DualNode")
public class DualNode extends Node {
   @ObfuscatedName("ez")
   @Export("keyDual")
   public long keyDual;
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("previousDual")
   public DualNode previousDual;
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("nextDual")
   public DualNode nextDual;

   @ObfuscatedName("ex")
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
