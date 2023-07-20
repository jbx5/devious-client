import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("aw")
	@Export("inflater")
	Inflater inflater;

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1000000"
	)
	GZipDecompressor(int var1, int var2, int var3) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;[BB)V",
		garbageValue = "0"
	)
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)[Lfj;",
		garbageValue = "12402"
	)
	static class138[] method9734() {
		return new class138[]{class138.field1618, class138.field1616, class138.field1622, class138.field1615, class138.field1619, class138.field1617, class138.field1621, class138.field1620, class138.field1623};
	}
}
