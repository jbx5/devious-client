import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("r")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Lat;", garbageValue = "776593126")
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)Lbc;", garbageValue = "1455168874")
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = WorldMapDecorationType.method5755(var1, var0);
		Script var4 = Client.method1636(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			var3 = class271.method5244(var2, var0);
			var4 = Client.method1636(var3, var0);
			return var4 != null ? var4 : null;
		}
	}
}