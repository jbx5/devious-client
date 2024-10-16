import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 383832337
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -592519003
	)
	@Export("health")
	int health;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -147271595
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 631943229
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "371888269"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	public static void method2774() {
		class179.field1915.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1837779746"
	)
	static void method2776(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class151.field1708, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1730691614"
	)
	static final void method2777() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own ignore list";
		class430.addGameMessage(30, "", var0);
	}
}
