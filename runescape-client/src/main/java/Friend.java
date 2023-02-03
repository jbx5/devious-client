import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("Friend")
public class Friend extends Buddy {
   @ObfuscatedName("f")
   boolean field4553;
   @ObfuscatedName("w")
   boolean field4552;

   Friend() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lol;I)I",
      garbageValue = "-1263388841"
   )
   @Export("compareToFriend")
   int compareToFriend(Friend var1) {
      if (super.world == Client.worldId && Client.worldId != var1.world) {
         return -1;
      } else if (Client.worldId == var1.world && super.world != Client.worldId) {
         return 1;
      } else if (super.world != 0 && var1.world == 0) {
         return -1;
      } else if (var1.world != 0 && super.world == 0) {
         return 1;
      } else if (this.field4553 && !var1.field4553) {
         return -1;
      } else if (!this.field4553 && var1.field4553) {
         return 1;
      } else if (this.field4552 && !var1.field4552) {
         return -1;
      } else if (!this.field4552 && var1.field4552) {
         return 1;
      } else {
         return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Low;I)I",
      garbageValue = "1651786682"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareToFriend((Friend)var1);
   }

   public int compareTo(Object var1) {
      return this.compareToFriend((Friend)var1);
   }
}
