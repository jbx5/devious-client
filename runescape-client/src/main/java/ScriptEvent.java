import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ci")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("th")
	@ObfuscatedGetter(intValue = -2039005153)
	static int field1052;

	@ObfuscatedName("at")
	protected static String field1045;

	@ObfuscatedName("o")
	@Export("args")
	Object[] args;

	@ObfuscatedName("q")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("widget")
	Widget widget;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1867407423)
	@Export("mouseX")
	int mouseX;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 456579589)
	@Export("mouseY")
	int mouseY;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1813921471)
	@Export("opIndex")
	int opIndex;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("dragTarget")
	Widget dragTarget;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1264194041)
	@Export("keyTyped")
	int keyTyped;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1513519959)
	@Export("keyPressed")
	int keyPressed;

	@ObfuscatedName("a")
	@Export("targetName")
	String targetName;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1450692113)
	int field1049;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1211441165)
	@Export("type")
	int type = 76;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/Object;B)V", garbageValue = "-107")
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "92")
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-322270617")
	public static int method2168(int var0) {
		return class271.field3179[var0];
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "8074476")
	static final void method2169() {
		int var0 = Language.menuX;
		int var1 = UrlRequest.menuY;
		int var2 = class402.menuWidth;
		int var3 = class321.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		class116.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;
		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			int var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31;
			int var9 = 16777215;
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}
			class116.fontBold12.draw(ClanChannelMember.method2906(var7), var0 + 3, var8, var9, 0);
		}
		class28.method387(Language.menuX, UrlRequest.menuY, class402.menuWidth, class321.menuHeight);
	}
}