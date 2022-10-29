import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class417 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lpn;"
   )
   public static final class417 field4602 = new class417("application/json");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpn;"
   )
   static final class417 field4601 = new class417("text/plain");
   @ObfuscatedName("c")
   String field4600;

   class417(String var1) {
      this.field4600 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2130326939"
   )
   public String method7779() {
      return this.field4600;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2076684423"
   )
   static int method7781() {
      return ++Messages.Messages_count - 1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-48"
   )
   @Export("isWorldMapEvent")
   public static boolean isWorldMapEvent(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }
}
