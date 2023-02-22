import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
   ApproximateRouteStrategy() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIILiz;B)Z",
      garbageValue = "1"
   )
   @Export("hasArrived")
   protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lej;",
      garbageValue = "-2100418601"
   )
   static class125 method1203(int var0) {
      class125 var1 = (class125)SpriteMask.findEnumerated(Occluder.method4564(), var0);
      if (var1 == null) {
         var1 = class125.field1490;
      }

      return var1;
   }

   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "92"
   )
   @Export("Widget_resetModelFrames")
   static final void Widget_resetModelFrames(int var0) {
      if (GrandExchangeEvent.loadInterface(var0)) {
         Widget[] var1 = class155.Widget_interfaceComponents[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }

      }
   }

   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "957157213"
   )
   static final void method1201(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      WorldMapSectionType.clientPreferences.updateSoundEffectVolume(var0);
   }

   @ObfuscatedName("nk")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "872602777"
   )
   static void method1202(String var0) {
      FontName.field4790 = var0;

      try {
         String var1 = class392.client.getParameter(Integer.toString(18));
         String var2 = class392.client.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class140.method3114(WorldMapSection2.method4844() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class26.method381(class392.client, "document.cookie=\"" + var3 + "\"");
      } catch (Throwable var4) {
      }

   }
}
