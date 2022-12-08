import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("ItemContainer")
public class ItemContainer extends Node {
   @ObfuscatedName("vm")
   @ObfuscatedSignature(
      descriptor = "Llr;"
   )
   @Export("grandExchangeEvents")
   static GrandExchangeEvents grandExchangeEvents;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("itemContainers")
   static NodeHashTable itemContainers = new NodeHashTable(32);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Laj;"
   )
   @Export("soundCache")
   static SoundCache soundCache;
   @ObfuscatedName("e")
   @Export("ids")
   int[] ids = new int[]{-1};
   @ObfuscatedName("v")
   @Export("quantities")
   int[] quantities = new int[]{0};

   ItemContainer() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "2077206502"
   )
   @Export("ByteArrayPool_getArray")
   public static synchronized byte[] ByteArrayPool_getArray(int var0) {
      return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[IB)V",
      garbageValue = "1"
   )
   public static void method2237(String[] var0, int[] var1) {
      WorldMapID.method5277(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "([Lkd;IIIZI)V",
      garbageValue = "-476895760"
   )
   @Export("resizeInterface")
   static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if (var6 != null && var6.parentId == var1) {
            Player.alignWidgetSize(var6, var2, var3, var4);
            class89.alignWidgetPosition(var6, var2, var3);
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
               class169.revalidateWidgetScroll(var0, var6, var4);
            }
         }
      }

   }
}
