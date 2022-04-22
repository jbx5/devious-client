import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class129 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1742059043)

	int field1526;
	@ObfuscatedName("c")
	boolean field1522;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class129(class131 var1) {
		this.this$0 = var1;
		this.field1526 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		this.field1526 = var1.readUnsignedShort();
		this.field1522 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method3027(this.field1526, this.field1522);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(CI)C", garbageValue = 
	"-1943199368")

	static char method2863(char var0) {
		return (var0 != 181) && (var0 != 402) ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(descriptor = 
	"(Lky;IIIIIIB)V", garbageValue = 
	"-9")

	static final void method2861(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field570) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field570 = false;
		int var7;
		if ((MouseHandler.MouseHandler_currentButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_currentButton == 4))) {
			if ((((var5 >= var1) && (var5 < (var1 + 16))) && (var6 >= var2)) && (var6 < (var2 + 16))) {
				var0.scrollY -= 4;
				class346.invalidateWidget(var0);
			} else if ((((var5 >= var1) && (var5 < (var1 + 16))) && (var6 >= ((var3 + var2) - 16))) && (var6 < (var3 + var2))) {
				var0.scrollY += 4;
				class346.invalidateWidget(var0);
			} else if ((((var5 >= (var1 - Client.alternativeScrollbarWidth)) && (var5 < ((Client.alternativeScrollbarWidth + var1) + 16))) && (var6 >= (var2 + 16))) && (var6 < ((var3 + var2) - 16))) {
				var7 = (var3 * (var3 - 32)) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = ((var6 - var2) - 16) - (var7 / 2);
				int var9 = (var3 - 32) - var7;
				var0.scrollY = (var8 * (var4 - var3)) / var9;
				class346.invalidateWidget(var0);
				Client.field570 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if ((((var5 >= (var1 - var7)) && (var6 >= var2)) && (var5 < (var1 + 16))) && (var6 <= (var3 + var2))) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class346.invalidateWidget(var0);
			}
		}

	}
}