import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1250608515
	)
	public int field5022;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1708643547
	)
	public int field5014;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 982727179
	)
	public int field5015;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 271674167
	)
	public int field5016;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1340799213
	)
	public int field5013;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1940473067
	)
	public int field5018;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -161342641
	)
	public int field5019;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 956929989
	)
	public int field5020;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1448669761
	)
	public int field5017;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1408313799
	)
	public int field5021;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1621222091
	)
	public int field5023;

	public GraphicsDefaults() {
		this.field5022 = -1;
		this.field5014 = -1;
		this.field5015 = -1;
		this.field5016 = -1;
		this.field5013 = -1;
		this.field5018 = -1;
		this.field5019 = -1;
		this.field5020 = -1;
		this.field5017 = -1;
		this.field5021 = -1;
		this.field5023 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5011.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.field5022 = var3.readNullableLargeSmart();
				this.field5014 = var3.readNullableLargeSmart();
				this.field5015 = var3.readNullableLargeSmart();
				this.field5016 = var3.readNullableLargeSmart();
				this.field5013 = var3.readNullableLargeSmart();
				this.field5018 = var3.readNullableLargeSmart();
				this.field5019 = var3.readNullableLargeSmart();
				this.field5020 = var3.readNullableLargeSmart();
				this.field5017 = var3.readNullableLargeSmart();
				this.field5021 = var3.readNullableLargeSmart();
				this.field5023 = var3.readNullableLargeSmart();
			}
		}
	}
}
