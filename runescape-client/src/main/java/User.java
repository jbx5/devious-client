import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("User")
public class User implements Comparable {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("previousUsername")
   Username previousUsername;

   User() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lpw;I)I",
      garbageValue = "1093536041"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.username.compareToTyped(var1.username);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "473993579"
   )
   @Export("getUsername")
   public Username getUsername() {
      return this.username;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-238021346"
   )
   @Export("getName")
   public String getName() {
      return this.username == null ? "" : this.username.getName();
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-43557433"
   )
   @Export("getPreviousName")
   public String getPreviousName() {
      return this.previousUsername == null ? "" : this.previousUsername.getName();
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(Ltm;Ltm;B)V",
      garbageValue = "92"
   )
   @Export("set")
   void set(Username var1, Username var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.username = var1;
         this.previousUsername = var2;
      }
   }

   public int compareTo(Object var1) {
      return this.compareTo_user((User)var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "19082"
   )
   static void method7857(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         var1.remove();
      }
   }
}
