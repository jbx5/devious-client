import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Widget")
public class Widget extends Node {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("Widget_cachedSprites")
   public static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("Widget_cachedModels")
   public static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("Widget_cachedFonts")
   public static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("Widget_cachedSpriteMasks")
   public static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   static class391 field3547;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   static class391 field3548;
   @ObfuscatedName("ay")
   public static boolean field3579;
   @ObfuscatedName("ac")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -62043185
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1171460333
   )
   @Export("childIndex")
   public int childIndex = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1180161427
   )
   @Export("type")
   public int type;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -990812675
   )
   @Export("buttonType")
   public int buttonType = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 175857361
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 64995
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1514062159
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -620602289
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -637700839
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 354048477
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -215139839
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1834754577
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1568476975
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -142785695
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 628751527
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -1115677773
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 2038548197
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -41281173
   )
   public int field3659 = 1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -529164185
   )
   public int field3569 = 1;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -406687343
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("bq")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 1373308277
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1772436737
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 1727370963
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -2014827871
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1428016323
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 183396475
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 1207136197
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -788803119
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("bs")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lre;"
   )
   @Export("fillMode")
   public FillMode fillMode;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1539126233
   )
   @Export("transparencyTop")
   public int transparencyTop;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -156318013
   )
   @Export("transparencyBot")
   public int transparencyBot;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1676714917
   )
   @Export("lineWid")
   public int lineWid;
   @ObfuscatedName("ba")
   public boolean field3606;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -2041212023
   )
   @Export("spriteId2")
   public int spriteId2;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1473784193
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("bv")
   public String field3588;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -144380605
   )
   @Export("spriteAngle")
   public int spriteAngle;
   @ObfuscatedName("cr")
   @Export("spriteTiling")
   public boolean spriteTiling;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -585447419
   )
   @Export("outline")
   public int outline;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = -513345907
   )
   @Export("spriteShadow")
   public int spriteShadow;
   @ObfuscatedName("cq")
   @Export("spriteFlipV")
   public boolean spriteFlipV;
   @ObfuscatedName("cd")
   @Export("spriteFlipH")
   public boolean spriteFlipH;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 72486601
   )
   @Export("modelType")
   public int modelType;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 1915514627
   )
   @Export("modelId")
   public int modelId;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 334797799
   )
   @Export("modelType2")
   int modelType2;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1076912807
   )
   @Export("modelId2")
   int modelId2;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 1497433719
   )
   @Export("sequenceId")
   public int sequenceId;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 1774221745
   )
   @Export("sequenceId2")
   public int sequenceId2;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -451847347
   )
   @Export("modelOffsetX")
   public int modelOffsetX;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 761940513
   )
   @Export("modelOffsetY")
   public int modelOffsetY;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1182255807
   )
   @Export("modelAngleX")
   public int modelAngleX;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -1874315713
   )
   @Export("modelAngleY")
   public int modelAngleY;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 1808943705
   )
   @Export("modelAngleZ")
   public int modelAngleZ;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -2094667345
   )
   @Export("modelZoom")
   public int modelZoom;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -1864435997
   )
   public int field3616;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -1350892871
   )
   public int field3585;
   @ObfuscatedName("co")
   @Export("modelOrthog")
   public boolean modelOrthog;
   @ObfuscatedName("cg")
   @Export("modelTransparency")
   public boolean modelTransparency;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1108798901
   )
   @Export("itemQuantityMode")
   public int itemQuantityMode;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 933014707
   )
   @Export("fontId")
   public int fontId;
   @ObfuscatedName("cn")
   @Export("text")
   public String text;
   @ObfuscatedName("cw")
   @Export("text2")
   public String text2;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -1009700007
   )
   @Export("textLineHeight")
   public int textLineHeight;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = -1809852357
   )
   @Export("textXAlignment")
   public int textXAlignment;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = -1411689819
   )
   @Export("textYAlignment")
   public int textYAlignment;
   @ObfuscatedName("di")
   @Export("textShadowed")
   public boolean textShadowed;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = 2097156317
   )
   @Export("paddingX")
   public int paddingX;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -1339031143
   )
   @Export("paddingY")
   public int paddingY;
   @ObfuscatedName("dm")
   @Export("inventoryXOffsets")
   public int[] inventoryXOffsets;
   @ObfuscatedName("dn")
   @Export("inventoryYOffsets")
   public int[] inventoryYOffsets;
   @ObfuscatedName("df")
   @Export("inventorySprites")
   public int[] inventorySprites;
   @ObfuscatedName("dv")
   @Export("itemActions")
   public String[] itemActions;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   class166 field3625;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 505457991
   )
   int field3647;
   @ObfuscatedName("dt")
   HashMap field3627;
   @ObfuscatedName("dl")
   HashMap field3571;
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lkl;"
   )
   class305 field3629;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 1238631003
   )
   @Export("flags")
   public int flags;
   @ObfuscatedName("ds")
   public boolean field3631;
   @ObfuscatedName("dc")
   public byte[][] field3632;
   @ObfuscatedName("de")
   public byte[][] field3633;
   @ObfuscatedName("du")
   public int[] field3634;
   @ObfuscatedName("da")
   public int[] field3635;
   @ObfuscatedName("ev")
   @Export("dataText")
   public String dataText;
   @ObfuscatedName("en")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("parent")
   public Widget parent;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = 1863427853
   )
   @Export("dragZoneSize")
   public int dragZoneSize;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -2092863151
   )
   @Export("dragThreshold")
   public int dragThreshold;
   @ObfuscatedName("eq")
   @Export("isScrollBar")
   public boolean isScrollBar;
   @ObfuscatedName("ea")
   @Export("spellActionName")
   public String spellActionName;
   @ObfuscatedName("es")
   @Export("hasListener")
   public boolean hasListener;
   @ObfuscatedName("ew")
   @Export("onLoad")
   public Object[] onLoad;
   @ObfuscatedName("ej")
   @Export("onClick")
   public Object[] onClick;
   @ObfuscatedName("ed")
   @Export("onClickRepeat")
   public Object[] onClickRepeat;
   @ObfuscatedName("eu")
   @Export("onRelease")
   public Object[] onRelease;
   @ObfuscatedName("ex")
   @Export("onHold")
   public Object[] onHold;
   @ObfuscatedName("eh")
   @Export("onMouseOver")
   public Object[] onMouseOver;
   @ObfuscatedName("ep")
   @Export("onMouseRepeat")
   public Object[] onMouseRepeat;
   @ObfuscatedName("eo")
   @Export("onMouseLeave")
   public Object[] onMouseLeave;
   @ObfuscatedName("ey")
   @Export("onDrag")
   public Object[] onDrag;
   @ObfuscatedName("eg")
   @Export("onDragComplete")
   public Object[] onDragComplete;
   @ObfuscatedName("ec")
   @Export("onTargetEnter")
   public Object[] onTargetEnter;
   @ObfuscatedName("ef")
   @Export("onTargetLeave")
   public Object[] onTargetLeave;
   @ObfuscatedName("eb")
   @Export("onVarTransmit")
   public Object[] onVarTransmit;
   @ObfuscatedName("et")
   @Export("varTransmitTriggers")
   public int[] varTransmitTriggers;
   @ObfuscatedName("ee")
   @Export("onInvTransmit")
   public Object[] onInvTransmit;
   @ObfuscatedName("ez")
   @Export("invTransmitTriggers")
   public int[] invTransmitTriggers;
   @ObfuscatedName("em")
   @Export("onStatTransmit")
   public Object[] onStatTransmit;
   @ObfuscatedName("ek")
   @Export("statTransmitTriggers")
   public int[] statTransmitTriggers;
   @ObfuscatedName("fn")
   @Export("onTimer")
   public Object[] onTimer;
   @ObfuscatedName("fx")
   @Export("onOp")
   public Object[] onOp;
   @ObfuscatedName("fh")
   public Object[] field3664;
   @ObfuscatedName("fm")
   @Export("onScroll")
   public Object[] onScroll;
   @ObfuscatedName("fe")
   @Export("onChatTransmit")
   public Object[] onChatTransmit;
   @ObfuscatedName("fl")
   @Export("onKey")
   public Object[] onKey;
   @ObfuscatedName("fu")
   public Object[] field3604;
   @ObfuscatedName("fi")
   public Object[] field3669;
   @ObfuscatedName("fk")
   @Export("onFriendTransmit")
   public Object[] onFriendTransmit;
   @ObfuscatedName("fd")
   @Export("onClanTransmit")
   public Object[] onClanTransmit;
   @ObfuscatedName("fs")
   public Object[] field3672;
   @ObfuscatedName("fg")
   public Object[] field3673;
   @ObfuscatedName("fq")
   @Export("onMiscTransmit")
   public Object[] onMiscTransmit;
   @ObfuscatedName("fj")
   @Export("onDialogAbort")
   public Object[] onDialogAbort;
   @ObfuscatedName("fr")
   @Export("onSubChange")
   public Object[] onSubChange;
   @ObfuscatedName("fw")
   @Export("onResize")
   public Object[] onResize;
   @ObfuscatedName("ft")
   @Export("onStockTransmit")
   public Object[] onStockTransmit;
   @ObfuscatedName("fv")
   public Object[] field3679;
   @ObfuscatedName("fa")
   public Object[] field3680;
   @ObfuscatedName("fo")
   @Export("cs1Instructions")
   public int[][] cs1Instructions;
   @ObfuscatedName("ff")
   @Export("cs1Comparisons")
   public int[] cs1Comparisons;
   @ObfuscatedName("fc")
   @Export("cs1ComparisonValues")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = -185658995
   )
   @Export("mouseOverRedirect")
   public int mouseOverRedirect;
   @ObfuscatedName("fy")
   @Export("spellName")
   public String spellName;
   @ObfuscatedName("fz")
   @Export("buttonText")
   public String buttonText;
   @ObfuscatedName("fp")
   @Export("itemIds")
   public int[] itemIds;
   @ObfuscatedName("gk")
   @Export("itemQuantities")
   public int[] itemQuantities;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = 1673450875
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 1904309963
   )
   @Export("itemQuantity")
   public int itemQuantity;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -2100341611
   )
   @Export("modelFrame")
   public int modelFrame;
   @ObfuscatedName("gx")
   @ObfuscatedGetter(
      intValue = -934012351
   )
   @Export("modelFrameCycle")
   public int modelFrameCycle;
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "[Lkz;"
   )
   @Export("children")
   public Widget[] children;
   @ObfuscatedName("gw")
   @Export("containsMouse")
   public boolean containsMouse;
   @ObfuscatedName("gj")
   public boolean field3674;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = 1124101761
   )
   public int field3696;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = 358069129
   )
   public int field3697;
   @ObfuscatedName("gg")
   @ObfuscatedGetter(
      intValue = -929627225
   )
   public int field3698;
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = -1167515137
   )
   public int field3699;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = 1940236813
   )
   @Export("rootIndex")
   public int rootIndex;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = -99836391
   )
   @Export("cycle")
   public int cycle;
   @ObfuscatedName("gy")
   public int[] field3594;
   @ObfuscatedName("gn")
   @Export("noClickThrough")
   public boolean noClickThrough;
   @ObfuscatedName("gb")
   @Export("noScrollThrough")
   public boolean noScrollThrough;
   @ObfuscatedName("gp")
   @Export("prioritizeMenuEntry")
   public boolean prioritizeMenuEntry;

   static {
      field3547 = new class391(10, class389.field4516);
      field3548 = new class391(10, class389.field4516);
      field3579 = false;
   }

   public Widget() {
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field3606 = false;
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
      this.field3616 = 0;
      this.field3585 = 0;
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
      this.field3647 = -1;
      this.flags = 0;
      this.field3631 = false;
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
      this.field3674 = false;
      this.field3696 = -1;
      this.field3697 = 0;
      this.field3698 = 0;
      this.field3699 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-2036532875"
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

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "194738326"
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
            this.field3616 = var1.readUnsignedShort();
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
         this.field3606 = var1.readUnsignedByte() == 1;
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)[Ljava/lang/Object;",
      garbageValue = "-1959052330"
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)[I",
      garbageValue = "1696359001"
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
      descriptor = "(III)V",
      garbageValue = "825349497"
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ZLdi;I)Lrs;",
      garbageValue = "-342617592"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1, UrlRequester var2) {
      field3579 = false;
      if (this.field3588 != null) {
         SpritePixels var3 = this.method6215(var2);
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
         long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((long)this.spriteShadow << 40);
         SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
         if (var6 != null) {
            return var6;
         } else {
            var6 = BZip2State.SpriteBuffer_getSprite(World.Widget_spritesArchive, var7, 0);
            if (var6 == null) {
               field3579 = true;
               return null;
            } else {
               this.method6261(var6);
               Widget_cachedSprites.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Ldi;I)Lrs;",
      garbageValue = "-1845458469"
   )
   SpritePixels method6215(UrlRequester var1) {
      if (!this.method6300()) {
         return this.method6232(var1);
      } else {
         String var2 = this.field3588 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
         SpritePixels var3 = (SpritePixels)field3548.method7483(var2);
         if (var3 == null) {
            SpritePixels var4 = this.method6232(var1);
            if (var4 != null) {
               var3 = var4.method9156();
               this.method6261(var3);
               field3548.method7484(var2, var3);
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ldi;I)Lrs;",
      garbageValue = "-1086439026"
   )
   SpritePixels method6232(UrlRequester var1) {
      if (this.field3588 != null && var1 != null) {
         class304 var2 = (class304)field3547.method7483(this.field3588);
         if (var2 == null) {
            var2 = new class304(this.field3588, var1);
            field3547.method7484(this.field3588, var2);
         }

         return var2.method5876();
      } else {
         return null;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "255152987"
   )
   boolean method6300() {
      return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lrs;B)V",
      garbageValue = "2"
   )
   void method6261(SpritePixels var1) {
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

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)Lnv;",
      garbageValue = "426572504"
   )
   @Export("getFont")
   public Font getFont() {
      field3579 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class33.method488(World.Widget_spritesArchive, Script.Widget_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               Widget_cachedFonts.put(var1, (long)this.fontId);
            } else {
               field3579 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IB)Lrs;",
      garbageValue = "-60"
   )
   @Export("getInventorySprite")
   public SpritePixels getInventorySprite(int var1) {
      field3579 = false;
      if (var1 >= 0 && var1 < this.inventorySprites.length) {
         int var2 = this.inventorySprites[var1];
         if (var2 == -1) {
            return null;
         } else {
            SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
            if (var3 != null) {
               return var3;
            } else {
               var3 = BZip2State.SpriteBuffer_getSprite(World.Widget_spritesArchive, var2, 0);
               if (var3 != null) {
                  Widget_cachedSprites.put(var3, (long)var2);
               } else {
                  field3579 = true;
               }

               return var3;
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lge;IZLka;Lgo;Lgj;I)Lhs;",
      garbageValue = "-2035273042"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewStuff var6) {
      field3579 = false;
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
            var9 |= var6.field2021 << 20;
         }

         Model var11 = (Model)Widget_cachedModels.get(var9);
         if (var11 == null) {
            ModelData var12 = null;
            int var13 = 64;
            int var14 = 768;
            switch (var7) {
               case 1:
                  var12 = ModelData.ModelData_get(class145.field1689, var8, 0);
                  break;
               case 2:
                  var12 = class137.getNpcDefinition(var8).method3750((NewStuff)null);
                  break;
               case 3:
                  var12 = var4 != null ? var4.getModelData() : null;
                  break;
               case 4:
                  ItemComposition var15 = TileItem.ItemDefinition_get(var8);
                  var12 = var15.getModelData(10);
                  var13 += var15.field2263;
                  var14 += var15.field2256;
               case 5:
               default:
                  break;
               case 6:
                  var12 = class137.getNpcDefinition(var8).method3750(var6);
            }

            if (var12 == null) {
               field3579 = true;
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lkb;",
      garbageValue = "2135833005"
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
         long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
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

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "954231847"
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-525383204"
   )
   public boolean method6209() {
      return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "72"
   )
   public boolean method6210() {
      return this.type == 11 || this.type == 12;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldi;J)V"
   )
   public void method6211(String var1, UrlRequester var2, long var3) {
      if (this.type == 11 && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3625 = new class166();
         if (!this.field3625.method3418(var1, var2)) {
            this.field3625 = null;
         } else {
            if (this.field3627 == null || this.field3571 == null) {
               this.method6324();
            }

         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "775377235"
   )
   void method6324() {
      this.field3627 = new HashMap();
      this.field3571 = new HashMap();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "40495858"
   )
   public void method6213(int var1, int var2) {
      if (this.type == 11) {
         if (this.field3627 == null) {
            this.method6324();
         }

         this.field3627.put(var1, var2);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "2133056673"
   )
   public void method6214(String var1, int var2) {
      if (this.type == 11) {
         if (this.field3571 == null) {
            this.method6324();
         }

         this.field3571.put(var1, var2);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-12"
   )
   public boolean method6351() {
      return this.field3647 == 2;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1084482893"
   )
   public int method6216(String var1) {
      return this.type == 11 && this.field3625 != null && this.method6351() ? this.field3625.method3433(var1) : -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1171040032"
   )
   public String method6285(String var1) {
      return this.type == 11 && this.field3625 != null && this.method6351() ? this.field3625.method3422(var1) : null;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "740473322"
   )
   public int method6218() {
      return this.field3571 != null && this.field3571.size() > 0 ? 1 : 0;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-364384407"
   )
   public int method6335() {
      if (this.type == 11 && this.field3625 != null && this.field3571 != null && !this.field3571.isEmpty()) {
         String var1 = this.field3625.method3425();
         return var1 != null && this.field3571.containsKey(this.field3625.method3425()) ? (Integer)this.field3571.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1316992101"
   )
   public String method6229() {
      if (this.type == 11 && this.field3625 != null) {
         String var1 = this.field3625.method3425();
         Iterator var2 = this.field3625.method3448().iterator();

         while(var2.hasNext()) {
            class177 var3 = (class177)var2.next();
            String var4 = String.format("%%%S%%", var3.method3535());
            if (var3.vmethod3537() == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod3539()));
            } else {
               var1.replaceAll(var4, var3.vmethod3540());
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-1078145387"
   )
   public int[] method6247() {
      if (this.type == 11 && this.field3625 != null) {
         int[] var1 = new int[3];
         int var2 = 0;
         Iterator var3 = this.field3625.method3448().iterator();

         while(var3.hasNext()) {
            class177 var4 = (class177)var3.next();
            if (!var4.method3535().equals("user_id")) {
               if (var4.vmethod3537() != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod3539();
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

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ldi;I)Z",
      garbageValue = "-2033209000"
   )
   public boolean method6222(UrlRequester var1) {
      if (this.type == 11 && this.field3625 != null) {
         this.field3625.method3419(var1);
         if (this.field3625.method3420() != this.field3647) {
            this.field3647 = this.field3625.method3420();
            if (this.field3647 >= 100) {
               return true;
            }

            if (this.field3647 == 2) {
               this.method6223();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "7436"
   )
   void method6223() {
      this.noClickThrough = true;
      ArrayList var1 = this.field3625.method3459();
      ArrayList var2 = this.field3625.method3424();
      int var3 = var1.size() + var2.size();
      this.children = new Widget[var3];
      int var4 = 0;

      Iterator var5;
      Widget var7;
      for(var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class172 var6 = (class172)var5.next();
         var7 = ModeWhere.method6784(5, this, var4, 0, 0, 0, 0, var6.field1864);
         var7.field3588 = var6.field1870.method2889();
         class304 var8 = new class304(var6.field1870);
         field3547.method7484(var7.field3588, var8);
      }

      for(var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class173 var9 = (class173)var5.next();
         var7 = ModeWhere.method6784(4, this, var4, 0, 0, 0, 0, var9.field1880);
         var7.text = var9.field1875;
         var7.fontId = (Integer)this.field3627.get(var9.field1879);
         var7.textXAlignment = var9.field1876;
         var7.textYAlignment = var9.field1878;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "4210683"
   )
   public void method6224() {
      this.field3629 = new class305();

      for(int var1 = 1; var1 <= 12; ++var1) {
         this.field3629.field3478.method391(var1, 0);
      }

      for(char var2 = 0; var2 < ' '; ++var2) {
         this.field3629.field3478.method417(var2, 0);
      }

      this.field3629.field3478.method417('\u0080', 0);
      this.field3629.field3478.method391(82, 2);
      this.field3629.field3478.method391(81, 2);
      this.field3629.field3478.method391(86, 2);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Lkp;",
      garbageValue = "-2119686482"
   )
   public class307 method6235() {
      return this.field3629 != null ? this.field3629.field3476 : null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)Lkr;",
      garbageValue = "-10"
   )
   public class302 method6226() {
      return this.field3629 != null ? this.field3629.field3477 : null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Laa;",
      garbageValue = "-2122308781"
   )
   public class27 method6227() {
      return this.field3629 != null ? this.field3629.field3478 : null;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Lkl;",
      garbageValue = "2018701913"
   )
   public class305 method6228() {
      return this.field3629;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lkp;B)Z",
      garbageValue = "19"
   )
   boolean method6301(class307 var1) {
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
         var2 |= var1.method5946(var5);
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
         var2 |= var1.method5926(var5);
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-474027156"
   )
   public boolean method6339() {
      class307 var1 = this.method6235();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.method5979() && this.fontId != -1) {
            int var3 = var1.method5980();
            int var4 = var1.method6041();
            int var5 = var1.method5978();
            int var6 = var1.method6145();
            Font var7 = this.getFont();
            if (var7 != null) {
               var2 |= var1.method6033(var7);
               var2 |= this.method6301(var1);
               var2 |= var1.method5932(var3, var4);
               var2 |= var1.method6013(var5, var6);
            }
         } else if (var1.method5979()) {
            var2 |= this.method6301(var1);
         }

         var1.method5922();
         return var2;
      }
   }
}
