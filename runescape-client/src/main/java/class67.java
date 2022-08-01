import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.net.MalformedURLException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
@ObfuscatedName("bx")
public class class67 {
	@ObfuscatedName("o")
	static final BigInteger field889 = new BigInteger("10001", 16);

	@ObfuscatedName("q")
	static final BigInteger field888 = new BigInteger("824f2de2a0dd6d85b44b801f7518e6cef7eacec0a14284cbab75c2ac2cf34d2c942efb3604fea616fbf370136562a38ede7136a51e37889c49ab1883910b0296731625bb64164f6f0caf48dc72e22612513ad3576daae73c5c9a1b27d7cbffd7ad60f1de62d8526ce9d17a33ec709e3d620b704d37806701c88b1ddd5057dd5f", 16);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z", garbageValue = "490839558")
	static boolean method1937(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Lfl;", garbageValue = "-2015643594")
	public static Clock method1934() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2090684925")
	static void method1935(int var0) {
		UserComparator6.method2701(14);
		Login.field906 = var0;
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1350013121")
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field714 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}
		if (MouseRecorder.getWindowedMode() == 1) {
			class329.client.setMaxCanvasSize(765, 503);
		} else {
			class329.client.setMaxCanvasSize(7680, 2160);
		}
		if (Client.gameState >= 25) {
			Calendar.method5510();
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(descriptor = "(Lku;I)I", garbageValue = "314063878")
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = ((IntegerNode) (Client.widgetFlags.get((((long) (var0.id)) << 32) + ((long) (var0.childIndex)))));
		return var1 != null ? var1.integer : var0.flags;
	}
}