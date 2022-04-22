import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"[[Lky;")

	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"Lmg;")

	static class361 field3389;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"Lmg;")

	static class361 field3332;
	@ObfuscatedName("ao")
	public static boolean field3411;
	@ObfuscatedName("aj")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = 
	785571949)

	@Export("id")
	public int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 
	-1317080121)

	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 
	370654815)

	@Export("type")
	public int type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 
	1674852349)

	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 
	707687703)

	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 
	56148415)

	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 
	817696093)

	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	513405589)

	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 
	2040346085)

	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 
	-26114281)

	@Export("rawX")
	public int rawX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	387503687)

	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 
	-2011247383)

	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 
	1435796997)

	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 
	-1718696181)

	@Export("x")
	public int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 
	-566234841)

	@Export("y")
	public int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 
	-1237179477)

	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 
	-686825733)

	@Export("height")
	public int height;
	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 
	324512829)

	public int field3352;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 
	-98155543)

	public int field3353;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 
	-937388189)

	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = 
	1914558753)

	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(intValue = 
	-647232793)

	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 
	-188983191)

	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 
	-1426770415)

	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = 
	532413421)

	@Export("color")
	public int color;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 
	103132295)

	@Export("color2")
	public int color2;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(intValue = 
	-154297075)

	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(intValue = 
	-811313521)

	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bx")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = 
	"Lqe;")

	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = 
	-470805339)

	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = 
	-112532293)

	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 
	-1537981101)

	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bk")
	public boolean field3369;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = 
	43628099)

	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = 
	781497615)

	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bt")
	public String field3487;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(intValue = 
	2105991617)

	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bc")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = 
	454838749)

	@Export("outline")
	public int outline;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 
	517366521)

	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bu")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bz")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 
	1227370175)

	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = 
	945684985)

	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = 
	445983049)

	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = 
	1687897513)

	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = 
	1946938751)

	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 
	450134807)

	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = 
	-219810473)

	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = 
	2011213921)

	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = 
	-1199644179)

	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 
	-870869659)

	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = 
	1027382321)

	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = 
	-19522443)

	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(intValue = 
	-701988609)

	public int field3467;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = 
	-781066785)

	public int field3392;
	@ObfuscatedName("cy")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cr")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = 
	-1801031319)

	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = 
	-1408415309)

	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cu")
	@Export("text")
	public String text;
	@ObfuscatedName("cg")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = 
	1122513061)

	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = 
	-694565497)

	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = 
	182093077)

	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ck")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = 
	-1633261963)

	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = 
	1192225759)

	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cx")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dr")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dj")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dd")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(descriptor = 
	"Lev;")

	class155 field3409;
	@ObfuscatedName("de")
	@ObfuscatedGetter(intValue = 
	1539311711)

	int field3410;
	@ObfuscatedName("dp")
	HashMap field3354;
	@ObfuscatedName("dx")
	HashMap field3412;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(intValue = 
	1690080249)

	@Export("flags")
	public int flags;
	@ObfuscatedName("dm")
	public boolean field3414;
	@ObfuscatedName("dv")
	public byte[][] field3415;
	@ObfuscatedName("da")
	public byte[][] field3485;
	@ObfuscatedName("di")
	public int[] field3417;
	@ObfuscatedName("dt")
	public int[] field3418;
	@ObfuscatedName("do")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dw")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(intValue = 
	-255992791)

	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("db")
	@ObfuscatedGetter(intValue = 
	-228708447)

	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dh")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dq")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dy")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ec")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("es")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("el")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ej")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("em")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ei")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ep")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("eo")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ex")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("eq")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ed")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ek")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("eb")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ew")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("er")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("et")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ee")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ea")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("eu")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("eg")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("en")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ez")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ey")
	public Object[] field3416;
	@ObfuscatedName("eh")
	public Object[] field3451;
	@ObfuscatedName("ev")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ff")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fp")
	public Object[] field3454;
	@ObfuscatedName("fo")
	public Object[] field3455;
	@ObfuscatedName("fm")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fu")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fd")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fi")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fa")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fn")
	public Object[] field3432;
	@ObfuscatedName("fx")
	public Object[] field3462;
	@ObfuscatedName("fy")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fr")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fj")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(intValue = 
	1863918323)

	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fb")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fe")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fc")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fq")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(intValue = 
	-806667787)

	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(intValue = 
	-603366955)

	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(intValue = 
	726749667)

	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(intValue = 
	1426555603)

	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = 
	"[Lky;")

	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fg")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fh")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(intValue = 
	-235731823)

	public int field3478;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(intValue = 
	590193357)

	public int field3479;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(intValue = 
	-438997263)

	public int field3480;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(intValue = 
	1088082053)

	public int field3433;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(intValue = 
	-1419320507)

	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(intValue = 
	396807883)

	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gj")
	public int[] field3484;
	@ObfuscatedName("gf")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gw")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	static 
	{
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3389 = new class361(10, class359.field4204);
		field3332 = new class361(10, class359.field4204);
		field3411 = false;
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
		this.field3352 = 1;
		this.field3353 = 1;
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
		this.field3369 = false;
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
		this.field3467 = 0;
		this.field3392 = 0;
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
		this.field3410 = -1;
		this.flags = 0;
		this.field3414 = false;
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
		this.field3478 = -1;
		this.field3479 = 0;
		this.field3480 = 0;
		this.field3433 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"-39")

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
			this.parentId += this.id & (-65536);
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
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
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
					this.flags |= 1 << (var8 + 23);
				}
			}
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if ((this.type == 4) || (this.type == 1)) {
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

		if (((this.type == 1) || (this.type == 3)) || (this.type == 4)) {
			this.color = var1.readInt();
		}

		if ((this.type == 3) || (this.type == 4)) {
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
					this.flags |= 1 << (var5 + 23);
				}
			}
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if ((this.buttonType == 2) || (this.type == 2)) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.spellName = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if ((((this.buttonType == 1) || (this.buttonType == 4)) || (this.buttonType == 5)) || (this.buttonType == 6)) {
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

		if (((this.buttonType == 1) || (this.buttonType == 4)) || (this.buttonType == 5)) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-107310721")

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
			this.parentId += this.id & (-65536);
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
				this.field3467 = var1.readUnsignedShort();
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
			this.field3369 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)[Ljava/lang/Object;", garbageValue = 
	"117")

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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)[I", garbageValue = 
	"-1")

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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"2")

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
	@ObfuscatedSignature(descriptor = 
	"(ZLck;B)Lqi;", garbageValue = 
	"-6")

	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3411 = false;
		if (this.field3487 != null) {
			SpritePixels var3 = this.method5646(var2);
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

		if (var7 == (-1)) {
			return null;
		} else {
			long var4 = ((((((long) (this.spriteShadow)) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39)) + (((long) (this.outline)) << 36)) + ((long) (var7))) + ((this.spriteFlipV ? 1L : 0L) << 38);
			SpritePixels var6 = ((SpritePixels) (Widget_cachedSprites.get(var4)));
			if (var6 != null) {
				return var6;
			} else {
				var6 = class6.SpriteBuffer_getSprite(SoundCache.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3411 = true;
					return null;
				} else {
					this.method5611(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lck;B)Lqi;", garbageValue = 
	"48")

	SpritePixels method5646(UrlRequester var1) {
		if (!this.method5610()) {
			return this.method5609(var1);
		} else {
			String var2 = (((this.field3487 + (this.spriteFlipV ? 1 : 0)) + (this.spriteFlipH ? 1 : 0)) + this.outline) + this.spriteShadow;
			SpritePixels var3 = ((SpritePixels) (field3332.method6601(var2)));
			if (var3 == null) {
				SpritePixels var4 = this.method5609(var1);
				if (var4 != null) {
					var3 = var4.method8147();
					this.method5611(var3);
					field3332.method6596(var2, var3);
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lck;B)Lqi;", garbageValue = 
	"1")

	SpritePixels method5609(UrlRequester var1) {
		if ((this.field3487 != null) && (var1 != null)) {
			class291 var2 = ((class291) (field3389.method6601(this.field3487)));
			if (var2 == null) {
				var2 = new class291(this.field3487, var1);
				field3389.method6596(this.field3487, var2);
			}

			return var2.method5563();
		} else {
			return null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1666597852")

	boolean method5610() {
		return ((this.spriteFlipV || this.spriteFlipH) || (this.outline != 0)) || (this.spriteShadow != 0);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Lqi;I)V", garbageValue = 
	"576149889")

	void method5611(SpritePixels var1) {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)Lmd;", garbageValue = 
	"-1386663176")

	@Export("getFont")
	public Font getFont() {
		field3411 = false;
		if (this.fontId == (-1)) {
			return null;
		} else {
			Font var1 = ((Font) (Widget_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class163.method3322(SoundCache.Widget_spritesArchive, class17.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, ((long) (this.fontId)));
				} else {
					field3411 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lqi;", garbageValue = 
	"7")

	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3411 = false;
		if ((var1 >= 0) && (var1 < this.inventorySprites.length)) {
			int var2 = this.inventorySprites[var1];
			if (var2 == (-1)) {
				return null;
			} else {
				SpritePixels var3 = ((SpritePixels) (Widget_cachedSprites.get(((long) (var2)))));
				if (var3 != null) {
					return var3;
				} else {
					var3 = class6.SpriteBuffer_getSprite(SoundCache.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, ((long) (var2)));
					} else {
						field3411 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lgw;IZLkp;I)Liq;", garbageValue = 
	"-1321759215")

	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3411 = false;
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
		} else if ((var5 == 1) && (var6 == (-1))) {
			return null;
		} else {
			Model var7 = ((Model) (Widget_cachedModels.get(((long) (var6 + (var5 << 16))))));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(class162.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3411 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = KeyHandler.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3411 = true;
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
						field3411 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = class19.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3411 = true;
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(ZB)Lki;", garbageValue = 
	"2")

	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == (-1)) {
			var1 = false;
		}

		int var2 = (var1) ? (this.spriteId * (-1883530769)) * 781497615 : (this.spriteId2 * 1275315819) * 43628099;
		if (var2 == (-1)) {
			return null;
		} else {
			long var3 = ((((((long) (this.spriteShadow)) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39)) + (((long) (this.outline)) << 36)) + ((long) (var2))) + ((this.spriteFlipV ? 1L : 0L) << 38);
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
							if (var7.pixels[var13 + (var10 * var7.subWidth)] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + (var10 * var7.subWidth)] == 0) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;B)V", garbageValue = 
	"-60")

	@Export("setAction")
	public void setAction(int var1, String var2) {
		if ((this.actions == null) || (this.actions.length <= var1)) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-398525420")

	public boolean method5617() {
		return ((((!this.isIf3) || (this.type == 0)) || (this.type == 11)) || this.hasListener) || (this.contentType == 1338);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Lck;J)V")

	public void method5618(String var1, UrlRequester var2, long var3) {
		if ((this.type == 11) && (var3 != (-1L))) {
			var1.replaceAll("%userid%", Long.toString(var3));
			this.field3409 = new class155();
			if (!this.field3409.method3201(var1, var2)) {
				this.field3409 = null;
			} else {
				this.field3354 = new HashMap();
				this.field3412 = new HashMap();
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-459125487")

	public void method5722(int var1, int var2) {
		if ((this.type == 11) && (this.field3354 != null)) {
			this.field3354.put(var1, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;II)V", garbageValue = 
	"1957119277")

	public void method5672(String var1, int var2) {
		if ((this.type == 11) && (this.field3412 != null)) {
			this.field3412.put(var1, var2);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"-22")

	public boolean method5721(int var1, int var2) {
		if (((this.type == 11) && (this.field3409 != null)) && this.method5690()) {
			int var3 = ((int) (this.field3409.method3190()[0] * ((float) (this.width))));
			int var4 = ((int) (this.field3409.method3190()[1] * ((float) (this.height))));
			int var5 = var3 + ((int) (this.field3409.method3190()[2] * ((float) (this.width))));
			int var6 = var4 + ((int) (this.field3409.method3190()[3] * ((float) (this.height))));
			return (((var1 >= var3) && (var2 >= var4)) && (var1 < var5)) && (var2 < var6);
		} else {
			return false;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"98")

	public boolean method5690() {
		return this.field3410 == 2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)I", garbageValue = 
	"9")

	public int method5623(String var1) {
		return ((this.type == 11) && (this.field3409 != null)) && this.method5690() ? this.field3409.method3189(var1) : -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"787247673")

	public String method5624(String var1) {
		return ((this.type == 11) && (this.field3409 != null)) && this.method5690() ? this.field3409.method3223(var1) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1923228408")

	public int method5625() {
		return (this.field3412 != null) && (this.field3412.size() > 0) ? 1 : 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-9")

	public int method5647() {
		if ((((this.type == 11) && (this.field3409 != null)) && (this.field3412 != null)) && (!this.field3412.isEmpty())) {
			String var1 = this.field3409.method3188();
			return (var1 != null) && this.field3412.containsKey(this.field3409.method3188()) ? ((Integer) (this.field3412.get(var1))) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"-41")

	public String method5627() {
		if ((this.type == 11) && (this.field3409 != null)) {
			String var1 = this.field3409.method3188();
			Iterator var2 = this.field3409.method3191().iterator();

			while (var2.hasNext()) {
				class166 var3 = ((class166) (var2.next()));
				String var4 = String.format("%%%S%%", var3.method3336());
				if (var3.vmethod3341() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3334()));
				} else {
					var1.replaceAll(var4, var3.vmethod3333());
				}
			} 

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(I)[I", garbageValue = 
	"998374015")

	public int[] method5628() {
		if ((this.type == 11) && (this.field3409 != null)) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3409.method3191().iterator();

			while (var3.hasNext()) {
				class166 var4 = ((class166) (var3.next()));
				if (!var4.method3336().equals("user_id")) {
					if (var4.vmethod3341() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3334();
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(Lck;I)Z", garbageValue = 
	"-1463897993")

	public boolean method5629(UrlRequester var1) {
		if ((this.type == 11) && (this.field3409 != null)) {
			this.field3409.method3184(var1);
			if (this.field3409.method3230() != this.field3410) {
				this.field3410 = this.field3409.method3230();
				if (this.field3410 >= 100) {
					return false;
				}

				if (this.field3410 == 2) {
					this.method5701();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1471555316")

	void method5701() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3409.method3187();
		ArrayList var2 = this.field3409.method3229();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class160 var6 = ((class160) (var5.next()));
			var7 = class83.method2111(5, this, var4, 0, 0, 0, 0, var6.field1735);
			var7.field3487 = var6.field1737.method2554();
			class291 var8 = new class291(var6.field1737);
			field3389.method6596(var7.field3487, var8);
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class162 var9 = ((class162) (var5.next()));
			var7 = class83.method2111(4, this, var4, 0, 0, 0, 0, var9.field1754);
			var7.text = var9.field1758;
			var7.fontId = ((Integer) (this.field3354.get(var9.field1752)));
			var7.textXAlignment = var9.field1755;
			var7.textYAlignment = var9.field1756;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/Throwable;I)V", garbageValue = 
	"-2380539")

	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = class128.method2853(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), (((((((((("clienterror.ws?c=" + RunException.RunException_revision) + "&u=") + RunException.localPlayerName) + "&v1=") + TaskHandler.javaVendor) + "&v2=") + TaskHandler.javaVersion) + "&ct=") + WorldMapRegion.clientType) + "&e=") + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"([BIILhv;[Lgv;I)V", garbageValue = 
	"-2111400483")

	static final void method5681(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;

		while (true) {
			int var7 = var5.readIncrSmallSmart();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = (var8 >> 6) & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if ((((var16 > 0) && (var17 > 0)) && (var16 < 103)) && (var17 < 103)) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}

					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}

					WorldMapElement.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			} 
		} 
	}
}