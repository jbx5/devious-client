import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -934384653
	)
	public int field4996;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -553814125
	)
	public int field4988;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1446419837
	)
	public int field4987;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1995625871
	)
	public int field4989;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1147860825
	)
	public int field4991;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -896320569
	)
	public int field4992;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 245838707
	)
	public int field4993;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1308576767
	)
	public int field4990;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 321067199
	)
	public int field4995;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -587298351
	)
	public int field4994;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1843887941
	)
	public int field4997;

	public GraphicsDefaults() {
		this.field4996 = -1;
		this.field4988 = -1;
		this.field4987 = -1;
		this.field4989 = -1;
		this.field4991 = -1;
		this.field4992 = -1;
		this.field4993 = -1;
		this.field4990 = -1;
		this.field4995 = -1;
		this.field4994 = -1;
		this.field4997 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;I)V",
		garbageValue = "-1596481386"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4986.group);
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
				this.field4996 = var3.readNullableLargeSmart();
				this.field4988 = var3.readNullableLargeSmart();
				this.field4987 = var3.readNullableLargeSmart();
				this.field4989 = var3.readNullableLargeSmart();
				this.field4991 = var3.readNullableLargeSmart();
				this.field4992 = var3.readNullableLargeSmart();
				this.field4993 = var3.readNullableLargeSmart();
				this.field4990 = var3.readNullableLargeSmart();
				this.field4995 = var3.readNullableLargeSmart();
				this.field4994 = var3.readNullableLargeSmart();
				this.field4997 = var3.readNullableLargeSmart();
			}
		}
	}
}
