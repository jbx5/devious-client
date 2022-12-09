import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("LoginType")
public class LoginType {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   @Export("oldscape")
   public static final LoginType oldscape = new LoginType(7, 0, "", "");
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4829 = new LoginType(0, 1, "", "");
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4838 = new LoginType(6, 2, "", "");
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4832 = new LoginType(5, 3, "", "");
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4830 = new LoginType(8, 4, "", "");
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4834 = new LoginType(1, 5, "", "");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4835 = new LoginType(3, 6, "", "");
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   static final LoginType field4836 = new LoginType(2, 7, "", "");
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   public static final LoginType field4837;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2052296465
   )
   public final int field4833;
   @ObfuscatedName("j")
   final String field4839;

   static {
      field4837 = new LoginType(4, -1, "", "", true, new LoginType[]{oldscape, field4829, field4838, field4830, field4832});
   }

   LoginType(int var1, int var2, String var3, String var4) {
      this.field4833 = var1;
      this.field4839 = var4;
   }

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lqi;)V"
   )
   LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
      this.field4833 = var1;
      this.field4839 = var4;
   }

   public String toString() {
      return this.field4839;
   }
}
