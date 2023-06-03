import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class327 {
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   class392 field3566 = new class392();
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   class392 field3560 = new class392();
   @ObfuscatedName("au")
   boolean field3567 = false;
   @ObfuscatedName("ai")
   boolean field3562 = true;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1321716601
   )
   int field3563 = 0;
   @ObfuscatedName("aw")
   boolean field3564 = false;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1150554175
   )
   int field3565 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -686509035
   )
   int field3574 = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1579752717
   )
   int field3569 = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 2085648293
   )
   int field3568 = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -399039343
   )
   int field3579 = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1719027535
   )
   int field3554 = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1047916879
   )
   int field3571 = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -713150515
   )
   int field3572 = Integer.MAX_VALUE;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -2092422027
   )
   int field3573 = Integer.MAX_VALUE;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1924765425
   )
   int field3570 = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -154548847
   )
   int field3575 = 0;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 611922185
   )
   int field3576 = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1879603107
   )
   int field3577 = 0;
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   class321 field3578;
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   class321 field3552;

   class327() {
      this.field3566.method7272(1);
      this.field3560.method7272(1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1366871947"
   )
   void method6135() {
      this.field3563 = (this.field3563 + 1) % 60;
      if (this.field3571 > 0) {
         --this.field3571;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "102"
   )
   public boolean method6056(boolean var1) {
      var1 = var1 && this.field3562;
      boolean var2 = this.field3567 != var1;
      this.field3567 = var1;
      if (!this.field3567) {
         this.method6080(this.field3568, this.field3568);
      }

      return var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1331805463"
   )
   public void method6057(boolean var1) {
      this.field3562 = var1;
      this.field3567 = var1 && this.field3567;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-1468802518"
   )
   boolean method6334(String var1) {
      String var2 = this.field3566.method7267();
      if (!var2.equals(var1)) {
         var1 = this.method6124(var1);
         this.field3566.method7279(var1);
         this.method6338(this.field3576, this.field3577);
         this.method6317();
         this.method6133();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-149482019"
   )
   boolean method6219(String var1) {
      this.field3560.method7279(var1);
      return true;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lpn;I)Z",
      garbageValue = "-1972901380"
   )
   boolean method6060(AbstractFont var1) {
      boolean var2 = !this.field3564;
      this.field3566.method7271(var1);
      this.field3560.method7271(var1);
      this.field3564 = true;
      var2 |= this.method6338(this.field3576, this.field3577);
      var2 |= this.method6080(this.field3579, this.field3568);
      if (this.method6317()) {
         this.method6133();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "156796357"
   )
   public boolean method6061(int var1, int var2) {
      boolean var3 = this.field3570 != var1 || var2 != this.field3575;
      this.field3570 = var1;
      this.field3575 = var2;
      var3 |= this.method6338(this.field3576, this.field3577);
      return var3;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1859935155"
   )
   public boolean method6167(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field3566.method7290();
      this.field3566.method7397(var1);
      this.field3560.method7397(var1);
      if (this.method6317()) {
         this.method6133();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1046429285"
   )
   public boolean method6110(int var1) {
      this.field3566.method7269(var1);
      if (this.method6317()) {
         this.method6133();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1518453135"
   )
   public boolean method6064(int var1) {
      this.field3573 = var1;
      if (this.method6317()) {
         this.method6133();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "0"
   )
   public boolean method6338(int var1, int var2) {
      if (!this.method6238()) {
         this.field3576 = var1;
         this.field3577 = var2;
         return false;
      } else {
         int var3 = this.field3576;
         int var4 = this.field3577;
         int var5 = Math.max(0, this.field3566.method7285() - this.field3570 + 2);
         int var6 = Math.max(0, this.field3566.method7288() - this.field3575 + 1);
         this.field3576 = Math.max(0, Math.min(var5, var1));
         this.field3577 = Math.max(0, Math.min(var6, var2));
         return var3 != this.field3576 || var4 != this.field3577;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1434004662"
   )
   public boolean method6066(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? this.field3566.method7273(var1, var2) : false;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2092078385"
   )
   public void method6067(int var1) {
      this.field3566.method7361(var1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1102820457"
   )
   public void method6168(int var1) {
      this.field3565 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "94089397"
   )
   public void method6069(int var1) {
      this.field3566.method7272(var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1327708796"
   )
   public void method6070(int var1) {
      this.field3566.method7270(var1);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "121"
   )
   public boolean method6071(int var1) {
      this.field3569 = var1;
      String var2 = this.field3566.method7267();
      int var3 = var2.length();
      var2 = this.method6124(var2);
      if (var2.length() != var3) {
         this.field3566.method7279(var2);
         this.method6338(this.field3576, this.field3577);
         this.method6317();
         this.method6133();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-91946430"
   )
   public void method6072() {
      this.field3564 = false;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-41"
   )
   public boolean method6254(int var1) {
      if (this.method6134(var1)) {
         this.method6186();
         class393 var2 = this.field3566.method7276((char)var1, this.field3568, this.field3572);
         this.method6080(var2.method7412(), var2.method7412());
         this.method6317();
         this.method6133();
      }

      return true;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1892200113"
   )
   public void method6273() {
      if (!this.method6186() && this.field3568 > 0) {
         int var1 = this.field3566.method7281(this.field3568 - 1);
         this.method6133();
         this.method6080(var1, var1);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1621563977"
   )
   public void method6075() {
      if (!this.method6186() && this.field3568 < this.field3566.method7266()) {
         int var1 = this.field3566.method7281(this.field3568);
         this.method6133();
         this.method6080(var1, var1);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1930066506"
   )
   public void method6076() {
      if (!this.method6186() && this.field3568 > 0) {
         class473 var1 = this.method6126(this.field3568 - 1);
         int var2 = this.field3566.method7282((Integer)var1.field4903, this.field3568);
         this.method6133();
         this.method6080(var2, var2);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1784378069"
   )
   public void method6248() {
      if (!this.method6186() && this.field3568 < this.field3566.method7266()) {
         class473 var1 = this.method6126(this.field3568);
         int var2 = this.field3566.method7282(this.field3568, (Integer)var1.field4904);
         this.method6133();
         this.method6080(var2, var2);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1362686979"
   )
   boolean method6186() {
      if (!this.method6123()) {
         return false;
      } else {
         int var1 = this.field3566.method7282(this.field3579, this.field3568);
         this.method6133();
         this.method6080(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1257491815"
   )
   public void method6079() {
      this.method6080(0, this.field3566.method7266());
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "58"
   )
   public boolean method6080(int var1, int var2) {
      if (!this.method6238()) {
         this.field3579 = var1;
         this.field3568 = var2;
         return false;
      } else {
         if (var1 > this.field3566.method7266()) {
            var1 = this.field3566.method7266();
         }

         if (var2 > this.field3566.method7266()) {
            var2 = this.field3566.method7266();
         }

         boolean var3 = this.field3579 != var1 || var2 != this.field3568;
         this.field3579 = var1;
         if (var2 != this.field3568) {
            this.field3568 = var2;
            this.field3563 = 0;
            this.method6131();
         }

         if (var3 && this.field3552 != null) {
            this.field3552.vmethod5986();
         }

         return var3;
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "65535"
   )
   public void method6331(boolean var1) {
      class473 var2 = this.method6127(this.field3568);
      this.method6129((Integer)var2.field4903, var1);
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-115"
   )
   public void method6216(boolean var1) {
      class473 var2 = this.method6127(this.field3568);
      this.method6129((Integer)var2.field4904, var1);
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1186975323"
   )
   public void method6083(boolean var1) {
      this.method6129(0, var1);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1751235989"
   )
   public void method6084(boolean var1) {
      this.method6129(this.field3566.method7266(), var1);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-95"
   )
   public void method6266(boolean var1) {
      if (this.method6123() && !var1) {
         this.method6129(Math.min(this.field3579, this.field3568), var1);
      } else if (this.field3568 > 0) {
         this.method6129(this.field3568 - 1, var1);
      }

   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-48"
   )
   public void method6294(boolean var1) {
      if (this.method6123() && !var1) {
         this.method6129(Math.max(this.field3579, this.field3568), var1);
      } else if (this.field3568 < this.field3566.method7266()) {
         this.method6129(this.field3568 + 1, var1);
      }

   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "899685139"
   )
   public void method6087(boolean var1) {
      if (this.field3568 > 0) {
         class473 var2 = this.method6126(this.field3568 - 1);
         this.method6129((Integer)var2.field4903, var1);
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1949621946"
   )
   public void method6095(boolean var1) {
      if (this.field3568 < this.field3566.method7266()) {
         class473 var2 = this.method6126(this.field3568 + 1);
         this.method6129((Integer)var2.field4904, var1);
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "1"
   )
   public void method6089(boolean var1) {
      if (this.field3568 > 0) {
         this.method6129(this.field3566.method7289(this.field3568, -1), var1);
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "48"
   )
   public void method6246(boolean var1) {
      if (this.field3568 < this.field3566.method7266()) {
         this.method6129(this.field3566.method7289(this.field3568, 1), var1);
      }

   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1183245304"
   )
   public void method6091(boolean var1) {
      if (this.field3568 > 0) {
         int var2 = this.method6130();
         this.method6129(this.field3566.method7289(this.field3568, -var2), var1);
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1906419112"
   )
   public void method6092(boolean var1) {
      if (this.field3568 < this.field3566.method7266()) {
         int var2 = this.method6130();
         this.method6129(this.field3566.method7289(this.field3568, var2), var1);
      }

   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1430584970"
   )
   public void method6093(boolean var1) {
      class396 var2 = this.field3566.method7275(0, this.field3568);
      class473 var3 = var2.method7541();
      this.method6129(this.field3566.method7296((Integer)var3.field4903, this.field3577), var1);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "14452723"
   )
   public void method6241(boolean var1) {
      class396 var2 = this.field3566.method7275(0, this.field3568);
      class473 var3 = var2.method7541();
      this.method6129(this.field3566.method7296((Integer)var3.field4903, this.field3575 + this.field3577), var1);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "537466825"
   )
   public void method6159(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      class473 var6;
      int var8;
      if (!this.field3564) {
         var8 = 0;
      } else {
         var1 += this.field3576;
         var2 += this.field3577;
         var6 = this.method6150();
         var8 = this.field3566.method7296(var1 - (Integer)var6.field4903, var2 - (Integer)var6.field4904);
      }

      if (var3 && var4) {
         this.field3574 = 1;
         var6 = this.method6126(var8);
         class473 var7 = this.method6126(this.field3554);
         this.method6125(var7, var6);
      } else if (var3) {
         this.field3574 = 1;
         var6 = this.method6126(var8);
         this.method6080((Integer)var6.field4903, (Integer)var6.field4904);
         this.field3554 = (Integer)var6.field4903;
      } else if (var4) {
         this.method6080(this.field3554, var8);
      } else {
         if (this.field3571 > 0 && var8 == this.field3554) {
            if (this.field3579 == this.field3568) {
               this.field3574 = 1;
               var6 = this.method6126(var8);
               this.method6080((Integer)var6.field4903, (Integer)var6.field4904);
            } else {
               this.field3574 = 2;
               var6 = this.method6127(var8);
               this.method6080((Integer)var6.field4903, (Integer)var6.field4904);
            }
         } else {
            this.field3574 = 0;
            this.method6080(var8, var8);
            this.field3554 = var8;
         }

         this.field3571 = 25;
      }

   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-279189279"
   )
   public void method6096(int var1, int var2) {
      if (this.field3564 && this.method6107()) {
         var1 += this.field3576;
         var2 += this.field3577;
         class473 var3 = this.method6150();
         int var4 = this.field3566.method7296(var1 - (Integer)var3.field4903, var2 - (Integer)var3.field4904);
         class473 var5;
         class473 var6;
         switch (this.field3574) {
            case 0:
               this.method6080(this.field3579, var4);
               break;
            case 1:
               var5 = this.method6126(this.field3554);
               var6 = this.method6126(var4);
               this.method6125(var5, var6);
               break;
            case 2:
               var5 = this.method6127(this.field3554);
               var6 = this.method6127(var4);
               this.method6125(var5, var6);
         }
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "-1117002090"
   )
   public void method6097(Clipboard var1) {
      class396 var2 = this.field3566.method7275(this.field3579, this.field3568);
      if (!var2.method7531()) {
         String var3 = var2.method7529();
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
         }
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "50"
   )
   public void method6098(Clipboard var1) {
      if (this.method6123()) {
         this.method6097(var1);
         this.method6186();
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "301106092"
   )
   public void method6184(Clipboard var1) {
      Transferable var2 = var1.getContents((Object)null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = this.method6124((String)var2.getTransferData(DataFlavor.stringFlavor));
            this.method6186();
            class393 var4 = this.field3566.method7277(var3, this.field3568, this.field3572);
            this.method6080(var4.method7412(), var4.method7412());
            this.method6317();
            this.method6133();
         } catch (Exception var5) {
         }
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-72"
   )
   public void method6100() {
      this.field3577 = Math.max(0, this.field3577 - this.field3566.method7287());
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-125833639"
   )
   public void method6264() {
      int var1 = Math.max(0, this.field3566.method7288() - this.field3575);
      this.field3577 = Math.min(var1, this.field3577 + this.field3566.method7287());
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Lmo;B)V",
      garbageValue = "5"
   )
   public void method6271(class321 var1) {
      this.field3578 = var1;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Lmo;I)V",
      garbageValue = "919903927"
   )
   public void method6103(class321 var1) {
      this.field3552 = var1;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)Lpk;",
      garbageValue = "58"
   )
   public class392 method6163() {
      return this.field3566;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)Lpk;",
      garbageValue = "-2034054674"
   )
   public class392 method6105() {
      return this.field3560;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(B)Lpw;",
      garbageValue = "-55"
   )
   public class396 method6106() {
      return this.field3566.method7275(this.field3579, this.field3568);
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-405027294"
   )
   public boolean method6107() {
      return this.field3567;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-246360184"
   )
   public boolean method6156() {
      return this.field3562;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1419094514"
   )
   public boolean method6109() {
      return this.method6107() && this.field3563 % 60 < 30;
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "2"
   )
   public int method6239() {
      return this.field3568;
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1682671662"
   )
   public int method6232() {
      return this.field3579;
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "115320322"
   )
   public boolean method6238() {
      return this.field3564;
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "841625291"
   )
   public int method6157() {
      return this.field3576;
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "19"
   )
   public int method6114() {
      return this.field3577;
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public int method6115() {
      return this.field3566.method7290();
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-368943571"
   )
   public int method6170() {
      return this.field3566.method7299();
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-173585629"
   )
   public int method6117() {
      return this.field3573;
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "133494003"
   )
   public int method6118() {
      return this.field3565;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-81"
   )
   public int method6229() {
      return this.field3566.method7305();
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-516900515"
   )
   public int method6305() {
      return this.field3569;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "374345971"
   )
   public int method6121() {
      return this.field3566.method7378();
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1962908634"
   )
   public boolean method6122() {
      return this.method6170() > 1;
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1300653391"
   )
   boolean method6123() {
      return this.field3579 != this.field3568;
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "37"
   )
   String method6124(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (this.method6134(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(Lsf;Lsf;I)V",
      garbageValue = "-1064229642"
   )
   void method6125(class473 var1, class473 var2) {
      if ((Integer)var2.field4903 < (Integer)var1.field4903) {
         this.method6080((Integer)var1.field4904, (Integer)var2.field4903);
      } else {
         this.method6080((Integer)var1.field4903, (Integer)var2.field4904);
      }

   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(II)Lsf;",
      garbageValue = "-324312765"
   )
   class473 method6126(int var1) {
      int var2 = this.field3566.method7266();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.method6132(this.field3566.method7262(var5 - 1).field4438)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.method6132(this.field3566.method7262(var5).field4438)) {
            var4 = var5;
            break;
         }
      }

      return new class473(var3, var4);
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(IB)Lsf;",
      garbageValue = "89"
   )
   class473 method6127(int var1) {
      int var2 = this.field3566.method7266();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.field3566.method7262(var5 - 1).field4438 == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.field3566.method7262(var5).field4438 == '\n') {
            var4 = var5;
            break;
         }
      }

      return new class473(var3, var4);
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-5"
   )
   boolean method6317() {
      if (!this.method6238()) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field3566.method7266() > this.field3573) {
            this.field3566.method7282(this.field3573, this.field3566.method7266());
            var1 = true;
         }

         int var2 = this.method6170();
         int var3;
         if (this.field3566.method7319() > var2) {
            var3 = this.field3566.method7289(0, var2) - 1;
            this.field3566.method7282(var3, this.field3566.method7266());
            var1 = true;
         }

         if (var1) {
            var3 = this.field3568;
            int var4 = this.field3579;
            int var5 = this.field3566.method7266();
            if (this.field3568 > var5) {
               var3 = var5;
            }

            if (this.field3579 > var5) {
               var4 = var5;
            }

            this.method6080(var4, var3);
         }

         return var1;
      }
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1859543250"
   )
   void method6129(int var1, boolean var2) {
      if (var2) {
         this.method6080(this.field3579, var1);
      } else {
         this.method6080(var1, var1);
      }

   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409912129"
   )
   int method6130() {
      return this.field3575 / this.field3566.method7287();
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method6131() {
      class396 var1 = this.field3566.method7275(0, this.field3568);
      class473 var2 = var1.method7541();
      int var3 = this.field3566.method7287();
      int var4 = (Integer)var2.field4903 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field4904 - 3;
      int var7 = var6 + var3 + 6;
      int var8 = this.field3576;
      int var9 = var8 + this.field3570;
      int var10 = this.field3577;
      int var11 = var10 + this.field3575;
      int var12 = this.field3576;
      int var13 = this.field3577;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field3570;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field3575;
      }

      this.method6338(var12, var13);
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-54"
   )
   boolean method6132(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1795542626"
   )
   void method6133() {
      if (this.field3578 != null) {
         this.field3578.vmethod5986();
      }

   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-565978703"
   )
   boolean method6134(int var1) {
      switch (this.field3569) {
         case 1:
            return class209.isAlphaNumeric((char)var1);
         case 2:
            return class382.isCharAlphabetic((char)var1);
         case 3:
            return class159.isDigit((char)var1);
         case 4:
            char var2 = (char)var1;
            if (class159.isDigit(var2)) {
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

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "(B)Lsf;",
      garbageValue = "0"
   )
   class473 method6150() {
      int var1 = this.field3566.method7294(this.field3570);
      int var2 = this.field3566.method7325(this.field3575);
      return new class473(var1, var2);
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1915884245"
   )
   static final boolean method6088() {
      return Client.isMenuOpen;
   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "689278853"
   )
   static void method6341() {
      if (Client.oculusOrbState == 1) {
         Client.field602 = true;
      }

   }
}
