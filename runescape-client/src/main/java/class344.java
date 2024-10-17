import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class344 implements Comparator {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("worldView")
	static WorldView worldView;

	class344() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Lmx;B)I",
		garbageValue = "15"
	)
	int method6819(class337 var1, class337 var2) {
		return var1.field3691 - var2.field3691;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6819((class337)var1, (class337)var2);
	}
}
