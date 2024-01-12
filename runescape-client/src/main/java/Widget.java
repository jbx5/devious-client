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
	@ObfuscatedName("at")
	public static boolean field3698;
	@ObfuscatedName("bj")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -581424645
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 682881247
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bt")
	String field3702;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -688476977
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -352524723
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1882858409
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2135195913
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -785985783
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1298643517
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 542614333
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -856367673
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2009252243
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -123837809
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1546265191
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1598075411
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 51913453
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -933572881
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 243026823
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 507694829
	)
	public int field3718;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1218173411
	)
	public int field3710;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 438029411
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 553937681
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2087071211
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1183616913
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 189697433
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 59242653
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 494867345
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1040261009
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 896899793
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cp")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1520489857
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1396436823
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -55530205
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cd")
	public boolean field3735;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -574615749
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1335238307
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cy")
	public String field3728;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -134908819
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("ch")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1418454377
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1806653653
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cz")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ck")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -967131161
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -875596785
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -706913575
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1357521321
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2033889893
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1143616739
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -706355007
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1557677047
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 889711111
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -539924403
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 981714739
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 885887091
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -597795
	)
	public int field3785;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1612526275
	)
	public int field3758;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public PlayerComposition field3759;
	@ObfuscatedName("dr")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("db")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 962335791
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1606863379
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dn")
	@Export("text")
	public String text;
	@ObfuscatedName("dp")
	@Export("text2")
	public String text2;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -984803871
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 742049137
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 829573041
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("do")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class208 field3770;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 131734723
	)
	int field3783;
	@ObfuscatedName("dq")
	HashMap field3772;
	@ObfuscatedName("ds")
	HashMap field3828;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	class342 field3774;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -344331513
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("el")
	public boolean field3776;
	@ObfuscatedName("et")
	public byte[][] field3775;
	@ObfuscatedName("eo")
	public byte[][] field3796;
	@ObfuscatedName("ec")
	public int[] field3779;
	@ObfuscatedName("en")
	public int[] field3787;
	@ObfuscatedName("em")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ee")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -312061563
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -2014946303
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eh")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ep")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eb")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eu")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("es")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("eq")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ea")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ex")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ei")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ef")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ez")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ek")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fe")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fx")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ff")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fv")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fb")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fr")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fi")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fh")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fu")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fs")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fw")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fl")
	public Object[] field3809;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fd")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ft")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fk")
	public Object[] field3813;
	@ObfuscatedName("fm")
	public Object[] field3814;
	@ObfuscatedName("fj")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fc")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fq")
	public Object[] field3817;
	@ObfuscatedName("fg")
	public Object[] field3818;
	@ObfuscatedName("fy")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fa")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fz")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fn")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fp")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gz")
	public Object[] field3824;
	@ObfuscatedName("gn")
	public Object[] field3825;
	@ObfuscatedName("ga")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gu")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gr")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -569245637
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gl")
	public String field3830;
	@ObfuscatedName("gt")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("go")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gv")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -473617411
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 44818035
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1833868437
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 2051793061
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gi")
	public boolean field3722;
	@ObfuscatedName("gc")
	public boolean field3840;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 518185877
	)
	public int field3836;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1567645325
	)
	public int field3842;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1468300537
	)
	public int field3843;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -904704263
	)
	public int field3844;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -883784835
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1004063217
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ge")
	public int[] field3847;
	@ObfuscatedName("gd")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gg")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hw")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3698 = false;
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
		this.field3718 = 1;
		this.field3710 = 1;
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
		this.field3735 = false;
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
		this.field3785 = 0;
		this.field3758 = 0;
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
		this.field3783 = -1;
		this.flags = 0;
		this.field3776 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3830 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3722 = false;
		this.field3840 = false;
		this.field3836 = -1;
		this.field3842 = 0;
		this.field3843 = 0;
		this.field3844 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1632762794"
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
			this.field3830 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "45"
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
				this.field3785 = var1.readUnsignedShort();
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
			this.field3735 = var1.readUnsignedByte() == 1;
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
		descriptor = "(Luk;B)V",
		garbageValue = "1"
	)
	void method6690(Buffer var1) {
		this.field3702 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)[Ljava/lang/Object;",
		garbageValue = "-990286319"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)[I",
		garbageValue = "1742666760"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZLeg;I)Luc;",
		garbageValue = "1917347799"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3698 = false;
		if (this.field3728 != null) {
			SpritePixels var4 = this.method6694(var1, var3);
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
				var7 = class135.SpriteBuffer_getSprite(var1.field3608, var8, 0);
				if (var7 == null) {
					field3698 = true;
					return null;
				} else {
					this.method6697(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leg;S)Luc;",
		garbageValue = "-5190"
	)
	SpritePixels method6694(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method6696()) {
			return this.method6701(var1, var2);
		} else {
			String var3 = this.field3728 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3605.method8139(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method6701(var1, var2);
				if (var5 != null) {
					var4 = var5.method9909();
					this.method6697(var4);
					var1.field3605.method8146(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leg;I)Luc;",
		garbageValue = "1106730958"
	)
	SpritePixels method6701(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3728 != null && var2 != null) {
			class341 var3 = (class341)var1.field3615.method8139(this.field3728);
			if (var3 == null) {
				var3 = new class341(this.field3728, var2);
				var1.field3615.method8146(this.field3728, var3);
			}

			return var3.method6364();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "106"
	)
	boolean method6696() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)V",
		garbageValue = "920760629"
	)
	void method6697(SpritePixels var1) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Lpv;",
		garbageValue = "-1316022754"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3698 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3608;
				AbstractArchive var5 = var1.field3613;
				int var6 = this.fontId;
				Font var3;
				if (!Varcs.method2829(var4, var6, 0)) {
					var3 = null;
				} else {
					var3 = class72.fontFromBytes(var5.takeFile(var6, 0));
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3698 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lhl;IZLnz;Lho;Lhb;B)Lko;",
		garbageValue = "-51"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3698 = false;
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
				var10 |= var7.field1943 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3607, var9, 0);
					break;
				case 2:
					var13 = Script.getNpcDefinition(var9).method3720((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = class341.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var13 = Script.getNpcDefinition(var9).method3720(var7);
				}

				if (var13 == null) {
					field3698 = true;
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZI)Lmq;",
		garbageValue = "-263902179"
	)
	public SpriteMask method6745(WidgetDefinition var1, boolean var2) {
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "943412361"
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
		descriptor = "(I)Z",
		garbageValue = "31893701"
	)
	public boolean method6702() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1517972429"
	)
	public boolean method6703() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leg;J)V"
	)
	public void method6704(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3770 = new class208();
			if (!this.field3770.method4143(var1, var2, var3)) {
				this.field3770 = null;
			} else {
				if (this.field3772 == null || this.field3828 == null) {
					this.method6707();
				}

			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leg;I)V",
		garbageValue = "1917494373"
	)
	public void method6705(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3770 = new class208();
		if (!this.field3770.method4143(var1, var3, var6)) {
			this.field3770 = null;
		} else {
			if (this.field3772 == null || this.field3828 == null) {
				this.method6707();
			}

			this.field3770.method4144(var2, var4, var5);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leg;I)V",
		garbageValue = "455902971"
	)
	public void method6768(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3770 = new class208();
			this.field3770.method4191(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1103364209"
	)
	void method6707() {
		this.field3772 = new HashMap();
		this.field3828 = new HashMap();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	public void method6742(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3772 == null) {
				this.method6707();
			}

			this.field3772.put(var1, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-60"
	)
	public void method6709(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3828 == null) {
				this.method6707();
			}

			this.field3828.put(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-446372013"
	)
	public boolean method6824(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3770 != null && this.method6762()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3770.method4153()[0] * (float)this.width);
			int var6 = (int)(this.field3770.method4153()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3770.method4153()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3770.method4153()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-62"
	)
	public boolean method6762() {
		return this.field3783 == 2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-20"
	)
	public int method6712(String var1) {
		return this.type == 11 && this.field3770 != null && this.method6762() ? this.field3770.method4147(var1) : -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1808785293"
	)
	public String method6806(String var1) {
		return this.type == 11 && this.field3770 != null && this.method6762() ? this.field3770.method4184(var1) : null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "779262746"
	)
	public int method6714() {
		return this.field3828 != null && this.field3828.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1304852713"
	)
	public int method6715() {
		if (this.type == 11 && this.field3770 != null && this.field3828 != null && !this.field3828.isEmpty()) {
			String var1 = this.field3770.method4141();
			return var1 != null && this.field3828.containsKey(this.field3770.method4141()) ? (Integer)this.field3828.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public String method6688() {
		if (this.type == 11 && this.field3770 != null) {
			String var1 = this.field3770.method4141();
			Iterator var2 = this.field3770.method4151().iterator();

			while (var2.hasNext()) {
				class222 var3 = (class222)var2.next();
				String var4 = String.format("%%%S%%", var3.method4376());
				if (var3.vmethod4368() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4370()));
				} else {
					var1.replaceAll(var4, var3.vmethod4369());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "1"
	)
	public int[] method6717() {
		if (this.type == 11 && this.field3770 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3770.method4151().iterator();

			while (var3.hasNext()) {
				class222 var4 = (class222)var3.next();
				if (!var4.method4376().equals("user_id")) {
					if (var4.vmethod4368() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4370();
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-1981549192"
	)
	public class208 method6718() {
		return this.field3770;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leg;B)Z",
		garbageValue = "-47"
	)
	public boolean method6719(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3770 != null) {
			this.field3770.method4145(var2);
			if (this.field3770.method4146() != this.field3783) {
				this.field3783 = this.field3770.method4146();
				if (this.field3783 >= 3) {
					return true;
				}

				if (this.field3783 == 2) {
					this.method6720(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)V",
		garbageValue = "-69"
	)
	void method6720(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3770.method4149();
		ArrayList var3 = this.field3770.method4150();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		float[] var10;
		Widget var11;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var11) {
			class209 var7 = (class209)var6.next();
			var10 = var7.field2282;
			var11 = new Widget();
			var11.type = 5;
			var11.parentId = this.id;
			var11.childIndex = var5;
			var11.isIf3 = true;
			var11.xAlignment = 0;
			var11.yAlignment = 0;
			var11.widthAlignment = 0;
			var11.heightAlignment = 0;
			var11.rawX = (int)((float)this.width * var10[0]);
			var11.rawY = (int)((float)this.height * var10[1]);
			var11.rawWidth = (int)((float)this.width * var10[2]);
			var11.rawHeight = (int)((float)this.height * var10[3]);
			var11.field3728 = var7.field2284.method2920();
			class341 var12 = new class341(var7.field2284);
			var1.field3615.method8146(var11.field3728, var12);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var11) {
			class220 var13 = (class220)var6.next();
			var10 = var13.field2364;
			var11 = new Widget();
			var11.type = 4;
			var11.parentId = this.id;
			var11.childIndex = var5;
			var11.isIf3 = true;
			var11.xAlignment = 0;
			var11.yAlignment = 0;
			var11.widthAlignment = 0;
			var11.heightAlignment = 0;
			var11.rawX = (int)(var10[0] * (float)this.width);
			var11.rawY = (int)(var10[1] * (float)this.height);
			var11.rawWidth = (int)((float)this.width * var10[2]);
			var11.rawHeight = (int)((float)this.height * var10[3]);
			var11.text = var13.field2363;
			var11.fontId = (Integer)this.field3772.get(var13.field2368);
			var11.textXAlignment = var13.field2369;
			var11.textYAlignment = var13.field2366;
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	public void method6713() {
		this.field3774 = new class342();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3774.field3631.method427(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3774.field3631.method393(var2, 0);
		}

		this.field3774.field3631.method393('\u0080', 0);
		this.field3774.field3631.method427(82, 2);
		this.field3774.field3631.method427(81, 2);
		this.field3774.field3631.method427(86, 2);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lnl;",
		garbageValue = "1036694221"
	)
	public class344 method6700() {
		return this.field3774 != null ? this.field3774.field3635 : null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lnr;",
		garbageValue = "-28103544"
	)
	public class339 method6729() {
		return this.field3774 != null ? this.field3774.field3630 : null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-659193647"
	)
	public class27 method6724() {
		return this.field3774 != null ? this.field3774.field3631 : null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Lnm;",
		garbageValue = "1"
	)
	public class342 method6716() {
		return this.field3774;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lnl;B)Z",
		garbageValue = "-1"
	)
	boolean method6723(class344 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method6639(GrandExchangeOfferOwnWorldComparator.method1239(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method6420(GrandExchangeOfferOwnWorldComparator.method1239(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "1901265181"
	)
	public boolean method6727(WidgetDefinition var1) {
		class344 var2 = this.method6700();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method6472() && this.fontId != -1) {
				int var4 = var2.method6504();
				int var5 = var2.method6474();
				int var6 = var2.method6531();
				int var7 = var2.method6471();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method6637(var8);
					var3 |= this.method6723(var2);
					var3 |= var2.method6426(var4, var5);
					var3 |= var2.method6441(var6, var7);
				}
			} else if (var2.method6472()) {
				var3 |= this.method6723(var2);
			}

			var2.method6416();
			return var3;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1027554911"
	)
	public static int method6843(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "323779815"
	)
	static int method6823() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field785;
		} else {
			return 10000;
		}
	}
}
