import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("a")
   @Export("args")
   Object[] args;
   @ObfuscatedName("f")
   @Export("isMouseInputEvent")
   boolean isMouseInputEvent;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1375689077
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 656689319
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1101809299
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1215320091
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1642276207
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("r")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1260467967
   )
   int field1053;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -346706651
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;B)V",
      garbageValue = "-126"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "853607495"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)V",
      garbageValue = "1405908190"
   )
   public void method2233(Widget var1) {
      this.widget = var1;
   }
}
