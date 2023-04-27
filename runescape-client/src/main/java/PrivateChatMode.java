import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("PrivateChatMode")
public class PrivateChatMode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ltf;"
   )
   static final PrivateChatMode field5130 = new PrivateChatMode(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ltf;"
   )
   public static final PrivateChatMode field5128 = new PrivateChatMode(1);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ltf;"
   )
   static final PrivateChatMode field5129 = new PrivateChatMode(2);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1843384107
   )
   public final int field5131;

   PrivateChatMode(int var1) {
      this.field5131 = var1;
   }
}
