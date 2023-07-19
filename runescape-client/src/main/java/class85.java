import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class85 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "2138211638"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1362[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1362;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = class141.method3120(var0);
						var10000 = Players.field1362;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						GrandExchangeOfferNameComparator.readPlayerUpdate(var0, var7);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1362[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1362;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = class141.method3120(var0);
							var10000 = Players.field1362;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							GrandExchangeOfferNameComparator.readPlayerUpdate(var0, var7);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1362[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1362;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = class141.method3120(var0);
								var10000 = Players.field1362;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (PlayerCompositionColorTextureOverride.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1362;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1362[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1362;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = class141.method3120(var0);
									var10000 = Players.field1362;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (PlayerCompositionColorTextureOverride.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1362;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1362;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						KeyHandler.method377(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lcx;",
		garbageValue = "1077626874"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}
}
