import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 234342989
	)
	public int field4750;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 562110457
	)
	public int field4742;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 780654691
	)
	public int field4743;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 13694239
	)
	public int field4746;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1311751279
	)
	public int field4741;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1701390641
	)
	public int field4745;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 743179747
	)
	public int field4747;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -33272705
	)
	public int field4748;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1954789009
	)
	public int field4749;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1432931155
	)
	public int field4744;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -3788465
	)
	public int field4751;

	public GraphicsDefaults() {
		this.field4750 = -1;
		this.field4742 = -1;
		this.field4743 = -1;
		this.field4746 = -1;
		this.field4741 = -1;
		this.field4745 = -1;
		this.field4747 = -1;
		this.field4748 = -1;
		this.field4749 = -1;
		this.field4744 = -1;
		this.field4751 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;B)V",
		garbageValue = "78"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4737.group);
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
				this.field4750 = var3.readNullableLargeSmart();
				this.field4742 = var3.readNullableLargeSmart();
				this.field4743 = var3.readNullableLargeSmart();
				this.field4746 = var3.readNullableLargeSmart();
				this.field4741 = var3.readNullableLargeSmart();
				this.field4745 = var3.readNullableLargeSmart();
				this.field4747 = var3.readNullableLargeSmart();
				this.field4748 = var3.readNullableLargeSmart();
				this.field4749 = var3.readNullableLargeSmart();
				this.field4744 = var3.readNullableLargeSmart();
				this.field4751 = var3.readNullableLargeSmart();
			}
		}
	}
}
