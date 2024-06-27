import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(I)Lvo;",
		garbageValue = "-1036392094"
	)
	@Export("username")
	Username username();
}
