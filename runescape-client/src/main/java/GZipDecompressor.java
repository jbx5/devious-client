import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.zip.Inflater;
import net.runelite.mapping.Export;
@ObfuscatedName("qj")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1978275225)
	static int field4821;

	@ObfuscatedName("c")
	@Export("inflater")
	Inflater inflater;

	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1000000")
	GZipDecompressor(int var1, int var2, int var3) {
	}

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;[BI)V", garbageValue = "-1849709887")
	@Export("decompress")
	public void decompress(Buffer var1, byte[] var2) {
		if (var1.array[var1.offset] == 31 && var1.array[var1.offset + 1] == -117) {
			if (this.inflater == null) {
				this.inflater = new Inflater(true);
			}
			try {
				this.inflater.setInput(var1.array, var1.offset + 10, var1.array.length - (var1.offset + 8 + 10));
				this.inflater.inflate(var2);
			} catch (Exception var4) {
				this.inflater.reset();
				throw new RuntimeException("");
			}
			this.inflater.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "102")
	static int method8314(int var0) {
		return var0 * 3 + 600;
	}
}