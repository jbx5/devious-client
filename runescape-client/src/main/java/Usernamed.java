import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(S)Luc;",
		garbageValue = "-775"
	)
	@Export("username")
	Username username();
}
