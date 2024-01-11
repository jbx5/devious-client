import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class388 {
	@ObfuscatedName("aq")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;

	static {
		new HashMap();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V",
		garbageValue = "632783225"
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
		int var8;
		int var9;
		int var10;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var10 = Players.Players_indices[var4];
			if ((Players.field1355[var10] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1355;
					var10000[var10] = (byte)(var10000[var10] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var8 = var0.readBits(2);
						if (var8 == 0) {
							var9 = 0;
						} else if (var8 == 1) {
							var9 = var0.readBits(5);
						} else if (var8 == 2) {
							var9 = var0.readBits(8);
						} else {
							var9 = var0.readBits(11);
						}

						var3 = var9;
						var10000 = Players.field1355;
						var10000[var10] = (byte)(var10000[var10] | 2);
					} else {
						class513.readPlayerUpdate(var0, var10);
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
				var10 = Players.Players_indices[var4];
				if ((Players.field1355[var10] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1355;
						var10000[var10] = (byte)(var10000[var10] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var8 = var0.readBits(2);
							if (var8 == 0) {
								var9 = 0;
							} else if (var8 == 1) {
								var9 = var0.readBits(5);
							} else if (var8 == 2) {
								var9 = var0.readBits(8);
							} else {
								var9 = var0.readBits(11);
							}

							var3 = var9;
							var10000 = Players.field1355;
							var10000[var10] = (byte)(var10000[var10] | 2);
						} else {
							class513.readPlayerUpdate(var0, var10);
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
					var10 = Players.Players_emptyIndices[var4];
					if ((Players.field1355[var10] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1355;
							var10000[var10] = (byte)(var10000[var10] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var8 = var0.readBits(2);
								if (var8 == 0) {
									var9 = 0;
								} else if (var8 == 1) {
									var9 = var0.readBits(5);
								} else if (var8 == 2) {
									var9 = var0.readBits(8);
								} else {
									var9 = var0.readBits(11);
								}

								var3 = var9;
								var10000 = Players.field1355;
								var10000[var10] = (byte)(var10000[var10] | 2);
							} else if (Players.updateExternalPlayer(var0, var10)) {
								var10000 = Players.field1355;
								var10000[var10] = (byte)(var10000[var10] | 2);
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
						var10 = Players.Players_emptyIndices[var4];
						if ((Players.field1355[var10] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1355;
								var10000[var10] = (byte)(var10000[var10] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var8 = var0.readBits(2);
									if (var8 == 0) {
										var9 = 0;
									} else if (var8 == 1) {
										var9 = var0.readBits(5);
									} else if (var8 == 2) {
										var9 = var0.readBits(8);
									} else {
										var9 = var0.readBits(11);
									}

									var3 = var9;
									var10000 = Players.field1355;
									var10000[var10] = (byte)(var10000[var10] | 2);
								} else if (Players.updateExternalPlayer(var0, var10)) {
									var10000 = Players.field1355;
									var10000[var10] = (byte)(var10000[var10] | 2);
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
							var10000 = Players.field1355;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						SoundSystem.method877(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}
}
