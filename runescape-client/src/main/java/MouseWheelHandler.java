import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class170, MouseWheelListener {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2073284289
   )
   @Export("rotation")
   int rotation = 0;

   MouseWheelHandler() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-708063290"
   )
   @Export("addTo")
   void addTo(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;S)V",
      garbageValue = "29424"
   )
   void method308(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "47"
   )
   @Export("useRotation")
   public synchronized int useRotation() {
      int var1 = this.rotation;
      this.rotation = 0;
      return var1;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.rotation += var1.getWheelRotation();
   }
}
