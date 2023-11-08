import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("af")
	public static boolean field3656;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 898987495
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 355251343
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bi")
	String field3660;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1298751483
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -2064124347
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1851395507
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1934194921
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 899689359
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 370805007
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1183031285
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1753351321
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 521192617
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 831337041
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -528779911
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 461131859
	)
	@Export("x")
	public int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -83475937
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1042121905
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 809475179
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1694415347
	)
	public int field3770;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1759456687
	)
	public int field3677;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1196232189
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bb")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -560807423
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1577224389
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1314049341
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -306771027
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1059264411
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1657416623
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1526854807
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1045698937
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ce")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1522209559
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 307051135
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 87841347
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cl")
	public boolean field3693;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1780213167
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1029572693
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cm")
	public String field3696;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1687935341
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cr")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1017653403
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1616413733
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cc")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cu")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -893635797
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 428396117
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1794426991
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -827309595
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 630720109
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1869130737
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 688173561
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1145081837
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1017197481
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -99225189
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1181837059
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -91805539
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 335565589
	)
	public int field3684;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1825252653
	)
	public int field3716;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public PlayerComposition field3717;
	@ObfuscatedName("do")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("db")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -126179905
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 670283109
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ds")
	@Export("text")
	public String text;
	@ObfuscatedName("da")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1443424643
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 498505029
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1443148029
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dv")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class208 field3678;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1977513085
	)
	int field3729;
	@ObfuscatedName("de")
	HashMap field3730;
	@ObfuscatedName("dn")
	HashMap field3661;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	class339 field3732;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1749722981
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ec")
	public boolean field3734;
	@ObfuscatedName("ew")
	public byte[][] field3735;
	@ObfuscatedName("ex")
	public byte[][] field3704;
	@ObfuscatedName("ev")
	public int[] field3672;
	@ObfuscatedName("ek")
	public int[] field3756;
	@ObfuscatedName("es")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ea")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 1621194617
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1891288423
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("et")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("er")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ez")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eu")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eg")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ey")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("eb")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ed")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eq")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ee")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ej")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ep")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fd")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fm")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fa")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fq")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fe")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ff")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fb")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fr")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fi")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fo")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fw")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fj")
	public Object[] field3648;
	@ObfuscatedName("fh")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fg")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fl")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fs")
	public Object[] field3771;
	@ObfuscatedName("ft")
	public Object[] field3772;
	@ObfuscatedName("fv")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fp")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fk")
	public Object[] field3676;
	@ObfuscatedName("fz")
	public Object[] field3776;
	@ObfuscatedName("fx")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fu")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fy")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fn")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fc")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gm")
	public Object[] field3782;
	@ObfuscatedName("gw")
	public Object[] field3783;
	@ObfuscatedName("gl")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ge")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gs")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -2125883859
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gp")
	public String field3788;
	@ObfuscatedName("gq")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gn")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gb")
	public int[] itemQuantities;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1760219883
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 756629683
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1041568375
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1736395543
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gt")
	public boolean field3797;
	@ObfuscatedName("gg")
	public boolean field3798;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -907772875
	)
	public int field3799;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -841827367
	)
	public int field3800;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 951832917
	)
	public int field3801;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 518710051
	)
	public int field3763;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1856912927
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 960398105
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("go")
	public int[] field3805;
	@ObfuscatedName("gh")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gd")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hb")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3656 = false;
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
		this.field3770 = 1;
		this.field3677 = 1;
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
		this.field3693 = false;
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
		this.field3684 = 0;
		this.field3716 = 0;
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
		this.field3729 = -1;
		this.flags = 0;
		this.field3734 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3788 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3797 = false;
		this.field3798 = false;
		this.field3799 = -1;
		this.field3800 = 0;
		this.field3801 = 0;
		this.field3763 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1076912273"
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
			this.field3788 = var1.readStringCp1252NullTerminated();
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
		descriptor = "(Luj;I)V",
		garbageValue = "167197032"
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
				this.field3684 = var1.readUnsignedShort();
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
			this.field3693 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "361710485"
	)
	void method6766(Buffer var1) {
		this.field3660 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)[Ljava/lang/Object;",
		garbageValue = "-1864963770"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)[I",
		garbageValue = "1916026116"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZLel;I)Luz;",
		garbageValue = "-1408001366"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3656 = false;
		if (this.field3696 != null) {
			SpritePixels var4 = this.method6662(var1, var3);
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
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var8;
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = IgnoreList.SpriteBuffer_getSprite(var1.field3575, var8, 0);
				if (var7 == null) {
					field3656 = true;
					return null;
				} else {
					this.method6665(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lel;I)Luz;",
		garbageValue = "243499919"
	)
	SpritePixels method6662(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method6664()) {
			return this.method6663(var1, var2);
		} else {
			String var3 = this.field3696 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3576.method8022(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method6663(var1, var2);
				if (var5 != null) {
					var4 = var5.method9737();
					this.method6665(var4);
					var1.field3576.method8037(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lel;I)Luz;",
		garbageValue = "769156512"
	)
	SpritePixels method6663(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3696 != null && var2 != null) {
			class338 var3 = (class338)var1.field3567.method8022(this.field3696);
			if (var3 == null) {
				var3 = new class338(this.field3696, var2);
				var1.field3567.method8037(this.field3696, var3);
			}

			return var3.method6307();
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "623493870"
	)
	boolean method6664() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)V",
		garbageValue = "-891883391"
	)
	void method6665(SpritePixels var1) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)Lpf;",
		garbageValue = "1649883355"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3656 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3575;
				AbstractArchive var5 = var1.field3563;
				int var6 = this.fontId;
				byte[] var8 = var4.takeFile(var6, 0);
				boolean var7;
				if (var8 == null) {
					var7 = false;
				} else {
					class162.SpriteBuffer_decode(var8);
					var7 = true;
				}

				Font var3;
				if (!var7) {
					var3 = null;
				} else {
					var3 = WorldMapArea.method4590(var5.takeFile(var6, 0));
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3656 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lhx;IZLnb;Lhw;Lhf;B)Lka;",
		garbageValue = "52"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3656 = false;
		int var8;
		int var9;
		if (var4) {
			var8 = this.modelType2;
			var9 = this.modelId2;
		} else {
			var8 = this.modelType;
			var9 = this.modelId;
		}

		if (var8 == 6) {
			if (var6 == null) {
				return null;
			}

			var9 = var6.id;
		}

		if (var8 == 0) {
			return null;
		} else if (var8 == 1 && var9 == -1) {
			return null;
		} else {
			if (var7 != null && var7.useLocalPlayer && var8 == 6) {
				var8 = 3;
			}

			long var10 = (long)(var9 + (var8 << 16));
			if (var7 != null) {
				var10 |= var7.field1917 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3565, var9, 0);
					break;
				case 2:
					var13 = VerticalAlignment.getNpcDefinition(var9).method3696((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = class214.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					var13 = VerticalAlignment.getNpcDefinition(var9).method3696(var7);
				}

				if (var13 == null) {
					field3656 = true;
					return null;
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50);
				var1.Widget_cachedModels.put(var12, var10);
			}

			if (var2 != null) {
				var12 = var2.transformWidgetModel(var12, var3);
			}

			return var12;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZB)Lme;",
		garbageValue = "4"
	)
	public SpriteMask method6668(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-73"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "101495939"
	)
	public boolean method6708() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	public boolean method6771() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;J)V"
	)
	public void method6672(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3678 = new class208();
			if (!this.field3678.method4161(var1, var2)) {
				this.field3678 = null;
			} else {
				if (this.field3730 == null || this.field3661 == null) {
					this.method6676();
				}

			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)V",
		garbageValue = "-1255401092"
	)
	public void method6673(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3678 = new class208();
			this.field3678.method4132(var1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1944060082"
	)
	void method6676() {
		this.field3730 = new HashMap();
		this.field3661 = new HashMap();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "105"
	)
	public void method6695(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3730 == null) {
				this.method6676();
			}

			this.field3730.put(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "40"
	)
	public void method6781(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3661 == null) {
				this.method6676();
			}

			this.field3661.put(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1885191377"
	)
	public boolean method6723(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3678 != null && this.method6682()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3678.method4183()[0] * (float)this.width);
			int var6 = (int)(this.field3678.method4183()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3678.method4183()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3678.method4183()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "29"
	)
	public boolean method6682() {
		return this.field3729 == 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-720840753"
	)
	public int method6677(String var1) {
		return this.type == 11 && this.field3678 != null && this.method6682() ? this.field3678.method4114(var1) : -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1149651075"
	)
	public String method6765(String var1) {
		return this.type == 11 && this.field3678 != null && this.method6682() ? this.field3678.method4118(var1) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2095276271"
	)
	public int method6681() {
		return this.field3661 != null && this.field3661.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1126201283"
	)
	public int method6689() {
		if (this.type == 11 && this.field3678 != null && this.field3661 != null && !this.field3661.isEmpty()) {
			String var1 = this.field3678.method4121();
			return var1 != null && this.field3661.containsKey(this.field3678.method4121()) ? (Integer)this.field3661.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "81"
	)
	public String method6683() {
		if (this.type == 11 && this.field3678 != null) {
			String var1 = this.field3678.method4121();
			Iterator var2 = this.field3678.method4123().iterator();

			while (var2.hasNext()) {
				class219 var3 = (class219)var2.next();
				String var4 = String.format("%%%S%%", var3.method4251());
				if (var3.vmethod4266() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4255()));
				} else {
					var1.replaceAll(var4, var3.vmethod4250());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-61"
	)
	public int[] method6684() {
		if (this.type == 11 && this.field3678 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3678.method4123().iterator();

			while (var3.hasNext()) {
				class219 var4 = (class219)var3.next();
				if (!var4.method4251().equals("user_id")) {
					if (var4.vmethod4266() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4255();
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lel;I)Z",
		garbageValue = "1588534614"
	)
	public boolean method6675(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3678 != null) {
			this.field3678.method4115(var2);
			if (this.field3678.method4124() != this.field3729) {
				this.field3729 = this.field3678.method4124();
				if (this.field3729 >= 100) {
					return true;
				}

				if (this.field3729 == 2) {
					this.method6686(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "1425941595"
	)
	void method6686(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3678.method4119();
		ArrayList var3 = this.field3678.method4120();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class214 var7 = (class214)var6.next();
			var8 = class160.method3433(5, this, var5, 0, 0, 0, 0, var7.field2300);
			var8.field3696 = var7.field2303.method2928();
			class338 var9 = new class338(var7.field2303);
			var1.field3567.method8037(var8.field3696, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class215 var10 = (class215)var6.next();
			var8 = class160.method3433(4, this, var5, 0, 0, 0, 0, var10.field2306);
			var8.text = var10.field2312;
			var8.fontId = (Integer)this.field3730.get(var10.field2310);
			var8.textXAlignment = var10.field2308;
			var8.textYAlignment = var10.field2309;
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1475013178"
	)
	public void method6687() {
		this.field3732 = new class339();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3732.field3594.method404(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3732.field3594.method406(var2, 0);
		}

		this.field3732.field3594.method406('\u0080', 0);
		this.field3732.field3594.method404(82, 2);
		this.field3732.field3594.method404(81, 2);
		this.field3732.field3594.method404(86, 2);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lni;",
		garbageValue = "-2105376256"
	)
	public class341 method6688() {
		return this.field3732 != null ? this.field3732.field3593 : null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Lmp;",
		garbageValue = "-116"
	)
	public class336 method6724() {
		return this.field3732 != null ? this.field3732.field3589 : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-35642997"
	)
	public class27 method6690() {
		return this.field3732 != null ? this.field3732.field3594 : null;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnq;",
		garbageValue = "1933652600"
	)
	public class339 method6767() {
		return this.field3732;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)Z",
		garbageValue = "588474161"
	)
	boolean method6692(class341 var1) {
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
			var2 |= var1.method6363(var5);
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
			var2 |= var1.method6364(var5);
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmr;B)Z",
		garbageValue = "16"
	)
	public boolean method6693(WidgetDefinition var1) {
		class341 var2 = this.method6688();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method6394() && this.fontId != -1) {
				int var4 = var2.method6418();
				int var5 = var2.method6419();
				int var6 = var2.method6416();
				int var7 = var2.method6415();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method6431(var8);
					var3 |= this.method6692(var2);
					var3 |= var2.method6370(var4, var5);
					var3 |= var2.method6385(var6, var7);
				}
			} else if (var2.method6394()) {
				var3 |= this.method6692(var2);
			}

			var2.method6360();
			return var3;
		}
	}
}
