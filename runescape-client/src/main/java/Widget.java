import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ag")
	public static boolean field3812;
	@ObfuscatedName("bs")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -758120447
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -727643239
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bi")
	String field3816;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1541050645
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1876205579
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1325176123
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1362138125
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 856493267
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 613298417
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -4907921
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1467284707
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2071164941
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -281674593
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1980663789
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -206303103
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1861166551
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1967565413
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -73929865
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1617589423
	)
	public int field3886;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 731664045
	)
	public int field3833;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1299073355
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bz")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1262905319
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -405857523
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -2051530881
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1423426439
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -261620449
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1223805979
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 221896313
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1673282385
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cd")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	@Export("fillMode")
	public class557 fillMode;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 477398947
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1005974159
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -2040013457
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cb")
	public boolean field3849;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 565505515
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1497207771
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cf")
	public String field3852;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1305154035
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cz")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -567892145
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1685994451
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cq")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cy")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -881547
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 405023107
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1907919809
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 380196699
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -2027266733
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -876818259
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -815264671
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -2114243855
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 299779145
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -614203921
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -586331193
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 926637623
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1917241329
	)
	public int field3871;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1169953861
	)
	public int field3872;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public PlayerComposition field3902;
	@ObfuscatedName("df")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dz")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1081289319
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 168331883
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("du")
	@Export("text")
	public String text;
	@ObfuscatedName("dc")
	@Export("text2")
	public String text2;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -508618915
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 261981695
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1644937055
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dk")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	class174 field3884;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1606898299
	)
	int field3885;
	@ObfuscatedName("di")
	HashMap field3880;
	@ObfuscatedName("dx")
	HashMap field3887;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	class353 field3888;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 927614071
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ei")
	public boolean field3868;
	@ObfuscatedName("en")
	public byte[][] field3891;
	@ObfuscatedName("ej")
	public byte[][] field3873;
	@ObfuscatedName("em")
	public int[] field3835;
	@ObfuscatedName("eh")
	public int[] field3894;
	@ObfuscatedName("ex")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("el")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 770302391
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -2052826385
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ey")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("er")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ew")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ec")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eu")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("et")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ek")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("eg")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eq")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ee")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ez")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fh")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fk")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fy")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fm")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fr")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fz")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fg")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fe")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fc")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fv")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fa")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fo")
	public Object[] field3957;
	@ObfuscatedName("fx")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ft")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fb")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fp")
	public Object[] field3927;
	@ObfuscatedName("fn")
	public Object[] field3928;
	@ObfuscatedName("fs")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fl")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fj")
	public Object[] field3931;
	@ObfuscatedName("fu")
	public Object[] field3932;
	@ObfuscatedName("fq")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fd")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("ff")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fi")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fw")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gf")
	public Object[] field3904;
	@ObfuscatedName("gt")
	public Object[] field3939;
	@ObfuscatedName("gc")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gm")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gj")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1284050779
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gs")
	public String field3848;
	@ObfuscatedName("gy")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gx")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ga")
	public int[] field3807;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 2107973379
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1759783679
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1930123667
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 701984599
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gb")
	public boolean field3953;
	@ObfuscatedName("gv")
	public boolean field3954;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1859947809
	)
	public int field3955;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 502923521
	)
	public int field3924;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 315706579
	)
	public int field3828;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 912041471
	)
	public int field3809;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 1651979771
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 2021773189
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gq")
	public int[] field3822;
	@ObfuscatedName("gi")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gp")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hm")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3812 = false;
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
		this.field3886 = 1;
		this.field3833 = 1;
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
		this.fillMode = class557.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3849 = false;
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
		this.field3871 = 0;
		this.field3872 = 0;
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
		this.field3885 = -1;
		this.flags = 0;
		this.field3868 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3848 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3953 = false;
		this.field3954 = false;
		this.field3955 = -1;
		this.field3924 = 0;
		this.field3828 = 0;
		this.field3809 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1216428037"
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
			this.field3848 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-124"
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
				this.field3871 = var1.readUnsignedShort();
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
			this.field3849 = var1.readUnsignedByte() == 1;
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
		descriptor = "(Lua;B)V",
		garbageValue = "58"
	)
	void method6911(Buffer var1) {
		this.field3816 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)[Ljava/lang/Object;",
		garbageValue = "1925180374"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)[I",
		garbageValue = "-674057966"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnk;ZLeb;I)Lvc;",
		garbageValue = "-569575848"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3812 = false;
		if (this.field3852 != null) {
			SpritePixels var4 = this.method6996(var1, var3);
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
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var8 + ((this.spriteFlipV ? 1L : 0L) << 38);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class542.SpriteBuffer_getSprite(var1.field3719, var8, 0);
				if (var7 == null) {
					field3812 = true;
					return null;
				} else {
					this.method6987(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Leb;I)Lvc;",
		garbageValue = "1082314874"
	)
	SpritePixels method6996(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method6917()) {
			return this.method6916(var1, var2);
		} else {
			String var3 = this.field3852 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3716.method8483(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method6916(var1, var2);
				if (var5 != null) {
					var4 = var5.method10127();
					this.method6987(var4);
					var1.field3716.method8488(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Leb;B)Lvc;",
		garbageValue = "2"
	)
	SpritePixels method6916(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3852 != null && var2 != null) {
			class352 var3 = (class352)var1.field3728.method8483(this.field3852);
			if (var3 == null) {
				var3 = new class352(this.field3852, var2);
				var1.field3728.method8488(this.field3852, var3);
			}

			return var3.method6558();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-85"
	)
	boolean method6917() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvc;B)V",
		garbageValue = "-3"
	)
	void method6987(SpritePixels var1) {
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
		descriptor = "(Lnk;B)Lqb;",
		garbageValue = "64"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3812 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3719;
				AbstractArchive var5 = var1.field3720;
				int var6 = this.fontId;
				Font var3;
				if (!class108.method2769(var4, var6, 0)) {
					var3 = null;
				} else {
					byte[] var8 = var5.takeFile(var6, 0);
					Font var7;
					if (var8 == null) {
						var7 = null;
					} else {
						Font var9 = new Font(var8, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, SpriteBufferProperties.SpriteBuffer_spriteHeights, UrlRequest.SpriteBuffer_spritePalette, PlayerCompositionColorTextureOverride.SpriteBuffer_pixels);
						SpriteBufferProperties.SpriteBuffer_xOffsets = null;
						SpriteBufferProperties.SpriteBuffer_yOffsets = null;
						SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
						SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
						UrlRequest.SpriteBuffer_spritePalette = null;
						PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
						var7 = var9;
					}

					var3 = var7;
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3812 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lic;IZLnt;Lio;I)Lkb;",
		garbageValue = "-619164960"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NpcOverrides var6) {
		field3812 = false;
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
				var9 |= var6.field2110 << 20;
			}

			Model var11 = (Model)var1.Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(var1.field3723, var8, 0);
					break;
				case 2:
					var12 = class134.getNpcDefinition(var8).method3967((NpcOverrides)null);
					break;
				case 3:
					var12 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = KeyHandler.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.ambient;
					var14 += var15.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var12 = class134.getNpcDefinition(var8).method3967(var6);
				}

				if (var12 == null) {
					field3812 = true;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lnk;ZI)Lnw;",
		garbageValue = "-452881193"
	)
	public SpriteMask method6924(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipH ? 1L : 0L) << 39);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1287269448"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	public boolean method6922() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	public boolean method7031() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leb;J)V"
	)
	public void method7008(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3884 = new class174();
			if (!this.field3884.method3509(var1, var2, var3)) {
				this.field3884 = null;
			} else {
				if (this.field3880 == null || this.field3887 == null) {
					this.method7042();
				}

			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leb;I)V",
		garbageValue = "2009823259"
	)
	public void method6925(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3884 = new class174();
		if (!this.field3884.method3509(var1, var3, var6)) {
			this.field3884 = null;
		} else {
			if (this.field3880 == null || this.field3887 == null) {
				this.method7042();
			}

			this.field3884.method3510(var2, var4, var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;I)V",
		garbageValue = "1319245340"
	)
	public void method6926(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3884 = new class174();
			this.field3884.method3550(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "197710645"
	)
	void method7042() {
		this.field3880 = new HashMap();
		this.field3887 = new HashMap();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1339869162"
	)
	public void method6928(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3880 == null) {
				this.method7042();
			}

			this.field3880.put(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "89"
	)
	public void method6929(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3887 == null) {
				this.method7042();
			}

			this.field3887.put(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-430792370"
	)
	public boolean method6930(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3884 != null && this.method6931()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3884.method3561()[0] * (float)this.width);
			int var6 = (int)(this.field3884.method3561()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3884.method3561()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3884.method3561()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1872826492"
	)
	public boolean method6931() {
		return this.field3885 == 2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-46075661"
	)
	public int method6932(String var1) {
		return this.type == 11 && this.field3884 != null && this.method6931() ? this.field3884.method3574(var1) : -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1769986594"
	)
	public String method6933(String var1) {
		return this.type == 11 && this.field3884 != null && this.method6931() ? this.field3884.method3557(var1) : null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-80257683"
	)
	public int method6934() {
		return this.field3887 != null && this.field3887.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1007243790"
	)
	public int method7052() {
		if (this.type == 11 && this.field3884 != null && this.field3887 != null && !this.field3887.isEmpty()) {
			String var1 = this.field3884.method3518();
			return var1 != null && this.field3887.containsKey(this.field3884.method3518()) ? (Integer)this.field3887.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1993650873"
	)
	public String method6936() {
		if (this.type == 11 && this.field3884 != null) {
			String var1 = this.field3884.method3518();
			Iterator var2 = this.field3884.method3517().iterator();

			while (var2.hasNext()) {
				class188 var3 = (class188)var2.next();
				String var4 = String.format("%%%S%%", var3.method3760());
				if (var3.vmethod3757() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3759()));
				} else {
					var1.replaceAll(var4, var3.vmethod3764());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-72"
	)
	public int[] method6937() {
		if (this.type == 11 && this.field3884 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3884.method3517().iterator();

			while (var3.hasNext()) {
				class188 var4 = (class188)var3.next();
				if (!var4.method3760().equals("user_id")) {
					if (var4.vmethod3757() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3759();
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lgh;",
		garbageValue = "711341083"
	)
	public class174 method6938() {
		return this.field3884;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Leb;B)Z",
		garbageValue = "-92"
	)
	public boolean method6908(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3884 != null) {
			this.field3884.method3511(var2);
			if (this.field3884.method3512() != this.field3885) {
				this.field3885 = this.field3884.method3512();
				if (this.field3885 >= 3) {
					return true;
				}

				if (this.field3885 == 2) {
					this.method7018(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-2052348437"
	)
	void method7018(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3884.method3515();
		ArrayList var3 = this.field3884.method3565();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class175 var7 = (class175)var6.next();
			var8 = PlayerComposition.method6580(5, this, var5, 0, 0, 0, 0, var7.field1866);
			var8.field3852 = var7.field1867.method2937();
			class352 var9 = new class352(var7.field1867);
			var1.field3728.method8488(var8.field3852, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class186 var10 = (class186)var6.next();
			var8 = PlayerComposition.method6580(4, this, var5, 0, 0, 0, 0, var10.field1949);
			var8.text = var10.field1952;
			var8.fontId = (Integer)this.field3880.get(var10.field1953);
			var8.textXAlignment = var10.field1951;
			var8.textYAlignment = var10.field1957;
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	public void method6941() {
		this.field3888 = new class353();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3888.field3747.method381(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3888.field3747.method382(var2, 0);
		}

		this.field3888.field3747.method382('\u0080', 0);
		this.field3888.field3747.method381(82, 2);
		this.field3888.field3747.method381(81, 2);
		this.field3888.field3747.method381(86, 2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lnp;",
		garbageValue = "97"
	)
	public class355 method6942() {
		return this.field3888 != null ? this.field3888.field3751 : null;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lnz;",
		garbageValue = "31259424"
	)
	public class349 method6943() {
		return this.field3888 != null ? this.field3888.field3748 : null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lbf;",
		garbageValue = "673989100"
	)
	public class27 method7041() {
		return this.field3888 != null ? this.field3888.field3747 : null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "1152634511"
	)
	public class353 method6945() {
		return this.field3888;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)Z",
		garbageValue = "-62"
	)
	boolean method6946(class355 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method6619(HttpRequest.method97(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method6620(HttpRequest.method97(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Z",
		garbageValue = "659054224"
	)
	public boolean method6947(WidgetDefinition var1) {
		class355 var2 = this.method6942();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method6673() && this.fontId != -1) {
				int var4 = var2.method6672();
				int var5 = var2.method6697();
				int var6 = var2.method6822();
				int var7 = var2.method6671();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method6621(var8);
					var3 |= this.method6946(var2);
					var3 |= var2.method6849(var4, var5);
					var3 |= var2.method6887(var6, var7);
				}
			} else if (var2.method6673()) {
				var3 |= this.method6946(var2);
			}

			var2.method6616();
			return var3;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2048556147"
	)
	static String method7058() {
		StringBuilder var0 = new StringBuilder();

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) {
			var2 = (Message)var1.next();
			if (var2.sender != null && !var2.sender.isEmpty()) {
				var0.append(var2.sender).append(':');
			}
		}

		return var0.toString();
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "573699860"
	)
	static void method7057() {
		class459.clientPreferences.updateEULA(Client.field531);
	}
}
