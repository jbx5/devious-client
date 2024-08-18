import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class1 implements Callable {
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class530 field2;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	final Buffer field3;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lac;Lvg;Lau;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field3 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod11(this.field3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;B)V",
		garbageValue = "1"
	)
	public static void method9(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		class211.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-2084614252"
	)
	public static int method7(byte[] var0, int var1) {
		return class487.method8868(var0, 0, var1);
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(B)Lor;",
		garbageValue = "-13"
	)
	static JagNetThread method8() {
		return SecureRandomFuture.field980;
	}
}
