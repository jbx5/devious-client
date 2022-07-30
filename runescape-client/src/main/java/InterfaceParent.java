import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cd")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ljm;")
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 250284595)
	@Export("group")
	int group;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -310591839)
	@Export("type")
	int type;

	@ObfuscatedName("f")
	boolean field1035 = false;

	InterfaceParent() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-296080730")
	public static int method2160() {
		return ViewportMouse.ViewportMouse_entityCount;
	}
}