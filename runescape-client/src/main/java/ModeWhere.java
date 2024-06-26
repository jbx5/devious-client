import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4633("", 0, new class399[]{class399.field4614, class399.field4616}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4636("", 1, new class399[]{class399.field4615, class399.field4614, class399.field4616}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4634("", 2, new class399[]{class399.field4615, class399.field4613, class399.field4614}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4635("", 3, new class399[]{class399.field4615}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4632("", 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4637("", 5, new class399[]{class399.field4615, class399.field4614}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4648("", 6, new class399[]{class399.field4614}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4647("", 8, new class399[]{class399.field4615, class399.field4614}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4639("", 9, new class399[]{class399.field4615, class399.field4613}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4641("", 10, new class399[]{class399.field4615}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4642("", 11, new class399[]{class399.field4615}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4643("", 12, new class399[]{class399.field4615, class399.field4614}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4644("", 13, new class399[]{class399.field4615});

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1699003429
	)
	static int field4640;
	@ObfuscatedName("jz")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -855908523
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ax")
	final Set field4646;

	static {
		method7427();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lph;)V"
	)
	ModeWhere(String var3, int var4, class399[] var5) {
		this.field4646 = new HashSet();
		this.id = var4;
		class399[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class399 var8 = var6[var7];
			this.field4646.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4646 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpl;",
		garbageValue = "92"
	)
	static ModeWhere[] method7427() {
		return new ModeWhere[]{field4641, field4648, field4639, field4647, field4642, field4633, field4636, field4635, field4637, field4634, field4644, field4632, field4643};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1073372179"
	)
	public static int method7432(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;Ljava/lang/String;I)Lvv;",
		garbageValue = "1042951824"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!class146.method3260(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = class159.method3419();
			}

			return var5;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIIIIIB)V",
		garbageValue = "-16"
	)
	static final void method7428(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field586) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field586 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				TriBool.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				TriBool.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				TriBool.invalidateWidget(var0);
				Client.field586 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				TriBool.invalidateWidget(var0);
			}
		}

	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1288888161"
	)
	static final void method7431() {
		Client.field707 = Client.cycleCntr;
		GrandExchangeEvents.field4576 = true;
	}
}
