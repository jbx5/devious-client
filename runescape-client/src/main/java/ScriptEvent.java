import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("vk")
   @ObfuscatedGetter(
      intValue = 876280679
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   @ObfuscatedName("h")
   @Export("args")
   Object[] args;
   @ObfuscatedName("e")
   @Export("isMouseInputEvent")
   boolean isMouseInputEvent;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1516520981
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 318715241
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2003088619
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1106115125
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 887616203
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("b")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1236564413
   )
   int field1084;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -646126757
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "1401633518"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "791254847"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkd;B)V",
      garbageValue = "-122"
   )
   public void method2255(Widget var1) {
      this.widget = var1;
   }
}
