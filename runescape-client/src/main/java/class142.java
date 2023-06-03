import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class142 extends Node {
   class142() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   abstract void vmethod3381(Buffer var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   abstract void vmethod3382(ClanSettings var1);

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1403198759"
   )
   static boolean method3125() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         while(Client.archiveLoadersDone < Client.archiveLoaders.size()) {
            ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
            if (!var0.isLoaded()) {
               return false;
            }

            ++Client.archiveLoadersDone;
         }

         return true;
      } else {
         return true;
      }
   }
}
