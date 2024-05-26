import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 922606951
	)
	public static int field2003;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 50356669
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1805975731"
	)
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-161821348"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}
}
