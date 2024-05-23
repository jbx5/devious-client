import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 938256667
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -883055079
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -887277437
	)
	public int field2509;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -731135151
	)
	public int field2512;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILir;I)Z",
		garbageValue = "75199510"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1927467814"
	)
	static void method4501(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnb;III)V",
		garbageValue = "-2133612165"
	)
	public static void method4504(Widget var0, int var1, int var2) {
		var0.field3902.bodyColors[var1] = var2;
		var0.field3902.method6576();
	}
}
