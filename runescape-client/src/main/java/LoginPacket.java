import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("LoginPacket")
public class LoginPacket implements class278 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final LoginPacket field3317 = new LoginPacket(14, 0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   static final LoginPacket field3311 = new LoginPacket(15, 4);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final LoginPacket field3310 = new LoginPacket(16, -2);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final LoginPacket field3309 = new LoginPacket(18, -2);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   public static final LoginPacket field3312 = new LoginPacket(19, -2);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   static final LoginPacket field3316 = new LoginPacket(27, 0);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "[Ljw;"
   )
   @Export("LoginPacket_indexedValues")
   static final LoginPacket[] LoginPacket_indexedValues = new LoginPacket[32];
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 360020071
   )
   @Export("id")
   public final int id;

   static {
      LoginPacket[] var0 = Canvas.method325();

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
}
