import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1134648057
	)
	public int field5005;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1402834671
	)
	public int field4996;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1610412827
	)
	public int field4997;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1296992905
	)
	public int field4998;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1213122369
	)
	public int field4995;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 100256007
	)
	public int field5000;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 757558881
	)
	public int field4999;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 330306973
	)
	public int field5002;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 844725015
	)
	public int field5003;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1634521083
	)
	public int field5001;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -787232275
	)
	public int field5004;

	public GraphicsDefaults() {
		this.field5005 = -1;
		this.field4996 = -1;
		this.field4997 = -1;
		this.field4998 = -1;
		this.field4995 = -1;
		this.field5000 = -1;
		this.field4999 = -1;
		this.field5002 = -1;
		this.field5003 = -1;
		this.field5001 = -1;
		this.field5004 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;B)V",
		garbageValue = "22"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4991.group);
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
				this.field5005 = var3.readNullableLargeSmart();
				this.field4996 = var3.readNullableLargeSmart();
				this.field4997 = var3.readNullableLargeSmart();
				this.field4998 = var3.readNullableLargeSmart();
				this.field4995 = var3.readNullableLargeSmart();
				this.field5000 = var3.readNullableLargeSmart();
				this.field4999 = var3.readNullableLargeSmart();
				this.field5002 = var3.readNullableLargeSmart();
				this.field5003 = var3.readNullableLargeSmart();
				this.field5001 = var3.readNullableLargeSmart();
				this.field5004 = var3.readNullableLargeSmart();
			}
		}
	}
}
