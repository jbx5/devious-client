import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class19 implements Callable {
	@ObfuscatedName("eu")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field92;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class10 field94;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lay;Lap;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field94 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field94.method94()) {
				class219.method4260(10L);
			}
		} catch (IOException var2) {
			return new class20("Error servicing REST query: " + var2.getMessage());
		}

		return this.field94.method91();
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2072070052"
	)
	@Export("updateLoginState")
	static void updateLoginState(int loginState) {
		if (loginState != Client.loginState) {
			Client.loginState = loginState;
		}
	}
}
