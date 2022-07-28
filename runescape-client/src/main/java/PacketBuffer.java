import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qy")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("q")
	static final int[] field4705 = new int[]{ 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lqx;")
	@Export("isaacCipher")
	IsaacCipher isaacCipher;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 128691337)
	@Export("bitIndex")
	int bitIndex;

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([II)V", garbageValue = "549676885")
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqx;S)V", garbageValue = "180")
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1883320983")
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = ((byte) (var1 + this.isaacCipher.nextInt()));
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "57")
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "64")
	public boolean method7695() {
		int var1 = super.array[super.offset] - this.isaacCipher.method8311() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "578182269")
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-941344363")
	public void method7680(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = ((byte) (super.array[++super.offset - 1] - this.isaacCipher.nextInt()));
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "728501835")
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "897475987")
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;
		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field4705[var3]) << var1 - var3;
			var1 -= var3;
		}
		if (var3 == var1) {
			var4 += super.array[var2] & field4705[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4705[var1];
		}
		return var4;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1866239722")
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-2071894850")
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}
}