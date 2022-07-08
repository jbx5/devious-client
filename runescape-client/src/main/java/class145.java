import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("eu")
public class class145 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	@ObfuscatedName("hd")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = -5828286279618007477L)
	long field1675;

	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 4268736804944836751L)
	long field1673;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llk;")
	IterableNodeDeque field1676;

	@ObfuscatedSignature(descriptor = "(Lqt;)V")
	public class145(Buffer var1) {
		this.field1673 = -1L;
		this.field1676 = new IterableNodeDeque();
		this.method3074(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "-73")
	void method3074(Buffer var1) {
		this.field1675 = var1.readLong();
		this.field1673 = var1.readLong();
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
			((class144) (var3)).vmethod3137(var1);
			this.field1676.addFirst(((Node) (var3)));
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lex;B)V", garbageValue = "84")
	public void method3075(ClanChannel var1) {
		if (this.field1675 == var1.key && this.field1673 == var1.field1693) {
			for (class144 var2 = ((class144) (this.field1676.last())); var2 != null; var2 = ((class144) (this.field1676.previous()))) {
				var2.vmethod3138(var1);
			}
			++var1.field1693;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lkb;II)V", garbageValue = "-1531941035")
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3448 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3517 == null) {
				var0.field3517 = new int[var0.field3448.length];
			}
			var0.field3517[var1] = Integer.MAX_VALUE;
		}
	}
}