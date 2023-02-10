import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "[Lrs;"
   )
   @Export("mapMarkerSprites")
   static SpritePixels[] mapMarkerSprites;
   @ObfuscatedName("f")
   @Export("reversed")
   final boolean reversed;

   public UserComparator6(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "138829352"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2095060599"
   )
   static final void method2973() {
      Decimator.method1115("You can't add yourself to your own friend list");
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-681916005"
   )
   @Export("Login_promptCredentials")
   static void Login_promptCredentials(boolean var0) {
      if (!Decimator.client.method1723() && !Decimator.client.method1218() && !Decimator.client.method1217()) {
         Login.Login_response1 = "";
         Login.Login_response2 = "Enter your username/email & password.";
         Login.Login_response3 = "";
         ReflectionCheck.method696(2);
         if (var0) {
            Login.Login_password = "";
         }

         FriendSystem.method1908();
         class361.method6967();
      } else {
         ReflectionCheck.method696(10);
      }
   }
}
