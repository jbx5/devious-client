import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class145 {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-8660248817658951919L)

	long field1633;
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 
	945677273558696457L)

	long field1635;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Llk;")

	IterableNodeDeque field1632;

	@ObfuscatedSignature(descriptor = 
	"(Lpi;)V")

	public class145(Buffer var1) {
		this.field1635 = -1L;
		this.field1632 = new IterableNodeDeque();
		this.method3084(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"1488842408")

	void method3084(Buffer var1) {
		this.field1633 = var1.readLong();
		this.field1635 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this);
			} else if (var2 == 3) {
				var3 = new class136(this);
			} else if (var2 == 2) {
				var3 = new class134(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class141(this);
			}

			((class144) (var3)).vmethod3152(var1);
			this.field1632.addFirst(((Node) (var3)));
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1969966641")

	public void method3086(ClanChannel var1) {
		if ((var1.key == this.field1633) && (var1.field1656 == this.field1635)) {
			for (class144 var2 = ((class144) (this.field1632.last())); var2 != null; var2 = ((class144) (this.field1632.previous()))) {
				var2.vmethod3153(var1);
			}

			++var1.field1656;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(IIZI)Ljava/lang/String;", garbageValue = 
	"803323107")

	static String method3085(int var0, int var1, boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			if (var2 && (var0 >= 0)) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - (var0 * var1);
					if (var8 >= 10) {
						var5[var6] = ((char) (var8 + 87));
					} else {
						var5[var6] = ((char) (var8 + 48));
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-62")

	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != (-1)) {
			if (class155.loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						Interpreter.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}