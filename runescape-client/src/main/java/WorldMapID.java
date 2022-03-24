import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lid;")

	static final WorldMapID field2829;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lid;")

	static final WorldMapID field2826;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1857886715)

	@Export("value")
	final int value;
	static 
	{
		field2829 = new WorldMapID(0);
		field2826 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"91")

	public static void method5000(int var0) {
		if (var0 != (-1)) {
			if (Frames.Widget_loadedInterfaces[var0]) {
				class122.Widget_archive.clearFilesGroup(var0);
				if (EnumComposition.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < EnumComposition.Widget_interfaceComponents[var0].length; ++var2) {
						if (EnumComposition.Widget_interfaceComponents[var0][var2] != null) {
							if (EnumComposition.Widget_interfaceComponents[var0][var2].type != 2) {
								EnumComposition.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						EnumComposition.Widget_interfaceComponents[var0] = null;
					}

					Frames.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}