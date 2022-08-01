import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("ku")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[[Lku;")
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Lmq;")
	static class362 field3519;

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "Lmq;")
	static class362 field3515;

	@ObfuscatedName("as")
	public static boolean field3363;

	@ObfuscatedName("jr")
	@ObfuscatedGetter(intValue = 173421621)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("ab")
	@Export("isIf3")
	public boolean isIf3 = false;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -940779991)
	@Export("id")
	public int id = -1;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 809492441)
	@Export("childIndex")
	public int childIndex = -1;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 224165055)
	@Export("type")
	public int type;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = -1673595911)
	@Export("buttonType")
	public int buttonType = 0;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 550569655)
	@Export("contentType")
	public int contentType = 0;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -54816615)
	@Export("xAlignment")
	public int xAlignment = 0;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 398955597)
	@Export("yAlignment")
	public int yAlignment = 0;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -1788232171)
	@Export("widthAlignment")
	public int widthAlignment = 0;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 797662809)
	@Export("heightAlignment")
	public int heightAlignment = 0;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 1342397975)
	@Export("rawX")
	public int rawX = 0;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 1248159873)
	@Export("rawY")
	public int rawY = 0;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = -1137463127)
	@Export("rawWidth")
	public int rawWidth = 0;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 2079384023)
	@Export("rawHeight")
	public int rawHeight = 0;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 764674357)
	@Export("x")
	public int x = 0;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 1792986725)
	@Export("y")
	public int y = 0;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = -1519131909)
	@Export("width")
	public int width = 0;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = -350307553)
	@Export("height")
	public int height = 0;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 926940563)
	public int field3382 = 1;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = -965777009)
	public int field3383 = 1;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = -1819057827)
	@Export("parentId")
	public int parentId = -1;

	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden = false;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = -284902953)
	@Export("scrollX")
	public int scrollX = 0;

	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 607496375)
	@Export("scrollY")
	public int scrollY = 0;

	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 61033611)
	@Export("scrollWidth")
	public int scrollWidth = 0;

	@ObfuscatedName("bd")
	@ObfuscatedGetter(intValue = 1237899475)
	@Export("scrollHeight")
	public int scrollHeight = 0;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 69752043)
	@Export("color")
	public int color = 0;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 11937597)
	@Export("color2")
	public int color2 = 0;

	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = -2108910317)
	@Export("mouseOverColor")
	public int mouseOverColor = 0;

	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = 1166558025)
	@Export("mouseOverColor2")
	public int mouseOverColor2 = 0;

	@ObfuscatedName("bj")
	@Export("fill")
	public boolean fill = false;

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("fillMode")
	public FillMode fillMode;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = 1152643983)
	@Export("transparencyTop")
	public int transparencyTop;

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = -710952399)
	@Export("transparencyBot")
	public int transparencyBot;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 1483236085)
	@Export("lineWid")
	public int lineWid;

	@ObfuscatedName("bx")
	public boolean field3399;

	@ObfuscatedName("bb")
	@ObfuscatedGetter(intValue = 1584437563)
	@Export("spriteId2")
	public int spriteId2;

	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = -46900953)
	@Export("spriteId")
	public int spriteId;

	@ObfuscatedName("bh")
	public String field3402;

	@ObfuscatedName("bc")
	@ObfuscatedGetter(intValue = -400682443)
	@Export("spriteAngle")
	public int spriteAngle;

	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;

	@ObfuscatedName("bw")
	@ObfuscatedGetter(intValue = 1741927029)
	@Export("outline")
	public int outline;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 1639578411)
	@Export("spriteShadow")
	public int spriteShadow;

	@ObfuscatedName("bl")
	@Export("spriteFlipV")
	public boolean spriteFlipV;

	@ObfuscatedName("bn")
	@Export("spriteFlipH")
	public boolean spriteFlipH;

	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 1877064075)
	@Export("modelType")
	public int modelType;

	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = -119680125)
	@Export("modelId")
	public int modelId;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = -2126589789)
	@Export("modelType2")
	int modelType2;

	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = 282766663)
	@Export("modelId2")
	int modelId2;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = -40957173)
	@Export("sequenceId")
	public int sequenceId;

	@ObfuscatedName("cg")
	@ObfuscatedGetter(intValue = -1671527253)
	@Export("sequenceId2")
	public int sequenceId2;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = -877687815)
	@Export("modelOffsetX")
	public int modelOffsetX;

	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = -1674933423)
	@Export("modelOffsetY")
	public int modelOffsetY;

	@ObfuscatedName("ck")
	@ObfuscatedGetter(intValue = 1525728983)
	@Export("modelAngleX")
	public int modelAngleX;

	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = 191929345)
	@Export("modelAngleY")
	public int modelAngleY;

	@ObfuscatedName("ca")
	@ObfuscatedGetter(intValue = -1090074793)
	@Export("modelAngleZ")
	public int modelAngleZ;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = 574129965)
	@Export("modelZoom")
	public int modelZoom;

	@ObfuscatedName("cy")
	@ObfuscatedGetter(intValue = 1530325059)
	public int field3421;

	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = -620853285)
	public int field3422;

	@ObfuscatedName("co")
	@Export("modelOrthog")
	public boolean modelOrthog;

	@ObfuscatedName("cr")
	@Export("modelTransparency")
	public boolean modelTransparency;

	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = 1974347515)
	@Export("itemQuantityMode")
	public int itemQuantityMode;

	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = -615121803)
	@Export("fontId")
	public int fontId;

	@ObfuscatedName("cn")
	@Export("text")
	public String text;

	@ObfuscatedName("cu")
	@Export("text2")
	public String text2;

	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = -495956447)
	@Export("textLineHeight")
	public int textLineHeight;

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 160434047)
	@Export("textXAlignment")
	public int textXAlignment;

	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = -1979441939)
	@Export("textYAlignment")
	public int textYAlignment;

	@ObfuscatedName("cc")
	@Export("textShadowed")
	public boolean textShadowed;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = 2143361225)
	@Export("paddingX")
	public int paddingX;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 796244305)
	@Export("paddingY")
	public int paddingY;

	@ObfuscatedName("cf")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;

	@ObfuscatedName("dz")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;

	@ObfuscatedName("dc")
	@Export("inventorySprites")
	public int[] inventorySprites;

	@ObfuscatedName("dh")
	@Export("itemActions")
	public String[] itemActions;

	@ObfuscatedName("dt")
	@ObfuscatedSignature(descriptor = "Lef;")
	class155 field3359;

	@ObfuscatedName("dw")
	@ObfuscatedGetter(intValue = -655137419)
	int field3440;

	@ObfuscatedName("dm")
	HashMap field3522;

	@ObfuscatedName("da")
	HashMap field3414;

	@ObfuscatedName("db")
	@ObfuscatedGetter(intValue = 292209745)
	@Export("flags")
	public int flags;

	@ObfuscatedName("dd")
	public boolean field3444;

	@ObfuscatedName("du")
	public byte[][] field3445;

	@ObfuscatedName("do")
	public byte[][] field3446;

	@ObfuscatedName("dy")
	public int[] field3447;

	@ObfuscatedName("dp")
	public int[] field3448;

	@ObfuscatedName("dj")
	@Export("dataText")
	public String dataText;

	@ObfuscatedName("di")
	@Export("actions")
	public String[] actions;

	@ObfuscatedName("df")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("parent")
	public Widget parent;

	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = -2107188713)
	@Export("dragZoneSize")
	public int dragZoneSize;

	@ObfuscatedName("dq")
	@ObfuscatedGetter(intValue = -1698640057)
	@Export("dragThreshold")
	public int dragThreshold;

	@ObfuscatedName("ds")
	@Export("isScrollBar")
	public boolean isScrollBar;

	@ObfuscatedName("dl")
	@Export("spellActionName")
	public String spellActionName;

	@ObfuscatedName("dn")
	@Export("hasListener")
	public boolean hasListener;

	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;

	@ObfuscatedName("ec")
	@Export("onClick")
	public Object[] onClick;

	@ObfuscatedName("ex")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;

	@ObfuscatedName("el")
	@Export("onRelease")
	public Object[] onRelease;

	@ObfuscatedName("eb")
	@Export("onHold")
	public Object[] onHold;

	@ObfuscatedName("ek")
	@Export("onMouseOver")
	public Object[] onMouseOver;

	@ObfuscatedName("eq")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;

	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;

	@ObfuscatedName("ew")
	@Export("onDrag")
	public Object[] onDrag;

	@ObfuscatedName("ez")
	@Export("onDragComplete")
	public Object[] onDragComplete;

	@ObfuscatedName("eu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;

	@ObfuscatedName("ea")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;

	@ObfuscatedName("es")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;

	@ObfuscatedName("ev")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;

	@ObfuscatedName("er")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;

	@ObfuscatedName("et")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;

	@ObfuscatedName("ei")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;

	@ObfuscatedName("ep")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;

	@ObfuscatedName("ey")
	@Export("onTimer")
	public Object[] onTimer;

	@ObfuscatedName("ee")
	@Export("onOp")
	public Object[] onOp;

	@ObfuscatedName("en")
	@Export("onScroll")
	public Object[] onScroll;

	@ObfuscatedName("eh")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;

	@ObfuscatedName("ej")
	@Export("onKey")
	public Object[] onKey;

	@ObfuscatedName("ed")
	public Object[] field3480;

	@ObfuscatedName("eg")
	public Object[] field3481;

	@ObfuscatedName("ef")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;

	@ObfuscatedName("ff")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;

	@ObfuscatedName("fm")
	public Object[] field3484;

	@ObfuscatedName("ft")
	public Object[] field3485;

	@ObfuscatedName("fv")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;

	@ObfuscatedName("fk")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;

	@ObfuscatedName("fu")
	@Export("onSubChange")
	public Object[] onSubChange;

	@ObfuscatedName("fb")
	@Export("onResize")
	public Object[] onResize;

	@ObfuscatedName("fn")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;

	@ObfuscatedName("fz")
	public Object[] field3491;

	@ObfuscatedName("fo")
	public Object[] field3492;

	@ObfuscatedName("fl")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;

	@ObfuscatedName("fy")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;

	@ObfuscatedName("fw")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;

	@ObfuscatedName("fp")
	@ObfuscatedGetter(intValue = 842844733)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;

	@ObfuscatedName("fe")
	@Export("spellName")
	public String spellName;

	@ObfuscatedName("fr")
	@Export("buttonText")
	public String buttonText;

	@ObfuscatedName("fj")
	@Export("itemIds")
	public int[] itemIds;

	@ObfuscatedName("fi")
	@Export("itemQuantities")
	public int[] itemQuantities;

	@ObfuscatedName("fg")
	@ObfuscatedGetter(intValue = -178889975)
	@Export("itemId")
	public int itemId;

	@ObfuscatedName("fa")
	@ObfuscatedGetter(intValue = -1407479345)
	@Export("itemQuantity")
	public int itemQuantity;

	@ObfuscatedName("fq")
	@ObfuscatedGetter(intValue = -340147073)
	@Export("modelFrame")
	public int modelFrame;

	@ObfuscatedName("fx")
	@ObfuscatedGetter(intValue = -825168487)
	@Export("modelFrameCycle")
	public int modelFrameCycle;

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = "[Lku;")
	@Export("children")
	public Widget[] children;

	@ObfuscatedName("fs")
	@Export("containsMouse")
	public boolean containsMouse;

	@ObfuscatedName("fh")
	@Export("isClicked")
	public boolean isClicked;

	@ObfuscatedName("fc")
	@ObfuscatedGetter(intValue = 1763353511)
	public int field3508;

	@ObfuscatedName("gd")
	@ObfuscatedGetter(intValue = 155706563)
	public int field3369;

	@ObfuscatedName("gp")
	@ObfuscatedGetter(intValue = -1347962269)
	public int field3510;

	@ObfuscatedName("gy")
	@ObfuscatedGetter(intValue = 722251365)
	public int field3486;

	@ObfuscatedName("gf")
	@ObfuscatedGetter(intValue = -140611993)
	@Export("rootIndex")
	public int rootIndex;

	@ObfuscatedName("gx")
	@ObfuscatedGetter(intValue = 1575439991)
	@Export("cycle")
	public int cycle;

	@ObfuscatedName("ge")
	public int[] field3514;

	@ObfuscatedName("gs")
	@Export("noClickThrough")
	public boolean noClickThrough;

	@ObfuscatedName("gc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;

	@ObfuscatedName("gr")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3519 = new class362(10, class360.field4278);
		field3515 = new class362(10, class360.field4278);
		field3363 = false;
	}

	public Widget() {
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3399 = false;
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
		this.field3421 = 0;
		this.field3422 = 0;
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
		this.field3440 = -1;
		this.flags = 0;
		this.field3444 = false;
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
		this.field3508 = -1;
		this.field3369 = 0;
		this.field3510 = 0;
		this.field3486 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-585799123")
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
			this.itemIds = new int[this.rawWidth * this.rawHeight];
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
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-601066442")
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
				this.field3421 = var1.readUnsignedShort();
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
			this.field3399 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lqw;I)[Ljava/lang/Object;", garbageValue = "-1889854744")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqw;I)[I", garbageValue = "967857934")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-31")
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(ZLcc;B)Lqj;", garbageValue = "79")
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3363 = false;
		if (this.field3402 != null) {
			SpritePixels var3 = this.method5675(var2);
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
			long var4 = (((long) (this.spriteShadow)) << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (((long) (this.outline)) << 36) + ((long) (var7)) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var6 = ((SpritePixels) (Widget_cachedSprites.get(var4)));
			if (var6 != null) {
				return var6;
			} else {
				var6 = SoundSystem.SpriteBuffer_getSprite(class192.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3363 = true;
					return null;
				} else {
					this.method5628(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lcc;B)Lqj;", garbageValue = "0")
	SpritePixels method5675(UrlRequester var1) {
		if (!this.method5712()) {
			return this.method5626(var1);
		} else {
			String var2 = this.field3402 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var3 = ((SpritePixels) (field3515.method6594(var2)));
			if (var3 == null) {
				SpritePixels var4 = this.method5626(var1);
				if (var4 != null) {
					var3 = var4.method8233();
					this.method5628(var3);
					field3515.method6596(var2, var3);
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lcc;I)Lqj;", garbageValue = "-1999631288")
	SpritePixels method5626(UrlRequester var1) {
		if (this.field3402 != null && var1 != null) {
			class291 var2 = ((class291) (field3519.method6594(this.field3402)));
			if (var2 == null) {
				var2 = new class291(this.field3402, var1);
				field3519.method6596(this.field3402, var2);
			}
			return var2.method5562();
		} else {
			return null;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2072627458")
	boolean method5712() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lqj;I)V", garbageValue = "51334331")
	void method5628(SpritePixels var1) {
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)Lmx;", garbageValue = "-1996881846")
	@Export("getFont")
	public Font getFont() {
		field3363 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = ((Font) (Widget_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = class192.Widget_spritesArchive;
				AbstractArchive var4 = JagexCache.Widget_fontsArchive;
				int var5 = this.fontId;
				byte[] var7 = var3.takeFile(var5, 0);
				boolean var6;
				if (var7 == null) {
					var6 = false;
				} else {
					class83.SpriteBuffer_decode(var7);
					var6 = true;
				}
				Font var2;
				if (!var6) {
					var2 = null;
				} else {
					var2 = class14.method182(var4.takeFile(var5, 0));
				}
				if (var2 != null) {
					Widget_cachedFonts.put(var2, ((long) (this.fontId)));
				} else {
					field3363 = true;
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IB)Lqj;", garbageValue = "-89")
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3363 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = ((SpritePixels) (Widget_cachedSprites.get(((long) (var2)))));
				if (var3 != null) {
					return var3;
				} else {
					var3 = SoundSystem.SpriteBuffer_getSprite(class192.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, ((long) (var2)));
					} else {
						field3363 = true;
					}
					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lgc;IZLko;I)Lhd;", garbageValue = "1052813178")
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3363 = false;
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
					var8 = ModelData.ModelData_get(class7.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3363 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 2) {
					var8 = class125.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3363 = true;
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
						field3363 = true;
						return null;
					}
					var7 = var8.toModel(64, 768, -50, -10, -50);
				}
				if (var5 == 4) {
					ItemComposition var9 = class258.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3363 = true;
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(ZI)Lkr;", garbageValue = "-1520814365")
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}
		int var2 = (var1) ? this.spriteId : this.spriteId2;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = (((long) (this.spriteShadow)) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (((long) (this.outline)) << 36) + ((long) (var2)) + ((this.spriteFlipV ? 1L : 0L) << 38);
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;S)V", garbageValue = "-6301")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1281585863")
	public boolean method5634() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcc;J)V")
	public void method5635(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3359 = new class155();
			if (!this.field3359.method3176(var1, var2)) {
				this.field3359 = null;
			} else if (this.field3522 == null || this.field3414 == null) {
				this.method5636();
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "15")
	void method5636() {
		this.field3522 = new HashMap();
		this.field3414 = new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-5")
	public void method5698(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3522 == null) {
				this.method5636();
			}
			this.field3522.put(var1, var2);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V", garbageValue = "-1727968969")
	public void method5638(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3414 == null) {
				this.method5636();
			}
			this.field3414.put(var1, var2);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IIIII)Z", garbageValue = "-1891820332")
	public boolean method5720(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3359 != null && this.method5640()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = ((int) (this.field3359.method3227()[0] * ((float) (this.width))));
			int var6 = ((int) (this.field3359.method3227()[1] * ((float) (this.height))));
			int var7 = var5 + ((int) (this.field3359.method3227()[2] * ((float) (this.width))));
			int var8 = var6 + ((int) (this.field3359.method3227()[3] * ((float) (this.height))));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-37")
	public boolean method5640() {
		return this.field3440 == 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "2037722264")
	public int method5641(String var1) {
		return this.type == 11 && this.field3359 != null && this.method5640() ? this.field3359.method3225(var1) : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-2077154837")
	public String method5642(String var1) {
		return this.type == 11 && this.field3359 != null && this.method5640() ? this.field3359.method3179(var1) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-54")
	public int method5649() {
		return this.field3414 != null && this.field3414.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	public int method5625() {
		if (this.type == 11 && this.field3359 != null && this.field3414 != null && !this.field3414.isEmpty()) {
			String var1 = this.field3359.method3219();
			return var1 != null && this.field3414.containsKey(this.field3359.method3219()) ? ((Integer) (this.field3414.get(var1))) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;", garbageValue = "128")
	public String method5668() {
		if (this.type == 11 && this.field3359 != null) {
			String var1 = this.field3359.method3219();
			Iterator var2 = this.field3359.method3185().iterator();
			while (var2.hasNext()) {
				class165 var3 = ((class165) (var2.next()));
				String var4 = String.format("%%%S%%", var3.method3295());
				if (var3.vmethod3296() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3298()));
				} else {
					var1.replaceAll(var4, var3.vmethod3297());
				}
			} 
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "145703884")
	public int[] method5646() {
		if (this.type == 11 && this.field3359 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3359.method3185().iterator();
			while (var3.hasNext()) {
				class165 var4 = ((class165) (var3.next()));
				if (!var4.method3295().equals("user_id")) {
					if (var4.vmethod3296() != 0) {
						return null;
					}
					var1[var2++] = var4.vmethod3298();
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
	@ObfuscatedSignature(descriptor = "(Lcc;B)Z", garbageValue = "-19")
	public boolean method5702(UrlRequester var1) {
		if (this.type == 11 && this.field3359 != null) {
			this.field3359.method3233(var1);
			if (this.field3359.method3178() != this.field3440) {
				this.field3440 = this.field3359.method3178();
				if (this.field3440 >= 100) {
					return true;
				}
				if (this.field3440 == 2) {
					this.method5711();
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-45")
	void method5711() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3359.method3181();
		ArrayList var2 = this.field3359.method3182();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;
		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class160 var6 = ((class160) (var5.next()));
			var7 = WorldMapLabelSize.method4542(5, this, var4, 0, 0, 0, 0, var6.field1754);
			var7.field3402 = var6.field1755.method2638();
			class291 var8 = new class291(var6.field1755);
			field3519.method6596(var7.field3402, var8);
		}
		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class161 var9 = ((class161) (var5.next()));
			var7 = WorldMapLabelSize.method4542(4, this, var4, 0, 0, 0, 0, var9.field1764);
			var7.text = var9.field1763;
			var7.fontId = ((Integer) (this.field3522.get(var9.field1766)));
			var7.textXAlignment = var9.field1760;
			var7.textYAlignment = var9.field1765;
		}
	}
}