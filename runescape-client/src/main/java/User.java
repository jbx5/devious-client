import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("User")
public class User implements Comparable {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("previousUsername")
   Username previousUsername;

   User() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)I",
      garbageValue = "-691594669"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.username.compareToTyped(var1.username);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(S)Ltj;",
      garbageValue = "4259"
   )
   @Export("getUsername")
   public Username getUsername() {
      return this.username;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1023647096"
   )
   @Export("getName")
   public String getName() {
      return this.username == null ? "" : this.username.getName();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1909143712"
   )
   @Export("getPreviousName")
   public String getPreviousName() {
      return this.previousUsername == null ? "" : this.previousUsername.getName();
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(Ltj;Ltj;S)V",
      garbageValue = "-1955"
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
}
