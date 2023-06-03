import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public abstract class class158 extends Node {
   @ObfuscatedName("wo")
   static List field1737;

   class158() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-986564571"
   )
   abstract void vmethod3370(Buffer var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgv;I)V",
      garbageValue = "1284013379"
   )
   abstract void vmethod3371(ClanChannel var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lmb;",
      garbageValue = "20"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = FriendSystem.getWidget(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
      }
   }
}
