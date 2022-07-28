import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.event.MouseWheelEvent;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.awt.event.MouseWheelListener;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("s")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class158 , MouseWheelListener {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 614796621)
	@Export("rotation")
	int rotation = 0;

	MouseWheelHandler() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V", garbageValue = "-1")
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V", garbageValue = "1539729870")
	@Export("removeFrom")
	void removeFrom(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2093530799")
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