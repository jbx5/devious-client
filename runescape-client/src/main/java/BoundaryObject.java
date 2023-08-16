import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1162218027
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1928295169
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2005175761
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1628547661
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1499438365
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -4244623663237435829L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1002689579
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "1066903143"
	)
	static boolean method5025(String var0, int var1) {
		return class299.method5716(var0, var1, "openjs");
	}
}
