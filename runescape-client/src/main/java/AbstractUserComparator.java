import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("aw")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1121308511"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lse;I)I",
		garbageValue = "1255277363"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	static final void method9037() {
		Client.field627 = 0;
		int var0 = (SpriteMask.localPlayer.x >> 7) + class198.topLevelWorldView.baseX;
		int var1 = (SpriteMask.localPlayer.y >> 7) + class198.topLevelWorldView.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field627 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field627 = 1;
		}

		if (Client.field627 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field627 = 0;
		}

	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "6155"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class416.widgetDefinition.loadInterface(var0)) {
			Actor.runComponentCloseListeners(class416.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
