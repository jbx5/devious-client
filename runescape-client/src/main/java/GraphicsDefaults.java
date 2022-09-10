import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2070250657
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 174756829
	)
	public int field4408;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2076394261
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1807216755
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 508832797
	)
	public int field4411;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -386379673
	)
	public int field4417;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -610848783
	)
	public int field4407;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2141391655
	)
	public int field4413;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -63756691
	)
	public int field4414;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2093335225
	)
	public int field4416;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1786337157
	)
	public int field4415;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4408 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4411 = -1; // L: 11
		this.field4417 = -1; // L: 12
		this.field4407 = -1; // L: 13
		this.field4413 = -1; // L: 14
		this.field4414 = -1; // L: 15
		this.field4416 = -1; // L: 16
		this.field4415 = -1; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)V",
		garbageValue = "762347808"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4406.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return;
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 28
				break;
			case 2:
				this.compass = var3.readNullableLargeSmart(); // L: 33
				this.field4408 = var3.readNullableLargeSmart(); // L: 34
				this.mapScenes = var3.readNullableLargeSmart(); // L: 35
				this.headIconsPk = var3.readNullableLargeSmart(); // L: 36
				this.field4411 = var3.readNullableLargeSmart(); // L: 37
				this.field4417 = var3.readNullableLargeSmart(); // L: 38
				this.field4407 = var3.readNullableLargeSmart(); // L: 39
				this.field4413 = var3.readNullableLargeSmart(); // L: 40
				this.field4414 = var3.readNullableLargeSmart(); // L: 41
				this.field4416 = var3.readNullableLargeSmart(); // L: 42
				this.field4415 = var3.readNullableLargeSmart(); // L: 43
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "403048585"
	)
	public static void method7089(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 51
	} // L: 52
}
