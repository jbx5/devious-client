import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-187868113)

	@Export("swColor")
	int swColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1925508175)

	@Export("seColor")
	int seColor;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	221101905)

	@Export("neColor")
	int neColor;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	794090973)

	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1756727001)

	@Export("texture")
	int texture;
	@ObfuscatedName("n")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	587137313)

	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-691234429")

	static int method4500(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return -1;
		} else {
			return (var1 >= 0) && (var1 < var2.ids.length) ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"79")

	static void method4499() {
		for (InterfaceParent var0 = ((InterfaceParent) (Client.interfaceParents.first())); var0 != null; var0 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			int var1 = var0.group;
			if (MusicPatchNode2.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = EnumComposition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = ((int) (var0.key));
					Widget var5 = HorizontalAlignment.getWidget(var4);
					if (var5 != null) {
						class290.invalidateWidget(var5);
					}
				}
			}
		}

	}
}