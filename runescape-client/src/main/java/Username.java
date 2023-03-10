import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
@Implements("Username")
public class Username implements Comparable {
   @ObfuscatedName("aj")
   @Export("name")
   String name;
   @ObfuscatedName("al")
   @Export("cleanName")
   String cleanName;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lrm;)V"
   )
   public Username(String var1, LoginType var2) {
      this.name = var1;
      this.cleanName = AbstractWorldMapIcon.method5295(var1, var2);
   }

   public Username(String var1) {
      this.name = var1;
      this.cleanName = AbstractWorldMapIcon.method5295(var1, LoginType.oldscape);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-69"
   )
   @Export("getName")
   public String getName() {
      return this.name;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1873877372"
   )
   public String method9223() {
      return this.cleanName;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "50"
   )
   @Export("hasCleanName")
   public boolean hasCleanName() {
      return this.cleanName != null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ltj;B)I",
      garbageValue = "-55"
   )
   @Export("compareToTyped")
   public int compareToTyped(Username var1) {
      if (this.cleanName == null) {
         return var1.cleanName == null ? 0 : 1;
      } else {
         return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else if (var2.cleanName == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.cleanName == null ? 0 : this.cleanName.hashCode();
   }

   public String toString() {
      return this.getName();
   }

   public int compareTo(Object var1) {
      return this.compareToTyped((Username)var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-918163875"
   )
   public static boolean method9220(int var0) {
      return var0 >= WorldMapDecorationType.field3721.id && var0 <= WorldMapDecorationType.field3729.id || var0 == WorldMapDecorationType.field3713.id;
   }
}
