import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class421 {
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -375621473
	)
	static int field4705;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	public class426 field4704;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	public class425 field4707;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	public class425 field4706;

	public class421() {
		this.field4704 = class157.method3544();
		this.field4707 = Bounds.method8035();
		this.field4706 = RouteStrategy.method5664(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public void method8020() {
		this.field4704.method8098();
		this.field4707.method8084();
		this.field4706.method8084();
	}

	public String toString() {
		return "[" + this.field4704.toString() + "|" + this.field4707.toString() + "|" + this.field4706.toString() + "]";
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field4704.hashCode();
		var3 = 31 * var3 + this.field4707.hashCode();
		var3 = var3 * 31 + this.field4706.hashCode();
		return var3;
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class421)) {
			return false;
		} else {
			class421 var2 = (class421)var1;
			return this.field4704.equals(var2.field4704) && this.field4707.method8074(var2.field4707) && this.field4706.method8074(var2.field4706);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpx;IB)Lmq;",
		garbageValue = "-118"
	)
	public static PacketBufferNode method8029(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class141.getPacketBufferNode(ClientPacket.field3315, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
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
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = class88.method2505(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var9 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		WorldMapSprite.method6191(var4.packetBuffer, var1);
		if (var0 == class370.field4034.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}
