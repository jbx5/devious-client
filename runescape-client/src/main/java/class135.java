import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public enum class135 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1618(2, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1615(1, 1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1621(0, 2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1617(3, 3),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   field1619(4, 4);

   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1915854149
   )
   public final int field1620;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -601050455
   )
   @Export("id")
   final int id;

   class135(int var3, int var4) {
      this.field1620 = var3;
      this.id = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "([Lmq;IIIZI)V",
      garbageValue = "1809081725"
   )
   @Export("resizeInterface")
   static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if (var6 != null && var6.parentId == var1) {
            class158.alignWidgetSize(var6, var2, var3, var4);
            class192.alignWidgetPosition(var6, var2, var3);
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
               WallDecoration.revalidateWidgetScroll(var0, var6, var4);
            }
         }
      }

   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   static final void method3182(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class20.clientPreferences.method2464(var0);
   }
}
