import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 830865447
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("p")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1335488063
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("n")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 885941459
	)
	@Export("position")
	int position;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1087004357
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("s")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0; // L: 66
		this.limit = 0; // L: 67
		this.inputStream = var1; // L: 71
		this.capacity = var2 + 1; // L: 72
		this.buffer = new byte[this.capacity]; // L: 73
		this.thread = new Thread(this); // L: 74
		this.thread.setDaemon(true); // L: 75
		this.thread.start(); // L: 76
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-204109826"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) { // L: 113
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 114
			synchronized(this) { // L: 115
				int var3;
				if (this.position <= this.limit) { // L: 117
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 118
				}

				if (var3 < var1) { // L: 119
					if (this.exception != null) { // L: 120
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll(); // L: 121
						return false; // L: 122
					}
				} else {
					return true; // L: 124
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "324153997"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) { // L: 129
			int var2;
			if (this.position <= this.limit) { // L: 131
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit; // L: 132
			}

			if (var2 <= 0 && this.exception != null) { // L: 133
				throw new IOException(this.exception.toString()); // L: 134
			} else {
				this.notifyAll(); // L: 136
				return var2; // L: 137
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1116130893"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 142
			if (this.position == this.limit) { // L: 143
				if (this.exception != null) { // L: 144
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 145
				}
			} else {
				int var2 = this.buffer[this.position] & 255; // L: 147
				this.position = (this.position + 1) % this.capacity; // L: 148
				this.notifyAll(); // L: 149
				return var2; // L: 150
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-37"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 155
			synchronized(this) { // L: 156
				int var5;
				if (this.position <= this.limit) { // L: 158
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit; // L: 159
				}

				if (var3 > var5) { // L: 160
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) { // L: 161
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 162
						System.arraycopy(this.buffer, this.position, var1, var2, var3); // L: 163
					} else {
						int var6 = this.capacity - this.position; // L: 166
						System.arraycopy(this.buffer, this.position, var1, var2, var6); // L: 167
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6); // L: 168
					}

					this.position = (var3 + this.position) % this.capacity; // L: 170
					this.notifyAll(); // L: 171
					return var3; // L: 172
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1863713978"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 177
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 178
			}

			this.notifyAll(); // L: 179
		}

		try {
			this.thread.join(); // L: 182
		} catch (InterruptedException var3) { // L: 184
		}

	} // L: 185

	public void run() {
		while (true) {
			int var1;
			synchronized(this) { // L: 82
				while (true) {
					if (this.exception != null) { // L: 84
						return;
					}

					if (this.position == 0) { // L: 85
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) { // L: 86
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1; // L: 87
					}

					if (var1 > 0) { // L: 88
						break;
					}

					try {
						this.wait(); // L: 90
					} catch (InterruptedException var10) { // L: 92
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1); // L: 97
				if (var7 == -1) {
					throw new EOFException(); // L: 98
				}
			} catch (IOException var11) { // L: 100
				IOException var3 = var11;
				synchronized(this) { // L: 101
					this.exception = var3; // L: 102
					return; // L: 103
				}
			}

			synchronized(this) { // L: 106
				this.limit = (var7 + this.limit) % this.capacity; // L: 107
			} // L: 108
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "538575636"
	)
	static final int method7052(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 971
		var2 ^= var2 << 13; // L: 972
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 973
		return var3 >> 19 & 255; // L: 974
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lkw;III)V",
		garbageValue = "-1127533475"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3578
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3579
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3580
				if (var3 == null) { // L: 3581
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3582
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3583
				if (var3.contains(var4, var5)) { // L: 3584
					var4 -= var3.width / 2; // L: 3585
					var5 -= var3.height / 2; // L: 3586
					int var6 = Client.camAngleY & 2047; // L: 3587
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3588
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3589
					int var9 = var8 * var4 + var7 * var5 >> 11; // L: 3590
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3591
					int var11 = var9 + class67.localPlayer.x >> 7; // L: 3592
					int var12 = class67.localPlayer.y - var10 >> 7; // L: 3593
					PacketBufferNode var13 = class120.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 3595
					var13.packetBuffer.writeByte(18); // L: 3596
					var13.packetBuffer.writeShortAdd(class128.baseX * 64 + var11); // L: 3597
					var13.packetBuffer.writeShort(WorldMapData_1.baseY * 64 + var12); // L: 3598
					var13.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3599
					var13.packetBuffer.writeByte(var4); // L: 3600
					var13.packetBuffer.writeByte(var5); // L: 3601
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3602
					var13.packetBuffer.writeByte(57); // L: 3603
					var13.packetBuffer.writeByte(0); // L: 3604
					var13.packetBuffer.writeByte(0); // L: 3605
					var13.packetBuffer.writeByte(89); // L: 3606
					var13.packetBuffer.writeShort(class67.localPlayer.x); // L: 3607
					var13.packetBuffer.writeShort(class67.localPlayer.y); // L: 3608
					var13.packetBuffer.writeByte(63); // L: 3609
					Client.packetWriter.addNode(var13); // L: 3610
					Client.destinationX = var11; // L: 3611
					Client.destinationY = var12; // L: 3612
				}
			}

		}
	} // L: 3615
}
