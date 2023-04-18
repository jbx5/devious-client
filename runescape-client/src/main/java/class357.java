import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class357 {
   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("WorldMapElement_fonts")
   static Fonts WorldMapElement_fonts;

   static {
      new HashMap();
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(Ldi;ZI)V",
      garbageValue = "1366698381"
   )
   @Export("closeInterface")
   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var2 = var0.group;
      int var3 = (int)var0.key;
      var0.remove();
      if (var1 && var2 != -1 && class264.Widget_loadedInterfaces[var2]) {
         UserComparator3.Widget_archive.clearFilesGroup(var2);
         if (VerticalAlignment.Widget_interfaceComponents[var2] != null) {
            for(int var4 = 0; var4 < VerticalAlignment.Widget_interfaceComponents[var2].length; ++var4) {
               if (VerticalAlignment.Widget_interfaceComponents[var2][var4] != null) {
                  VerticalAlignment.Widget_interfaceComponents[var2][var4] = null;
               }
            }

            VerticalAlignment.Widget_interfaceComponents[var2] = null;
            class264.Widget_loadedInterfaces[var2] = false;
         }
      }

      for(IntegerNode var5 = (IntegerNode)Client.widgetFlags.first(); var5 != null; var5 = (IntegerNode)Client.widgetFlags.next()) {
         if ((var5.key >> 48 & 65535L) == (long)var2) {
            var5.remove();
         }
      }

      Widget var6 = class165.getWidget(var3);
      if (var6 != null) {
         class144.invalidateWidget(var6);
      }

      if (Client.rootInterface != -1) {
         class127.runIntfCloseListeners(Client.rootInterface, 1);
      }

   }
}
