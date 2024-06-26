import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class27 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		longValue = 7494969623625651721L
	)
	static long field127;
	@ObfuscatedName("aj")
	int[] field120;
	@ObfuscatedName("av")
	int[] field126;

	public class27() {
		this.field120 = new int[112];
		this.field126 = new int[192];
		Arrays.fill(this.field120, 3);
		Arrays.fill(this.field126, 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-57596643"
	)
	public void method392(int var1, int var2) {
		if (this.method400(var1) && this.method402(var2)) {
			this.field120[var1] = var2;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-1566354354"
	)
	public void method393(char var1, int var2) {
		if (this.method401(var1) && this.method402(var2)) {
			this.field126[var1] = var2;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1534998510"
	)
	public int method404(int var1) {
		return this.method400(var1) ? this.field120[var1] : 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1201143155"
	)
	public int method395(char var1) {
		return this.method401(var1) ? this.field126[var1] : 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "103"
	)
	public boolean method396(int var1) {
		return this.method400(var1) && (this.field120[var1] == 1 || this.field120[var1] == 3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "895395220"
	)
	public boolean method397(char var1) {
		return this.method401(var1) && (this.field126[var1] == 1 || this.field126[var1] == 3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1293375893"
	)
	public boolean method398(int var1) {
		return this.method400(var1) && (this.field120[var1] == 2 || this.field120[var1] == 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "382394431"
	)
	public boolean method399(char var1) {
		return this.method401(var1) && (this.field126[var1] == 2 || this.field126[var1] == 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "632051655"
	)
	boolean method400(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-105"
	)
	boolean method401(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2077512194"
	)
	boolean method402(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "1"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + Tile.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZLug;I)V",
		garbageValue = "2146406282"
	)
	static final void method430(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					if (var0.npcs[var5] == null) {
						var0.npcs[var5] = new NPC();
						var6 = true;
					}

					NPC var7 = var0.npcs[var5];
					var0.npcIndices[++var0.npcCount - 1] = var5;
					var7.npcCycle = Client.cycle;
					boolean var11 = var2.readBits(1) == 1;
					if (var11) {
						var2.readBits(32);
					}

					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					int var12 = var2.readBits(1);
					if (var12 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					int var13 = Client.defaultRotations[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var13;
					}

					int var8 = var2.readBits(1);
					var7.definition = class76.getNpcDefinition(var2.readBits(14));
					class489.method8833(var7);
					if (var7.field1259 == 0) {
						var7.rotation = 0;
					}

					if (Client.field508 >= 222) {
						var7.method2704(var9 + class47.field314, var10 + HttpRequestTask.field86, var8 == 1);
						continue;
					}

					var7.method2704(SoundCache.localPlayer.pathX[0] + var9, SoundCache.localPlayer.pathY[0] + var10, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}
}
