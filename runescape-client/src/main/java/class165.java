import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class165 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -7709890567496579347L
	)
	long field1787;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 5699299738200003005L
	)
	public long field1784;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	IterableNodeDeque field1786;

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
	)
	public class165(Buffer var1) {
		this.field1784 = -1L;
		this.field1786 = new IterableNodeDeque();
		this.method3547(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-169478463"
	)
	void method3547(Buffer var1) {
		this.field1787 = var1.readLong();
		this.field1784 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class160(this);
			} else if (var2 == 4) {
				var3 = new class171(this);
			} else if (var2 == 3) {
				var3 = new class156(this);
			} else if (var2 == 2) {
				var3 = new class154(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class161(this);
			}

			((class164)var3).vmethod3611(var1);
			this.field1786.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgx;B)V",
		garbageValue = "111"
	)
	public void method3554(ClanChannel var1) {
		if (var1.key == this.field1787 && var1.field1803 == this.field1784) {
			for (class164 var2 = (class164)this.field1786.last(); var2 != null; var2 = (class164)this.field1786.previous()) {
				var2.vmethod3612(var1);
			}

			++var1.field1803;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-2142008967"
	)
	static final int method3549(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvr;",
		garbageValue = "-634951883"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5464, FillMode.SOLID, FillMode.field5461};
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "([Lnq;Lnq;ZI)V",
		garbageValue = "-1240491780"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		class134.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class134.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			ClanChannel.method3594(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
