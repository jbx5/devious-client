import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class165, MouseWheelListener {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -300135297
   )
   @Export("rotation")
   int rotation = 0;

   MouseWheelHandler() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-437230041"
   )
   @Export("addTo")
   void addTo(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "76"
   )
   void method308(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-957429257"
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
