import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class377 {
   @ObfuscatedName("mz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1486030117"
   )
   static void method7197() {
      if (NetFileRequest.field4144 != null) {
         Client.field793 = Client.cycle;
         NetFileRequest.field4144.method6538();

         for(int var0 = 0; var0 < Client.players.length; ++var0) {
            if (Client.players[var0] != null) {
               NetFileRequest.field4144.method6537(KeyHandler.baseX * 64 + (Client.players[var0].x >> 7), class158.baseY * 64 + (Client.players[var0].y >> 7));
            }
         }
      }

   }
}
