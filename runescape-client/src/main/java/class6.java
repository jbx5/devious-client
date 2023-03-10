import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public enum class6 implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lav;"
   )
   field17(0, 0);

   @ObfuscatedName("vj")
   @ObfuscatedSignature(
      descriptor = "Lcg;"
   )
   @Export("friendSystem")
   public static FriendSystem friendSystem;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1264699077
   )
   public final int field12;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2005850647
   )
   final int field14;

   class6(int var3, int var4) {
      this.field12 = var3;
      this.field14 = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field14;
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      descriptor = "(Ldq;I)V",
      garbageValue = "-297345560"
   )
   static final void method37(Actor var0) {
      boolean var1 = var0.field1197 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
      if (!var1) {
         SequenceDefinition var2 = Coord.SequenceDefinition_get(var0.sequence);
         if (var2 != null && !var2.isCachedModelIdSet()) {
            var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
         } else {
            var1 = true;
         }
      }

      if (var1) {
         int var8 = var0.field1197 - var0.field1196;
         int var3 = Client.cycle - var0.field1196;
         int var4 = var0.field1142 * -1172500480 + var0.field1192 * 128;
         int var5 = var0.field1142 * -1172500480 + var0.field1194 * 128;
         int var6 = var0.field1142 * -1172500480 + var0.field1202 * 128;
         int var7 = var0.field1142 * -1172500480 + var0.field1195 * 128;
         var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8;
         var0.y = (var7 * var3 + var5 * (var8 - var3)) / var8;
      }

      var0.field1214 = 0;
      var0.orientation = var0.field1162;
      var0.rotation = var0.orientation;
   }

   @ObfuscatedName("lh")
   @ObfuscatedSignature(
      descriptor = "([Lmy;IB)V",
      garbageValue = "2"
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
                  NPCComposition.runIntfCloseListeners(var4.group, var1);
               }
            }

            ScriptEvent var5;
            if (var1 == 0 && var3.onDialogAbort != null) {
               var5 = new ScriptEvent();
               var5.widget = var3;
               var5.args = var3.onDialogAbort;
               class9.runScriptEvent(var5);
            }

            if (var1 == 1 && var3.onSubChange != null) {
               if (var3.childIndex >= 0) {
                  Widget var6 = WorldMapSection1.getWidget(var3.id);
                  if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
                     continue;
                  }
               }

               var5 = new ScriptEvent();
               var5.widget = var3;
               var5.args = var3.onSubChange;
               class9.runScriptEvent(var5);
            }
         }
      }

   }
}
