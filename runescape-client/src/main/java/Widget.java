import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("Widget")
public class Widget extends Node {
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("Widget_archive")
   public static AbstractArchive Widget_archive;
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("Widget_cachedSprites")
   static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("Widget_cachedModels")
   static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("Widget_cachedFonts")
   static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("Widget_cachedSpriteMasks")
   static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Lpa;"
   )
   static class411 field3598;
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lpa;"
   )
   static class411 field3633;
   @ObfuscatedName("bx")
   public static boolean field3600;
   @ObfuscatedName("be")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1486786309
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 112312013
   )
   @Export("childIndex")
   public int childIndex = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 1659025395
   )
   @Export("type")
   public int type;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 260373891
   )
   @Export("buttonType")
   public int buttonType = 0;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1123460323
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -660386297
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1642335409
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1868684071
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1242256455
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1805858379
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 2060114855
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 590805653
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -1302734365
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -319445197
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 779262443
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1387970291
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -175088023
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -2251387
   )
   public int field3619 = 1;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 701370315
   )
   public int field3620 = 1;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 1437254475
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("cy")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -1598973959
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 614514497
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 83109607
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 2136913233
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 1020923441
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -290912119
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -517257297
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 1954010095
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("ck")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ltv;"
   )
   @Export("fillMode")
   public FillMode fillMode;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -252985877
   )
   @Export("transparencyTop")
   public int transparencyTop;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1183866781
   )
   @Export("transparencyBot")
   public int transparencyBot;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1790024679
   )
   @Export("lineWid")
   public int lineWid;
   @ObfuscatedName("cn")
   public boolean field3658;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 712819103
   )
   @Export("spriteId2")
   public int spriteId2;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 86335445
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("co")
   public String field3693;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -428690419
   )
   @Export("spriteAngle")
   public int spriteAngle;
   @ObfuscatedName("dd")
   @Export("spriteTiling")
   public boolean spriteTiling;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 1429504887
   )
   @Export("outline")
   public int outline;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 1116641991
   )
   @Export("spriteShadow")
   public int spriteShadow;
   @ObfuscatedName("da")
   @Export("spriteFlipV")
   public boolean spriteFlipV;
   @ObfuscatedName("dt")
   @Export("spriteFlipH")
   public boolean spriteFlipH;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -2015482681
   )
   @Export("modelType")
   public int modelType;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = 52437899
   )
   @Export("modelId")
   public int modelId;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = -10425679
   )
   @Export("modelType2")
   int modelType2;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = 1204630069
   )
   @Export("modelId2")
   int modelId2;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = -1811319287
   )
   @Export("sequenceId")
   public int sequenceId;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 209572647
   )
   @Export("sequenceId2")
   public int sequenceId2;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 910361673
   )
   @Export("modelOffsetX")
   public int modelOffsetX;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 2134243185
   )
   @Export("modelOffsetY")
   public int modelOffsetY;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 1882890785
   )
   @Export("modelAngleX")
   public int modelAngleX;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = -1676195677
   )
   @Export("modelAngleY")
   public int modelAngleY;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = 1464089405
   )
   @Export("modelAngleZ")
   public int modelAngleZ;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      intValue = -797771265
   )
   @Export("modelZoom")
   public int modelZoom;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -1546296991
   )
   public int field3667;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = -205849923
   )
   public int field3659;
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Lmk;"
   )
   public PlayerComposition field3631;
   @ObfuscatedName("dg")
   @Export("modelOrthog")
   public boolean modelOrthog;
   @ObfuscatedName("de")
   @Export("modelTransparency")
   public boolean modelTransparency;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1042005455
   )
   @Export("itemQuantityMode")
   public int itemQuantityMode;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = 1075969391
   )
   @Export("fontId")
   public int fontId;
   @ObfuscatedName("ds")
   @Export("text")
   public String text;
   @ObfuscatedName("dr")
   @Export("text2")
   public String text2;
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = -577725377
   )
   @Export("textLineHeight")
   public int textLineHeight;
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = -45471049
   )
   @Export("textXAlignment")
   public int textXAlignment;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = -97667965
   )
   @Export("textYAlignment")
   public int textYAlignment;
   @ObfuscatedName("eu")
   @Export("textShadowed")
   public boolean textShadowed;
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lgi;"
   )
   class169 field3692;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 2144662483
   )
   int field3689;
   @ObfuscatedName("em")
   HashMap field3707;
   @ObfuscatedName("ea")
   HashMap field3674;
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   class325 field3675;
   @ObfuscatedName("ek")
   @ObfuscatedGetter(
      intValue = 1405882523
   )
   @Export("flags")
   public int flags;
   @ObfuscatedName("ec")
   public boolean field3677;
   @ObfuscatedName("el")
   public byte[][] field3678;
   @ObfuscatedName("ed")
   public byte[][] field3671;
   @ObfuscatedName("ep")
   public int[] field3639;
   @ObfuscatedName("ew")
   public int[] field3681;
   @ObfuscatedName("ex")
   @Export("dataText")
   public String dataText;
   @ObfuscatedName("ev")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("parent")
   public Widget parent;
   @ObfuscatedName("ey")
   @ObfuscatedGetter(
      intValue = 403399243
   )
   @Export("dragZoneSize")
   public int dragZoneSize;
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = 407242931
   )
   @Export("dragThreshold")
   public int dragThreshold;
   @ObfuscatedName("eq")
   @Export("isScrollBar")
   public boolean isScrollBar;
   @ObfuscatedName("fg")
   @Export("spellActionName")
   public String spellActionName;
   @ObfuscatedName("fa")
   @Export("hasListener")
   public boolean hasListener;
   @ObfuscatedName("fm")
   @Export("onLoad")
   public Object[] onLoad;
   @ObfuscatedName("fc")
   @Export("onClick")
   public Object[] onClick;
   @ObfuscatedName("fl")
   @Export("onClickRepeat")
   public Object[] onClickRepeat;
   @ObfuscatedName("fe")
   @Export("onRelease")
   public Object[] onRelease;
   @ObfuscatedName("fz")
   @Export("onHold")
   public Object[] onHold;
   @ObfuscatedName("fp")
   @Export("onMouseOver")
   public Object[] onMouseOver;
   @ObfuscatedName("fw")
   @Export("onMouseRepeat")
   public Object[] onMouseRepeat;
   @ObfuscatedName("ff")
   @Export("onMouseLeave")
   public Object[] onMouseLeave;
   @ObfuscatedName("ft")
   @Export("onDrag")
   public Object[] onDrag;
   @ObfuscatedName("fv")
   @Export("onDragComplete")
   public Object[] onDragComplete;
   @ObfuscatedName("fu")
   @Export("onTargetEnter")
   public Object[] onTargetEnter;
   @ObfuscatedName("fd")
   @Export("onTargetLeave")
   public Object[] onTargetLeave;
   @ObfuscatedName("fr")
   @Export("onVarTransmit")
   public Object[] onVarTransmit;
   @ObfuscatedName("fh")
   @Export("varTransmitTriggers")
   public int[] varTransmitTriggers;
   @ObfuscatedName("fj")
   @Export("onInvTransmit")
   public Object[] onInvTransmit;
   @ObfuscatedName("fo")
   @Export("invTransmitTriggers")
   public int[] invTransmitTriggers;
   @ObfuscatedName("fb")
   @Export("onStatTransmit")
   public Object[] onStatTransmit;
   @ObfuscatedName("fy")
   @Export("statTransmitTriggers")
   public int[] statTransmitTriggers;
   @ObfuscatedName("fx")
   @Export("onTimer")
   public Object[] onTimer;
   @ObfuscatedName("fq")
   @Export("onOp")
   public Object[] onOp;
   @ObfuscatedName("fi")
   public Object[] field3739;
   @ObfuscatedName("fs")
   @Export("onScroll")
   public Object[] onScroll;
   @ObfuscatedName("fn")
   @Export("onChatTransmit")
   public Object[] onChatTransmit;
   @ObfuscatedName("fk")
   @Export("onKey")
   public Object[] onKey;
   @ObfuscatedName("gw")
   public Object[] field3714;
   @ObfuscatedName("gd")
   public Object[] field3715;
   @ObfuscatedName("go")
   @Export("onFriendTransmit")
   public Object[] onFriendTransmit;
   @ObfuscatedName("gh")
   @Export("onClanTransmit")
   public Object[] onClanTransmit;
   @ObfuscatedName("ge")
   public Object[] field3718;
   @ObfuscatedName("gb")
   public Object[] field3719;
   @ObfuscatedName("gv")
   @Export("onMiscTransmit")
   public Object[] onMiscTransmit;
   @ObfuscatedName("ga")
   @Export("onDialogAbort")
   public Object[] onDialogAbort;
   @ObfuscatedName("gk")
   @Export("onSubChange")
   public Object[] onSubChange;
   @ObfuscatedName("gt")
   @Export("onResize")
   public Object[] onResize;
   @ObfuscatedName("gz")
   @Export("onStockTransmit")
   public Object[] onStockTransmit;
   @ObfuscatedName("gm")
   public Object[] field3725;
   @ObfuscatedName("gg")
   public Object[] field3703;
   @ObfuscatedName("gi")
   @Export("cs1Instructions")
   public int[][] cs1Instructions;
   @ObfuscatedName("gr")
   @Export("cs1Comparisons")
   public int[] cs1Comparisons;
   @ObfuscatedName("gc")
   @Export("cs1ComparisonValues")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = 1291355075
   )
   @Export("mouseOverRedirect")
   public int mouseOverRedirect;
   @ObfuscatedName("gp")
   public String field3731;
   @ObfuscatedName("gy")
   @Export("buttonText")
   public String buttonText;
   @ObfuscatedName("gf")
   @Export("itemIds")
   public int[] itemIds;
   @ObfuscatedName("gx")
   public int[] itemQuantities;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = 1705418949
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 886241183
   )
   @Export("itemQuantity")
   public int itemQuantity;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = 694669037
   )
   @Export("modelFrame")
   public int modelFrame;
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = 1626901995
   )
   @Export("modelFrameCycle")
   public int modelFrameCycle;
   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "[Lmb;"
   )
   @Export("children")
   public Widget[] children;
   @ObfuscatedName("he")
   public boolean field3740;
   @ObfuscatedName("ha")
   public boolean field3741;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = -169488509
   )
   public int field3742;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = 495401197
   )
   public int field3743;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = -1829233171
   )
   public int field3744;
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = -1098667907
   )
   public int field3601;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = 310782007
   )
   @Export("rootIndex")
   public int rootIndex;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = 1601831101
   )
   @Export("cycle")
   public int cycle;
   @ObfuscatedName("hc")
   public int[] field3669;
   @ObfuscatedName("hh")
   @Export("noClickThrough")
   public boolean noClickThrough;
   @ObfuscatedName("hw")
   @Export("noScrollThrough")
   public boolean noScrollThrough;
   @ObfuscatedName("hs")
   @Export("prioritizeMenuEntry")
   public boolean prioritizeMenuEntry;

   static {
      field3598 = new class411(10, class409.field4549);
      field3633 = new class411(10, class409.field4549);
      field3600 = false;
   }

   public Widget() {
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field3658 = false;
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
      this.field3667 = 0;
      this.field3659 = 0;
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
      this.field3689 = -1;
      this.flags = 0;
      this.field3677 = false;
      this.dataText = "";
      this.parent = null;
      this.dragZoneSize = 0;
      this.dragThreshold = 0;
      this.isScrollBar = false;
      this.spellActionName = "";
      this.hasListener = false;
      this.mouseOverRedirect = -1;
      this.field3731 = "";
      this.buttonText = "Ok";
      this.itemId = -1;
      this.itemQuantity = 0;
      this.modelFrame = 0;
      this.modelFrameCycle = 0;
      this.field3740 = false;
      this.field3741 = false;
      this.field3742 = -1;
      this.field3743 = 0;
      this.field3744 = 0;
      this.field3601 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-145893950"
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
      if (var3 > 0) {
         this.cs1Instructions = new int[var3][];

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readUnsignedShort();
            this.cs1Instructions[var4] = new int[var5];

            for(int var6 = 0; var6 < var5; ++var6) {
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
         this.field3731 = var1.readStringCp1252NullTerminated();
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
      descriptor = "(Ltz;I)V",
      garbageValue = "714197315"
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
            this.field3667 = var1.readUnsignedShort();
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
         this.field3658 = var1.readUnsignedByte() == 1;
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)[Ljava/lang/Object;",
      garbageValue = "399481851"
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)[I",
      garbageValue = "-1822709459"
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ZLea;I)Ltm;",
      garbageValue = "-1389466695"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1, UrlRequester var2) {
      field3600 = false;
      if (this.field3693 != null) {
         SpritePixels var3 = this.method6354(var2);
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
            var6 = class107.SpriteBuffer_getSprite(MenuAction.Widget_spritesArchive, var7, 0);
            if (var6 == null) {
               field3600 = true;
               return null;
            } else {
               this.method6357(var6);
               Widget_cachedSprites.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lea;B)Ltm;",
      garbageValue = "10"
   )
   SpritePixels method6354(UrlRequester var1) {
      if (!this.method6356()) {
         return this.method6438(var1);
      } else {
         String var2 = this.field3693 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
         SpritePixels var3 = (SpritePixels)field3633.method7714(var2);
         if (var3 == null) {
            SpritePixels var4 = this.method6438(var1);
            if (var4 != null) {
               var3 = var4.method9394();
               this.method6357(var3);
               field3633.method7696(var2, var3);
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lea;I)Ltm;",
      garbageValue = "69187803"
   )
   SpritePixels method6438(UrlRequester var1) {
      if (this.field3693 != null && var1 != null) {
         class324 var2 = (class324)field3598.method7714(this.field3693);
         if (var2 == null) {
            var2 = new class324(this.field3693, var1);
            field3598.method7696(this.field3693, var2);
         }

         return var2.method6005();
      } else {
         return null;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1715273921"
   )
   boolean method6356() {
      return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ltm;B)V",
      garbageValue = "-3"
   )
   void method6357(SpritePixels var1) {
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

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Lph;",
      garbageValue = "821843286"
   )
   @Export("getFont")
   public Font getFont() {
      field3600 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            var1 = Bounds.method8030(MenuAction.Widget_spritesArchive, class13.Widget_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               Widget_cachedFonts.put(var1, (long)this.fontId);
            } else {
               field3600 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lhy;IZLmk;Lhd;Lhs;B)Ljd;",
      garbageValue = "1"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewStuff var6) {
      field3600 = false;
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
         if (var6 != null && var6.field1990 && var7 == 6) {
            var7 = 3;
         }

         long var9 = (long)(var8 + (var7 << 16));
         if (var6 != null) {
            var9 |= var6.field1989 << 20;
         }

         Model var11 = (Model)Widget_cachedModels.get(var9);
         if (var11 == null) {
            ModelData var12 = null;
            int var13 = 64;
            int var14 = 768;
            switch (var7) {
               case 1:
                  var12 = ModelData.ModelData_get(class309.field3453, var8, 0);
                  break;
               case 2:
                  var12 = Bounds.getNpcDefinition(var8).method3692((NewStuff)null);
                  break;
               case 3:
                  var12 = var4 != null ? var4.getModelData() : null;
                  break;
               case 4:
                  ItemComposition var15 = class300.ItemDefinition_get(var8);
                  var12 = var15.getModelData(10);
                  var13 += var15.field2238;
                  var14 += var15.field2239;
               case 5:
               default:
                  break;
               case 6:
                  var12 = Bounds.getNpcDefinition(var8).method3692(var6);
            }

            if (var12 == null) {
               field3600 = true;
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

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lmc;",
      garbageValue = "78"
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
         long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39);
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "1"
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-777535745"
   )
   public boolean method6456() {
      return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1178243183"
   )
   public boolean method6363() {
      return this.type == 11 || this.type == 12;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lea;J)V"
   )
   public void method6386(String var1, UrlRequester var2, long var3) {
      if (this.type == 11 && var3 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3692 = new class169();
         if (!this.field3692.method3403(var1, var2)) {
            this.field3692 = null;
         } else {
            if (this.field3707 == null || this.field3674 == null) {
               this.method6366();
            }

         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lea;S)V",
      garbageValue = "24161"
   )
   public void method6365(String var1, UrlRequester var2) {
      if (this.type == 11 && var1 != null) {
         this.field3692 = new class169();
         this.field3692.method3452(var1, var2);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "20"
   )
   void method6366() {
      this.field3707 = new HashMap();
      this.field3674 = new HashMap();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "2068642484"
   )
   public void method6367(int var1, int var2) {
      if (this.type == 11) {
         if (this.field3707 == null) {
            this.method6366();
         }

         this.field3707.put(var1, var2);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-1088050959"
   )
   public void method6368(String var1, int var2) {
      if (this.type == 11) {
         if (this.field3674 == null) {
            this.method6366();
         }

         this.field3674.put(var1, var2);
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Z",
      garbageValue = "-1747555331"
   )
   public boolean method6369(int var1, int var2, int var3, int var4) {
      if (this.type == 11 && this.field3692 != null && this.method6359()) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field3692.method3411()[0] * (float)this.width);
         int var6 = (int)(this.field3692.method3411()[1] * (float)this.height);
         int var7 = var5 + (int)(this.field3692.method3411()[2] * (float)this.width);
         int var8 = var6 + (int)(this.field3692.method3411()[3] * (float)this.height);
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1668828074"
   )
   public boolean method6359() {
      return this.field3689 == 2;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-711592025"
   )
   public int method6371(String var1) {
      return this.type == 11 && this.field3692 != null && this.method6359() ? this.field3692.method3406(var1) : -1;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "73"
   )
   public String method6372(String var1) {
      return this.type == 11 && this.field3692 != null && this.method6359() ? this.field3692.method3461(var1) : null;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "709282331"
   )
   public int method6373() {
      return this.field3674 != null && this.field3674.size() > 0 ? 1 : 0;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "69"
   )
   public int method6374() {
      if (this.type == 11 && this.field3692 != null && this.field3674 != null && !this.field3674.isEmpty()) {
         String var1 = this.field3692.method3410();
         return var1 != null && this.field3674.containsKey(this.field3692.method3410()) ? (Integer)this.field3674.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-2125916472"
   )
   public String method6375() {
      if (this.type == 11 && this.field3692 != null) {
         String var1 = this.field3692.method3410();
         Iterator var2 = this.field3692.method3444().iterator();

         while(var2.hasNext()) {
            class180 var3 = (class180)var2.next();
            String var4 = String.format("%%%S%%", var3.method3530());
            if (var3.vmethod3531() == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod3536()));
            } else {
               var1.replaceAll(var4, var3.vmethod3532());
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
      garbageValue = "-840348115"
   )
   public int[] method6385() {
      if (this.type == 11 && this.field3692 != null) {
         int[] var1 = new int[3];
         int var2 = 0;
         Iterator var3 = this.field3692.method3444().iterator();

         while(var3.hasNext()) {
            class180 var4 = (class180)var3.next();
            if (!var4.method3530().equals("user_id")) {
               if (var4.vmethod3531() != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod3536();
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

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(Lea;I)Z",
      garbageValue = "-2135243363"
   )
   public boolean method6377(UrlRequester var1) {
      if (this.type == 11 && this.field3692 != null) {
         this.field3692.method3417(var1);
         if (this.field3692.method3405() != this.field3689) {
            this.field3689 = this.field3692.method3405();
            if (this.field3689 >= 100) {
               return true;
            }

            if (this.field3689 == 2) {
               this.method6378();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-753090979"
   )
   void method6378() {
      this.noClickThrough = true;
      ArrayList var1 = this.field3692.method3408();
      ArrayList var2 = this.field3692.method3409();
      int var3 = var1.size() + var2.size();
      this.children = new Widget[var3];
      int var4 = 0;

      Iterator var5;
      Widget var7;
      for(var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class175 var6 = (class175)var5.next();
         var7 = class490.method8768(5, this, var4, 0, 0, 0, 0, var6.field1841);
         var7.field3693 = var6.field1844.method2833();
         class324 var8 = new class324(var6.field1844);
         field3598.method7696(var7.field3693, var8);
      }

      for(var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class176 var9 = (class176)var5.next();
         var7 = class490.method8768(4, this, var4, 0, 0, 0, 0, var9.field1849);
         var7.text = var9.field1848;
         var7.fontId = (Integer)this.field3707.get(var9.field1852);
         var7.textXAlignment = var9.field1850;
         var7.textYAlignment = var9.field1845;
      }

   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-953704093"
   )
   public void method6459() {
      this.field3675 = new class325();

      for(int var1 = 1; var1 <= 12; ++var1) {
         this.field3675.field3535.method382(var1, 0);
      }

      for(char var2 = 0; var2 < ' '; ++var2) {
         this.field3675.field3535.method383(var2, 0);
      }

      this.field3675.field3535.method383('\u0080', 0);
      this.field3675.field3535.method382(82, 2);
      this.field3675.field3535.method382(81, 2);
      this.field3675.field3535.method382(86, 2);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)Lmh;",
      garbageValue = "40455266"
   )
   public class327 method6380() {
      return this.field3675 != null ? this.field3675.field3529 : null;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(S)Lmx;",
      garbageValue = "-16401"
   )
   public class322 method6381() {
      return this.field3675 != null ? this.field3675.field3530 : null;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(I)Lbc;",
      garbageValue = "1764483065"
   )
   public class27 method6382() {
      return this.field3675 != null ? this.field3675.field3535 : null;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(I)Lms;",
      garbageValue = "-121385664"
   )
   public class325 method6383() {
      return this.field3675;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(Lmh;I)Z",
      garbageValue = "8388608"
   )
   boolean method6384(class327 var1) {
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

         for(var10 = 0; var10 < var6.length(); ++var10) {
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
         var2 |= var1.method6334(var5);
         this.text = "";
      }

      if (this.text2 != null && !this.text2.isEmpty()) {
         var6 = this.text2;
         var7 = new StringBuilder(var6.length());
         var8 = 0;
         var9 = -1;

         for(var10 = 0; var10 < var6.length(); ++var10) {
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
         var2 |= var1.method6219(var5);
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-275597364"
   )
   public boolean method6429() {
      class327 var1 = this.method6380();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.method6238() && this.fontId != -1) {
            int var3 = var1.method6157();
            int var4 = var1.method6114();
            int var5 = var1.method6232();
            int var6 = var1.method6239();
            Font var7 = this.getFont();
            if (var7 != null) {
               var2 |= var1.method6060(var7);
               var2 |= this.method6384(var1);
               var2 |= var1.method6338(var3, var4);
               var2 |= var1.method6080(var5, var6);
            }
         } else if (var1.method6238()) {
            var2 |= this.method6384(var1);
         }

         var1.method6135();
         return var2;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Lfa;",
      garbageValue = "1613415260"
   )
   static class131[] method6508() {
      return new class131[]{class131.field1554, class131.field1540, class131.field1541, class131.field1557, class131.field1543, class131.field1553, class131.field1545, class131.field1546, class131.field1547, class131.field1548, class131.field1542, class131.field1550, class131.field1544, class131.field1552, class131.field1549, class131.field1551, class131.field1555};
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "1"
   )
   @Export("stringCp1252NullTerminatedByteSize")
   public static int stringCp1252NullTerminatedByteSize(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedName("na")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
      garbageValue = "1605418477"
   )
   static String method6509(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.gameBuild == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.gameBuild == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.gameBuild == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.gameBuild == 5) {
         var0 = var0 + "-wti";
      } else if (Client.gameBuild == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (class443.field4710 != null) {
         var3 = "/p=" + class443.field4710;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + TriBool.clientLanguage + "/a=" + class156.field1726 + var3 + "/";
   }
}
