import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class227 {
	@ObfuscatedName("ac")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field2545;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	class127[] field2541;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1593218477
	)
	int field2542;

	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V"
	)
	class227(Buffer var1, int var2) {
		this.field2541 = new class127[var2];
		this.field2542 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2541.length; ++var3) {
			class127 var4 = new class127(this.field2542, var1, false);
			this.field2541[var3] = var4;
		}

		this.method4477();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1763972541"
	)
	void method4477() {
		class127[] var1 = this.field2541;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class127 var3 = var1[var2];
			if (var3.field1515 >= 0) {
				var3.field1525 = this.field2541[var3.field1515];
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1286602518"
	)
	public int method4461() {
		return this.field2541.length;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Leo;",
		garbageValue = "-1526328024"
	)
	class127 method4462(int var1) {
		return var1 >= this.method4461() ? null : this.field2541[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Leo;",
		garbageValue = "110730333"
	)
	class127[] method4463() {
		return this.field2541;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfv;II)V",
		garbageValue = "1299283005"
	)
	void method4464(class137 var1, int var2) {
		this.method4465(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfv;I[ZZB)V",
		garbageValue = "63"
	)
	void method4465(class137 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3059();
		int var6 = 0;
		class127[] var7 = this.method4463();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class127 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3061(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-1038928775"
	)
	public static VarcInt method4471(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3606(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;Lnu;I)V",
		garbageValue = "1390466926"
	)
	public static void method4479(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		UserComparator2.SequenceDefinition_archive = var0;
		VarpDefinition.SequenceDefinition_animationsArchive = var1;
		class485.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "0"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Canvas.worldMap;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lmi;III)V",
		garbageValue = "-767534293"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && WorldMapLabelSize.method5059(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = WorldMapLabelSize.method5059(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class159.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menuOptionsCount - 1;
				if (var3 != -1) {
					class9.tempMenuAction = new MenuAction();
					class9.tempMenuAction.param0 = Client.menuArguments1[var3];
					class9.tempMenuAction.param1 = Client.menuArguments2[var3];
					class9.tempMenuAction.opcode = Client.menuOpcodes[var3];
					class9.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					class9.tempMenuAction.itemId = Client.menuItemIds[var3];
					class9.tempMenuAction.action = Client.menuActions[var3];
					class9.tempMenuAction.target = Client.menuTargets[var3];
				}

			}
		}
	}
}
