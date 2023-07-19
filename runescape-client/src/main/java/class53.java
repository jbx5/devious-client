import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class53 extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	class47 field391;

	public class53() {
		this.field391 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcz;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field391 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbi;)V"
	)
	public class53(RawSound var1) {
		this.field391 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean method1092() {
		return this.field391 == null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lbi;",
		garbageValue = "7"
	)
	public RawSound method1090() {
		if (this.field391 != null && this.field391.field355.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1095();
			} finally {
				this.field391.field355.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lbi;",
		garbageValue = "49"
	)
	public RawSound method1098() {
		if (this.field391 != null) {
			this.field391.field355.lock();

			RawSound var1;
			try {
				var1 = this.method1095();
			} finally {
				this.field391.field355.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lbi;",
		garbageValue = "1214181090"
	)
	RawSound method1095() {
		if (this.field391.field354 == null) {
			this.field391.field354 = this.field391.field358.toRawSound((int[])null);
			this.field391.field358 = null;
		}

		return this.field391.field354;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "102"
	)
	static final void method1105(PacketBuffer var0) {
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field601[++Client.field645 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field587[++Client.field801 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2592(var7, class218.field2384);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field587[++Client.field801 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							if (var0.readBits(1) == 1) {
								var7 = var0.readBits(3);
								var4.method2592(var7, class218.field2377);
								var8 = var0.readBits(3);
								var4.method2592(var8, class218.field2377);
							} else {
								var7 = var0.readBits(3);
								var4.method2592(var7, class218.field2378);
							}

							var7 = var0.readBits(1);
							if (var7 == 1) {
								Client.field587[++Client.field801 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field601[++Client.field645 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
