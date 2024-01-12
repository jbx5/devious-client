import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class513 extends class471 implements class297 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	final AbstractArchive field5093;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	final DemotingHashTable field5094;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1015548917
	)
	final int field5095;

	@ObfuscatedSignature(
		descriptor = "(Lnd;ILol;Low;)V"
	)
	public class513(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5094 = new DemotingHashTable(64);
		this.field5093 = var4;
		this.field5095 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "1192439178"
	)
	protected class473 vmethod9206(int var1) {
		synchronized(this.field5094) {
			class472 var2 = (class472)this.field5094.get((long)var1);
			if (var2 == null) {
				var2 = this.method9200(var1);
				this.field5094.method5911(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsr;",
		garbageValue = "1"
	)
	class472 method9200(int var1) {
		byte[] var2 = this.field5093.takeFile(this.field5095, var1);
		class472 var3 = new class472(var1);
		if (var2 != null) {
			var3.method8669(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1557143999"
	)
	public void method9202() {
		synchronized(this.field5094) {
			this.field5094.clear();
		}
	}

	public Iterator iterator() {
		return new class512(this);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V",
		garbageValue = "790487425"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1124 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (WorldMapScaleHandler.baseY * 64 + var4.pathY[0] >> 13) + (HealthBarDefinition.baseX * 64 + var4.pathX[0] >> 13 << 14);
				if (var4.field1208 != -1) {
					Players.Players_orientations[var1] = var4.field1208;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					Players.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1124 = false;
				} else if (var2) {
					var4.field1124 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1124 = false;
					var4.method2429(var6, var7, Players.field1348[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1124 = false;
				} else if (var2) {
					var4.field1124 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1124 = false;
					var4.method2429(var6, var7, Players.field1348[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1124 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1124 = false;
							var4.method2429(var10, var11, Players.field1348[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1124 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						SecureUrlRequester.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (HealthBarDefinition.baseX * 64 + var8 + var4.pathX[0] & 16383) - HealthBarDefinition.baseX * 64;
					var11 = (WorldMapScaleHandler.baseY * 64 + var9 + var4.pathY[0] & 16383) - WorldMapScaleHandler.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1124 = false;
					} else if (var2) {
						var4.field1124 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1124 = false;
						var4.method2429(var10, var11, Players.field1348[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						SecureUrlRequester.Client_plane = var4.plane;
					}

				}
			}
		}
	}
}
