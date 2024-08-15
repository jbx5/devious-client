import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ab")
	@Export("state")
	byte state;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -642298157
	)
	@Export("id")
	public int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2101804471
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2118971907
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1407557
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1183135431
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lvg;Z)V",
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-4"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1987738313"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	void method7432(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-113"
	)
	void method7434(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lih;",
		garbageValue = "-1930219150"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1169649230"
	)
	public static int method7446(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "101"
	)
	static final int method7429(int var0) {
		return Math.abs(var0 - class264.cameraYaw) > 1024 ? var0 + (var0 < class264.cameraYaw ? 1 : -1) * 2048 : var0;
	}
}
