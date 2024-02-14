import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class162 {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -906448207537196297L
	)
	long field1786;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 6665924676591181619L
	)
	public long field1785;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	IterableNodeDeque field1787;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public class162(Buffer var1) {
		this.field1785 = -1L;
		this.field1787 = new IterableNodeDeque();
		this.method3441(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-175058432"
	)
	void method3441(Buffer var1) {
		this.field1786 = var1.readLong();
		this.field1785 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class157(this);
			} else if (var2 == 4) {
				var3 = new class168(this);
			} else if (var2 == 3) {
				var3 = new class153(this);
			} else if (var2 == 2) {
				var3 = new class151(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class158(this);
			}

			((class161)var3).vmethod3504(var1);
			this.field1787.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2036232616"
	)
	public void method3442(ClanChannel var1) {
		if (var1.key == this.field1786 && var1.field1808 == this.field1785) {
			for (class161 var2 = (class161)this.field1787.last(); var2 != null; var2 = (class161)this.field1787.previous()) {
				var2.vmethod3509(var1);
			}

			++var1.field1808;
		} else {
			throw new RuntimeException("");
		}
	}
}
