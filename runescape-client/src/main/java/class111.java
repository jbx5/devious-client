import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
final class class111 implements class352 {
	@ObfuscatedName("jp")
	static int[] field1427;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	class111(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	public void vmethod6836() {
		if (this.val$cc != null && this.val$cc.method7271().field3786 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2511(this.val$cc);
			var1.setArgs(this.val$cc.method7271().field3786);
			class195.method4014().addFirst(var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1274550337"
	)
	static void method2994() {
		class442.Tiles_underlays = null;
		AbstractByteArrayCopier.Tiles_overlays = null;
		UserComparator2.Tiles_shapes = null;
		Tiles.field1065 = null;
		SoundSystem.field294 = null;
		TriBool.Tiles_underlays2 = null;
		class512.field5171 = null;
		class328.Tiles_hue = null;
		HealthBarConfig.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class77.Tiles_hueMultiplier = null;
		Tiles.field1056 = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "-1270007656"
	)
	static class145 method2990(int var0) {
		return UserComparator6.method3243(var0) != 0 ? null : GameEngine.method658(var0);
	}
}
