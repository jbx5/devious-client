import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class147 extends class129 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field1693;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1946571271
	)
	static int field1689;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -760957949
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1032650765
	)
	int field1690;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 229451587
	)
	int field1695;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class147(class132 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1690 = var1.readInt(); // L: 274
		this.field1695 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3126(this.field1690, this.field1695); // L: 279
	} // L: 280

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lbo;",
		garbageValue = "84"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return NetCache.getNextWorldListWorld(); // L: 238
	}
}
