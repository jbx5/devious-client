import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1108724319
   )
   public int field4591 = (int)(BoundaryObject.method5027() / 1000L);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lun;"
   )
   @Export("username")
   public Username username;
   @ObfuscatedName("av")
   @Export("world")
   public short world;

   @ObfuscatedSignature(
      descriptor = "(Lun;I)V"
   )
   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;Lnq;B)V",
      garbageValue = "1"
   )
   public static void method7785(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      SequenceDefinition.SequenceDefinition_archive = var0;
      SequenceDefinition.SequenceDefinition_animationsArchive = var1;
      class305.SequenceDefinition_skeletonsArchive = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([FIFI)F",
      garbageValue = "-35912619"
   )
   static float method7784(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "119"
   )
   static int method7786() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
            var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
         }

         return var0 * 10000 / Client.field767;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-1"
   )
   @Export("selectSpell")
   static void selectSpell(int var0, int var1, int var2, int var3) {
      Widget var4 = class158.getWidgetChild(var0, var1);
      if (var4 != null && var4.onTargetEnter != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.onTargetEnter;
         Clock.runScriptEvent(var5);
      }

      Client.selectedSpellItemId = var3;
      Client.isSpellSelected = true;
      ScriptFrame.selectedSpellWidget = var0;
      Client.selectedSpellChildIndex = var1;
      class125.selectedSpellFlags = var2;
      Messages.invalidateWidget(var4);
   }
}
