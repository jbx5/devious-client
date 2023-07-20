import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class130 {
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1809009851
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("aw")
	boolean field1532;
	@ObfuscatedName("ay")
	boolean field1533;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	class128 field1534;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	class128 field1547;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lev;"
	)
	class125[] field1536;
	@ObfuscatedName("aj")
	boolean field1543;
	@ObfuscatedName("ag")
	float field1538;
	@ObfuscatedName("az")
	float field1535;
	@ObfuscatedName("av")
	float field1540;
	@ObfuscatedName("ap")
	float field1541;
	@ObfuscatedName("aq")
	float field1542;
	@ObfuscatedName("at")
	float field1550;
	@ObfuscatedName("ah")
	float field1544;
	@ObfuscatedName("ax")
	float field1553;
	@ObfuscatedName("aa")
	float field1546;
	@ObfuscatedName("au")
	float field1537;
	@ObfuscatedName("ae")
	boolean field1548;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -98448525
	)
	int field1549;
	@ObfuscatedName("ad")
	float[] field1545;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1507953149
	)
	int field1551;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1365091723
	)
	int field1552;
	@ObfuscatedName("ak")
	float field1539;
	@ObfuscatedName("an")
	float field1554;

	class130() {
		this.field1548 = true;
		this.field1549 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)I",
		garbageValue = "123"
	)
	int method2991(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		AttackOption.method2668(var1.readUnsignedByte());
		this.field1534 = class74.method2086(var1.readUnsignedByte());
		this.field1547 = class74.method2086(var1.readUnsignedByte());
		this.field1532 = var1.readUnsignedByte() != 0;
		this.field1536 = new class125[var3];
		class125 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class125 var6 = new class125();
			var6.method2919(var1, var2);
			this.field1536[var5] = var6;
			if (var4 != null) {
				var4.field1485 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-725467027"
	)
	void method2992() {
		this.field1551 = this.field1536[0].field1483;
		this.field1552 = this.field1536[this.method2999() - 1].field1483;
		this.field1545 = new float[this.method2996() + 1];

		for (int var1 = this.method3009(); var1 <= this.method2995(); ++var1) {
			this.field1545[var1 - this.method3009()] = ApproximateRouteStrategy.method1245(this, (float)var1);
		}

		this.field1536 = null;
		this.field1539 = ApproximateRouteStrategy.method1245(this, (float)(this.method3009() - 1));
		this.field1554 = ApproximateRouteStrategy.method1245(this, (float)(this.method2995() + 1));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1628852517"
	)
	public float method2993(int var1) {
		if (var1 < this.method3009()) {
			return this.field1539;
		} else {
			return var1 > this.method2995() ? this.field1554 : this.field1545[var1 - this.method3009()];
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method3009() {
		return this.field1551;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1597544274"
	)
	int method2995() {
		return this.field1552;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "606654204"
	)
	int method2996() {
		return this.method2995() - this.method3009();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1218924507"
	)
	int method2997(float var1) {
		if (this.field1549 < 0 || (float)this.field1536[this.field1549].field1483 > var1 || this.field1536[this.field1549].field1485 != null && (float)this.field1536[this.field1549].field1485.field1483 <= var1) {
			if (var1 >= (float)this.method3009() && var1 <= (float)this.method2995()) {
				int var2 = this.method2999();
				int var3 = this.field1549;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1536[var6].field1483) {
							if (var1 > (float)this.field1536[var6 - 1].field1483) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1536[var6].field1483) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1536[var6 + 1].field1483) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1549) {
					this.field1549 = var3;
					this.field1548 = true;
				}

				return this.field1549;
			} else {
				return -1;
			}
		} else {
			return this.field1549;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)Lev;",
		garbageValue = "-487533983"
	)
	class125 method2998(float var1) {
		int var2 = this.method2997(var1);
		return var2 >= 0 && var2 < this.field1536.length ? this.field1536[var2] : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method2999() {
		return this.field1536 == null ? 0 : this.field1536.length;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "685705935"
	)
	public static PacketBufferNode method3005() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}
}
