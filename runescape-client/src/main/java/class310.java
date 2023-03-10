import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class310 {
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Low;"
   )
   class375 field3495 = new class375();
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Low;"
   )
   class375 field3482 = new class375();
   @ObfuscatedName("at")
   boolean field3475 = false;
   @ObfuscatedName("af")
   boolean field3484 = true;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -592725527
   )
   int field3485 = 0;
   @ObfuscatedName("aw")
   boolean field3486 = false;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -955072115
   )
   int field3487 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1425946631
   )
   int field3488 = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1808030777
   )
   int field3489 = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1631564881
   )
   int field3490 = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1850335611
   )
   int field3479 = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1413071145
   )
   int field3493 = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -539300659
   )
   int field3477 = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1677266913
   )
   int field3494 = Integer.MAX_VALUE;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 2049887613
   )
   int field3500 = Integer.MAX_VALUE;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -891093219
   )
   int field3496 = 0;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1054608939
   )
   int field3483 = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1911457455
   )
   int field3498 = 0;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 2009047315
   )
   int field3499 = 0;
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   class304 field3497;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lll;"
   )
   class304 field3501;

   class310() {
      this.field3495.method7127(1);
      this.field3482.method7127(1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1714802262"
   )
   void method5816() {
      this.field3485 = (this.field3485 + 1) % 60;
      if (this.field3477 > 0) {
         --this.field3477;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "2"
   )
   public boolean method5891(boolean var1) {
      var1 = var1 && this.field3484;
      boolean var2 = this.field3475 != var1;
      this.field3475 = var1;
      if (!this.field3475) {
         this.method5841(this.field3490, this.field3490);
      }

      return var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1686031987"
   )
   public void method5839(boolean var1) {
      this.field3484 = var1;
      this.field3475 = var1 && this.field3475;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-417183925"
   )
   boolean method5966(String var1) {
      String var2 = this.field3495.method6999();
      if (!var2.equals(var1)) {
         var1 = this.method5844(var1);
         this.field3495.method7011(var1);
         this.method5826(this.field3498, this.field3499);
         this.method5889();
         this.method5894();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "16"
   )
   boolean method5820(String var1) {
      this.field3482.method7011(var1);
      return true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lou;I)Z",
      garbageValue = "-473812710"
   )
   boolean method6005(AbstractFont var1) {
      boolean var2 = !this.field3486;
      this.field3495.method7003(var1);
      this.field3482.method7003(var1);
      this.field3486 = true;
      var2 |= this.method5826(this.field3498, this.field3499);
      var2 |= this.method5841(this.field3479, this.field3490);
      if (this.method5889()) {
         this.method5894();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1542973086"
   )
   public boolean method5822(int var1, int var2) {
      boolean var3 = this.field3496 != var1 || var2 != this.field3483;
      this.field3496 = var1;
      this.field3483 = var2;
      var3 |= this.method5826(this.field3498, this.field3499);
      return var3;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-41"
   )
   public boolean method5815(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field3495.method7022();
      this.field3495.method7000(var1);
      this.field3482.method7000(var1);
      if (this.method5889()) {
         this.method5894();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "981334972"
   )
   public boolean method5824(int var1) {
      this.field3495.method7001(var1);
      if (this.method5889()) {
         this.method5894();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "120"
   )
   public boolean method5825(int var1) {
      this.field3500 = var1;
      if (this.method5889()) {
         this.method5894();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "573264435"
   )
   public boolean method5826(int var1, int var2) {
      if (!this.method5873()) {
         this.field3498 = var1;
         this.field3499 = var2;
         return false;
      } else {
         int var3 = this.field3498;
         int var4 = this.field3499;
         int var5 = Math.max(0, this.field3495.method7017() - this.field3496 + 2);
         int var6 = Math.max(0, this.field3495.method7018() - this.field3483 + 1);
         this.field3498 = Math.max(0, Math.min(var5, var1));
         this.field3499 = Math.max(0, Math.min(var6, var2));
         return var3 != this.field3498 || var4 != this.field3499;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-297314157"
   )
   public boolean method5935(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         System.out.println("InputField.setAlignment: Invalid horizontal alignment. Given value: '" + var1 + "'.");
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         System.out.println("InputField.setAlignment: Invalid vertical alignment. Given value: '" + var2 + "'.");
         var3 = false;
      }

      return var3 ? this.field3495.method7005(var1, var2) : false;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2050381023"
   )
   public void method5828(int var1) {
      this.field3495.method7006(var1);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "5000"
   )
   public void method5862(int var1) {
      this.field3487 = var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "91"
   )
   public void method5903(int var1) {
      this.field3495.method7127(var1);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   public void method5831(int var1) {
      this.field3495.method7002(var1);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "235641685"
   )
   public boolean method5918(int var1) {
      this.field3489 = var1;
      String var2 = this.field3495.method6999();
      int var3 = var2.length();
      var2 = this.method5844(var2);
      if (var2.length() != var3) {
         this.field3495.method7011(var2);
         this.method5826(this.field3498, this.field3499);
         this.method5889();
         this.method5894();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2120482340"
   )
   public void method5833() {
      this.field3486 = false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1552754857"
   )
   public boolean method5834(int var1) {
      if (this.method5817(var1)) {
         this.method6063();
         class376 var2 = this.field3495.method7070((char)var1, this.field3490, this.field3494);
         this.method5841(var2.method7137(), var2.method7137());
         this.method5889();
         this.method5894();
      }

      return true;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1620308356"
   )
   public void method5835() {
      if (!this.method6063() && this.field3490 > 0) {
         int var1 = this.field3495.method7013(this.field3490 - 1);
         this.method5894();
         this.method5841(var1, var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1088264884"
   )
   public void method5836() {
      if (!this.method6063() && this.field3490 < this.field3495.method6998()) {
         int var1 = this.field3495.method7013(this.field3490);
         this.method5894();
         this.method5841(var1, var1);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-672060695"
   )
   public void method5837() {
      if (!this.method6063() && this.field3490 > 0) {
         class451 var1 = this.method5887(this.field3490 - 1);
         int var2 = this.field3495.method7031((Integer)var1.field4798, this.field3490);
         this.method5894();
         this.method5841(var2, var2);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "158006576"
   )
   public void method5869() {
      if (!this.method6063() && this.field3490 < this.field3495.method6998()) {
         class451 var1 = this.method5887(this.field3490);
         int var2 = this.field3495.method7031(this.field3490, (Integer)var1.field4799);
         this.method5894();
         this.method5841(var2, var2);
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "60"
   )
   boolean method6063() {
      if (!this.method5884()) {
         return false;
      } else {
         int var1 = this.field3495.method7031(this.field3479, this.field3490);
         this.method5894();
         this.method5841(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "105"
   )
   public void method5840() {
      this.method5841(0, this.field3495.method6998());
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-976822634"
   )
   public boolean method5841(int var1, int var2) {
      if (!this.method5873()) {
         this.field3479 = var1;
         this.field3490 = var2;
         return false;
      } else {
         if (var1 > this.field3495.method6998()) {
            var1 = this.field3495.method6998();
         }

         if (var2 > this.field3495.method6998()) {
            var2 = this.field3495.method6998();
         }

         boolean var3 = this.field3479 != var1 || var2 != this.field3490;
         this.field3479 = var1;
         if (var2 != this.field3490) {
            this.field3490 = var2;
            this.field3485 = 0;
            this.method6002();
         }

         if (var3 && this.field3501 != null) {
            this.field3501.vmethod5776();
         }

         return var3;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "4"
   )
   public void method5978(boolean var1) {
      class451 var2 = this.method5888(this.field3490);
      this.method5890((Integer)var2.field4798, var1);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "1"
   )
   public void method6047(boolean var1) {
      class451 var2 = this.method5888(this.field3490);
      this.method5890((Integer)var2.field4799, var1);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1194970788"
   )
   public void method5897(boolean var1) {
      this.method5890(0, var1);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "32"
   )
   public void method5845(boolean var1) {
      this.method5890(this.field3495.method6998(), var1);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1911929784"
   )
   public void method5846(boolean var1) {
      if (this.method5884() && !var1) {
         this.method5890(Math.min(this.field3479, this.field3490), var1);
      } else if (this.field3490 > 0) {
         this.method5890(this.field3490 - 1, var1);
      }

   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1578037568"
   )
   public void method5847(boolean var1) {
      if (this.method5884() && !var1) {
         this.method5890(Math.max(this.field3479, this.field3490), var1);
      } else if (this.field3490 < this.field3495.method6998()) {
         this.method5890(this.field3490 + 1, var1);
      }

   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1446997327"
   )
   public void method5848(boolean var1) {
      if (this.field3490 > 0) {
         class451 var2 = this.method5887(this.field3490 - 1);
         this.method5890((Integer)var2.field4798, var1);
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1939904884"
   )
   public void method5948(boolean var1) {
      if (this.field3490 < this.field3495.method6998()) {
         class451 var2 = this.method5887(this.field3490 + 1);
         this.method5890((Integer)var2.field4799, var1);
      }

   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2005118133"
   )
   public void method5823(boolean var1) {
      if (this.field3490 > 0) {
         this.method5890(this.field3495.method7016(this.field3490, -1), var1);
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1910910611"
   )
   public void method5954(boolean var1) {
      if (this.field3490 < this.field3495.method6998()) {
         this.method5890(this.field3495.method7016(this.field3490, 1), var1);
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2137080090"
   )
   public void method5877(boolean var1) {
      if (this.field3490 > 0) {
         int var2 = this.method6082();
         this.method5890(this.field3495.method7016(this.field3490, -var2), var1);
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1881074040"
   )
   public void method5914(boolean var1) {
      if (this.field3490 < this.field3495.method6998()) {
         int var2 = this.method6082();
         this.method5890(this.field3495.method7016(this.field3490, var2), var1);
      }

   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2036072619"
   )
   public void method6012(boolean var1) {
      class379 var2 = this.field3495.method7007(0, this.field3490);
      class451 var3 = var2.method7268();
      this.method5890(this.field3495.method7015((Integer)var3.field4798, this.field3499), var1);
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1382425470"
   )
   public void method5855(boolean var1) {
      class379 var2 = this.field3495.method7007(0, this.field3490);
      class451 var3 = var2.method7268();
      this.method5890(this.field3495.method7015((Integer)var3.field4798, this.field3499 + this.field3483), var1);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "1883477450"
   )
   public void method5856(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      class451 var6;
      int var8;
      if (!this.field3486) {
         var8 = 0;
      } else {
         var1 += this.field3498;
         var2 += this.field3499;
         var6 = this.method5896();
         var8 = this.field3495.method7015(var1 - (Integer)var6.field4798, var2 - (Integer)var6.field4799);
      }

      if (var3 && var4) {
         this.field3488 = 1;
         var6 = this.method5887(var8);
         class451 var7 = this.method5887(this.field3493);
         this.method5949(var7, var6);
      } else if (var3) {
         this.field3488 = 1;
         var6 = this.method5887(var8);
         this.method5841((Integer)var6.field4798, (Integer)var6.field4799);
         this.field3493 = (Integer)var6.field4798;
      } else if (var4) {
         this.method5841(this.field3493, var8);
      } else {
         if (this.field3477 > 0 && var8 == this.field3493) {
            if (this.field3490 == this.field3479) {
               this.field3488 = 1;
               var6 = this.method5887(var8);
               this.method5841((Integer)var6.field4798, (Integer)var6.field4799);
            } else {
               this.field3488 = 2;
               var6 = this.method5888(var8);
               this.method5841((Integer)var6.field4798, (Integer)var6.field4799);
            }
         } else {
            this.field3488 = 0;
            this.method5841(var8, var8);
            this.field3493 = var8;
         }

         this.field3477 = 25;
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "1"
   )
   public void method5857(int var1, int var2) {
      if (this.field3486 && this.method5955()) {
         var1 += this.field3498;
         var2 += this.field3499;
         class451 var3 = this.method5896();
         int var4 = this.field3495.method7015(var1 - (Integer)var3.field4798, var2 - (Integer)var3.field4799);
         class451 var5;
         class451 var6;
         switch (this.field3488) {
            case 0:
               this.method5841(this.field3479, var4);
               break;
            case 1:
               var5 = this.method5887(this.field3493);
               var6 = this.method5887(var4);
               this.method5949(var5, var6);
               break;
            case 2:
               var5 = this.method5888(this.field3493);
               var6 = this.method5888(var4);
               this.method5949(var5, var6);
         }
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "-56"
   )
   public void method5858(Clipboard var1) {
      class379 var2 = this.field3495.method7007(this.field3479, this.field3490);
      if (!var2.method7246()) {
         String var3 = var2.method7244();
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
         }
      }

   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "-82"
   )
   public void method6056(Clipboard var1) {
      if (this.method5884()) {
         this.method5858(var1);
         this.method6063();
      }

   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "63"
   )
   public void method5860(Clipboard var1) {
      Transferable var2 = var1.getContents((Object)null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = this.method5844((String)var2.getTransferData(DataFlavor.stringFlavor));
            this.method6063();
            class376 var4 = this.field3495.method7023(var3, this.field3490, this.field3494);
            this.method5841(var4.method7137(), var4.method7137());
            this.method5889();
            this.method5894();
         } catch (Exception var5) {
            System.out.println("Error pasting clipboard to InputField.");
         }
      }

   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "26"
   )
   public void method5861() {
      this.field3499 = Math.max(0, this.field3499 - this.field3495.method7019());
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1569086073"
   )
   public void method5859() {
      int var1 = Math.max(0, this.field3495.method7018() - this.field3483);
      this.field3499 = Math.min(var1, this.field3499 + this.field3495.method7019());
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Lll;B)V",
      garbageValue = "-73"
   )
   public void method5851(class304 var1) {
      this.field3497 = var1;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Lll;B)V",
      garbageValue = "-5"
   )
   public void method5864(class304 var1) {
      this.field3501 = var1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(I)Low;",
      garbageValue = "1262168662"
   )
   public class375 method5865() {
      return this.field3495;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(I)Low;",
      garbageValue = "2112515776"
   )
   public class375 method5866() {
      return this.field3482;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)Lon;",
      garbageValue = "1325696613"
   )
   public class379 method5867() {
      return this.field3495.method7007(this.field3479, this.field3490);
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-549820891"
   )
   public boolean method5955() {
      return this.field3475;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "3"
   )
   public boolean method5933() {
      return this.field3484;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-71"
   )
   public boolean method5870() {
      return this.method5955() && this.field3485 % 60 < 30;
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1567314781"
   )
   public int method5871() {
      return this.field3490;
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "752181260"
   )
   public int method6029() {
      return this.field3479;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-435556851"
   )
   public boolean method5873() {
      return this.field3486;
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "875824176"
   )
   public int method5874() {
      return this.field3498;
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "151655806"
   )
   public int method5958() {
      return this.field3499;
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1709224599"
   )
   public int method5876() {
      return this.field3495.method7022();
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-50256780"
   )
   public int method5818() {
      return this.field3495.method7057();
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-250886570"
   )
   public int method5880() {
      return this.field3500;
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "16"
   )
   public int method5879() {
      return this.field3487;
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1805162168"
   )
   public int method5913() {
      return this.field3495.method7024();
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "29919"
   )
   public int method5881() {
      return this.field3489;
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1565778570"
   )
   public int method5943() {
      return this.field3495.method7106();
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2045196166"
   )
   public boolean method5893() {
      return this.method5818() > 1;
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2138172639"
   )
   boolean method5884() {
      return this.field3479 != this.field3490;
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1725028844"
   )
   String method5844(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (this.method5817(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(Lrv;Lrv;I)V",
      garbageValue = "-418592345"
   )
   void method5949(class451 var1, class451 var2) {
      if ((Integer)var2.field4798 < (Integer)var1.field4798) {
         this.method5841((Integer)var1.field4799, (Integer)var2.field4798);
      } else {
         this.method5841((Integer)var1.field4798, (Integer)var2.field4799);
      }

   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(IB)Lrv;",
      garbageValue = "-68"
   )
   class451 method5887(int var1) {
      int var2 = this.field3495.method6998();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.method5992(this.field3495.method7118(var5 - 1).field4380)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.method5992(this.field3495.method7118(var5).field4380)) {
            var4 = var5;
            break;
         }
      }

      return new class451(var3, var4);
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lrv;",
      garbageValue = "61"
   )
   class451 method5888(int var1) {
      int var2 = this.field3495.method6998();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.field3495.method7118(var5 - 1).field4380 == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.field3495.method7118(var5).field4380 == '\n') {
            var4 = var5;
            break;
         }
      }

      return new class451(var3, var4);
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   boolean method5889() {
      if (!this.method5873()) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field3495.method6998() > this.field3500) {
            this.field3495.method7031(this.field3500, this.field3495.method6998());
            var1 = true;
         }

         int var2 = this.method5818();
         int var3;
         if (this.field3495.method7020() > var2) {
            var3 = this.field3495.method7016(0, var2) - 1;
            this.field3495.method7031(var3, this.field3495.method6998());
            var1 = true;
         }

         if (var1) {
            var3 = this.field3490;
            int var4 = this.field3479;
            int var5 = this.field3495.method6998();
            if (this.field3490 > var5) {
               var3 = var5;
            }

            if (this.field3479 > var5) {
               var4 = var5;
            }

            this.method5841(var4, var3);
         }

         return var1;
      }
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-838795897"
   )
   void method5890(int var1, boolean var2) {
      if (var2) {
         this.method5841(this.field3479, var1);
      } else {
         this.method5841(var1, var1);
      }

   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "3157"
   )
   int method6082() {
      return this.field3483 / this.field3495.method7019();
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2005598872"
   )
   void method6002() {
      class379 var1 = this.field3495.method7007(0, this.field3490);
      class451 var2 = var1.method7268();
      int var3 = this.field3495.method7019();
      int var4 = (Integer)var2.field4798 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field4799 - 3;
      int var7 = var6 + var3 + 6;
      int var8 = this.field3498;
      int var9 = var8 + this.field3496;
      int var10 = this.field3499;
      int var11 = var10 + this.field3483;
      int var12 = this.field3498;
      int var13 = this.field3499;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field3496;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field3483;
      }

      this.method5826(var12, var13);
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "85"
   )
   boolean method5992(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "14181552"
   )
   void method5894() {
      if (this.field3497 != null) {
         this.field3497.vmethod5776();
      }

   }

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "15719519"
   )
   boolean method5817(int var1) {
      switch (this.field3489) {
         case 1:
            return PlayerComposition.isAlphaNumeric((char)var1);
         case 2:
            return ArchiveDiskAction.isCharAlphabetic((char)var1);
         case 3:
            return class28.isDigit((char)var1);
         case 4:
            char var2 = (char)var1;
            if (class28.isDigit(var2)) {
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
      descriptor = "(B)Lrv;",
      garbageValue = "9"
   )
   class451 method5896() {
      int var1 = this.field3495.method7069(this.field3496);
      int var2 = this.field3495.method7033(this.field3483);
      return new class451(var1, var2);
   }
}
