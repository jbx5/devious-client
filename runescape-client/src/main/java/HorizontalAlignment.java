import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	field2105(2, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	field2107(1, 2);

	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2096204705
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 91144155
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1950432637"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (AsyncRestClient.widgetDefinition.loadInterface(var0)) {
			class305.updateInterface(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
