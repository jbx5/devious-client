import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
@Implements("PrivateChatMode")
public class PrivateChatMode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ltx;"
   )
   static final PrivateChatMode field5155 = new PrivateChatMode(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ltx;"
   )
   public static final PrivateChatMode field5154 = new PrivateChatMode(1);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ltx;"
   )
   static final PrivateChatMode field5153 = new PrivateChatMode(2);
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2050435039
   )
   public final int field5156;

   PrivateChatMode(int var1) {
      this.field5156 = var1;
   }
}
