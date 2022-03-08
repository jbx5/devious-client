import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jz")
@Implements("Widget")
public class Widget extends Node {
    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "[[Ljz;")
    @Export("Widget_interfaceComponents")
    public static Widget[][] Widget_interfaceComponents;

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("Widget_modelsArchive")
    public static AbstractArchive Widget_modelsArchive;

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("Widget_cachedSprites")
    static EvictingDualNodeHashTable Widget_cachedSprites;

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("Widget_cachedModels")
    static EvictingDualNodeHashTable Widget_cachedModels;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("Widget_cachedFonts")
    static EvictingDualNodeHashTable Widget_cachedFonts;

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("Widget_cachedSpriteMasks")
    static EvictingDualNodeHashTable Widget_cachedSpriteMasks;

    @ObfuscatedName("n")
    public static boolean field3262;

    @ObfuscatedName("pg")
    @ObfuscatedSignature(descriptor = "Lei;")
    @Export("mouseWheel")
    static class154 mouseWheel;

    @ObfuscatedName("m")
    @Export("isIf3")
    public boolean isIf3;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -180788535)
    @Export("id")
    public int id;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 685751725)
    @Export("childIndex")
    public int childIndex;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 384164941)
    @Export("type")
    public int type;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = -1070445783)
    @Export("buttonType")
    public int buttonType;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 1360877493)
    @Export("contentType")
    public int contentType;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -731857837)
    @Export("xAlignment")
    public int xAlignment;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -761455235)
    @Export("yAlignment")
    public int yAlignment;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -598045779)
    @Export("widthAlignment")
    public int widthAlignment;

    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = -1735476283)
    @Export("heightAlignment")
    public int heightAlignment;

    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = 978229061)
    @Export("rawX")
    public int rawX;

    @ObfuscatedName("ak")
    @ObfuscatedGetter(intValue = 529243245)
    @Export("rawY")
    public int rawY;

    @ObfuscatedName("av")
    @ObfuscatedGetter(intValue = -1439929829)
    @Export("rawWidth")
    public int rawWidth;

    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = -252871963)
    @Export("rawHeight")
    public int rawHeight;

    @ObfuscatedName("al")
    @ObfuscatedGetter(intValue = 633251767)
    @Export("x")
    public int x;

    @ObfuscatedName("aa")
    @ObfuscatedGetter(intValue = 877491551)
    @Export("y")
    public int y;

    @ObfuscatedName("ao")
    @ObfuscatedGetter(intValue = -528431965)
    @Export("width")
    public int width;

    @ObfuscatedName("aq")
    @ObfuscatedGetter(intValue = -1285507771)
    @Export("height")
    public int height;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = 1058126991)
    public int field3281;

    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = 776649427)
    public int field3282;

    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = 102285177)
    @Export("parentId")
    public int parentId;

    @ObfuscatedName("as")
    @Export("isHidden")
    public boolean isHidden;

    @ObfuscatedName("ag")
    @ObfuscatedGetter(intValue = -1090792645)
    @Export("scrollX")
    public int scrollX;

    @ObfuscatedName("az")
    @ObfuscatedGetter(intValue = 1061879615)
    @Export("scrollY")
    public int scrollY;

    @ObfuscatedName("ad")
    @ObfuscatedGetter(intValue = 1839447183)
    @Export("scrollWidth")
    public int scrollWidth;

    @ObfuscatedName("au")
    @ObfuscatedGetter(intValue = 54764769)
    @Export("scrollHeight")
    public int scrollHeight;

    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = -2025844013)
    @Export("color")
    public int color;

    @ObfuscatedName("ae")
    @ObfuscatedGetter(intValue = -62414059)
    @Export("color2")
    public int color2;

    @ObfuscatedName("an")
    @ObfuscatedGetter(intValue = -926855627)
    @Export("mouseOverColor")
    public int mouseOverColor;

    @ObfuscatedName("aw")
    @ObfuscatedGetter(intValue = 1058723143)
    @Export("mouseOverColor2")
    public int mouseOverColor2;

    @ObfuscatedName("aj")
    @Export("fill")
    public boolean fill;

    @ObfuscatedName("ax")
    @ObfuscatedSignature(descriptor = "Lpd;")
    @Export("fillMode")
    public FillMode fillMode;

    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = -1595485359)
    @Export("transparencyTop")
    public int transparencyTop;

    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = -1943610129)
    @Export("transparencyBot")
    public int transparencyBot;

    @ObfuscatedName("am")
    @ObfuscatedGetter(intValue = -202756683)
    @Export("lineWid")
    public int lineWid;

    @ObfuscatedName("be")
    public boolean field3298;

    @ObfuscatedName("bt")
    @ObfuscatedGetter(intValue = -1082596211)
    @Export("spriteId2")
    public int spriteId2;

    @ObfuscatedName("bn")
    @ObfuscatedGetter(intValue = -1408111085)
    @Export("spriteId")
    public int spriteId;

    @ObfuscatedName("bz")
    @ObfuscatedGetter(intValue = -292957173)
    @Export("spriteAngle")
    public int spriteAngle;

    @ObfuscatedName("bx")
    @Export("spriteTiling")
    public boolean spriteTiling;

    @ObfuscatedName("bd")
    @ObfuscatedGetter(intValue = -288068171)
    @Export("outline")
    public int outline;

    @ObfuscatedName("bg")
    @ObfuscatedGetter(intValue = 971413031)
    @Export("spriteShadow")
    public int spriteShadow;

    @ObfuscatedName("bm")
    @Export("spriteFlipV")
    public boolean spriteFlipV;

    @ObfuscatedName("bi")
    @Export("spriteFlipH")
    public boolean spriteFlipH;

    @ObfuscatedName("bw")
    @ObfuscatedGetter(intValue = -1188985969)
    @Export("modelType")
    public int modelType;

    @ObfuscatedName("bu")
    @ObfuscatedGetter(intValue = 1715479403)
    @Export("modelId")
    public int modelId;

    @ObfuscatedName("bs")
    @ObfuscatedGetter(intValue = -390932075)
    @Export("modelType2")
    int modelType2;

    @ObfuscatedName("bb")
    @ObfuscatedGetter(intValue = 1358281371)
    @Export("modelId2")
    int modelId2;

    @ObfuscatedName("br")
    @ObfuscatedGetter(intValue = 619417351)
    @Export("sequenceId")
    public int sequenceId;

    @ObfuscatedName("bh")
    @ObfuscatedGetter(intValue = -939642299)
    @Export("sequenceId2")
    public int sequenceId2;

    @ObfuscatedName("bf")
    @ObfuscatedGetter(intValue = 484546545)
    @Export("modelOffsetX")
    public int modelOffsetX;

    @ObfuscatedName("bq")
    @ObfuscatedGetter(intValue = 787529923)
    @Export("modelOffsetY")
    public int modelOffsetY;

    @ObfuscatedName("ba")
    @ObfuscatedGetter(intValue = 407956303)
    @Export("modelAngleX")
    public int modelAngleX;

    @ObfuscatedName("bv")
    @ObfuscatedGetter(intValue = 1666676163)
    @Export("modelAngleY")
    public int modelAngleY;

    @ObfuscatedName("bl")
    @ObfuscatedGetter(intValue = 1851168267)
    @Export("modelAngleZ")
    public int modelAngleZ;

    @ObfuscatedName("bc")
    @ObfuscatedGetter(intValue = -1696655143)
    @Export("modelZoom")
    public int modelZoom;

    @ObfuscatedName("bj")
    @ObfuscatedGetter(intValue = -2040675921)
    public int field3310;

    @ObfuscatedName("bo")
    @ObfuscatedGetter(intValue = -1540032617)
    public int field3320;

    @ObfuscatedName("by")
    @Export("modelOrthog")
    public boolean modelOrthog;

    @ObfuscatedName("bk")
    @Export("modelTransparency")
    public boolean modelTransparency;

    @ObfuscatedName("bp")
    @ObfuscatedGetter(intValue = 1683849957)
    @Export("itemQuantityMode")
    public int itemQuantityMode;

    @ObfuscatedName("ch")
    @ObfuscatedGetter(intValue = -1902504381)
    @Export("fontId")
    public int fontId;

    @ObfuscatedName("cf")
    @Export("text")
    public String text;

    @ObfuscatedName("cg")
    @Export("text2")
    public String text2;

    @ObfuscatedName("cu")
    @ObfuscatedGetter(intValue = -327102455)
    @Export("textLineHeight")
    public int textLineHeight;

    @ObfuscatedName("cw")
    @ObfuscatedGetter(intValue = 1072242523)
    @Export("textXAlignment")
    public int textXAlignment;

    @ObfuscatedName("cb")
    @ObfuscatedGetter(intValue = 1322917451)
    @Export("textYAlignment")
    public int textYAlignment;

    @ObfuscatedName("cq")
    @Export("textShadowed")
    public boolean textShadowed;

    @ObfuscatedName("cd")
    @ObfuscatedGetter(intValue = 469005899)
    @Export("paddingX")
    public int paddingX;

    @ObfuscatedName("cc")
    @ObfuscatedGetter(intValue = -1851947421)
    @Export("paddingY")
    public int paddingY;

    @ObfuscatedName("cs")
    @Export("inventoryXOffsets")
    public int[] inventoryXOffsets;

    @ObfuscatedName("cl")
    @Export("inventoryYOffsets")
    public int[] inventoryYOffsets;

    @ObfuscatedName("ck")
    @Export("inventorySprites")
    public int[] inventorySprites;

    @ObfuscatedName("cy")
    @Export("itemActions")
    public String[] itemActions;

    @ObfuscatedName("cn")
    @ObfuscatedGetter(intValue = -41103585)
    @Export("flags")
    public int flags;

    @ObfuscatedName("cr")
    public boolean field3338;

    @ObfuscatedName("co")
    public byte[][] field3339;

    @ObfuscatedName("cj")
    public byte[][] field3397;

    @ObfuscatedName("ci")
    public int[] field3341;

    @ObfuscatedName("ct")
    public int[] field3342;

    @ObfuscatedName("cp")
    @Export("dataText")
    public String dataText;

    @ObfuscatedName("ce")
    @Export("actions")
    public String[] actions;

    @ObfuscatedName("cv")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("parent")
    public Widget parent;

    @ObfuscatedName("ds")
    @ObfuscatedGetter(intValue = -872870567)
    @Export("dragZoneSize")
    public int dragZoneSize;

    @ObfuscatedName("de")
    @ObfuscatedGetter(intValue = 823813735)
    @Export("dragThreshold")
    public int dragThreshold;

    @ObfuscatedName("df")
    @Export("isScrollBar")
    public boolean isScrollBar;

    @ObfuscatedName("db")
    @Export("spellActionName")
    public String spellActionName;

    @ObfuscatedName("dr")
    @Export("hasListener")
    public boolean hasListener;

    @ObfuscatedName("dq")
    @Export("onLoad")
    public Object[] onLoad;

    @ObfuscatedName("dj")
    @Export("onClick")
    public Object[] onClick;

    @ObfuscatedName("dz")
    @Export("onClickRepeat")
    public Object[] onClickRepeat;

    @ObfuscatedName("du")
    @Export("onRelease")
    public Object[] onRelease;

    @ObfuscatedName("dm")
    @Export("onHold")
    public Object[] onHold;

    @ObfuscatedName("di")
    @Export("onMouseOver")
    public Object[] onMouseOver;

    @ObfuscatedName("dt")
    @Export("onMouseRepeat")
    public Object[] onMouseRepeat;

    @ObfuscatedName("dl")
    @Export("onMouseLeave")
    public Object[] onMouseLeave;

    @ObfuscatedName("do")
    @Export("onDrag")
    public Object[] onDrag;

    @ObfuscatedName("dv")
    @Export("onDragComplete")
    public Object[] onDragComplete;

    @ObfuscatedName("dh")
    @Export("onTargetEnter")
    public Object[] onTargetEnter;

    @ObfuscatedName("dw")
    @Export("onTargetLeave")
    public Object[] onTargetLeave;

    @ObfuscatedName("dp")
    @Export("onVarTransmit")
    public Object[] onVarTransmit;

    @ObfuscatedName("dd")
    @Export("varTransmitTriggers")
    public int[] varTransmitTriggers;

    @ObfuscatedName("dy")
    @Export("onInvTransmit")
    public Object[] onInvTransmit;

    @ObfuscatedName("dg")
    @Export("invTransmitTriggers")
    public int[] invTransmitTriggers;

    @ObfuscatedName("dn")
    @Export("onStatTransmit")
    public Object[] onStatTransmit;

    @ObfuscatedName("dx")
    @Export("statTransmitTriggers")
    public int[] statTransmitTriggers;

    @ObfuscatedName("da")
    @Export("onTimer")
    public Object[] onTimer;

    @ObfuscatedName("dc")
    @Export("onOp")
    public Object[] onOp;

    @ObfuscatedName("dk")
    @Export("onScroll")
    public Object[] onScroll;

    @ObfuscatedName("er")
    @Export("onChatTransmit")
    public Object[] onChatTransmit;

    @ObfuscatedName("ep")
    @Export("onKey")
    public Object[] onKey;

    @ObfuscatedName("ea")
    public Object[] field3374;

    @ObfuscatedName("et")
    public Object[] field3321;

    @ObfuscatedName("eh")
    @Export("onFriendTransmit")
    public Object[] onFriendTransmit;

    @ObfuscatedName("ev")
    @Export("onClanTransmit")
    public Object[] onClanTransmit;

    @ObfuscatedName("ee")
    public Object[] field3328;

    @ObfuscatedName("ey")
    public Object[] field3271;

    @ObfuscatedName("eu")
    @Export("onMiscTransmit")
    public Object[] onMiscTransmit;

    @ObfuscatedName("ej")
    @Export("onDialogAbort")
    public Object[] onDialogAbort;

    @ObfuscatedName("es")
    @Export("onSubChange")
    public Object[] onSubChange;

    @ObfuscatedName("eb")
    @Export("onResize")
    public Object[] onResize;

    @ObfuscatedName("en")
    @Export("onStockTransmit")
    public Object[] onStockTransmit;

    @ObfuscatedName("ed")
    public Object[] field3385;

    @ObfuscatedName("ew")
    @Export("cs1Instructions")
    public int[][] cs1Instructions;

    @ObfuscatedName("eq")
    @Export("cs1Comparisons")
    public int[] cs1Comparisons;

    @ObfuscatedName("eg")
    @Export("cs1ComparisonValues")
    public int[] cs1ComparisonValues;

    @ObfuscatedName("ez")
    @ObfuscatedGetter(intValue = -2001179919)
    @Export("mouseOverRedirect")
    public int mouseOverRedirect;

    @ObfuscatedName("em")
    @Export("spellName")
    public String spellName;

    @ObfuscatedName("eo")
    @Export("buttonText")
    public String buttonText;

    @ObfuscatedName("ef")
    @Export("itemIds")
    public int[] itemIds;

    @ObfuscatedName("ec")
    @Export("itemQuantities")
    public int[] itemQuantities;

    @ObfuscatedName("ex")
    @ObfuscatedGetter(intValue = -1695040585)
    @Export("itemId")
    public int itemId;

    @ObfuscatedName("el")
    @ObfuscatedGetter(intValue = 26817127)
    @Export("itemQuantity")
    public int itemQuantity;

    @ObfuscatedName("ei")
    @ObfuscatedGetter(intValue = 1448243617)
    @Export("modelFrame")
    public int modelFrame;

    @ObfuscatedName("ek")
    @ObfuscatedGetter(intValue = 1519423877)
    @Export("modelFrameCycle")
    public int modelFrameCycle;

    @ObfuscatedName("fc")
    @ObfuscatedSignature(descriptor = "[Ljz;")
    @Export("children")
    public Widget[] children;

    @ObfuscatedName("fi")
    @Export("containsMouse")
    public boolean containsMouse;

    @ObfuscatedName("fw")
    @Export("isClicked")
    public boolean isClicked;

    @ObfuscatedName("fk")
    @ObfuscatedGetter(intValue = -1921474143)
    public int field3401;

    @ObfuscatedName("ff")
    @ObfuscatedGetter(intValue = 684438727)
    public int field3402;

    @ObfuscatedName("fu")
    @ObfuscatedGetter(intValue = -782810715)
    public int field3403;

    @ObfuscatedName("fp")
    @ObfuscatedGetter(intValue = 1290877129)
    public int field3370;

    @ObfuscatedName("fr")
    @ObfuscatedGetter(intValue = 1391394429)
    @Export("rootIndex")
    public int rootIndex;

    @ObfuscatedName("ft")
    @ObfuscatedGetter(intValue = -1638866449)
    @Export("cycle")
    public int cycle;

    @ObfuscatedName("fb")
    public int[] field3254;

    @ObfuscatedName("fs")
    @Export("noClickThrough")
    public boolean noClickThrough;

    @ObfuscatedName("fz")
    @Export("noScrollThrough")
    public boolean noScrollThrough;

    @ObfuscatedName("fq")
    @Export("prioritizeMenuEntry")
    public boolean prioritizeMenuEntry;

    static {
        Widget_cachedSprites = new EvictingDualNodeHashTable(200);
        Widget_cachedModels = new EvictingDualNodeHashTable(50);
        Widget_cachedFonts = new EvictingDualNodeHashTable(20);
        Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
        field3262 = false;
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
        this.field3281 = 1;
        this.field3282 = 1;
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
        this.field3298 = false;
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
        this.field3310 = 0;
        this.field3320 = 0;
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
        this.paddingX = 0;
        this.paddingY = 0;
        this.flags = 0;
        this.field3338 = false;
        this.dataText = "";
        this.parent = null;
        this.dragZoneSize = 0;
        this.dragThreshold = 0;
        this.isScrollBar = false;
        this.spellActionName = "";
        this.hasListener = false;
        this.mouseOverRedirect = -1;
        this.spellName = "";
        this.buttonText = "Ok";
        this.itemId = -1;
        this.itemQuantity = 0;
        this.modelFrame = 0;
        this.modelFrameCycle = 0;
        this.containsMouse = false;
        this.isClicked = false;
        this.field3401 = -1;
        this.field3402 = 0;
        this.field3403 = 0;
        this.field3370 = 0;
        this.rootIndex = -1;
        this.cycle = -1;
        this.noClickThrough = false;
        this.noScrollThrough = false;
        this.prioritizeMenuEntry = false;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "22618165")
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
            this.parentId += this.id & (-65536);
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
        int var5;
        int var6;
        if (var3 > 0) {
            this.cs1Instructions = new int[var3][];
            for (var4 = 0; var4 < var3; ++var4) {
                var5 = var1.readUnsignedShort();
                this.cs1Instructions[var4] = new int[var5];
                for (var6 = 0; var6 < var5; ++var6) {
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
        if (this.type == 2) {
            this.itemIds = new int[this.rawWidth * this.rawHeight];
            this.itemQuantities = new int[this.rawWidth * this.rawHeight];
            var4 = var1.readUnsignedByte();
            if (var4 == 1) {
                this.flags |= 268435456;
            }
            var5 = var1.readUnsignedByte();
            if (var5 == 1) {
                this.flags |= 1073741824;
            }
            var6 = var1.readUnsignedByte();
            if (var6 == 1) {
                this.flags |= Integer.MIN_VALUE;
            }
            int var7 = var1.readUnsignedByte();
            if (var7 == 1) {
                this.flags |= 536870912;
            }
            this.paddingX = var1.readUnsignedByte();
            this.paddingY = var1.readUnsignedByte();
            this.inventoryXOffsets = new int[20];
            this.inventoryYOffsets = new int[20];
            this.inventorySprites = new int[20];
            int var8;
            for (var8 = 0; var8 < 20; ++var8) {
                int var11 = var1.readUnsignedByte();
                if (var11 == 1) {
                    this.inventoryXOffsets[var8] = var1.readShort();
                    this.inventoryYOffsets[var8] = var1.readShort();
                    this.inventorySprites[var8] = var1.readInt();
                } else {
                    this.inventorySprites[var8] = -1;
                }
            }
            this.itemActions = new String[5];
            for (var8 = 0; var8 < 5; ++var8) {
                String var9 = var1.readStringCp1252NullTerminated();
                if (var9.length() > 0) {
                    this.itemActions[var8] = var9;
                    this.flags |= 1 << (var8 + 23);
                }
            }
        }
        if (this.type == 3) {
            this.fill = var1.readUnsignedByte() == 1;
        }
        if ((this.type == 4) || (this.type == 1)) {
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
        if (((this.type == 1) || (this.type == 3)) || (this.type == 4)) {
            this.color = var1.readInt();
        }
        if ((this.type == 3) || (this.type == 4)) {
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
        if (this.type == 7) {
            this.itemIds = new int[this.rawHeight * this.rawWidth];
            this.itemQuantities = new int[this.rawWidth * this.rawHeight];
            this.textXAlignment = var1.readUnsignedByte();
            this.fontId = var1.readUnsignedShort();
            if (this.fontId == 65535) {
                this.fontId = -1;
            }
            this.textShadowed = var1.readUnsignedByte() == 1;
            this.color = var1.readInt();
            this.paddingX = var1.readShort();
            this.paddingY = var1.readShort();
            var4 = var1.readUnsignedByte();
            if (var4 == 1) {
                this.flags |= 1073741824;
            }
            this.itemActions = new String[5];
            for (var5 = 0; var5 < 5; ++var5) {
                String var10 = var1.readStringCp1252NullTerminated();
                if (var10.length() > 0) {
                    this.itemActions[var5] = var10;
                    this.flags |= 1 << (var5 + 23);
                }
            }
        }
        if (this.type == 8) {
            this.text = var1.readStringCp1252NullTerminated();
        }
        if ((this.buttonType == 2) || (this.type == 2)) {
            this.spellActionName = var1.readStringCp1252NullTerminated();
            this.spellName = var1.readStringCp1252NullTerminated();
            var4 = var1.readUnsignedShort() & 63;
            this.flags |= var4 << 11;
        }
        if ((((this.buttonType == 1) || (this.buttonType == 4)) || (this.buttonType == 5)) || (this.buttonType == 6)) {
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
        if (((this.buttonType == 1) || (this.buttonType == 4)) || (this.buttonType == 5)) {
            this.flags |= 4194304;
        }
        if (this.buttonType == 6) {
            this.flags |= 1;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "130100333")
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
            this.parentId += this.id & (-65536);
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
                this.field3310 = var1.readUnsignedShort();
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
            this.field3298 = var1.readUnsignedByte() == 1;
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

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lpi;I)[Ljava/lang/Object;", garbageValue = "118970610")
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

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(Lpi;I)[I", garbageValue = "935192358")
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

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1011934245")
    @Export("swapItems")
    public void swapItems(int var1, int var2) {
        int var3 = this.itemIds[var2];
        this.itemIds[var2] = this.itemIds[var1];
        this.itemIds[var1] = var3;
        var3 = this.itemQuantities[var2];
        this.itemQuantities[var2] = this.itemQuantities[var1];
        this.itemQuantities[var1] = var3;
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(ZB)Lpt;", garbageValue = "12")
    @Export("getSprite")
    public SpritePixels getSprite(boolean var1) {
        field3262 = false;
        int var2;
        if (var1) {
            var2 = this.spriteId;
        } else {
            var2 = this.spriteId2;
        }
        if (var2 == (-1)) {
            return null;
        } else {
            long var3 = ((((((long) (this.spriteShadow)) << 40) + ((long) (var2))) + (((long) (this.outline)) << 36)) + ((this.spriteFlipV ? 1L : 0L) << 38)) + ((this.spriteFlipH ? 1L : 0L) << 39);
            SpritePixels var5 = ((SpritePixels) (Widget_cachedSprites.get(var3)));
            if (var5 != null) {
                return var5;
            } else {
                var5 = class126.SpriteBuffer_getSprite(class160.Widget_spritesArchive, var2, 0);
                if (var5 == null) {
                    field3262 = true;
                    return null;
                } else {
                    if (this.spriteFlipV) {
                        var5.flipVertically();
                    }
                    if (this.spriteFlipH) {
                        var5.flipHorizontally();
                    }
                    if (this.outline > 0) {
                        var5.pad(this.outline);
                    }
                    if (this.outline >= 1) {
                        var5.outline(1);
                    }
                    if (this.outline >= 2) {
                        var5.outline(16777215);
                    }
                    if (this.spriteShadow != 0) {
                        var5.shadow(this.spriteShadow);
                    }
                    Widget_cachedSprites.put(var5, var3);
                    return var5;
                }
            }
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(I)Llv;", garbageValue = "193785745")
    @Export("getFont")
    public Font getFont() {
        field3262 = false;
        if (this.fontId == (-1)) {
            return null;
        } else {
            Font var1 = ((Font) (Widget_cachedFonts.get(((long) (this.fontId)))));
            if (var1 != null) {
                return var1;
            } else {
                AbstractArchive var3 = class160.Widget_spritesArchive;
                AbstractArchive var4 = class222.Widget_fontsArchive;
                int var5 = this.fontId;
                Font var2;
                if (!class125.method2744(var3, var5, 0)) {
                    var2 = null;
                } else {
                    var2 = Clock.method3125(var4.takeFile(var5, 0));
                }
                if (var2 != null) {
                    Widget_cachedFonts.put(var2, ((long) (this.fontId)));
                } else {
                    field3262 = true;
                }
                return var2;
            }
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(II)Lpt;", garbageValue = "1704463538")
    @Export("getInventorySprite")
    public SpritePixels getInventorySprite(int var1) {
        field3262 = false;
        if ((var1 >= 0) && (var1 < this.inventorySprites.length)) {
            int var2 = this.inventorySprites[var1];
            if (var2 == (-1)) {
                return null;
            } else {
                SpritePixels var3 = ((SpritePixels) (Widget_cachedSprites.get(((long) (var2)))));
                if (var3 != null) {
                    return var3;
                } else {
                    var3 = class126.SpriteBuffer_getSprite(class160.Widget_spritesArchive, var2, 0);
                    if (var3 != null) {
                        Widget_cachedSprites.put(var3, ((long) (var2)));
                    } else {
                        field3262 = true;
                    }
                    return var3;
                }
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(Lgm;IZLjo;I)Lgf;", garbageValue = "2091049938")
    @Export("getModel")
    public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
        field3262 = false;
        int var5;
        int var6;
        if (var3) {
            var5 = this.modelType2;
            var6 = this.modelId2;
        } else {
            var5 = this.modelType;
            var6 = this.modelId;
        }
        if (var5 == 0) {
            return null;
        } else if ((var5 == 1) && (var6 == (-1))) {
            return null;
        } else {
            Model var7 = ((Model) (Widget_cachedModels.get(((long) (var6 + (var5 << 16))))));
            if (var7 == null) {
                ModelData var8;
                if (var5 == 1) {
                    var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0);
                    if (var8 == null) {
                        field3262 = true;
                        return null;
                    }
                    var7 = var8.toModel(64, 768, -50, -10, -50);
                }
                if (var5 == 2) {
                    var8 = UserComparator10.getNpcDefinition(var6).getModelData();
                    if (var8 == null) {
                        field3262 = true;
                        return null;
                    }
                    var7 = var8.toModel(64, 768, -50, -10, -50);
                }
                if (var5 == 3) {
                    if (var4 == null) {
                        return null;
                    }
                    var8 = var4.getModelData();
                    if (var8 == null) {
                        field3262 = true;
                        return null;
                    }
                    var7 = var8.toModel(64, 768, -50, -10, -50);
                }
                if (var5 == 4) {
                    ItemComposition var9 = Client.ItemDefinition_get(var6);
                    var8 = var9.getModelData(10);
                    if (var8 == null) {
                        field3262 = true;
                        return null;
                    }
                    var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
                }
                Widget_cachedModels.put(var7, ((long) (var6 + (var5 << 16))));
            }
            if (var1 != null) {
                var7 = var1.transformWidgetModel(var7, var2);
            }
            return var7;
        }
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(ZB)Ljq;", garbageValue = "44")
    @Export("getSpriteMask")
    public SpriteMask getSpriteMask(boolean var1) {
        if (this.spriteId == (-1)) {
            var1 = false;
        }
        int var2 = (var1) ? (this.spriteId * (-1408111085)) * (-1281291237) : (this.spriteId2 * (-1082596211)) * 350322245;
        if (var2 == (-1)) {
            return null;
        } else {
            long var3 = ((((((long) (this.spriteShadow)) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39)) + ((long) (var2))) + (((long) (this.outline)) << 36)) + ((this.spriteFlipV ? 1L : 0L) << 38);
            SpriteMask var5 = ((SpriteMask) (Widget_cachedSpriteMasks.get(var3)));
            if (var5 != null) {
                return var5;
            } else {
                SpritePixels var6 = this.getSprite(var1);
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
                            if (var7.pixels[var13 + (var10 * var7.subWidth)] == 0) {
                                var11 = var13;
                                break;
                            }
                        }
                        for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
                            if (var7.pixels[var13 + (var10 * var7.subWidth)] == 0) {
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

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "-1989165628")
    @Export("setAction")
    public void setAction(int var1, String var2) {
        if ((this.actions == null) || (this.actions.length <= var1)) {
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

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IS)Lfd;", garbageValue = "198")
    @Export("SpotAnimationDefinition_get")
    public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
        SpotAnimationDefinition var1 = ((SpotAnimationDefinition) (SpotAnimationDefinition.SpotAnimationDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
            var1 = new SpotAnimationDefinition();
            var1.id = var0;
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("ia")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1637132835")
    @Export("formatItemStacks")
    static final String formatItemStacks(int var0) {
        String var1 = Integer.toString(var0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = (var1.substring(0, var2) + ",") + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return (((((((" " + LoginScreenAnimation.colorStartTag(65408)) + var1.substring(0, var1.length() - 8)) + "M") + " ") + " (") + var1) + ")") + "</col>";
        } else {
            return var1.length() > 6 ? (((((((" " + LoginScreenAnimation.colorStartTag(16777215)) + var1.substring(0, var1.length() - 4)) + "K") + " ") + " (") + var1) + ")") + "</col>" : ((" " + LoginScreenAnimation.colorStartTag(16776960)) + var1) + "</col>";
        }
    }
}