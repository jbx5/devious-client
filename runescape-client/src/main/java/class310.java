import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class310 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -492175089
	)
	int field3459;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	class53 field3462;

	@ObfuscatedSignature(
		descriptor = "(ILcf;)V"
	)
	class310(int var1, class53 var2) {
		this.field3459 = var1;
		this.field3462 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Lqh;",
		garbageValue = "29"
	)
	public static AbstractSocket method6008(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "924018154"
	)
	public static void method6007(Widget var0, int var1, int var2) {
		var0.field3681.bodyColors[var1] = var2;
		var0.field3681.method6128();
	}
}
