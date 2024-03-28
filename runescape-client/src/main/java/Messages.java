import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("az")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -165356607
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnu;",
		garbageValue = "563384072"
	)
	static class363[] method2755() {
		return new class363[]{class363.field3974, class363.field3970};
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1807441736"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class243.widgetDefinition.loadInterface(var0)) {
			MusicPatchNode.field3599 = null;
			HttpResponse.drawInterface(class243.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (MusicPatchNode.field3599 != null) {
				HttpResponse.drawInterface(MusicPatchNode.field3599, -1412584499, var1, var2, var3, var4, class276.field3040, HealthBarDefinition.field2044, var7);
				MusicPatchNode.field3599 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
