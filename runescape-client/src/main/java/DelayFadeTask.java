import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 1009254925672959185L
	)
	long field4874;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1520981465
	)
	int field4875;

	@ObfuscatedSignature(
		descriptor = "(Lra;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4875 = var2;
		super.field4881 = "DelayFadeTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		if (this.field4874 < (long)this.field4875) {
			++this.field4874;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CLpn;S)I",
		garbageValue = "30349"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
