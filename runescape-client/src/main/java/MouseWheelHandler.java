import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class174, MouseWheelListener {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -64651111
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "2110290044"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-945995629"
	)
	void method300(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "496669737"
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
