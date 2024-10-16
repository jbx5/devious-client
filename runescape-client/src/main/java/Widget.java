import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ah")
	public static boolean field3875;
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("bh")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1736739607
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 597146807
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bx")
	String field3879;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1973680119
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1354133971
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 542190393
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 388874303
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1770630253
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 945605287
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1413589627
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1122739613
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1906431453
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1248179857
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 260263849
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1305260519
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2100532037
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 2013768333
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1662542495
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -119188655
	)
	public int field4006;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1660101529
	)
	public int field3970;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 53502319
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bf")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 336181451
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -291221237
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1378813425
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1283703355
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 530370357
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1613644311
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2017721573
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2031301405
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("co")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1531197233
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -821846975
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 476018697
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cy")
	public boolean field3912;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -938817471
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1464756089
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cg")
	public String field3915;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 673492255
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cz")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -50127387
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1963691659
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cc")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cj")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1494743407
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1217043121
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 302087341
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1149805199
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1952468209
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -538809757
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 718120747
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 844084469
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1427564929
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1468148137
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1507254525
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -893848959
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -795851991
	)
	public int field3923;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1573893941
	)
	public int field3905;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public PlayerComposition field3936;
	@ObfuscatedName("dk")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dl")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 300898295
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -271969313
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dx")
	@Export("text")
	public String text;
	@ObfuscatedName("ds")
	@Export("text2")
	public String text2;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1693441243
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1903196495
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1823337267
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dp")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dy")
	int[] field3947;
	@ObfuscatedName("do")
	int[] field4010;
	@ObfuscatedName("dw")
	int[] field3949;
	@ObfuscatedName("de")
	String[] field3950;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class216 field3951;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -329883961
	)
	int field3952;
	@ObfuscatedName("dn")
	HashMap field3953;
	@ObfuscatedName("eg")
	HashMap field3896;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	class357 field3955;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 138354159
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ey")
	public boolean field3957;
	@ObfuscatedName("ec")
	public byte[][] field3958;
	@ObfuscatedName("ek")
	public byte[][] field3959;
	@ObfuscatedName("er")
	public int[] field3995;
	@ObfuscatedName("en")
	public int[] field3961;
	@ObfuscatedName("ex")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ej")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ei")
	public String[][] field3964;
	@ObfuscatedName("ew")
	public int field3925;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -2034538947
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1344312561
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("es")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eo")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ee")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ea")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("et")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fu")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fo")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fa")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fj")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fw")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fp")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fh")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fv")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fl")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fn")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fd")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fm")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fc")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fr")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fe")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ft")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ff")
	public Object[] field3918;
	@ObfuscatedName("fx")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fq")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fk")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fs")
	public Object[] field3916;
	@ObfuscatedName("fz")
	public Object[] field3997;
	@ObfuscatedName("fy")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fi")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gp")
	public Object[] field3965;
	@ObfuscatedName("gl")
	public Object[] field4001;
	@ObfuscatedName("gb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gn")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gd")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gy")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gc")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ga")
	public Object[] field4007;
	@ObfuscatedName("gf")
	public Object[] field3991;
	@ObfuscatedName("gv")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gj")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gg")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 1756145679
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gx")
	public String field4013;
	@ObfuscatedName("gw")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gr")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gm")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -2104795295
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -77256189
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -976353935
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 453816681
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "[Lng;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gt")
	public boolean field4022;
	@ObfuscatedName("gs")
	public boolean field4023;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -1911102447
	)
	public int field4024;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1876660907
	)
	public int field4025;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 1074874915
	)
	public int field4014;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = -1567498573
	)
	public int field3999;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = -114238057
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 906190313
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ha")
	public int[] field4030;
	@ObfuscatedName("ho")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hd")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("he")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3875 = false;
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
		this.field4006 = 1;
		this.field3970 = 1;
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
		this.field3912 = false;
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
		this.field3923 = 0;
		this.field3905 = 0;
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
		this.field3952 = -1;
		this.flags = 0;
		this.field3957 = false;
		this.dataText = "";
		this.field3925 = 237687564;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4013 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4022 = false;
		this.field4023 = false;
		this.field4024 = -1;
		this.field4025 = 0;
		this.field4014 = 0;
		this.field3999 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lng;I)V"
	)
	public Widget(Widget var1, int var2) {
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
		this.field4006 = 1;
		this.field3970 = 1;
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
		this.field3912 = false;
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
		this.field3923 = 0;
		this.field3905 = 0;
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
		this.field3952 = -1;
		this.flags = 0;
		this.field3957 = false;
		this.dataText = "";
		this.field3925 = 237687564;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4013 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4022 = false;
		this.field4023 = false;
		this.field4024 = -1;
		this.field4025 = 0;
		this.field4014 = 0;
		this.field3999 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var2;
		this.field3879 = var1.field3879;
		this.type = var1.type;
		this.buttonType = var1.buttonType;
		this.contentType = var1.contentType;
		this.xAlignment = var1.xAlignment;
		this.yAlignment = var1.yAlignment;
		this.widthAlignment = var1.widthAlignment;
		this.heightAlignment = var1.heightAlignment;
		this.rawX = var1.rawX;
		this.rawY = var1.rawY;
		this.rawWidth = var1.rawWidth;
		this.rawHeight = var1.rawHeight;
		this.x = var1.x;
		this.y = var1.y;
		this.width = var1.width;
		this.height = var1.height;
		this.field4006 = var1.field4006;
		this.field3970 = var1.field3970;
		this.parentId = var1.parentId;
		this.isHidden = var1.isHidden;
		this.scrollX = var1.scrollX;
		this.scrollY = var1.scrollY;
		this.scrollWidth = var1.scrollWidth;
		this.scrollHeight = var1.scrollHeight;
		this.color = var1.color;
		this.color2 = var1.color2;
		this.mouseOverColor = var1.mouseOverColor;
		this.mouseOverColor2 = var1.mouseOverColor2;
		this.fill = var1.fill;
		this.fillMode = var1.fillMode;
		this.transparencyTop = var1.transparencyTop;
		this.transparencyBot = var1.transparencyBot;
		this.lineWid = var1.lineWid;
		this.field3912 = var1.field3912;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field3915 = var1.field3915;
		this.spriteAngle = var1.spriteAngle;
		this.spriteTiling = var1.spriteTiling;
		this.outline = var1.outline;
		this.spriteShadow = var1.spriteShadow;
		this.spriteFlipV = var1.spriteFlipV;
		this.spriteFlipH = var1.spriteFlipH;
		this.modelType = var1.modelType;
		this.modelId = var1.modelId;
		this.modelType2 = var1.modelType2;
		this.modelId2 = var1.modelId2;
		this.sequenceId = var1.sequenceId;
		this.sequenceId2 = var1.sequenceId2;
		this.modelOffsetX = var1.modelOffsetX;
		this.modelOffsetY = var1.modelOffsetY;
		this.modelAngleX = var1.modelAngleX;
		this.modelAngleY = var1.modelAngleY;
		this.modelAngleZ = var1.modelAngleZ;
		this.modelZoom = var1.modelZoom;
		this.field3923 = var1.field3923;
		this.field3905 = var1.field3905;
		if (var1.field3936 != null) {
			this.field3936 = new PlayerComposition(var1.field3936);
		}

		this.modelOrthog = var1.modelOrthog;
		this.modelTransparency = var1.modelTransparency;
		this.itemQuantityMode = var1.itemQuantityMode;
		this.fontId = var1.fontId;
		this.text = var1.text;
		this.text2 = var1.text2;
		this.textLineHeight = var1.textLineHeight;
		this.textXAlignment = var1.textXAlignment;
		this.textYAlignment = var1.textYAlignment;
		this.textShadowed = var1.textShadowed;
		this.field3947 = this.method7346(var1.field3947);
		this.field4010 = this.method7346(var1.field4010);
		this.field3949 = this.method7346(var1.field3949);
		this.field3950 = (String[])((String[])this.method7288(var1.field3950));
		if (var1.field3951 != null) {
			this.field3951 = new class216(var1.field3951);
		}

		this.field3952 = var1.field3952;
		this.field3953 = var1.field3953;
		if (var1.field3896 != null) {
			this.field3896 = new HashMap();
			this.field3896.putAll(var1.field3896);
		}

		this.field3955 = null;
		this.flags = var1.flags;
		this.field3957 = var1.field3957;
		int var3;
		if (var1.field3958 != null) {
			this.field3958 = new byte[var1.field3958.length][];

			for (var3 = 0; var3 < var1.field3958.length; ++var3) {
				this.field3958[var3] = new byte[var1.field3958[var3].length];
				System.arraycopy(var1.field3958[var3], 0, this.field3958[var3], 0, var1.field3958[var3].length);
			}
		}

		if (var1.field3959 != null) {
			this.field3959 = new byte[var1.field3959.length][];

			for (var3 = 0; var3 < var1.field3959.length; ++var3) {
				this.field3959[var3] = new byte[var1.field3959[var3].length];
				System.arraycopy(var1.field3959[var3], 0, this.field3959[var3], 0, var1.field3959[var3].length);
			}
		}

		this.field3995 = this.method7346(var1.field3995);
		this.field3961 = this.method7346(var1.field3961);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7288(var1.actions));
		if (var1.field3964 != null) {
			this.field3964 = new String[var1.field3964.length][];

			for (var3 = 0; var3 < var1.field3964.length; ++var3) {
				this.field3964[var3] = new String[var1.field3964[var3].length];
				System.arraycopy(var1.field3964[var3], 0, this.field3964[var3], 0, var1.field3964[var3].length);
			}
		}

		this.field3925 = var1.field3925;
		this.parent = var1.parent;
		this.dragZoneSize = var1.dragZoneSize;
		this.dragThreshold = var1.dragThreshold;
		this.isScrollBar = var1.isScrollBar;
		this.spellActionName = var1.spellActionName;
		this.hasListener = var1.hasListener;
		this.onLoad = var1.onLoad;
		this.onClick = var1.onClick;
		this.onClickRepeat = var1.onClickRepeat;
		this.onRelease = var1.onRelease;
		this.onHold = var1.onHold;
		this.onMouseOver = var1.onMouseOver;
		this.onMouseRepeat = var1.onMouseRepeat;
		this.onMouseLeave = var1.onMouseLeave;
		this.onDrag = var1.onDrag;
		this.onDragComplete = var1.onDragComplete;
		this.onTargetEnter = var1.onTargetEnter;
		this.onTargetLeave = var1.onTargetLeave;
		this.onVarTransmit = var1.onVarTransmit;
		this.varTransmitTriggers = var1.varTransmitTriggers;
		this.onInvTransmit = var1.onInvTransmit;
		this.invTransmitTriggers = var1.invTransmitTriggers;
		this.onStatTransmit = var1.onStatTransmit;
		this.statTransmitTriggers = var1.statTransmitTriggers;
		this.onTimer = var1.onTimer;
		this.onOp = var1.onOp;
		this.field3918 = var1.field3918;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field3916 = var1.field3916;
		this.field3997 = var1.field3997;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field3965 = var1.field3965;
		this.field4001 = var1.field4001;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4007 = var1.field4007;
		this.field3991 = var1.field3991;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7346(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7346(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4013 = var1.field4013;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7346(var1.itemIds);
		this.itemQuantities = this.method7346(var1.itemQuantities);
		this.itemId = var1.itemId;
		this.itemQuantity = var1.itemQuantity;
		this.modelFrame = var1.modelFrame;
		this.modelFrameCycle = var1.modelFrameCycle;
		if (var1.children != null) {
			this.children = new Widget[var1.children.length];

			for (var3 = 0; var3 < var1.children.length; ++var3) {
				this.children[var3] = new Widget(var1.children[var3], var1.children[var3].childIndex);
			}
		}

		this.field4022 = var1.field4022;
		this.field4023 = var1.field4023;
		this.field4024 = var1.field4024;
		this.field4025 = var1.field4025;
		this.field4014 = var1.field4014;
		this.field3999 = var1.field3999;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4030 = this.method7346(var1.field4030);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
		garbageValue = "-87"
	)
	Object[] method7288(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "661738983"
	)
	int[] method7346(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "1240155534"
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
			this.field4013 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-867941240"
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
				this.field3923 = var1.readUnsignedShort();
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
			this.field3912 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "-123"
	)
	void method7401(Buffer var1) {
		this.field3879 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)[Ljava/lang/Object;",
		garbageValue = "0"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)[I",
		garbageValue = "-89"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZLex;I)Lvv;",
		garbageValue = "-1096374094"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3875 = false;
		if (this.field3915 != null) {
			SpritePixels var4 = this.method7296(var1, var3);
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
			long var5 = (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class496.SpriteBuffer_getSprite(var1.field3779, var8, 0);
				if (var7 == null) {
					field3875 = true;
					return null;
				} else {
					this.method7441(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lex;B)Lvv;",
		garbageValue = "15"
	)
	SpritePixels method7296(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7290()) {
			return this.method7297(var1, var2);
		} else {
			String var3 = this.field3915 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3791.method8892(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7297(var1, var2);
				if (var5 != null) {
					var4 = var5.method10574();
					this.method7441(var4);
					var1.field3791.method8895(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lex;I)Lvv;",
		garbageValue = "1624780231"
	)
	SpritePixels method7297(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3915 != null && var2 != null) {
			class356 var3 = (class356)var1.field3782.method8892(this.field3915);
			if (var3 == null) {
				var3 = new class356(this.field3915, var2);
				var1.field3782.method8895(this.field3915, var3);
			}

			return var3.method6920();
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1462247319"
	)
	boolean method7290() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V",
		garbageValue = "1786172466"
	)
	void method7441(SpritePixels var1) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Lqi;",
		garbageValue = "353567988"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3875 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = SecureRandomFuture.method2435(var1.field3779, var1.field3787, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3875 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Liu;IZLne;Lhy;Lhn;I)Ljy;",
		garbageValue = "1467311834"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3875 = false;
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
				var10 |= var7.field2001 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3781, var9, 0);
					break;
				case 2:
					if (var6 == null) {
						return null;
					}

					var13 = var6.method4026((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = Bounds.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					if (var6 == null) {
						return null;
					}

					var13 = var6.method4026(var7);
				}

				if (var13 == null) {
					field3875 = true;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZI)Lnw;",
		garbageValue = "-1094008471"
	)
	public SpriteMask method7328(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "44423903"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "1895718335"
	)
	public void method7447(int var1, int var2, String var3) {
		if (this.field3964 == null || this.field3964.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field3964 != null) {
				System.arraycopy(this.field3964, 0, var4, 0, this.field3964.length);
			}

			this.field3964 = var4;
		}

		if (this.field3964[var1] == null || this.field3964[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field3964[var1] != null) {
				System.arraycopy(this.field3964[var1], 0, var5, 0, this.field3964[var1].length);
			}

			this.field3964[var1] = var5;
		}

		this.field3964[var1][var2] = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-52"
	)
	public boolean method7437() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "776888940"
	)
	public boolean method7300() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lex;J)V"
	)
	public void method7295(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3951 = new class216();
			if (!this.field3951.method4426(var1, var2, var3)) {
				this.field3951 = null;
			} else {
				if (this.field3953 == null || this.field3896 == null) {
					this.method7344();
				}

			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lex;I)V",
		garbageValue = "-10882861"
	)
	public void method7308(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3951 = new class216();
		if (!this.field3951.method4426(var1, var3, var6)) {
			this.field3951 = null;
		} else {
			if (this.field3953 == null || this.field3896 == null) {
				this.method7344();
			}

			this.field3951.method4427(var2, var4, var5);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lex;I)V",
		garbageValue = "-1127990799"
	)
	public void method7341(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3951 = new class216();
			this.field3951.method4442(var1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1060130463"
	)
	void method7344() {
		this.field3953 = new HashMap();
		this.field3896 = new HashMap();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-330508271"
	)
	public void method7310(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3953 == null) {
				this.method7344();
			}

			this.field3953.put(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1526967599"
	)
	public void method7311(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3896 == null) {
				this.method7344();
			}

			this.field3896.put(var1, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)Z",
		garbageValue = "29758"
	)
	public boolean method7362(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3951 != null && this.method7409()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3951.method4481()[0] * (float)this.width);
			int var6 = (int)(this.field3951.method4481()[1] * (float)(this.height * -1662542495));
			int var7 = var5 + (int)(this.field3951.method4481()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3951.method4481()[3] * (float)(-1662542495 * this.height));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "936458656"
	)
	public boolean method7409() {
		return this.field3952 == 2;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1295022560"
	)
	public int method7355(String var1) {
		return this.type == 11 && this.field3951 != null && this.method7409() ? this.field3951.method4431(var1) : -1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method7435(String var1) {
		return this.type == 11 && this.field3951 != null && this.method7409() ? this.field3951.method4432(var1) : null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "706981199"
	)
	public int method7316() {
		return this.field3896 != null && this.field3896.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3914"
	)
	public int method7317() {
		if (this.type == 11 && this.field3951 != null && this.field3896 != null && !this.field3896.isEmpty()) {
			String var1 = this.field3951.method4480();
			return var1 != null && this.field3896.containsKey(this.field3951.method4480()) ? (Integer)this.field3896.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-463559630"
	)
	public String method7318() {
		if (this.type == 11 && this.field3951 != null) {
			String var1 = this.field3951.method4480();
			Iterator var2 = this.field3951.method4472().iterator();

			while (var2.hasNext()) {
				class230 var3 = (class230)var2.next();
				String var4 = String.format("%%%S%%", var3.method4662());
				if (var3.vmethod4660() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4648()));
				} else {
					var1.replaceAll(var4, var3.vmethod4649());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-37771363"
	)
	public int[] method7445() {
		if (this.type == 11 && this.field3951 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3951.method4472().iterator();

			while (var3.hasNext()) {
				class230 var4 = (class230)var3.next();
				if (!var4.method4662().equals("user_id")) {
					if (var4.vmethod4660() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4648();
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-875273778"
	)
	public class216 method7320() {
		return this.field3951;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lex;I)Z",
		garbageValue = "-1291697899"
	)
	public boolean method7323(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3951 != null) {
			this.field3951.method4439(var2);
			if (this.field3951.method4429() != this.field3952) {
				this.field3952 = this.field3951.method4429();
				if (this.field3952 >= 3) {
					return true;
				}

				if (this.field3952 == 2) {
					this.method7298(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "-96"
	)
	void method7298(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3951.method4434();
		ArrayList var3 = this.field3951.method4462();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class217 var7 = (class217)var6.next();
			var8 = class425.method8165(5, this, var5, 0, 0, 0, 0, var7.field2365);
			var8.field3915 = var7.field2364.method3249();
			class356 var9 = new class356(var7.field2364);
			var1.field3782.method8895(var8.field3915, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class228 var10 = (class228)var6.next();
			var8 = class425.method8165(4, this, var5, 0, 0, 0, 0, var10.field2451);
			var8.text = var10.field2449;
			var8.fontId = (Integer)this.field3953.get(var10.field2453);
			var8.textXAlignment = var10.field2450;
			var8.textYAlignment = var10.field2447;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	public void method7324() {
		this.field3955 = new class357();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3955.field3810.method393(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3955.field3810.method398(var2, 0);
		}

		this.field3955.field3810.method398('\u0080', 0);
		this.field3955.field3810.method393(82, 2);
		this.field3955.field3810.method393(81, 2);
		this.field3955.field3810.method393(86, 2);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lnz;",
		garbageValue = "-1919645375"
	)
	public class359 method7304() {
		return this.field3955 != null ? this.field3955.field3815 : null;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)Lny;",
		garbageValue = "-57"
	)
	public class353 method7325() {
		return this.field3955 != null ? this.field3955.field3809 : null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "-82860071"
	)
	public class27 method7326() {
		return this.field3955 != null ? this.field3955.field3810 : null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "1374945159"
	)
	public class357 method7287() {
		return this.field3955;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Z",
		garbageValue = "-158156887"
	)
	boolean method7315(class359 var1) {
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
			var2 |= var1.method7012(var5);
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
			var2 |= var1.method7239(var5);
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Z",
		garbageValue = "1237307425"
	)
	public boolean method7329(WidgetDefinition var1) {
		class359 var2 = this.method7304();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7065() && this.fontId != -1) {
				int var4 = var2.method7066();
				int var5 = var2.method7168();
				int var6 = var2.method7064();
				int var7 = var2.method7063();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7014(var8);
					var3 |= this.method7315(var2);
					var3 |= var2.method7252(var4, var5);
					var3 |= var2.method7157(var6, var7);
				}
			} else if (var2.method7065()) {
				var3 |= this.method7315(var2);
			}

			var2.method7266();
			return var3;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lne;ZI)V",
		garbageValue = "2046072088"
	)
	public void method7330(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3936 = new PlayerComposition(var1);
		if (!var2) {
			this.field3936.equipment = Arrays.copyOf(this.field3936.field3827, this.field3936.field3827.length);
			this.field3936.method6934();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "958975677"
	)
	static void method7407(int var0) {
		TransformationMatrix.field4780 = var0;
		TransformationMatrix.field4781 = new TransformationMatrix[var0];
		SecureRandomCallable.field1053 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Liu;",
		garbageValue = "-11891"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class520.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
