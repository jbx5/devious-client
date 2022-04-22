import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("fr")
	@ObfuscatedGetter(intValue = 
	648708493)

	static int field2816;
	@ObfuscatedName("fk")
	static int[] field2817;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1023458973)

	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	476237239)

	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	443287667)

	@Export("z")
	int z;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-1525628645)

	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(descriptor = 
	"(Lil;)V")

	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}
}