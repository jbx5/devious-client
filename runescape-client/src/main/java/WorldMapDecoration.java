import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1012475959
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -845609081
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -41251379
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Ldw;II)V",
		garbageValue = "175237606"
	)
	static void method6285(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2727(var0);
		int var5 = var1.x;
		int var6 = var1.field1220 - 1;
		int var4 = var5 + (var6 << 6);
		int var9 = var1.y;
		int var10 = var1.field1220 - 1;
		int var8 = var9 + (var10 << 6);
		class150.worldToScreen(var0, var3.x, var3.y, var4, var8, var2);
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "39"
	)
	static boolean method6286(int var0, int var1, int var2, int var3, int var4, int var5) {
		return HealthBarConfig.method2961(class344.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
