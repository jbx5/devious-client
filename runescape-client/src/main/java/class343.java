import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class343 {
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1779124077
   )
   static int field4234;

   static {
      new HashMap();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-1118495656"
   )
   @Export("hashString")
   public static int hashString(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + PacketWriter.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }
}
