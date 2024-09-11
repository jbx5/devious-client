import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ie")
@Implements("Sound")
public class Sound {
	@ObfuscatedName("aa")
	static String[] field2165;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1503385865
	)
	public int field2168;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1707820073
	)
	public int field2164;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 341204635
	)
	public int field2166;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2041095673
	)
	public int field2167;

	Sound(int var1, int var2, int var3, int var4) {
		this.field2168 = 0;
		this.field2164 = 0;
		this.field2166 = 0;
		this.field2167 = 0;
		this.field2168 = var1;
		this.field2164 = var2;
		this.field2166 = var3;
		this.field2167 = var4;
	}
}
