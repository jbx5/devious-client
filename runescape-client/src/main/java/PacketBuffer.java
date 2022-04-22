import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("c")
	static final int[] field4614;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lqv;")

	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-835561769)

	@Export("bitIndex")
	int bitIndex;
	static 
	{
		field4614 = new int[]{ 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([II)V", garbageValue = 
	"1339442514")

	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lqv;I)V", garbageValue = 
	"1028615537")

	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1238591858")

	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[(++super.offset) - 1] = ((byte) (var1 + this.isaacCipher.nextInt()));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"115676548")

	@Export("readByteIsaac")
	public int readByteIsaac() {
		return (super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()) & 255;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"15461355")

	public boolean method7622() {
		int var1 = (super.array[super.offset] - this.isaacCipher.method8224()) & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1913551705")

	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = (super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()) & 255;
		return var1 < 128 ? var1 : ((var1 - 128) << 8) + ((super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()) & 255);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)V", garbageValue = 
	"60")

	public void method7624(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = ((byte) (super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()));
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1261988260")

	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"4")

	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field4614[var3]) << (var1 - var3);
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field4614[var3];
		} else {
			var4 += (super.array[var2] >> (var3 - var1)) & field4614[var1];
		}

		return var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1395113017")

	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"-1194786841")

	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return (var1 * 8) - this.bitIndex;
	}
}