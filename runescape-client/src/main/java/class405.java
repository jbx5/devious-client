import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class405 extends RuntimeException {
	public class405(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-307106946"
	)
	static void method7552(int var0, int var1) {
		if (class93.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(WorldMapDecoration.field2627, var0, 0, class93.clientPreferences.getMusicVolume(), false));
			LoginScreenAnimation.method2528(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "1875510126"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
