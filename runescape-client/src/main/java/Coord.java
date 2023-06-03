import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1090507503
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1382698897
   )
   @Export("x")
   public int x;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1961164759
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      descriptor = "(Lmg;)V"
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1713448260"
   )
   @Export("packed")
   public int packed() {
      int var2 = this.plane;
      int var3 = this.x;
      int var4 = this.y;
      int var1 = var2 << 28 | var3 << 14 | var4;
      return var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lmg;B)Z",
      garbageValue = "102"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "67"
   )
   @Export("toString")
   String toString(String var1) {
      return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
      }
   }

   public int hashCode() {
      return this.packed();
   }

   public String toString() {
      return this.toString(",");
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lcc;Lcc;IZI)I",
      garbageValue = "1531827462"
   )
   @Export("compareWorlds")
   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.population;
         int var5 = var1.population;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.location - var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (var2 == 4) {
         return var0.method1752() ? (var1.method1752() ? 0 : 1) : (var1.method1752() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1750() ? (var1.method1750() ? 0 : 1) : (var1.method1750() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
      } else {
         return var0.id - var1.id;
      }
   }
}
