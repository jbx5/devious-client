import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("aj")
   @Export("args")
   Object[] args;
   @ObfuscatedName("al")
   boolean field1046;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1215525673
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1595874415
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1303853145
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1590198513
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2089751377
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("ar")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1158325503
   )
   int field1051;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -948515929
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "-1270007973"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1638695958"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)V",
      garbageValue = "-376683317"
   )
   public void method2260(Widget var1) {
      this.widget = var1;
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "(Ldq;IB)V",
      garbageValue = "106"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      if (var0.field1196 >= Client.cycle) {
         int var2 = Math.max(1, var0.field1196 - Client.cycle);
         int var3 = var0.field1142 * -1172500480 + var0.field1192 * 128;
         int var4 = var0.field1142 * -1172500480 + var0.field1194 * 128;
         var0.x += (var3 - var0.x) / var2;
         var0.y += (var4 - var0.y) / var2;
         var0.field1214 = 0;
         var0.orientation = var0.field1162;
      } else if (var0.field1197 >= Client.cycle) {
         class6.method37(var0);
      } else {
         class18.method273(var0);
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1196 = 0;
         var0.field1197 = 0;
         var0.x = var0.field1142 * -1172500480 + var0.pathX[0] * 128;
         var0.y = var0.field1142 * -1172500480 + var0.pathY[0] * 128;
         var0.method2371();
      }

      if (BuddyRankComparator.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field1196 = 0;
         var0.field1197 = 0;
         var0.x = var0.field1142 * -1172500480 + var0.pathX[0] * 128;
         var0.y = var0.field1142 * -1172500480 + var0.pathY[0] * 128;
         var0.method2371();
      }

      MenuAction.method2054(var0);
      class13.method154(var0);
   }
}
