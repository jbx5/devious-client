import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("Sound")
public class Sound {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1588110941
	)
	public int field2244;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -296911909
	)
	public int field2242;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -375488911
	)
	public int field2241;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 118509621
	)
	public int field2243;

	Sound(int var1, int var2, int var3, int var4) {
		this.field2244 = 0;
		this.field2242 = 0;
		this.field2241 = 0;
		this.field2243 = 0;
		this.field2244 = var1;
		this.field2242 = var2;
		this.field2241 = var3;
		this.field2243 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lto;III)I",
		garbageValue = "1290495086"
	)
	static int method4074(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}
}
