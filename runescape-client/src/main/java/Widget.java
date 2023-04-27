import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("Widget")
public class Widget extends Node {
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("Widget_cachedSprites")
   static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("Widget_cachedModels")
   static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("Widget_cachedFonts")
   static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("Widget_cachedSpriteMasks")
   static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   static class398 field3568;
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   static class398 field3553;
   @ObfuscatedName("bj")
   public static boolean field3567;
   @ObfuscatedName("bn")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1713081171
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 55577617
   )
   @Export("childIndex")
   public int childIndex = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 883712245
   )
   @Export("type")
   public int type;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 35076151
   )
   @Export("buttonType")
   public int buttonType = 0;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1021339961
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1596536121
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1484444061
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 241981169
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -480604969
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -115015413
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1651158159
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1960603747
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 1756076191
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 262951665
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -747355095
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -794961409
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 1473950221
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 640195305
   )
   public int field3586 = 1;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 276729069
   )
   public int field3587 = 1;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 913615679
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("ck")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1469632775
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1223232735
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -773060713
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -1273374131
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 1409091639
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1449039161
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 1614966389
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 1780253209
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("cv")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Lta;"
   )
   @Export("fillMode")
   public FillMode fillMode;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = 1634279623
   )
   @Export("transparencyTop")
   public int transparencyTop;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 122284991
   )
   @Export("transparencyBot")
   public int transparencyBot;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 1354778849
   )
   @Export("lineWid")
   public int lineWid;
   @ObfuscatedName("cj")
   public boolean field3603;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -363627527
   )
   @Export("spriteId2")
   public int spriteId2;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1352724779
   )
   @Export("spriteId")
   public int spriteId;
   @ObfuscatedName("cp")
   public String field3606;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -738051099
   )
   @Export("spriteAngle")
   public int spriteAngle;
   @ObfuscatedName("dm")
   @Export("spriteTiling")
   public boolean spriteTiling;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = 1638912775
   )
   @Export("outline")
   public int outline;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = -353676735
   )
   @Export("spriteShadow")
   public int spriteShadow;
   @ObfuscatedName("do")
   @Export("spriteFlipV")
   public boolean spriteFlipV;
   @ObfuscatedName("di")
   @Export("spriteFlipH")
   public boolean spriteFlipH;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -123768459
   )
   @Export("modelType")
   public int modelType;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = -168077555
   )
   @Export("modelId")
   public int modelId;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = 1761517389
   )
   @Export("modelType2")
   int modelType2;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = -3148259
   )
   @Export("modelId2")
   int modelId2;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = -1526544909
   )
   @Export("sequenceId")
   public int sequenceId;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = -717228843
   )
   @Export("sequenceId2")
   public int sequenceId2;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = 1909456039
   )
   @Export("modelOffsetX")
   public int modelOffsetX;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = 844501061
   )
   @Export("modelOffsetY")
   public int modelOffsetY;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 797932055
   )
   @Export("modelAngleX")
   public int modelAngleX;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = -480949115
   )
   @Export("modelAngleY")
   public int modelAngleY;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1023931993
   )
   @Export("modelAngleZ")
   public int modelAngleZ;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 942674363
   )
   @Export("modelZoom")
   public int modelZoom;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = -289037969
   )
   public int field3625;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = -238796869
   )
   public int field3626;
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lmw;"
   )
   public PlayerComposition field3584;
   @ObfuscatedName("dj")
   @Export("modelOrthog")
   public boolean modelOrthog;
   @ObfuscatedName("dx")
   @Export("modelTransparency")
   public boolean modelTransparency;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -1681772717
   )
   @Export("itemQuantityMode")
   public int itemQuantityMode;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = -1065036825
   )
   @Export("fontId")
   public int fontId;
   @ObfuscatedName("ds")
   @Export("text")
   public String text;
   @ObfuscatedName("da")
   @Export("text2")
   public String text2;
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = -931338759
   )
   @Export("textLineHeight")
   public int textLineHeight;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = 1002257489
   )
   @Export("textXAlignment")
   public int textXAlignment;
   @ObfuscatedName("eq")
   @ObfuscatedGetter(
      intValue = -1553957401
   )
   @Export("textYAlignment")
   public int textYAlignment;
   @ObfuscatedName("et")
   @Export("textShadowed")
   public boolean textShadowed;
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lgy;"
   )
   class166 field3554;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 1888225603
   )
   int field3639;
   @ObfuscatedName("ej")
   HashMap field3640;
   @ObfuscatedName("ea")
   HashMap field3641;
   @ObfuscatedName("es")
   @ObfuscatedSignature(
      descriptor = "Lmt;"
   )
   class312 field3642;
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = 1652991301
   )
   @Export("flags")
   public int flags;
   @ObfuscatedName("el")
   public boolean field3581;
   @ObfuscatedName("en")
   public byte[][] field3645;
   @ObfuscatedName("er")
   public byte[][] field3646;
   @ObfuscatedName("eg")
   public int[] field3627;
   @ObfuscatedName("ed")
   public int[] field3670;
   @ObfuscatedName("eh")
   @Export("dataText")
   public String dataText;
   @ObfuscatedName("ek")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("parent")
   public Widget parent;
   @ObfuscatedName("ec")
   @ObfuscatedGetter(
      intValue = 154898553
   )
   @Export("dragZoneSize")
   public int dragZoneSize;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = -1849043027
   )
   @Export("dragThreshold")
   public int dragThreshold;
   @ObfuscatedName("ee")
   @Export("isScrollBar")
   public boolean isScrollBar;
   @ObfuscatedName("fe")
   @Export("spellActionName")
   public String spellActionName;
   @ObfuscatedName("fs")
   @Export("hasListener")
   public boolean hasListener;
   @ObfuscatedName("fi")
   @Export("onLoad")
   public Object[] onLoad;
   @ObfuscatedName("fh")
   @Export("onClick")
   public Object[] onClick;
   @ObfuscatedName("fl")
   @Export("onClickRepeat")
   public Object[] onClickRepeat;
   @ObfuscatedName("fp")
   @Export("onRelease")
   public Object[] onRelease;
   @ObfuscatedName("fo")
   @Export("onHold")
   public Object[] onHold;
   @ObfuscatedName("fx")
   @Export("onMouseOver")
   public Object[] onMouseOver;
   @ObfuscatedName("fd")
   @Export("onMouseRepeat")
   public Object[] onMouseRepeat;
   @ObfuscatedName("fb")
   @Export("onMouseLeave")
   public Object[] onMouseLeave;
   @ObfuscatedName("fn")
   @Export("onDrag")
   public Object[] onDrag;
   @ObfuscatedName("fz")
   @Export("onDragComplete")
   public Object[] onDragComplete;
   @ObfuscatedName("fa")
   @Export("onTargetEnter")
   public Object[] onTargetEnter;
   @ObfuscatedName("fy")
   @Export("onTargetLeave")
   public Object[] onTargetLeave;
   @ObfuscatedName("fw")
   @Export("onVarTransmit")
   public Object[] onVarTransmit;
   @ObfuscatedName("fr")
   @Export("varTransmitTriggers")
   public int[] varTransmitTriggers;
   @ObfuscatedName("fv")
   @Export("onInvTransmit")
   public Object[] onInvTransmit;
   @ObfuscatedName("fq")
   @Export("invTransmitTriggers")
   public int[] invTransmitTriggers;
   @ObfuscatedName("fc")
   @Export("onStatTransmit")
   public Object[] onStatTransmit;
   @ObfuscatedName("ff")
   @Export("statTransmitTriggers")
   public int[] statTransmitTriggers;
   @ObfuscatedName("fj")
   @Export("onTimer")
   public Object[] onTimer;
   @ObfuscatedName("fg")
   @Export("onOp")
   public Object[] onOp;
   @ObfuscatedName("fk")
   public Object[] field3677;
   @ObfuscatedName("fm")
   @Export("onScroll")
   public Object[] onScroll;
   @ObfuscatedName("ft")
   @Export("onChatTransmit")
   public Object[] onChatTransmit;
   @ObfuscatedName("fu")
   @Export("onKey")
   public Object[] onKey;
   @ObfuscatedName("gr")
   public Object[] field3681;
   @ObfuscatedName("go")
   public Object[] field3582;
   @ObfuscatedName("gs")
   @Export("onFriendTransmit")
   public Object[] onFriendTransmit;
   @ObfuscatedName("gj")
   @Export("onClanTransmit")
   public Object[] onClanTransmit;
   @ObfuscatedName("gg")
   public Object[] field3637;
   @ObfuscatedName("ge")
   public Object[] field3566;
   @ObfuscatedName("ga")
   @Export("onMiscTransmit")
   public Object[] onMiscTransmit;
   @ObfuscatedName("gt")
   @Export("onDialogAbort")
   public Object[] onDialogAbort;
   @ObfuscatedName("gu")
   @Export("onSubChange")
   public Object[] onSubChange;
   @ObfuscatedName("gh")
   @Export("onResize")
   public Object[] onResize;
   @ObfuscatedName("gy")
   @Export("onStockTransmit")
   public Object[] onStockTransmit;
   @ObfuscatedName("gd")
   public Object[] field3692;
   @ObfuscatedName("gw")
   public Object[] field3653;
   @ObfuscatedName("gc")
   @Export("cs1Instructions")
   public int[][] cs1Instructions;
   @ObfuscatedName("gf")
   @Export("cs1Comparisons")
   public int[] cs1Comparisons;
   @ObfuscatedName("gm")
   @Export("cs1ComparisonValues")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -529297769
   )
   @Export("mouseOverRedirect")
   public int mouseOverRedirect;
   @ObfuscatedName("gq")
   public String field3698;
   @ObfuscatedName("gk")
   @Export("buttonText")
   public String buttonText;
   @ObfuscatedName("gb")
   @Export("itemIds")
   public int[] itemIds;
   @ObfuscatedName("gp")
   @Export("itemQuantities")
   public int[] itemQuantities;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -2006098851
   )
   @Export("itemId")
   public int itemId;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = 1336975799
   )
   @Export("itemQuantity")
   public int itemQuantity;
   @ObfuscatedName("gx")
   @ObfuscatedGetter(
      intValue = 1575517389
   )
   @Export("modelFrame")
   public int modelFrame;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = 1438245367
   )
   @Export("modelFrameCycle")
   public int modelFrameCycle;
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "[Lmq;"
   )
   @Export("children")
   public Widget[] children;
   @ObfuscatedName("hw")
   public boolean field3671;
   @ObfuscatedName("hi")
   public boolean field3662;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = -288310997
   )
   public int field3709;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = -1285197923
   )
   public int field3560;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = -320567063
   )
   public int field3711;
   @ObfuscatedName("hx")
   @ObfuscatedGetter(
      intValue = 610184185
   )
   public int field3700;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = 372799529
   )
   @Export("rootIndex")
   public int rootIndex;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = -1197721959
   )
   @Export("cycle")
   public int cycle;
   @ObfuscatedName("hs")
   public int[] field3643;
   @ObfuscatedName("hn")
   @Export("noClickThrough")
   public boolean noClickThrough;
   @ObfuscatedName("hl")
   @Export("noScrollThrough")
   public boolean noScrollThrough;
   @ObfuscatedName("hh")
   @Export("prioritizeMenuEntry")
   public boolean prioritizeMenuEntry;

   static {
      field3568 = new class398(10, class396.field4532);
      field3553 = new class398(10, class396.field4532);
      field3567 = false;
   }

   public Widget() {
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field3603 = false;
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
      this.field3625 = 0;
      this.field3626 = 0;
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
      this.field3639 = -1;
      this.flags = 0;
      this.field3581 = false;
      this.dataText = "";
      this.parent = null;
      this.dragZoneSize = 0;
      this.dragThreshold = 0;
      this.isScrollBar = false;
      this.spellActionName = "";
      this.hasListener = false;
      this.mouseOverRedirect = -1;
      this.field3698 = "";
      this.buttonText = "Ok";
      this.itemId = -1;
      this.itemQuantity = 0;
      this.modelFrame = 0;
      this.modelFrameCycle = 0;
      this.field3671 = false;
      this.field3662 = false;
      this.field3709 = -1;
      this.field3560 = 0;
      this.field3711 = 0;
      this.field3700 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1896942489"
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
         this.field3698 = var1.readStringCp1252NullTerminated();
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "604095410"
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
            this.field3625 = var1.readUnsignedShort();
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
         this.field3603 = var1.readUnsignedByte() == 1;
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
      descriptor = "(Lsg;I)[Ljava/lang/Object;",
      garbageValue = "-1943743675"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)[I",
      garbageValue = "1664985017"
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ZLet;B)Ltq;",
      garbageValue = "0"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1, UrlRequester var2) {
      field3567 = false;
      if (this.field3606 != null) {
         SpritePixels var3 = this.method6493(var2);
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
            var6 = class484.SpriteBuffer_getSprite(ScriptEvent.Widget_spritesArchive, var7, 0);
            if (var6 == null) {
               field3567 = true;
               return null;
            } else {
               this.method6369(var6);
               Widget_cachedSprites.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Let;B)Ltq;",
      garbageValue = "42"
   )
   SpritePixels method6493(UrlRequester var1) {
      if (!this.method6368()) {
         return this.method6486(var1);
      } else {
         String var2 = this.field3606 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
         SpritePixels var3 = (SpritePixels)field3553.method7718(var2);
         if (var3 == null) {
            SpritePixels var4 = this.method6486(var1);
            if (var4 != null) {
               var3 = var4.method9504();
               this.method6369(var3);
               field3553.method7699(var2, var3);
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Let;B)Ltq;",
      garbageValue = "1"
   )
   SpritePixels method6486(UrlRequester var1) {
      if (this.field3606 != null && var1 != null) {
         class311 var2 = (class311)field3568.method7718(this.field3606);
         if (var2 == null) {
            var2 = new class311(this.field3606, var1);
            field3568.method7699(this.field3606, var2);
         }

         return var2.method6032();
      } else {
         return null;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-32"
   )
   boolean method6368() {
      return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ltq;I)V",
      garbageValue = "-2012216835"
   )
   void method6369(SpritePixels var1) {
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

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Lon;",
      garbageValue = "-1026608542"
   )
   @Export("getFont")
   public Font getFont() {
      field3567 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            AbstractArchive var3 = ScriptEvent.Widget_spritesArchive;
            AbstractArchive var4 = class146.Widget_fontsArchive;
            int var5 = this.fontId;
            byte[] var7 = var3.takeFile(var5, 0);
            boolean var6;
            if (var7 == null) {
               var6 = false;
            } else {
               class485.SpriteBuffer_decode(var7);
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
                  Font var9 = new Font(var8, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                  class398.method7709();
                  var10 = var9;
               }

               var2 = var10;
            }

            if (var2 != null) {
               Widget_cachedFonts.put(var2, (long)this.fontId);
            } else {
               field3567 = true;
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lha;IZLmw;Lhs;Lhv;I)Lit;",
      garbageValue = "764440828"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewStuff var6) {
      field3567 = false;
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
         if (var6 != null && var6.field2004 && var7 == 6) {
            var7 = 3;
         }

         long var9 = (long)(var8 + (var7 << 16));
         if (var6 != null) {
            var9 |= var6.field2002 << 20;
         }

         Model var11 = (Model)Widget_cachedModels.get(var9);
         if (var11 == null) {
            ModelData var12 = null;
            int var13 = 64;
            int var14 = 768;
            switch (var7) {
               case 1:
                  var12 = ModelData.ModelData_get(DynamicObject.field985, var8, 0);
                  break;
               case 2:
                  var12 = AbstractArchive.getNpcDefinition(var8).method3770((NewStuff)null);
                  break;
               case 3:
                  var12 = var4 != null ? var4.getModelData() : null;
                  break;
               case 4:
                  ItemComposition var15 = HealthBarUpdate.ItemDefinition_get(var8);
                  var12 = var15.getModelData(10);
                  var13 += var15.field2257;
                  var14 += var15.field2258;
               case 5:
               default:
                  break;
               case 6:
                  var12 = AbstractArchive.getNpcDefinition(var8).method3770(var6);
            }

            if (var12 == null) {
               field3567 = true;
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lll;",
      garbageValue = "29"
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

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "2"
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2144772982"
   )
   public boolean method6374() {
      return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "799063438"
   )
   public boolean method6383() {
      return this.type == 11 || this.type == 12;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Let;J)V"
   )
   public void method6376(String var1, UrlRequester var2, long var3) {
      if (this.type == 11 && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3554 = new class166();
         if (!this.field3554.method3482(var1, var2)) {
            this.field3554 = null;
         } else {
            if (this.field3640 == null || this.field3641 == null) {
               this.method6445();
            }

         }
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Let;I)V",
      garbageValue = "554088678"
   )
   public void method6375(String var1, UrlRequester var2) {
      if (this.type == 11 && var1 != null) {
         this.field3554 = new class166();
         this.field3554.method3500(var1, var2);
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-119"
   )
   void method6445() {
      this.field3640 = new HashMap();
      this.field3641 = new HashMap();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-108"
   )
   public void method6466(int var1, int var2) {
      if (this.type == 11) {
         if (this.field3640 == null) {
            this.method6445();
         }

         this.field3640.put(var1, var2);
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "1150325710"
   )
   public void method6380(String var1, int var2) {
      if (this.type == 11) {
         if (this.field3641 == null) {
            this.method6445();
         }

         this.field3641.put(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)Z",
      garbageValue = "-51"
   )
   public boolean method6381(int var1, int var2, int var3, int var4) {
      if (this.type == 11 && this.field3554 != null && this.method6382()) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field3554.method3490()[0] * (float)this.width);
         int var6 = (int)(this.field3554.method3490()[1] * (float)this.height);
         int var7 = var5 + (int)(this.field3554.method3490()[2] * (float)this.width);
         int var8 = var6 + (int)(this.field3554.method3490()[3] * (float)this.height);
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1778717342"
   )
   public boolean method6382() {
      return this.field3639 == 2;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "434397306"
   )
   public int method6378(String var1) {
      return this.type == 11 && this.field3554 != null && this.method6382() ? this.field3554.method3494(var1) : -1;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "206473711"
   )
   public String method6384(String var1) {
      return this.type == 11 && this.field3554 != null && this.method6382() ? this.field3554.method3486(var1) : null;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "934337314"
   )
   public int method6385() {
      return this.field3641 != null && this.field3641.size() > 0 ? 1 : 0;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1876121307"
   )
   public int method6386() {
      if (this.type == 11 && this.field3554 != null && this.field3641 != null && !this.field3641.isEmpty()) {
         String var1 = this.field3554.method3525();
         return var1 != null && this.field3641.containsKey(this.field3554.method3525()) ? (Integer)this.field3641.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1850533434"
   )
   public String method6503() {
      if (this.type == 11 && this.field3554 != null) {
         String var1 = this.field3554.method3525();
         Iterator var2 = this.field3554.method3491().iterator();

         while(var2.hasNext()) {
            class177 var3 = (class177)var2.next();
            String var4 = String.format("%%%S%%", var3.method3606());
            if (var3.vmethod3607() == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod3608()));
            } else {
               var1.replaceAll(var4, var3.vmethod3616());
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "574261316"
   )
   public int[] method6388() {
      if (this.type == 11 && this.field3554 != null) {
         int[] var1 = new int[3];
         int var2 = 0;
         Iterator var3 = this.field3554.method3491().iterator();

         while(var3.hasNext()) {
            class177 var4 = (class177)var3.next();
            if (!var4.method3606().equals("user_id")) {
               if (var4.vmethod3607() != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod3608();
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

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(Let;I)Z",
      garbageValue = "622561639"
   )
   public boolean method6415(UrlRequester var1) {
      if (this.type == 11 && this.field3554 != null) {
         this.field3554.method3483(var1);
         if (this.field3554.method3484() != this.field3639) {
            this.field3639 = this.field3554.method3484();
            if (this.field3639 >= 100) {
               return true;
            }

            if (this.field3639 == 2) {
               this.method6390();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1652307373"
   )
   void method6390() {
      this.noClickThrough = true;
      ArrayList var1 = this.field3554.method3489();
      ArrayList var2 = this.field3554.method3542();
      int var3 = var1.size() + var2.size();
      this.children = new Widget[var3];
      int var4 = 0;

      Iterator var5;
      Widget var7;
      for(var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class172 var6 = (class172)var5.next();
         var7 = class314.method6354(5, this, var4, 0, 0, 0, 0, var6.field1848);
         var7.field3606 = var6.field1849.method2866();
         class311 var8 = new class311(var6.field1849);
         field3568.method7699(var7.field3606, var8);
      }

      for(var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
         class173 var9 = (class173)var5.next();
         var7 = class314.method6354(4, this, var4, 0, 0, 0, 0, var9.field1856);
         var7.text = var9.field1855;
         var7.fontId = (Integer)this.field3640.get(var9.field1853);
         var7.textXAlignment = var9.field1858;
         var7.textYAlignment = var9.field1859;
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   public void method6391() {
      this.field3642 = new class312();

      for(int var1 = 1; var1 <= 12; ++var1) {
         this.field3642.field3506.method407(var1, 0);
      }

      for(char var2 = 0; var2 < ' '; ++var2) {
         this.field3642.field3506.method408(var2, 0);
      }

      this.field3642.field3506.method408('\u0080', 0);
      this.field3642.field3506.method407(82, 2);
      this.field3642.field3506.method407(81, 2);
      this.field3642.field3506.method407(86, 2);
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(B)Lmz;",
      garbageValue = "-56"
   )
   public class314 method6392() {
      return this.field3642 != null ? this.field3642.field3502 : null;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)Llo;",
      garbageValue = "-1740765458"
   )
   public class309 method6394() {
      return this.field3642 != null ? this.field3642.field3501 : null;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)Lbb;",
      garbageValue = "1929367879"
   )
   public class27 method6367() {
      return this.field3642 != null ? this.field3642.field3506 : null;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(I)Lmt;",
      garbageValue = "-645268928"
   )
   public class312 method6395() {
      return this.field3642;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(Lmz;B)Z",
      garbageValue = "-12"
   )
   boolean method6393(class314 var1) {
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
         var2 |= var1.method6089(var5);
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
         var2 |= var1.method6090(var5);
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-85"
   )
   public boolean method6440() {
      class314 var1 = this.method6392();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.method6143() && this.fontId != -1) {
            int var3 = var1.method6200();
            int var4 = var1.method6299();
            int var5 = var1.method6142();
            int var6 = var1.method6141();
            Font var7 = this.getFont();
            if (var7 != null) {
               var2 |= var1.method6129(var7);
               var2 |= this.method6393(var1);
               var2 |= var1.method6096(var3, var4);
               var2 |= var1.method6111(var5, var6);
            }
         } else if (var1.method6143()) {
            var2 |= this.method6393(var1);
         }

         var1.method6283();
         return var2;
      }
   }
}
