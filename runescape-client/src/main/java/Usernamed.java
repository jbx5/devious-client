import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nc")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("li")
	@ObfuscatedSignature(descriptor = "(B)Lqi;", garbageValue = "37")
	@Export("username")
	Username username();
}