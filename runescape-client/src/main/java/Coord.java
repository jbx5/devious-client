import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -113644749
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -96298701
   )
   @Export("x")
   public int x;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -2105445199
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      descriptor = "(Llb;)V"
   )
   public Coord(Coord var1) {
      this.plane = var1.plane;
      this.x = var1.x;
      this.y = var1.y;
   }

   public Coord(int var1, int var2, int var3) {
      this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.plane = -1;
      } else {
         this.plane = var1 >> 28 & 3;
         this.x = var1 >> 14 & 16383;
         this.y = var1 & 16383;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-964267539"
   )
   @Export("packed")
   public int packed() {
      return class282.method5681(this.plane, this.x, this.y);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Llb;I)Z",
      garbageValue = "1151983823"
   )
   @Export("equalsCoord")
   boolean equalsCoord(Coord var1) {
      if (this.plane != var1.plane) {
         return false;
      } else if (this.x != var1.x) {
         return false;
      } else {
         return this.y == var1.y;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1584874808"
   )
   @Export("toString")
   String toString(String var1) {
      return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   public String toString() {
      return this.toString(",");
   }

   public int hashCode() {
      return this.packed();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
      }
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-752126204"
   )
   static final void method6022() {
      if (GraphicsObject.ClanChat_inClanChat) {
         if (UserComparator5.friendsChat != null) {
            UserComparator5.friendsChat.sort();
         }

         for(int var0 = 0; var0 < Players.Players_count; ++var0) {
            Player var1 = Client.players[Players.Players_indices[var0]];
            var1.clearIsInFriendsChat();
         }

         GraphicsObject.ClanChat_inClanChat = false;
      }

   }
}
