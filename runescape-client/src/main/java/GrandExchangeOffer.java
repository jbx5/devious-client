import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("at")
	@Export("state")
	byte state;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1703369019
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1283863875
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1833506105
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 856281189
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1135311229
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Luj;Z)V",
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1302720391"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1911768409"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2128384441"
	)
	void method7143(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "830444255"
	)
	void method7133(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
