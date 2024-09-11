import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(I)Lwf;",
		garbageValue = "616356373"
	)
	@Export("username")
	Username username();
}
