import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class151 {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Lvb;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4632075478010266477L
	)
	long field1690;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1212255819
	)
	public int field1687;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	IterableNodeDeque field1688;

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
	)
	public class151(Buffer var1) {
		this.field1687 = -1;
		this.field1688 = new IterableNodeDeque();
		this.method3367(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-2082403000"
	)
	void method3367(Buffer var1) {
		this.field1690 = var1.readLong();
		this.field1687 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class170(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class163(this);
			} else if (var2 == 4) {
				var3 = new class155(this);
			} else if (var2 == 6) {
				var3 = new class162(this);
			} else if (var2 == 5) {
				var3 = new class147(this);
			} else if (var2 == 2) {
				var3 = new class152(this);
			} else if (var2 == 7) {
				var3 = new class145(this);
			} else if (var2 == 14) {
				var3 = new class149(this);
			} else if (var2 == 8) {
				var3 = new class166(this);
			} else if (var2 == 9) {
				var3 = new class172(this);
			} else if (var2 == 10) {
				var3 = new class158(this);
			} else if (var2 == 11) {
				var3 = new class153(this);
			} else if (var2 == 12) {
				var3 = new class157(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class167(this);
			}

			((class148)var3).vmethod3619(var1);
			this.field1688.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;B)V",
		garbageValue = "-19"
	)
	public void method3370(ClanSettings var1) {
		if (var1.field1733 == this.field1690 && this.field1687 == var1.field1734) {
			for (class148 var2 = (class148)this.field1688.last(); var2 != null; var2 = (class148)this.field1688.previous()) {
				var2.vmethod3621(var1);
			}

			++var1.field1734;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1216454944"
	)
	public static boolean method3375(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-45"
	)
	static void method3371(int var0, int var1, int var2, int var3) {
		Widget var4 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class421.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		MenuAction.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		UserComparator3.selectedSpellFlags = var2;
		class416.invalidateWidget(var4);
	}
}
