import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("f")
   @Export("args")
   Object[] args;
   @ObfuscatedName("w")
   @Export("isMouseInputEvent")
   boolean isMouseInputEvent;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -227463845
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1283983679
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1632865199
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1466980021
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -257259557
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("k")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1989980605
   )
   int field1071;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1561734475
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "710868309"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2059816970"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)V",
      garbageValue = "826217061"
   )
   public void method2313(Widget var1) {
      this.widget = var1;
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-48"
   )
   static void method2321(int var0, int var1) {
      if (PacketWriter.clientPreferences.method2495() != 0 && var0 != -1) {
         class148.method3216(MusicPatchNode.field3448, var0, 0, PacketWriter.clientPreferences.method2495(), false);
         Client.playingJingle = true;
      }

   }
}
