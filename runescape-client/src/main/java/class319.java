import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class319 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   static final class319 field3786 = new class319(51, 27, 800, 0, 16, 16);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   static final class319 field3782 = new class319(25, 28, 800, 656, 40, 40);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1826887281
   )
   final int field3783;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1882364867
   )
   final int field3784;

   class319(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3783 = var5;
      this.field3784 = var6;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)Lch;",
      garbageValue = "-20617"
   )
   static ClientPreferences method6375() {
      AccessFile var0 = null;
      ClientPreferences var1 = new ClientPreferences();

      try {
         var0 = class87.getPreferencesFile("", LoginPacket.field3302.name, false);
         byte[] var2 = new byte[(int)var0.length()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.read(var2, var3, var2.length - var3);
            if (var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new ClientPreferences(new Buffer(var2));
      } catch (Exception var6) {
      }

      try {
         if (var0 != null) {
            var0.close();
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1520113956"
   )
   static void method6378() {
      Messages.Messages_channels.clear();
      Messages.Messages_hashTable.clear();
      Messages.Messages_queue.clear();
      Messages.Messages_count = 0;
   }
}
