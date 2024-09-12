import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Entity")
public interface Entity {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2084253353"
	)
	@Export("getX")
	int getX();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "18679"
	)
	@Export("getY")
	int getY();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "371855163"
	)
	@Export("getPlane")
	int getPlane();
}
