import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("uw")
   @ObfuscatedGetter(
      intValue = -1829847369
   )
   static int field1041;
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("Widget_spritesArchive")
   static AbstractArchive Widget_spritesArchive;
   @ObfuscatedName("af")
   @Export("args")
   Object[] args;
   @ObfuscatedName("an")
   boolean field1039;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1266615561
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 650213389
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 684782445
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -2125751633
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -19398649
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("aa")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1071155047
   )
   int field1049;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 937869311
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "1592193051"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-715457953"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lmq;B)V",
      garbageValue = "46"
   )
   public void method2256(Widget var1) {
      this.widget = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-404046027"
   )
   public static boolean method2258(int var0) {
      return (var0 >> 21 & 1) != 0;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Object;",
      garbageValue = "140297466"
   )
   static Object method2253(int var0) {
      return Language.method6940((class478)StructComposition.findEnumerated(class478.method8889(), var0));
   }
}
