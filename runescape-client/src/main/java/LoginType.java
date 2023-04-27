import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("LoginType")
public class LoginType {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   @Export("oldscape")
   public static final LoginType oldscape = new LoginType(4, 0, "", "");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4907 = new LoginType(6, 1, "", "");
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4909 = new LoginType(3, 2, "", "");
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4910 = new LoginType(8, 3, "", "");
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4906 = new LoginType(7, 4, "", "");
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4911 = new LoginType(5, 5, "", "");
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4912 = new LoginType(2, 6, "", "");
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   static final LoginType field4913 = new LoginType(1, 7, "", "");
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   public static final LoginType field4914;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -874502107
   )
   final int field4915;
   @ObfuscatedName("ay")
   final String field4916;

   static {
      field4914 = new LoginType(0, -1, "", "", true, new LoginType[]{oldscape, field4907, field4909, field4906, field4910});
   }

   LoginType(int var1, int var2, String var3, String var4) {
      this.field4915 = var1;
      this.field4916 = var4;
   }

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsw;)V"
   )
   LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
      this.field4915 = var1;
      this.field4916 = var4;
   }

   public String toString() {
      return this.field4916;
   }
}
