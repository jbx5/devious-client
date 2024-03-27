import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field308;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -1490751183
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field305;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field309;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field309 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field305 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbr;",
		garbageValue = "1763738474"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method827(var1, var2, false);
		class53 var6 = (class53)this.field309.get(var4);
		if (var6 != null) {
			return var6.method1044();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field309.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lcj;",
		garbageValue = "-199146739"
	)
	class53 method832(int var1, int var2) {
		long var3 = this.method827(var1, var2, true);
		class53 var5 = (class53)this.field309.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field305, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field309.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbr;",
		garbageValue = "-28"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Lcj;",
		garbageValue = "1769"
	)
	public class53 method834(int var1) {
		if (this.field305.getGroupCount() == 1) {
			return this.method832(0, var1);
		} else if (this.field305.getGroupFileCount(var1) == 1) {
			return this.method832(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbr;",
		garbageValue = "-42"
	)
	public RawSound method826(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "123"
	)
	long method827(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	static void method821() {
		if (ModeWhere.worldMap != null) {
			ModeWhere.worldMap.method8719(class172.Client_plane, GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7), DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7), false);
			ModeWhere.worldMap.loadCache();
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "350310469"
	)
	static final void method836(PacketBuffer var0) {
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field643[++Client.field637 - 1] = Client.npcIndices[var2];
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
						Client.field742[++Client.field571 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2585(var7, class233.field2486);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field742[++Client.field571 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							if (var0.readBits(1) == 1) {
								var7 = var0.readBits(3);
								var4.method2585(var7, class233.field2485);
								var8 = var0.readBits(3);
								var4.method2585(var8, class233.field2485);
							} else {
								var7 = var0.readBits(3);
								var4.method2585(var7, class233.field2483);
							}

							var7 = var0.readBits(1);
							if (var7 == 1) {
								Client.field742[++Client.field571 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field643[++Client.field637 - 1] = var3;
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1001279696"
	)
	static void method843(NPC var0) {
		var0.field1249 = var0.definition.size;
		var0.field1268 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2117;
		var0.field1213 = var0.definition.field2105;
		var0.field1214 = var0.definition.field2119;
		var0.field1215 = var0.definition.field2111;
		var0.field1264 = var0.definition.field2121;
		var0.field1269 = var0.definition.field2122;
		var0.field1218 = var0.definition.field2123;
		var0.field1226 = var0.definition.field2124;
	}
}
