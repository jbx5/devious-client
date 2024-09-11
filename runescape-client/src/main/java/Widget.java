import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ak")
	public static boolean field3987;
	@ObfuscatedName("bn")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1565465557
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1614754997
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bx")
	String field3853;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1256894539
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -605463391
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 571012371
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 372547349
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -128670653
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1444043925
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -616720447
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 515235543
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1945757037
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1848455111
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1438703239
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1930080551
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 688753001
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1339552805
	)
	@Export("width")
	public int width;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1036386215
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1118128065
	)
	public int field3869;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 94521325
	)
	public int field3870;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1678119623
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bq")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 699342125
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1372468429
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1096441855
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2090701815
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 925761921
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -670497933
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1822539197
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1893530277
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 601293795
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1462108059
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1091814791
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cv")
	public boolean field3886;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 400929199
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -292354061
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cq")
	public String field3889;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1930022295
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cz")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1043678643
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1122039687
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cl")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ca")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1015584877
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -2008812015
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1390072395
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 557250465
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -23315571
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 547301279
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1367658837
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1148787691
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1523887835
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1927853495
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 993428467
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 5443921
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1485045609
	)
	public int field3908;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1970074661
	)
	public int field3909;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	public PlayerComposition field3910;
	@ObfuscatedName("de")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dx")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 784106017
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1856794435
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dh")
	@Export("text")
	public String text;
	@ObfuscatedName("dm")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1355531467
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -2024686311
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1973017857
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dz")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	class216 field3921;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 265656093
	)
	int field3934;
	@ObfuscatedName("dy")
	HashMap field3939;
	@ObfuscatedName("ds")
	HashMap field3924;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class358 field3925;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -2124213689
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("eg")
	public boolean field3852;
	@ObfuscatedName("ea")
	public byte[][] field3928;
	@ObfuscatedName("ez")
	public byte[][] field3929;
	@ObfuscatedName("ev")
	public int[] field3931;
	@ObfuscatedName("ef")
	public int[] field3997;
	@ObfuscatedName("ei")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eo")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("el")
	public String[][] field3898;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 666034631
	)
	public int field3968;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 65803135
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -1378961615
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("es")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ey")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("er")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ed")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ee")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("eq")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ej")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ec")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("et")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fv")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ff")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fe")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ft")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fb")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fk")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fp")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fr")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fu")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fj")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fs")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fq")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fn")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fh")
	public Object[] field3982;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fw")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fd")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fi")
	public Object[] field3966;
	@ObfuscatedName("fc")
	public Object[] field3967;
	@ObfuscatedName("fm")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fx")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fy")
	public Object[] field3970;
	@ObfuscatedName("fz")
	public Object[] field3971;
	@ObfuscatedName("fa")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fl")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("ga")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gd")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gl")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ge")
	public Object[] field3963;
	@ObfuscatedName("gb")
	public Object[] field3905;
	@ObfuscatedName("go")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gs")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gp")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1024346521
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gx")
	public String field3983;
	@ObfuscatedName("gu")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gj")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gt")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 1679475031
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1333335699
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -1753142817
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 580905577
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gq")
	public boolean field3992;
	@ObfuscatedName("gv")
	public boolean field3984;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -1139573635
	)
	public int field3994;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1225763731
	)
	public int field3995;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -580975495
	)
	public int field3978;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 323796567
	)
	public int field3975;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -1670589827
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -2005214187
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hc")
	public int[] field4000;
	@ObfuscatedName("hf")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("he")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hr")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3987 = false;
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
		this.field3869 = 1;
		this.field3870 = 1;
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
		this.field3886 = false;
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
		this.field3908 = 0;
		this.field3909 = 0;
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
		this.field3934 = -1;
		this.flags = 0;
		this.field3852 = false;
		this.dataText = "";
		this.field3968 = 4;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3983 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3992 = false;
		this.field3984 = false;
		this.field3994 = -1;
		this.field3995 = 0;
		this.field3978 = 0;
		this.field3975 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-419725187"
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
			this.field3983 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "1684534044"
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
				this.field3908 = var1.readUnsignedShort();
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
			this.field3886 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "1314938647"
	)
	void method7333(Buffer var1) {
		this.field3853 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)[Ljava/lang/Object;",
		garbageValue = "-21"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvf;S)[I",
		garbageValue = "1828"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lna;ZLen;I)Lvv;",
		garbageValue = "-1858535344"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3987 = false;
		if (this.field3889 != null) {
			SpritePixels var4 = this.method7240(var1, var3);
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
			long var5 = ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var8 + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = AbstractUserComparator.SpriteBuffer_getSprite(var1.field3759, var8, 0);
				if (var7 == null) {
					field3987 = true;
					return null;
				} else {
					this.method7243(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lna;Len;I)Lvv;",
		garbageValue = "2088203856"
	)
	SpritePixels method7240(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7242()) {
			return this.method7241(var1, var2);
		} else {
			String var3 = this.field3889 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3768.method8754(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7241(var1, var2);
				if (var5 != null) {
					var4 = var5.method10427();
					this.method7243(var4);
					var1.field3768.method8755(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lna;Len;B)Lvv;",
		garbageValue = "88"
	)
	SpritePixels method7241(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3889 != null && var2 != null) {
			class357 var3 = (class357)var1.field3767.method8754(this.field3889);
			if (var3 == null) {
				var3 = new class357(this.field3889, var2);
				var1.field3767.method8755(this.field3889, var3);
			}

			return var3.method6871();
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1942488836"
	)
	boolean method7242() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V",
		garbageValue = "-1565681414"
	)
	void method7243(SpritePixels var1) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Lqu;",
		garbageValue = "-1400348288"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3987 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3759;
				AbstractArchive var5 = var1.field3760;
				int var6 = this.fontId;
				Font var3;
				if (!HttpJsonRequestBody.method9207(var4, var6, 0)) {
					var3 = null;
				} else {
					byte[] var8 = var5.takeFile(var6, 0);
					Font var7;
					if (var8 == null) {
						var7 = null;
					} else {
						Font var9 = new Font(var8, HttpAuthenticationHeader.SpriteBuffer_xOffsets, Login.SpriteBuffer_yOffsets, GrandExchangeEvents.SpriteBuffer_spriteWidths, ModelData0.SpriteBuffer_spriteHeights, SpriteBufferProperties.SpriteBuffer_spritePalette, MusicPatchPcmStream.SpriteBuffer_pixels);
						class151.method3492();
						var7 = var9;
					}

					var3 = var7;
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3987 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lif;IZLnr;Lhn;Lhp;B)Ljm;",
		garbageValue = "80"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3987 = false;
		int var8;
		int var9;
		if (var4) {
			var8 = this.modelType2;
			var9 = this.modelId2;
		} else {
			var8 = this.modelType;
			var9 = this.modelId;
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
				var10 |= var7.field1996 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3758, var9, 0);
					break;
				case 2:
					if (var6 == null) {
						return null;
					}

					var13 = var6.method3966((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = MouseRecorder.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					if (var6 == null) {
						return null;
					}

					var13 = var6.method3966(var7);
				}

				if (var13 == null) {
					field3987 = true;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lna;ZI)Lnl;",
		garbageValue = "-625336255"
	)
	public SpriteMask method7244(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
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
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
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
		descriptor = "(IILjava/lang/String;S)V",
		garbageValue = "255"
	)
	public void method7365(int var1, int var2, String var3) {
		if (this.field3898 == null || this.field3898.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field3898 != null) {
				System.arraycopy(this.field3898, 0, var4, 0, this.field3898.length);
			}

			this.field3898 = var4;
		}

		if (this.field3898[var1] == null || this.field3898[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field3898[var1] != null) {
				System.arraycopy(this.field3898[var1], 0, var5, 0, this.field3898[var1].length);
			}

			this.field3898[var1] = var5;
		}

		this.field3898[var1][var2] = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2003506548"
	)
	public boolean method7249() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2103842157"
	)
	public boolean method7291() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Len;J)V"
	)
	public void method7338(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3921 = new class216();
			if (!this.field3921.method4397(var1, var2, var3)) {
				this.field3921 = null;
			} else {
				if (this.field3939 == null || this.field3924 == null) {
					this.method7253();
				}

			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Len;B)V",
		garbageValue = "4"
	)
	public void method7251(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3921 = new class216();
		if (!this.field3921.method4397(var1, var3, var6)) {
			this.field3921 = null;
		} else {
			if (this.field3939 == null || this.field3924 == null) {
				this.method7253();
			}

			this.field3921.method4398(var2, var4, var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;I)V",
		garbageValue = "1914549117"
	)
	public void method7252(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3921 = new class216();
			this.field3921.method4413(var1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "41691608"
	)
	void method7253() {
		this.field3939 = new HashMap();
		this.field3924 = new HashMap();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-22"
	)
	public void method7254(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3939 == null) {
				this.method7253();
			}

			this.field3939.put(var1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "2138218919"
	)
	public void method7255(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3924 == null) {
				this.method7253();
			}

			this.field3924.put(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "1832901773"
	)
	public boolean method7256(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3921 != null && this.method7257()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3921.method4408()[0] * (float)this.width);
			int var6 = (int)(this.field3921.method4408()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3921.method4408()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3921.method4408()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "273813282"
	)
	public boolean method7257() {
		return this.field3934 == 2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "21"
	)
	public int method7258(String var1) {
		return this.type == 11 && this.field3921 != null && this.method7257() ? this.field3921.method4430(var1) : -1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-115"
	)
	public String method7275(String var1) {
		return this.type == 11 && this.field3921 != null && this.method7257() ? this.field3921.method4403(var1) : null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	public int method7250() {
		return this.field3924 != null && this.field3924.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2137750575"
	)
	public int method7261() {
		if (this.type == 11 && this.field3921 != null && this.field3924 != null && !this.field3924.isEmpty()) {
			String var1 = this.field3921.method4399();
			return var1 != null && this.field3924.containsKey(this.field3921.method4399()) ? (Integer)this.field3924.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1808380903"
	)
	public String method7262() {
		if (this.type == 11 && this.field3921 != null) {
			String var1 = this.field3921.method4399();
			Iterator var2 = this.field3921.method4406().iterator();

			while (var2.hasNext()) {
				class230 var3 = (class230)var2.next();
				String var4 = String.format("%%%S%%", var3.method4617());
				if (var3.vmethod4613() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4621()));
				} else {
					var1.replaceAll(var4, var3.vmethod4614());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1612634558"
	)
	public int[] method7343() {
		if (this.type == 11 && this.field3921 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3921.method4406().iterator();

			while (var3.hasNext()) {
				class230 var4 = (class230)var3.next();
				if (!var4.method4617().equals("user_id")) {
					if (var4.vmethod4613() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4621();
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "-1412090681"
	)
	public class216 method7299() {
		return this.field3921;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lna;Len;I)Z",
		garbageValue = "-1084120620"
	)
	public boolean method7265(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3921 != null) {
			this.field3921.method4431(var2);
			if (this.field3921.method4402() != this.field3934) {
				this.field3934 = this.field3921.method4402();
				if (this.field3934 >= 3) {
					return true;
				}

				if (this.field3934 == 2) {
					this.method7266(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)V",
		garbageValue = "-136857140"
	)
	void method7266(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3921.method4404();
		ArrayList var3 = this.field3921.method4405();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class217 var7 = (class217)var6.next();
			var8 = FaceNormal.method5155(5, this, var5, 0, 0, 0, 0, var7.field2368);
			var8.field3889 = var7.field2369.method3164();
			class357 var9 = new class357(var7.field2369);
			var1.field3767.method8755(var8.field3889, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class228 var10 = (class228)var6.next();
			var8 = FaceNormal.method5155(4, this, var5, 0, 0, 0, 0, var10.field2448);
			var8.text = var10.field2451;
			var8.fontId = (Integer)this.field3939.get(var10.field2447);
			var8.textXAlignment = var10.field2449;
			var8.textYAlignment = var10.field2450;
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	public void method7267() {
		this.field3925 = new class358();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3925.field3789.method379(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3925.field3789.method380(var2, 0);
		}

		this.field3925.field3789.method380('\u0080', 0);
		this.field3925.field3789.method379(82, 2);
		this.field3925.field3789.method379(81, 2);
		this.field3925.field3789.method379(86, 2);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-694047179"
	)
	public class360 method7268() {
		return this.field3925 != null ? this.field3925.field3785 : null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Lng;",
		garbageValue = "127"
	)
	public class354 method7303() {
		return this.field3925 != null ? this.field3925.field3783 : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Lbh;",
		garbageValue = "-420983449"
	)
	public class27 method7270() {
		return this.field3925 != null ? this.field3925.field3789 : null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "1406523579"
	)
	public class358 method7271() {
		return this.field3925;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-193730731"
	)
	boolean method7238(class360 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7231(Login.method2349(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7133(Login.method2349(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Z",
		garbageValue = "747802038"
	)
	public boolean method7273(WidgetDefinition var1) {
		class360 var2 = this.method7268();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7009() && this.fontId != -1) {
				int var4 = var2.method7010();
				int var5 = var2.method6956();
				int var6 = var2.method7087();
				int var7 = var2.method7007();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7092(var8);
					var3 |= this.method7238(var2);
					var3 |= var2.method6962(var4, var5);
					var3 |= var2.method6977(var6, var7);
				}
			} else if (var2.method7009()) {
				var3 |= this.method7238(var2);
			}

			var2.method6952();
			return var3;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnr;ZB)V",
		garbageValue = "47"
	)
	public void method7274(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3910 = new PlayerComposition(var1);
		if (!var2) {
			this.field3910.equipment = Arrays.copyOf(this.field3910.field3804, this.field3910.field3804.length);
			this.field3910.method6890();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "69840447"
	)
	static final int method7368(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
