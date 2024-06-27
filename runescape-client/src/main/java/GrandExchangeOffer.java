import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("aq")
	@Export("state")
	byte state;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1879979743
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -74676455
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1840881785
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1937218483
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -406242341
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lvp;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "88"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1843111462"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
	)
	void method7356(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "73375725"
	)
	void method7359(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
