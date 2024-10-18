import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("wl")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1626478363
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsr;B)I",
		garbageValue = "62"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lse;S)I",
		garbageValue = "7143"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-602881256"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GraphicsObject.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lng;IS)Ljava/lang/String;",
		garbageValue = "-25797"
	)
	static String method9125(Widget var0, int var1) {
		if (!class496.method9320(class171.getWidgetFlags(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
