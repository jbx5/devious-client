import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class9 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Laf;"
   )
   public static final class9 field33 = new class9(0, "POST", true, true);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Laf;"
   )
   public static final class9 field36 = new class9(1, "GET", true, false);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Laf;"
   )
   static final class9 field32 = new class9(2, "PUT", false, true);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Laf;"
   )
   static final class9 field30 = new class9(3, "PATCH", false, true);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Laf;"
   )
   static final class9 field31 = new class9(4, "DELETE", false, true);
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1146958359
   )
   int field34;
   @ObfuscatedName("ab")
   String field35;
   @ObfuscatedName("ak")
   boolean field37;
   @ObfuscatedName("ae")
   boolean field38;

   class9(int var1, String var2, boolean var3, boolean var4) {
      this.field34 = var1;
      this.field35 = var2;
      this.field37 = var3;
      this.field38 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field34;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-54"
   )
   boolean method70() {
      return this.field37;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "95"
   )
   public String method82() {
      return this.field35;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-29965637"
   )
   boolean method68() {
      return this.field38;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "36"
   )
   static void method66() {
      Login.worldSelectOpen = false;
      Decimator.leftTitleSprite.drawAt(Login.xPadding, 0);
      Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
      class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18);
   }
}
