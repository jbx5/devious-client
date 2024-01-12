import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dj")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 741933083
	)
	@Export("group")
	int group;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1839688211
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	boolean field1053;

	InterfaceParent() {
		this.field1053 = false;
	}
}
