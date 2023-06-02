import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("at")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsv;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Los;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1554238267
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   static Archive field1377;
   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   @Export("textureProvider")
   static TextureProvider textureProvider;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lnn;",
      garbageValue = "1346140648"
   )
   static class343[] method2772() {
      return new class343[]{class343.field3838, class343.field3837};
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "55"
   )
   static void method2771() {
      if (Login.Login_username == null || Login.Login_username.length() <= 0) {
         if (class10.clientPreferences.method2529() != null) {
            Login.Login_username = class10.clientPreferences.method2529();
            Client.Login_isUsernameRemembered = true;
         } else {
            Client.Login_isUsernameRemembered = false;
         }

      }
   }

   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      descriptor = "(Lmb;I)V",
      garbageValue = "-648264388"
   )
   @Export("invalidateWidget")
   public static void invalidateWidget(Widget var0) {
      if (var0 != null && var0.cycle == Client.field722) {
         Client.field723[var0.rootIndex] = true;
      }

   }
}
