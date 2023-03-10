import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("Widget")
public class Widget extends Node {
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("Widget_cachedSprites")
   public static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("Widget_cachedModels")
   public static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("Widget_cachedFonts")
   public static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("Widget_cachedSpriteMasks")
   public static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   static class394 field3569;
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   static class394 field3544;
   @ObfuscatedName("bz")
   public static boolean field3637;
   @ObfuscatedName("bq")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -672060695
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 79765129
   )
   @Export("childIndex")
   public int childIndex = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1163943651
   )
   @Export("type")
   public int type;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -730993029
   )
   @Export("buttonType")
   public int buttonType = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 762220451
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 158117435
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1675401913
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -633720853
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 509152495
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 177568423
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 225715715
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -404674777
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 404308569
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1508974797
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1299518913
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1075980981
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 1352771375
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = 1816832375
   )
   public int field3667 = 1;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1449949959
   )
   public int field3578 = 1;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 742017755
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("ce")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 295748227
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 106332253
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 1522996103
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 421465179
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 1827188191
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 1787445373
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 205610567
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 280309355
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("cs")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Lsc;"
   )
   @Export("fillMode")
   public FillMode fillMode;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 680247369
   )
   @Export("transparencyTop")
   public int transparencyTop;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 992808099
   )
   @Export("transparencyBot")
   public int transparencyBot;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -645791251
   )
   @Export("lineWid")
   public int lineWid;
   @ObfuscatedName("cw")
   public boolean field3545;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 299140683
   )
   @Export("spriteId2")
   public int spriteId2;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 1194330347
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("cf")
   public String field3562;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 1226859375
   )
   @Export("spriteAngle")
   public int spriteAngle;
   @ObfuscatedName("cr")
   @Export("spriteTiling")
   public boolean spriteTiling;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1307812433
   )
   @Export("outline")
   public int outline;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -271178069
   )
   @Export("spriteShadow")
   public int spriteShadow;
   @ObfuscatedName("dc")
   @Export("spriteFlipV")
   public boolean spriteFlipV;
   @ObfuscatedName("dp")
   @Export("spriteFlipH")
   public boolean spriteFlipH;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = -222521187
   )
   @Export("modelType")
   public int modelType;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = 1428728835
   )
   @Export("modelId")
   public int modelId;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = 1897919539
   )
   @Export("modelType2")
   int modelType2;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -1190983495
   )
   @Export("modelId2")
   int modelId2;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = 1750871359
   )
   @Export("sequenceId")
   public int sequenceId;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 471197057
   )
   @Export("sequenceId2")
   public int sequenceId2;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = -2006458485
   )
   @Export("modelOffsetX")
   public int modelOffsetX;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 215840913
   )
   @Export("modelOffsetY")
   public int modelOffsetY;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -1140560947
   )
   @Export("modelAngleX")
   public int modelAngleX;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = 1142912299
   )
   @Export("modelAngleY")
   public int modelAngleY;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = -1552954693
   )
   @Export("modelAngleZ")
   public int modelAngleZ;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -785602547
   )
   @Export("modelZoom")
   public int modelZoom;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 354295763
   )
   public int field3532;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 382844233
   )
   public int field3582;
   @ObfuscatedName("dm")
   @Export("modelOrthog")
   public boolean modelOrthog;
   @ObfuscatedName("dz")
   @Export("modelTransparency")
   public boolean modelTransparency;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = -1079272007
   )
   @Export("itemQuantityMode")
   public int itemQuantityMode;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = 2072162713
   )
   @Export("fontId")
   public int fontId;
   @ObfuscatedName("dy")
   @Export("text")
   public String text;
   @ObfuscatedName("do")
   @Export("text2")
   public String text2;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -1572481489
   )
   @Export("textLineHeight")
   public int textLineHeight;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      intValue = -503733121
   )
   @Export("textXAlignment")
   public int textXAlignment;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = 267248853
   )
   @Export("textYAlignment")
   public int textYAlignment;
   @ObfuscatedName("ei")
   @Export("textShadowed")
   public boolean textShadowed;
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   class167 field3593;
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = -2085328037
   )
   int field3543;
   @ObfuscatedName("ep")
   HashMap field3595;
   @ObfuscatedName("eb")
   HashMap field3596;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "Lla;"
   )
   class308 field3635;
   @ObfuscatedName("ev")
   @ObfuscatedGetter(
      intValue = 931222803
   )
   @Export("flags")
   public int flags;
   @ObfuscatedName("ef")
   public boolean field3599;
   @ObfuscatedName("et")
   public byte[][] field3575;
   @ObfuscatedName("el")
   public byte[][] field3601;
   @ObfuscatedName("ec")
   public int[] field3583;
   @ObfuscatedName("eg")
   public int[] field3603;
   @ObfuscatedName("eq")
   @Export("dataText")
   public String dataText;
   @ObfuscatedName("eh")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("parent")
   public Widget parent;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = 28421931
   )
   @Export("dragZoneSize")
   public int dragZoneSize;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 2132042493
   )
   @Export("dragThreshold")
   public int dragThreshold;
   @ObfuscatedName("ew")
   @Export("isScrollBar")
   public boolean isScrollBar;
   @ObfuscatedName("eu")
   @Export("spellActionName")
   public String spellActionName;
   @ObfuscatedName("ed")
   @Export("hasListener")
   public boolean hasListener;
   @ObfuscatedName("fz")
   @Export("onLoad")
   public Object[] onLoad;
   @ObfuscatedName("fr")
   @Export("onClick")
   public Object[] onClick;
   @ObfuscatedName("fs")
   @Export("onClickRepeat")
   public Object[] onClickRepeat;
   @ObfuscatedName("fe")
   @Export("onRelease")
   public Object[] onRelease;
   @ObfuscatedName("fl")
   @Export("onHold")
   public Object[] onHold;
   @ObfuscatedName("fa")
   @Export("onMouseOver")
   public Object[] onMouseOver;
   @ObfuscatedName("ft")
   @Export("onMouseRepeat")
   public Object[] onMouseRepeat;
   @ObfuscatedName("ff")
   @Export("onMouseLeave")
   public Object[] onMouseLeave;
   @ObfuscatedName("fb")
   @Export("onDrag")
   public Object[] onDrag;
   @ObfuscatedName("fg")
   @Export("onDragComplete")
   public Object[] onDragComplete;
   @ObfuscatedName("fj")
   @Export("onTargetEnter")
   public Object[] onTargetEnter;
   @ObfuscatedName("fv")
   @Export("onTargetLeave")
   public Object[] onTargetLeave;
   @ObfuscatedName("fy")
   @Export("onVarTransmit")
   public Object[] onVarTransmit;
   @ObfuscatedName("fo")
   @Export("varTransmitTriggers")
   public int[] varTransmitTriggers;
   @ObfuscatedName("fk")
   @Export("onInvTransmit")
   public Object[] onInvTransmit;
   @ObfuscatedName("fw")
   @Export("invTransmitTriggers")
   public int[] invTransmitTriggers;
   @ObfuscatedName("fn")
   @Export("onStatTransmit")
   public Object[] onStatTransmit;
   @ObfuscatedName("fc")
   @Export("statTransmitTriggers")
   public int[] statTransmitTriggers;
   @ObfuscatedName("fm")
   @Export("onTimer")
   public Object[] onTimer;
   @ObfuscatedName("fq")
   @Export("onOp")
   public Object[] onOp;
   @ObfuscatedName("fh")
   public Object[] field3622;
   @ObfuscatedName("fi")
   @Export("onScroll")
   public Object[] onScroll;
   @ObfuscatedName("fu")
   @Export("onChatTransmit")
   public Object[] onChatTransmit;
   @ObfuscatedName("fd")
   @Export("onKey")
   public Object[] onKey;
   @ObfuscatedName("fp")
   public Object[] field3636;
   @ObfuscatedName("fx")
   public Object[] field3541;
   @ObfuscatedName("gm")
   @Export("onFriendTransmit")
   public Object[] onFriendTransmit;
   @ObfuscatedName("gk")
   @Export("onClanTransmit")
   public Object[] onClanTransmit;
   @ObfuscatedName("gb")
   public Object[] field3640;
   @ObfuscatedName("go")
   public Object[] field3641;
   @ObfuscatedName("gn")
   @Export("onMiscTransmit")
   public Object[] onMiscTransmit;
   @ObfuscatedName("ga")
   @Export("onDialogAbort")
   public Object[] onDialogAbort;
   @ObfuscatedName("gz")
   @Export("onSubChange")
   public Object[] onSubChange;
   @ObfuscatedName("gu")
   @Export("onResize")
   public Object[] onResize;
   @ObfuscatedName("gw")
   @Export("onStockTransmit")
   public Object[] onStockTransmit;
   @ObfuscatedName("gy")
   public Object[] field3647;
   @ObfuscatedName("gr")
   public Object[] field3648;
   @ObfuscatedName("gs")
   @Export("cs1Instructions")
   public int[][] cs1Instructions;
   @ObfuscatedName("ge")
   @Export("cs1Comparisons")
   public int[] cs1Comparisons;
   @ObfuscatedName("gl")
   @Export("cs1ComparisonValues")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = 1699698851
   )
   @Export("mouseOverRedirect")
   public int mouseOverRedirect;
   @ObfuscatedName("gc")
   public String field3653;
   @ObfuscatedName("gh")
   @Export("buttonText")
   public String buttonText;
   @ObfuscatedName("gx")
   @Export("itemIds")
   public int[] itemIds;
   @ObfuscatedName("gg")
   @Export("itemQuantities")
   public int[] itemQuantities;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = -1638206179
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = 2137313251
   )
   @Export("itemQuantity")
   public int itemQuantity;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 142909041
   )
   @Export("modelFrame")
   public int modelFrame;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = -524209
   )
   @Export("modelFrameCycle")
   public int modelFrameCycle;
   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "[Lmy;"
   )
   @Export("children")
   public Widget[] children;
   @ObfuscatedName("gv")
   public boolean field3662;
   @ObfuscatedName("gt")
   public boolean field3663;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = 1847298027
   )
   public int field3623;
   @ObfuscatedName("hc")
   @ObfuscatedGetter(
      intValue = -238745115
   )
   public int field3546;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = -776126625
   )
   public int field3666;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -100148273
   )
   public int field3594;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = -1197039009
   )
   @Export("rootIndex")
   public int rootIndex;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = 1073738983
   )
   @Export("cycle")
   public int cycle;
   @ObfuscatedName("hs")
   public int[] field3670;
   @ObfuscatedName("hg")
   @Export("noClickThrough")
   public boolean noClickThrough;
   @ObfuscatedName("ho")
   @Export("noScrollThrough")
   public boolean noScrollThrough;
   @ObfuscatedName("hj")
   @Export("prioritizeMenuEntry")
   public boolean prioritizeMenuEntry;

   static {
      field3569 = new class394(10, class392.field4475);
      field3544 = new class394(10, class392.field4475);
      field3637 = false;
   }

   public Widget() {
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field3545 = false;
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
      this.field3532 = 0;
      this.field3582 = 0;
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
      this.field3543 = -1;
      this.flags = 0;
      this.field3599 = false;
      this.dataText = "";
      this.parent = null;
      this.dragZoneSize = 0;
      this.dragThreshold = 0;
      this.isScrollBar = false;
      this.spellActionName = "";
      this.hasListener = false;
      this.mouseOverRedirect = -1;
      this.field3653 = "";
      this.buttonText = "Ok";
      this.itemId = -1;
      this.itemQuantity = 0;
      this.modelFrame = 0;
      this.modelFrameCycle = 0;
      this.field3662 = false;
      this.field3663 = false;
      this.field3623 = -1;
      this.field3546 = 0;
      this.field3666 = 0;
      this.field3594 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "-16"
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
         this.field3653 = var1.readStringCp1252NullTerminated();
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "566459498"
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
            this.field3532 = var1.readUnsignedShort();
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
         this.field3545 = var1.readUnsignedByte() == 1;
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)[Ljava/lang/Object;",
      garbageValue = "-1044525330"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)[I",
      garbageValue = "1"
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

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ZLeb;I)Lsn;",
      garbageValue = "-1331900379"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1, UrlRequester var2) {
      field3637 = false;
      if (this.field3562 != null) {
         SpritePixels var3 = this.method6093(var2);
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
         long var4 = ((long)this.spriteShadow << 40) + (long)var7 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
         SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
         if (var6 != null) {
            return var6;
         } else {
            var6 = WorldMapScaleHandler.SpriteBuffer_getSprite(MusicPatch.Widget_spritesArchive, var7, 0);
            if (var6 == null) {
               field3637 = true;
               return null;
            } else {
               this.method6154(var6);
               Widget_cachedSprites.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Leb;I)Lsn;",
      garbageValue = "344972580"
   )
   SpritePixels method6093(UrlRequester var1) {
      if (!this.method6094()) {
         return this.method6088(var1);
      } else {
         String var2 = this.field3562 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
         SpritePixels var3 = (SpritePixels)field3544.method7414(var2);
         if (var3 == null) {
            SpritePixels var4 = this.method6088(var1);
            if (var4 != null) {
               var3 = var4.method9111();
               this.method6154(var3);
               field3544.method7427(var2, var3);
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Leb;I)Lsn;",
      garbageValue = "781131274"
   )
   SpritePixels method6088(UrlRequester var1) {
      if (this.field3562 != null && var1 != null) {
         class307 var2 = (class307)field3569.method7414(this.field3562);
         if (var2 == null) {
            var2 = new class307(this.field3562, var1);
            field3569.method7427(this.field3562, var2);
         }

         return var2.method5779();
      } else {
         return null;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "12"
   )
   boolean method6094() {
      return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lsn;I)V",
      garbageValue = "-1478165586"
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Loe;",
      garbageValue = "920274053"
   )
   @Export("getFont")
   public Font getFont() {
      field3637 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            AbstractArchive var3 = MusicPatch.Widget_spritesArchive;
            AbstractArchive var4 = AbstractWorldMapData.Widget_fontsArchive;
            int var5 = this.fontId;
            byte[] var7 = var3.takeFile(var5, 0);
            boolean var6;
            if (var7 == null) {
               var6 = false;
            } else {
               class212.SpriteBuffer_decode(var7);
               var6 = true;
            }

            Font var2;
            if (!var6) {
               var2 = null;
            } else {
               byte[] var8 = var4.takeFile(var5, 0);
               Font var10;
               if (var8 == null) {
                  var10 = null;
               } else {
                  Font var9 = new Font(var8, class492.SpriteBuffer_xOffsets, Canvas.SpriteBuffer_yOffsets, InterfaceParent.SpriteBuffer_spriteWidths, class144.SpriteBuffer_spriteHeights, class181.SpriteBuffer_spritePalette, class144.SpriteBuffer_pixels);
                  FriendsList.method7473();
                  var10 = var9;
               }

               var2 = var10;
            }

            if (var2 != null) {
               Widget_cachedFonts.put(var2, (long)this.fontId);
            } else {
               field3637 = true;
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lhx;IZLlc;Lhl;Lhj;I)Lix;",
      garbageValue = "2086184129"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewStuff var6) {
      field3637 = false;
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
            var9 |= var6.field1985 << 20;
         }

         Model var11 = (Model)Widget_cachedModels.get(var9);
         if (var11 == null) {
            ModelData var12 = null;
            int var13 = 64;
            int var14 = 768;
            switch (var7) {
               case 1:
                  var12 = ModelData.ModelData_get(class211.field2337, var8, 0);
                  break;
               case 2:
                  var12 = class188.getNpcDefinition(var8).method3670((NewStuff)null);
                  break;
               case 3:
                  var12 = var4 != null ? var4.getModelData() : null;
                  break;
               case 4:
                  ItemComposition var15 = ParamComposition.ItemDefinition_get(var8);
                  var12 = var15.getModelData(10);
                  var13 += var15.field2224;
                  var14 += var15.field2225;
               case 5:
               default:
                  break;
               case 6:
                  var12 = class188.getNpcDefinition(var8).method3670(var6);
            }

            if (var12 == null) {
               field3637 = true;
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ZS)Llx;",
      garbageValue = "-20402"
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
         long var3 = ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "1529997098"
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

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-33"
   )
   public boolean method6100() {
      return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1886083146"
   )
   public boolean method6101() {
      return this.type == 11 || this.type == 12;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Leb;J)V"
   )
   public void method6136(String var1, UrlRequester var2, long var3) {
      if (this.type == 11 && var3 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3593 = new class167();
         if (!this.field3593.method3386(var1, var2)) {
            this.field3593 = null;
         } else {
            if (this.field3595 == null || this.field3596 == null) {
               this.method6104();
            }

         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Leb;I)V",
      garbageValue = "2051438500"
   )
   public void method6176(String var1, UrlRequester var2) {
      if (this.type == 11 && var1 != null) {
         this.field3593 = new class167();
         this.field3593.method3423(var1, var2);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1638192290"
   )
   void method6104() {
      this.field3595 = new HashMap();
      this.field3596 = new HashMap();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "868662197"
   )
   public void method6105(int var1, int var2) {
      if (this.type == 11) {
         if (this.field3595 == null) {
            this.method6104();
         }

         this.field3595.put(var1, var2);
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)V",
      garbageValue = "-36"
   )
   public void method6106(String var1, int var2) {
      if (this.type == 11) {
         if (this.field3596 == null) {
            this.method6104();
         }

         this.field3596.put(var1, var2);
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Z",
      garbageValue = "373427864"
   )
   public boolean method6190(int var1, int var2, int var3, int var4) {
      if (this.type == 11 && this.field3593 != null && this.method6191()) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field3593.method3402()[0] * (float)this.width);
         int var6 = (int)(this.field3593.method3402()[1] * (float)this.height);
         int var7 = var5 + (int)(this.field3593.method3402()[2] * (float)this.width);
         int var8 = var6 + (int)(this.field3593.method3402()[3] * (float)this.height);
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "60"
   )
   public boolean method6191() {
      return this.field3543 == 2;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "9"
   )
   public int method6109(String var1) {
      return this.type == 11 && this.field3593 != null && this.method6191() ? this.field3593.method3411(var1) : -1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "639730871"
   )
   public String method6110(String var1) {
      return this.type == 11 && this.field3593 != null && this.method6191() ? this.field3593.method3397(var1) : null;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "85"
   )
   public int method6111() {
      return this.field3596 != null && this.field3596.size() > 0 ? 1 : 0;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-131492431"
   )
   public int method6121() {
      if (this.type == 11 && this.field3593 != null && this.field3596 != null && !this.field3596.isEmpty()) {
         String var1 = this.field3593.method3393();
         return var1 != null && this.field3596.containsKey(this.field3593.method3393()) ? (Integer)this.field3596.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-33"
   )
   public String method6113() {
      if (this.type == 11 && this.field3593 != null) {
         String var1 = this.field3593.method3393();
         Iterator var2 = this.field3593.method3390().iterator();

         while(var2.hasNext()) {
            class178 var3 = (class178)var2.next();
            String var4 = String.format("%%%S%%", var3.method3514());
            if (var3.vmethod3513() == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod3515()));
            } else {
               var1.replaceAll(var4, var3.vmethod3511());
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "7"
   )
   public int[] method6114() {
      if (this.type == 11 && this.field3593 != null) {
         int[] var1 = new int[3];
         int var2 = 0;
         Iterator var3 = this.field3593.method3390().iterator();

         while(var3.hasNext()) {
            class178 var4 = (class178)var3.next();
            if (!var4.method3514().equals("user_id")) {
               if (var4.vmethod3513() != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod3515();
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

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Leb;I)Z",
      garbageValue = "-1187893314"
   )
   public boolean method6115(UrlRequester var1) {
      if (this.type == 11 && this.field3593 != null) {
         this.field3593.method3387(var1);
         if (this.field3593.method3398() != this.field3543) {
            this.field3543 = this.field3593.method3398();
            if (this.field3543 >= 100) {
               return true;
            }

            if (this.field3543 == 2) {
               this.method6116();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2026401274"
   )
   void method6116() {
      this.noClickThrough = true;
      ArrayList var1 = this.field3593.method3399();
      ArrayList var2 = this.field3593.method3392();
      int var3 = var1.size() + var2.size();
      this.children = new Widget[var3];
      int var4 = 0;

      Iterator var5;
      Widget var7;
      for(var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class173 var6 = (class173)var5.next();
         var7 = class18.method260(5, this, var4, 0, 0, 0, 0, var6.field1829);
         var7.field3562 = var6.field1830.method2828();
         class307 var8 = new class307(var6.field1830);
         field3569.method7427(var7.field3562, var8);
      }

      for(var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class174 var9 = (class174)var5.next();
         var7 = class18.method260(4, this, var4, 0, 0, 0, 0, var9.field1840);
         var7.text = var9.field1836;
         var7.fontId = (Integer)this.field3595.get(var9.field1839);
         var7.textXAlignment = var9.field1837;
         var7.textYAlignment = var9.field1834;
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1199908718"
   )
   public void method6117() {
      this.field3635 = new class308();

      for(int var1 = 1; var1 <= 12; ++var1) {
         this.field3635.field3452.method384(var1, 0);
      }

      for(char var2 = 0; var2 < ' '; ++var2) {
         this.field3635.field3452.method385(var2, 0);
      }

      this.field3635.field3452.method385('\u0080', 0);
      this.field3635.field3452.method384(82, 2);
      this.field3635.field3452.method384(81, 2);
      this.field3635.field3452.method384(86, 2);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(B)Llo;",
      garbageValue = "22"
   )
   public class310 method6118() {
      return this.field3635 != null ? this.field3635.field3458 : null;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(I)Lle;",
      garbageValue = "-830172282"
   )
   public class305 method6119() {
      return this.field3635 != null ? this.field3635.field3451 : null;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)Lbv;",
      garbageValue = "1"
   )
   public class27 method6120() {
      return this.field3635 != null ? this.field3635.field3452 : null;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(B)Lla;",
      garbageValue = "1"
   )
   public class308 method6163() {
      return this.field3635;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Llo;I)Z",
      garbageValue = "754011370"
   )
   boolean method6122(class310 var1) {
      boolean var2 = false;
      if (this.text != null && !this.text.isEmpty()) {
         var2 |= var1.method5966(PacketBufferNode.method5467(this.text));
         this.text = "";
      }

      if (this.text2 != null && !this.text2.isEmpty()) {
         var2 |= var1.method5820(PacketBufferNode.method5467(this.text2));
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1726558614"
   )
   public boolean method6123() {
      class310 var1 = this.method6118();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.method5873() && this.fontId != -1) {
            int var3 = var1.method5874();
            int var4 = var1.method5958();
            int var5 = var1.method6029();
            int var6 = var1.method5871();
            Font var7 = this.getFont();
            if (var7 != null) {
               var2 |= var1.method6005(var7);
               var2 |= this.method6122(var1);
               var2 |= var1.method5826(var3, var4);
               var2 |= var1.method5841(var5, var6);
            }
         } else if (var1.method5873()) {
            var2 |= this.method6122(var1);
         }

         var1.method5816();
         return var2;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1217651397"
   )
   static final int method6151(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "([Lmy;IIIIIIIII)V",
      garbageValue = "721605112"
   )
   @Export("drawInterface")
   static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
      Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Widget var10 = var0[var9];
         if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
            int var11;
            if (var8 == -1) {
               Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
               Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
               Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
               Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
               var11 = ++Client.rootWidgetCount - 1;
            } else {
               var11 = var8;
            }

            var10.rootIndex = var11;
            var10.cycle = Client.cycle;
            if (!var10.isIf3 || !WallDecoration.isComponentHidden(var10)) {
               if (var10.contentType > 0) {
                  class103.method2671(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.transparencyTop;
               int var15;
               int var16;
               if (var10 == Client.clickedWidget) {
                  if (var1 != -1412584499 && !var10.isScrollBar) {
                     class146.field1660 = var0;
                     ItemLayer.field2360 = var6;
                     WorldMapAreaData.field3024 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field663) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field664) {
                        var15 = Client.field664;
                     }

                     if (var15 + var10.width > Client.field664 + Client.clickedWidgetParent.width) {
                        var15 = Client.field664 + Client.clickedWidgetParent.width - var10.width;
                     }

                     if (var16 < Client.field597) {
                        var16 = Client.field597;
                     }

                     if (var16 + var10.height > Client.field597 + Client.clickedWidgetParent.height) {
                        var16 = Client.field597 + Client.clickedWidgetParent.height - var10.height;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if (!var10.isScrollBar) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var10.type == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.width;
                  var22 = var13 + var10.height;
                  if (var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2 ? var19 : var2;
                  var16 = var20 > var3 ? var20 : var3;
                  var17 = var21 < var4 ? var21 : var4;
                  var18 = var22 < var5 ? var22 : var5;
               } else {
                  var19 = var12 + var10.width;
                  var20 = var13 + var10.height;
                  var15 = var12 > var2 ? var12 : var2;
                  var16 = var13 > var3 ? var13 : var3;
                  var17 = var19 < var4 ? var19 : var4;
                  var18 = var20 < var5 ? var20 : var5;
               }

               if (!var10.isIf3 || var15 < var17 && var16 < var18) {
                  if (var10.contentType != 0) {
                     if (var10.contentType == 1336) {
                        if (WorldMapSectionType.clientPreferences.method2426()) {
                           var13 += 15;
                           class420.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var41 = Runtime.getRuntime();
                           var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.isLowDetail) {
                              var21 = 16711680;
                           }

                           class420.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.contentType == 1337) {
                        Client.viewportX = var12;
                        Client.viewportY = var13;
                        Projectile.drawEntities(var12, var13, var10.width, var10.height);
                        Client.field722[var10.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1338) {
                        AbstractByteArrayCopier.drawMinimap(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1339) {
                        HitSplatDefinition.drawCompass(var10, var12, var13, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.contentType == 1400) {
                        WorldMapData_1.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
                     }

                     if (var10.contentType == 1401) {
                        WorldMapData_1.worldMap.drawOverview(var12, var13, var10.width, var10.height);
                     }

                     if (var10.contentType == 1402) {
                        ArchiveDiskActionHandler.loginScreenRunesAnimation.draw(var12, Client.cycle);
                     }
                  }

                  if (var10.type == 0) {
                     if (!var10.isIf3 && WallDecoration.isComponentHidden(var10) && var10 != InvDefinition.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (!var10.isIf3) {
                        if (var10.scrollY > var10.scrollHeight - var10.height) {
                           var10.scrollY = var10.scrollHeight - var10.height;
                        }

                        if (var10.scrollY < 0) {
                           var10.scrollY = 0;
                        }
                     }

                     drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
                     if (var28 != null) {
                        GrandExchangeOfferOwnWorldComparator.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  } else if (var10.type == 11) {
                     if (WallDecoration.isComponentHidden(var10) && var10 != InvDefinition.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (var10.children != null) {
                        drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
                  }

                  if (Client.isResizable || Client.field698[var11] || Client.gameDrawingMode > 1) {
                     if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        class154.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
                     }

                     if (var10.type != 1) {
                        if (var10.type == 3) {
                           if (JagexCache.runCs1(var10)) {
                              var19 = var10.color2;
                              if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                 var19 = var10.mouseOverColor2;
                              }
                           } else {
                              var19 = var10.color;
                              if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                 var19 = var10.mouseOverColor;
                              }
                           }

                           if (var10.fill) {
                              switch (var10.fillMode.field4981) {
                                 case 1:
                                    Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
                                    break;
                                 case 2:
                                    Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
                                    break;
                                 default:
                                    if (var14 == 0) {
                                       Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
                                    } else {
                                       Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                    }
                              }
                           } else if (var14 == 0) {
                              Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
                           } else {
                              Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                           }
                        } else if (var10.type == 4) {
                           Font var40 = var10.getFont();
                           if (var40 == null) {
                              if (field3637) {
                                 class69.invalidateWidget(var10);
                              }
                           } else {
                              String var42 = var10.text;
                              if (JagexCache.runCs1(var10)) {
                                 var20 = var10.color2;
                                 if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
                                    var20 = var10.mouseOverColor2;
                                 }

                                 if (var10.text2.length() > 0) {
                                    var42 = var10.text2;
                                 }
                              } else {
                                 var20 = var10.color;
                                 if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
                                    var20 = var10.mouseOverColor;
                                 }
                              }

                              if (var10.isIf3 && var10.itemId != -1) {
                                 ItemComposition var43 = ParamComposition.ItemDefinition_get(var10.itemId);
                                 var42 = var43.name;
                                 if (var42 == null) {
                                    var42 = "null";
                                 }

                                 if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                    var42 = Canvas.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class311.formatItemStacks(var10.itemQuantity);
                                 }
                              }

                              if (var10 == Client.meslayerContinueWidget) {
                                 var42 = "Please wait...";
                                 var20 = var10.color;
                              }

                              if (!var10.isIf3) {
                                 var42 = Player.method2340(var42, var10);
                              }

                              var40.drawLines(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
                           }
                        } else {
                           int var23;
                           int var24;
                           int var25;
                           if (var10.type == 5) {
                              SpritePixels var38;
                              if (!var10.isIf3) {
                                 var38 = var10.getSprite(JagexCache.runCs1(var10), class345.urlRequester);
                                 if (var38 != null) {
                                    var38.drawTransBgAt(var12, var13);
                                 } else if (field3637) {
                                    class69.invalidateWidget(var10);
                                 }
                              } else {
                                 if (var10.itemId != -1) {
                                    var38 = class293.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
                                 } else {
                                    var38 = var10.getSprite(false, class345.urlRequester);
                                 }

                                 if (var38 == null) {
                                    if (field3637) {
                                       class69.invalidateWidget(var10);
                                    }
                                 } else {
                                    var20 = var38.width;
                                    var21 = var38.height;
                                    if (!var10.spriteTiling) {
                                       var22 = var10.width * 4096 / var20;
                                       if (var10.spriteAngle != 0) {
                                          var38.method9136(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
                                       } else if (var14 != 0) {
                                          var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if (var20 == var10.width && var21 == var10.height) {
                                          var38.drawTransBgAt(var12, var13);
                                       } else {
                                          var38.drawScaledAt(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.spriteAngle != 0) {
                                                var38.method9136(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var38.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21);
                                             }
                                          }
                                       }

                                       Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              int var26;
                              if (var10.type == 6) {
                                 boolean var36 = JagexCache.runCs1(var10);
                                 if (var36) {
                                    var20 = var10.sequenceId2;
                                 } else {
                                    var20 = var10.sequenceId;
                                 }

                                 Model var39 = null;
                                 var22 = 0;
                                 if (var10.itemId != -1) {
                                    ItemComposition var44 = ParamComposition.ItemDefinition_get(var10.itemId);
                                    if (var44 != null) {
                                       var44 = var44.getCountObj(var10.itemQuantity);
                                       var39 = var44.getModel(1);
                                       if (var39 != null) {
                                          var39.calculateBoundsCylinder();
                                          var22 = var39.height / 2;
                                       } else {
                                          class69.invalidateWidget(var10);
                                       }
                                    }
                                 } else if (var10.modelType == 5) {
                                    if (var10.modelId == 0) {
                                       var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var39 = BuddyRankComparator.localPlayer.getModel();
                                    }
                                 } else {
                                    NPCComposition var45 = null;
                                    NewStuff var33 = null;
                                    if (var10.modelType == 6) {
                                       var25 = var10.modelId;
                                       if (var25 >= 0 && var25 < Client.npcs.length) {
                                          NPC var34 = Client.npcs[var25];
                                          if (var34 != null) {
                                             var45 = var34.definition;
                                             var33 = var34.method2566();
                                          }
                                       }
                                    }

                                    SequenceDefinition var35 = null;
                                    var26 = -1;
                                    if (var20 != -1) {
                                       var35 = Coord.SequenceDefinition_get(var20);
                                       var26 = var10.modelFrame;
                                    }

                                    var39 = var10.getModel(var35, var26, var36, BuddyRankComparator.localPlayer.appearance, var45, var33);
                                    if (var39 == null && field3637) {
                                       class69.invalidateWidget(var10);
                                    }
                                 }

                                 Rasterizer3D.method4305(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
                                 if (var39 != null) {
                                    if (!var10.isIf3) {
                                       var39.method4651(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
                                    } else {
                                       var39.calculateBoundsCylinder();
                                       if (var10.modelOrthog) {
                                          var39.method4629(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
                                       } else {
                                          var39.method4651(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.Rasterizer3D_method3();
                              } else {
                                 Font var29;
                                 if (var10.type == 8 && var10 == Script.field975 && Client.field536 == Client.field550) {
                                    var19 = 0;
                                    var20 = 0;
                                    var29 = class420.fontPlain12;
                                    String var30 = var10.text;

                                    String var31;
                                    for(var30 = Player.method2340(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
                                       var24 = var30.indexOf("<br>");
                                       if (var24 != -1) {
                                          var31 = var30.substring(0, var24);
                                          var30 = var30.substring(var24 + 4);
                                       } else {
                                          var31 = var30;
                                          var30 = "";
                                       }

                                       var25 = var29.stringWidth(var31);
                                       if (var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.width - 5 - var19;
                                    var25 = var13 + var10.height + 5;
                                    if (var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if (var19 + var24 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if (var25 + var20 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
                                    var30 = var10.text;
                                    var26 = var25 + var29.ascent + 2;

                                    for(var30 = Player.method2340(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
                                       int var27 = var30.indexOf("<br>");
                                       if (var27 != -1) {
                                          var31 = var30.substring(0, var27);
                                          var30 = var30.substring(var27 + 4);
                                       } else {
                                          var31 = var30;
                                          var30 = "";
                                       }

                                       var29.draw(var31, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.type == 9) {
                                    if (var10.field3545) {
                                       var19 = var12;
                                       var20 = var13 + var10.height;
                                       var21 = var12 + var10.width;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.width;
                                       var22 = var13 + var10.height;
                                    }

                                    if (var10.lineWid == 1) {
                                       Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
                                    } else {
                                       WorldMapIcon_1.method4802(var19, var20, var21, var22, var10.color, var10.lineWid);
                                    }
                                 } else if (var10.type == 12) {
                                    class310 var37 = var10.method6118();
                                    class305 var32 = var10.method6119();
                                    if (var37 != null && var32 != null && var37.method5873()) {
                                       var29 = var10.getFont();
                                       if (var29 != null) {
                                          Client.field688.method9209(var12, var13, var10.width, var10.height, var37.method5874(), var37.method5958(), var37.method5871(), var37.method6029(), var37.method5870());
                                          var22 = var10.textShadowed ? var10.spriteShadow : -1;
                                          if (!var37.method5955() && var37.method5865().method6996()) {
                                             Client.field688.method9203(var32.field3440, var22, var32.field3436, var32.field3437);
                                             Client.field688.method9204(var37.method5866(), var29);
                                          } else {
                                             Client.field688.method9203(var10.color, var22, var32.field3436, var32.field3437);
                                             Client.field688.method9204(var37.method5865(), var29);
                                          }

                                          Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
