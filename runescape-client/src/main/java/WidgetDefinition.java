import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("ab")
	static boolean[] field3646;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3650;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3653;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3643;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3649;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lnt;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("aw")
	Map field3647;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	class443 field3652;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	class443 field3642;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;Loc;Loc;Loc;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3647 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3652 = new class443(10, class441.field4748);
		this.field3642 = new class443(10, class441.field4748);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3653 = var2;
			this.field3643 = var3;
			this.field3649 = var4;
			this.field3650 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field3646 = new boolean[var6];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lnt;",
		garbageValue = "355172489"
	)
	public Widget method6281(int var1) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnt;",
		garbageValue = "1377973695"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method6281(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "31"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field3646[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field3646[var1] = true;
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

							if (this.field3650 != null) {
								byte[] var5 = this.field3650.takeFile(var1, var3);
								if (var5 != null && var5.length > 0) {
									this.Widget_interfaceComponents[var1][var3].method6648(new Buffer(var5));
									this.field3647.put(this.Widget_interfaceComponents[var1][var3].field3744, var1);
								}
							}
						}
					}
				}

				field3646[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	public void method6283(int var1) {
		if (var1 != -1) {
			if (field3646[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field3646[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "802087593"
	)
	public void method6284() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "1774162396"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}
}
