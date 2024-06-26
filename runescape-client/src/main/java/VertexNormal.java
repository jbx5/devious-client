import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -34813589
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1220267967
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 143019549
	)
	@Export("z")
	int z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 214699869
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Llm;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "860894148"
	)
	static void method5914(PacketBufferNode var0) {
		var0.packetBuffer.writeIntME(WorldMapSectionType.field2665.hash);
		var0.packetBuffer.writeIntME(JagNetThread.field4545.hash);
		var0.packetBuffer.writeIntIME(class195.field2052.hash);
		var0.packetBuffer.writeInt(ApproximateRouteStrategy.archive2.hash);
		var0.packetBuffer.writeIntLE(LoginPacket.field1684.hash);
		var0.packetBuffer.writeIntME(VarpDefinition.field1881.hash);
		var0.packetBuffer.writeIntIME(PlayerComposition.field3785.hash);
		var0.packetBuffer.writeIntIME(class157.archive9.hash);
		var0.packetBuffer.writeIntIME(WorldEntity.archive12.hash);
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeIntLE(class151.field1715.hash);
		var0.packetBuffer.writeInt(class498.field5069.hash);
		var0.packetBuffer.writeIntLE(LoginScreenAnimation.archive4.hash);
		var0.packetBuffer.writeIntIME(LoginState.field497.hash);
	}
}
