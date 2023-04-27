import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class186 {
   @ObfuscatedName("ac")
   @Export("Tiles_underlays")
   static short[][][] Tiles_underlays;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/Socket;III)Lph;",
      garbageValue = "-1524300276"
   )
   public static AbstractSocket method3731(Socket var0, int var1, int var2) throws IOException {
      return new BufferedNetSocket(var0, var1, var2);
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)Z",
      garbageValue = "65"
   )
   static final boolean method3736(int var0, int var1, int var2, int var3, int var4) {
      PendingSpawn var5 = null;

      for(PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) {
            var5 = var6;
            break;
         }
      }

      if (var5 != null) {
         var5.field1135 = var4;
         return true;
      } else {
         return false;
      }
   }
}
