import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-1255726150"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321566272"
	)
	static void method2866() {
		synchronized(ArchiveDiskActionHandler.field4259) {
			if (ArchiveDiskActionHandler.field4257 == 0) {
				class167.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class167.ArchiveDiskActionHandler_thread.setDaemon(true);
				class167.ArchiveDiskActionHandler_thread.start();
				class167.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4257 = 600;
			ArchiveDiskActionHandler.field4261 = false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lto;II)V",
		garbageValue = "-32046829"
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
			if ((Players.field1387[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1387;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = class20.method305(var0);
						var10000 = Players.field1387;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						AbstractArchive.readPlayerUpdate(var0, var7);
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
				if ((Players.field1387[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1387;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = class20.method305(var0);
							var10000 = Players.field1387;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							AbstractArchive.readPlayerUpdate(var0, var7);
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
					if ((Players.field1387[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1387;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = class20.method305(var0);
								var10000 = Players.field1387;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (KitDefinition.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1387;
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
						if ((Players.field1387[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1387;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = class20.method305(var0);
									var10000 = Players.field1387;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (KitDefinition.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1387;
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
							var10000 = Players.field1387;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						class85.method2275(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	static final void method2870(String var0) {
		MouseHandler.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-33"
	)
	static final int method2875(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-1798702842"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuItemIds[Client.menuOptionsCount] = var6;
				Client.menuShiftClick[Client.menuOptionsCount] = var7;
				++Client.menuOptionsCount;
			}

		}
	}
}
