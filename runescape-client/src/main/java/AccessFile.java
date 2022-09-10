import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("fo")
	static String field4662;
	@ObfuscatedName("c")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 947756581843016567L
	)
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5821493683209614151L
	)
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) { // L: 11
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) { // L: 12
			var1.delete(); // L: 13
		}

		this.file = new RandomAccessFile(var1, var2); // L: 15
		this.maxSize = var3; // L: 16
		this.offset = 0L; // L: 17
		int var5 = this.file.read(); // L: 18
		if (var5 != -1 && !var2.equals("r")) { // L: 19
			this.file.seek(0L); // L: 20
			this.file.write(var5); // L: 21
		}

		this.file.seek(0L); // L: 23
	} // L: 24

	@ObfuscatedName("c")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1); // L: 27
		this.offset = var1; // L: 28
	} // L: 29

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "477799899"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.offset > this.maxSize) { // L: 32
			this.file.seek(this.maxSize); // L: 33
			this.file.write(1); // L: 34
			throw new EOFException(); // L: 35
		} else {
			this.file.write(var1, var2, var3); // L: 37
			this.offset += (long)var3; // L: 38
		}
	} // L: 39

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1877345153"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false); // L: 42
	} // L: 43

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1504725329"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) { // L: 46
			if (var1) { // L: 47
				try {
					this.file.getFD().sync(); // L: 49
				} catch (SyncFailedException var3) { // L: 51
				}
			}

			this.file.close(); // L: 53
			this.file = null; // L: 54
		}

	} // L: 56

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2037219483"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length(); // L: 59
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "0"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3); // L: 63
		if (var4 > 0) {
			this.offset += (long)var4; // L: 64
		}

		return var4; // L: 65
	}

	protected void finalize() throws Throwable {
		if (this.file != null) { // L: 69
			System.out.println(""); // L: 70
			this.close(); // L: 71
		}

	} // L: 73

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIZB)Ljava/lang/String;",
		garbageValue = "50"
	)
	static String method7683(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 111
			if (var2 && var0 >= 0) { // L: 112
				int var3 = 2; // L: 113

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 114 115 117
					var4 /= var1; // L: 116
				}

				char[] var5 = new char[var3]; // L: 119
				var5[0] = '+'; // L: 120

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 121
					int var7 = var0; // L: 122
					var0 /= var1; // L: 123
					int var8 = var7 - var0 * var1; // L: 124
					if (var8 >= 10) { // L: 125
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 126
					}
				}

				return new String(var5); // L: 128
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
