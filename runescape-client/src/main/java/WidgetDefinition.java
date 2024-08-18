import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field3711;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field3716;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field3712;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field3706;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lnq;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ac")
	Map field3714;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class462 field3717;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	class462 field3718;

	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;Lob;Lob;Lob;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3714 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3717 = new class462(10, class460.field4876);
		this.field3718 = new class462(10, class460.field4876);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3716 = var2;
			this.field3712 = var3;
			this.field3706 = var4;
			this.field3711 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		Calendar.field3972 = new boolean[var6];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnq;",
		garbageValue = "-78"
	)
	public Widget method6544(int var1) {
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lnq;",
		garbageValue = "48"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method6544(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1228916395"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (Calendar.field3972[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				Calendar.field3972[var1] = true;
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

							if (this.field3711 != null) {
								byte[] var5 = this.field3711.takeFile(var1, var3);
								if (var5 != null && var5.length > 0) {
									this.Widget_interfaceComponents[var1][var3].method6943(new Buffer(var5));
									this.field3714.put(this.Widget_interfaceComponents[var1][var3].field3804, var1);
								}
							}
						}
					}
				}

				Calendar.field3972[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "978393306"
	)
	public void method6547(int var1) {
		if (var1 != -1) {
			if (Calendar.field3972[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					Calendar.field3972[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1975438551"
	)
	public void method6548() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lfq;",
		garbageValue = "1509204341"
	)
	public static class142 method6556(int var0) {
		class142 var1 = (class142)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = ObjectComposition.method5131(SequenceDefinition.SequenceDefinition_animationsArchive, class164.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)Lpr;",
		garbageValue = "1111421761"
	)
	public static NodeDeque method6561() {
		return Client.scriptEvents;
	}
}
