import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("Buddy")
public class Buddy extends User {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 931114561
   )
   @Export("world")
   public int world = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 143588407
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -235745213
   )
   @Export("rank")
   public int rank;

   Buddy() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "350597562"
   )
   @Export("set")
   void set(int var1, int var2) {
      this.world = var1;
      this.int2 = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-56"
   )
   @Export("getWorld")
   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1851366387"
   )
   @Export("hasWorld")
   public boolean hasWorld() {
      return this.world > 0;
   }
}
