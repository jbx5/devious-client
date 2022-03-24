import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class388 {
	@ObfuscatedName("v")
	float field4359;
	@ObfuscatedName("o")
	float field4350;
	@ObfuscatedName("h")
	float field4351;
	@ObfuscatedName("g")
	float field4352;
	@ObfuscatedName("l")
	float field4353;
	@ObfuscatedName("n")
	float field4357;
	@ObfuscatedName("d")
	float field4355;
	@ObfuscatedName("f")
	float field4349;
	@ObfuscatedName("u")
	float field4356;
	@ObfuscatedName("r")
	float field4358;
	@ObfuscatedName("k")
	float field4354;
	@ObfuscatedName("x")
	float field4360;
	static 
	{
		new class388();
	}

	class388() {
		this.method7127();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1625527457")

	void method7127() {
		this.field4360 = 0.0F;
		this.field4354 = 0.0F;
		this.field4358 = 0.0F;
		this.field4349 = 0.0F;
		this.field4355 = 0.0F;
		this.field4357 = 0.0F;
		this.field4352 = 0.0F;
		this.field4351 = 0.0F;
		this.field4350 = 0.0F;
		this.field4356 = 1.0F;
		this.field4353 = 1.0F;
		this.field4359 = 1.0F;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(FI)V", garbageValue = 
	"-465113031")

	void method7128(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4350;
		float var5 = this.field4353;
		float var6 = this.field4349;
		float var7 = this.field4354;
		this.field4350 = (var2 * var4) - (var3 * this.field4351);
		this.field4351 = (var2 * this.field4351) + (var4 * var3);
		this.field4353 = (var2 * var5) - (var3 * this.field4357);
		this.field4357 = (var5 * var3) + (var2 * this.field4357);
		this.field4349 = (var6 * var2) - (var3 * this.field4356);
		this.field4356 = (var3 * var6) + (this.field4356 * var2);
		this.field4354 = (var2 * var7) - (this.field4360 * var3);
		this.field4360 = (var2 * this.field4360) + (var7 * var3);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(FI)V", garbageValue = 
	"1919823756")

	void method7129(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4359;
		float var5 = this.field4352;
		float var6 = this.field4355;
		float var7 = this.field4358;
		this.field4359 = (var2 * var4) + (var3 * this.field4351);
		this.field4351 = (var2 * this.field4351) - (var4 * var3);
		this.field4352 = (this.field4357 * var3) + (var2 * var5);
		this.field4357 = (this.field4357 * var2) - (var3 * var5);
		this.field4355 = (this.field4356 * var3) + (var2 * var6);
		this.field4356 = (this.field4356 * var2) - (var6 * var3);
		this.field4358 = (var7 * var2) + (this.field4360 * var3);
		this.field4360 = (this.field4360 * var2) - (var7 * var3);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(FI)V", garbageValue = 
	"-1580684401")

	void method7139(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4359;
		float var5 = this.field4352;
		float var6 = this.field4355;
		float var7 = this.field4358;
		this.field4359 = (var2 * var4) - (var3 * this.field4350);
		this.field4350 = (var2 * this.field4350) + (var3 * var4);
		this.field4352 = (var2 * var5) - (this.field4353 * var3);
		this.field4353 = (this.field4353 * var2) + (var3 * var5);
		this.field4355 = (var6 * var2) - (var3 * this.field4349);
		this.field4349 = (this.field4349 * var2) + (var6 * var3);
		this.field4358 = (var7 * var2) - (var3 * this.field4354);
		this.field4354 = (var2 * this.field4354) + (var3 * var7);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(FFFS)V", garbageValue = 
	"3240")

	void method7131(float var1, float var2, float var3) {
		this.field4358 += var1;
		this.field4354 += var2;
		this.field4360 += var3;
	}

	public String toString() {
		return (((((((((((((((((((((this.field4359 + ",") + this.field4352) + ",") + this.field4355) + ",") + this.field4358) + "\n") + this.field4350) + ",") + this.field4353) + ",") + this.field4349) + ",") + this.field4354) + "\n") + this.field4351) + ",") + this.field4357) + ",") + this.field4356) + ",") + this.field4360;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;Llp;II)Ljt;", garbageValue = 
	"1639475928")

	public static PacketBufferNode method7151(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		byte var7 = 0;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) {
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) {
				var7 = 10;
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11;
				var1 = var1.substring("glow3:".length());
			}
		}

		var6 = var1.toLowerCase();
		byte var8 = 0;
		if (var6.startsWith("wave:")) {
			var8 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var8 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var8 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var8 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var8 = 5;
			var1 = var1.substring("slide:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("wave:")) {
				var8 = 1;
				var1 = var1.substring("wave:".length());
			} else if (var6.startsWith("wave2:")) {
				var8 = 2;
				var1 = var1.substring("wave2:".length());
			} else if (var6.startsWith("shake:")) {
				var8 = 3;
				var1 = var1.substring("shake:".length());
			} else if (var6.startsWith("scroll:")) {
				var8 = 4;
				var1 = var1.substring("scroll:".length());
			} else if (var6.startsWith("slide:")) {
				var8 = 5;
				var1 = var1.substring("slide:".length());
			}
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var8);
		WorldMapIcon_0.method4900(var4.packetBuffer, var1);
		if (var0 == class296.field3502.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}