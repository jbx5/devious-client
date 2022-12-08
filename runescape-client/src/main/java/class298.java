import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class298 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1940747343
   )
   public int field3454;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1875649367
   )
   public int field3456;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -10528687
   )
   public int field3455;

   class298() {
   }

   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "-578583912"
   )
   @Export("findItemDefinitions")
   static void findItemDefinitions(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
         ItemComposition var9 = NPCComposition.ItemDefinition_get(var4);
         if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
            if (var3 >= 250) {
               ScriptEvent.foundItemIdCount = -1;
               class19.foundItemIds = null;
               return;
            }

            if (var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      class19.foundItemIds = var2;
      UserComparator6.foundItemIndex = 0;
      ScriptEvent.foundItemIdCount = var3;
      String[] var8 = new String[ScriptEvent.foundItemIdCount];

      for(int var5 = 0; var5 < ScriptEvent.foundItemIdCount; ++var5) {
         var8[var5] = NPCComposition.ItemDefinition_get(var2[var5]).name;
      }

      short[] var10 = class19.foundItemIds;
      class82.sortItemsByName(var8, var10, 0, var8.length - 1);
   }
}
