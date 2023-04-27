import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("Friend")
public class Friend extends Buddy {
   @ObfuscatedName("af")
   boolean field4571;
   @ObfuscatedName("an")
   boolean field4570;

   Friend() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpr;B)I",
      garbageValue = "78"
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
      } else if (this.field4571 && !var1.field4571) {
         return -1;
      } else if (!this.field4571 && var1.field4571) {
         return 1;
      } else if (this.field4570 && !var1.field4570) {
         return -1;
      } else if (!this.field4570 && var1.field4570) {
         return 1;
      } else {
         return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lpw;I)I",
      garbageValue = "1093536041"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareToFriend((Friend)var1);
   }

   public int compareTo(Object var1) {
      return this.compareToFriend((Friend)var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2040027942"
   )
   static void method7813() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1530842203"
   )
   static final void method7815() {
      Client.field608 = 0;
      int var0 = WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7);
      int var1 = GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7);
      if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         Client.field608 = 1;
      }

      if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         Client.field608 = 1;
      }

      if (Client.field608 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         Client.field608 = 0;
      }

   }

   @ObfuscatedName("lg")
   @ObfuscatedSignature(
      descriptor = "(IS)Ljava/lang/String;",
      garbageValue = "-635"
   )
   static String method7814(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
      }
   }
}
