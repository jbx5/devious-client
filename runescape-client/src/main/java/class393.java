import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class393 implements class398 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	public final class422 field4464;

	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	class393(class423 var1) {
		this.field4464 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public class393(class394 var1) {
		this(new class423(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "6"
	)
	public int method7265(int var1) {
		return this.field4464.vmethod7651(var1); // L: 18
	}
}
