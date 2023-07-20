import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bd")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class424 field3765;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class424 field3670;
	@ObfuscatedName("bw")
	public static boolean field3754;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -232044627
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1116520775
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1878130101
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1915483963
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1430877071
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 2117757955
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 525984847
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 735311051
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1291193731
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2048644273
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1602574411
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1929789851
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1472443045
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -485946073
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1816792705
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1247813383
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -633207203
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1403808905
	)
	public int field3672;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -401480271
	)
	public int field3641;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1253984169
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cw")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 465950841
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1007081007
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 685053883
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1689285839
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1026146983
	)
	@Export("color")
	public int color;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1852743327
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 625559939
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 427659507
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cd")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 433873471
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1515062185
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1570582305
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ch")
	public boolean field3725;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 701078763
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1115295013
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cv")
	public String field3660;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -547144445
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dc")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1589898067
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1342850943
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dj")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dy")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 770390107
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -592869933
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1385222223
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -85085275
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -893926927
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1163255789
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 726969051
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1332644923
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 2072150989
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -861979179
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -2051024365
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -33170067
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1428674931
	)
	public int field3679;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1650813479
	)
	public int field3680;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	public PlayerComposition field3681;
	@ObfuscatedName("da")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dv")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1099986701
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 497201407
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("db")
	@Export("text")
	public String text;
	@ObfuscatedName("dw")
	@Export("text2")
	public String text2;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1300975293
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1809558385
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 950763823
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("el")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	class170 field3692;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1322658349
	)
	int field3693;
	@ObfuscatedName("eo")
	HashMap field3694;
	@ObfuscatedName("eb")
	HashMap field3695;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	class328 field3696;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1861263951
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("en")
	public boolean field3698;
	@ObfuscatedName("es")
	public byte[][] field3711;
	@ObfuscatedName("eq")
	public byte[][] field3700;
	@ObfuscatedName("ee")
	public int[] field3657;
	@ObfuscatedName("eg")
	public int[] field3630;
	@ObfuscatedName("ef")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ev")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 1073014071
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 2092646495
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ep")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fm")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fa")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fg")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fq")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fy")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fw")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fp")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fz")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fj")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fb")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fl")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fd")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fh")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fc")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fu")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fv")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fr")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fs")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ff")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ft")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fe")
	public Object[] field3628;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fx")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fi")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gc")
	public Object[] field3618;
	@ObfuscatedName("gp")
	public Object[] field3635;
	@ObfuscatedName("ga")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gg")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gs")
	public Object[] field3739;
	@ObfuscatedName("ge")
	public Object[] field3740;
	@ObfuscatedName("go")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gh")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gj")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gm")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gx")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gr")
	public Object[] field3746;
	@ObfuscatedName("gy")
	public Object[] field3747;
	@ObfuscatedName("gt")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gv")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1907982299
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gd")
	public String field3752;
	@ObfuscatedName("gf")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gk")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gz")
	public int[] itemQuantities;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1993931981
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -2020894495
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1430583723
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 517958231
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "[Lmt;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("hf")
	public boolean field3761;
	@ObfuscatedName("hv")
	public boolean field3762;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -265080089
	)
	public int field3763;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 898476353
	)
	public int field3748;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -1681639235
	)
	public int field3675;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1983551921
	)
	public int field3766;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = 1720579133
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -218267641
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ha")
	public int[] field3769;
	@ObfuscatedName("hr")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hm")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hz")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3765 = new class424(10, class422.field4609);
		field3670 = new class424(10, class422.field4609);
		field3754 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field3672 = 1;
		this.field3641 = 1;
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3725 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field3679 = 0;
		this.field3680 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.field3693 = -1;
		this.flags = 0;
		this.field3698 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3752 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3761 = false;
		this.field3762 = false;
		this.field3763 = -1;
		this.field3748 = 0;
		this.field3675 = 0;
		this.field3766 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "765391590"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort();
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteId = var1.readInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.field3752 = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1963555900"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort();
			this.scrollHeight = var1.readUnsignedShort();
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt();
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.field3679 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field3725 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)[Ljava/lang/Object;",
		garbageValue = "122"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)[I",
		garbageValue = "-2000592706"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZLej;B)Lud;",
		garbageValue = "-22"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3754 = false;
		if (this.field3660 != null) {
			SpritePixels var3 = this.method6540(var2);
			if (var3 != null) {
				return var3;
			}
		}

		int var7;
		if (var1) {
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2;
		}

		if (var7 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				var6 = WorldMap.SpriteBuffer_getSprite(UserComparator10.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3754 = true;
					return null;
				} else {
					this.method6446(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)Lud;",
		garbageValue = "871401764"
	)
	SpritePixels method6540(UrlRequester var1) {
		if (!this.method6458()) {
			return this.method6444(var1);
		} else {
			String var2 = this.field3660 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var3 = (SpritePixels)field3670.method7829(var2);
			if (var3 == null) {
				SpritePixels var4 = this.method6444(var1);
				if (var4 != null) {
					var3 = var4.method9557();
					this.method6446(var3);
					field3670.method7830(var2, var3);
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)Lud;",
		garbageValue = "1775853493"
	)
	SpritePixels method6444(UrlRequester var1) {
		if (this.field3660 != null && var1 != null) {
			class327 var2 = (class327)field3765.method7829(this.field3660);
			if (var2 == null) {
				var2 = new class327(this.field3660, var1);
				field3765.method7830(this.field3660, var2);
			}

			return var2.method6111();
		} else {
			return null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-771382672"
	)
	boolean method6458() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lud;B)V",
		garbageValue = "1"
	)
	void method6446(SpritePixels var1) {
		if (this.spriteFlipV) {
			var1.flipVertically();
		}

		if (this.spriteFlipH) {
			var1.flipHorizontally();
		}

		if (this.outline > 0) {
			var1.pad(this.outline);
		}

		if (this.outline >= 1) {
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) {
			var1.shadow(this.spriteShadow);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;",
		garbageValue = "-2062099082"
	)
	@Export("getFont")
	public Font getFont() {
		field3754 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ConcurrentMidiTask.method7672(UserComparator10.Widget_spritesArchive, WallDecoration.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field3754 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lig;IZLmb;Lhi;Lhs;I)Ljo;",
		garbageValue = "-1139082268"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewStuff var6) {
		field3754 = false;
		int var7;
		int var8;
		if (var3) {
			var7 = this.modelType2;
			var8 = this.modelId2;
		} else {
			var7 = this.modelType;
			var8 = this.modelId;
		}

		if (var7 == 6) {
			if (var5 == null) {
				return null;
			}

			var8 = var5.id;
		}

		if (var7 == 0) {
			return null;
		} else if (var7 == 1 && var8 == -1) {
			return null;
		} else {
			if (var6 != null && var6.field1994 && var7 == 6) {
				var7 = 3;
			}

			long var9 = (long)(var8 + (var7 << 16));
			if (var6 != null) {
				var9 |= var6.field1990 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(BoundaryObject.field2818, var8, 0);
					break;
				case 2:
					var12 = Tile.getNpcDefinition(var8).method3709((NewStuff)null);
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = class125.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.ambient;
					var14 += var15.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var12 = Tile.getNpcDefinition(var8).method3709(var6);
				}

				if (var12 == null) {
					field3754 = true;
					return null;
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50);
				Widget_cachedModels.put(var11, var9);
			}

			if (var1 != null) {
				var11 = var1.transformWidgetModel(var11, var2);
			}

			return var11;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lmi;",
		garbageValue = "-1"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null);
				if (var6 == null) {
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized();
					int[] var8 = new int[var7.subHeight];
					int[] var9 = new int[var7.subHeight];

					for (int var10 = 0; var10 < var7.subHeight; ++var10) {
						int var11 = 0;
						int var12 = var7.subWidth;

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var12 = var13 + 1;
								break;
							}
						}

						var8[var10] = var11;
						var9[var10] = var12 - var11;
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2);
					Widget_cachedSpriteMasks.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1432445957"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-727475162"
	)
	public boolean method6505() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1196611780"
	)
	public boolean method6452() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;J)V"
	)
	public void method6518(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3692 = new class170();
			if (!this.field3692.method3431(var1, var2)) {
				this.field3692 = null;
			} else {
				if (this.field3694 == null || this.field3695 == null) {
					this.method6443();
				}

			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;I)V",
		garbageValue = "467943476"
	)
	public void method6454(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3692 = new class170();
			this.field3692.method3449(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1842615926"
	)
	void method6443() {
		this.field3694 = new HashMap();
		this.field3695 = new HashMap();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1342267996"
	)
	public void method6456(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3694 == null) {
				this.method6443();
			}

			this.field3694.put(var1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1414965691"
	)
	public void method6457(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3695 == null) {
				this.method6443();
			}

			this.field3695.put(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-233873937"
	)
	public boolean method6488(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3692 != null && this.method6459()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3692.method3439()[0] * (float)this.width);
			int var6 = (int)(this.field3692.method3439()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3692.method3439()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3692.method3439()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1058749638"
	)
	public boolean method6459() {
		return this.field3693 == 2;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2113017491"
	)
	public int method6460(String var1) {
		return this.type == 11 && this.field3692 != null && this.method6459() ? this.field3692.method3434(var1) : -1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-425629947"
	)
	public String method6461(String var1) {
		return this.type == 11 && this.field3692 != null && this.method6459() ? this.field3692.method3435(var1) : null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "17038195"
	)
	public int method6462() {
		return this.field3695 != null && this.field3695.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method6437() {
		if (this.type == 11 && this.field3692 != null && this.field3695 != null && !this.field3695.isEmpty()) {
			String var1 = this.field3692.method3479();
			return var1 != null && this.field3695.containsKey(this.field3692.method3479()) ? (Integer)this.field3695.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-887288049"
	)
	public String method6464() {
		if (this.type == 11 && this.field3692 != null) {
			String var1 = this.field3692.method3479();
			Iterator var2 = this.field3692.method3487().iterator();

			while (var2.hasNext()) {
				class181 var3 = (class181)var2.next();
				String var4 = String.format("%%%S%%", var3.method3563());
				if (var3.vmethod3558() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3560()));
				} else {
					var1.replaceAll(var4, var3.vmethod3559());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-282480263"
	)
	public int[] method6561() {
		if (this.type == 11 && this.field3692 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3692.method3487().iterator();

			while (var3.hasNext()) {
				class181 var4 = (class181)var3.next();
				if (!var4.method3563().equals("user_id")) {
					if (var4.vmethod3558() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3560();
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)Z",
		garbageValue = "-687125955"
	)
	public boolean method6466(UrlRequester var1) {
		if (this.type == 11 && this.field3692 != null) {
			this.field3692.method3472(var1);
			if (this.field3692.method3438() != this.field3693) {
				this.field3693 = this.field3692.method3438();
				if (this.field3693 >= 100) {
					return true;
				}

				if (this.field3693 == 2) {
					this.method6467();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-228644187"
	)
	void method6467() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3692.method3436();
		ArrayList var2 = this.field3692.method3437();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class176 var6 = (class176)var5.next();
			var7 = class239.method4787(5, this, var4, 0, 0, 0, 0, var6.field1849);
			var7.field3660 = var6.field1853.method2839();
			class327 var8 = new class327(var6.field1853);
			field3765.method7830(var7.field3660, var8);
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class177 var9 = (class177)var5.next();
			var7 = class239.method4787(4, this, var4, 0, 0, 0, 0, var9.field1858);
			var7.text = var9.field1861;
			var7.fontId = (Integer)this.field3694.get(var9.field1855);
			var7.textXAlignment = var9.field1859;
			var7.textYAlignment = var9.field1860;
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "638323053"
	)
	public void method6455() {
		this.field3696 = new class328();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3696.field3551.method389(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3696.field3551.method390(var2, 0);
		}

		this.field3696.field3551.method390('\u0080', 0);
		this.field3696.field3551.method389(82, 2);
		this.field3696.field3551.method389(81, 2);
		this.field3696.field3551.method389(86, 2);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "1399447726"
	)
	public class330 method6504() {
		return this.field3696 != null ? this.field3696.field3552 : null;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmy;",
		garbageValue = "-1142943567"
	)
	public class325 method6469() {
		return this.field3696 != null ? this.field3696.field3555 : null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lbb;",
		garbageValue = "1031459265"
	)
	public class27 method6463() {
		return this.field3696 != null ? this.field3696.field3551 : null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lmz;",
		garbageValue = "-1841939772"
	)
	public class328 method6471() {
		return this.field3696;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)Z",
		garbageValue = "1511239269"
	)
	boolean method6472(class330 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method6296(class13.method173(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method6163(class13.method173(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2118705753"
	)
	public boolean method6473() {
		class330 var1 = this.method6504();
		if (var1 == null) {
			return false;
		} else {
			boolean var2 = false;
			if (!var1.method6216() && this.fontId != -1) {
				int var3 = var1.method6316();
				int var4 = var1.method6218();
				int var5 = var1.method6215();
				int var6 = var1.method6214();
				Font var7 = this.getFont();
				if (var7 != null) {
					var2 |= var1.method6244(var7);
					var2 |= this.method6472(var1);
					var2 |= var1.method6208(var3, var4);
					var2 |= var1.method6184(var5, var6);
				}
			} else if (var1.method6216()) {
				var2 |= this.method6472(var1);
			}

			var1.method6162();
			return var2;
		}
	}
}
