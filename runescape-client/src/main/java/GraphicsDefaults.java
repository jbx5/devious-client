import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -574375465)
	@Export("compass")
	public int compass = -1;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1982271929)
	public int field4378 = -1;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 366582553)
	@Export("mapScenes")
	public int mapScenes = -1;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1097573955)
	@Export("headIconsPk")
	public int headIconsPk = -1;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -77984305)
	public int field4381 = -1;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -990943999)
	public int field4388 = -1;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -504988893)
	public int field4377 = -1;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -783092915)
	public int field4384 = -1;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1562039901)
	public int field4383 = -1;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1813988143)
	public int field4386 = -1;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1185678015)
	public int field4385 = -1;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;I)V", garbageValue = "1550968028")
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4373.group);
		Buffer var3 = new Buffer(var2);
		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}
			switch (var4) {
				case 1 :
					var3.readMedium();
					break;
				case 2 :
					this.compass = var3.readNullableLargeSmart();
					this.field4378 = var3.readNullableLargeSmart();
					this.mapScenes = var3.readNullableLargeSmart();
					this.headIconsPk = var3.readNullableLargeSmart();
					this.field4381 = var3.readNullableLargeSmart();
					this.field4388 = var3.readNullableLargeSmart();
					this.field4377 = var3.readNullableLargeSmart();
					this.field4384 = var3.readNullableLargeSmart();
					this.field4383 = var3.readNullableLargeSmart();
					this.field4386 = var3.readNullableLargeSmart();
					this.field4385 = var3.readNullableLargeSmart();
			}
		} 
	}
}