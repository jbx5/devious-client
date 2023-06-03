import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("User")
public class User implements Comparable {
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lun;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lun;"
   )
   @Export("previousUsername")
   Username previousUsername;

   User() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lqm;I)I",
      garbageValue = "615597391"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.username.compareToTyped(var1.username);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)Lun;",
      garbageValue = "-830991264"
   )
   @Export("getUsername")
   public Username getUsername() {
      return this.username;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1410115840"
   )
   @Export("getName")
   public String getName() {
      return this.username == null ? "" : this.username.getName();
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "153403834"
   )
   @Export("getPreviousName")
   public String getPreviousName() {
      return this.previousUsername == null ? "" : this.previousUsername.getName();
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Lun;Lun;I)V",
      garbageValue = "635123380"
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
