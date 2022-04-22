import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class158 , MouseWheelListener {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1835748205)

	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/awt/Component;I)V", garbageValue = 
	"-577945862")

	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/awt/Component;I)V", garbageValue = 
	"1462071319")

	@Export("removeFrom")
	void removeFrom(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"34380601")

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