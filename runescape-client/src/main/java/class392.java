import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("oy")
public class class392 implements class397 {
	@ObfuscatedName("q")
	@Export("localPlayerName")
	public static String localPlayerName;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lph;")
	public final class421 field4434;

	@ObfuscatedSignature(descriptor = "(Lpx;)V")
	class392(class422 var1) {
		this.field4434 = var1;
	}

	@ObfuscatedSignature(descriptor = "(Loi;)V")
	public class392(class393 var1) {
		this(new class422(var1));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "25")
	public int method7099(int var1) {
		return this.field4434.vmethod7480(var1);
	}
}