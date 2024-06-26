import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dv")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("wz")
	@ObfuscatedGetter(
		intValue = -104451399
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -76246547
	)
	@Export("group")
	int group;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -546537661
	)
	@Export("type")
	int type;
	@ObfuscatedName("ag")
	boolean field1076;

	InterfaceParent() {
		this.field1076 = false;
	}
}
