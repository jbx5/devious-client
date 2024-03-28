import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -1717644073
	)
	static int field2445;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -233279593
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1153342305
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -563864283
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 566867105
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bs")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1149107979"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1739593374"
	)
	public void method4353(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1);
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130);
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10);
				this.setFlag(var1, var2 + 1, 32);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128);
				this.setFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536);
					this.setFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384);
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "2116342032"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize) {
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize) {
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1203207662"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2101501073"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "17"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "83"
	)
	public void method4358(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "-124"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1853212949"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "10302"
	)
	public void method4361(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1153342305"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label86: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label86;
					}

					if (var7 == '+') {
						break label86;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "797487725"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		Player var9;
		PacketBufferNode var10;
		if (var2 == 46) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeShort(var3);
				var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 51) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var10.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		PacketBufferNode var14;
		if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShort(var3);
			var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
			Client.packetWriter.addNode(var14);
		}

		NPC var15;
		if (var2 == 9) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeShortAddLE(var3);
				var10.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 4) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeShortAddLE(var3);
			var14.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 22) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShortLE(var3);
			var14.packetBuffer.writeShortLE(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 10) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var10.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 16) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.field3225, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShortAdd(var3);
			var14.packetBuffer.writeShortLE(class254.field2776);
			var14.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeIntLE(class366.field3997);
			var14.packetBuffer.writeShortLE(class500.field5007);
			var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 45) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var10.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 26) {
			LoginState.method1200();
		}

		if (var2 == 21) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShortLE(var3);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 23) {
			if (Client.isMenuOpen) {
				LoginType.scene.setViewportWalking();
			} else {
				LoginType.scene.menuOpen(class172.Client_plane, var0, var1, true);
			}
		}

		if (var2 == 2) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeShortLE(Client.selectedSpellItemId);
			var14.packetBuffer.writeShortAdd(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeInt(ChatChannel.selectedSpellWidget);
			var14.packetBuffer.writeShortAddLE(var3);
			var14.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 7) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.field3289, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeShort(class500.field5007);
				var10.packetBuffer.writeInt(class366.field3997);
				var10.packetBuffer.writeShortLE(var3);
				var10.packetBuffer.writeShort(class254.field2776);
				var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		int var11;
		Widget var16;
		if (var2 == 29) {
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var14);
			var16 = class243.widgetDefinition.method6281(var1);
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) {
				var11 = var16.cs1Instructions[0][1];
				if (Varps.Varps_main[var11] != var16.cs1ComparisonValues[0]) {
					Varps.Varps_main[var11] = var16.cs1ComparisonValues[0];
					class11.changeGameOptions(var11);
				}
			}
		}

		if (var2 == 47) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeShortAddLE(var3);
				var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 1001) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShortAdd(var3);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 1) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.field3253, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeShortAddLE(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeShortAdd(class500.field5007);
			var14.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
			var14.packetBuffer.writeShortAddLE(var3);
			var14.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShortAdd(class254.field2776);
			var14.packetBuffer.writeIntLE(class366.field3997);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 28) {
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var14);
			var16 = class243.widgetDefinition.method6281(var1);
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) {
				var11 = var16.cs1Instructions[0][1];
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
				class11.changeGameOptions(var11);
			}
		}

		if (var2 == 1004) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeShortAdd(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
			var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
			var14.packetBuffer.writeShortAdd(var3);
			Client.packetWriter.addNode(var14);
		}

		Widget var18;
		if (var2 == 57 || var2 == 1007) {
			var18 = class243.widgetDefinition.getWidgetChild(var1, var0);
			if (var18 != null) {
				AbstractArchive.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 14) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = FadeInTask.getPacketBufferNode(ClientPacket.field3296, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var10.packetBuffer.writeShortLE(class500.field5007);
				var10.packetBuffer.writeShort(var3);
				var10.packetBuffer.writeInt(class366.field3997);
				var10.packetBuffer.writeShort(class254.field2776);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 58) {
			var18 = class243.widgetDefinition.getWidgetChild(var1, var0);
			if (var18 != null) {
				if (var18.field3851 != null) {
					ScriptEvent var17 = new ScriptEvent();
					var17.widget = var18;
					var17.opIndex = var3;
					var17.targetName = var6;
					var17.args = var18.field3851;
					AbstractWorldMapData.runScriptEvent(var17);
				}

				var10 = FadeInTask.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeIntME(var1);
				var10.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
				var10.packetBuffer.writeShortAdd(var0);
				var10.packetBuffer.writeIntME(ChatChannel.selectedSpellWidget);
				var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
				var10.packetBuffer.writeShortAddLE(var4);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 25) {
			var18 = class243.widgetDefinition.getWidgetChild(var1, var0);
			if (var18 != null) {
				WorldMapCacheName.method5751();
				Interpreter.method2068(var1, var0, class342.Widget_unpackTargetMask(class33.getWidgetFlags(var18)), var4);
				Client.isItemSelected = 0;
				Client.selectedSpellActionName = class160.Widget_getSpellActionName(var18);
				if (Client.selectedSpellActionName == null) {
					Client.selectedSpellActionName = "null";
				}

				if (var18.isIf3) {
					Client.selectedSpellName = var18.dataText + Decimator.colorStartTag(16777215);
				} else {
					Client.selectedSpellName = Decimator.colorStartTag(65280) + var18.field3822 + Decimator.colorStartTag(16777215);
				}
			}

		} else {
			if (var2 == 50) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 18) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var14.packetBuffer.writeShortLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 6) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
				var14.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) {
				LoginState.resumePauseWidget(var1, var0);
				Client.meslayerContinueWidget = class243.widgetDefinition.getWidgetChild(var1, var0);
				WorldMapData_0.invalidateWidget(Client.meslayerContinueWidget);
			}

			if (var2 == 15) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeInt(ChatChannel.selectedSpellWidget);
					var10.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var10.packetBuffer.writeShort(Client.selectedSpellItemId);
					var10.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 13) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortLE(var3);
					var10.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
				ModeWhere.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
			}

			if (var2 == 48) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAddLE(var3);
					var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 8) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeIntME(ChatChannel.selectedSpellWidget);
					var10.packetBuffer.writeShortLE(Client.selectedSpellItemId);
					var10.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var10.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 1002) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 19) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var14.packetBuffer.writeShortAdd(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 5) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
				var14.packetBuffer.writeShort(DevicePcmPlayerProvider.baseY * 64 + var1);
				var14.packetBuffer.writeShortAdd(var3);
				var14.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 44) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortLE(var3);
					var10.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 11) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortAdd(var3);
					var10.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			PacketBufferNode var13;
			if (var2 == 24) {
				var18 = class243.widgetDefinition.method6281(var1);
				if (var18 != null) {
					boolean var12 = true;
					if (var18.contentType > 0) {
						var12 = PacketWriter.method2801(var18);
					}

					if (var12) {
						var13 = FadeInTask.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var13);
					}
				}
			}

			if (var2 == 12) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var10.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 49) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = FadeInTask.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShortLE(var3);
					var10.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 20) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShortAddLE(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
				var14.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 17) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = FadeInTask.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(ChatChannel.selectedSpellWidget);
				var14.packetBuffer.writeShortLE(var3);
				var14.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var0);
				var14.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeShortAdd(DevicePcmPlayerProvider.baseY * 64 + var1);
				var14.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
				var14.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 1003) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var15 = Client.npcs[var3];
				if (var15 != null) {
					NPCComposition var19 = var15.definition;
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 != null) {
						var13 = FadeInTask.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeShortAddLE(var19.id);
						Client.packetWriter.addNode(var13);
					}
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				WorldMapData_0.invalidateWidget(class243.widgetDefinition.method6281(class366.field3997));
			}

			if (Client.isSpellSelected) {
				WorldMapCacheName.method5751();
			}

		}
	}
}
