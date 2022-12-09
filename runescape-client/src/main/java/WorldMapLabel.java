import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("WorldMapLabel")
public class WorldMapLabel {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;
   @ObfuscatedName("h")
   @Export("text")
   String text;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1395351999
   )
   @Export("width")
   int width;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1987376379
   )
   @Export("height")
   int height;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("size")
   WorldMapLabelSize size;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IILiq;)V"
   )
   WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
      this.text = var1;
      this.width = var2;
      this.height = var3;
      this.size = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(CLmb;B)I",
      garbageValue = "50"
   )
   @Export("lowercaseChar")
   static int lowercaseChar(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "([Lkd;II)V",
      garbageValue = "1544392799"
   )
   @Export("runComponentCloseListeners")
   static final void runComponentCloseListeners(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null) {
            if (var3.type == 0) {
               if (var3.children != null) {
                  runComponentCloseListeners(var3.children, var1);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  GrandExchangeOfferAgeComparator.runIntfCloseListeners(var4.group, var1);
               }
            }

            ScriptEvent var5;
            if (var1 == 0 && var3.onDialogAbort != null) {
               var5 = new ScriptEvent();
               var5.widget = var3;
               var5.args = var3.onDialogAbort;
               WorldMapElement.runScriptEvent(var5);
            }

            if (var1 == 1 && var3.onSubChange != null) {
               if (var3.childIndex >= 0) {
                  Widget var6 = PlayerCompositionColorTextureOverride.getWidget(var3.id);
                  if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
                     continue;
                  }
               }

               var5 = new ScriptEvent();
               var5.widget = var3;
               var5.args = var3.onSubChange;
               WorldMapElement.runScriptEvent(var5);
            }
         }
      }

   }
}
