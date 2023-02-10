import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class307 {
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("worldSelectFlagSprites")
   static IndexedSprite[] worldSelectFlagSprites;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lnp;"
   )
   class372 field3506 = new class372();
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lnp;"
   )
   class372 field3523 = new class372();
   @ObfuscatedName("x")
   boolean field3508 = false;
   @ObfuscatedName("a")
   boolean field3509 = true;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2080878637
   )
   int field3510 = 0;
   @ObfuscatedName("d")
   boolean field3511 = false;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1251381815
   )
   int field3512 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1587046269
   )
   int field3514 = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1718344237
   )
   int field3507 = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -177271749
   )
   int field3515 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1303698229
   )
   int field3516 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1196699783
   )
   int field3517 = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1407037675
   )
   int field3518 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1330593425
   )
   int field3519 = Integer.MAX_VALUE;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -246405609
   )
   int field3520 = Integer.MAX_VALUE;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -816769447
   )
   int field3521 = Integer.MAX_VALUE;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1954984243
   )
   int field3522 = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1183676473
   )
   int field3527 = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1081586051
   )
   int field3496 = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1305557139
   )
   int field3525 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   class301 field3500;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   class301 field3497;

   class307() {
      this.field3506.method7101(1);
      this.field3523.method7101(1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-907314219"
   )
   void method5922() {
      this.field3510 = (this.field3510 + 1) % 60;
      if (this.field3518 > 0) {
         --this.field3518;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "-101"
   )
   public boolean method6057(boolean var1) {
      var1 = var1 && this.field3509;
      boolean var2 = this.field3508 != var1;
      this.field3508 = var1;
      if (!this.field3508) {
         this.method6013(this.field3515, this.field3515);
      }

      return var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "49231833"
   )
   public void method5924(boolean var1) {
      this.field3509 = var1;
      this.field3508 = var1 && this.field3508;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-2115269539"
   )
   boolean method5946(String var1) {
      String var2 = this.field3506.method7078();
      if (!var2.equals(var1)) {
         var1 = this.method5990(var1);
         this.field3506.method7088(var1);
         this.method5932(this.field3496, this.field3525);
         this.method5994();
         this.method5999();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "2098104516"
   )
   boolean method5926(String var1) {
      this.field3523.method7088(var1);
      return true;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lnw;B)Z",
      garbageValue = "103"
   )
   boolean method6033(AbstractFont var1) {
      boolean var2 = !this.field3511;
      this.field3506.method7089(var1);
      this.field3523.method7089(var1);
      this.field3511 = true;
      var2 |= this.method5932(this.field3496, this.field3525);
      var2 |= this.method6013(this.field3516, this.field3515);
      if (this.method5994()) {
         this.method5999();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-7"
   )
   public boolean method5928(int var1, int var2) {
      boolean var3 = this.field3522 != var1 || var2 != this.field3527;
      this.field3522 = var1;
      this.field3527 = var2;
      var3 |= this.method5932(this.field3496, this.field3525);
      return var3;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "59"
   )
   public boolean method5929(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field3506.method7099();
      this.field3506.method7079(var1, true);
      this.field3523.method7079(var1, true);
      if (this.method5994()) {
         this.method5999();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-229191440"
   )
   public boolean method5930(int var1) {
      if (var1 < 0) {
         this.field3519 = Integer.MAX_VALUE;
      } else {
         this.field3519 = var1;
      }

      if (this.method5994()) {
         this.method5999();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-125"
   )
   public boolean method6150(int var1) {
      this.field3521 = var1;
      if (this.method5994()) {
         this.method5999();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1771659696"
   )
   public boolean method5932(int var1, int var2) {
      if (!this.method5979()) {
         this.field3496 = var1;
         this.field3525 = var2;
         return false;
      } else {
         int var3 = this.field3496;
         int var4 = this.field3525;
         int var5 = Math.max(0, this.field3506.method7175() - this.field3522 + 2);
         int var6 = Math.max(0, this.field3506.method7095() - this.field3527 + 1);
         this.field3496 = Math.max(0, Math.min(var5, var1));
         this.field3525 = Math.max(0, Math.min(var6, var2));
         return var3 != this.field3496 || var4 != this.field3525;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "25"
   )
   public boolean method6068(int var1, int var2) {
      return true;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "575795924"
   )
   public void method5934(int var1) {
      this.field3506.method7083(var1);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1337038489"
   )
   public void method5935(int var1) {
      this.field3512 = var1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "646756591"
   )
   public void method5936(int var1) {
      this.field3506.method7101(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1378818373"
   )
   public void method5937(int var1) {
      this.field3506.method7080(var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-49"
   )
   public boolean method5938(int var1) {
      this.field3507 = var1;
      String var2 = this.field3506.method7078();
      int var3 = var2.length();
      var2 = this.method5990(var2);
      if (var2.length() != var3) {
         this.field3506.method7088(var2);
         this.method5932(this.field3496, this.field3525);
         this.method5994();
         this.method5999();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "66"
   )
   public void method6031() {
      this.field3511 = false;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1369936671"
   )
   public boolean method5940(int var1) {
      if (this.method6000(var1)) {
         this.method5945();
         class373 var2 = this.field3506.method7174((char)var1, this.field3515, this.field3520, this.field3519);
         this.method6013(var2.method7186(), var2.method7186());
         this.method5994();
         this.method5999();
      }

      return true;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-70"
   )
   public void method5941() {
      if (!this.method5945() && this.field3515 > 0) {
         int var1 = this.field3506.method7152(this.field3515 - 1);
         this.method5999();
         this.method6013(var1, var1);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "127602061"
   )
   public void method6124() {
      if (!this.method5945() && this.field3515 < this.field3506.method7173()) {
         int var1 = this.field3506.method7152(this.field3515);
         this.method5999();
         this.method6013(var1, var1);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1362450681"
   )
   public void method5943() {
      if (!this.method5945() && this.field3515 > 0) {
         class447 var1 = this.method5992(this.field3515 - 1);
         int var2 = this.field3506.method7091((Integer)var1.field4832, this.field3515);
         this.method5999();
         this.method6013(var2, var2);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1932520887"
   )
   public void method5944() {
      if (!this.method5945() && this.field3515 < this.field3506.method7173()) {
         class447 var1 = this.method5992(this.field3515);
         int var2 = this.field3506.method7091(this.field3515, (Integer)var1.field4833);
         this.method5999();
         this.method6013(var2, var2);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1659058039"
   )
   boolean method5945() {
      if (!this.method6087()) {
         return false;
      } else {
         int var1 = this.field3506.method7091(this.field3516, this.field3515);
         this.method5999();
         this.method6013(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   public void method5991() {
      this.method6013(0, this.field3506.method7173());
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1250868463"
   )
   public boolean method6013(int var1, int var2) {
      if (!this.method5979()) {
         this.field3516 = var1;
         this.field3515 = var2;
         return false;
      } else {
         if (var1 > this.field3506.method7173()) {
            var1 = this.field3506.method7173();
         }

         if (var2 > this.field3506.method7173()) {
            var2 = this.field3506.method7173();
         }

         boolean var3 = this.field3516 != var1 || var2 != this.field3515;
         this.field3516 = var1;
         if (var2 != this.field3515) {
            this.field3515 = var2;
            this.field3510 = 0;
            this.method5997();
         }

         if (var3 && this.field3497 != null) {
            this.field3497.vmethod5862();
         }

         return var3;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1672652675"
   )
   public void method5923(boolean var1) {
      class447 var2 = this.method5993(this.field3515);
      this.method5982((Integer)var2.field4832, var1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "754153094"
   )
   public void method6060(boolean var1) {
      class447 var2 = this.method5993(this.field3515);
      this.method5982((Integer)var2.field4833, var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1647876465"
   )
   public void method6132(boolean var1) {
      this.method5982(0, var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1488591424"
   )
   public void method6160(boolean var1) {
      this.method5982(this.field3506.method7173(), var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "0"
   )
   public void method6037(boolean var1) {
      if (this.method6087() && !var1) {
         this.method5982(Math.min(this.field3516, this.field3515), var1);
      } else if (this.field3515 > 0) {
         this.method5982(this.field3515 - 1, var1);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1917917432"
   )
   public void method5953(boolean var1) {
      if (this.method6087() && !var1) {
         this.method5982(Math.max(this.field3516, this.field3515), var1);
      } else if (this.field3515 < this.field3506.method7173()) {
         this.method5982(this.field3515 + 1, var1);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1661249652"
   )
   public void method6163(boolean var1) {
      if (this.field3515 > 0) {
         class447 var2 = this.method5992(this.field3515 - 1);
         this.method5982((Integer)var2.field4832, var1);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1637073208"
   )
   public void method5955(boolean var1) {
      if (this.field3515 < this.field3506.method7173()) {
         class447 var2 = this.method5992(this.field3515 + 1);
         this.method5982((Integer)var2.field4833, var1);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-2057418884"
   )
   public void method5956(boolean var1) {
      if (this.field3515 > 0) {
         this.method5982(this.field3506.method7115(this.field3515, -1), var1);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-2073067096"
   )
   public void method5957(boolean var1) {
      if (this.field3515 < this.field3506.method7173()) {
         this.method5982(this.field3506.method7115(this.field3515, 1), var1);
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "113"
   )
   public void method5958(boolean var1) {
      if (this.field3515 > 0) {
         int var2 = this.method6186();
         this.method5982(this.field3506.method7115(this.field3515, -var2), var1);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-20"
   )
   public void method5959(boolean var1) {
      if (this.field3515 < this.field3506.method7173()) {
         int var2 = this.method6186();
         this.method5982(this.field3506.method7115(this.field3515, var2), var1);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1600044103"
   )
   public void method5960(boolean var1) {
      class376 var2 = this.field3506.method7140(0, this.field3515);
      class447 var3 = var2.method7303();
      this.method5982(this.field3506.method7092((Integer)var3.field4832, this.field3525), var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-82"
   )
   public void method5961(boolean var1) {
      class376 var2 = this.field3506.method7140(0, this.field3515);
      class447 var3 = var2.method7303();
      this.method5982(this.field3506.method7092((Integer)var3.field4832, this.field3525 + this.field3527), var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "-663576903"
   )
   public void method5962(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      int var8;
      if (!this.field3511) {
         var8 = 0;
      } else {
         var1 += this.field3496;
         var2 += this.field3525;
         var8 = this.field3506.method7092(var1, var2);
      }

      class447 var6;
      if (var3 && var4) {
         this.field3514 = 1;
         var6 = this.method5992(var8);
         class447 var7 = this.method5992(this.field3517);
         this.method6051(var7, var6);
      } else if (var3) {
         this.field3514 = 1;
         var6 = this.method5992(var8);
         this.method6013((Integer)var6.field4832, (Integer)var6.field4833);
         this.field3517 = (Integer)var6.field4832;
      } else if (var4) {
         this.method6013(this.field3517, var8);
      } else {
         if (this.field3518 > 0 && var8 == this.field3517) {
            if (this.field3515 == this.field3516) {
               this.field3514 = 1;
               var6 = this.method5992(var8);
               this.method6013((Integer)var6.field4832, (Integer)var6.field4833);
            } else {
               this.field3514 = 2;
               var6 = this.method5993(var8);
               this.method6013((Integer)var6.field4832, (Integer)var6.field4833);
            }
         } else {
            this.field3514 = 0;
            this.method6013(var8, var8);
            this.field3517 = var8;
         }

         this.field3518 = 25;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "50"
   )
   public void method6048(int var1, int var2) {
      if (this.field3511 && this.method5974()) {
         var1 += this.field3496;
         var2 += this.field3525;
         int var3 = this.field3506.method7092(var1, var2);
         class447 var4;
         class447 var5;
         switch (this.field3514) {
            case 0:
               this.method6013(this.field3516, var3);
               break;
            case 1:
               var4 = this.method5992(this.field3517);
               var5 = this.method5992(var3);
               this.method6051(var4, var5);
               break;
            case 2:
               var4 = this.method5993(this.field3517);
               var5 = this.method5993(var3);
               this.method6051(var4, var5);
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "38"
   )
   public void method5964(Clipboard var1) {
      class376 var2 = this.field3506.method7140(this.field3516, this.field3515);
      if (!var2.method7297()) {
         String var3 = var2.method7307();
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "2113716103"
   )
   public void method5965(Clipboard var1) {
      if (this.method6087()) {
         this.method5964(var1);
         this.method5945();
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "-1739927066"
   )
   public void method6043(Clipboard var1) {
      Transferable var2 = var1.getContents((Object)null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = this.method5990((String)var2.getTransferData(DataFlavor.stringFlavor));
            this.method5945();
            class373 var4 = this.field3506.method7086(var3, this.field3515, this.field3520, this.field3519);
            this.method6013(var4.method7186(), var4.method7186());
            this.method5994();
            this.method5999();
         } catch (Exception var5) {
            System.out.println("Error pasting clipboard to InputField.");
         }
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2102286537"
   )
   public void method5967() {
      this.field3525 = Math.max(0, this.field3525 - this.field3506.method7096());
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "373252948"
   )
   public void method5968() {
      int var1 = Math.max(0, this.field3506.method7095() - this.field3527);
      this.field3525 = Math.min(var1, this.field3525 + this.field3506.method7096());
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lkm;I)V",
      garbageValue = "1850283525"
   )
   public void method5969(class301 var1) {
      this.field3500 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lkm;I)V",
      garbageValue = "2122113051"
   )
   public void method5970(class301 var1) {
      this.field3497 = var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Lnp;",
      garbageValue = "1893289455"
   )
   public class372 method5971() {
      return this.field3506;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Lnp;",
      garbageValue = "-1034233503"
   )
   public class372 method6128() {
      return this.field3523;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Lnm;",
      garbageValue = "-44"
   )
   public class376 method5973() {
      return this.field3506.method7140(this.field3516, this.field3515);
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1981913214"
   )
   public boolean method5974() {
      return this.field3508;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2077111986"
   )
   public boolean method5954() {
      return this.field3509;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "110"
   )
   public boolean method5976() {
      return this.method5974() && this.field3510 % 60 < 30;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1889382032"
   )
   public int method6145() {
      return this.field3515;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "621557504"
   )
   public int method5978() {
      return this.field3516;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1371647930"
   )
   public boolean method5979() {
      return this.field3511;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "605810854"
   )
   public int method5980() {
      return this.field3496;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "25511"
   )
   public int method6041() {
      return this.field3525;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-880385464"
   )
   public int method5950() {
      return this.field3506.method7099();
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "595036192"
   )
   public int method5983() {
      return this.field3519;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "641760578"
   )
   public int method5984() {
      return this.field3521;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1597714886"
   )
   public int method5948() {
      return this.field3512;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1235797121"
   )
   public int method5985() {
      return this.field3506.method7100();
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-347080143"
   )
   public int method6058() {
      return this.field3507;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "19"
   )
   public int method5987() {
      return this.field3506.method7085();
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-68"
   )
   public boolean method5988() {
      return this.field3519 > 1;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1923749872"
   )
   boolean method6087() {
      return this.field3516 != this.field3515;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-182363535"
   )
   String method5990(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (this.method6000(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Lqd;Lqd;I)V",
      garbageValue = "1953734910"
   )
   void method6051(class447 var1, class447 var2) {
      if ((Integer)var2.field4832 < (Integer)var1.field4832) {
         this.method6013((Integer)var1.field4833, (Integer)var2.field4832);
      } else {
         this.method6013((Integer)var1.field4832, (Integer)var2.field4833);
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqd;",
      garbageValue = "11"
   )
   class447 method5992(int var1) {
      int var2 = this.field3506.method7173();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.method5998(this.field3506.method7074(var5 - 1).field4411)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.method5998(this.field3506.method7074(var5).field4411)) {
            var4 = var5;
            break;
         }
      }

      return new class447(var3, var4);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqd;",
      garbageValue = "127"
   )
   class447 method5993(int var1) {
      int var2 = this.field3506.method7173();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.field3506.method7074(var5 - 1).field4411 == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.field3506.method7074(var5).field4411 == '\n') {
            var4 = var5;
            break;
         }
      }

      return new class447(var3, var4);
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "100"
   )
   boolean method5994() {
      if (!this.method5979()) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field3506.method7173() > this.field3521) {
            this.field3506.method7091(this.field3521, this.field3506.method7173());
            var1 = true;
         }

         int var2;
         if (this.field3506.method7137() > this.field3519) {
            var2 = this.field3506.method7115(0, this.field3519) - 1;
            this.field3506.method7091(var2, this.field3506.method7173());
            var1 = true;
         }

         if (var1) {
            var2 = this.field3515;
            int var3 = this.field3516;
            int var4 = this.field3506.method7173();
            if (this.field3515 > var4) {
               var2 = var4;
            }

            if (this.field3516 > var4) {
               var3 = var4;
            }

            this.method6013(var3, var2);
         }

         return var1;
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "16"
   )
   void method5982(int var1, boolean var2) {
      if (var2) {
         this.method6013(this.field3516, var1);
      } else {
         this.method6013(var1, var1);
      }

   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-954530936"
   )
   int method6186() {
      return this.field3527 / this.field3506.method7096();
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1927387060"
   )
   void method5997() {
      class376 var1 = this.field3506.method7140(0, this.field3515);
      class447 var2 = var1.method7303();
      int var3 = this.field3506.method7096();
      int var4 = (Integer)var2.field4832 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field4833 - 3;
      int var7 = var6 + var3 + 6;
      int var8 = this.field3496;
      int var9 = var8 + this.field3522;
      int var10 = this.field3525;
      int var11 = var10 + this.field3527;
      int var12 = this.field3496;
      int var13 = this.field3525;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field3522;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field3527;
      }

      this.method5932(var12, var13);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "105"
   )
   boolean method5998(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "754124756"
   )
   void method5999() {
      if (this.field3500 != null) {
         this.field3500.vmethod5862();
      }

   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "1"
   )
   boolean method6000(int var1) {
      switch (this.field3507) {
         case 1:
            return class97.isAlphaNumeric((char)var1);
         case 2:
            return class155.isCharAlphabetic((char)var1);
         case 3:
            return CollisionMap.isDigit((char)var1);
         case 4:
            char var2 = (char)var1;
            if (CollisionMap.isDigit(var2)) {
               return true;
            } else {
               if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') {
                  return false;
               }

               return true;
            }
         default:
            return true;
      }
   }
}
