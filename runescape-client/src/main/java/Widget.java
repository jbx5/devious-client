import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ak")
	public static boolean field3740;
	@ObfuscatedName("bp")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -888813315
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1782099365
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bf")
	String field3744;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 569638281
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -530345339
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -753412249
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -548671023
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 613667167
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 404636535
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 461200417
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 901113805
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 844398083
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1702929111
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 427070681
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 421411335
	)
	@Export("x")
	public int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 429087407
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1338661573
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -209931135
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 634501139
	)
	public int field3760;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -554895785
	)
	public int field3831;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1666791179
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1331772307
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 913158007
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 698878245
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -967719995
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -849172079
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -937177559
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -233881151
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 611917449
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cl")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -128184061
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 327229187
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -742972009
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cd")
	public boolean field3862;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 254488211
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1079992199
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("ce")
	public String field3780;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1910356439
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cu")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1736441479
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -822212819
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cv")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("co")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 126214687
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -737689371
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -2146577519
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1183479259
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1723862129
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 559606053
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1205990351
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 867186143
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1000844767
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1687962115
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1548295757
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 631677637
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1832693377
	)
	public int field3799;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 300585447
	)
	public int field3737;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public PlayerComposition field3801;
	@ObfuscatedName("dv")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dr")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1138916521
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 115789025
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("db")
	@Export("text")
	public String text;
	@ObfuscatedName("di")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 758591793
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 396689765
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -512612643
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("de")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	class171 field3812;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1130909643
	)
	int field3889;
	@ObfuscatedName("ds")
	HashMap field3798;
	@ObfuscatedName("dd")
	HashMap field3815;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class345 field3810;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 298640377
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ej")
	public boolean field3818;
	@ObfuscatedName("ew")
	public byte[][] field3836;
	@ObfuscatedName("en")
	public byte[][] field3820;
	@ObfuscatedName("eo")
	public int[] field3821;
	@ObfuscatedName("er")
	public int[] field3738;
	@ObfuscatedName("ea")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ef")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1822648773
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -433802207
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eu")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ex")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ec")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eq")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ep")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("eh")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ez")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eg")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ev")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ei")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ek")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ff")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fm")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fd")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fe")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fc")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fi")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ft")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fa")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fx")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fu")
	public Object[] field3851;
	@ObfuscatedName("fj")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fq")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fv")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fk")
	public Object[] field3855;
	@ObfuscatedName("fr")
	public Object[] field3856;
	@ObfuscatedName("fh")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fy")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fw")
	public Object[] field3859;
	@ObfuscatedName("fl")
	public Object[] field3860;
	@ObfuscatedName("fz")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fs")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fg")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fo")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fp")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gg")
	public Object[] field3866;
	@ObfuscatedName("gw")
	public Object[] field3867;
	@ObfuscatedName("gr")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gx")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -1619914463
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gj")
	public String field3822;
	@ObfuscatedName("gn")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gi")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gc")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -599119121
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1513720115
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1261258799
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1841662299
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gh")
	public boolean field3881;
	@ObfuscatedName("gy")
	public boolean field3882;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 1957540313
	)
	public int field3883;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1511002233
	)
	public int field3884;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 203898851
	)
	public int field3847;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -170096791
	)
	public int field3886;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1733297855
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1220370851
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gz")
	public int[] field3766;
	@ObfuscatedName("gp")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gu")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3740 = false;
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
		this.field3760 = 1;
		this.field3831 = 1;
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
		this.field3862 = false;
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
		this.field3799 = 0;
		this.field3737 = 0;
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
		this.field3889 = -1;
		this.flags = 0;
		this.field3818 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3822 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3881 = false;
		this.field3882 = false;
		this.field3883 = -1;
		this.field3884 = 0;
		this.field3847 = 0;
		this.field3886 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1281787803"
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
			this.field3822 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-789951372"
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
				this.field3799 = var1.readUnsignedShort();
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
			this.field3862 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1582883219"
	)
	void method6648(Buffer var1) {
		this.field3744 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)[Ljava/lang/Object;",
		garbageValue = "649606523"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)[I",
		garbageValue = "-853188511"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZLea;B)Lvg;",
		garbageValue = "18"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3740 = false;
		if (this.field3780 != null) {
			SpritePixels var4 = this.method6704(var1, var3);
			if (var4 != null) {
				return var4;
			}
		}

		int var8;
		if (var2) {
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2;
		}

		if (var8 == -1) {
			return null;
		} else {
			long var5 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = GraphicsObject.SpriteBuffer_getSprite(var1.field3643, var8, 0);
				if (var7 == null) {
					field3740 = true;
					return null;
				} else {
					this.method6771(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lea;I)Lvg;",
		garbageValue = "678346128"
	)
	SpritePixels method6704(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method6654()) {
			return this.method6649(var1, var2);
		} else {
			String var3 = this.field3780 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3642.method8015(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method6649(var1, var2);
				if (var5 != null) {
					var4 = var5.method9704();
					this.method6771(var4);
					var1.field3642.method8008(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lea;I)Lvg;",
		garbageValue = "-1194238140"
	)
	SpritePixels method6649(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3780 != null && var2 != null) {
			class344 var3 = (class344)var1.field3652.method8015(this.field3780);
			if (var3 == null) {
				var3 = new class344(this.field3780, var2);
				var1.field3652.method8008(this.field3780, var3);
			}

			return var3.method6316();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-714250306"
	)
	boolean method6654() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "115"
	)
	void method6771(SpritePixels var1) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)Lpx;",
		garbageValue = "-21"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3740 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3643;
				AbstractArchive var5 = var1.field3649;
				int var6 = this.fontId;
				byte[] var8 = var4.takeFile(var6, 0);
				boolean var7;
				if (var8 == null) {
					var7 = false;
				} else {
					HttpQueryParams.SpriteBuffer_decode(var8);
					var7 = true;
				}

				Font var3;
				if (!var7) {
					var3 = null;
				} else {
					byte[] var9 = var5.takeFile(var6, 0);
					Font var11;
					if (var9 == null) {
						var11 = null;
					} else {
						Font var10 = new Font(var9, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, Ignored.SpriteBuffer_spriteHeights, class126.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
						SpotAnimationDefinition.method3949();
						var11 = var10;
					}

					var3 = var11;
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3740 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lig;IZLnq;Lhg;I)Ljn;",
		garbageValue = "1914091918"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NpcOverrides var6) {
		field3740 = false;
		int var7;
		int var8;
		if (var4) {
			var7 = this.modelType2;
			var8 = this.modelId2;
		} else {
			var7 = this.modelType;
			var8 = this.modelId;
		}

		if (var7 == 0) {
			return null;
		} else if (var7 == 1 && var8 == -1) {
			return null;
		} else {
			if (var6 != null && var6.useLocalPlayer && var7 == 6) {
				var7 = 3;
			}

			long var9 = (long)(var8 + (var7 << 16));
			if (var6 != null) {
				var9 |= var6.field2101 << 20;
			}

			Model var11 = (Model)var1.Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(var1.field3653, var8, 0);
					break;
				case 2:
					var12 = UserComparator10.getNpcDefinition(var8).method3864((NpcOverrides)null);
					break;
				case 3:
					var12 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = HttpRequest.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.ambient;
					var14 += var15.contrast;
				case 5:
				default:
					break;
				case 6:
					var12 = UserComparator10.getNpcDefinition(var8).method3864(var6);
				}

				if (var12 == null) {
					field3740 = true;
					return null;
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50);
				var1.Widget_cachedModels.put(var11, var9);
			}

			if (var2 != null) {
				var11 = var2.transformWidgetModel(var11, var3);
			}

			return var11;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZB)Lmu;",
		garbageValue = "-109"
	)
	public SpriteMask method6658(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
			SpriteMask var6 = (SpriteMask)var1.Widget_cachedSpriteMasks.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				SpritePixels var7 = this.getSprite(var1, var2, (UrlRequester)null);
				if (var7 == null) {
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized();
					int[] var9 = new int[var8.subHeight];
					int[] var10 = new int[var8.subHeight];

					for (int var11 = 0; var11 < var8.subHeight; ++var11) {
						int var12 = 0;
						int var13 = var8.subWidth;

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) {
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
								var12 = var14;
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) {
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
								var13 = var14 + 1;
								break;
							}
						}

						var9[var11] = var12;
						var10[var11] = var13 - var12;
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3);
					var1.Widget_cachedSpriteMasks.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "6"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-416129584"
	)
	public boolean method6660() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "910829820"
	)
	public boolean method6661() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;J)V"
	)
	public void method6662(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3812 = new class171();
			if (!this.field3812.method3441(var1, var2, var3)) {
				this.field3812 = null;
			} else {
				if (this.field3798 == null || this.field3815 == null) {
					this.method6676();
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lea;B)V",
		garbageValue = "56"
	)
	public void method6663(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3812 = new class171();
		if (!this.field3812.method3441(var1, var3, var6)) {
			this.field3812 = null;
		} else {
			if (this.field3798 == null || this.field3815 == null) {
				this.method6676();
			}

			this.field3812.method3442(var2, var4, var5);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)V",
		garbageValue = "-1765313760"
	)
	public void method6645(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3812 = new class171();
			this.field3812.method3459(var1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	void method6676() {
		this.field3798 = new HashMap();
		this.field3815 = new HashMap();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	public void method6666(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3798 == null) {
				this.method6676();
			}

			this.field3798.put(var1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1078028621"
	)
	public void method6659(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3815 == null) {
				this.method6676();
			}

			this.field3815.put(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)Z",
		garbageValue = "1582"
	)
	public boolean method6767(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3812 != null && this.method6697()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3812.method3484()[0] * (float)this.width);
			int var6 = (int)(this.field3812.method3484()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3812.method3484()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3812.method3484()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1720194513"
	)
	public boolean method6697() {
		return this.field3889 == 2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1949298531"
	)
	public int method6670(String var1) {
		return this.type == 11 && this.field3812 != null && this.method6697() ? this.field3812.method3455(var1) : -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1411491785"
	)
	public String method6770(String var1) {
		return this.type == 11 && this.field3812 != null && this.method6697() ? this.field3812.method3446(var1) : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2028733727"
	)
	public int method6672() {
		return this.field3815 != null && this.field3815.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1851537995"
	)
	public int method6673() {
		if (this.type == 11 && this.field3812 != null && this.field3815 != null && !this.field3815.isEmpty()) {
			String var1 = this.field3812.method3450();
			return var1 != null && this.field3815.containsKey(this.field3812.method3450()) ? (Integer)this.field3815.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "124"
	)
	public String method6674() {
		if (this.type == 11 && this.field3812 != null) {
			String var1 = this.field3812.method3450();
			Iterator var2 = this.field3812.method3449().iterator();

			while (var2.hasNext()) {
				class185 var3 = (class185)var2.next();
				String var4 = String.format("%%%S%%", var3.method3664());
				if (var3.vmethod3670() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3671()));
				} else {
					var1.replaceAll(var4, var3.vmethod3666());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "-5698"
	)
	public int[] method6675() {
		if (this.type == 11 && this.field3812 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3812.method3449().iterator();

			while (var3.hasNext()) {
				class185 var4 = (class185)var3.next();
				if (!var4.method3664().equals("user_id")) {
					if (var4.vmethod3670() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3671();
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lgh;",
		garbageValue = "2005455772"
	)
	public class171 method6769() {
		return this.field3812;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lea;B)Z",
		garbageValue = "95"
	)
	public boolean method6677(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3812 != null) {
			this.field3812.method3481(var2);
			if (this.field3812.method3444() != this.field3889) {
				this.field3889 = this.field3812.method3444();
				if (this.field3889 >= 3) {
					return true;
				}

				if (this.field3889 == 2) {
					this.method6772(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-237416595"
	)
	void method6772(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3812.method3490();
		ArrayList var3 = this.field3812.method3448();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class172 var7 = (class172)var6.next();
			var8 = AsyncRestClient.method184(5, this, var5, 0, 0, 0, 0, var7.field1857);
			var8.field3780 = var7.field1859.method2857();
			class344 var9 = new class344(var7.field1859);
			var1.field3652.method8008(var8.field3780, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class183 var10 = (class183)var6.next();
			var8 = AsyncRestClient.method184(4, this, var5, 0, 0, 0, 0, var10.field1938);
			var8.text = var10.field1940;
			var8.fontId = (Integer)this.field3798.get(var10.field1943);
			var8.textXAlignment = var10.field1941;
			var8.textYAlignment = var10.field1942;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-75"
	)
	public void method6679() {
		this.field3810 = new class345();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3810.field3678.method396(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3810.field3678.method402(var2, 0);
		}

		this.field3810.field3678.method402('\u0080', 0);
		this.field3810.field3678.method396(82, 2);
		this.field3810.field3678.method396(81, 2);
		this.field3810.field3678.method396(86, 2);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "-473100937"
	)
	public class347 method6667() {
		return this.field3810 != null ? this.field3810.field3674 : null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "-1461503376"
	)
	public class341 method6699() {
		return this.field3810 != null ? this.field3810.field3672 : null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)Lbz;",
		garbageValue = "-8"
	)
	public class27 method6682() {
		return this.field3810 != null ? this.field3810.field3678 : null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "-536890792"
	)
	public class345 method6683() {
		return this.field3810;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)Z",
		garbageValue = "1875438902"
	)
	boolean method6684(class347 var1) {
		boolean var2 = false;
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) {
			var6 = this.text;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method6366(var5);
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var6 = this.text2;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method6367(var5);
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Z",
		garbageValue = "2146102739"
	)
	public boolean method6685(WidgetDefinition var1) {
		class347 var2 = this.method6667();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method6513() && this.fontId != -1) {
				int var4 = var2.method6473();
				int var5 = var2.method6422();
				int var6 = var2.method6559();
				int var7 = var2.method6510();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method6368(var8);
					var3 |= this.method6684(var2);
					var3 |= var2.method6373(var4, var5);
					var3 |= var2.method6388(var6, var7);
				}
			} else if (var2.method6513()) {
				var3 |= this.method6684(var2);
			}

			var2.method6575();
			return var3;
		}
	}
}
