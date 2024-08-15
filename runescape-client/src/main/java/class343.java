import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class343 implements Comparator {
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("decimator")
	static Decimator decimator;

	class343() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)I",
		garbageValue = "1469322675"
	)
	int method6475(class336 var1, class336 var2) {
		return var1.field3625 - var2.field3625;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6475((class336)var1, (class336)var2);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)Ltb;",
		garbageValue = "-745799041"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class219.worldMap;
	}
}
