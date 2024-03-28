import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class332 implements Comparator {
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1820050341
	)
	static int field3603;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -1537214849
	)
	static int field3602;

	class332() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;B)I",
		garbageValue = "0"
	)
	int method6229(class325 var1, class325 var2) {
		return var1.field3555 - var2.field3555;
	}

	public int compare(Object var1, Object var2) {
		return this.method6229((class325)var1, (class325)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "0"
	)
	static void method6230(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null;

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new PendingSpawn();
			var10.plane = var0;
			var10.type = var3;
			var10.x = var1;
			var10.y = var2;
			var10.field1192 = -1;
			WorldMapRectangle.method5683(var10);
			Client.pendingSpawns.addFirst(var10);
		}

		var10.field1198 = var4;
		var10.field1191 = var5;
		var10.field1190 = var6;
		var10.delay = var8;
		var10.hitpoints = var9;
		var10.method2387(var7);
	}
}
