import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fw")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("ep")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive14")
	static Archive archive14;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1151809051)
	@Export("size")
	public int size = 0;

	InvDefinition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "98")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "91")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "852275444")
	static final boolean method3337(int var0, int var1) {
		ObjectComposition var2 = WorldMapDecoration.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}
		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}
		return var2.method3643(var1);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "24")
	static final void method3336() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;
		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				AbstractByteArrayCopier.updateActorSequence(var3, 1);
			}
		}
	}
}