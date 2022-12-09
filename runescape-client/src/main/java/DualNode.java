import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("DualNode")
public class DualNode extends Node {
   @ObfuscatedName("dw")
   @Export("keyDual")
   public long keyDual;
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   @Export("previousDual")
   public DualNode previousDual;
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   @Export("nextDual")
   public DualNode nextDual;

   @ObfuscatedName("do")
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
