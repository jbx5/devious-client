import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("aq")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ad")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 512687671
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ak")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 725690807
	)
	@Export("position")
	int position;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1931419243
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("aj")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.inputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "436261401"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity) {
			synchronized(this) {
				int var3;
				if (this.position <= this.limit) {
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit;
				}

				if (var3 < var1) {
					if (this.exception != null) {
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) {
			int var2;
			if (this.position <= this.limit) {
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit;
			}

			if (var2 <= 0 && this.exception != null) {
				throw new IOException(this.exception.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1875502007"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) {
			if (this.position == this.limit) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = this.buffer[this.position] & 255;
				this.position = (this.position + 1) % this.capacity;
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-316841250"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var5;
				if (this.position <= this.limit) {
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit;
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) {
						System.arraycopy(this.buffer, this.position, var1, var2, var3);
					} else {
						int var6 = this.capacity - this.position;
						System.arraycopy(this.buffer, this.position, var1, var2, var6);
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
					}

					this.position = (var3 + this.position) % this.capacity;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-748039453"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			if (this.exception == null) {
				this.exception = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position == 0) {
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) {
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1);
				if (var7 == -1) {
					throw new EOFException();
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.exception = var3;
					return;
				}
			}

			synchronized(this) {
				this.limit = (var7 + this.limit) % this.capacity;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1252528992"
	)
	static int method8745(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			NPCComposition var6 = class76.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				class130.Interpreter_intStackSize -= 2;
				var3 = class76.getNpcDefinition(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method3702(var4);
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method3716(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class76.getNpcDefinition(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
