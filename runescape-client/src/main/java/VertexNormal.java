import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -929686261
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1772790621
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1782288159
	)
	@Export("z")
	int z;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1353901163
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljk;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1893711820"
	)
	static void method4951(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = class215.method4223();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
