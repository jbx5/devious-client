import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("LoginType")
public class LoginType {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("oldscape")
   public static final LoginType oldscape = new LoginType(4, 0, "", "");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4783 = new LoginType(2, 1, "", "");
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4784 = new LoginType(5, 2, "", "");
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4785 = new LoginType(8, 3, "", "");
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4787 = new LoginType(7, 4, "", "");
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4791 = new LoginType(3, 5, "", "");
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4790 = new LoginType(1, 6, "", "");
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   static final LoginType field4789 = new LoginType(6, 7, "", "");
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   public static final LoginType field4788;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 635719311
   )
   public final int field4782;
   @ObfuscatedName("l")
   final String field4792;

   static {
      field4788 = new LoginType(0, -1, "", "", true, new LoginType[]{oldscape, field4783, field4784, field4787, field4785});
   }

   LoginType(int var1, int var2, String var3, String var4) {
      this.field4782 = var1;
      this.field4792 = var4;
   }

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lqu;)V"
   )
   LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
      this.field4782 = var1;
      this.field4792 = var4;
   }

   public String toString() {
      return this.field4792;
   }
}
