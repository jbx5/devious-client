import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("kn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("b")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "Lmv;")
	static class362 field3353;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "Lmv;")
	static class362 field3354;

	@ObfuscatedName("ab")
	public static boolean field3355;

	@ObfuscatedName("ak")
	@Export("isIf3")
	public boolean isIf3 = false;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = -1692370233)
	@Export("id")
	public int id = -1;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 1985146419)
	@Export("childIndex")
	public int childIndex = -1;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 1201269859)
	@Export("type")
	public int type;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = -1098684151)
	@Export("buttonType")
	public int buttonType = 0;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = -869460521)
	@Export("contentType")
	public int contentType = 0;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = -2080401453)
	@Export("xAlignment")
	public int xAlignment = 0;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -2086392833)
	@Export("yAlignment")
	public int yAlignment = 0;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -1449916075)
	@Export("widthAlignment")
	public int widthAlignment = 0;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = -2042764293)
	@Export("heightAlignment")
	public int heightAlignment = 0;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = -339501621)
	@Export("rawX")
	public int rawX = 0;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 1265895161)
	@Export("rawY")
	public int rawY = 0;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 1872611649)
	@Export("rawWidth")
	public int rawWidth = 0;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 574495541)
	@Export("rawHeight")
	public int rawHeight = 0;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = -1173389335)
	@Export("x")
	public int x = 0;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 328534653)
	@Export("y")
	public int y = 0;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = 1791266795)
	@Export("width")
	public int width = 0;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -1514292503)
	@Export("height")
	public int height = 0;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -1396126225)
	public int field3350 = 1;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 588332801)
	public int field3375 = 1;

	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = -1386189839)
	@Export("parentId")
	public int parentId = -1;

	@ObfuscatedName("bn")
	@Export("isHidden")
	public boolean isHidden = false;

	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 1283436399)
	@Export("scrollX")
	public int scrollX = 0;

	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 948421307)
	@Export("scrollY")
	public int scrollY = 0;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = -1006221665)
	@Export("scrollWidth")
	public int scrollWidth = 0;

	@ObfuscatedName("bb")
	@ObfuscatedGetter(intValue = 1738105285)
	@Export("scrollHeight")
	public int scrollHeight = 0;

	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = 206952531)
	@Export("color")
	public int color = 0;

	@ObfuscatedName("bw")
	@ObfuscatedGetter(intValue = -1487817857)
	@Export("color2")
	public int color2 = 0;

	@ObfuscatedName("bd")
	@ObfuscatedGetter(intValue = 1831757597)
	@Export("mouseOverColor")
	public int mouseOverColor = 0;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = -422417861)
	@Export("mouseOverColor2")
	public int mouseOverColor2 = 0;

	@ObfuscatedName("by")
	@Export("fill")
	public boolean fill = false;

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "Lql;")
	@Export("fillMode")
	public FillMode fillMode;

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = 1862587825)
	@Export("transparencyTop")
	public int transparencyTop;

	@ObfuscatedName("bx")
	@ObfuscatedGetter(intValue = -1671797363)
	@Export("transparencyBot")
	public int transparencyBot;

	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 1441138687)
	@Export("lineWid")
	public int lineWid;

	@ObfuscatedName("bh")
	public boolean field3450;

	@ObfuscatedName("bc")
	@ObfuscatedGetter(intValue = -1683946141)
	@Export("spriteId2")
	public int spriteId2;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 2075518097)
	@Export("spriteId")
	public int spriteId;

	@ObfuscatedName("bp")
	public String field3373;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 169556581)
	@Export("spriteAngle")
	public int spriteAngle;

	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;

	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 825781849)
	@Export("outline")
	public int outline;

	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 1083523037)
	@Export("spriteShadow")
	public int spriteShadow;

	@ObfuscatedName("be")
	@Export("spriteFlipV")
	public boolean spriteFlipV;

	@ObfuscatedName("bk")
	@Export("spriteFlipH")
	public boolean spriteFlipH;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = -842966883)
	@Export("modelType")
	public int modelType;

	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = 1197822757)
	@Export("modelId")
	public int modelId;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 1418278355)
	@Export("modelType2")
	int modelType2;

	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = 316481687)
	@Export("modelId2")
	int modelId2;

	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = -1955723579)
	@Export("sequenceId")
	public int sequenceId;

	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = 263482215)
	@Export("sequenceId2")
	public int sequenceId2;

	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = 940231021)
	@Export("modelOffsetX")
	public int modelOffsetX;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = -1122893609)
	@Export("modelOffsetY")
	public int modelOffsetY;

	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = 530256893)
	@Export("modelAngleX")
	public int modelAngleX;

	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = 1932334201)
	@Export("modelAngleY")
	public int modelAngleY;

	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = 65435751)
	@Export("modelAngleZ")
	public int modelAngleZ;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = 1157555055)
	@Export("modelZoom")
	public int modelZoom;

	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = 1081605869)
	public int field3413;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = 1514535987)
	public int field3414;

	@ObfuscatedName("ct")
	@Export("modelOrthog")
	public boolean modelOrthog;

	@ObfuscatedName("cp")
	@Export("modelTransparency")
	public boolean modelTransparency;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(intValue = 1966025381)
	@Export("itemQuantityMode")
	public int itemQuantityMode;

	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = -1166595023)
	@Export("fontId")
	public int fontId;

	@ObfuscatedName("cy")
	@Export("text")
	public String text;

	@ObfuscatedName("cw")
	@Export("text2")
	public String text2;

	@ObfuscatedName("cg")
	@ObfuscatedGetter(intValue = 469641899)
	@Export("textLineHeight")
	public int textLineHeight;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = -1919179427)
	@Export("textXAlignment")
	public int textXAlignment;

	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = -475467991)
	@Export("textYAlignment")
	public int textYAlignment;

	@ObfuscatedName("cu")
	@Export("textShadowed")
	public boolean textShadowed;

	@ObfuscatedName("ca")
	@ObfuscatedGetter(intValue = 962208849)
	@Export("paddingX")
	public int paddingX;

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = -883190129)
	@Export("paddingY")
	public int paddingY;

	@ObfuscatedName("ck")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;

	@ObfuscatedName("du")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;

	@ObfuscatedName("di")
	@Export("inventorySprites")
	public int[] inventorySprites;

	@ObfuscatedName("dw")
	@Export("itemActions")
	public String[] itemActions;

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = "Leu;")
	class155 field3431;

	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = 1875634429)
	int field3432;

	@ObfuscatedName("dd")
	HashMap field3433;

	@ObfuscatedName("dz")
	HashMap field3438;

	@ObfuscatedName("ds")
	@ObfuscatedGetter(intValue = -143869235)
	@Export("flags")
	public int flags;

	@ObfuscatedName("dr")
	public boolean field3436;

	@ObfuscatedName("dx")
	public byte[][] field3349;

	@ObfuscatedName("dp")
	public byte[][] field3497;

	@ObfuscatedName("dg")
	public int[] field3439;

	@ObfuscatedName("dj")
	public int[] field3410;

	@ObfuscatedName("dk")
	@Export("dataText")
	public String dataText;

	@ObfuscatedName("db")
	@Export("actions")
	public String[] actions;

	@ObfuscatedName("df")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("parent")
	public Widget parent;

	@ObfuscatedName("de")
	@ObfuscatedGetter(intValue = 1903319757)
	@Export("dragZoneSize")
	public int dragZoneSize;

	@ObfuscatedName("da")
	@ObfuscatedGetter(intValue = 202583677)
	@Export("dragThreshold")
	public int dragThreshold;

	@ObfuscatedName("dl")
	@Export("isScrollBar")
	public boolean isScrollBar;

	@ObfuscatedName("dh")
	@Export("spellActionName")
	public String spellActionName;

	@ObfuscatedName("dc")
	@Export("hasListener")
	public boolean hasListener;

	@ObfuscatedName("ev")
	@Export("onLoad")
	public Object[] onLoad;

	@ObfuscatedName("ei")
	@Export("onClick")
	public Object[] onClick;

	@ObfuscatedName("ek")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;

	@ObfuscatedName("el")
	@Export("onRelease")
	public Object[] onRelease;

	@ObfuscatedName("ej")
	@Export("onHold")
	public Object[] onHold;

	@ObfuscatedName("eb")
	@Export("onMouseOver")
	public Object[] onMouseOver;

	@ObfuscatedName("ea")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;

	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;

	@ObfuscatedName("es")
	@Export("onDrag")
	public Object[] onDrag;

	@ObfuscatedName("eh")
	@Export("onDragComplete")
	public Object[] onDragComplete;

	@ObfuscatedName("ep")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;

	@ObfuscatedName("ex")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;

	@ObfuscatedName("eq")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;

	@ObfuscatedName("ew")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;

	@ObfuscatedName("eg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;

	@ObfuscatedName("et")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;

	@ObfuscatedName("ez")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;

	@ObfuscatedName("ee")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;

	@ObfuscatedName("ec")
	@Export("onTimer")
	public Object[] onTimer;

	@ObfuscatedName("ey")
	@Export("onOp")
	public Object[] onOp;

	@ObfuscatedName("ed")
	@Export("onScroll")
	public Object[] onScroll;

	@ObfuscatedName("en")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;

	@ObfuscatedName("em")
	@Export("onKey")
	public Object[] onKey;

	@ObfuscatedName("eo")
	public Object[] field3472;

	@ObfuscatedName("er")
	public Object[] field3493;

	@ObfuscatedName("eu")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;

	@ObfuscatedName("fu")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;

	@ObfuscatedName("fk")
	public Object[] field3476;

	@ObfuscatedName("fd")
	public Object[] field3369;

	@ObfuscatedName("ff")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;

	@ObfuscatedName("ft")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;

	@ObfuscatedName("fc")
	@Export("onSubChange")
	public Object[] onSubChange;

	@ObfuscatedName("fp")
	@Export("onResize")
	public Object[] onResize;

	@ObfuscatedName("fb")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;

	@ObfuscatedName("fq")
	public Object[] field3441;

	@ObfuscatedName("fg")
	public Object[] field3364;

	@ObfuscatedName("fa")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;

	@ObfuscatedName("fx")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;

	@ObfuscatedName("fz")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;

	@ObfuscatedName("fw")
	@ObfuscatedGetter(intValue = 186793221)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;

	@ObfuscatedName("fy")
	@Export("spellName")
	public String spellName;

	@ObfuscatedName("fr")
	@Export("buttonText")
	public String buttonText;

	@ObfuscatedName("fv")
	@Export("itemIds")
	public int[] itemIds;

	@ObfuscatedName("fi")
	@Export("itemQuantities")
	public int[] itemQuantities;

	@ObfuscatedName("fe")
	@ObfuscatedGetter(intValue = 1646409911)
	@Export("itemId")
	public int itemId;

	@ObfuscatedName("fn")
	@ObfuscatedGetter(intValue = 948778825)
	@Export("itemQuantity")
	public int itemQuantity;

	@ObfuscatedName("fo")
	@ObfuscatedGetter(intValue = 1038522613)
	@Export("modelFrame")
	public int modelFrame;

	@ObfuscatedName("fj")
	@ObfuscatedGetter(intValue = -511764213)
	@Export("modelFrameCycle")
	public int modelFrameCycle;

	@ObfuscatedName("fl")
	@ObfuscatedSignature(descriptor = "[Lkn;")
	@Export("children")
	public Widget[] children;

	@ObfuscatedName("fh")
	@Export("containsMouse")
	public boolean containsMouse;

	@ObfuscatedName("fs")
	@Export("isClicked")
	public boolean isClicked;

	@ObfuscatedName("fm")
	@ObfuscatedGetter(intValue = -867044079)
	public int field3500;

	@ObfuscatedName("gz")
	@ObfuscatedGetter(intValue = -1345565661)
	public int field3501;

	@ObfuscatedName("gw")
	@ObfuscatedGetter(intValue = -61404705)
	public int field3502;

	@ObfuscatedName("gm")
	@ObfuscatedGetter(intValue = 1667459535)
	public int field3503;

	@ObfuscatedName("gu")
	@ObfuscatedGetter(intValue = 939629325)
	@Export("rootIndex")
	public int rootIndex;

	@ObfuscatedName("gc")
	@ObfuscatedGetter(intValue = -1655892453)
	@Export("cycle")
	public int cycle;

	@ObfuscatedName("gb")
	public int[] field3506;

	@ObfuscatedName("gj")
	@Export("noClickThrough")
	public boolean noClickThrough;

	@ObfuscatedName("gh")
	@Export("noScrollThrough")
	public boolean noScrollThrough;

	@ObfuscatedName("gl")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3353 = new class362(10, class360.field4257);
		field3354 = new class362(10, class360.field4257);
		field3355 = false;
	}

	public Widget() {
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3450 = false;
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
		this.field3413 = 0;
		this.field3414 = 0;
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
		this.field3432 = -1;
		this.flags = 0;
		this.field3436 = false;
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
		this.field3500 = -1;
		this.field3501 = 0;
		this.field3502 = 0;
		this.field3503 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "1982690339")
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
			this.itemIds = new int[this.rawHeight * this.rawWidth];
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "1")
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
				this.field3413 = var1.readUnsignedShort();
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
			this.field3450 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqr;B)[Ljava/lang/Object;", garbageValue = "79")
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqr;I)[I", garbageValue = "-1033416563")
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1593898417")
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(ZLcu;I)Lqn;", garbageValue = "-70180775")
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3355 = false;
		if (this.field3373 != null) {
			SpritePixels var3 = this.method5536(var2);
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
			long var4 = (((long) (this.spriteShadow)) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (((long) (this.outline)) << 36) + ((long) (var7));
			SpritePixels var6 = ((SpritePixels) (Widget_cachedSprites.get(var4)));
			if (var6 != null) {
				return var6;
			} else {
				var6 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapData_1.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3355 = true;
					return null;
				} else {
					this.method5549(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lcu;B)Lqn;", garbageValue = "4")
	SpritePixels method5536(UrlRequester var1) {
		if (!this.method5538()) {
			return this.method5537(var1);
		} else {
			String var2 = this.field3373 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var3 = ((SpritePixels) (field3354.method6498(var2)));
			if (var3 == null) {
				SpritePixels var4 = this.method5537(var1);
				if (var4 != null) {
					var3 = var4.method8107();
					this.method5549(var3);
					field3354.method6499(var2, var3);
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lcu;I)Lqn;", garbageValue = "-1200830767")
	SpritePixels method5537(UrlRequester var1) {
		if (this.field3373 != null && var1 != null) {
			class291 var2 = ((class291) (field3353.method6498(this.field3373)));
			if (var2 == null) {
				var2 = new class291(this.field3373, var1);
				field3353.method6499(this.field3373, var2);
			}
			return var2.method5491();
		} else {
			return null;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1273422069")
	boolean method5538() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(Lqn;I)V", garbageValue = "1935007287")
	void method5549(SpritePixels var1) {
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Lmg;", garbageValue = "-1963367798")
	@Export("getFont")
	public Font getFont() {
		field3355 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = ((Font) (Widget_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = WorldMapData_1.Widget_spritesArchive;
				AbstractArchive var4 = SceneTilePaint.Widget_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Tile.method3937(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class457.SpriteBuffer_xOffsets, InterfaceParent.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, SoundCache.SpriteBuffer_spriteHeights, class457.SpriteBuffer_spritePalette, class181.SpriteBuffer_pixels);
						class457.SpriteBuffer_xOffsets = null;
						InterfaceParent.SpriteBuffer_yOffsets = null;
						class457.SpriteBuffer_spriteWidths = null;
						SoundCache.SpriteBuffer_spriteHeights = null;
						class457.SpriteBuffer_spritePalette = null;
						class181.SpriteBuffer_pixels = null;
						var6 = var8;
					}
					var2 = var6;
				}
				if (var2 != null) {
					Widget_cachedFonts.put(var2, ((long) (this.fontId)));
				} else {
					field3355 = true;
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(II)Lqn;", garbageValue = "2131002805")
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3355 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = ((SpritePixels) (Widget_cachedSprites.get(((long) (var2)))));
				if (var3 != null) {
					return var3;
				} else {
					var3 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapData_1.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, ((long) (var2)));
					} else {
						field3355 = true;
					}
					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lgh;IZLkk;I)Lhp;", garbageValue = "806847612")
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3355 = false;
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
			Model var7 = ((Model) (Widget_cachedModels.get(((long) (var6 + (var5 << 16))))));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(class193.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3355 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 2) {
					var8 = class119.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3355 = true;
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
						field3355 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 4) {
					ItemComposition var9 = AttackOption.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3355 = true;
						return null;
					}
					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
				}
				Widget_cachedModels.put(var7, ((long) (var6 + (var5 << 16))));
			}
			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}
			return var7;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(ZI)Lkl;", garbageValue = "-1731243939")
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}
		int var2 = (var1) ? this.spriteId : this.spriteId2;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = (((long) (this.spriteShadow)) << 40) + (((long) (this.outline)) << 36) + ((long) (var2)) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V", garbageValue = "1")
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-639201758")
	public boolean method5545() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcu;J)V")
	public void method5539(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3431 = new class155();
			if (!this.field3431.method3163(var1, var2)) {
				this.field3431 = null;
			} else if (this.field3433 == null || this.field3438 == null) {
				this.method5547();
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-15")
	void method5547() {
		this.field3433 = new HashMap();
		this.field3438 = new HashMap();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "2009455757")
	public void method5548(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3433 == null) {
				this.method5547();
			}
			this.field3433.put(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V", garbageValue = "4210688")
	public void method5533(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3438 == null) {
				this.method5547();
			}
			this.field3438.put(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(IIIIB)Z", garbageValue = "90")
	public boolean method5550(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3431 != null && this.method5562()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = ((int) (this.field3431.method3114()[0] * ((float) (this.width))));
			int var6 = ((int) (this.field3431.method3114()[1] * ((float) (this.height))));
			int var7 = var5 + ((int) (this.field3431.method3114()[2] * ((float) (this.width))));
			int var8 = var6 + ((int) (this.field3431.method3114()[3] * ((float) (this.height))));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "0")
	public boolean method5562() {
		return this.field3432 == 2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I", garbageValue = "0")
	public int method5552(String var1) {
		return this.type == 11 && this.field3431 != null && this.method5562() ? this.field3431.method3109(var1) : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-1172353469")
	public String method5553(String var1) {
		return this.type == 11 && this.field3431 != null && this.method5562() ? this.field3431.method3110(var1) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-648571099")
	public int method5554() {
		return this.field3438 != null && this.field3438.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-43")
	public int method5555() {
		if (this.type == 11 && this.field3431 != null && this.field3438 != null && !this.field3438.isEmpty()) {
			String var1 = this.field3431.method3113();
			return var1 != null && this.field3438.containsKey(this.field3431.method3113()) ? ((Integer) (this.field3438.get(var1))) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "64")
	public String method5556() {
		if (this.type == 11 && this.field3431 != null) {
			String var1 = this.field3431.method3113();
			Iterator var2 = this.field3431.method3115().iterator();
			while (var2.hasNext()) {
				class165 var3 = ((class165) (var2.next()));
				String var4 = String.format("%%%S%%", var3.method3238());
				if (var3.vmethod3237() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3239()));
				} else {
					var1.replaceAll(var4, var3.vmethod3250());
				}
			} 
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "1611673564")
	public int[] method5595() {
		if (this.type == 11 && this.field3431 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3431.method3115().iterator();
			while (var3.hasNext()) {
				class165 var4 = ((class165) (var3.next()));
				if (!var4.method3238().equals("user_id")) {
					if (var4.vmethod3237() != 0) {
						return null;
					}
					var1[var2++] = var4.vmethod3239();
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(Lcu;I)Z", garbageValue = "776569608")
	public boolean method5610(UrlRequester var1) {
		if (this.type == 11 && this.field3431 != null) {
			this.field3431.method3138(var1);
			if (this.field3431.method3108() != this.field3432) {
				this.field3432 = this.field3431.method3108();
				if (this.field3432 >= 100) {
					return true;
				}
				if (this.field3432 == 2) {
					this.method5559();
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1888219962")
	void method5559() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3431.method3142();
		ArrayList var2 = this.field3431.method3112();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;
		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class160 var6 = ((class160) (var5.next()));
			var7 = InvDefinition.method3278(5, this, var4, 0, 0, 0, 0, var6.field1748);
			var7.field3373 = var6.field1749.method2528();
			class291 var8 = new class291(var6.field1749);
			field3353.method6499(var7.field3373, var8);
		}
		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class161 var9 = ((class161) (var5.next()));
			var7 = InvDefinition.method3278(4, this, var4, 0, 0, 0, 0, var9.field1752);
			var7.text = var9.field1755;
			var7.fontId = ((Integer) (this.field3433.get(var9.field1759)));
			var7.textXAlignment = var9.field1758;
			var7.textYAlignment = var9.field1757;
		}
	}
}