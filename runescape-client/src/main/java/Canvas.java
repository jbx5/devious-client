import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("z")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
   @ObfuscatedName("r")
   @Export("Tiles_underlays")
   static byte[][][] Tiles_underlays;
   @ObfuscatedName("h")
   @Export("component")
   Component component;

   Canvas(Component var1) {
      this.component = var1;
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }
}
