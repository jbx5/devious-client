import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public enum class124 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1535(0, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1528(1, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1529(2, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1536(3, 3),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1531(4, 4);

   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 324015279
   )
   final int field1532;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1800983085
   )
   final int field1530;

   class124(int var3, int var4) {
      this.field1532 = var3;
      this.field1530 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1530;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1048113560"
   )
   static void method2939(boolean var0) {
      byte var1 = 0;
      boolean var2 = StructComposition.clientPreferences.method2424() >= Client.field511;
      if (!var2) {
         var1 = 12;
      } else if (BuddyRankComparator.client.method1230() || BuddyRankComparator.client.method1231()) {
         var1 = 10;
      }

      class12.method155(var1);
      if (var0) {
         Login.Login_username = "";
         Login.Login_password = "";
         class143.field1697 = 0;
         class141.otp = "";
      }

      GameObject.method4831();
      SoundSystem.method873();
   }
}
