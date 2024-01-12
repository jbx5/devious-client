import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("am")
	@Export("state")
	byte state;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -130629373
	)
	@Export("id")
	public int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1210970051
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -53146871
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2000232349
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2069278333
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Luk;Z)V",
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2116304601"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1547471928"
	)
	void method7216(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	void method7232(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
