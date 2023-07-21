import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class396 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1556258051
	)
	int field4478;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class396(int var1, boolean var2) {
		this.field4478 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-83"
	)
	public int method7458() {
		return this.field4478;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lot;II)Llv;",
		garbageValue = "946533133"
	)
	public static PacketBufferNode method7459(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class503.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher);
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
			boolean var10 = true;
			boolean var11 = true;
			int var12 = "pattern".length();
			int var13 = 0;
			byte[] var14 = new byte[8];

			byte[] var9;
			while (true) {
				int var15 = var12 + var13;
				if (var15 >= var6.length()) {
					var9 = null;
					break;
				}

				char var16 = var6.charAt(var15);
				if (var16 == ':') {
					if (var13 == 0) {
						var9 = null;
					} else {
						byte[] var17 = new byte[var13];
						System.arraycopy(var14, 0, var17, 0, var13);
						var9 = var17;
					}
					break;
				}

				if (var14.length == var13) {
					var9 = null;
					break;
				}

				if (var16 >= '0' && var16 <= '9') {
					var16 = (char)(var16 - '0');
				} else {
					if (var16 < 'a' || var16 > 'z') {
						var9 = null;
						break;
					}

					var16 = (char)(var16 - 'W');
				}

				var14[var13++] = (byte)var16;
			}

			var8 = var9;
			if (var9 != null) {
				var7 = var9.length + 12;
				var1 = var1.substring("pattern".length() + var9.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var18 = 0;
		if (var6.startsWith("wave:")) {
			var18 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var18 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var18 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var18 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var18 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var18);
		if (var8 != null && Client.field525 >= 214) {
			for (int var19 = 0; var19 < var8.length; ++var19) {
				var4.packetBuffer.writeByte(var8[var19]);
			}
		}

		class18.method275(var4.packetBuffer, var1);
		if (var0 == class340.field3801.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}
