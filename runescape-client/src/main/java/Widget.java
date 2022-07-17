import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
@ObfuscatedName("kb")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("DBTableIndex_cache")
	public static EvictingDualNodeHashTable DBTableIndex_cache;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("DBTableMasterIndex_cache")
	public static EvictingDualNodeHashTable DBTableMasterIndex_cache;

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "Lmy;")
	static class361 field3364;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "Lmy;")
	static class361 field3434;

	@ObfuscatedName("ap")
	public static boolean field3366;

	@ObfuscatedName("ac")
	@Export("isIf3")
	public boolean isIf3;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = -1038587213)
	@Export("id")
	public int id;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 9919479)
	@Export("childIndex")
	public int childIndex;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = -1118126063)
	@Export("type")
	public int type;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 415919075)
	@Export("buttonType")
	public int buttonType;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -862979207)
	@Export("contentType")
	public int contentType;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 1309107069)
	@Export("xAlignment")
	public int xAlignment;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = -1417249065)
	@Export("yAlignment")
	public int yAlignment;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 273105613)
	@Export("widthAlignment")
	public int widthAlignment;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = -1091004413)
	@Export("heightAlignment")
	public int heightAlignment;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 1898110743)
	@Export("rawX")
	public int rawX;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = -1869502249)
	@Export("rawY")
	public int rawY;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 1783254653)
	@Export("rawWidth")
	public int rawWidth;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 1196896537)
	@Export("rawHeight")
	public int rawHeight;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 1812498029)
	@Export("x")
	public int x;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -2082347123)
	@Export("y")
	public int y;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 2092161229)
	@Export("width")
	public int width;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 236010991)
	@Export("height")
	public int height;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 1874017121)
	public int field3385;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = -172663443)
	public int field3386;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 838621367)
	@Export("parentId")
	public int parentId;

	@ObfuscatedName("bz")
	@Export("isHidden")
	public boolean isHidden;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = -493284763)
	@Export("scrollX")
	public int scrollX;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 1748495919)
	@Export("scrollY")
	public int scrollY;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = 1791635595)
	@Export("scrollWidth")
	public int scrollWidth;

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = -1042306339)
	@Export("scrollHeight")
	public int scrollHeight;

	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = -1451576805)
	@Export("color")
	public int color;

	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = 188440311)
	@Export("color2")
	public int color2;

	@ObfuscatedName("bc")
	@ObfuscatedGetter(intValue = -2054568339)
	@Export("mouseOverColor")
	public int mouseOverColor;

	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = -20212915)
	@Export("mouseOverColor2")
	public int mouseOverColor2;

	@ObfuscatedName("bv")
	@Export("fill")
	public boolean fill;

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("fillMode")
	public FillMode fillMode;

	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = -1829670381)
	@Export("transparencyTop")
	public int transparencyTop;

	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = 1998673549)
	@Export("transparencyBot")
	public int transparencyBot;

	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = 836809511)
	@Export("lineWid")
	public int lineWid;

	@ObfuscatedName("bb")
	public boolean field3402;

	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = -1629333209)
	@Export("spriteId2")
	public int spriteId2;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 1981513631)
	@Export("spriteId")
	public int spriteId;

	@ObfuscatedName("bw")
	public String field3405;

	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 1810600515)
	@Export("spriteAngle")
	public int spriteAngle;

	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;

	@ObfuscatedName("bx")
	@ObfuscatedGetter(intValue = 1694605707)
	@Export("outline")
	public int outline;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = -85393371)
	@Export("spriteShadow")
	public int spriteShadow;

	@ObfuscatedName("by")
	@Export("spriteFlipV")
	public boolean spriteFlipV;

	@ObfuscatedName("bj")
	@Export("spriteFlipH")
	public boolean spriteFlipH;

	@ObfuscatedName("bd")
	@ObfuscatedGetter(intValue = -995090603)
	@Export("modelType")
	public int modelType;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(intValue = -1782143991)
	@Export("modelId")
	public int modelId;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = 1290197811)
	@Export("modelType2")
	int modelType2;

	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = 656981263)
	@Export("modelId2")
	int modelId2;

	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = 2070609235)
	@Export("sequenceId")
	public int sequenceId;

	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = -256587501)
	@Export("sequenceId2")
	public int sequenceId2;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = -1012716483)
	@Export("modelOffsetX")
	public int modelOffsetX;

	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = -572856693)
	@Export("modelOffsetY")
	public int modelOffsetY;

	@ObfuscatedName("cg")
	@ObfuscatedGetter(intValue = 477045813)
	@Export("modelAngleX")
	public int modelAngleX;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = 1709788917)
	@Export("modelAngleY")
	public int modelAngleY;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = 318324183)
	@Export("modelAngleZ")
	public int modelAngleZ;

	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = 2138854643)
	@Export("modelZoom")
	public int modelZoom;

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 257878607)
	public int field3424;

	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = -408566491)
	public int field3373;

	@ObfuscatedName("co")
	@Export("modelOrthog")
	public boolean modelOrthog;

	@ObfuscatedName("cz")
	@Export("modelTransparency")
	public boolean modelTransparency;

	@ObfuscatedName("cu")
	@ObfuscatedGetter(intValue = -1937000389)
	@Export("itemQuantityMode")
	public int itemQuantityMode;

	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = 113073421)
	@Export("fontId")
	public int fontId;

	@ObfuscatedName("cy")
	@Export("text")
	public String text;

	@ObfuscatedName("ca")
	@Export("text2")
	public String text2;

	@ObfuscatedName("ck")
	@ObfuscatedGetter(intValue = -743795135)
	@Export("textLineHeight")
	public int textLineHeight;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = -1036288673)
	@Export("textXAlignment")
	public int textXAlignment;

	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = -933475705)
	@Export("textYAlignment")
	public int textYAlignment;

	@ObfuscatedName("cd")
	@Export("textShadowed")
	public boolean textShadowed;

	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = 1948142259)
	@Export("paddingX")
	public int paddingX;

	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = 1944775287)
	@Export("paddingY")
	public int paddingY;

	@ObfuscatedName("ch")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;

	@ObfuscatedName("dm")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;

	@ObfuscatedName("dd")
	@Export("inventorySprites")
	public int[] inventorySprites;

	@ObfuscatedName("dz")
	@Export("itemActions")
	public String[] itemActions;

	@ObfuscatedName("dr")
	@ObfuscatedSignature(descriptor = "Les;")
	class155 field3483;

	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = 1506293413)
	int field3443;

	@ObfuscatedName("dy")
	HashMap field3403;

	@ObfuscatedName("ds")
	HashMap field3415;

	@ObfuscatedName("dp")
	@ObfuscatedGetter(intValue = -2070315127)
	@Export("flags")
	public int flags;

	@ObfuscatedName("dx")
	public boolean field3498;

	@ObfuscatedName("dl")
	public byte[][] field3448;

	@ObfuscatedName("dc")
	public byte[][] field3406;

	@ObfuscatedName("dn")
	public int[] field3450;

	@ObfuscatedName("do")
	public int[] field3451;

	@ObfuscatedName("da")
	@Export("dataText")
	public String dataText;

	@ObfuscatedName("df")
	@Export("actions")
	public String[] actions;

	@ObfuscatedName("dj")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("parent")
	public Widget parent;

	@ObfuscatedName("dk")
	@ObfuscatedGetter(intValue = 457867783)
	@Export("dragZoneSize")
	public int dragZoneSize;

	@ObfuscatedName("du")
	@ObfuscatedGetter(intValue = -1514522147)
	@Export("dragThreshold")
	public int dragThreshold;

	@ObfuscatedName("db")
	@Export("isScrollBar")
	public boolean isScrollBar;

	@ObfuscatedName("dh")
	@Export("spellActionName")
	public String spellActionName;

	@ObfuscatedName("de")
	@Export("hasListener")
	public boolean hasListener;

	@ObfuscatedName("ew")
	@Export("onLoad")
	public Object[] onLoad;

	@ObfuscatedName("ej")
	@Export("onClick")
	public Object[] onClick;

	@ObfuscatedName("eb")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;

	@ObfuscatedName("ez")
	@Export("onRelease")
	public Object[] onRelease;

	@ObfuscatedName("eg")
	@Export("onHold")
	public Object[] onHold;

	@ObfuscatedName("ea")
	@Export("onMouseOver")
	public Object[] onMouseOver;

	@ObfuscatedName("ed")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;

	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;

	@ObfuscatedName("eq")
	@Export("onDrag")
	public Object[] onDrag;

	@ObfuscatedName("en")
	@Export("onDragComplete")
	public Object[] onDragComplete;

	@ObfuscatedName("ei")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;

	@ObfuscatedName("ec")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;

	@ObfuscatedName("eh")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;

	@ObfuscatedName("ek")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;

	@ObfuscatedName("el")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;

	@ObfuscatedName("eu")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;

	@ObfuscatedName("ep")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;

	@ObfuscatedName("em")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;

	@ObfuscatedName("ex")
	@Export("onTimer")
	public Object[] onTimer;

	@ObfuscatedName("ey")
	@Export("onOp")
	public Object[] onOp;

	@ObfuscatedName("ev")
	@Export("onScroll")
	public Object[] onScroll;

	@ObfuscatedName("ee")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;

	@ObfuscatedName("ef")
	@Export("onKey")
	public Object[] onKey;

	@ObfuscatedName("er")
	public Object[] field3516;

	@ObfuscatedName("et")
	public Object[] field3513;

	@ObfuscatedName("es")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;

	@ObfuscatedName("fr")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;

	@ObfuscatedName("fz")
	public Object[] field3365;

	@ObfuscatedName("fh")
	public Object[] field3353;

	@ObfuscatedName("fw")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;

	@ObfuscatedName("fb")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;

	@ObfuscatedName("fn")
	@Export("onSubChange")
	public Object[] onSubChange;

	@ObfuscatedName("fl")
	@Export("onResize")
	public Object[] onResize;

	@ObfuscatedName("ff")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;

	@ObfuscatedName("fm")
	public Object[] field3494;

	@ObfuscatedName("fo")
	public Object[] field3495;

	@ObfuscatedName("fv")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;

	@ObfuscatedName("fy")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;

	@ObfuscatedName("fc")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;

	@ObfuscatedName("fp")
	@ObfuscatedGetter(intValue = 1995877883)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;

	@ObfuscatedName("fa")
	@Export("spellName")
	public String spellName;

	@ObfuscatedName("fg")
	@Export("buttonText")
	public String buttonText;

	@ObfuscatedName("fi")
	@Export("itemIds")
	public int[] itemIds;

	@ObfuscatedName("fe")
	@Export("itemQuantities")
	public int[] itemQuantities;

	@ObfuscatedName("fu")
	@ObfuscatedGetter(intValue = 402623915)
	@Export("itemId")
	public int itemId;

	@ObfuscatedName("fs")
	@ObfuscatedGetter(intValue = 1163106397)
	@Export("itemQuantity")
	public int itemQuantity;

	@ObfuscatedName("fk")
	@ObfuscatedGetter(intValue = -433476253)
	@Export("modelFrame")
	public int modelFrame;

	@ObfuscatedName("fj")
	@ObfuscatedGetter(intValue = 1260061199)
	@Export("modelFrameCycle")
	public int modelFrameCycle;

	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = "[Lkb;")
	@Export("children")
	public Widget[] children;

	@ObfuscatedName("fx")
	@Export("containsMouse")
	public boolean containsMouse;

	@ObfuscatedName("fd")
	@Export("isClicked")
	public boolean isClicked;

	@ObfuscatedName("fq")
	@ObfuscatedGetter(intValue = -991745953)
	public int field3426;

	@ObfuscatedName("gx")
	@ObfuscatedGetter(intValue = 1109857383)
	public int field3512;

	@ObfuscatedName("gf")
	@ObfuscatedGetter(intValue = -666577749)
	public int field3367;

	@ObfuscatedName("gi")
	@ObfuscatedGetter(intValue = -6385865)
	public int field3514;

	@ObfuscatedName("gr")
	@ObfuscatedGetter(intValue = 1568734049)
	@Export("rootIndex")
	public int rootIndex;

	@ObfuscatedName("gk")
	@ObfuscatedGetter(intValue = 426616237)
	@Export("cycle")
	public int cycle;

	@ObfuscatedName("gs")
	public int[] field3517;

	@ObfuscatedName("gp")
	@Export("noClickThrough")
	public boolean noClickThrough;

	@ObfuscatedName("gc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;

	@ObfuscatedName("gv")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		DBTableIndex_cache = new EvictingDualNodeHashTable(50);
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3364 = new class361(10, class359.field4260);
		field3434 = new class361(10, class359.field4260);
		field3366 = false;
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
		this.field3385 = 1;
		this.field3386 = 1;
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
		this.field3402 = false;
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
		this.field3424 = 0;
		this.field3373 = 0;
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
		this.paddingX = 0;
		this.paddingY = 0;
		this.field3443 = -1;
		this.flags = 0;
		this.field3498 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.spellName = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.containsMouse = false;
		this.isClicked = false;
		this.field3426 = -1;
		this.field3512 = 0;
		this.field3367 = 0;
		this.field3514 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "-47")
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
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];
				for (var6 = 0; var6 < var5; ++var6) {
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
		if (this.type == 2) {
			this.itemIds = new int[this.rawHeight * this.rawWidth];
			this.itemQuantities = new int[this.rawHeight * this.rawWidth];
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 268435456;
			}
			var5 = var1.readUnsignedByte();
			if (var5 == 1) {
				this.flags |= 1073741824;
			}
			var6 = var1.readUnsignedByte();
			if (var6 == 1) {
				this.flags |= Integer.MIN_VALUE;
			}
			int var7 = var1.readUnsignedByte();
			if (var7 == 1) {
				this.flags |= 536870912;
			}
			this.paddingX = var1.readUnsignedByte();
			this.paddingY = var1.readUnsignedByte();
			this.inventoryXOffsets = new int[20];
			this.inventoryYOffsets = new int[20];
			this.inventorySprites = new int[20];
			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				int var11 = var1.readUnsignedByte();
				if (var11 == 1) {
					this.inventoryXOffsets[var8] = var1.readShort();
					this.inventoryYOffsets[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}
			this.itemActions = new String[5];
			for (var8 = 0; var8 < 5; ++var8) {
				String var9 = var1.readStringCp1252NullTerminated();
				if (var9.length() > 0) {
					this.itemActions[var8] = var9;
					this.flags |= 1 << var8 + 23;
				}
			}
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
		if (this.type == 7) {
			this.itemIds = new int[this.rawWidth * this.rawHeight];
			this.itemQuantities = new int[this.rawHeight * this.rawWidth];
			this.textXAlignment = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
			this.paddingX = var1.readShort();
			this.paddingY = var1.readShort();
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 1073741824;
			}
			this.itemActions = new String[5];
			for (var5 = 0; var5 < 5; ++var5) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.itemActions[var5] = var10;
					this.flags |= 1 << var5 + 23;
				}
			}
		}
		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}
		if (this.buttonType == 2 || this.type == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.spellName = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqt;S)V", garbageValue = "18120")
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
				this.field3424 = var1.readUnsignedShort();
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
			this.field3402 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqt;B)[Ljava/lang/Object;", garbageValue = "109")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lqt;I)[I", garbageValue = "-346146000")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "39")
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(ZLcd;B)Lqe;", garbageValue = "84")
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3366 = false;
		if (this.field3405 != null) {
			SpritePixels var3 = this.method5607(var2);
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
			long var4 = (((long) (this.spriteShadow)) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (((long) (this.outline)) << 36) + ((long) (var7)) + ((this.spriteFlipV ? 1L : 0L) << 38);
			SpritePixels var6 = ((SpritePixels) (Widget_cachedSprites.get(var4)));
			if (var6 != null) {
				return var6;
			} else {
				var6 = class7.SpriteBuffer_getSprite(StructComposition.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3366 = true;
					return null;
				} else {
					this.method5699(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lcd;I)Lqe;", garbageValue = "1267758311")
	SpritePixels method5607(UrlRequester var1) {
		if (!this.method5611()) {
			return this.method5610(var1);
		} else {
			String var2 = this.field3405 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var3 = ((SpritePixels) (field3434.method6538(var2)));
			if (var3 == null) {
				SpritePixels var4 = this.method5610(var1);
				if (var4 != null) {
					var3 = var4.method8151();
					this.method5699(var3);
					field3434.method6539(var2, var3);
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lcd;I)Lqe;", garbageValue = "-1472222097")
	SpritePixels method5610(UrlRequester var1) {
		if (this.field3405 != null && var1 != null) {
			class290 var2 = ((class290) (field3364.method6538(this.field3405)));
			if (var2 == null) {
				var2 = new class290(this.field3405, var1);
				field3364.method6539(this.field3405, var2);
			}
			return var2.method5562();
		} else {
			return null;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2722954")
	boolean method5611() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lqe;I)V", garbageValue = "1165836984")
	void method5699(SpritePixels var1) {
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(I)Lmt;", garbageValue = "1724756527")
	@Export("getFont")
	public Font getFont() {
		field3366 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = ((Font) (DBTableMasterIndex_cache.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = StructComposition.Widget_spritesArchive;
				AbstractArchive var4 = MilliClock.Widget_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Ignored.method6774(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class426.SpriteBuffer_xOffsets, class142.SpriteBuffer_yOffsets, class359.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, class13.SpriteBuffer_spritePalette, class421.SpriteBuffer_pixels);
						class426.SpriteBuffer_xOffsets = null;
						class142.SpriteBuffer_yOffsets = null;
						class359.SpriteBuffer_spriteWidths = null;
						class456.SpriteBuffer_spriteHeights = null;
						class13.SpriteBuffer_spritePalette = null;
						class421.SpriteBuffer_pixels = null;
						var6 = var8;
					}
					var2 = var6;
				}
				if (var2 != null) {
					DBTableMasterIndex_cache.put(var2, ((long) (this.fontId)));
				} else {
					field3366 = true;
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)Lqe;", garbageValue = "1707735518")
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3366 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = ((SpritePixels) (Widget_cachedSprites.get(((long) (var2)))));
				if (var3 != null) {
					return var3;
				} else {
					var3 = class7.SpriteBuffer_getSprite(StructComposition.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, ((long) (var2)));
					} else {
						field3366 = true;
					}
					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lgc;IZLkt;S)Lhy;", garbageValue = "-28815")
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3366 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = this.modelType2;
			var6 = this.modelId2;
		} else {
			var5 = this.modelType;
			var6 = this.modelId;
		}
		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else {
			Model var7 = ((Model) (DBTableIndex_cache.get(((long) (var6 + (var5 << 16))))));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(class126.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3366 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 2) {
					var8 = BuddyRankComparator.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3366 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 3) {
					if (var4 == null) {
						return null;
					}
					var8 = var4.getModelData();
					if (var8 == null) {
						field3366 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 4) {
					ItemComposition var9 = EnumComposition.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3366 = true;
						return null;
					}
					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
				}
				DBTableIndex_cache.put(var7, ((long) (var6 + (var5 << 16))));
			}
			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}
			return var7;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ZB)Lkp;", garbageValue = "11")
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}
		int var2 = (var1) ? this.spriteId * 1981513631 * -444474273 : this.spriteId2 * -1629333209 * -646609257;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = (((long) (this.spriteShadow)) << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (((long) (this.outline)) << 36) + ((long) (var2)) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = ((SpriteMask) (Widget_cachedSpriteMasks.get(var3)));
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, ((UrlRequester) (null)));
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V", garbageValue = "-32")
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-816942050")
	public boolean method5618() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcd;J)V")
	public void method5619(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3483 = new class155();
			if (!this.field3483.method3174(var1, var2)) {
				this.field3483 = null;
			} else if (this.field3403 == null || this.field3415 == null) {
				this.method5668();
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-443886653")
	void method5668() {
		this.field3403 = new HashMap();
		this.field3415 = new HashMap();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IIS)V", garbageValue = "7845")
	public void method5621(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3403 == null) {
				this.method5668();
			}
			this.field3403.put(var1, var2);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)V", garbageValue = "3")
	public void method5622(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3415 == null) {
				this.method5668();
			}
			this.field3415.put(var1, var2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIIII)Z", garbageValue = "-1298089118")
	public boolean method5623(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3483 != null && this.method5680()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = ((int) (this.field3483.method3182()[0] * ((float) (this.width))));
			int var6 = ((int) (this.field3483.method3182()[1] * ((float) (this.height))));
			int var7 = var5 + ((int) (this.field3483.method3182()[2] * ((float) (this.width))));
			int var8 = var6 + ((int) (this.field3483.method3182()[3] * ((float) (this.height))));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-26")
	public boolean method5680() {
		return this.field3443 == 2;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "1088006631")
	public int method5625(String var1) {
		return this.type == 11 && this.field3483 != null && this.method5680() ? this.field3483.method3196(var1) : -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "1684221351")
	public String method5626(String var1) {
		return this.type == 11 && this.field3483 != null && this.method5680() ? this.field3483.method3178(var1) : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1532573495")
	public int method5627() {
		return this.field3415 != null && this.field3415.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1221314363")
	public int method5709() {
		if (this.type == 11 && this.field3483 != null && this.field3415 != null && !this.field3415.isEmpty()) {
			String var1 = this.field3483.method3201();
			return var1 != null && this.field3415.containsKey(this.field3483.method3201()) ? ((Integer) (this.field3415.get(var1))) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "339767953")
	public String method5629() {
		if (this.type == 11 && this.field3483 != null) {
			String var1 = this.field3483.method3201();
			Iterator var2 = this.field3483.method3183().iterator();
			while (var2.hasNext()) {
				class165 var3 = ((class165) (var2.next()));
				String var4 = String.format("%%%S%%", var3.method3315());
				if (var3.vmethod3314() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3318()));
				} else {
					var1.replaceAll(var4, var3.vmethod3320());
				}
			} 
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(B)[I", garbageValue = "111")
	public int[] method5630() {
		if (this.type == 11 && this.field3483 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3483.method3183().iterator();
			while (var3.hasNext()) {
				class165 var4 = ((class165) (var3.next()));
				if (!var4.method3315().equals("user_id")) {
					if (var4.vmethod3314() != 0) {
						return null;
					}
					var1[var2++] = var4.vmethod3318();
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(Lcd;B)Z", garbageValue = "4")
	public boolean method5628(UrlRequester var1) {
		if (this.type == 11 && this.field3483 != null) {
			this.field3483.method3175(var1);
			if (this.field3483.method3176() != this.field3443) {
				this.field3443 = this.field3483.method3176();
				if (this.field3443 >= 100) {
					return true;
				}
				if (this.field3443 == 2) {
					this.method5632();
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1057032420")
	void method5632() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3483.method3179();
		ArrayList var2 = this.field3483.method3190();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;
		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class160 var6 = ((class160) (var5.next()));
			var7 = class11.method97(5, this, var4, 0, 0, 0, 0, var6.field1770);
			var7.field3405 = var6.field1772.method2553();
			class290 var8 = new class290(var6.field1772);
			field3364.method6539(var7.field3405, var8);
		}
		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class161 var9 = ((class161) (var5.next()));
			var7 = class11.method97(4, this, var4, 0, 0, 0, 0, var9.field1776);
			var7.text = var9.field1775;
			var7.fontId = ((Integer) (this.field3403.get(var9.field1779)));
			var7.textXAlignment = var9.field1773;
			var7.textYAlignment = var9.field1777;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-827050905")
	public static void method5711() {
		KitDefinition.KitDefinition_cached.clear();
	}
}