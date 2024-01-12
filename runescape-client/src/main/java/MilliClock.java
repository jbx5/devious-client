import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("am")
	long[] field2318;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1614801927
	)
	int field2320;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -202644955
	)
	int field2319;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 2628243818144593535L
	)
	long field2323;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1309380721
	)
	int field2321;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 832911509
	)
	int field2322;

	public MilliClock() {
		this.field2318 = new long[10];
		this.field2320 = 256;
		this.field2319 = 1;
		this.field2321 = 0;
		this.field2323 = UserComparator9.method2973();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2318[var1] = this.field2323;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2318[var1] = 0L;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2123373080"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2320;
		int var4 = this.field2319;
		this.field2320 = 300;
		this.field2319 = 1;
		this.field2323 = UserComparator9.method2973();
		if (this.field2318[this.field2322] == 0L) {
			this.field2320 = var3;
			this.field2319 = var4;
		} else if (this.field2323 > this.field2318[this.field2322]) {
			this.field2320 = (int)((long)(var1 * 2560) / (this.field2323 - this.field2318[this.field2322]));
		}

		if (this.field2320 < 25) {
			this.field2320 = 25;
		}

		if (this.field2320 > 256) {
			this.field2320 = 256;
			this.field2319 = (int)((long)var1 - (this.field2323 - this.field2318[this.field2322]) / 10L);
		}

		if (this.field2319 > var1) {
			this.field2319 = var1;
		}

		this.field2318[this.field2322] = this.field2323;
		this.field2322 = (this.field2322 + 1) % 10;
		int var5;
		if (this.field2319 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2318[var5] != 0L) {
					this.field2318[var5] += (long)this.field2319;
				}
			}
		}

		if (this.field2319 < var2) {
			this.field2319 = var2;
		}

		BuddyRankComparator.method2992((long)this.field2319);

		for (var5 = 0; this.field2321 < 256; this.field2321 += this.field2320) {
			++var5;
		}

		this.field2321 &= 255;
		return var5;
	}

	@ObfuscatedName("am")
	public static final int method4269(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + var0 * (var12 - var14) * 6.0D;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1037743110"
	)
	public static final boolean method4262(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "519905554"
	)
	static final void method4268(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : UserComparator4.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3492()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class482.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + CollisionMap.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
