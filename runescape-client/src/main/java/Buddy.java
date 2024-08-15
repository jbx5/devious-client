import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static class487 field4934;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -822428629
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1265531865
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1519908463
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "896785790"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "60"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1990026525"
	)
	static void method8736(String var0, String var1, String var2) {
		class532.updateLoginIndex(7);
		class130.setLoginResponseString(var0, var1, var2);
	}
}
