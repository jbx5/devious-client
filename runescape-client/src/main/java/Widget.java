import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class423 field3642;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class423 field3759;
	@ObfuscatedName("ba")
	public static boolean field3644;
	@ObfuscatedName("bl")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -802277715
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1714711969
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1370156439
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2112192689
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 625549223
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1836019191
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2126278027
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 622186791
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 789633491
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1356456497
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1035953241
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1863641013
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1225925253
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 979552283
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1112610033
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 501302871
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1553685319
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -336932141
	)
	public int field3766;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -113901163
	)
	public int field3664;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1049113007
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cd")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -739875643
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 595666453
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -568991711
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 917378589
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 583709627
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1690813953
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 343481789
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -463307133
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ci")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1458216043
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -226104863
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 710046829
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cz")
	public boolean field3680;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1694560891
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -329704335
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("ck")
	public String field3683;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1503713927
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dh")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1314949967
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1858431901
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("du")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dn")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -2025847507
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1600832609
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1817776489
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 588250195
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1110473721
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1313087687
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1684340733
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1371233395
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 749203487
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1965358453
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 190427709
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -277742987
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1498521133
	)
	public int field3702;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1004887025
	)
	public int field3741;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public PlayerComposition field3704;
	@ObfuscatedName("dp")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dm")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1667643047
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1281040923
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("de")
	@Export("text")
	public String text;
	@ObfuscatedName("dc")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 732439673
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -450106133
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -1142439947
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ee")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	class170 field3715;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -1091181871
	)
	int field3760;
	@ObfuscatedName("ea")
	HashMap field3775;
	@ObfuscatedName("er")
	HashMap field3752;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	class327 field3726;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1774346509
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("en")
	public boolean field3721;
	@ObfuscatedName("eb")
	public byte[][] field3697;
	@ObfuscatedName("ei")
	public byte[][] field3796;
	@ObfuscatedName("es")
	public int[] field3724;
	@ObfuscatedName("el")
	public int[] field3725;
	@ObfuscatedName("eu")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eg")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -518432429
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -501291711
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ep")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ft")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fs")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fl")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fe")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fd")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fj")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fv")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fb")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fr")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fq")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fp")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fg")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fo")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fz")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fu")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fx")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ff")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fc")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fm")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fy")
	public Object[] field3754;
	@ObfuscatedName("fw")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fi")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fa")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gu")
	public Object[] field3767;
	@ObfuscatedName("gc")
	public Object[] field3723;
	@ObfuscatedName("gd")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gm")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gg")
	public Object[] field3762;
	@ObfuscatedName("gw")
	public Object[] field3763;
	@ObfuscatedName("gi")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("go")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gl")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gb")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gj")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ge")
	public Object[] field3784;
	@ObfuscatedName("gs")
	public Object[] field3714;
	@ObfuscatedName("gv")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gf")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gh")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 505176041
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gp")
	public String field3758;
	@ObfuscatedName("gk")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ga")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gx")
	public int[] itemQuantities;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1710253055
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1666268347
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1908101821
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 290467875
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ht")
	public boolean field3668;
	@ObfuscatedName("ho")
	public boolean field3785;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -622304961
	)
	public int field3718;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1773043479
	)
	public int field3787;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -1917542241
	)
	public int field3788;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1397975839
	)
	public int field3789;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 1527386271
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -822322021
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hl")
	public int[] field3792;
	@ObfuscatedName("hg")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hu")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("he")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3642 = new class423(10, class421.field4606);
		field3759 = new class423(10, class421.field4606);
		field3644 = false;
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
		this.field3766 = 1;
		this.field3664 = 1;
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
		this.field3680 = false;
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
		this.field3702 = 0;
		this.field3741 = 0;
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
		this.field3760 = -1;
		this.flags = 0;
		this.field3721 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3758 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3668 = false;
		this.field3785 = false;
		this.field3718 = -1;
		this.field3787 = 0;
		this.field3788 = 0;
		this.field3789 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-122"
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
			this.field3758 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1617832353"
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
				this.field3702 = var1.readUnsignedShort();
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
			this.field3680 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)[Ljava/lang/Object;",
		garbageValue = "-631733803"
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
		descriptor = "(Ltm;I)[I",
		garbageValue = "132481992"
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
		descriptor = "(ZLev;I)Lui;",
		garbageValue = "1752459087"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3644 = false;
		if (this.field3683 != null) {
			SpritePixels var3 = this.method6389(var2);
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
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				var6 = Tiles.SpriteBuffer_getSprite(Language.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3644 = true;
					return null;
				} else {
					this.method6440(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lev;B)Lui;",
		garbageValue = "24"
	)
	SpritePixels method6389(UrlRequester var1) {
		if (!this.method6391()) {
			return this.method6437(var1);
		} else {
			String var2 = this.field3683 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var3 = (SpritePixels)field3759.method7781(var2);
			if (var3 == null) {
				SpritePixels var4 = this.method6437(var1);
				if (var4 != null) {
					var3 = var4.method9491();
					this.method6440(var3);
					field3759.method7782(var2, var3);
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Lui;",
		garbageValue = "-853434695"
	)
	SpritePixels method6437(UrlRequester var1) {
		if (this.field3683 != null && var1 != null) {
			class326 var2 = (class326)field3642.method7781(this.field3683);
			if (var2 == null) {
				var2 = new class326(this.field3683, var1);
				field3642.method7782(this.field3683, var2);
			}

			return var2.method6057();
		} else {
			return null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-32"
	)
	boolean method6391() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lui;B)V",
		garbageValue = "-60"
	)
	void method6440(SpritePixels var1) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "1973823248"
	)
	@Export("getFont")
	public Font getFont() {
		field3644 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = LoginPacket.method5712(Language.Widget_spritesArchive, class155.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field3644 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lib;IZLmt;Lhw;Lhq;B)Ljr;",
		garbageValue = "-43"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NpcOverrides var6) {
		field3644 = false;
		int var7;
		int var8;
		if (var3) {
			var7 = this.modelType2;
			var8 = this.modelId2;
		} else {
			var7 = this.modelType;
			var8 = this.modelId;
		}

		if (var7 == 6) {
			if (var5 == null) {
				return null;
			}

			var8 = var5.id;
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
				var9 |= var6.field2026 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(class47.field352, var8, 0);
					break;
				case 2:
					var12 = class90.getNpcDefinition(var8).method3692((NpcOverrides)null);
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = InvDefinition.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.ambient;
					var14 += var15.contrast;
				case 5:
				default:
					break;
				case 6:
					var12 = class90.getNpcDefinition(var8).method3692(var6);
				}

				if (var12 == null) {
					field3644 = true;
					return null;
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50);
				Widget_cachedModels.put(var11, var9);
			}

			if (var1 != null) {
				var11 = var1.transformWidgetModel(var11, var2);
			}

			return var11;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lme;",
		garbageValue = "1022020243"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1578890937"
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
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public boolean method6397() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "13293"
	)
	public boolean method6398() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;J)V"
	)
	public void method6491(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3715 = new class170();
			if (!this.field3715.method3365(var1, var2)) {
				this.field3715 = null;
			} else {
				if (this.field3775 == null || this.field3752 == null) {
					this.method6529();
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;I)V",
		garbageValue = "1047552277"
	)
	public void method6467(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3715 = new class170();
			this.field3715.method3383(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-11260"
	)
	void method6529() {
		this.field3775 = new HashMap();
		this.field3752 = new HashMap();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1873888023"
	)
	public void method6443(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3775 == null) {
				this.method6529();
			}

			this.field3775.put(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1531233902"
	)
	public void method6403(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3752 == null) {
				this.method6529();
			}

			this.field3752.put(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "182136505"
	)
	public boolean method6404(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3715 != null && this.method6474()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3715.method3371()[0] * (float)this.width);
			int var6 = (int)(this.field3715.method3371()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3715.method3371()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3715.method3371()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1140949643"
	)
	public boolean method6474() {
		return this.field3760 == 2;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2121469782"
	)
	public int method6406(String var1) {
		return this.type == 11 && this.field3715 != null && this.method6474() ? this.field3715.method3368(var1) : -1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1095190564"
	)
	public String method6407(String var1) {
		return this.type == 11 && this.field3715 != null && this.method6474() ? this.field3715.method3417(var1) : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	public int method6408() {
		return this.field3752 != null && this.field3752.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "47"
	)
	public int method6409() {
		if (this.type == 11 && this.field3715 != null && this.field3752 != null && !this.field3752.isEmpty()) {
			String var1 = this.field3715.method3372();
			return var1 != null && this.field3752.containsKey(this.field3715.method3372()) ? (Integer)this.field3752.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "11076"
	)
	public String method6410() {
		if (this.type == 11 && this.field3715 != null) {
			String var1 = this.field3715.method3372();
			Iterator var2 = this.field3715.method3374().iterator();

			while (var2.hasNext()) {
				class181 var3 = (class181)var2.next();
				String var4 = String.format("%%%S%%", var3.method3516());
				if (var3.vmethod3528() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3527()));
				} else {
					var1.replaceAll(var4, var3.vmethod3518());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2142205826"
	)
	public int[] method6424() {
		if (this.type == 11 && this.field3715 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3715.method3374().iterator();

			while (var3.hasNext()) {
				class181 var4 = (class181)var3.next();
				if (!var4.method3516().equals("user_id")) {
					if (var4.vmethod3528() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3527();
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lev;B)Z",
		garbageValue = "84"
	)
	public boolean method6454(UrlRequester var1) {
		if (this.type == 11 && this.field3715 != null) {
			this.field3715.method3413(var1);
			if (this.field3715.method3367() != this.field3760) {
				this.field3760 = this.field3715.method3367();
				if (this.field3760 >= 100) {
					return true;
				}

				if (this.field3760 == 2) {
					this.method6413();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "757418391"
	)
	void method6413() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3715.method3370();
		ArrayList var2 = this.field3715.method3418();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;

		Iterator var5;
		float[] var9;
		Widget var10;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var10) {
			class176 var6 = (class176)var5.next();
			var9 = var6.field1880;
			var10 = new Widget();
			var10.type = 5;
			var10.parentId = this.id;
			var10.childIndex = var4;
			var10.isIf3 = true;
			var10.xAlignment = 0;
			var10.yAlignment = 0;
			var10.widthAlignment = 0;
			var10.heightAlignment = 0;
			var10.rawX = (int)(var9[0] * (float)this.width);
			var10.rawY = (int)(var9[1] * (float)this.height);
			var10.rawWidth = (int)(var9[2] * (float)this.width);
			var10.rawHeight = (int)((float)this.height * var9[3]);
			var10.field3683 = var6.field1879.method2848();
			class326 var11 = new class326(var6.field1879);
			field3642.method7782(var10.field3683, var11);
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var10) {
			class177 var12 = (class177)var5.next();
			var9 = var12.field1885;
			var10 = new Widget();
			var10.type = 4;
			var10.parentId = this.id;
			var10.childIndex = var4;
			var10.isIf3 = true;
			var10.xAlignment = 0;
			var10.yAlignment = 0;
			var10.widthAlignment = 0;
			var10.heightAlignment = 0;
			var10.rawX = (int)(var9[0] * (float)this.width);
			var10.rawY = (int)(var9[1] * (float)this.height);
			var10.rawWidth = (int)((float)this.width * var9[2]);
			var10.rawHeight = (int)(var9[3] * (float)this.height);
			var10.text = var12.field1892;
			var10.fontId = (Integer)this.field3775.get(var12.field1884);
			var10.textXAlignment = var12.field1886;
			var10.textYAlignment = var12.field1887;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	public void method6414() {
		this.field3726 = new class327();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3726.field3566.method394(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3726.field3566.method419(var2, 0);
		}

		this.field3726.field3566.method419('\u0080', 0);
		this.field3726.field3566.method394(82, 2);
		this.field3726.field3566.method394(81, 2);
		this.field3726.field3566.method394(86, 2);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Lmb;",
		garbageValue = "-14"
	)
	public class329 method6532() {
		return this.field3726 != null ? this.field3726.field3563 : null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Lml;",
		garbageValue = "25"
	)
	public class324 method6416() {
		return this.field3726 != null ? this.field3726.field3561 : null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "1077698230"
	)
	public class27 method6401() {
		return this.field3726 != null ? this.field3726.field3566 : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lmp;",
		garbageValue = "-1932900136"
	)
	public class327 method6418() {
		return this.field3726;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)Z",
		garbageValue = "1"
	)
	boolean method6419(class329 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method6290(class157.method3260(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method6109(class157.method3260(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1006338343"
	)
	public boolean method6420() {
		class329 var1 = this.method6532();
		if (var1 == null) {
			return false;
		} else {
			boolean var2 = false;
			if (!var1.method6162() && this.fontId != -1) {
				int var3 = var1.method6163();
				int var4 = var1.method6286();
				int var5 = var1.method6161();
				int var6 = var1.method6160();
				Font var7 = this.getFont();
				if (var7 != null) {
					var2 |= var1.method6110(var7);
					var2 |= this.method6419(var1);
					var2 |= var1.method6115(var3, var4);
					var2 |= var1.method6130(var5, var6);
				}
			} else if (var1.method6162()) {
				var2 |= this.method6419(var1);
			}

			var1.method6105();
			return var2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1138526298"
	)
	public static int method6533(int var0, int var1, int var2) {
		int var3 = Projectile.method2147(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
