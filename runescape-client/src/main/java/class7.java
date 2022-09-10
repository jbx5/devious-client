import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class7 {
	@ObfuscatedName("c")
	ExecutorService field27;
	@ObfuscatedName("p")
	Future field22;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	final Buffer field23;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class3 field24;

	@ObfuscatedSignature(
		descriptor = "(Lqq;Ln;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field27 = Executors.newSingleThreadExecutor(); // L: 10
		this.field23 = var1; // L: 16
		this.field24 = var2; // L: 17
		this.method58(); // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method51() {
		return this.field22.isDone(); // L: 22
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1794518613"
	)
	public void method52() {
		this.field27.shutdown();
		this.field27 = null; // L: 27
	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lqq;",
		garbageValue = "68"
	)
	public Buffer method55() {
		try {
			return (Buffer)this.field22.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	void method58() {
		this.field22 = this.field27.submit(new class1(this, this.field23, this.field24)); // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkg;",
		garbageValue = "1957950782"
	)
	public static GameBuild[] method59() {
		return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.RC, GameBuild.WIP}; // L: 13
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;B)V",
		garbageValue = "-126"
	)
	public static void method69(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1939268693"
	)
	static void method68() {
		class139.method3101(24); // L: 2002
		SecureRandomCallable.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2003
	} // L: 2004

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2127754023"
	)
	static final void method67(int var0, int var1) {
		if (var0 < 128) { // L: 3673
			var0 = 128;
		}

		if (var0 > 383) { // L: 3674
			var0 = 383;
		}

		if (class163.cameraPitch < var0) { // L: 3675
			class163.cameraPitch = (var0 - class163.cameraPitch) * class93.field1270 / 1000 + class163.cameraPitch + SoundSystem.field327; // L: 3676
			if (class163.cameraPitch > var0) { // L: 3677
				class163.cameraPitch = var0;
			}
		}

		if (class163.cameraPitch > var0) { // L: 3679
			class163.cameraPitch -= (class163.cameraPitch - var0) * class93.field1270 / 1000 + SoundSystem.field327; // L: 3680
			if (class163.cameraPitch < var0) { // L: 3681
				class163.cameraPitch = var0;
			}
		}

		int var2 = var1 - class10.cameraYaw; // L: 3683
		if (var2 > 1024) { // L: 3684
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3685
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3686
			class10.cameraYaw = class10.cameraYaw + SoundSystem.field327 + var2 * class93.field1270 / 1000; // L: 3687
			class10.cameraYaw &= 2047; // L: 3688
		}

		if (var2 < 0) { // L: 3690
			class10.cameraYaw -= SoundSystem.field327 + -var2 * class93.field1270 / 1000; // L: 3691
			class10.cameraYaw &= 2047; // L: 3692
		}

		int var3 = var1 - class10.cameraYaw; // L: 3694
		if (var3 > 1024) { // L: 3695
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3696
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3697
			class10.cameraYaw = var1;
		}

	} // L: 3698
}
