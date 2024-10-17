import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)Lwx;",
		garbageValue = "738744592"
	)
	@Export("username")
	Username username();
}
