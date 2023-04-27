import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 761297005
   )
   public int field4575 = (int)(class96.method2634() / 1000L);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("username")
   public Username username;
   @ObfuscatedName("aw")
   @Export("world")
   public short world;

   @ObfuscatedSignature(
      descriptor = "(Ltm;I)V"
   )
   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }
}
