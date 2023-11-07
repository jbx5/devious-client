import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
public class class544 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1536350795
	)
	int field5265;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1266576485
	)
	int field5264;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 133767695
	)
	int field5273;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1866643517
	)
	int field5266;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 20018137
	)
	int field5267;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1737635413
	)
	int field5263;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -541231897
	)
	int field5262;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1850961923
	)
	int field5270;
	@ObfuscatedName("az")
	boolean field5271;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1840691563
	)
	int field5268;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -574987319
	)
	int field5272;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1616668963
	)
	int field5269;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 65469375
	)
	int field5275;

	public class544() {
		this.field5262 = 0;
		this.field5270 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "0"
	)
	public void method9922(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5265 = var1;
		this.field5264 = var2;
		this.field5273 = var3;
		this.field5266 = var4;
		this.field5267 = var5;
		this.field5263 = var6;
		this.field5262 = var7;
		this.field5270 = var8;
		this.field5271 = var9;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "86"
	)
	public void method9912(int var1, int var2, int var3, int var4) {
		this.field5268 = var1;
		this.field5272 = var2;
		this.field5269 = var3;
		this.field5275 = var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpf;I)V",
		garbageValue = "72760556"
	)
	public void method9913(class406 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5266, (int)((float)var3 * 0.9F));
			int var5 = var1.method7560(this.field5273);
			int var6 = var1.method7551(this.field5266);
			int var7 = var5 + (this.field5265 - this.field5267);
			int var8 = var6 + var3 + (this.field5264 - this.field5263);
			Rasterizer2D.Rasterizer2D_setClip(this.field5265, this.field5264, this.field5265 + this.field5273, this.field5266 + this.field5264);
			int var9 = this.field5270;
			int var10 = this.field5262;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class410 var21 = var1.method7531(0, var9);
			class410 var12 = var1.method7531(var9, var10);
			class410 var13 = var1.method7531(var10, var1.method7522());
			class410 var14 = var1.method7531(0, this.field5262);
			int var16;
			int var18;
			if (!var12.method7777()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method7788(); ++var16) {
					class408 var23 = var12.method7782(var16);
					var18 = var7 + var23.field4508;
					int var19 = var2.charWidth(var23.field4509);
					int var20 = var8 + var23.field4507 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5275);
				}
			}

			if (!var21.method7777()) {
				var2.method7674(var21, var7, var8, this.field5268, this.field5272, -1);
			}

			if (!var12.method7777()) {
				var2.method7674(var12, var7, var8, this.field5269, this.field5272, -1);
			}

			if (!var13.method7777()) {
				var2.method7674(var13, var7, var8, this.field5268, this.field5272, -1);
			}

			if (this.field5271) {
				class497 var22 = var14.method7793();
				var16 = var7 + (Integer)var22.field4996;
				int var17 = var8 + (Integer)var22.field4997;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5268);
				if (this.field5272 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5272);
				}
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lof;II)Lld;",
		garbageValue = "-1670201559"
	)
	public static PacketBufferNode method9914(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher);
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
		if (var8 != null && Client.revision >= 214) {
			for (int var19 = 0; var19 < var8.length; ++var19) {
				var4.packetBuffer.writeByte(var8[var19]);
			}
		}

		PcmPlayer.method847(var4.packetBuffer, var1);
		if (var0 == class351.field3835.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}
