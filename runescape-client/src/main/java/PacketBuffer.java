import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("pc")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
    @ObfuscatedName("l")
    static final int[] field4508;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lpv;")
    @Export("isaacCipher")
    IsaacCipher isaacCipher;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -535279321)
    @Export("bitIndex")
    int bitIndex;

    static {
        field4508 = new int[]{ 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    }

    public PacketBuffer(int var1) {
        super(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([II)V", garbageValue = "-1736584905")
    @Export("newIsaacCipher")
    public void newIsaacCipher(int[] var1) {
        this.isaacCipher = new IsaacCipher(var1);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpv;I)V", garbageValue = "-1790157591")
    @Export("setIsaacCipher")
    public void setIsaacCipher(IsaacCipher var1) {
        this.isaacCipher = var1;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1716466034")
    @Export("writeByteIsaac")
    public void writeByteIsaac(int var1) {
        super.array[(++super.offset) - 1] = ((byte) (var1 + this.isaacCipher.nextInt()));
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-321320120")
    @Export("readByteIsaac")
    public int readByteIsaac() {
        return (super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()) & 255;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "-14262")
    public boolean method7321() {
        int var1 = (super.array[super.offset] - this.isaacCipher.method7920()) & 255;
        return var1 >= 128;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1701202702")
    @Export("readSmartByteShortIsaac")
    public int readSmartByteShortIsaac() {
        int var1 = (super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()) & 255;
        return var1 < 128 ? var1 : ((var1 - 128) << 8) + ((super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()) & 255);
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "([BIIB)V", garbageValue = "0")
    public void method7317(byte[] var1, int var2, int var3) {
        for (int var4 = 0; var4 < var3; ++var4) {
            var1[var4 + var2] = ((byte) (super.array[(++super.offset) - 1] - this.isaacCipher.nextInt()));
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "6")
    @Export("importIndex")
    public void importIndex() {
        this.bitIndex = super.offset * 8;
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-513292799")
    @Export("readBits")
    public int readBits(int var1) {
        int var2 = this.bitIndex >> 3;
        int var3 = 8 - (this.bitIndex & 7);
        int var4 = 0;
        for (this.bitIndex += var1; var1 > var3; var3 = 8) {
            var4 += (super.array[var2++] & field4508[var3]) << (var1 - var3);
            var1 -= var3;
        }
        if (var3 == var1) {
            var4 += super.array[var2] & field4508[var3];
        } else {
            var4 += (super.array[var2] >> (var3 - var1)) & field4508[var1];
        }
        return var4;
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1999583380")
    @Export("exportIndex")
    public void exportIndex() {
        super.offset = (this.bitIndex + 7) / 8;
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "25")
    @Export("bitsRemaining")
    public int bitsRemaining(int var1) {
        return (var1 * 8) - this.bitIndex;
    }
}