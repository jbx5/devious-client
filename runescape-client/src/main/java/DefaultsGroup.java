import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static final DefaultsGroup field4406;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1327422695
	)
	@Export("group")
	final int group;

	static {
		field4406 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "126"
	)
	public static int method7084(int var0) {
		return class403.field4486[var0 & 16383]; // L: 37
	}
}
