import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1570670069
   )
   public int field4512 = (int)(WorldMapSection2.method4844() / 1000L);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("username")
   public Username username;
   @ObfuscatedName("ac")
   @Export("world")
   public short world;

   @ObfuscatedSignature(
      descriptor = "(Ltj;I)V"
   )
   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }
}
