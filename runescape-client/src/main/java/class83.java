import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class83 {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1547899473
   )
   static int field1035;

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;I)Z",
      garbageValue = "2091247209"
   )
   static boolean method2253(Date var0) {
      Date var1 = WorldMapSection0.method5182();
      return var0.after(var1);
   }

   @ObfuscatedName("nt")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "3"
   )
   public static boolean method2254() {
      return Client.clickedWidget != null;
   }
}
