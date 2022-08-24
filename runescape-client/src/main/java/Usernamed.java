import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ne")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kq")
	@ObfuscatedSignature(descriptor = "(I)Lqy;", garbageValue = "-655340942")
	@Export("username")
	Username username();
}