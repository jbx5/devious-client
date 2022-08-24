import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("om")
public class class392 implements class397 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lpd;")
	public final class421 field4429;

	@ObfuscatedSignature(descriptor = "(Lpi;)V")
	class392(class422 var1) {
		this.field4429 = var1;
	}

	@ObfuscatedSignature(descriptor = "(Loc;)V")
	public class392(class393 var1) {
		this(new class422(var1));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-44")
	public int method7008(int var1) {
		return this.field4429.vmethod7381(var1);
	}
}