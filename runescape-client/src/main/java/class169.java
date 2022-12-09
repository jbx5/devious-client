import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class169 {
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   static Buffer field1878;
   @ObfuscatedName("x")
   public String field1872;
   @ObfuscatedName("m")
   public float[] field1873;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 720482137
   )
   public int field1876;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1649159583
   )
   public int field1877;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1446707269
   )
   public int field1875;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   final class163 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfk;)V"
   )
   class169(class163 var1) {
      this.this$0 = var1;
      this.field1873 = new float[4];
      this.field1876 = 1;
      this.field1877 = 1;
      this.field1875 = 0;
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   @Export("playSong")
   static void playSong(int var0) {
      if (var0 == -1 && !Client.playingJingle) {
         class6.method39();
      } else if (var0 != -1 && var0 != Client.currentTrackGroupId && StructComposition.clientPreferences.method2425() != 0 && !Client.playingJingle) {
         Archive var1 = class162.archive6;
         int var2 = StructComposition.clientPreferences.method2425();
         class286.musicPlayerStatus = 1;
         class304.musicTrackArchive = var1;
         class109.musicTrackGroupId = var0;
         class286.musicTrackFileId = 0;
         class467.musicTrackVolume = var2;
         class145.musicTrackBoolean = false;
         class286.pcmSampleLength = 2;
      }

      Client.currentTrackGroupId = var0;
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "([Lkd;Lkd;ZI)V",
      garbageValue = "2119865006"
   )
   @Export("revalidateWidgetScroll")
   static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
      int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
      int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
      ItemContainer.resizeInterface(var0, var1.id, var3, var4, var2);
      if (var1.children != null) {
         ItemContainer.resizeInterface(var1.children, var1.id, var3, var4, var2);
      }

      InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
      if (var5 != null) {
         ByteArrayPool.method7319(var5.group, var3, var4, var2);
      }

      if (var1.contentType == 1337) {
      }

   }

   @ObfuscatedName("me")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "66"
   )
   static final void method3484() {
      for(int var0 = 0; var0 < Players.Players_count; ++var0) {
         Player var1 = Client.players[Players.Players_indices[var0]];
         var1.clearIsInFriendsChat();
      }

   }
}
