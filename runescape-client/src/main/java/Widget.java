import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Widget")
public class Widget extends Node {
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static AbstractArchive field3531;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("Widget_spritesArchive")
   static AbstractArchive Widget_spritesArchive;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("Widget_cachedSprites")
   static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("Widget_cachedModels")
   static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("Widget_cachedFonts")
   static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("Widget_cachedSpriteMasks")
   static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   static class384 field3537;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   static class384 field3538;
   @ObfuscatedName("ag")
   public static boolean field3539;
   @ObfuscatedName("az")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1023837327
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -915599827
   )
   @Export("childIndex")
   public int childIndex = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1540152617
   )
   @Export("type")
   public int type;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -822804071
   )
   @Export("buttonType")
   public int buttonType = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1064789039
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 867935181
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1053685537
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 783027001
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 774250311
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1569341613
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1295682743
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 930045125
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -622646443
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 2086303241
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1365086685
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1832001725
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 882604251
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1405484187
   )
   public int field3661 = 1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -289010725
   )
   public int field3559 = 1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 8537723
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("bl")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -2078533729
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 163430389
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1494857505
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -319102043
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1891121533
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -437343193
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -441956647
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 592749823
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("ba")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   @Export("fillMode")
   public FillMode fillMode;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1450406977
   )
   @Export("transparencyTop")
   public int transparencyTop;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1316132639
   )
   @Export("transparencyBot")
   public int transparencyBot;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1717395815
   )
   @Export("lineWid")
   public int lineWid;
   @ObfuscatedName("bb")
   public boolean field3575;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 659533181
   )
   @Export("spriteId2")
   public int spriteId2;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1847696179
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("bd")
   public String field3578;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 416928349
   )
   @Export("spriteAngle")
   public int spriteAngle;
   @ObfuscatedName("cl")
   @Export("spriteTiling")
   public boolean spriteTiling;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1300355189
   )
   @Export("outline")
   public int outline;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -1319117017
   )
   @Export("spriteShadow")
   public int spriteShadow;
   @ObfuscatedName("cw")
   @Export("spriteFlipV")
   public boolean spriteFlipV;
   @ObfuscatedName("cx")
   @Export("spriteFlipH")
   public boolean spriteFlipH;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -824466597
   )
   @Export("modelType")
   public int modelType;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -1902209067
   )
   @Export("modelId")
   public int modelId;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -1452200045
   )
   @Export("modelType2")
   int modelType2;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 1448865917
   )
   @Export("modelId2")
   int modelId2;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 167495965
   )
   @Export("sequenceId")
   public int sequenceId;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1094018507
   )
   @Export("sequenceId2")
   public int sequenceId2;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1865914977
   )
   @Export("modelOffsetX")
   public int modelOffsetX;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -538253409
   )
   @Export("modelOffsetY")
   public int modelOffsetY;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 413961515
   )
   @Export("modelAngleX")
   public int modelAngleX;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1558449129
   )
   @Export("modelAngleY")
   public int modelAngleY;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -2125848423
   )
   @Export("modelAngleZ")
   public int modelAngleZ;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -1310127279
   )
   @Export("modelZoom")
   public int modelZoom;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1976334363
   )
   public int field3659;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1603764683
   )
   public int field3598;
   @ObfuscatedName("cv")
   @Export("modelOrthog")
   public boolean modelOrthog;
   @ObfuscatedName("cz")
   @Export("modelTransparency")
   public boolean modelTransparency;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 459312063
   )
   @Export("itemQuantityMode")
   public int itemQuantityMode;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 1520551125
   )
   @Export("fontId")
   public int fontId;
   @ObfuscatedName("ck")
   @Export("text")
   public String text;
   @ObfuscatedName("ci")
   @Export("text2")
   public String text2;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 428775753
   )
   @Export("textLineHeight")
   public int textLineHeight;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = 1127336945
   )
   @Export("textXAlignment")
   public int textXAlignment;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = 2127389397
   )
   @Export("textYAlignment")
   public int textYAlignment;
   @ObfuscatedName("de")
   @Export("textShadowed")
   public boolean textShadowed;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 1603100581
   )
   @Export("paddingX")
   public int paddingX;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = 1637251583
   )
   @Export("paddingY")
   public int paddingY;
   @ObfuscatedName("dm")
   @Export("inventoryXOffsets")
   public int[] inventoryXOffsets;
   @ObfuscatedName("dv")
   @Export("inventoryYOffsets")
   public int[] inventoryYOffsets;
   @ObfuscatedName("ds")
   @Export("inventorySprites")
   public int[] inventorySprites;
   @ObfuscatedName("dc")
   @Export("itemActions")
   public String[] itemActions;
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   class163 field3615;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = -1290763787
   )
   int field3597;
   @ObfuscatedName("dy")
   HashMap field3617;
   @ObfuscatedName("dx")
   HashMap field3618;
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   class301 field3619;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -149949271
   )
   @Export("flags")
   public int flags;
   @ObfuscatedName("dq")
   public boolean field3621;
   @ObfuscatedName("db")
   public byte[][] field3622;
   @ObfuscatedName("dt")
   public byte[][] field3623;
   @ObfuscatedName("dp")
   public int[] field3630;
   @ObfuscatedName("du")
   public int[] field3625;
   @ObfuscatedName("ew")
   @Export("dataText")
   public String dataText;
   @ObfuscatedName("ey")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("parent")
   public Widget parent;
   @ObfuscatedName("es")
   @ObfuscatedGetter(
      intValue = 82868583
   )
   @Export("dragZoneSize")
   public int dragZoneSize;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = 1267822615
   )
   @Export("dragThreshold")
   public int dragThreshold;
   @ObfuscatedName("eh")
   @Export("isScrollBar")
   public boolean isScrollBar;
   @ObfuscatedName("ev")
   @Export("spellActionName")
   public String spellActionName;
   @ObfuscatedName("eq")
   @Export("hasListener")
   public boolean hasListener;
   @ObfuscatedName("ee")
   @Export("onLoad")
   public Object[] onLoad;
   @ObfuscatedName("em")
   @Export("onClick")
   public Object[] onClick;
   @ObfuscatedName("ea")
   @Export("onClickRepeat")
   public Object[] onClickRepeat;
   @ObfuscatedName("ex")
   @Export("onRelease")
   public Object[] onRelease;
   @ObfuscatedName("er")
   @Export("onHold")
   public Object[] onHold;
   @ObfuscatedName("ec")
   @Export("onMouseOver")
   public Object[] onMouseOver;
   @ObfuscatedName("eb")
   @Export("onMouseRepeat")
   public Object[] onMouseRepeat;
   @ObfuscatedName("ek")
   @Export("onMouseLeave")
   public Object[] onMouseLeave;
   @ObfuscatedName("ej")
   @Export("onDrag")
   public Object[] onDrag;
   @ObfuscatedName("ep")
   @Export("onDragComplete")
   public Object[] onDragComplete;
   @ObfuscatedName("en")
   @Export("onTargetEnter")
   public Object[] onTargetEnter;
   @ObfuscatedName("eg")
   @Export("onTargetLeave")
   public Object[] onTargetLeave;
   @ObfuscatedName("ez")
   @Export("onVarTransmit")
   public Object[] onVarTransmit;
   @ObfuscatedName("ef")
   @Export("varTransmitTriggers")
   public int[] varTransmitTriggers;
   @ObfuscatedName("ei")
   @Export("onInvTransmit")
   public Object[] onInvTransmit;
   @ObfuscatedName("ed")
   @Export("invTransmitTriggers")
   public int[] invTransmitTriggers;
   @ObfuscatedName("eu")
   @Export("onStatTransmit")
   public Object[] onStatTransmit;
   @ObfuscatedName("el")
   @Export("statTransmitTriggers")
   public int[] statTransmitTriggers;
   @ObfuscatedName("fn")
   @Export("onTimer")
   public Object[] onTimer;
   @ObfuscatedName("fb")
   @Export("onOp")
   public Object[] onOp;
   @ObfuscatedName("fa")
   public Object[] field3654;
   @ObfuscatedName("fo")
   @Export("onScroll")
   public Object[] onScroll;
   @ObfuscatedName("fc")
   @Export("onChatTransmit")
   public Object[] onChatTransmit;
   @ObfuscatedName("fd")
   @Export("onKey")
   public Object[] onKey;
   @ObfuscatedName("fr")
   public Object[] field3658;
   @ObfuscatedName("fk")
   public Object[] field3653;
   @ObfuscatedName("fp")
   @Export("onFriendTransmit")
   public Object[] onFriendTransmit;
   @ObfuscatedName("fg")
   @Export("onClanTransmit")
   public Object[] onClanTransmit;
   @ObfuscatedName("ff")
   public Object[] field3553;
   @ObfuscatedName("ft")
   public Object[] field3663;
   @ObfuscatedName("fs")
   @Export("onMiscTransmit")
   public Object[] onMiscTransmit;
   @ObfuscatedName("fh")
   @Export("onDialogAbort")
   public Object[] onDialogAbort;
   @ObfuscatedName("fu")
   @Export("onSubChange")
   public Object[] onSubChange;
   @ObfuscatedName("fy")
   @Export("onResize")
   public Object[] onResize;
   @ObfuscatedName("fl")
   @Export("onStockTransmit")
   public Object[] onStockTransmit;
   @ObfuscatedName("fv")
   public Object[] field3567;
   @ObfuscatedName("fz")
   public Object[] field3670;
   @ObfuscatedName("fx")
   @Export("cs1Instructions")
   public int[][] cs1Instructions;
   @ObfuscatedName("fq")
   @Export("cs1Comparisons")
   public int[] cs1Comparisons;
   @ObfuscatedName("fi")
   @Export("cs1ComparisonValues")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("fm")
   @ObfuscatedGetter(
      intValue = 1476120207
   )
   @Export("mouseOverRedirect")
   public int mouseOverRedirect;
   @ObfuscatedName("fe")
   @Export("spellName")
   public String spellName;
   @ObfuscatedName("fj")
   @Export("buttonText")
   public String buttonText;
   @ObfuscatedName("fw")
   @Export("itemIds")
   public int[] itemIds;
   @ObfuscatedName("gf")
   @Export("itemQuantities")
   public int[] itemQuantities;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = 1983678461
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 390571909
   )
   @Export("itemQuantity")
   public int itemQuantity;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = -606599493
   )
   @Export("modelFrame")
   public int modelFrame;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = -736025567
   )
   @Export("modelFrameCycle")
   public int modelFrameCycle;
   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "[Lkd;"
   )
   @Export("children")
   public Widget[] children;
   @ObfuscatedName("gq")
   @Export("containsMouse")
   public boolean containsMouse;
   @ObfuscatedName("gh")
   public boolean field3610;
   @ObfuscatedName("ge")
   @ObfuscatedGetter(
      intValue = 1448377925
   )
   public int field3572;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = 1149656689
   )
   public int field3645;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = 1463799561
   )
   public int field3668;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = 43126131
   )
   public int field3637;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -1373070299
   )
   @Export("rootIndex")
   public int rootIndex;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -1786479895
   )
   @Export("cycle")
   public int cycle;
   @ObfuscatedName("gr")
   public int[] field3692;
   @ObfuscatedName("gk")
   @Export("noClickThrough")
   public boolean noClickThrough;
   @ObfuscatedName("ga")
   @Export("noScrollThrough")
   public boolean noScrollThrough;
   @ObfuscatedName("gb")
   @Export("prioritizeMenuEntry")
   public boolean prioritizeMenuEntry;

   static {
      field3537 = new class384(10, class382.field4481);
      field3538 = new class384(10, class382.field4481);
      field3539 = false;
   }

   public Widget() {
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field3575 = false;
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
      this.field3659 = 0;
      this.field3598 = 0;
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
      this.field3597 = -1;
      this.flags = 0;
      this.field3621 = false;
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
      this.field3610 = false;
      this.field3572 = -1;
      this.field3645 = 0;
      this.field3668 = 0;
      this.field3637 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1229740727"
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
         this.itemIds = new int[this.rawHeight * this.rawWidth];
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
         this.itemIds = new int[this.rawWidth * this.rawHeight];
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1277260307"
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
            this.field3659 = var1.readUnsignedShort();
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
         this.field3575 = var1.readUnsignedByte() == 1;
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

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)[Ljava/lang/Object;",
      garbageValue = "818571215"
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)[I",
      garbageValue = "-2028965752"
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

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-108"
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ZLdl;I)Lrx;",
      garbageValue = "1816388084"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1, UrlRequester var2) {
      field3539 = false;
      if (this.field3578 != null) {
         SpritePixels var3 = this.method6158(var2);
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
         long var4 = ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
         SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
         if (var6 != null) {
            return var6;
         } else {
            var6 = class125.SpriteBuffer_getSprite(Widget_spritesArchive, var7, 0);
            if (var6 == null) {
               field3539 = true;
               return null;
            } else {
               this.method6154(var6);
               Widget_cachedSprites.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Ldl;I)Lrx;",
      garbageValue = "-740634830"
   )
   SpritePixels method6158(UrlRequester var1) {
      if (!this.method6160()) {
         return this.method6186(var1);
      } else {
         String var2 = this.field3578 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
         SpritePixels var3 = (SpritePixels)field3538.method7386(var2);
         if (var3 == null) {
            SpritePixels var4 = this.method6186(var1);
            if (var4 != null) {
               var3 = var4.method9002();
               this.method6154(var3);
               field3538.method7374(var2, var3);
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Ldl;I)Lrx;",
      garbageValue = "-2105744514"
   )
   SpritePixels method6186(UrlRequester var1) {
      if (this.field3578 != null && var1 != null) {
         class300 var2 = (class300)field3537.method7386(this.field3578);
         if (var2 == null) {
            var2 = new class300(this.field3578, var1);
            field3537.method7374(this.field3578, var2);
         }

         return var2.method5840();
      } else {
         return null;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1265431805"
   )
   boolean method6160() {
      return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lrx;I)V",
      garbageValue = "-1471654768"
   )
   void method6154(SpritePixels var1) {
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

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Lnv;",
      garbageValue = "1347355979"
   )
   @Export("getFont")
   public Font getFont() {
      field3539 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            var1 = Timer.method7358(Widget_spritesArchive, PacketBufferNode.Widget_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               Widget_cachedFonts.put(var1, (long)this.fontId);
            } else {
               field3539 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lrx;",
      garbageValue = "-1594333003"
   )
   @Export("getInventorySprite")
   public SpritePixels getInventorySprite(int var1) {
      field3539 = false;
      if (var1 >= 0 && var1 < this.inventorySprites.length) {
         int var2 = this.inventorySprites[var1];
         if (var2 == -1) {
            return null;
         } else {
            SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
            if (var3 != null) {
               return var3;
            } else {
               var3 = class125.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0);
               if (var3 != null) {
                  Widget_cachedSprites.put(var3, (long)var2);
               } else {
                  field3539 = true;
               }

               return var3;
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lga;IZLko;Lgz;Lgp;I)Lhh;",
      garbageValue = "-1671121568"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewStuff var6) {
      field3539 = false;
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
         long var9 = (long)(var8 + (var7 << 16));
         if (var6 != null) {
            var9 |= var6.field2018 << 20;
         }

         Model var11 = (Model)Widget_cachedModels.get(var9);
         if (var11 == null) {
            ModelData var12 = null;
            int var13 = 64;
            int var14 = 768;
            switch (var7) {
               case 1:
                  var12 = ModelData.ModelData_get(field3531, var8, 0);
                  break;
               case 2:
                  var12 = class129.getNpcDefinition(var8).method3666((NewStuff)null);
                  break;
               case 3:
                  var12 = var4 != null ? var4.getModelData() : null;
                  break;
               case 4:
                  ItemComposition var15 = NPCComposition.ItemDefinition_get(var8);
                  var12 = var15.getModelData(10);
                  var13 += var15.field2209;
                  var14 += var15.field2222;
               case 5:
               default:
                  break;
               case 6:
                  var12 = class129.getNpcDefinition(var8).method3666(var6);
            }

            if (var12 == null) {
               field3539 = true;
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lkv;",
      garbageValue = "211480"
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
         long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((long)this.spriteShadow << 40);
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;S)V",
      garbageValue = "-14056"
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-74"
   )
   public boolean method6298() {
      return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "366635379"
   )
   public boolean method6225() {
      return this.type == 11 || this.type == 12;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldl;J)V"
   )
   public void method6285(String var1, UrlRequester var2, long var3) {
      if (this.type == 11 && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3615 = new class163();
         if (!this.field3615.method3370(var1, var2)) {
            this.field3615 = null;
         } else {
            if (this.field3617 == null || this.field3618 == null) {
               this.method6221();
            }

         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "296640153"
   )
   void method6221() {
      this.field3617 = new HashMap();
      this.field3618 = new HashMap();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-839153934"
   )
   public void method6170(int var1, int var2) {
      if (this.type == 11) {
         if (this.field3617 == null) {
            this.method6221();
         }

         this.field3617.put(var1, var2);
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-705655664"
   )
   public void method6162(String var1, int var2) {
      if (this.type == 11) {
         if (this.field3618 == null) {
            this.method6221();
         }

         this.field3618.put(var1, var2);
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-688445848"
   )
   public boolean method6172() {
      return this.field3597 == 2;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "113"
   )
   public int method6173(String var1) {
      return this.type == 11 && this.field3615 != null && this.method6172() ? this.field3615.method3373(var1) : -1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "89"
   )
   public String method6171(String var1) {
      return this.type == 11 && this.field3615 != null && this.method6172() ? this.field3615.method3374(var1) : null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-1"
   )
   public int method6174() {
      return this.field3618 != null && this.field3618.size() > 0 ? 1 : 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-116"
   )
   public int method6176() {
      if (this.type == 11 && this.field3615 != null && this.field3618 != null && !this.field3618.isEmpty()) {
         String var1 = this.field3615.method3377();
         return var1 != null && this.field3618.containsKey(this.field3615.method3377()) ? (Integer)this.field3618.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "5"
   )
   public String method6177() {
      if (this.type == 11 && this.field3615 != null) {
         String var1 = this.field3615.method3377();
         Iterator var2 = this.field3615.method3378().iterator();

         while(var2.hasNext()) {
            class173 var3 = (class173)var2.next();
            String var4 = String.format("%%%S%%", var3.method3503());
            if (var3.vmethod3504() == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod3511()));
            } else {
               var1.replaceAll(var4, var3.vmethod3505());
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "-14"
   )
   public int[] method6178() {
      if (this.type == 11 && this.field3615 != null) {
         int[] var1 = new int[3];
         int var2 = 0;
         Iterator var3 = this.field3615.method3378().iterator();

         while(var3.hasNext()) {
            class173 var4 = (class173)var3.next();
            if (!var4.method3503().equals("user_id")) {
               if (var4.vmethod3504() != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod3511();
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Ldl;B)Z",
      garbageValue = "71"
   )
   public boolean method6281(UrlRequester var1) {
      if (this.type == 11 && this.field3615 != null) {
         this.field3615.method3371(var1);
         if (this.field3615.method3372() != this.field3597) {
            this.field3597 = this.field3615.method3372();
            if (this.field3597 >= 100) {
               return true;
            }

            if (this.field3597 == 2) {
               this.method6180();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1620784087"
   )
   void method6180() {
      this.noClickThrough = true;
      ArrayList var1 = this.field3615.method3383();
      ArrayList var2 = this.field3615.method3376();
      int var3 = var1.size() + var2.size();
      this.children = new Widget[var3];
      int var4 = 0;

      Iterator var5;
      Widget var7;
      for(var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class168 var6 = (class168)var5.next();
         var7 = DynamicObject.method2137(5, this, var4, 0, 0, 0, 0, var6.field1868);
         var7.field3578 = var6.field1867.method2788();
         class300 var8 = new class300(var6.field1867);
         field3537.method7374(var7.field3578, var8);
      }

      for(var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class169 var9 = (class169)var5.next();
         var7 = DynamicObject.method2137(4, this, var4, 0, 0, 0, 0, var9.field1873);
         var7.text = var9.field1872;
         var7.fontId = (Integer)this.field3617.get(var9.field1875);
         var7.textXAlignment = var9.field1876;
         var7.textYAlignment = var9.field1877;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "849668334"
   )
   public void method6261() {
      this.field3619 = new class301();

      for(int var1 = 1; var1 <= 12; ++var1) {
         this.field3619.field3463.method400(var1, 0);
      }

      for(char var2 = 0; var2 < ' '; ++var2) {
         this.field3619.field3463.method394(var2, 0);
      }

      this.field3619.field3463.method394('\u0080', 0);
      this.field3619.field3463.method400(82, 2);
      this.field3619.field3463.method400(81, 2);
      this.field3619.field3463.method400(86, 2);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)Lki;",
      garbageValue = "1153387619"
   )
   public class303 method6167() {
      return this.field3619 != null ? this.field3619.field3466 : null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)Lkb;",
      garbageValue = "65"
   )
   public class298 method6293() {
      return this.field3619 != null ? this.field3619.field3464 : null;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Lao;",
      garbageValue = "406803698"
   )
   public class28 method6187() {
      return this.field3619 != null ? this.field3619.field3463 : null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lkt;",
      garbageValue = "-1759903354"
   )
   public class301 method6185() {
      return this.field3619;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lki;I)Z",
      garbageValue = "381752900"
   )
   boolean method6291(class303 var1) {
      boolean var2 = false;
      if (this.text != null && !this.text.isEmpty()) {
         var2 |= var1.method5882(class109.method2782(this.text));
         this.text = "";
      }

      if (this.text2 != null && !this.text2.isEmpty()) {
         var2 |= var1.method6124(class109.method2782(this.text2));
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1849924136"
   )
   public boolean method6242() {
      class303 var1 = this.method6167();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.method6062() && this.fontId != -1) {
            int var3 = var1.method5937();
            int var4 = var1.method5938();
            int var5 = var1.method5913();
            int var6 = var1.method5934();
            Font var7 = this.getFont();
            if (var7 != null) {
               var2 |= var1.method5884(var7);
               var2 |= this.method6291(var1);
               var2 |= var1.method5889(var3, var4);
               var2 |= var1.method5904(var5, var6);
            }
         } else if (var1.method6062()) {
            var2 |= this.method6291(var1);
         }

         var1.method5879();
         return var2;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIZB)Ljava/lang/String;",
      garbageValue = "32"
   )
   static String method6300(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; var4 != 0; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = '+';

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var0 * var1;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 87);
               } else {
                  var5[var6] = (char)(var8 + 48);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1630385377"
   )
   @Export("Widget_runOnTargetLeave")
   static void Widget_runOnTargetLeave() {
      if (Client.isSpellSelected) {
         Widget var0 = AttackOption.getWidgetChild(class358.selectedSpellWidget, Client.selectedSpellChildIndex);
         if (var0 != null && var0.onTargetLeave != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.widget = var0;
            var1.args = var0.onTargetLeave;
            WorldMapElement.runScriptEvent(var1);
         }

         Client.selectedSpellItemId = -1;
         Client.isSpellSelected = false;
         class69.invalidateWidget(var0);
      }
   }
}
