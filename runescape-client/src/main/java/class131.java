import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class131 {
	@ObfuscatedName("uh")
	@ObfuscatedSignature(descriptor = 
	"Lca;")

	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-5200207434161239507L)

	long field1539;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1578407985)

	int field1535;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Llk;")

	IterableNodeDeque field1536;

	@ObfuscatedSignature(descriptor = 
	"(Lpi;)V")

	public class131(Buffer var1) {
		this.field1535 = -1;
		this.field1536 = new IterableNodeDeque();
		this.method2872(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-2070939911")

	void method2872(Buffer var1) {
		this.field1539 = var1.readLong();
		this.field1535 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class150(this);
			} else if (var2 == 1) {
				var3 = new class126(this);
			} else if (var2 == 13) {
				var3 = new class143(this);
			} else if (var2 == 4) {
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this);
			} else if (var2 == 2) {
				var3 = new class132(this);
			} else if (var2 == 7) {
				var3 = new class125(this);
			} else if (var2 == 14) {
				var3 = new class129(this);
			} else if (var2 == 8) {
				var3 = new class146(this);
			} else if (var2 == 9) {
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this);
			} else if (var2 == 11) {
				var3 = new class133(this);
			} else if (var2 == 12) {
				var3 = new class137(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class147(this);
			}

			((class128) (var3)).vmethod3168(var1);
			this.field1536.addFirst(((Node) (var3)));
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;I)V", garbageValue = 
	"-1644962091")

	public void method2873(ClanSettings var1) {
		if ((this.field1539 == var1.field1586) && (this.field1535 == var1.field1583)) {
			for (class128 var2 = ((class128) (this.field1536.last())); var2 != null; var2 = ((class128) (this.field1536.previous()))) {
				var2.vmethod3162(var1);
			}

			++var1.field1583;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"-583434867")

	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return (((var0 >= '0') && (var0 <= '9')) || ((var0 >= 'A') && (var0 <= 'Z'))) || ((var0 >= 'a') && (var0 <= 'z'));
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1041289778")

	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field601 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (Client.getWindowedMode() == 1) {
			class127.client.setMaxCanvasSize(765, 503);
		} else {
			class127.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			class4.method17();
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIIII)V", garbageValue = 
	"1296688270")

	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class155.loadInterface(var0)) {
			class307.field3585 = null;
			class268.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class307.field3585 != null) {
				class268.drawInterface(class307.field3585, -1412584499, var1, var2, var3, var4, class93.field1252, ItemContainer.field1013, var7);
				class307.field3585 = null;
			}

		} else 
		if (var7 != (-1)) {
			Client.field715[var7] = true;
		} else {
			for (int var8 = 0; var8 < 100; ++var8) {
				Client.field715[var8] = true;
			}
		}


	}
}