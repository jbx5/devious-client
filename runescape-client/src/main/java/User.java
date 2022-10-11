import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("User")
public class User implements Comparable {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("previousUsername")
   Username previousUsername;

   User() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)I",
      garbageValue = "-1675254672"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.username.compareToTyped(var1.username);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Lrg;",
      garbageValue = "76"
   )
   @Export("getUsername")
   public Username getUsername() {
      return this.username;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-81"
   )
   @Export("getName")
   public String getName() {
      return this.username == null ? "" : this.username.getName();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "27"
   )
   @Export("getPreviousName")
   public String getPreviousName() {
      return this.previousUsername == null ? "" : this.previousUsername.getName();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lrg;Lrg;I)V",
      garbageValue = "831427433"
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
