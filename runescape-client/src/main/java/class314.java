import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class314 {
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Loq;"
   )
   class379 field3536 = new class379();
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Loq;"
   )
   class379 field3535 = new class379();
   @ObfuscatedName("as")
   boolean field3530 = false;
   @ObfuscatedName("aj")
   boolean field3531 = true;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -870124373
   )
   int field3532 = 0;
   @ObfuscatedName("az")
   boolean field3533 = false;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1959011707
   )
   int field3534 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -971547877
   )
   int field3546 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -947277461
   )
   int field3528 = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1350344153
   )
   int field3537 = 0;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 542296527
   )
   int field3538 = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -600117957
   )
   int field3539 = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 2106407237
   )
   int field3540 = 0;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1383048587
   )
   int field3541 = Integer.MAX_VALUE;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -522869069
   )
   int field3542 = Integer.MAX_VALUE;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -212351097
   )
   int field3523 = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1953737631
   )
   int field3544 = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -466889091
   )
   int field3545 = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 607166941
   )
   int field3524 = 0;
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   class308 field3547;
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   class308 field3548;

   class314() {
      this.field3536.method7270(1);
      this.field3535.method7270(1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-76"
   )
   void method6283() {
      this.field3532 = (this.field3532 + 1) % 60;
      if (this.field3540 > 0) {
         --this.field3540;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "-825756514"
   )
   public boolean method6087(boolean var1) {
      var1 = var1 && this.field3531;
      boolean var2 = this.field3530 != var1;
      this.field3530 = var1;
      if (!this.field3530) {
         this.method6111(this.field3537, this.field3537);
      }

      return var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1575779976"
   )
   public void method6088(boolean var1) {
      this.field3531 = var1;
      this.field3530 = var1 && this.field3530;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "1247495644"
   )
   boolean method6089(String var1) {
      String var2 = this.field3536.method7265();
      if (!var2.equals(var1)) {
         var1 = this.method6155(var1);
         this.field3536.method7277(var1);
         this.method6096(this.field3545, this.field3524);
         this.method6159();
         this.method6164();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "2"
   )
   boolean method6090(String var1) {
      this.field3535.method7277(var1);
      return true;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lou;I)Z",
      garbageValue = "1219787460"
   )
   boolean method6129(AbstractFont var1) {
      boolean var2 = !this.field3533;
      this.field3536.method7373(var1);
      this.field3535.method7373(var1);
      this.field3533 = true;
      var2 |= this.method6096(this.field3545, this.field3524);
      var2 |= this.method6111(this.field3538, this.field3537);
      if (this.method6159()) {
         this.method6164();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "63"
   )
   public boolean method6092(int var1, int var2) {
      boolean var3 = this.field3523 != var1 || var2 != this.field3544;
      this.field3523 = var1;
      this.field3544 = var2;
      var3 |= this.method6096(this.field3545, this.field3524);
      return var3;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2034737462"
   )
   public boolean method6093(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field3536.method7379();
      this.field3536.method7320(var1);
      this.field3535.method7320(var1);
      if (this.method6159()) {
         this.method6164();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "16"
   )
   public boolean method6336(int var1) {
      this.field3536.method7261(var1);
      if (this.method6159()) {
         this.method6164();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1888462912"
   )
   public boolean method6095(int var1) {
      this.field3542 = var1;
      if (this.method6159()) {
         this.method6164();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "24"
   )
   public boolean method6096(int var1, int var2) {
      if (!this.method6143()) {
         this.field3545 = var1;
         this.field3524 = var2;
         return false;
      } else {
         int var3 = this.field3545;
         int var4 = this.field3524;
         int var5 = Math.max(0, this.field3536.method7283() - this.field3523 + 2);
         int var6 = Math.max(0, this.field3536.method7284() - this.field3544 + 1);
         this.field3545 = Math.max(0, Math.min(var5, var1));
         this.field3524 = Math.max(0, Math.min(var6, var2));
         return var3 != this.field3545 || var4 != this.field3524;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1553777879"
   )
   public boolean method6097(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? this.field3536.method7271(var1, var2) : false;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2084045870"
   )
   public void method6098(int var1) {
      this.field3536.method7272(var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1564790862"
   )
   public void method6086(int var1) {
      this.field3534 = var1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1444501030"
   )
   public void method6100(int var1) {
      this.field3536.method7270(var1);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-6347"
   )
   public void method6101(int var1) {
      this.field3536.method7298(var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "59"
   )
   public boolean method6102(int var1) {
      this.field3528 = var1;
      String var2 = this.field3536.method7265();
      int var3 = var2.length();
      var2 = this.method6155(var2);
      if (var2.length() != var3) {
         this.field3536.method7277(var2);
         this.method6096(this.field3545, this.field3524);
         this.method6159();
         this.method6164();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-83630880"
   )
   public void method6215() {
      this.field3533 = false;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-337201766"
   )
   public boolean method6104(int var1) {
      if (this.method6163(var1)) {
         this.method6109();
         class380 var2 = this.field3536.method7307((char)var1, this.field3537, this.field3541);
         this.method6111(var2.method7396(), var2.method7396());
         this.method6159();
         this.method6164();
      }

      return true;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1712590947"
   )
   public void method6207() {
      if (!this.method6109() && this.field3537 > 0) {
         int var1 = this.field3536.method7279(this.field3537 - 1);
         this.method6164();
         this.method6111(var1, var1);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-11"
   )
   public void method6167() {
      if (!this.method6109() && this.field3537 < this.field3536.method7264()) {
         int var1 = this.field3536.method7279(this.field3537);
         this.method6164();
         this.method6111(var1, var1);
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1555798008"
   )
   public void method6290() {
      if (!this.method6109() && this.field3537 > 0) {
         class461 var1 = this.method6157(this.field3537 - 1);
         int var2 = this.field3536.method7280((Integer)var1.field4886, this.field3537);
         this.method6164();
         this.method6111(var2, var2);
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2132510379"
   )
   public void method6342() {
      if (!this.method6109() && this.field3537 < this.field3536.method7264()) {
         class461 var1 = this.method6157(this.field3537);
         int var2 = this.field3536.method7280(this.field3537, (Integer)var1.field4887);
         this.method6164();
         this.method6111(var2, var2);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1772299463"
   )
   boolean method6109() {
      if (!this.method6154()) {
         return false;
      } else {
         int var1 = this.field3536.method7280(this.field3538, this.field3537);
         this.method6164();
         this.method6111(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-26"
   )
   public void method6352() {
      this.method6111(0, this.field3536.method7264());
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "19"
   )
   public boolean method6111(int var1, int var2) {
      if (!this.method6143()) {
         this.field3538 = var1;
         this.field3537 = var2;
         return false;
      } else {
         if (var1 > this.field3536.method7264()) {
            var1 = this.field3536.method7264();
         }

         if (var2 > this.field3536.method7264()) {
            var2 = this.field3536.method7264();
         }

         boolean var3 = this.field3538 != var1 || var2 != this.field3537;
         this.field3538 = var1;
         if (var2 != this.field3537) {
            this.field3537 = var2;
            this.field3532 = 0;
            this.method6162();
         }

         if (var3 && this.field3548 != null) {
            this.field3548.vmethod6027();
         }

         return var3;
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-994542859"
   )
   public void method6108(boolean var1) {
      class461 var2 = this.method6158(this.field3537);
      this.method6160((Integer)var2.field4886, var1);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-84102297"
   )
   public void method6217(boolean var1) {
      class461 var2 = this.method6158(this.field3537);
      this.method6160((Integer)var2.field4887, var1);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "78"
   )
   public void method6114(boolean var1) {
      this.method6160(0, var1);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-19"
   )
   public void method6222(boolean var1) {
      this.method6160(this.field3536.method7264(), var1);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "728659002"
   )
   public void method6116(boolean var1) {
      if (this.method6154() && !var1) {
         this.method6160(Math.min(this.field3538, this.field3537), var1);
      } else if (this.field3537 > 0) {
         this.method6160(this.field3537 - 1, var1);
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1785240009"
   )
   public void method6117(boolean var1) {
      if (this.method6154() && !var1) {
         this.method6160(Math.max(this.field3538, this.field3537), var1);
      } else if (this.field3537 < this.field3536.method7264()) {
         this.method6160(this.field3537 + 1, var1);
      }

   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "355798212"
   )
   public void method6351(boolean var1) {
      if (this.field3537 > 0) {
         class461 var2 = this.method6157(this.field3537 - 1);
         this.method6160((Integer)var2.field4886, var1);
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "3"
   )
   public void method6119(boolean var1) {
      if (this.field3537 < this.field3536.method7264()) {
         class461 var2 = this.method6157(this.field3537 + 1);
         this.method6160((Integer)var2.field4887, var1);
      }

   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "52"
   )
   public void method6120(boolean var1) {
      if (this.field3537 > 0) {
         this.method6160(this.field3536.method7282(this.field3537, -1), var1);
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-45"
   )
   public void method6121(boolean var1) {
      if (this.field3537 < this.field3536.method7264()) {
         this.method6160(this.field3536.method7282(this.field3537, 1), var1);
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "1"
   )
   public void method6122(boolean var1) {
      if (this.field3537 > 0) {
         int var2 = this.method6161();
         this.method6160(this.field3536.method7282(this.field3537, -var2), var1);
      }

   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "12979"
   )
   public void method6107(boolean var1) {
      if (this.field3537 < this.field3536.method7264()) {
         int var2 = this.method6161();
         this.method6160(this.field3536.method7282(this.field3537, var2), var1);
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1605724073"
   )
   public void method6124(boolean var1) {
      class383 var2 = this.field3536.method7341(0, this.field3537);
      class461 var3 = var2.method7512();
      this.method6160(this.field3536.method7281((Integer)var3.field4886, this.field3524), var1);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1731882601"
   )
   public void method6110(boolean var1) {
      class383 var2 = this.field3536.method7341(0, this.field3537);
      class461 var3 = var2.method7512();
      this.method6160(this.field3536.method7281((Integer)var3.field4886, this.field3544 + this.field3524), var1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "1549873407"
   )
   public void method6126(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      class461 var6;
      int var8;
      if (!this.field3533) {
         var8 = 0;
      } else {
         var1 += this.field3545;
         var2 += this.field3524;
         var6 = this.method6166();
         var8 = this.field3536.method7281(var1 - (Integer)var6.field4886, var2 - (Integer)var6.field4887);
      }

      if (var3 && var4) {
         this.field3546 = 1;
         var6 = this.method6157(var8);
         class461 var7 = this.method6157(this.field3539);
         this.method6156(var7, var6);
      } else if (var3) {
         this.field3546 = 1;
         var6 = this.method6157(var8);
         this.method6111((Integer)var6.field4886, (Integer)var6.field4887);
         this.field3539 = (Integer)var6.field4886;
      } else if (var4) {
         this.method6111(this.field3539, var8);
      } else {
         if (this.field3540 > 0 && var8 == this.field3539) {
            if (this.field3538 == this.field3537) {
               this.field3546 = 1;
               var6 = this.method6157(var8);
               this.method6111((Integer)var6.field4886, (Integer)var6.field4887);
            } else {
               this.field3546 = 2;
               var6 = this.method6158(var8);
               this.method6111((Integer)var6.field4886, (Integer)var6.field4887);
            }
         } else {
            this.field3546 = 0;
            this.method6111(var8, var8);
            this.field3539 = var8;
         }

         this.field3540 = 25;
      }

   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "915076242"
   )
   public void method6115(int var1, int var2) {
      if (this.field3533 && this.method6138()) {
         var1 += this.field3545;
         var2 += this.field3524;
         class461 var3 = this.method6166();
         int var4 = this.field3536.method7281(var1 - (Integer)var3.field4886, var2 - (Integer)var3.field4887);
         class461 var5;
         class461 var6;
         switch (this.field3546) {
            case 0:
               this.method6111(this.field3538, var4);
               break;
            case 1:
               var5 = this.method6157(this.field3539);
               var6 = this.method6157(var4);
               this.method6156(var5, var6);
               break;
            case 2:
               var5 = this.method6158(this.field3539);
               var6 = this.method6158(var4);
               this.method6156(var5, var6);
         }
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "36"
   )
   public void method6128(Clipboard var1) {
      class383 var2 = this.field3536.method7341(this.field3538, this.field3537);
      if (!var2.method7513()) {
         String var3 = var2.method7522();
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
         }
      }

   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "107"
   )
   public void method6273(Clipboard var1) {
      if (this.method6154()) {
         this.method6128(var1);
         this.method6109();
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "-1794913499"
   )
   public void method6130(Clipboard var1) {
      Transferable var2 = var1.getContents((Object)null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = this.method6155((String)var2.getTransferData(DataFlavor.stringFlavor));
            this.method6109();
            class380 var4 = this.field3536.method7275(var3, this.field3537, this.field3541);
            this.method6111(var4.method7396(), var4.method7396());
            this.method6159();
            this.method6164();
         } catch (Exception var5) {
         }
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "113728735"
   )
   public void method6274() {
      this.field3524 = Math.max(0, this.field3524 - this.field3536.method7386());
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "113"
   )
   public void method6278() {
      int var1 = Math.max(0, this.field3536.method7284() - this.field3544);
      this.field3524 = Math.min(var1, this.field3524 + this.field3536.method7386());
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Llx;I)V",
      garbageValue = "-1866870049"
   )
   public void method6132(class308 var1) {
      this.field3547 = var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Llx;I)V",
      garbageValue = "-1257923429"
   )
   public void method6258(class308 var1) {
      this.field3548 = var1;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(I)Loq;",
      garbageValue = "-1580027563"
   )
   public class379 method6135() {
      return this.field3536;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(B)Loq;",
      garbageValue = "-94"
   )
   public class379 method6136() {
      return this.field3535;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(I)Loa;",
      garbageValue = "2061234095"
   )
   public class383 method6137() {
      return this.field3536.method7341(this.field3538, this.field3537);
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1877239255"
   )
   public boolean method6138() {
      return this.field3530;
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1994580892"
   )
   public boolean method6139() {
      return this.field3531;
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-30"
   )
   public boolean method6140() {
      return this.method6138() && this.field3532 % 60 < 30;
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-483082370"
   )
   public int method6141() {
      return this.field3537;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1050882526"
   )
   public int method6142() {
      return this.field3538;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "32293634"
   )
   public boolean method6143() {
      return this.field3533;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-57692379"
   )
   public int method6200() {
      return this.field3545;
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-91399205"
   )
   public int method6299() {
      return this.field3524;
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1594572507"
   )
   public int method6146() {
      return this.field3536.method7379();
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2023379849"
   )
   public int method6329() {
      return this.field3536.method7289();
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1424429838"
   )
   public int method6099() {
      return this.field3542;
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-111"
   )
   public int method6149() {
      return this.field3534;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1783004580"
   )
   public int method6148() {
      return this.field3536.method7334();
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2117890366"
   )
   public int method6151() {
      return this.field3528;
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-72"
   )
   public int method6152() {
      return this.field3536.method7291();
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1129098287"
   )
   public boolean method6153() {
      return this.method6329() > 1;
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-306594009"
   )
   boolean method6154() {
      return this.field3538 != this.field3537;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "83"
   )
   String method6155(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (this.method6163(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(Lrg;Lrg;I)V",
      garbageValue = "1153538536"
   )
   void method6156(class461 var1, class461 var2) {
      if ((Integer)var2.field4886 < (Integer)var1.field4886) {
         this.method6111((Integer)var1.field4887, (Integer)var2.field4886);
      } else {
         this.method6111((Integer)var1.field4886, (Integer)var2.field4887);
      }

   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(IB)Lrg;",
      garbageValue = "-128"
   )
   class461 method6157(int var1) {
      int var2 = this.field3536.method7264();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.method6328(this.field3536.method7260(var5 - 1).field4428)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.method6328(this.field3536.method7260(var5).field4428)) {
            var4 = var5;
            break;
         }
      }

      return new class461(var3, var4);
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(II)Lrg;",
      garbageValue = "-600467207"
   )
   class461 method6158(int var1) {
      int var2 = this.field3536.method7264();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.field3536.method7260(var5 - 1).field4428 == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.field3536.method7260(var5).field4428 == '\n') {
            var4 = var5;
            break;
         }
      }

      return new class461(var3, var4);
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "27"
   )
   boolean method6159() {
      if (!this.method6143()) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field3536.method7264() > this.field3542) {
            this.field3536.method7280(this.field3542, this.field3536.method7264());
            var1 = true;
         }

         int var2 = this.method6329();
         int var3;
         if (this.field3536.method7286() > var2) {
            var3 = this.field3536.method7282(0, var2) - 1;
            this.field3536.method7280(var3, this.field3536.method7264());
            var1 = true;
         }

         if (var1) {
            var3 = this.field3537;
            int var4 = this.field3538;
            int var5 = this.field3536.method7264();
            if (this.field3537 > var5) {
               var3 = var5;
            }

            if (this.field3538 > var5) {
               var4 = var5;
            }

            this.method6111(var4, var3);
         }

         return var1;
      }
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "53"
   )
   void method6160(int var1, boolean var2) {
      if (var2) {
         this.method6111(this.field3538, var1);
      } else {
         this.method6111(var1, var1);
      }

   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2810550"
   )
   int method6161() {
      return this.field3544 / this.field3536.method7386();
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "46"
   )
   void method6162() {
      class383 var1 = this.field3536.method7341(0, this.field3537);
      class461 var2 = var1.method7512();
      int var3 = this.field3536.method7386();
      int var4 = (Integer)var2.field4886 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field4887 - 3;
      int var7 = var3 + var6 + 6;
      int var8 = this.field3545;
      int var9 = var8 + this.field3523;
      int var10 = this.field3524;
      int var11 = var10 + this.field3544;
      int var12 = this.field3545;
      int var13 = this.field3524;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field3523;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field3544;
      }

      this.method6096(var12, var13);
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1230751066"
   )
   boolean method6328(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1220338251"
   )
   void method6164() {
      if (this.field3547 != null) {
         this.field3547.vmethod6027();
      }

   }

   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "11"
   )
   boolean method6163(int var1) {
      switch (this.field3528) {
         case 1:
            return MenuAction.isAlphaNumeric((char)var1);
         case 2:
            return class134.isCharAlphabetic((char)var1);
         case 3:
            return class149.isDigit((char)var1);
         case 4:
            char var2 = (char)var1;
            if (class149.isDigit(var2)) {
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

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "(I)Lrg;",
      garbageValue = "351336662"
   )
   class461 method6166() {
      int var1 = this.field3536.method7381(this.field3523);
      int var2 = this.field3536.method7383(this.field3544);
      return new class461(var1, var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Lnx;IB)Llg;",
      garbageValue = "53"
   )
   public static PacketBufferNode method6225(int var0, String var1, Language var2, int var3) {
      PacketBufferNode var4 = class330.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByte(0);
      int var5 = var4.packetBuffer.offset;
      var4.packetBuffer.writeByte(var0);
      String var6 = var1.toLowerCase();
      byte var7 = 0;
      if (var6.startsWith("yellow:")) {
         var7 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var6.startsWith("red:")) {
         var7 = 1;
         var1 = var1.substring("red:".length());
      } else if (var6.startsWith("green:")) {
         var7 = 2;
         var1 = var1.substring("green:".length());
      } else if (var6.startsWith("cyan:")) {
         var7 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var6.startsWith("purple:")) {
         var7 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var6.startsWith("white:")) {
         var7 = 5;
         var1 = var1.substring("white:".length());
      } else if (var6.startsWith("flash1:")) {
         var7 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var6.startsWith("flash2:")) {
         var7 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var6.startsWith("flash3:")) {
         var7 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var6.startsWith("glow1:")) {
         var7 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var6.startsWith("glow2:")) {
         var7 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var6.startsWith("glow3:")) {
         var7 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("yellow:")) {
            var7 = 0;
            var1 = var1.substring("yellow:".length());
         } else if (var6.startsWith("red:")) {
            var7 = 1;
            var1 = var1.substring("red:".length());
         } else if (var6.startsWith("green:")) {
            var7 = 2;
            var1 = var1.substring("green:".length());
         } else if (var6.startsWith("cyan:")) {
            var7 = 3;
            var1 = var1.substring("cyan:".length());
         } else if (var6.startsWith("purple:")) {
            var7 = 4;
            var1 = var1.substring("purple:".length());
         } else if (var6.startsWith("white:")) {
            var7 = 5;
            var1 = var1.substring("white:".length());
         } else if (var6.startsWith("flash1:")) {
            var7 = 6;
            var1 = var1.substring("flash1:".length());
         } else if (var6.startsWith("flash2:")) {
            var7 = 7;
            var1 = var1.substring("flash2:".length());
         } else if (var6.startsWith("flash3:")) {
            var7 = 8;
            var1 = var1.substring("flash3:".length());
         } else if (var6.startsWith("glow1:")) {
            var7 = 9;
            var1 = var1.substring("glow1:".length());
         } else if (var6.startsWith("glow2:")) {
            var7 = 10;
            var1 = var1.substring("glow2:".length());
         } else if (var6.startsWith("glow3:")) {
            var7 = 11;
            var1 = var1.substring("glow3:".length());
         }
      }

      var6 = var1.toLowerCase();
      byte var8 = 0;
      if (var6.startsWith("wave:")) {
         var8 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var6.startsWith("wave2:")) {
         var8 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var6.startsWith("shake:")) {
         var8 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var6.startsWith("scroll:")) {
         var8 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var6.startsWith("slide:")) {
         var8 = 5;
         var1 = var1.substring("slide:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("wave:")) {
            var8 = 1;
            var1 = var1.substring("wave:".length());
         } else if (var6.startsWith("wave2:")) {
            var8 = 2;
            var1 = var1.substring("wave2:".length());
         } else if (var6.startsWith("shake:")) {
            var8 = 3;
            var1 = var1.substring("shake:".length());
         } else if (var6.startsWith("scroll:")) {
            var8 = 4;
            var1 = var1.substring("scroll:".length());
         } else if (var6.startsWith("slide:")) {
            var8 = 5;
            var1 = var1.substring("slide:".length());
         }
      }

      var4.packetBuffer.writeByte(var7);
      var4.packetBuffer.writeByte(var8);
      WorldMapArea.method5162(var4.packetBuffer, var1);
      if (var0 == class324.field3743.rsOrdinal()) {
         var4.packetBuffer.writeByte(var3);
      }

      var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
      return var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "114146742"
   )
   public static void method6147(boolean var0) {
      if (var0 && Rasterizer2D.field5062 != null) {
         Rasterizer3D.field2519 = Rasterizer3D.field2512;
      } else {
         Rasterizer3D.field2519 = Rasterizer3D.field2518;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Ljava/lang/String;Ljava/lang/String;I)[Ltc;",
      garbageValue = "1567788624"
   )
   public static IndexedSprite[] method6353(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2)) {
         return null;
      } else {
         int var3 = var0.getGroupId(var1);
         int var4 = var0.getFileId(var3, var2);
         return class68.method2030(var0, var3, var4);
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ILmq;IIIII[FB)Lmq;",
      garbageValue = "34"
   )
   static Widget method6354(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0;
      var8.parentId = var1.id;
      var8.childIndex = var2;
      var8.isIf3 = true;
      var8.xAlignment = var3;
      var8.yAlignment = var4;
      var8.widthAlignment = var5;
      var8.heightAlignment = var6;
      var8.rawX = (int)((float)var1.width * var7[0]);
      var8.rawY = (int)((float)var1.height * var7[1]);
      var8.rawWidth = (int)((float)var1.width * var7[2]);
      var8.rawHeight = (int)(var7[3] * (float)var1.height);
      return var8;
   }
}
