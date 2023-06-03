import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("ItemLayer")
public final class ItemLayer {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1143856465
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1182085607
   )
   @Export("x")
   int x;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 589700129
   )
   @Export("y")
   int y;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("first")
   Renderable first;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("second")
   Renderable second;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("third")
   Renderable third;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = -8754894451049670327L
   )
   @Export("tag")
   long tag;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1403585321
   )
   @Export("height")
   int height;

   ItemLayer() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/Socket;III)Lqz;",
      garbageValue = "-1830401415"
   )
   public static AbstractSocket method4271(Socket var0, int var1, int var2) throws IOException {
      return new BufferedNetSocket(var0, var1, var2);
   }
}
