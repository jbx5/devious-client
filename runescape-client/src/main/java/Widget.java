import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("az")
	public static boolean field3896;
	@ObfuscatedName("bg")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 492528499
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 203814725
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bc")
	String field3804;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1417628629
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -286761497
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1816460999
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1077504769
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1908935973
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 779003825
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1096425871
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1137955447
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1899957607
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -818415341
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 25566855
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1473390497
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 654330225
	)
	@Export("y")
	public int y;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1781629433
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -208252055
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1797255067
	)
	public int field3820;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1039389153
	)
	public int field3821;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1937587839
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -912196553
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -452001919
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1863285129
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 97328073
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1794422689
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -24899531
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1184078651
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 654029697
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cl")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 215203861
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1497639951
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -399707021
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cp")
	public boolean field3837;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 263480883
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -2141669609
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("co")
	public String field3954;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1062355035
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cy")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -287153879
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1016964781
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cc")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cs")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -358905483
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1039532233
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -920046491
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 566067621
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -136506341
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -391136565
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1243050019
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1105975227
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 2124061903
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1227120445
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1930364895
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1779031299
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1452369821
	)
	public int field3808;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 144800393
	)
	public int field3854;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public PlayerComposition field3861;
	@ObfuscatedName("dm")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("di")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1082141977
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -610741455
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dh")
	@Export("text")
	public String text;
	@ObfuscatedName("do")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -131979385
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1386829391
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1684587877
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dg")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	class210 field3872;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -923313189
	)
	int field3882;
	@ObfuscatedName("dk")
	HashMap field3874;
	@ObfuscatedName("db")
	HashMap field3802;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class356 field3876;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1935616453
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ep")
	public boolean field3878;
	@ObfuscatedName("et")
	public byte[][] field3879;
	@ObfuscatedName("en")
	public byte[][] field3880;
	@ObfuscatedName("ed")
	public int[] field3881;
	@ObfuscatedName("eh")
	public int[] field3832;
	@ObfuscatedName("eq")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ei")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ex")
	public String[][] field3873;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1933994667
	)
	public int field3886;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 1592410363
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 383302573
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ez")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("es")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ey")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ew")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eu")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ef")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ea")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ec")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eg")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fn")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fm")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fk")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fg")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fb")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ff")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fe")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fi")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fo")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fs")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fz")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fx")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fq")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fj")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fc")
	public Object[] field3913;
	@ObfuscatedName("fr")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fu")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fd")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fv")
	public Object[] field3917;
	@ObfuscatedName("fa")
	public Object[] field3838;
	@ObfuscatedName("fl")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fy")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fh")
	public Object[] field3921;
	@ObfuscatedName("ft")
	public Object[] field3922;
	@ObfuscatedName("fp")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fw")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gb")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gp")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ge")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gg")
	public Object[] field3928;
	@ObfuscatedName("gk")
	public Object[] field3929;
	@ObfuscatedName("gw")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gz")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gs")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -32339191
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gl")
	public String field3934;
	@ObfuscatedName("gu")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gh")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gx")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 1850258375
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 1975178649
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -156915605
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -39009775
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "[Lnq;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gy")
	public boolean field3942;
	@ObfuscatedName("gm")
	public boolean field3944;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1440452611
	)
	public int field3859;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1254617535
	)
	public int field3946;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 339022989
	)
	public int field3947;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1478273139
	)
	public int field3948;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1923781221
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 2100627565
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hh")
	public int[] field3951;
	@ObfuscatedName("hy")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hq")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hf")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3896 = false;
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
		this.field3820 = 1;
		this.field3821 = 1;
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
		this.field3837 = false;
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
		this.field3808 = 0;
		this.field3854 = 0;
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
		this.field3882 = -1;
		this.flags = 0;
		this.field3878 = false;
		this.dataText = "";
		this.field3886 = 4;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3934 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3942 = false;
		this.field3944 = false;
		this.field3859 = -1;
		this.field3946 = 0;
		this.field3947 = 0;
		this.field3948 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-54"
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
			this.field3934 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1057356070"
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
				this.field3808 = var1.readUnsignedShort();
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
			this.field3837 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "746756347"
	)
	void method6943(Buffer var1) {
		this.field3804 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)[Ljava/lang/Object;",
		garbageValue = "-404506916"
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
		descriptor = "(Lvg;I)[I",
		garbageValue = "-640367731"
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
		descriptor = "(Lnw;ZLex;B)Lvc;",
		garbageValue = "48"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3896 = false;
		if (this.field3954 != null) {
			SpritePixels var4 = this.method6942(var1, var3);
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
			long var5 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class195.SpriteBuffer_getSprite(var1.field3712, var8, 0);
				if (var7 == null) {
					field3896 = true;
					return null;
				} else {
					this.method7065(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Lex;I)Lvc;",
		garbageValue = "-1321520979"
	)
	SpritePixels method6942(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7001()) {
			return this.method7035(var1, var2);
		} else {
			String var3 = this.field3954 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3718.method8501(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7035(var1, var2);
				if (var5 != null) {
					var4 = var5.method10073();
					this.method7065(var4);
					var1.field3718.method8499(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Lex;I)Lvc;",
		garbageValue = "1057214995"
	)
	SpritePixels method7035(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3954 != null && var2 != null) {
			class355 var3 = (class355)var1.field3717.method8501(this.field3954);
			if (var3 == null) {
				var3 = new class355(this.field3954, var2);
				var1.field3717.method8499(this.field3954, var3);
			}

			return var3.method6570();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-44"
	)
	boolean method7001() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvc;I)V",
		garbageValue = "-1494313572"
	)
	void method7065(SpritePixels var1) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)Lqe;",
		garbageValue = "1229244678"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3896 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = MouseHandler.method658(var1.field3712, var1.field3706, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3896 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Lkr;IZLnt;Ljl;I)Lhr;",
		garbageValue = "-2088806818"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NpcOverrides var6) {
		field3896 = false;
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
				var9 |= var6.field2558 << 20;
			}

			Model var11 = (Model)var1.Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(var1.field3716, var8, 0);
					break;
				case 2:
					var12 = UserComparator8.getNpcDefinition(var8).method4917((NpcOverrides)null);
					break;
				case 3:
					var12 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = Player.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.ambient;
					var14 += var15.contrast;
				case 5:
				default:
					break;
				case 6:
					var12 = UserComparator8.getNpcDefinition(var8).method4917(var6);
				}

				if (var12 == null) {
					field3896 = true;
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ZB)Lnm;",
		garbageValue = "-1"
	)
	public SpriteMask method6948(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
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
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1736349606"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;B)V",
		garbageValue = "35"
	)
	public void method6953(int var1, int var2, String var3) {
		if (this.field3873 == null || this.field3873.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field3873 != null) {
				System.arraycopy(this.field3873, 0, var4, 0, this.field3873.length);
			}

			this.field3873 = var4;
		}

		if (this.field3873[var1] == null || this.field3873[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field3873[var1] != null) {
				System.arraycopy(this.field3873[var1], 0, var5, 0, this.field3873[var1].length);
			}

			this.field3873[var1] = var5;
		}

		this.field3873[var1][var2] = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "11443"
	)
	public boolean method6951() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "800100483"
	)
	public boolean method6952() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lex;J)V"
	)
	public void method7020(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3872 = new class210();
			if (!this.field3872.method4509(var1, var2, var3)) {
				this.field3872 = null;
			} else {
				if (this.field3874 == null || this.field3802 == null) {
					this.method6956();
				}

			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lex;I)V",
		garbageValue = "1708573399"
	)
	public void method7047(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3872 = new class210();
		if (!this.field3872.method4509(var1, var3, var6)) {
			this.field3872 = null;
		} else {
			if (this.field3874 == null || this.field3802 == null) {
				this.method6956();
			}

			this.field3872.method4510(var2, var4, var5);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lex;B)V",
		garbageValue = "-79"
	)
	public void method7000(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3872 = new class210();
			this.field3872.method4547(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1465229757"
	)
	void method6956() {
		this.field3874 = new HashMap();
		this.field3802 = new HashMap();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1304102945"
	)
	public void method6975(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3874 == null) {
				this.method6956();
			}

			this.field3874.put(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "492528499"
	)
	public void method7034(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3802 == null) {
				this.method6956();
			}

			this.field3802.put(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "-105"
	)
	public boolean method6959(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3872 != null && this.method6960()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3872.method4525()[0] * (float)this.width);
			int var6 = (int)(this.field3872.method4525()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3872.method4525()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3872.method4525()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	public boolean method6960() {
		return this.field3882 == 2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-910844316"
	)
	public int method6995(String var1) {
		return this.type == 11 && this.field3872 != null && this.method6960() ? this.field3872.method4514(var1) : -1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "32"
	)
	public String method6935(String var1) {
		return this.type == 11 && this.field3872 != null && this.method6960() ? this.field3872.method4507(var1) : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-466481018"
	)
	public int method6963() {
		return this.field3802 != null && this.field3802.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1003809699"
	)
	public int method6964() {
		if (this.type == 11 && this.field3872 != null && this.field3802 != null && !this.field3802.isEmpty()) {
			String var1 = this.field3872.method4533();
			return var1 != null && this.field3802.containsKey(this.field3872.method4533()) ? (Integer)this.field3802.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2114852343"
	)
	public String method6965() {
		if (this.type == 11 && this.field3872 != null) {
			String var1 = this.field3872.method4533();
			Iterator var2 = this.field3872.method4515().iterator();

			while (var2.hasNext()) {
				class224 var3 = (class224)var2.next();
				String var4 = String.format("%%%S%%", var3.method4722());
				if (var3.vmethod4725() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4732()));
				} else {
					var1.replaceAll(var4, var3.vmethod4724());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "96"
	)
	public int[] method7060() {
		if (this.type == 11 && this.field3872 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3872.method4515().iterator();

			while (var3.hasNext()) {
				class224 var4 = (class224)var3.next();
				if (!var4.method4722().equals("user_id")) {
					if (var4.vmethod4725() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4732();
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
		descriptor = "(I)Liy;",
		garbageValue = "1198747463"
	)
	public class210 method7043() {
		return this.field3872;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Lex;S)Z",
		garbageValue = "-14089"
	)
	public boolean method6968(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3872 != null) {
			this.field3872.method4511(var2);
			if (this.field3872.method4512() != this.field3882) {
				this.field3882 = this.field3872.method4512();
				if (this.field3882 >= 3) {
					return true;
				}

				if (this.field3882 == 2) {
					this.method7036(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "-49"
	)
	void method7036(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3872.method4516();
		ArrayList var3 = this.field3872.method4517();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class211 var7 = (class211)var6.next();
			var8 = class147.method3343(5, this, var5, 0, 0, 0, 0, var7.field2334);
			var8.field3954 = var7.field2339.method3022();
			class355 var9 = new class355(var7.field2339);
			var1.field3717.method8499(var8.field3954, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class222 var10 = (class222)var6.next();
			var8 = class147.method3343(4, this, var5, 0, 0, 0, 0, var10.field2413);
			var8.text = var10.field2415;
			var8.fontId = (Integer)this.field3874.get(var10.field2409);
			var8.textXAlignment = var10.field2410;
			var8.textYAlignment = var10.field2416;
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1435871945"
	)
	public void method6949() {
		this.field3876 = new class356();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3876.field3733.method362(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3876.field3733.method363(var2, 0);
		}

		this.field3876.field3733.method363('\u0080', 0);
		this.field3876.field3733.method362(82, 2);
		this.field3876.field3733.method362(81, 2);
		this.field3876.field3733.method362(86, 2);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lns;",
		garbageValue = "-815068643"
	)
	public class358 method6971() {
		return this.field3876 != null ? this.field3876.field3730 : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lnx;",
		garbageValue = "1631300847"
	)
	public class352 method6972() {
		return this.field3876 != null ? this.field3876.field3731 : null;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lbz;",
		garbageValue = "-392433259"
	)
	public class27 method6973() {
		return this.field3876 != null ? this.field3876.field3733 : null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-1238860440"
	)
	public class356 method6974() {
		return this.field3876;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)Z",
		garbageValue = "-506884275"
	)
	boolean method6969(class358 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method6642(class246.method4971(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method6643(class246.method4971(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)Z",
		garbageValue = "-1358753318"
	)
	public boolean method6976(WidgetDefinition var1) {
		class358 var2 = this.method6971();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method6843() && this.fontId != -1) {
				int var4 = var2.method6697();
				int var5 = var2.method6698();
				int var6 = var2.method6695();
				int var7 = var2.method6694();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method6751(var8);
					var3 |= this.method6969(var2);
					var3 |= var2.method6880(var4, var5);
					var3 |= var2.method6664(var6, var7);
				}
			} else if (var2.method6843()) {
				var3 |= this.method6969(var2);
			}

			var2.method6639();
			return var3;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnt;ZI)V",
		garbageValue = "1501089510"
	)
	public void method7045(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3861 = new PlayerComposition(var1);
		if (!var2) {
			this.field3861.equipment = Arrays.copyOf(this.field3861.field3742, this.field3861.field3742.length);
			this.field3861.method6586();
		}

	}
}
