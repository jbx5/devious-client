import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("z")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("v")
	@Export("state")
	byte state;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	882617765)

	@Export("id")
	public int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	274655921)

	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1718567641)

	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	781050121)

	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1429654689)

	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpi;Z)V", garbageValue = 
	"0")

	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"3324")

	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"126")

	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"659147953")

	void method6018(int var1) {
		this.state &= -8;
		this.state = ((byte) (this.state | (var1 & 7)));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1485129862")

	void method6025(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = ((byte) (this.state | 8));
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"41")

	static int method6032(int var0) {
		return ((int) (Math.pow(2.0, ((double) (7.0F + (((float) (var0)) / 256.0F))))));
	}
}