import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class143 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-5266391678876425789L)

	long field1627;
	@ObfuscatedName("c")
	String field1626;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	386086251)

	int field1625;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class143(class131 var1) {
		this.this$0 = var1;
		this.field1627 = -1L;
		this.field1626 = null;
		this.field1625 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1627 = var1.readLong();
		}

		this.field1626 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1625 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method2959(this.field1627, this.field1626, this.field1625);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"34")

	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if ((var0 < 0) || (var0 >= 65536)) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"345981332")

	static void method3072() {
		for (InterfaceParent var0 = ((InterfaceParent) (Client.interfaceParents.first())); var0 != null; var0 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			int var1 = var0.group;
			if (class155.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = Widget.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = ((int) (var0.key));
					Widget var5 = class127.getWidget(var4);
					if (var5 != null) {
						class346.invalidateWidget(var5);
					}
				}
			}
		}

	}
}