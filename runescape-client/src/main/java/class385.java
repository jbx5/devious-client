import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class385 {
	@ObfuscatedName("g")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("v")
	float field4334;
	@ObfuscatedName("o")
	float field4332;
	@ObfuscatedName("h")
	float field4333;
	static 
	{
		new class385(0.0F, 0.0F, 0.0F);
		new class385(1.0F, 1.0F, 1.0F);
		new class385(1.0F, 0.0F, 0.0F);
		new class385(0.0F, 1.0F, 0.0F);
		new class385(0.0F, 0.0F, 1.0F);
		KeyHandler.method377(100);
	}

	class385(float var1, float var2, float var3) {
		this.field4334 = var1;
		this.field4332 = var2;
		this.field4333 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)F", garbageValue = 
	"-989001357")

	final float method7026() {
		return ((float) (Math.sqrt(((double) (((this.field4334 * this.field4334) + (this.field4332 * this.field4332)) + (this.field4333 * this.field4333))))));
	}

	public String toString() {
		return (((this.field4334 + ", ") + this.field4332) + ", ") + this.field4333;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ld;I)Lg;", garbageValue = 
	"-1598451029")

	public static class3 method7027(class6 var0) {
		switch (var0.field17) {
			case 0 :
				return new class0();
			default :
				throw new IllegalArgumentException();}

	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"90")

	static final void method7028() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field612[(++Client.field634) - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[(++Client.npcCount) - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[(++Client.npcCount) - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field533[(++Client.field609) - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[(++Client.npcCount) - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2357(var7, class193.field2193);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field533[(++Client.field609) - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[(++Client.npcCount) - 1] = var3;
							var4.npcCycle = Client.cycle;
							if (var0.readBits(1) == 1) {
								var7 = var0.readBits(3);
								var4.method2357(var7, class193.field2191);
								var8 = var0.readBits(3);
								var4.method2357(var8, class193.field2191);
							} else {
								var7 = var0.readBits(3);
								var4.method2357(var7, class193.field2195);
							}

							var7 = var0.readBits(1);
							if (var7 == 1) {
								Client.field533[(++Client.field609) - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field612[(++Client.field634) - 1] = var3;
						}
					}
				}
			}

		}
	}
}