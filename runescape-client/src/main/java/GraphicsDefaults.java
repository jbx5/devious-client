import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1983818083
	)
	public int field5057;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1599649279
	)
	public int field5055;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 906048063
	)
	public int field5056;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -853870695
	)
	public int field5068;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1304017327
	)
	public int field5069;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -322214647
	)
	public int field5059;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1250002863
	)
	public int field5060;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 95516609
	)
	public int field5065;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -489611797
	)
	public int field5062;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1078464317
	)
	public int field5063;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1457705109
	)
	public int field5064;
	@ObfuscatedName("ad")
	final int field5058;
	@ObfuscatedName("ah")
	final int field5066;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5061;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5067;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5054;
	@ObfuscatedName("aa")
	public final int[][] field5070;

	public GraphicsDefaults() {
		this.field5057 = -1;
		this.field5055 = -1;
		this.field5056 = -1;
		this.field5068 = -1;
		this.field5069 = -1;
		this.field5059 = -1;
		this.field5060 = -1;
		this.field5065 = -1;
		this.field5062 = -1;
		this.field5063 = -1;
		this.field5064 = -1;
		this.field5058 = 1;
		this.field5066 = 2;
		this.field5061 = 1;
		this.field5067 = 1;
		this.field5054 = 1;
		this.field5070 = new int[3][5];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;I)V",
		garbageValue = "1177389662"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5050.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
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
					this.field5057 = var3.readNullableLargeSmart();
					this.field5055 = var3.readNullableLargeSmart();
					this.field5056 = var3.readNullableLargeSmart();
					this.field5068 = var3.readNullableLargeSmart();
					this.field5069 = var3.readNullableLargeSmart();
					this.field5059 = var3.readNullableLargeSmart();
					this.field5060 = var3.readNullableLargeSmart();
					this.field5065 = var3.readNullableLargeSmart();
					this.field5062 = var3.readNullableLargeSmart();
					this.field5063 = var3.readNullableLargeSmart();
					this.field5064 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5070.length; ++var5) {
						for (int var6 = 0; var6 < this.field5070[var5].length; ++var6) {
							this.field5070[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}
}
