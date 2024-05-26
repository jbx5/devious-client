import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field3717;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field3723;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field3719;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field3720;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[Lnb;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ab")
	Map field3722;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	class460 field3728;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	class460 field3716;

	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;Lor;Lor;Lor;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3722 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3728 = new class460(10, class458.field4877);
		this.field3716 = new class460(10, class458.field4877);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3723 = var2;
			this.field3719 = var3;
			this.field3720 = var4;
			this.field3717 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		class155.field1748 = new boolean[var6];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnb;",
		garbageValue = "7"
	)
	public Widget method6536(int var1) {
		int var2 = var1 >> 16;
		int var3 = var1 & 65535;
		if (this.Widget_interfaceComponents[var2] == null || this.Widget_interfaceComponents[var2][var3] == null) {
			boolean var4 = this.loadInterface(var2);
			if (!var4) {
				return null;
			}
		}

		return this.Widget_interfaceComponents[var2][var3];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lnb;",
		garbageValue = "-1640217063"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method6536(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "39"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (class155.field1748[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				class155.field1748[var1] = true;
				return true;
			} else {
				if (this.Widget_interfaceComponents[var1] == null) {
					this.Widget_interfaceComponents[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) {
					if (this.Widget_interfaceComponents[var1][var3] == null) {
						byte[] var4 = this.widgetArchive.takeFile(var1, var3);
						if (var4 != null) {
							this.Widget_interfaceComponents[var1][var3] = new Widget();
							this.Widget_interfaceComponents[var1][var3].id = var3 + (var1 << 16);
							if (var4[0] == -1) {
								this.Widget_interfaceComponents[var1][var3].decode(new Buffer(var4));
							} else {
								this.Widget_interfaceComponents[var1][var3].decodeLegacy(new Buffer(var4));
							}

							if (this.field3717 != null) {
								byte[] var5 = this.field3717.takeFile(var1, var3);
								if (var5 != null && var5.length > 0) {
									this.Widget_interfaceComponents[var1][var3].method6911(new Buffer(var5));
									this.field3722.put(this.Widget_interfaceComponents[var1][var3].field3816, var1);
								}
							}
						}
					}
				}

				class155.field1748[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1534297254"
	)
	public void method6540(int var1) {
		if (var1 != -1) {
			if (class155.field1748[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					class155.field1748[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1315845158"
	)
	public void method6550() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)J",
		garbageValue = "180"
	)
	public static long method6548(int var0) {
		if (var0 > 63) {
			throw new class426("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I[B[BI)V",
		garbageValue = "-1795281107"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3891 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3891 = new byte[11][];
			var0.field3873 = new byte[11][];
			var0.field3835 = new int[11];
			var0.field3894 = new int[11];
		}

		var0.field3891[var1] = var2;
		if (var2 != null) {
			var0.field3868 = true;
		} else {
			var0.field3868 = false;

			for (int var4 = 0; var4 < var0.field3891.length; ++var4) {
				if (var0.field3891[var4] != null) {
					var0.field3868 = true;
					break;
				}
			}
		}

		var0.field3873[var1] = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIB)I",
		garbageValue = "-1"
	)
	static int method6546(WorldView var0, int var1, int var2, int var3) {
		if ((var0.tileSettings[var1][var2][var3] & 8) != 0) {
			return 0;
		} else {
			return var1 > 0 && (var0.tileSettings[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
		}
	}
}
