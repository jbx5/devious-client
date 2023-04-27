import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("Buddy")
public class Buddy extends User {
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 177258591
   )
   @Export("world")
   public int world = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1907692493
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1922414955
   )
   @Export("rank")
   public int rank;

   Buddy() {
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1994082485"
   )
   @Export("set")
   void set(int var1, int var2) {
      this.world = var1;
      this.int2 = var2;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-199616481"
   )
   @Export("getWorld")
   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1103584997"
   )
   @Export("hasWorld")
   public boolean hasWorld() {
      return this.world > 0;
   }
}
