import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jt")
public class class260 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1980903392")
	public static boolean method5128() {
		return class273.musicPlayerStatus != 0 ? true : ItemContainer.midiPcmStream.isReady();
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-83")
	static final void method5127(int var0, int var1, int var2) {
		if (class16.cameraX < var0) {
			class16.cameraX = (var0 - class16.cameraX) * WorldMapData_1.field2759 / 1000 + class16.cameraX + class271.field3186;
			if (class16.cameraX > var0) {
				class16.cameraX = var0;
			}
		}
		if (class16.cameraX > var0) {
			class16.cameraX -= (class16.cameraX - var0) * WorldMapData_1.field2759 / 1000 + class271.field3186;
			if (class16.cameraX < var0) {
				class16.cameraX = var0;
			}
		}
		if (WorldMapLabel.cameraY < var1) {
			WorldMapLabel.cameraY = (var1 - WorldMapLabel.cameraY) * WorldMapData_1.field2759 / 1000 + WorldMapLabel.cameraY + class271.field3186;
			if (WorldMapLabel.cameraY > var1) {
				WorldMapLabel.cameraY = var1;
			}
		}
		if (WorldMapLabel.cameraY > var1) {
			WorldMapLabel.cameraY -= (WorldMapLabel.cameraY - var1) * WorldMapData_1.field2759 / 1000 + class271.field3186;
			if (WorldMapLabel.cameraY < var1) {
				WorldMapLabel.cameraY = var1;
			}
		}
		if (class269.cameraZ < var2) {
			class269.cameraZ = (var2 - class269.cameraZ) * WorldMapData_1.field2759 / 1000 + class269.cameraZ + class271.field3186;
			if (class269.cameraZ > var2) {
				class269.cameraZ = var2;
			}
		}
		if (class269.cameraZ > var2) {
			class269.cameraZ -= (class269.cameraZ - var2) * WorldMapData_1.field2759 / 1000 + class271.field3186;
			if (class269.cameraZ < var2) {
				class269.cameraZ = var2;
			}
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(descriptor = "(Lkn;I)Lkn;", garbageValue = "-1790407021")
	static Widget method5126(Widget var0) {
		Widget var2 = var0;
		int var3 = class134.method2860(class193.getWidgetFlags(var0));
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var4 = 0;
			while (true) {
				if (var4 >= var3) {
					var1 = var2;
					break;
				}
				var2 = HitSplatDefinition.getWidget(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}
				++var4;
			} 
		}
		Widget var5 = var1;
		if (var1 == null) {
			var5 = var0.parent;
		}
		return var5;
	}
}