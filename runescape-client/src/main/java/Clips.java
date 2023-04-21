import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class Clips {
   @ObfuscatedName("ou")
   @ObfuscatedGetter(
      intValue = 96656415
   )
   @Export("selectedSpellWidget")
   static int selectedSpellWidget;
   @ObfuscatedName("af")
   boolean field2798 = false;
   @ObfuscatedName("an")
   public boolean field2789 = true;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 918495667
   )
   int field2788 = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1734758735
   )
   public int viewportZoom = 512;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljq;"
   )
   @Export("Rasterizer3D_textureLoader")
   public TextureLoader Rasterizer3D_textureLoader;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 93675259
   )
   int field2795;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1666539507
   )
   int field2793;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 571147771
   )
   int field2797;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1347859351
   )
   int field2796;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1346890391
   )
   @Export("clipNegativeMidX")
   int clipNegativeMidX;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1643027043
   )
   int field2800;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1380452969
   )
   @Export("clipNegativeMidY")
   int clipNegativeMidY;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1145780727
   )
   int field2802;
   @ObfuscatedName("aj")
   @Export("Rasterizer3D_rowOffsets")
   int[] Rasterizer3D_rowOffsets = new int[1024];

   Clips() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-36"
   )
   void method4943() {
      this.field2795 = this.field2797 / 2;
      this.field2793 = this.field2796 / 2;
      this.clipNegativeMidX = -(this.field2795 * 1684654809) * -1346890391;
      this.field2800 = this.field2797 - this.field2795;
      this.clipNegativeMidY = -(this.field2793 * -2109856295) * 1380452969;
      this.field2802 = this.field2796 - this.field2793;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "93"
   )
   void method4944(int var1, int var2, int var3, int var4) {
      this.field2795 = var1 - var2;
      this.field2793 = var3 - var4;
      this.clipNegativeMidX = -(this.field2795 * 1684654809) * -1346890391;
      this.field2800 = this.field2797 - this.field2795;
      this.clipNegativeMidY = -(this.field2793 * -2109856295) * 1380452969;
      this.field2802 = this.field2796 - this.field2793;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "707163939"
   )
   void method4948(int var1, int var2, int var3) {
      this.field2798 = var1 < 0 || var1 > this.field2797 || var2 < 0 || var2 > this.field2797 || var3 < 0 || var3 > this.field2797;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILqk;Lnd;I)V",
      garbageValue = "-35309556"
   )
   static void method4951(int var0, ArchiveDisk var1, Archive var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 1;
      var3.key = (long)var0;
      var3.archiveDisk = var1;
      var3.archive = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      class124.method3057();
   }
}
