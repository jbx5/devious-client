import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1552410659
	)
	public static int field1874;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("bg")
	static Image field1875;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1881;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -436943581
	)
	static int field1879;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1052630067
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-465096144"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "69"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-930414471"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
