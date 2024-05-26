import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("al")
	static final int[] field5336;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1421853647
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5336 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1275570554"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvr;I)V",
		garbageValue = "1564068226"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-248150855"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "530428591"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1513508586"
	)
	public boolean method9602() {
		int var1 = super.array[super.offset] - this.isaacCipher.method10236() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "151133910"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-31"
	)
	public void method9594(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1757915268"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field5336[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field5336[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5336[var1];
		}

		return var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "260867989"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "21"
	)
	public int method9604(int var1) {
		return var1 - super.offset;
	}
}
