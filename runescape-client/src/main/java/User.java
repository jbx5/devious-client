import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("User")
public class User implements Comparable {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lsi;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lsi;"
   )
   @Export("previousUsername")
   Username previousUsername;

   User() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Low;I)I",
      garbageValue = "1651786682"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.username.compareToTyped(var1.username);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lsi;",
      garbageValue = "-2138495450"
   )
   @Export("getUsername")
   public Username getUsername() {
      return this.username;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-118"
   )
   @Export("getName")
   public String getName() {
      return this.username == null ? "" : this.username.getName();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1030682980"
   )
   @Export("getPreviousName")
   public String getPreviousName() {
      return this.previousUsername == null ? "" : this.previousUsername.getName();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lsi;Lsi;I)V",
      garbageValue = "-794165536"
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
