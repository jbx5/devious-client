import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("j")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("v")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("c")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("i")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("f")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lff;")

	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lfx;")

	@Export("task")
	Task task;
	@ObfuscatedName("s")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1178030211)

	@Export("outLength")
	int outLength;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-831152753)

	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("o")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	512219451)

	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	1168737827)

	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(descriptor = 
	"(Ljava/net/Socket;Lff;I)V")

	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0;
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3;
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-13138")

	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					class93.method2384(1L);
				} 

				if (this.task.status == 1) {
					try {
						((Thread) (this.task.result)).join();
					} catch (InterruptedException var3) {
					}
				}
			}

			this.task = null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-891040314")

	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"46")

	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"27")

	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)I", garbageValue = 
	"-118")

	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) {
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) {
				var5 = this.inputStream.read(var1, var2, var3);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
			}

			return var4;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"-1255813086")

	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) {
				this.exceptionWriting = false;
				throw new IOException();
			} else {
				if (this.outBuffer == null) {
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						this.outBuffer[this.outOffset] = var1[var5 + var2];
						this.outOffset = (this.outOffset + 1) % this.bufferLength;
						if (((this.outLength + this.maxPacketLength) % this.bufferLength) == this.outOffset) {
							throw new IOException();
						}
					}

					if (this.task == null) {
						this.task = this.taskHandler.newThreadTask(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"-1359342670")

	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3);
	}

	public void run() {
		try {
			while (true) {
				label84 : {
					int var1;
					int var2;
					synchronized(this) {
						if (this.outLength == this.outOffset) {
							if (this.isClosed) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var10) {
							}
						}

						var2 = this.outLength;
						if (this.outOffset >= this.outLength) {
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength;
						}
					}

					if (var1 <= 0) {
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1);
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outLength == this.outOffset) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
					}
					continue;
				}

				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}

					if (this.outputStream != null) {
						this.outputStream.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var7) {
				}

				this.outBuffer = null;
				break;
			} 
		} catch (Exception var12) {
			Widget.RunException_sendStackTrace(((String) (null)), var12);
		}

	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"1794283621")

	static final boolean method3309(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class131.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class422.field4560;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class422.field4563;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}