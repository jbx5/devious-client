import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("WorldEntity")
public class WorldEntity implements class67 {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -718963057
	)
	int field4966;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1090116467
	)
	public int field4964;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 663953355
	)
	public int field4963;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 953925525
	)
	public int field4968;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -323233339
	)
	public int field4967;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 255992747
	)
	public int field4973;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1530400209
	)
	public int field4969;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -293479555
	)
	public int field4970;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 579113171
	)
	int field4972;
	@ObfuscatedName("ae")
	public int[] field4974;
	@ObfuscatedName("au")
	public int[] field4965;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	class238[] field4975;

	public WorldEntity(int var1, int var2, int var3, int var4) {
		this.field4966 = 0;
		this.field4964 = 0;
		this.field4963 = 2;
		this.field4968 = 0;
		this.field4967 = -1;
		this.field4973 = -1;
		this.field4969 = -1;
		this.field4970 = 0;
		this.field4972 = 0;
		this.field4974 = new int[10];
		this.field4965 = new int[10];
		this.field4975 = new class238[10];
		this.worldView = new WorldView(var1, var2, var3, var4);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1094315846"
	)
	public int vmethod8670() {
		return this.field4967;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1560683435"
	)
	public int vmethod8671() {
		return this.field4969;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1219894600"
	)
	public int vmethod8672() {
		return this.field4966;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-286093061"
	)
	public void method8669() {
		this.worldView.scene.Scene_plane = this.worldView.plane;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILjb;I)V",
		garbageValue = "2140785958"
	)
	public final void method8684(int var1, int var2, class238 var3) {
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (this.field4974[0] >= 0 && this.field4974[0] < 104 && this.field4965[0] >= 0 && this.field4965[0] < 104) {
				this.method8674(var1, var2, var3);
			} else {
				this.method8679(var1, var2);
			}
		} else {
			this.method8679(var1, var2);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1231397915"
	)
	public void method8679(int var1, int var2) {
		this.field4972 = 0;
		this.field4974[0] = var1;
		this.field4965[0] = var2;
		byte var3 = 1;
		this.field4967 = var3 * 64 + this.field4974[0] * 128;
		this.field4969 = var3 * 64 + this.field4965[0] * 128;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjb;I)V",
		garbageValue = "1637705653"
	)
	final void method8674(int var1, int var2, class238 var3) {
		if (this.field4972 < 9) {
			++this.field4972;
		}

		for (int var4 = this.field4972; var4 > 0; --var4) {
			this.field4974[var4] = this.field4974[var4 - 1];
			this.field4965[var4] = this.field4965[var4 - 1];
			this.field4975[var4] = this.field4975[var4 - 1];
		}

		this.field4974[0] = var1;
		this.field4965[0] = var2;
		this.field4975[0] = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18238"
	)
	public final void method8673() {
		int var1 = this.field4964 - this.field4970 & 2047;
		if (var1 != 0) {
			boolean var2 = true;
			boolean var3 = true;
			int var4 = var1 > 1024 ? -1 : 1;
			this.field4970 += var4 * (this.field4968 > 0 ? 1 + this.field4963 : this.field4963);
			--this.field4968;
			if (var1 < this.field4963 || var1 > 2048 - this.field4963) {
				this.field4970 = this.field4964;
			}

			this.field4970 &= 2047;
		}

		if (this.field4972 == 0) {
			this.method8679(this.field4974[0], this.field4965[0]);
		} else {
			int var10 = this.field4967;
			int var11 = this.field4969;
			byte var12 = 1;
			int var5 = this.field4974[this.field4972 - 1] * 128 + var12 * 128 / 2;
			int var6 = this.field4965[this.field4972 - 1] * 128 + var12 * 128 / 2;
			class238 var7 = this.field4975[this.field4972 - 1];
			int var8 = (int)(Math.ceil((double)var7.field2517) * 128.0D);
			if (var5 - var10 <= var8 && var5 - var10 >= -var8 && var6 - var11 <= var8 && var6 - var11 >= -var8) {
				byte var9 = 4;
				if (this.field4972 > 2) {
					var9 = 6;
				}

				if (this.field4972 > 3) {
					var9 = 8;
				}

				int var13 = (int)(var7.field2517 * (float)var9);
				if (var5 != var10 || var6 != var11) {
					if (var10 < var5) {
						this.field4967 += var13;
						if (this.field4967 > var5) {
							this.field4967 = var5;
						}
					} else if (var10 > var5) {
						this.field4967 -= var13;
						if (this.field4967 < var5) {
							this.field4967 = var5;
						}
					}

					if (var11 < var6) {
						this.field4969 += var13;
						if (this.field4969 > var6) {
							this.field4969 = var6;
						}
					} else if (var11 > var6) {
						this.field4969 -= var13;
						if (this.field4969 < var6) {
							this.field4969 = var6;
						}
					}
				}

				if (var5 == this.field4967 && var6 == this.field4969) {
					--this.field4972;
				}

			} else {
				this.field4967 = var5;
				this.field4969 = var6;
				--this.field4972;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpe;IS)Lmb;",
		garbageValue = "-11325"
	)
	public static PacketBufferNode method8675(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3302, Client.packetWriter.isaacCipher);
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
				int var15 = var13 + var12;
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
		if (var8 != null) {
			for (int var19 = 0; var19 < var8.length; ++var19) {
				var4.packetBuffer.writeByte(var8[var19]);
			}
		}

		class225.method4305(var4.packetBuffer, var1);
		if (var0 == class366.field4000.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}
