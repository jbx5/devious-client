import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bf")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(intValue = 1271593503)
	static int field1003;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("itemContainers")
	static NodeHashTable itemContainers = new NodeHashTable(32);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lje;")
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;

	@ObfuscatedName("h")
	@Export("ids")
	int[] ids = new int[]{ -1 };

	@ObfuscatedName("w")
	@Export("quantities")
	int[] quantities = new int[]{ 0 };

	ItemContainer() {
	}
}