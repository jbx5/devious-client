import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ac")
	@Export("state")
	byte state;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1153673121
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1825403129
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -198478463
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2120300859
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1073487467
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lvf;Z)V",
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
		garbageValue = "-47"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "88"
	)
	void method7702(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-656070241"
	)
	void method7703(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "814269094"
	)
	static final void method7712() {
		if (HealthBarConfig.pcmPlayer1 != null) {
			HealthBarConfig.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lva;B)V",
		garbageValue = "-19"
	)
	static final void method7697(WorldView var0, PacketBuffer var1) {
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		if (var2 < var0.npcCount) {
			for (var3 = var2; var3 < var0.npcCount; ++var3) {
				Client.field526[++Client.field525 - 1] = var0.npcIndices[var3];
			}
		}

		if (var2 > var0.npcCount) {
			throw new RuntimeException("");
		} else {
			var0.npcCount = 0;

			for (var3 = 0; var3 < var2; ++var3) {
				int var4 = var0.npcIndices[var3];
				NPC var5 = var0.npcs[var4];
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					var0.npcIndices[++var0.npcCount - 1] = var4;
					var5.npcCycle = Client.cycle;
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						var0.npcIndices[++var0.npcCount - 1] = var4;
						var5.npcCycle = Client.cycle;
						Client.npcIndices[++Client.npcCount - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							var0.npcIndices[++var0.npcCount - 1] = var4;
							var5.npcCycle = Client.cycle;
							var8 = var1.readBits(3);
							var5.method2877(var8, MoveSpeed.field3036);
							var9 = var1.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 2) {
							var0.npcIndices[++var0.npcCount - 1] = var4;
							var5.npcCycle = Client.cycle;
							if (var1.readBits(1) == 1) {
								var8 = var1.readBits(3);
								var5.method2877(var8, MoveSpeed.field3039);
								var9 = var1.readBits(3);
								var5.method2877(var9, MoveSpeed.field3039);
							} else {
								var8 = var1.readBits(3);
								var5.method2877(var8, MoveSpeed.field3037);
							}

							var8 = var1.readBits(1);
							if (var8 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field526[++Client.field525 - 1] = var4;
						}
					}
				}
			}

		}
	}
}
