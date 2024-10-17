import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -700579153
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 991975417
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -703612283
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 52686273
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1501189999"
	)
	static final boolean method5489(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}
}
