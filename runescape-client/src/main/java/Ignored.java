import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("Ignored")
public class Ignored extends User {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -806382173
   )
   @Export("id")
   int id;

   Ignored() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Loh;B)I",
      garbageValue = "-79"
   )
   @Export("compareTo_ignored")
   int compareTo_ignored(Ignored var1) {
      return this.id - var1.id;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)I",
      garbageValue = "-1675254672"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareTo_ignored((Ignored)var1);
   }

   public int compareTo(Object var1) {
      return this.compareTo_ignored((Ignored)var1);
   }
}
