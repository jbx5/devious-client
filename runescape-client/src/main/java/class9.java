import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class9 implements MouseWheel {
   @ObfuscatedName("wf")
   static List field35;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   public static final class9 field45 = new class9(0, "POST", true, true);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   public static final class9 field39 = new class9(1, "GET", true, false);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   static final class9 field36 = new class9(2, "PUT", false, true);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   static final class9 field37 = new class9(3, "PATCH", false, true);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   static final class9 field46 = new class9(4, "DELETE", false, true);
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -2043788763
   )
   static int field44;
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = 1555915261
   )
   static int field43;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 985819831
   )
   int field34;
   @ObfuscatedName("aq")
   String field40;
   @ObfuscatedName("al")
   boolean field41;
   @ObfuscatedName("at")
   boolean field42;

   class9(int var1, String var2, boolean var3, boolean var4) {
      this.field34 = var1;
      this.field40 = var2;
      this.field41 = var3;
      this.field42 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field34;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "74"
   )
   boolean method77() {
      return this.field41;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-57"
   )
   public String method71() {
      return this.field40;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "142097256"
   )
   boolean method72() {
      return this.field42;
   }
}
