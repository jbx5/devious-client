import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -191509293
	)
	public int field4851;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -24180197
	)
	public int field4843;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 17135311
	)
	public int field4842;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -125252255
	)
	public int field4845;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1619634005
	)
	public int field4846;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1239483877
	)
	public int field4844;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 380574345
	)
	public int field4848;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 97624847
	)
	public int field4849;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1581329471
	)
	public int field4850;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1387626867
	)
	public int field4847;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1558813875
	)
	public int field4852;

	public GraphicsDefaults() {
		this.field4851 = -1;
		this.field4843 = -1;
		this.field4842 = -1;
		this.field4845 = -1;
		this.field4846 = -1;
		this.field4844 = -1;
		this.field4848 = -1;
		this.field4849 = -1;
		this.field4850 = -1;
		this.field4847 = -1;
		this.field4852 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "-9"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4840.group);
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
				this.field4851 = var3.readNullableLargeSmart();
				this.field4843 = var3.readNullableLargeSmart();
				this.field4842 = var3.readNullableLargeSmart();
				this.field4845 = var3.readNullableLargeSmart();
				this.field4846 = var3.readNullableLargeSmart();
				this.field4844 = var3.readNullableLargeSmart();
				this.field4848 = var3.readNullableLargeSmart();
				this.field4849 = var3.readNullableLargeSmart();
				this.field4850 = var3.readNullableLargeSmart();
				this.field4847 = var3.readNullableLargeSmart();
				this.field4852 = var3.readNullableLargeSmart();
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "893721568"
	)
	public static int[] method8340(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var1 = new int[var0.length];

			for (int var2 = 0; var2 < var0.length; ++var2) {
				if (var0[var2] < 0 || var0[var2] > class558.field5385.length) {
					return null;
				}

				var1[var2] = class558.field5385[var0[var2]];
			}

			return var1;
		} else {
			return null;
		}
	}
}
