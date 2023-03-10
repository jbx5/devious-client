import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("PrivateChatMode")
public class PrivateChatMode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ltg;"
   )
   static final PrivateChatMode field5037 = new PrivateChatMode(0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ltg;"
   )
   public static final PrivateChatMode field5040 = new PrivateChatMode(1);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltg;"
   )
   static final PrivateChatMode field5039 = new PrivateChatMode(2);
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1961695211
   )
   public final int field5038;

   PrivateChatMode(int var1) {
      this.field5038 = var1;
   }
}
