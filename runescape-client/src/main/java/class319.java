import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class319 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3385;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3375;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3377;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3378;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3379;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3380;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3387;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3384;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3383;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3388;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class319 field3382;

	static {
		field3385 = new class319(7);
		field3375 = new class319(5);
		field3377 = new class319(14);
		field3378 = new class319(4);
		field3379 = new class319(20);
		field3380 = new class319(2);
		field3387 = new class319(4);
		field3384 = new class319(7);
		field3383 = new class319(11);
		field3388 = new class319(6);
		field3382 = new class319(14);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "7"
	)
	class319(int var1) {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	static void method6173(int var0) {
		class422.field4688 = var0;
		class422.field4690 = new class422[var0];
		class422.field4686 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	public static void method6172() {
		synchronized(ArchiveDiskActionHandler.field4447) {
			if (ArchiveDiskActionHandler.field4445 != 0) {
				ArchiveDiskActionHandler.field4445 = 1;
				ArchiveDiskActionHandler.field4448 = true;

				try {
					ArchiveDiskActionHandler.field4447.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ldt;III)V",
		garbageValue = "-1485751769"
	)
	static final void method6168(WorldView var0, int var1, int var2) {
		if (Client.hintArrowType == 2) {
			MenuAction.worldToScreen(var0, Client.hintArrowSubX * 64 + (Client.hintArrowX - var0.baseX << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - var0.baseY << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class369.headIconHintSprites[0].drawTransBgAt(Client.viewportTempX + var1 - 12, var2 + Client.viewportTempY - 28);
			}

		}
	}
}
