import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("WorldMapID")
public class WorldMapID {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   static final WorldMapID field2926 = new WorldMapID(0);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   static final WorldMapID field2924 = new WorldMapID(1);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Loq;"
   )
   static Bounds field2925;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 445101105
   )
   @Export("value")
   final int value;

   WorldMapID(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      descriptor = "(Llx;Ljava/lang/String;B)V",
      garbageValue = "100"
   )
   static void method5166(Archive var0, String var1) {
      ArchiveLoader var2 = new ArchiveLoader(var0, var1);
      Client.archiveLoaders.add(var2);
      Client.field588 += var2.groupCount;
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "([Lkn;IIIZB)V",
      garbageValue = "-26"
   )
   @Export("resizeInterface")
   static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if (var6 != null && var6.parentId == var1) {
            WorldMapRectangle.alignWidgetSize(var6, var2, var3, var4);
            GrandExchangeOfferAgeComparator.alignWidgetPosition(var6, var2, var3);
            if (var6.scrollX > var6.scrollWidth - var6.width) {
               var6.scrollX = var6.scrollWidth - var6.width;
            }

            if (var6.scrollX < 0) {
               var6.scrollX = 0;
            }

            if (var6.scrollY > var6.scrollHeight - var6.height) {
               var6.scrollY = var6.scrollHeight - var6.height;
            }

            if (var6.scrollY < 0) {
               var6.scrollY = 0;
            }

            if (var6.type == 0) {
               class16.revalidateWidgetScroll(var0, var6, var4);
            }
         }
      }

   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIB)V",
      garbageValue = "-115"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (WorldMapManager.loadInterface(var0)) {
         UserComparator7.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
