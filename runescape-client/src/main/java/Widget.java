import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Widget")
public class Widget extends Node {
   @ObfuscatedName("to")
   @ObfuscatedGetter(
      intValue = -263620323
   )
   static int field3636;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "[[Lkn;"
   )
   @Export("Widget_interfaceComponents")
   public static Widget[][] Widget_interfaceComponents;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("Widget_cachedSprites")
   static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("Widget_cachedModels")
   static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("Widget_cachedFonts")
   static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("Widget_cachedSpriteMasks")
   static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   static class381 field3472;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   static class381 field3478;
   @ObfuscatedName("ad")
   public static boolean field3479;
   @ObfuscatedName("av")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1917711801
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 469376671
   )
   @Export("childIndex")
   public int childIndex = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -329832557
   )
   @Export("type")
   public int type;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1029610303
   )
   @Export("buttonType")
   public int buttonType = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1016623939
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1340008183
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1534861181
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1901095729
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 777525925
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1563685067
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -476345777
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1238423121
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1560710239
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -573894221
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 507755209
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1582083079
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1708008155
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 542051879
   )
   public int field3498 = 1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1849756449
   )
   public int field3532 = 1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1789533151
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("bm")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1358065617
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -140001103
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -26574507
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1173980451
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1570572883
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1751496061
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1753359483
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1557818957
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("bv")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lrb;"
   )
   @Export("fillMode")
   public FillMode fillMode;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 147312651
   )
   @Export("transparencyTop")
   public int transparencyTop;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -71681053
   )
   @Export("transparencyBot")
   public int transparencyBot;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1058202869
   )
   @Export("lineWid")
   public int lineWid;
   @ObfuscatedName("by")
   public boolean field3515;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -784888237
   )
   @Export("spriteId2")
   public int spriteId2;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -455779275
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("bj")
   public String field3518;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -826185515
   )
   @Export("spriteAngle")
   public int spriteAngle;
   @ObfuscatedName("bn")
   @Export("spriteTiling")
   public boolean spriteTiling;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1819416611
   )
   @Export("outline")
   public int outline;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1004200007
   )
   @Export("spriteShadow")
   public int spriteShadow;
   @ObfuscatedName("bi")
   @Export("spriteFlipV")
   public boolean spriteFlipV;
   @ObfuscatedName("bs")
   @Export("spriteFlipH")
   public boolean spriteFlipH;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -166761659
   )
   @Export("modelType")
   public int modelType;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -546957309
   )
   @Export("modelId")
   public int modelId;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 1504197233
   )
   @Export("modelType2")
   int modelType2;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 1675282901
   )
   @Export("modelId2")
   int modelId2;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -718928581
   )
   @Export("sequenceId")
   public int sequenceId;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -1330950589
   )
   @Export("sequenceId2")
   public int sequenceId2;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = -681202429
   )
   @Export("modelOffsetX")
   public int modelOffsetX;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 445292289
   )
   @Export("modelOffsetY")
   public int modelOffsetY;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 1905981411
   )
   @Export("modelAngleX")
   public int modelAngleX;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -2094300399
   )
   @Export("modelAngleY")
   public int modelAngleY;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1876738053
   )
   @Export("modelAngleZ")
   public int modelAngleZ;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 460318677
   )
   @Export("modelZoom")
   public int modelZoom;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -709248075
   )
   public int field3537;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 850745255
   )
   public int field3533;
   @ObfuscatedName("ch")
   @Export("modelOrthog")
   public boolean modelOrthog;
   @ObfuscatedName("ce")
   @Export("modelTransparency")
   public boolean modelTransparency;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1384011809
   )
   @Export("itemQuantityMode")
   public int itemQuantityMode;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -101600891
   )
   @Export("fontId")
   public int fontId;
   @ObfuscatedName("cr")
   @Export("text")
   public String text;
   @ObfuscatedName("ct")
   @Export("text2")
   public String text2;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -407538245
   )
   @Export("textLineHeight")
   public int textLineHeight;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -980152459
   )
   @Export("textXAlignment")
   public int textXAlignment;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -620947247
   )
   @Export("textYAlignment")
   public int textYAlignment;
   @ObfuscatedName("cv")
   @Export("textShadowed")
   public boolean textShadowed;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -1480138033
   )
   @Export("paddingX")
   public int paddingX;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 882705129
   )
   @Export("paddingY")
   public int paddingY;
   @ObfuscatedName("ds")
   @Export("inventoryXOffsets")
   public int[] inventoryXOffsets;
   @ObfuscatedName("df")
   @Export("inventoryYOffsets")
   public int[] inventoryYOffsets;
   @ObfuscatedName("dc")
   @Export("inventorySprites")
   public int[] inventorySprites;
   @ObfuscatedName("dk")
   @Export("itemActions")
   public String[] itemActions;
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lft;"
   )
   class162 field3481;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -761056275
   )
   int field3556;
   @ObfuscatedName("dt")
   HashMap field3553;
   @ObfuscatedName("da")
   HashMap field3629;
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   class298 field3495;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -1005194465
   )
   @Export("flags")
   public int flags;
   @ObfuscatedName("dm")
   public boolean field3561;
   @ObfuscatedName("dg")
   public byte[][] field3562;
   @ObfuscatedName("dr")
   public byte[][] field3563;
   @ObfuscatedName("dl")
   public int[] field3611;
   @ObfuscatedName("dy")
   public int[] field3565;
   @ObfuscatedName("db")
   @Export("dataText")
   public String dataText;
   @ObfuscatedName("dv")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("parent")
   public Widget parent;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = -776330119
   )
   @Export("dragZoneSize")
   public int dragZoneSize;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1349448159
   )
   @Export("dragThreshold")
   public int dragThreshold;
   @ObfuscatedName("dh")
   @Export("isScrollBar")
   public boolean isScrollBar;
   @ObfuscatedName("es")
   @Export("spellActionName")
   public String spellActionName;
   @ObfuscatedName("ek")
   @Export("hasListener")
   public boolean hasListener;
   @ObfuscatedName("en")
   @Export("onLoad")
   public Object[] onLoad;
   @ObfuscatedName("eb")
   @Export("onClick")
   public Object[] onClick;
   @ObfuscatedName("ep")
   @Export("onClickRepeat")
   public Object[] onClickRepeat;
   @ObfuscatedName("ej")
   @Export("onRelease")
   public Object[] onRelease;
   @ObfuscatedName("ew")
   @Export("onHold")
   public Object[] onHold;
   @ObfuscatedName("ec")
   @Export("onMouseOver")
   public Object[] onMouseOver;
   @ObfuscatedName("el")
   @Export("onMouseRepeat")
   public Object[] onMouseRepeat;
   @ObfuscatedName("eo")
   @Export("onMouseLeave")
   public Object[] onMouseLeave;
   @ObfuscatedName("eh")
   @Export("onDrag")
   public Object[] onDrag;
   @ObfuscatedName("et")
   @Export("onDragComplete")
   public Object[] onDragComplete;
   @ObfuscatedName("ey")
   @Export("onTargetEnter")
   public Object[] onTargetEnter;
   @ObfuscatedName("ef")
   @Export("onTargetLeave")
   public Object[] onTargetLeave;
   @ObfuscatedName("ev")
   @Export("onVarTransmit")
   public Object[] onVarTransmit;
   @ObfuscatedName("ea")
   @Export("varTransmitTriggers")
   public int[] varTransmitTriggers;
   @ObfuscatedName("er")
   @Export("onInvTransmit")
   public Object[] onInvTransmit;
   @ObfuscatedName("ed")
   @Export("invTransmitTriggers")
   public int[] invTransmitTriggers;
   @ObfuscatedName("ez")
   @Export("onStatTransmit")
   public Object[] onStatTransmit;
   @ObfuscatedName("eu")
   @Export("statTransmitTriggers")
   public int[] statTransmitTriggers;
   @ObfuscatedName("ei")
   @Export("onTimer")
   public Object[] onTimer;
   @ObfuscatedName("eg")
   @Export("onOp")
   public Object[] onOp;
   @ObfuscatedName("em")
   public Object[] field3594;
   @ObfuscatedName("ex")
   @Export("onScroll")
   public Object[] onScroll;
   @ObfuscatedName("ee")
   @Export("onChatTransmit")
   public Object[] onChatTransmit;
   @ObfuscatedName("eq")
   @Export("onKey")
   public Object[] onKey;
   @ObfuscatedName("fe")
   public Object[] field3598;
   @ObfuscatedName("fr")
   public Object[] field3599;
   @ObfuscatedName("fm")
   @Export("onFriendTransmit")
   public Object[] onFriendTransmit;
   @ObfuscatedName("fx")
   @Export("onClanTransmit")
   public Object[] onClanTransmit;
   @ObfuscatedName("fl")
   public Object[] field3602;
   @ObfuscatedName("fc")
   public Object[] field3473;
   @ObfuscatedName("ft")
   @Export("onMiscTransmit")
   public Object[] onMiscTransmit;
   @ObfuscatedName("fp")
   @Export("onDialogAbort")
   public Object[] onDialogAbort;
   @ObfuscatedName("fg")
   @Export("onSubChange")
   public Object[] onSubChange;
   @ObfuscatedName("fk")
   @Export("onResize")
   public Object[] onResize;
   @ObfuscatedName("fn")
   @Export("onStockTransmit")
   public Object[] onStockTransmit;
   @ObfuscatedName("fh")
   public Object[] field3582;
   @ObfuscatedName("fi")
   public Object[] field3610;
   @ObfuscatedName("fo")
   @Export("cs1Instructions")
   public int[][] cs1Instructions;
   @ObfuscatedName("fa")
   @Export("cs1Comparisons")
   public int[] cs1Comparisons;
   @ObfuscatedName("fy")
   @Export("cs1ComparisonValues")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("ff")
   @ObfuscatedGetter(
      intValue = 2025203217
   )
   @Export("mouseOverRedirect")
   public int mouseOverRedirect;
   @ObfuscatedName("fs")
   @Export("spellName")
   public String spellName;
   @ObfuscatedName("fw")
   @Export("buttonText")
   public String buttonText;
   @ObfuscatedName("fu")
   @Export("itemIds")
   public int[] itemIds;
   @ObfuscatedName("fv")
   @Export("itemQuantities")
   public int[] itemQuantities;
   @ObfuscatedName("fd")
   @ObfuscatedGetter(
      intValue = -1746692719
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("fq")
   @ObfuscatedGetter(
      intValue = -1244104309
   )
   @Export("itemQuantity")
   public int itemQuantity;
   @ObfuscatedName("fz")
   @ObfuscatedGetter(
      intValue = -1876833185
   )
   @Export("modelFrame")
   public int modelFrame;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = 473577105
   )
   @Export("modelFrameCycle")
   public int modelFrameCycle;
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "[Lkn;"
   )
   @Export("children")
   public Widget[] children;
   @ObfuscatedName("gj")
   @Export("containsMouse")
   public boolean containsMouse;
   @ObfuscatedName("gl")
   public boolean field3512;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = 925829199
   )
   public int field3626;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -269973479
   )
   public int field3627;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = -1863725053
   )
   public int field3628;
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = -1934618353
   )
   public int field3618;
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = 1358939361
   )
   @Export("rootIndex")
   public int rootIndex;
   @ObfuscatedName("gb")
   @ObfuscatedGetter(
      intValue = -511666151
   )
   @Export("cycle")
   public int cycle;
   @ObfuscatedName("gk")
   public int[] field3564;
   @ObfuscatedName("ge")
   @Export("noClickThrough")
   public boolean noClickThrough;
   @ObfuscatedName("gx")
   @Export("noScrollThrough")
   public boolean noScrollThrough;
   @ObfuscatedName("gm")
   @Export("prioritizeMenuEntry")
   public boolean prioritizeMenuEntry;

   static {
      field3472 = new class381(10, class379.field4437);
      field3478 = new class381(10, class379.field4437);
      field3479 = false;
   }

   public Widget() {
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field3515 = false;
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
      this.field3537 = 0;
      this.field3533 = 0;
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
      this.field3556 = -1;
      this.flags = 0;
      this.field3561 = false;
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
      this.field3512 = false;
      this.field3626 = -1;
      this.field3627 = 0;
      this.field3628 = 0;
      this.field3618 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "21"
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

         for(var3 = 0; var3 < var2; ++var3) {
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

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var1.readUnsignedShort();
            this.cs1Instructions[var4] = new int[var5];

            for(var6 = 0; var6 < var5; ++var6) {
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
         this.itemQuantities = new int[this.rawHeight * this.rawWidth];
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
         for(var8 = 0; var8 < 20; ++var8) {
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

         for(var8 = 0; var8 < 5; ++var8) {
            String var9 = var1.readStringCp1252NullTerminated();
            if (var9.length() > 0) {
               this.itemActions[var8] = var9;
               this.flags |= 1 << var8 + 23;
            }
         }
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

      if (this.type == 7) {
         this.itemIds = new int[this.rawHeight * this.rawWidth];
         this.itemQuantities = new int[this.rawHeight * this.rawWidth];
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

         for(var5 = 0; var5 < 5; ++var5) {
            String var10 = var1.readStringCp1252NullTerminated();
            if (var10.length() > 0) {
               this.itemActions[var5] = var10;
               this.flags |= 1 << var5 + 23;
            }
         }
      }

      if (this.type == 8) {
         this.text = var1.readStringCp1252NullTerminated();
      }

      if (this.buttonType == 2 || this.type == 2) {
         this.spellActionName = var1.readStringCp1252NullTerminated();
         this.spellName = var1.readStringCp1252NullTerminated();
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1051480625"
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
            this.field3537 = var1.readUnsignedShort();
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
         this.field3515 = var1.readUnsignedByte() == 1;
      }

      this.flags = var1.readMedium();
      this.dataText = var1.readStringCp1252NullTerminated();
      int var2 = var1.readUnsignedByte();
      if (var2 > 0) {
         this.actions = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)[Ljava/lang/Object;",
      garbageValue = "-938210783"
   )
   @Export("readListener")
   Object[] readListener(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 == 0) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
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

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)[I",
      garbageValue = "860367589"
   )
   @Export("readListenerTriggers")
   int[] readListenerTriggers(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.readInt();
         }

         return var3;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "1"
   )
   @Export("swapItems")
   public void swapItems(int var1, int var2) {
      int var3 = this.itemIds[var2];
      this.itemIds[var2] = this.itemIds[var1];
      this.itemIds[var1] = var3;
      var3 = this.itemQuantities[var2];
      this.itemQuantities[var2] = this.itemQuantities[var1];
      this.itemQuantities[var1] = var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(ZLdk;I)Lri;",
      garbageValue = "1242662266"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1, UrlRequester var2) {
      field3479 = false;
      if (this.field3518 != null) {
         SpritePixels var3 = this.method6066(var2);
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
         long var4 = ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
         SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
         if (var6 != null) {
            return var6;
         } else {
            var6 = FriendsList.SpriteBuffer_getSprite(MusicPatchPcmStream.Widget_spritesArchive, var7, 0);
            if (var6 == null) {
               field3479 = true;
               return null;
            } else {
               this.method6054(var6);
               Widget_cachedSprites.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ldk;I)Lri;",
      garbageValue = "-1623738556"
   )
   SpritePixels method6066(UrlRequester var1) {
      if (!this.method6053()) {
         return this.method6052(var1);
      } else {
         String var2 = this.field3518 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
         SpritePixels var3 = (SpritePixels)field3478.method7208(var2);
         if (var3 == null) {
            SpritePixels var4 = this.method6052(var1);
            if (var4 != null) {
               var3 = var4.method8824();
               this.method6054(var3);
               field3478.method7209(var2, var3);
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ldk;I)Lri;",
      garbageValue = "86850697"
   )
   SpritePixels method6052(UrlRequester var1) {
      if (this.field3518 != null && var1 != null) {
         class297 var2 = (class297)field3472.method7208(this.field3518);
         if (var2 == null) {
            var2 = new class297(this.field3518, var1);
            field3472.method7209(this.field3518, var2);
         }

         return var2.method5722();
      } else {
         return null;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "884213966"
   )
   boolean method6053() {
      return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lri;I)V",
      garbageValue = "332117803"
   )
   void method6054(SpritePixels var1) {
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

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Lnl;",
      garbageValue = "-576566163"
   )
   @Export("getFont")
   public Font getFont() {
      field3479 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            var1 = ByteArrayPool.method7165(MusicPatchPcmStream.Widget_spritesArchive, WorldMapManager.Widget_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               Widget_cachedFonts.put(var1, (long)this.fontId);
            } else {
               field3479 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IB)Lri;",
      garbageValue = "56"
   )
   @Export("getInventorySprite")
   public SpritePixels getInventorySprite(int var1) {
      field3479 = false;
      if (var1 >= 0 && var1 < this.inventorySprites.length) {
         int var2 = this.inventorySprites[var1];
         if (var2 == -1) {
            return null;
         } else {
            SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
            if (var3 != null) {
               return var3;
            } else {
               var3 = FriendsList.SpriteBuffer_getSprite(MusicPatchPcmStream.Widget_spritesArchive, var2, 0);
               if (var3 != null) {
                  Widget_cachedSprites.put(var3, (long)var2);
               } else {
                  field3479 = true;
               }

               return var3;
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lgg;IZLks;I)Lha;",
      garbageValue = "-1838571698"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
      field3479 = false;
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
      } else if (var5 == 1 && var6 == -1) {
         return null;
      } else {
         Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16)));
         if (var7 == null) {
            ModelData var8;
            if (var5 == 1) {
               var8 = ModelData.ModelData_get(class188.Widget_modelsArchive, var6, 0);
               if (var8 == null) {
                  field3479 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if (var5 == 2) {
               var8 = HealthBarDefinition.getNpcDefinition(var6).getModelData();
               if (var8 == null) {
                  field3479 = true;
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
                  field3479 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if (var5 == 4) {
               ItemComposition var9 = MidiPcmStream.ItemDefinition_get(var6);
               var8 = var9.getModelData(10);
               if (var8 == null) {
                  field3479 = true;
                  return null;
               }

               var7 = var8.toModel(var9.field2171 + 64, var9.field2183 * 5 + 768, -50, -10, -50);
            }

            Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16)));
         }

         if (var1 != null) {
            var7 = var1.transformWidgetModel(var7, var2);
         }

         return var7;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(ZS)Lkl;",
      garbageValue = "-5853"
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

               for(int var10 = 0; var10 < var7.subHeight; ++var10) {
                  int var11 = 0;
                  int var12 = var7.subWidth;

                  int var13;
                  for(var13 = 0; var13 < var7.subWidth; ++var13) {
                     if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
                        var11 = var13;
                        break;
                     }
                  }

                  for(var13 = var7.subWidth - 1; var13 >= var11; --var13) {
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

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "262512640"
   )
   @Export("setAction")
   public void setAction(int var1, String var2) {
      if (this.actions == null || this.actions.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if (this.actions != null) {
            for(int var4 = 0; var4 < this.actions.length; ++var4) {
               var3[var4] = this.actions[var4];
            }
         }

         this.actions = var3;
      }

      this.actions[var1] = var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "736047854"
   )
   public boolean method6108() {
      return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-421868624"
   )
   public boolean method6061() {
      return this.type == 11 || this.type == 12;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldk;J)V"
   )
   public void method6062(String var1, UrlRequester var2, long var3) {
      if (this.type == 11 && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3481 = new class162();
         if (!this.field3481.method3271(var1, var2)) {
            this.field3481 = null;
         } else {
            if (this.field3553 == null || this.field3629 == null) {
               this.method6185();
            }

         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2014991260"
   )
   void method6185() {
      this.field3553 = new HashMap();
      this.field3629 = new HashMap();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "49"
   )
   public void method6074(int var1, int var2) {
      if (this.type == 11) {
         if (this.field3553 == null) {
            this.method6185();
         }

         this.field3553.put(var1, var2);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)V",
      garbageValue = "0"
   )
   public void method6065(String var1, int var2) {
      if (this.type == 11) {
         if (this.field3629 == null) {
            this.method6185();
         }

         this.field3629.put(var1, var2);
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-858511397"
   )
   public boolean method6075() {
      return this.field3556 == 2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "-45"
   )
   public int method6067(String var1) {
      return this.type == 11 && this.field3481 != null && this.method6075() ? this.field3481.method3274(var1) : -1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "0"
   )
   public String method6136(String var1) {
      return this.type == 11 && this.field3481 != null && this.method6075() ? this.field3481.method3275(var1) : null;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public int method6069() {
      return this.field3629 != null && this.field3629.size() > 0 ? 1 : 0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "421171702"
   )
   public int method6070() {
      if (this.type == 11 && this.field3481 != null && this.field3629 != null && !this.field3629.isEmpty()) {
         String var1 = this.field3481.method3278();
         return var1 != null && this.field3629.containsKey(this.field3481.method3278()) ? (Integer)this.field3629.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public String method6071() {
      if (this.type == 11 && this.field3481 != null) {
         String var1 = this.field3481.method3278();
         Iterator var2 = this.field3481.method3279().iterator();

         while(var2.hasNext()) {
            class172 var3 = (class172)var2.next();
            String var4 = String.format("%%%S%%", var3.method3385());
            if (var3.vmethod3379() == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod3378()));
            } else {
               var1.replaceAll(var4, var3.vmethod3380());
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1380976625"
   )
   public int[] method6132() {
      if (this.type == 11 && this.field3481 != null) {
         int[] var1 = new int[3];
         int var2 = 0;
         Iterator var3 = this.field3481.method3279().iterator();

         while(var3.hasNext()) {
            class172 var4 = (class172)var3.next();
            if (!var4.method3385().equals("user_id")) {
               if (var4.vmethod3379() != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod3378();
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ldk;I)Z",
      garbageValue = "1170807425"
   )
   public boolean method6073(UrlRequester var1) {
      if (this.type == 11 && this.field3481 != null) {
         this.field3481.method3272(var1);
         if (this.field3481.method3310() != this.field3556) {
            this.field3556 = this.field3481.method3310();
            if (this.field3556 >= 100) {
               return true;
            }

            if (this.field3556 == 2) {
               this.method6130();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-584466588"
   )
   void method6130() {
      this.noClickThrough = true;
      ArrayList var1 = this.field3481.method3276();
      ArrayList var2 = this.field3481.method3325();
      int var3 = var1.size() + var2.size();
      this.children = new Widget[var3];
      int var4 = 0;

      Iterator var5;
      Widget var7;
      for(var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class167 var6 = (class167)var5.next();
         var7 = ItemComposition.method3845(5, this, var4, 0, 0, 0, 0, var6.field1814);
         var7.field3518 = var6.field1815.method2716();
         class297 var8 = new class297(var6.field1815);
         field3472.method7209(var7.field3518, var8);
      }

      for(var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class168 var9 = (class168)var5.next();
         var7 = ItemComposition.method3845(4, this, var4, 0, 0, 0, 0, var9.field1816);
         var7.text = var9.field1818;
         var7.fontId = (Integer)this.field3553.get(var9.field1822);
         var7.textXAlignment = var9.field1820;
         var7.textYAlignment = var9.field1821;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "905045375"
   )
   public void method6120() {
      this.field3495 = new class298();

      for(int var1 = 1; var1 <= 12; ++var1) {
         this.field3495.field3411.method406(var1, 0);
      }

      for(char var2 = 0; var2 < ' '; ++var2) {
         this.field3495.field3411.method407(var2, 0);
      }

      this.field3495.field3411.method407('\u0080', 0);
      this.field3495.field3411.method406(82, 2);
      this.field3495.field3411.method406(81, 2);
      this.field3495.field3411.method406(86, 2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Lkk;",
      garbageValue = "-59"
   )
   public class300 method6076() {
      return this.field3495 != null ? this.field3495.field3419 : null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(S)Lkp;",
      garbageValue = "137"
   )
   public class295 method6153() {
      return this.field3495 != null ? this.field3495.field3410 : null;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lah;",
      garbageValue = "-1344349673"
   )
   public class28 method6078() {
      return this.field3495 != null ? this.field3495.field3411 : null;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)Lkx;",
      garbageValue = "986389984"
   )
   public class298 method6079() {
      return this.field3495;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lkk;I)Z",
      garbageValue = "-1888610169"
   )
   boolean method6092(class300 var1) {
      boolean var2 = false;
      if (this.text != null && !this.text.isEmpty()) {
         var2 |= var1.method5769(class82.method2229(this.text));
         this.text = "";
      }

      if (this.text2 != null && !this.text2.isEmpty()) {
         var2 |= var1.method5790(class82.method2229(this.text2));
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2126650743"
   )
   public boolean method6125() {
      class300 var1 = this.method6076();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.method5906() && this.fontId != -1) {
            int var3 = var1.method5824();
            int var4 = var1.method5892();
            int var5 = var1.method5898();
            int var6 = var1.method5821();
            Font var7 = this.getFont();
            if (var7 != null) {
               var2 |= var1.method5771(var7);
               var2 |= this.method6092(var1);
               var2 |= var1.method5946(var3, var4);
               var2 |= var1.method5791(var5, var6);
            }
         } else if (var1.method5906()) {
            var2 |= this.method6092(var1);
         }

         var1.method5945();
         return var2;
      }
   }
}
