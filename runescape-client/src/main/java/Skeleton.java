import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gn")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1781728495)
	@Export("id")
	int id;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1946555143)
	@Export("count")
	int count;

	@ObfuscatedName("j")
	@Export("transformTypes")
	int[] transformTypes;

	@ObfuscatedName("h")
	@Export("labels")
	int[][] labels;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lgj;")
	class201 field2361;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];
		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}
		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}
		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}
		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2361 = new class201(var3, var4);
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "236")
	public int method4101() {
		return this.count;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lgj;", garbageValue = "1699942506")
	public class201 method4103() {
		return this.field2361;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "1")
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1202 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}
						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}
					long var5 = class394.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					Decimator.scene.drawEntity(FriendSystem.Client_plane, var2.x, var2.y, SecureRandomFuture.getTileHeight(var2.field1202 * 64 - 64 + var2.x, var2.field1202 * 64 - 64 + var2.y, FriendSystem.Client_plane), var2.field1202 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}
	}
}