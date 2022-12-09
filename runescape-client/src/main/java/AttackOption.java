import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   @Export("AttackOption_dependsOnCombatLevels")
   AttackOption_dependsOnCombatLevels(0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   @Export("AttackOption_alwaysRightClick")
   AttackOption_alwaysRightClick(1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   field1347(2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   @Export("AttackOption_hidden")
   AttackOption_hidden(3),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   field1346(4);

   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      intValue = 1102902677
   )
   @Export("menuWidth")
   static int menuWidth;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1340490443
   )
   @Export("id")
   final int id;

   AttackOption(int var3) {
      this.id = var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "0"
   )
   static void method2603(Component var0) {
      var0.removeMouseListener(MouseHandler.MouseHandler_instance);
      var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)Lkd;",
      garbageValue = "-1318941452"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = PlayerCompositionColorTextureOverride.getWidget(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "82"
   )
   static int method2610(int var0) {
      return (int)Math.pow(2.0, (double)((float)var0 / 256.0F + 7.0F));
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(ILky;ZB)V",
      garbageValue = "2"
   )
   static void method2608(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = Client.getWorldMap().getMapArea(var0);
      int var4 = class155.localPlayer.plane;
      int var5 = class154.baseX * 64 + (class155.localPlayer.x >> 7);
      int var6 = class365.baseY * 64 + (class155.localPlayer.y >> 7);
      Coord var7 = new Coord(var4, var5, var6);
      Client.getWorldMap().method8046(var3, var7, var1, var2);
   }
}
