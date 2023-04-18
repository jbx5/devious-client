import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("LoginPacket")
public class LoginPacket implements class285 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final LoginPacket field3344 = new LoginPacket(14, 0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   static final LoginPacket field3339 = new LoginPacket(15, 4);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final LoginPacket field3342 = new LoginPacket(16, -2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final LoginPacket field3341 = new LoginPacket(18, -2);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final LoginPacket field3338 = new LoginPacket(19, -2);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   static final LoginPacket field3343 = new LoginPacket(27, 0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Llf;"
   )
   @Export("LoginPacket_indexedValues")
   static final LoginPacket[] LoginPacket_indexedValues = new LoginPacket[32];
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 537668749
   )
   @Export("id")
   public final int id;

   static {
      LoginPacket[] var0 = class33.method504();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         LoginPacket_indexedValues[var0[var1].id] = var0[var1];
      }

   }

   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "0"
   )
   LoginPacket(int var1, int var2) {
      this.id = var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-496978963"
   )
   @Export("iLog")
   public static int iLog(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }
}
