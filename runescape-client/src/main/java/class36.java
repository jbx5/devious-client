import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class36 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)Lta;",
		garbageValue = "-623405073"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return AuthenticationScheme.platformInfo;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-262430797"
	)
	static final void method695(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.field1268 * 128 + var0.field1220 * 64;
		int var3 = var0.field1228 * 128 + var0.field1220 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1263 = 0;
		var0.orientation = var0.field1223;
	}
}
