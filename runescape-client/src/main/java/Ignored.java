import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("Ignored")
public class Ignored extends User {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2121273223
   )
   @Export("id")
   int id;

   Ignored() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpc;I)I",
      garbageValue = "-355712816"
   )
   @Export("compareTo_ignored")
   int compareTo_ignored(Ignored var1) {
      return this.id - var1.id;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)I",
      garbageValue = "-691594669"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareTo_ignored((Ignored)var1);
   }

   public int compareTo(Object var1) {
      return this.compareTo_ignored((Ignored)var1);
   }
}
