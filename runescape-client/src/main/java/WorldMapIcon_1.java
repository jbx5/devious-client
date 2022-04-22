import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1439678685)

	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lgd;")

	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1837597233)

	@Export("element")
	int element;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lho;")

	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	129612535)

	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	325263315)

	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(descriptor = 
	"(Lks;Lks;ILgd;)V")

	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1679326087")

	@Export("init")
	void init() {
		this.element = class146.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(UserComparator7.WorldMapElement_get(this.element));
		WorldMapElement var1 = UserComparator7.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"364835409")

	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)Lho;", garbageValue = 
	"-32")

	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-915724910")

	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1982860019")

	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;IB)Ljava/lang/String;", garbageValue = 
	"50")

	static String method3933(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class282.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class118.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}