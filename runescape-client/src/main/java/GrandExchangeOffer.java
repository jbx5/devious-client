import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ac")
	@Export("state")
	byte state;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1355852291
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 928271037
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -187782633
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1572004039
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1055402649
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lul;Z)V",
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1707206023"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1662902257"
	)
	void method7090(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1720563334"
	)
	void method7092(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
