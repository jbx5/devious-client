import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static class363 field3390;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static class363 field3391;
	@ObfuscatedName("ai")
	public static boolean field3392;
	@ObfuscatedName("an")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -872148407
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1302105045
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1424425987
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1079768261
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -385248607
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 76832509
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -336749999
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -6042807
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 748787069
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1340832997
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -224630227
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1316945297
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1864685279
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1848689675
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1870214605
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1859270101
	)
	@Export("width")
	public int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1842398077
	)
	@Export("height")
	public int height;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1203830783
	)
	public int field3411;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -335581981
	)
	public int field3412;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -907421573
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bw")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 351052235
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1379340147
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1613861837
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1133487529
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -514145177
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1152174539
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1678515983
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1533963941
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bp")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1888244299
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -120044031
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -774766751
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bx")
	public boolean field3434;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -549762913
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -593850039
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("ba")
	public String field3542;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1360508359
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bb")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -713045717
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 309573565
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bq")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bu")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1625304481
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1472154217
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1266121497
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1660554345
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1441681381
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1396837651
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 180404177
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1481933279
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -273944037
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1761894939
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -690957751
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1283273139
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 960101041
	)
	public int field3446;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -188016529
	)
	public int field3451;
	@ObfuscatedName("co")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("ca")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1142237273
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1783725171
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cp")
	@Export("text")
	public String text;
	@ObfuscatedName("ck")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1637572651
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1303153635
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1821739889
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cs")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1609810309
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -929653633
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cm")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("db")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("df")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("du")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	class156 field3468;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -2000944087
	)
	int field3469;
	@ObfuscatedName("dr")
	HashMap field3474;
	@ObfuscatedName("dq")
	HashMap field3471;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1869794395
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dg")
	public boolean field3395;
	@ObfuscatedName("dz")
	public byte[][] field3464;
	@ObfuscatedName("dx")
	public byte[][] field3475;
	@ObfuscatedName("dj")
	public int[] field3417;
	@ObfuscatedName("dk")
	public int[] field3477;
	@ObfuscatedName("dn")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dy")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1881898887
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 681403879
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dd")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("de")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ds")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ee")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ea")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("eo")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ei")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ek")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("es")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ep")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ez")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ex")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("eg")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ed")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ey")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("eu")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("eb")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("en")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ej")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("em")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ef")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("et")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("er")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("eq")
	public Object[] field3506;
	@ObfuscatedName("ec")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ew")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ev")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("el")
	public Object[] field3528;
	@ObfuscatedName("eh")
	public Object[] field3511;
	@ObfuscatedName("fc")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fr")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fg")
	public Object[] field3526;
	@ObfuscatedName("fv")
	public Object[] field3431;
	@ObfuscatedName("fm")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fl")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fn")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fp")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fj")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fk")
	public Object[] field3452;
	@ObfuscatedName("ff")
	public Object[] field3522;
	@ObfuscatedName("fx")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fi")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fq")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = -520101461
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fh")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fb")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fa")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fd")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -1521175997
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -331325251
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -80689241
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -2013275675
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "[Lkw;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ft")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fz")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 344012705
	)
	public int field3538;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -347947965
	)
	public int field3539;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 797537099
	)
	public int field3540;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 252070443
	)
	public int field3541;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -6211289
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 2017099089
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gk")
	public int[] field3544;
	@ObfuscatedName("gw")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gd")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gj")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 52
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 53
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 54
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 55
		field3390 = new class363(10, class361.field4300); // L: 56
		field3391 = new class363(10, class361.field4300); // L: 57
		field3392 = false; // L: 58
	}

	public Widget() {
		this.isIf3 = false; // L: 59
		this.id = -1; // L: 60
		this.childIndex = -1; // L: 61
		this.buttonType = 0; // L: 63
		this.contentType = 0; // L: 64
		this.xAlignment = 0; // L: 65
		this.yAlignment = 0; // L: 66
		this.widthAlignment = 0; // L: 67
		this.heightAlignment = 0; // L: 68
		this.rawX = 0; // L: 69
		this.rawY = 0; // L: 70
		this.rawWidth = 0; // L: 71
		this.rawHeight = 0; // L: 72
		this.x = 0; // L: 73
		this.y = 0; // L: 74
		this.width = 0; // L: 75
		this.height = 0; // L: 76
		this.field3411 = 1; // L: 77
		this.field3412 = 1; // L: 78
		this.parentId = -1; // L: 79
		this.isHidden = false; // L: 80
		this.scrollX = 0; // L: 81
		this.scrollY = 0; // L: 82
		this.scrollWidth = 0; // L: 83
		this.scrollHeight = 0; // L: 84
		this.color = 0; // L: 85
		this.color2 = 0; // L: 86
		this.mouseOverColor = 0; // L: 87
		this.mouseOverColor2 = 0; // L: 88
		this.fill = false; // L: 89
		this.fillMode = FillMode.SOLID; // L: 90
		this.transparencyTop = 0; // L: 91
		this.transparencyBot = 0; // L: 92
		this.lineWid = 1; // L: 93
		this.field3434 = false; // L: 94
		this.spriteId2 = -1; // L: 95
		this.spriteId = -1; // L: 96
		this.spriteAngle = 0; // L: 98
		this.spriteTiling = false; // L: 99
		this.outline = 0; // L: 100
		this.spriteShadow = 0; // L: 101
		this.modelType = 1; // L: 104
		this.modelId = -1; // L: 105
		this.modelType2 = 1; // L: 106
		this.modelId2 = -1; // L: 107
		this.sequenceId = -1; // L: 108
		this.sequenceId2 = -1; // L: 109
		this.modelOffsetX = 0; // L: 110
		this.modelOffsetY = 0; // L: 111
		this.modelAngleX = 0; // L: 112
		this.modelAngleY = 0; // L: 113
		this.modelAngleZ = 0; // L: 114
		this.modelZoom = 100; // L: 115
		this.field3446 = 0; // L: 116
		this.field3451 = 0; // L: 117
		this.modelOrthog = false; // L: 118
		this.modelTransparency = false; // L: 119
		this.itemQuantityMode = 2; // L: 120
		this.fontId = -1; // L: 121
		this.text = ""; // L: 122
		this.text2 = ""; // L: 123
		this.textLineHeight = 0; // L: 124
		this.textXAlignment = 0; // L: 125
		this.textYAlignment = 0; // L: 126
		this.textShadowed = false; // L: 127
		this.paddingX = 0; // L: 128
		this.paddingY = 0; // L: 129
		this.field3469 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3395 = false; // L: 140
		this.dataText = ""; // L: 149
		this.parent = null; // L: 151
		this.dragZoneSize = 0; // L: 152
		this.dragThreshold = 0; // L: 153
		this.isScrollBar = false; // L: 154
		this.spellActionName = ""; // L: 155
		this.hasListener = false; // L: 156
		this.mouseOverRedirect = -1; // L: 197
		this.spellName = ""; // L: 198
		this.buttonText = "Ok"; // L: 199
		this.itemId = -1; // L: 202
		this.itemQuantity = 0; // L: 203
		this.modelFrame = 0; // L: 204
		this.modelFrameCycle = 0; // L: 205
		this.containsMouse = false; // L: 207
		this.isClicked = false; // L: 208
		this.field3538 = -1; // L: 209
		this.field3539 = 0; // L: 210
		this.field3540 = 0; // L: 211
		this.field3541 = 0; // L: 212
		this.rootIndex = -1; // L: 213
		this.cycle = -1; // L: 214
		this.noClickThrough = false; // L: 216
		this.noScrollThrough = false; // L: 217
		this.prioritizeMenuEntry = false; // L: 218
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-2096660554"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 278
		this.type = var1.readUnsignedByte(); // L: 279
		this.buttonType = var1.readUnsignedByte(); // L: 280
		this.contentType = var1.readUnsignedShort(); // L: 281
		this.rawX = var1.readShort(); // L: 282
		this.rawY = var1.readShort(); // L: 283
		this.rawWidth = var1.readUnsignedShort(); // L: 284
		this.rawHeight = var1.readUnsignedShort(); // L: 285
		this.transparencyTop = var1.readUnsignedByte(); // L: 286
		this.parentId = var1.readUnsignedShort(); // L: 287
		if (this.parentId == 65535) { // L: 288
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 289
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 290
		if (this.mouseOverRedirect == 65535) { // L: 291
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 292
		int var3;
		if (var2 > 0) { // L: 293
			this.cs1Comparisons = new int[var2]; // L: 294
			this.cs1ComparisonValues = new int[var2]; // L: 295

			for (var3 = 0; var3 < var2; ++var3) { // L: 296
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 297
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 298
			}
		}

		var3 = var1.readUnsignedByte(); // L: 301
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 302
			this.cs1Instructions = new int[var3][]; // L: 303

			for (var4 = 0; var4 < var3; ++var4) { // L: 304
				var5 = var1.readUnsignedShort(); // L: 305
				this.cs1Instructions[var4] = new int[var5]; // L: 306

				for (var6 = 0; var6 < var5; ++var6) { // L: 307
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 308
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 309
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 313
			this.scrollHeight = var1.readUnsignedShort(); // L: 314
			this.isHidden = var1.readUnsignedByte() == 1; // L: 315
		}

		if (this.type == 1) { // L: 317
			var1.readUnsignedShort(); // L: 318
			var1.readUnsignedByte(); // L: 319
		}

		if (this.type == 2) { // L: 321
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 322
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 323
			var4 = var1.readUnsignedByte(); // L: 324
			if (var4 == 1) { // L: 325
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 326
			if (var5 == 1) { // L: 327
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 328
			if (var6 == 1) { // L: 329
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 330
			if (var7 == 1) { // L: 331
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 332
			this.paddingY = var1.readUnsignedByte(); // L: 333
			this.inventoryXOffsets = new int[20]; // L: 334
			this.inventoryYOffsets = new int[20]; // L: 335
			this.inventorySprites = new int[20]; // L: 336

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 337
				int var11 = var1.readUnsignedByte(); // L: 338
				if (var11 == 1) { // L: 339
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 340
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 341
					this.inventorySprites[var8] = var1.readInt(); // L: 342
				} else {
					this.inventorySprites[var8] = -1; // L: 344
				}
			}

			this.itemActions = new String[5]; // L: 346

			for (var8 = 0; var8 < 5; ++var8) { // L: 347
				String var9 = var1.readStringCp1252NullTerminated(); // L: 348
				if (var9.length() > 0) { // L: 349
					this.itemActions[var8] = var9; // L: 350
					this.flags |= 1 << var8 + 23; // L: 351
				}
			}
		}

		if (this.type == 3) { // L: 355
			this.fill = var1.readUnsignedByte() == 1; // L: 356
		}

		if (this.type == 4 || this.type == 1) { // L: 358
			this.textXAlignment = var1.readUnsignedByte(); // L: 359
			this.textYAlignment = var1.readUnsignedByte(); // L: 360
			this.textLineHeight = var1.readUnsignedByte(); // L: 361
			this.fontId = var1.readUnsignedShort(); // L: 362
			if (this.fontId == 65535) { // L: 363
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 364
		}

		if (this.type == 4) { // L: 366
			this.text = var1.readStringCp1252NullTerminated(); // L: 367
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 368
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 370
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 371
			this.color2 = var1.readInt(); // L: 372
			this.mouseOverColor = var1.readInt(); // L: 373
			this.mouseOverColor2 = var1.readInt(); // L: 374
		}

		if (this.type == 5) { // L: 376
			this.spriteId2 = var1.readInt(); // L: 377
			this.spriteId = var1.readInt(); // L: 378
		}

		if (this.type == 6) { // L: 380
			this.modelType = 1; // L: 381
			this.modelId = var1.readUnsignedShort(); // L: 382
			if (this.modelId == 65535) { // L: 383
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 384
			this.modelId2 = var1.readUnsignedShort(); // L: 385
			if (this.modelId2 == 65535) { // L: 386
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 387
			if (this.sequenceId == 65535) { // L: 388
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 389
			if (this.sequenceId2 == 65535) { // L: 390
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 391
			this.modelAngleX = var1.readUnsignedShort(); // L: 392
			this.modelAngleY = var1.readUnsignedShort(); // L: 393
		}

		if (this.type == 7) { // L: 395
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 396
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 397
			this.textXAlignment = var1.readUnsignedByte(); // L: 398
			this.fontId = var1.readUnsignedShort(); // L: 399
			if (this.fontId == 65535) { // L: 400
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 401
			this.color = var1.readInt(); // L: 402
			this.paddingX = var1.readShort(); // L: 403
			this.paddingY = var1.readShort(); // L: 404
			var4 = var1.readUnsignedByte(); // L: 405
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 406
			}

			this.itemActions = new String[5]; // L: 407

			for (var5 = 0; var5 < 5; ++var5) { // L: 408
				String var10 = var1.readStringCp1252NullTerminated(); // L: 409
				if (var10.length() > 0) { // L: 410
					this.itemActions[var5] = var10; // L: 411
					this.flags |= 1 << var5 + 23; // L: 412
				}
			}
		}

		if (this.type == 8) { // L: 416
			this.text = var1.readStringCp1252NullTerminated(); // L: 417
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 419
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 420
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 421
			var4 = var1.readUnsignedShort() & 63; // L: 422
			this.flags |= var4 << 11; // L: 423
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 425
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 426
			if (this.buttonText.length() == 0) { // L: 427
				if (this.buttonType == 1) { // L: 428
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 429
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 430
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 431
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 434
			this.flags |= 4194304; // L: 435
		}

		if (this.buttonType == 6) { // L: 437
			this.flags |= 1; // L: 438
		}

	} // L: 440

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1665961094"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 443
		this.isIf3 = true; // L: 444
		this.type = var1.readUnsignedByte(); // L: 445
		this.contentType = var1.readUnsignedShort(); // L: 446
		this.rawX = var1.readShort(); // L: 447
		this.rawY = var1.readShort(); // L: 448
		this.rawWidth = var1.readUnsignedShort(); // L: 449
		if (this.type == 9) { // L: 450
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 451
		}

		this.widthAlignment = var1.readByte(); // L: 452
		this.heightAlignment = var1.readByte(); // L: 453
		this.xAlignment = var1.readByte(); // L: 454
		this.yAlignment = var1.readByte(); // L: 455
		this.parentId = var1.readUnsignedShort(); // L: 456
		if (this.parentId == 65535) { // L: 457
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 458
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 459
		if (this.type == 0) { // L: 460
			this.scrollWidth = var1.readUnsignedShort(); // L: 461
			this.scrollHeight = var1.readUnsignedShort(); // L: 462
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 463
		}

		if (this.type == 5) { // L: 465
			this.spriteId2 = var1.readInt(); // L: 466
			this.spriteAngle = var1.readUnsignedShort(); // L: 467
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 468
			this.transparencyTop = var1.readUnsignedByte(); // L: 469
			this.outline = var1.readUnsignedByte(); // L: 470
			this.spriteShadow = var1.readInt(); // L: 471
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 472
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 473
		}

		if (this.type == 6) { // L: 475
			this.modelType = 1; // L: 476
			this.modelId = var1.readUnsignedShort(); // L: 477
			if (this.modelId == 65535) { // L: 478
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 479
			this.modelOffsetY = var1.readShort(); // L: 480
			this.modelAngleX = var1.readUnsignedShort(); // L: 481
			this.modelAngleY = var1.readUnsignedShort(); // L: 482
			this.modelAngleZ = var1.readUnsignedShort(); // L: 483
			this.modelZoom = var1.readUnsignedShort(); // L: 484
			this.sequenceId = var1.readUnsignedShort(); // L: 485
			if (this.sequenceId == 65535) { // L: 486
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 487
			var1.readUnsignedShort(); // L: 488
			if (this.widthAlignment != 0) { // L: 489
				this.field3446 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 490
				var1.readUnsignedShort(); // L: 491
			}
		}

		if (this.type == 4) { // L: 494
			this.fontId = var1.readUnsignedShort(); // L: 495
			if (this.fontId == 65535) { // L: 496
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 497
			this.textLineHeight = var1.readUnsignedByte(); // L: 498
			this.textXAlignment = var1.readUnsignedByte(); // L: 499
			this.textYAlignment = var1.readUnsignedByte(); // L: 500
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 501
			this.color = var1.readInt(); // L: 502
		}

		if (this.type == 3) { // L: 504
			this.color = var1.readInt(); // L: 505
			this.fill = var1.readUnsignedByte() == 1; // L: 506
			this.transparencyTop = var1.readUnsignedByte(); // L: 507
		}

		if (this.type == 9) { // L: 509
			this.lineWid = var1.readUnsignedByte(); // L: 510
			this.color = var1.readInt(); // L: 511
			this.field3434 = var1.readUnsignedByte() == 1; // L: 512
		}

		this.flags = var1.readMedium(); // L: 514
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 515
		int var2 = var1.readUnsignedByte(); // L: 516
		if (var2 > 0) { // L: 517
			this.actions = new String[var2]; // L: 518

			for (int var3 = 0; var3 < var2; ++var3) { // L: 519
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 521
		this.dragThreshold = var1.readUnsignedByte(); // L: 522
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 523
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 524
		this.onLoad = this.readListener(var1); // L: 525
		this.onMouseOver = this.readListener(var1); // L: 526
		this.onMouseLeave = this.readListener(var1); // L: 527
		this.onTargetLeave = this.readListener(var1); // L: 528
		this.onTargetEnter = this.readListener(var1); // L: 529
		this.onVarTransmit = this.readListener(var1); // L: 530
		this.onInvTransmit = this.readListener(var1); // L: 531
		this.onStatTransmit = this.readListener(var1); // L: 532
		this.onTimer = this.readListener(var1); // L: 533
		this.onOp = this.readListener(var1); // L: 534
		this.onMouseRepeat = this.readListener(var1); // L: 535
		this.onClick = this.readListener(var1); // L: 536
		this.onClickRepeat = this.readListener(var1); // L: 537
		this.onRelease = this.readListener(var1); // L: 538
		this.onHold = this.readListener(var1); // L: 539
		this.onDrag = this.readListener(var1); // L: 540
		this.onDragComplete = this.readListener(var1); // L: 541
		this.onScroll = this.readListener(var1); // L: 542
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 543
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 544
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 545
	} // L: 546

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)[Ljava/lang/Object;",
		garbageValue = "-120"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 549
		if (var2 == 0) { // L: 550
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 551

			for (int var4 = 0; var4 < var2; ++var4) { // L: 552
				int var5 = var1.readUnsignedByte(); // L: 553
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 554
				} else if (var5 == 1) { // L: 555
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 557
			return var3; // L: 558
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)[I",
		garbageValue = "8"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 562
		if (var2 == 0) { // L: 563
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 564

			for (int var4 = 0; var4 < var2; ++var4) { // L: 565
				var3[var4] = var1.readInt(); // L: 566
			}

			return var3; // L: 568
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "78"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 572
		this.itemIds[var2] = this.itemIds[var1]; // L: 573
		this.itemIds[var1] = var3; // L: 574
		var3 = this.itemQuantities[var2]; // L: 575
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 576
		this.itemQuantities[var1] = var3; // L: 577
	} // L: 578

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZLch;I)Lqi;",
		garbageValue = "-1268256056"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3392 = false; // L: 581
		if (this.field3542 != null) { // L: 582
			SpritePixels var3 = this.method5776(var2); // L: 583
			if (var3 != null) { // L: 584
				return var3; // L: 585
			}
		}

		int var7;
		if (var1) { // L: 589
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 590
		}

		if (var7 == -1) { // L: 591
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var7 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40); // L: 592
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 593
			if (var6 != null) { // L: 594
				return var6;
			} else {
				var6 = class114.SpriteBuffer_getSprite(Widget_spritesArchive, var7, 0); // L: 595
				if (var6 == null) { // L: 596
					field3392 = true; // L: 597
					return null; // L: 598
				} else {
					this.method5779(var6); // L: 600
					Widget_cachedSprites.put(var6, var4); // L: 601
					return var6; // L: 602
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)Lqi;",
		garbageValue = "1294494257"
	)
	SpritePixels method5776(UrlRequester var1) {
		if (!this.method5778()) { // L: 606
			return this.method5804(var1); // L: 607
		} else {
			String var2 = this.field3542 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 609
			SpritePixels var3 = (SpritePixels)field3391.method6758(var2); // L: 610
			if (var3 == null) { // L: 611
				SpritePixels var4 = this.method5804(var1); // L: 612
				if (var4 != null) { // L: 613
					var3 = var4.method8334(); // L: 614
					this.method5779(var3); // L: 615
					field3391.method6750(var2, var3); // L: 616
				}
			}

			return var3; // L: 619
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lch;B)Lqi;",
		garbageValue = "-82"
	)
	SpritePixels method5804(UrlRequester var1) {
		if (this.field3542 != null && var1 != null) { // L: 623
			class292 var2 = (class292)field3390.method6758(this.field3542); // L: 624
			if (var2 == null) { // L: 625
				var2 = new class292(this.field3542, var1); // L: 626
				field3390.method6750(this.field3542, var2); // L: 627
			}

			return var2.method5722(); // L: 629
		} else {
			return null; // L: 631
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "42"
	)
	boolean method5778() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 635
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "-49711267"
	)
	void method5779(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 639
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 640
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 641
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 642
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 643
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 644
			var1.shadow(this.spriteShadow);
		}

	} // L: 645

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lmv;",
		garbageValue = "1537813946"
	)
	@Export("getFont")
	public Font getFont() {
		field3392 = false; // L: 648
		if (this.fontId == -1) { // L: 649
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 650
			if (var1 != null) { // L: 651
				return var1;
			} else {
				var1 = class448.method8182(Widget_spritesArchive, class161.Widget_fontsArchive, this.fontId, 0); // L: 652
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 653
				} else {
					field3392 = true; // L: 654
				}

				return var1; // L: 655
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IS)Lqi;",
		garbageValue = "16843"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3392 = false; // L: 659
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 660
			int var2 = this.inventorySprites[var1]; // L: 661
			if (var2 == -1) { // L: 662
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 663
				if (var3 != null) { // L: 664
					return var3;
				} else {
					var3 = class114.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0); // L: 665
					if (var3 != null) { // L: 666
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3392 = true; // L: 667
					}

					return var3; // L: 668
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IZLke;B)Lha;",
		garbageValue = "75"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3392 = false; // L: 672
		int var5;
		int var6;
		if (var3) { // L: 675
			var5 = this.modelType2; // L: 676
			var6 = this.modelId2; // L: 677
		} else {
			var5 = this.modelType; // L: 680
			var6 = this.modelId; // L: 681
		}

		if (var5 == 0) { // L: 683
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 684
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 685
			if (var7 == null) { // L: 686
				ModelData var8;
				if (var5 == 1) { // L: 688
					var8 = ModelData.ModelData_get(WorldMapSection2.Widget_modelsArchive, var6, 0); // L: 689
					if (var8 == null) { // L: 690
						field3392 = true; // L: 691
						return null; // L: 692
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 694
				}

				if (var5 == 2) { // L: 696
					var8 = class193.getNpcDefinition(var6).getModelData(); // L: 697
					if (var8 == null) { // L: 698
						field3392 = true; // L: 699
						return null; // L: 700
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 702
				}

				if (var5 == 3) { // L: 704
					if (var4 == null) { // L: 705
						return null;
					}

					var8 = var4.getModelData(); // L: 706
					if (var8 == null) { // L: 707
						field3392 = true; // L: 708
						return null; // L: 709
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 711
				}

				if (var5 == 4) { // L: 713
					ItemComposition var9 = UserComparator3.ItemDefinition_get(var6); // L: 714
					var8 = var9.getModelData(10); // L: 715
					if (var8 == null) { // L: 716
						field3392 = true; // L: 717
						return null; // L: 718
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 720
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 722
			}

			if (var1 != null) { // L: 724
				var7 = var1.transformWidgetModel(var7, var2); // L: 725
			}

			return var7; // L: 727
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lko;",
		garbageValue = "1"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 731
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 732
		if (var2 == -1) { // L: 733
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 734
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 735
			if (var5 != null) { // L: 736
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 737
				if (var6 == null) { // L: 738
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 739
					int[] var8 = new int[var7.subHeight]; // L: 740
					int[] var9 = new int[var7.subHeight]; // L: 741

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 742
						int var11 = 0; // L: 743
						int var12 = var7.subWidth; // L: 744

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 745
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 746
								var11 = var13; // L: 747
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 751
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 752
								var12 = var13 + 1; // L: 753
								break;
							}
						}

						var8[var10] = var11; // L: 757
						var9[var10] = var12 - var11; // L: 758
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 760
					Widget_cachedSpriteMasks.put(var5, var3); // L: 761
					return var5; // L: 762
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1562946903"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 773
			String[] var3 = new String[var1 + 1]; // L: 774
			if (this.actions != null) { // L: 775
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 776
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 778
		}

		this.actions[var1] = var2; // L: 780
	} // L: 781

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-735217152"
	)
	public boolean method5784() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 784
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lch;J)V"
	)
	public void method5821(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 788
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 789
			this.field3468 = new class156(); // L: 790
			if (!this.field3468.method3374(var1, var2)) { // L: 791
				this.field3468 = null; // L: 792
			} else {
				if (this.field3474 == null || this.field3471 == null) { // L: 795
					this.method5796(); // L: 796
				}

			}
		}
	} // L: 793 798

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "973241705"
	)
	void method5796() {
		this.field3474 = new HashMap(); // L: 801
		this.field3471 = new HashMap(); // L: 802
	} // L: 803

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1326660346"
	)
	public void method5873(int var1, int var2) {
		if (this.type == 11) { // L: 806
			if (this.field3474 == null) { // L: 807
				this.method5796();
			}

			this.field3474.put(var1, var2); // L: 808
		}
	} // L: 809

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-85"
	)
	public void method5788(String var1, int var2) {
		if (this.type == 11) { // L: 812
			if (this.field3471 == null) { // L: 813
				this.method5796();
			}

			this.field3471.put(var1, var2); // L: 814
		}
	} // L: 815

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "-67"
	)
	public boolean method5789(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3468 != null && this.method5790()) { // L: 818
			var1 -= var3; // L: 819
			var2 -= var4; // L: 820
			int var5 = (int)(this.field3468.method3352()[0] * (float)this.width); // L: 821
			int var6 = (int)(this.field3468.method3352()[1] * (float)this.height); // L: 822
			int var7 = var5 + (int)(this.field3468.method3352()[2] * (float)this.width); // L: 823
			int var8 = var6 + (int)(this.field3468.method3352()[3] * (float)this.height); // L: 824
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 825
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "469209429"
	)
	public boolean method5790() {
		return this.field3469 == 2; // L: 829
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "87"
	)
	public int method5866(String var1) {
		return this.type == 11 && this.field3468 != null && this.method5790() ? this.field3468.method3347(var1) : -1; // L: 833 834 836
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "48"
	)
	public String method5792(String var1) {
		return this.type == 11 && this.field3468 != null && this.method5790() ? this.field3468.method3398(var1) : null; // L: 840 841
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-570234230"
	)
	public int method5817() {
		return this.field3471 != null && this.field3471.size() > 0 ? 1 : 0; // L: 845
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1880183811"
	)
	public int method5839() {
		if (this.type == 11 && this.field3468 != null && this.field3471 != null && !this.field3471.isEmpty()) { // L: 849
			String var1 = this.field3468.method3408(); // L: 850
			return var1 != null && this.field3471.containsKey(this.field3468.method3408()) ? (Integer)this.field3471.get(var1) : -1; // L: 851 852 854
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2146158160"
	)
	public String method5815() {
		if (this.type == 11 && this.field3468 != null) { // L: 858
			String var1 = this.field3468.method3408(); // L: 859
			Iterator var2 = this.field3468.method3353().iterator(); // L: 860

			while (var2.hasNext()) {
				class166 var3 = (class166)var2.next(); // L: 861
				String var4 = String.format("%%%S%%", var3.method3493()); // L: 863
				if (var3.vmethod3480() == 0) { // L: 864
					var1.replaceAll(var4, Integer.toString(var3.vmethod3482())); // L: 865
				} else {
					var1.replaceAll(var4, var3.vmethod3481()); // L: 868
				}
			}

			return var1; // L: 872
		} else {
			return null; // L: 871
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-363622433"
	)
	public int[] method5835() {
		if (this.type == 11 && this.field3468 != null) { // L: 876
			int[] var1 = new int[3]; // L: 877
			int var2 = 0; // L: 878
			Iterator var3 = this.field3468.method3353().iterator(); // L: 879

			while (var3.hasNext()) {
				class166 var4 = (class166)var3.next(); // L: 880
				if (!var4.method3493().equals("user_id")) { // L: 882
					if (var4.vmethod3480() != 0) { // L: 883
						return null; // L: 890
					}

					var1[var2++] = var4.vmethod3482(); // L: 884
					if (var2 > 3) { // L: 885
						return null; // L: 886
					}
				}
			}

			return var1; // L: 895
		} else {
			return null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)Z",
		garbageValue = "1643948657"
	)
	public boolean method5827(UrlRequester var1) {
		if (this.type == 11 && this.field3468 != null) { // L: 899
			this.field3468.method3345(var1); // L: 900
			if (this.field3468.method3346() != this.field3469) { // L: 901
				this.field3469 = this.field3468.method3346(); // L: 902
				if (this.field3469 >= 100) { // L: 903
					return true; // L: 904
				}

				if (this.field3469 == 2) { // L: 906
					this.method5798(); // L: 907
					return true; // L: 908
				}
			}

			return false; // L: 911
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1552850127"
	)
	void method5798() {
		this.noClickThrough = true; // L: 932
		ArrayList var1 = this.field3468.method3369(); // L: 933
		ArrayList var2 = this.field3468.method3350(); // L: 934
		int var3 = var1.size() + var2.size(); // L: 935
		this.children = new Widget[var3]; // L: 936
		int var4 = 0; // L: 937

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 938 945
			class161 var6 = (class161)var5.next(); // L: 939
			var7 = DirectByteArrayCopier.method5686(5, this, var4, 0, 0, 0, 0, var6.field1781); // L: 941
			var7.field3542 = var6.field1786.method2714(); // L: 942
			class292 var8 = new class292(var6.field1786); // L: 943
			field3390.method6750(var7.field3542, var8); // L: 944
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 948 956
			class162 var9 = (class162)var5.next(); // L: 949
			var7 = DirectByteArrayCopier.method5686(4, this, var4, 0, 0, 0, 0, var9.field1791); // L: 951
			var7.text = var9.field1788; // L: 952
			var7.fontId = (Integer)this.field3474.get(var9.field1794); // L: 953
			var7.textXAlignment = var9.field1792; // L: 954
			var7.textYAlignment = var9.field1793; // L: 955
		}

	} // L: 959

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1977094126"
	)
	static final boolean method5882() {
		return Client.isMenuOpen; // L: 8176
	}
}
