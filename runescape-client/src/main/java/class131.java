import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fi")
public class class131 implements Callable {
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1006746715
	)
	static int field1550;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class132 field1554;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class133 field1549;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class134 field1551;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 260663393
	)
	final int field1552;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class140 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;Lfr;Lfv;Lfj;I)V"
	)
	class131(class140 var1, class132 var2, class133 var3, class134 var4, int var5) {
		this.this$0 = var1;
		this.field1554 = var2;
		this.field1549 = var3;
		this.field1551 = var4;
		this.field1552 = var5;
	}

	public Object call() {
		this.field1554.method3100();
		class132[][] var1;
		if (this.field1549 == class133.field1580) {
			var1 = this.this$0.field1634;
		} else {
			var1 = this.this$0.field1632;
		}

		var1[this.field1552][this.field1551.method3124()] = this.field1554;
		return null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1672712163"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-53"
	)
	static void method3076(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
