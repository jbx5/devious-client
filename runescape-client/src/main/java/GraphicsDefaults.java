import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1821901531
	)
	public int field4819;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 244808111
	)
	public int field4810;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1826702085
	)
	public int field4812;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1086505839
	)
	public int field4813;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 3231833
	)
	public int field4814;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1816914193
	)
	public int field4815;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 495093499
	)
	public int field4822;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -86590753
	)
	public int field4817;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -65609895
	)
	public int field4818;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 570021041
	)
	public int field4816;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1636619237
	)
	public int field4820;

	public GraphicsDefaults() {
		this.field4819 = -1;
		this.field4810 = -1;
		this.field4812 = -1;
		this.field4813 = -1;
		this.field4814 = -1;
		this.field4815 = -1;
		this.field4822 = -1;
		this.field4817 = -1;
		this.field4818 = -1;
		this.field4816 = -1;
		this.field4820 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "1825537488"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4808.group);
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
				this.field4819 = var3.readNullableLargeSmart();
				this.field4810 = var3.readNullableLargeSmart();
				this.field4812 = var3.readNullableLargeSmart();
				this.field4813 = var3.readNullableLargeSmart();
				this.field4814 = var3.readNullableLargeSmart();
				this.field4815 = var3.readNullableLargeSmart();
				this.field4822 = var3.readNullableLargeSmart();
				this.field4817 = var3.readNullableLargeSmart();
				this.field4818 = var3.readNullableLargeSmart();
				this.field4816 = var3.readNullableLargeSmart();
				this.field4820 = var3.readNullableLargeSmart();
			}
		}
	}
}
