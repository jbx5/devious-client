import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class297 {
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   @Export("js5Socket")
   static AbstractSocket js5Socket;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lde;"
   )
   UrlRequest field3407;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   SpritePixels field3406;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldk;)V"
   )
   class297(String var1, UrlRequester var2) {
      try {
         this.field3407 = var2.request(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field3407 = null;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Lde;)V"
   )
   class297(UrlRequest var1) {
      this.field3407 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)Lri;",
      garbageValue = "-100"
   )
   SpritePixels method5722() {
      if (this.field3406 == null && this.field3407 != null && this.field3407.isDone()) {
         if (this.field3407.getResponse() != null) {
            this.field3406 = KeyHandler.method394(this.field3407.getResponse());
         }

         this.field3407 = null;
      }

      return this.field3406;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1821514643"
   )
   public static int method5726(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ObfuscatedName("mx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "501827180"
   )
   @Export("findItemDefinitions")
   static void findItemDefinitions(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < WorldMapArchiveLoader.ItemDefinition_fileCount; ++var4) {
         ItemComposition var9 = MidiPcmStream.ItemDefinition_get(var4);
         if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
            if (var3 >= 250) {
               MilliClock.foundItemIdCount = -1;
               Players.foundItemIds = null;
               return;
            }

            if (var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      Players.foundItemIds = var2;
      FriendLoginUpdate.foundItemIndex = 0;
      MilliClock.foundItemIdCount = var3;
      String[] var8 = new String[MilliClock.foundItemIdCount];

      for(int var5 = 0; var5 < MilliClock.foundItemIdCount; ++var5) {
         var8[var5] = MidiPcmStream.ItemDefinition_get(var2[var5]).name;
      }

      UserList.method7442(var8, Players.foundItemIds);
   }
}
