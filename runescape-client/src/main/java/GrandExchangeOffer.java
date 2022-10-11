import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("c")
	@Export("state")
	byte state;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1878336981
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1873113171
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1988831717
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1523752521
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2129644077
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lqq;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1652333094"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "53"
	)
	void method6179(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "512"
	)
	void method6174(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
