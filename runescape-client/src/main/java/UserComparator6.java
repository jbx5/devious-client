import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("do")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnt;Lnt;B)I", garbageValue = "4")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-7")
	static void method2616() {
		for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var0.obj != null) {
				var0.set();
			}
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "56")
	static final void method2611(int var0, int var1) {
		if (Client.hintArrowType == 2) {
			Bounds.worldToScreen(Client.hintArrowSubX * 4096 + (Client.hintArrowX - Decimator.baseX * 8 << 7), (Client.hintArrowY - class7.baseY * 64 << 7) + Client.hintArrowSubY * 4096, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class229.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}
	}
}