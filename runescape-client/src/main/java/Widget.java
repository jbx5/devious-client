import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ar")
	public static boolean field3828;
	@ObfuscatedName("bt")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 765201367
	)
	@Export("id")
	public int id;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1114547637
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bm")
	String field3832;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 505032615
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -845014677
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 650299475
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -700936881
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1081332403
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -817282947
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -74447201
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1060131217
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1553952287
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 313524553
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1100508457
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2062618881
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1102193885
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -616855855
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1888969631
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1306856855
	)
	public int field3848;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -331675015
	)
	public int field3849;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 222435761
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bz")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1141305685
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 257051461
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1289302289
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -117409281
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 989679041
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -2140916845
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 331773959
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 374155529
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cu")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1049665797
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1803990569
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1594570601
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ct")
	public boolean field3880;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -969610781
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 2039865883
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cq")
	public String field3868;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 428367569
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cp")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1483878917
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1600044683
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ci")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cc")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1599213851
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -200792735
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1218710441
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1696450891
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -102888283
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 46722313
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1340193501
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1097487619
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1574425945
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1277206625
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 797774769
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -235408515
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1016527051
	)
	public int field3887;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1736947013
	)
	public int field3943;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public PlayerComposition field3838;
	@ObfuscatedName("dp")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dv")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1462515793
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -700546895
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dt")
	@Export("text")
	public String text;
	@ObfuscatedName("da")
	@Export("text2")
	public String text2;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -831075649
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1161106127
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1734965623
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dy")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	class213 field3900;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1544517309
	)
	int field3901;
	@ObfuscatedName("dj")
	HashMap field3973;
	@ObfuscatedName("dq")
	HashMap field3925;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class354 field3904;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 286263045
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("eg")
	public boolean field3915;
	@ObfuscatedName("es")
	public byte[][] field3907;
	@ObfuscatedName("ei")
	public byte[][] field3980;
	@ObfuscatedName("eo")
	public int[] field3966;
	@ObfuscatedName("ex")
	public int[] field3910;
	@ObfuscatedName("ek")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ev")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -2091171195
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -655581333
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ez")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eq")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("er")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("et")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ec")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ep")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ed")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ee")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ey")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("el")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ff")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fw")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fv")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fh")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fg")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fd")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fi")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fp")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fe")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fl")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fz")
	public Object[] field3939;
	@ObfuscatedName("ft")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fr")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fk")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fc")
	public Object[] field3840;
	@ObfuscatedName("fu")
	public Object[] field3829;
	@ObfuscatedName("fs")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fm")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fa")
	public Object[] field3947;
	@ObfuscatedName("fn")
	public Object[] field3865;
	@ObfuscatedName("fq")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fo")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fy")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fx")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fj")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gs")
	public Object[] field3954;
	@ObfuscatedName("gq")
	public Object[] field3955;
	@ObfuscatedName("gk")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ge")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gr")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 735025779
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gc")
	public String field3960;
	@ObfuscatedName("ga")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gi")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gn")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1740363595
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1807299683
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 936512001
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 515760285
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "[Lnx;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gf")
	public boolean field3969;
	@ObfuscatedName("gz")
	public boolean field3842;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -1221296269
	)
	public int field3971;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1878600795
	)
	public int field3899;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1468682019
	)
	public int field3911;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -124626521
	)
	public int field3974;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 188073995
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -1645523529
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gt")
	public int[] field3977;
	@ObfuscatedName("gy")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gg")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hr")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3828 = false;
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
		this.field3848 = 1;
		this.field3849 = 1;
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
		this.field3880 = false;
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
		this.field3887 = 0;
		this.field3943 = 0;
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
		this.field3901 = -1;
		this.flags = 0;
		this.field3915 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3960 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3969 = false;
		this.field3842 = false;
		this.field3971 = -1;
		this.field3899 = 0;
		this.field3911 = 0;
		this.field3974 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1473192041"
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
			this.field3960 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1148470664"
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
				this.field3887 = var1.readUnsignedShort();
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
			this.field3880 = var1.readUnsignedByte() == 1;
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
		descriptor = "(Lvp;I)V",
		garbageValue = "1311162477"
	)
	void method6858(Buffer var1) {
		this.field3832 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)[Ljava/lang/Object;",
		garbageValue = "-44"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)[I",
		garbageValue = "765201367"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnc;ZLea;I)Lvg;",
		garbageValue = "1975017005"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3828 = false;
		if (this.field3868 != null) {
			SpritePixels var4 = this.method6862(var1, var3);
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
				var7 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(var1.field3748, var8, 0);
				if (var7 == null) {
					field3828 = true;
					return null;
				} else {
					this.method6865(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lea;B)Lvg;",
		garbageValue = "4"
	)
	SpritePixels method6862(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method6864()) {
			return this.method6887(var1, var2);
		} else {
			String var3 = this.field3868 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3745.method8418(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method6887(var1, var2);
				if (var5 != null) {
					var4 = var5.method9997();
					this.method6865(var4);
					var1.field3745.method8419(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lea;I)Lvg;",
		garbageValue = "1974922267"
	)
	SpritePixels method6887(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3868 != null && var2 != null) {
			class353 var3 = (class353)var1.field3747.method8418(this.field3868);
			if (var3 == null) {
				var3 = new class353(this.field3868, var2);
				var1.field3747.method8419(this.field3868, var3);
			}

			return var3.method6530();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	boolean method6864() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-13"
	)
	void method6865(SpritePixels var1) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)Lqh;",
		garbageValue = "-125"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3828 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class148.method3275(var1.field3748, var1.field3738, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3828 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lii;IZLne;Lhh;I)Llv;",
		garbageValue = "1051555386"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NpcOverrides var6) {
		field3828 = false;
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
				var9 |= var6.field1981 << 20;
			}

			Model var11 = (Model)var1.Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(var1.field3743, var8, 0);
					break;
				case 2:
					var12 = class76.getNpcDefinition(var8).method3706((NpcOverrides)null);
					break;
				case 3:
					var12 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = class164.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.ambient;
					var14 += var15.contrast;
				case 5:
				default:
					break;
				case 6:
					var12 = class76.getNpcDefinition(var8).method3706(var6);
				}

				if (var12 == null) {
					field3828 = true;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnc;ZI)Lnw;",
		garbageValue = "768776562"
	)
	public SpriteMask method6943(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var3 + ((long)this.spriteShadow << 40);
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-17"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1430637540"
	)
	public boolean method6870() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1203881795"
	)
	public boolean method6871() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;J)V"
	)
	public void method6872(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3900 = new class213();
			if (!this.field3900.method4121(var1, var2, var3)) {
				this.field3900 = null;
			} else {
				if (this.field3973 == null || this.field3925 == null) {
					this.method6875();
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lea;I)V",
		garbageValue = "-2004899217"
	)
	public void method6869(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3900 = new class213();
		if (!this.field3900.method4121(var1, var3, var6)) {
			this.field3900 = null;
		} else {
			if (this.field3973 == null || this.field3925 == null) {
				this.method6875();
			}

			this.field3900.method4122(var2, var4, var5);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;B)V",
		garbageValue = "5"
	)
	public void method6874(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3900 = new class213();
			this.field3900.method4136(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1157881439"
	)
	void method6875() {
		this.field3973 = new HashMap();
		this.field3925 = new HashMap();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-413435181"
	)
	public void method6876(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3973 == null) {
				this.method6875();
			}

			this.field3973.put(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1751243979"
	)
	public void method6981(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3925 == null) {
				this.method6875();
			}

			this.field3925.put(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "1862989512"
	)
	public boolean method6878(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3900 != null && this.method6949()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3900.method4131()[0] * (float)this.width);
			int var6 = (int)(this.field3900.method4131()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3900.method4131()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3900.method4131()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1318138569"
	)
	public boolean method6949() {
		return this.field3901 == 2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-568135728"
	)
	public int method6879(String var1) {
		return this.type == 11 && this.field3900 != null && this.method6949() ? this.field3900.method4125(var1) : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1352084425"
	)
	public String method6942(String var1) {
		return this.type == 11 && this.field3900 != null && this.method6949() ? this.field3900.method4126(var1) : null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1889991427"
	)
	public int method6881() {
		return this.field3925 != null && this.field3925.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1941163667"
	)
	public int method6882() {
		if (this.type == 11 && this.field3900 != null && this.field3925 != null && !this.field3925.isEmpty()) {
			String var1 = this.field3900.method4130();
			return var1 != null && this.field3925.containsKey(this.field3900.method4130()) ? (Integer)this.field3925.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "55"
	)
	public String method6867() {
		if (this.type == 11 && this.field3900 != null) {
			String var1 = this.field3900.method4130();
			Iterator var2 = this.field3900.method4129().iterator();

			while (var2.hasNext()) {
				class227 var3 = (class227)var2.next();
				String var4 = String.format("%%%S%%", var3.method4322());
				if (var3.vmethod4325() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4324()));
				} else {
					var1.replaceAll(var4, var3.vmethod4323());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1838237565"
	)
	public int[] method6863() {
		if (this.type == 11 && this.field3900 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3900.method4129().iterator();

			while (var3.hasNext()) {
				class227 var4 = (class227)var3.next();
				if (!var4.method4322().equals("user_id")) {
					if (var4.vmethod4325() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4324();
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Lis;",
		garbageValue = "-86720175"
	)
	public class213 method6920() {
		return this.field3900;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lea;B)Z",
		garbageValue = "-107"
	)
	public boolean method6995(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3900 != null) {
			this.field3900.method4123(var2);
			if (this.field3900.method4124() != this.field3901) {
				this.field3901 = this.field3900.method4124();
				if (this.field3901 >= 3) {
					return true;
				}

				if (this.field3901 == 2) {
					this.method6988(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)V",
		garbageValue = "-12"
	)
	void method6988(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3900.method4127();
		ArrayList var3 = this.field3900.method4128();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class214 var7 = (class214)var6.next();
			var8 = EnumComposition.method3679(5, this, var5, 0, 0, 0, 0, var7.field2338);
			var8.field3868 = var7.field2340.method2978();
			class353 var9 = new class353(var7.field2340);
			var1.field3747.method8419(var8.field3868, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class225 var10 = (class225)var6.next();
			var8 = EnumComposition.method3679(4, this, var5, 0, 0, 0, 0, var10.field2415);
			var8.text = var10.field2417;
			var8.fontId = (Integer)this.field3973.get(var10.field2421);
			var8.textXAlignment = var10.field2418;
			var8.textYAlignment = var10.field2420;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1624337550"
	)
	public void method6888() {
		this.field3904 = new class354();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3904.field3765.method392(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3904.field3765.method393(var2, 0);
		}

		this.field3904.field3765.method393('\u0080', 0);
		this.field3904.field3765.method392(82, 2);
		this.field3904.field3765.method392(81, 2);
		this.field3904.field3765.method392(86, 2);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Lny;",
		garbageValue = "-5"
	)
	public class356 method6991() {
		return this.field3904 != null ? this.field3904.field3767 : null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-1337216813"
	)
	public class350 method6890() {
		return this.field3904 != null ? this.field3904.field3764 : null;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "-32445093"
	)
	public class27 method6940() {
		return this.field3904 != null ? this.field3904.field3765 : null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lnd;",
		garbageValue = "49982108"
	)
	public class354 method6892() {
		return this.field3904;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "1964712087"
	)
	boolean method6868(class356 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method6658(GrandExchangeOfferNameComparator.method7325(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method6587(GrandExchangeOfferNameComparator.method7325(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)Z",
		garbageValue = "-2098200626"
	)
	public boolean method6894(WidgetDefinition var1) {
		class356 var2 = this.method6991();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method6640() && this.fontId != -1) {
				int var4 = var2.method6641();
				int var5 = var2.method6642();
				int var6 = var2.method6639();
				int var7 = var2.method6779();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method6795(var8);
					var3 |= this.method6868(var2);
					var3 |= var2.method6730(var4, var5);
					var3 |= var2.method6608(var6, var7);
				}
			} else if (var2.method6640()) {
				var3 |= this.method6868(var2);
			}

			var2.method6832();
			return var3;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnx;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method7006(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = Canvas.method325(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
