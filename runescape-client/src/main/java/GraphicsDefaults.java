import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -398409035
	)
	public int field4779;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2015592873
	)
	public int field4777;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -822751905
	)
	public int field4778;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 905466573
	)
	public int field4780;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -560317585
	)
	public int field4781;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -556656433
	)
	public int field4782;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 426105977
	)
	public int field4783;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -120237913
	)
	public int field4784;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1574535963
	)
	public int field4785;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -893651681
	)
	public int field4786;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1790591485
	)
	public int field4787;

	public GraphicsDefaults() {
		this.field4779 = -1;
		this.field4777 = -1;
		this.field4778 = -1;
		this.field4780 = -1;
		this.field4781 = -1;
		this.field4782 = -1;
		this.field4783 = -1;
		this.field4784 = -1;
		this.field4785 = -1;
		this.field4786 = -1;
		this.field4787 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "1070261436"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4776.group);
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
				this.field4779 = var3.readNullableLargeSmart();
				this.field4777 = var3.readNullableLargeSmart();
				this.field4778 = var3.readNullableLargeSmart();
				this.field4780 = var3.readNullableLargeSmart();
				this.field4781 = var3.readNullableLargeSmart();
				this.field4782 = var3.readNullableLargeSmart();
				this.field4783 = var3.readNullableLargeSmart();
				this.field4784 = var3.readNullableLargeSmart();
				this.field4785 = var3.readNullableLargeSmart();
				this.field4786 = var3.readNullableLargeSmart();
				this.field4787 = var3.readNullableLargeSmart();
			}
		}
	}
}
