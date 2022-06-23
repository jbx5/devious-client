import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.event.MouseWheelEvent;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.awt.event.MouseWheelListener;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("n")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class158 , MouseWheelListener {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 27869471)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V", garbageValue = "0")
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V", garbageValue = "-38")
	@Export("removeFrom")
	void removeFrom(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-105")
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