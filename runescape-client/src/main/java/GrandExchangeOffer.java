import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ap")
	@Export("state")
	byte state;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 916956147
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 467394427
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -334196055
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 44282425
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1875930043
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lvl;Z)V",
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1409396870"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	void method7789(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1116290198"
	)
	void method7790(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	static void method7798(int var0) {
		class484.field5048 = var0;
		class427.field4776 = new class427[var0];
		class427.field4775 = 0;
	}

	@ObfuscatedName("ay")
	static int method7804(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
