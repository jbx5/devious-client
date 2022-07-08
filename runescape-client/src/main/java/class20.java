import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("p")
public class class20 implements Callable {
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1119374455)
	@Export("clientType")
	public static int clientType;

	@ObfuscatedName("nb")
	@ObfuscatedSignature(descriptor = "Lbk;")
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ls;")
	final class10 field109;

	@ObfuscatedSignature(descriptor = "Lu;")
	final class14 this$0;

	@ObfuscatedSignature(descriptor = "(Lu;Ls;)V")
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field109 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field109.method78()) {
				DynamicObject.method1991(10L);
			} 
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}
		return this.field109.method90();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-2092046767")
	static int method255(int var0) {
		return ((int) (Math.pow(2.0, ((double) (7.0F + ((float) (var0)) / 256.0F)))));
	}
}