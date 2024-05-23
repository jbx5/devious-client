import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class262 {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILnj;ZI)V",
		garbageValue = "357383258"
	)
	static void method5172(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class142.getWorldMap().getMapArea(var0);
		int var4 = class17.localPlayer.plane;
		int var5 = (class17.localPlayer.x >> 7) + class358.scene.field1337;
		int var6 = (class17.localPlayer.y >> 7) + class358.scene.field1333;
		Coord var7 = new Coord(var4, var5, var6);
		class142.getWorldMap().method9131(var3, var7, var1, var2);
	}
}
