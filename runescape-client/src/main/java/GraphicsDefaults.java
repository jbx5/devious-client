import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nz")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1135268835)
	@Export("compass")
	public int compass = -1;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -2134294425)
	public int field4366 = -1;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 347744275)
	@Export("mapScenes")
	public int mapScenes = -1;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1554196661)
	@Export("headIconsPk")
	public int headIconsPk = -1;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 557907727)
	public int field4370 = -1;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1928213369)
	public int field4369 = -1;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1582876983)
	public int field4371 = -1;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 823602837)
	public int field4373 = -1;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 2013848631)
	public int field4374 = -1;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -431849749)
	public int field4375 = -1;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1535977443)
	public int field4376 = -1;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lls;I)V", garbageValue = "-1316765164")
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4365.group);
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
					this.field4366 = var3.readNullableLargeSmart();
					this.mapScenes = var3.readNullableLargeSmart();
					this.headIconsPk = var3.readNullableLargeSmart();
					this.field4370 = var3.readNullableLargeSmart();
					this.field4369 = var3.readNullableLargeSmart();
					this.field4371 = var3.readNullableLargeSmart();
					this.field4373 = var3.readNullableLargeSmart();
					this.field4374 = var3.readNullableLargeSmart();
					this.field4375 = var3.readNullableLargeSmart();
					this.field4376 = var3.readNullableLargeSmart();
			}
		} 
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IS)J", garbageValue = "12937")
	public static long method6842(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}
}