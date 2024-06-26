import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("ag")
	@Export("type")
	char type;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -718097847
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ap")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("an")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1778069322"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "2019058669"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "74"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class380.method7096(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "68"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}
}
