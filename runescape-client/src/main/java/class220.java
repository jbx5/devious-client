import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class220 implements Comparator {
	class220() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;B)I",
		garbageValue = "71"
	)
	int method4290(class215 var1, class215 var2) {
		return var1.method4222() - var2.method4222();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method4290((class215)var1, (class215)var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1166390548"
	)
	static final void method4285() {
		Tile.method4399("You can't add yourself to your own friend list");
	}
}
