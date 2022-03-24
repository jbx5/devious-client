import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class397 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lom;")

	static final class397 field4381;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lom;")

	static final class397 field4380;
	@ObfuscatedName("h")
	String field4379;
	static 
	{
		field4381 = new class397("application/json");
		field4380 = new class397("text/plain");
	}

	class397(String var1) {
		this.field4379 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-1563884040")

	public String method7217() {
		return this.field4379;
	}
}