import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class300 {
   @ObfuscatedName("rw")
   @ObfuscatedSignature(
      descriptor = "Lrw;"
   )
   @Export("privateChatMode")
   static PrivateChatMode privateChatMode;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   class365 field3439 = new class365();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lnz;"
   )
   class365 field3453 = new class365();
   @ObfuscatedName("m")
   boolean field3441 = false;
   @ObfuscatedName("q")
   boolean field3442 = true;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1828326439
   )
   int field3443 = 0;
   @ObfuscatedName("e")
   boolean field3433 = false;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -424355885
   )
   int field3444 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 475458307
   )
   int field3451 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2024752615
   )
   int field3447 = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -993954281
   )
   int field3448 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 701971453
   )
   int field3449 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 610132973
   )
   int field3450 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -686280337
   )
   int field3456 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1229581707
   )
   int field3452 = Integer.MAX_VALUE;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 282824603
   )
   int field3432 = Integer.MAX_VALUE;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 2118935603
   )
   int field3446 = Integer.MAX_VALUE;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -944132263
   )
   int field3455 = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -95228669
   )
   int field3445 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1195447645
   )
   int field3457 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1011849235
   )
   int field3458 = 0;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   class294 field3459;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   class294 field3460;

   class300() {
      this.field3439.method6905(1);
      this.field3453.method6905(1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "383325496"
   )
   void method5945() {
      this.field3443 = (this.field3443 + 1) % 60;
      if (this.field3456 > 0) {
         --this.field3456;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "115"
   )
   public boolean method5767(boolean var1) {
      var1 = var1 && this.field3442;
      boolean var2 = this.field3441 != var1;
      this.field3441 = var1;
      if (!this.field3441) {
         this.method5791(this.field3448, this.field3448);
      }

      return var2;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "482660072"
   )
   public void method5843(boolean var1) {
      this.field3442 = var1;
      this.field3441 = var1 && this.field3441;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-1493841080"
   )
   boolean method5769(String var1) {
      String var2 = this.field3439.method6880();
      if (!var2.equals(var1)) {
         var1 = this.method5877(var1);
         this.field3439.method6895(var1);
         this.method5946(this.field3457, this.field3458);
         this.method5839();
         this.method5844();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "1915740339"
   )
   boolean method5790(String var1) {
      this.field3453.method6895(var1);
      return true;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lnt;I)Z",
      garbageValue = "-1861202727"
   )
   boolean method5771(AbstractFont var1) {
      boolean var2 = !this.field3433;
      this.field3439.method6888(var1);
      this.field3453.method6888(var1);
      this.field3433 = true;
      var2 |= this.method5946(this.field3457, this.field3458);
      var2 |= this.method5791(this.field3449, this.field3448);
      if (this.method5839()) {
         this.method5844();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IIS)Z",
      garbageValue = "18021"
   )
   public boolean method5772(int var1, int var2) {
      boolean var3 = this.field3455 != var1 || var2 != this.field3445;
      this.field3455 = var1;
      this.field3445 = var2;
      var3 |= this.method5946(this.field3457, this.field3458);
      return var3;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2055398543"
   )
   public boolean method5773(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field3439.method6906();
      this.field3439.method6886(var1, true);
      this.field3453.method6886(var1, true);
      if (this.method5839()) {
         this.method5844();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "37"
   )
   public boolean method5774(int var1) {
      if (var1 < 0) {
         this.field3452 = Integer.MAX_VALUE;
      } else {
         this.field3452 = var1;
      }

      if (this.method5839()) {
         this.method5844();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "397477575"
   )
   public boolean method5775(int var1) {
      this.field3446 = var1;
      if (this.method5839()) {
         this.method5844();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "50"
   )
   public boolean method5946(int var1, int var2) {
      if (!this.method5906()) {
         this.field3457 = var1;
         this.field3458 = var2;
         return false;
      } else {
         int var3 = this.field3457;
         int var4 = this.field3458;
         int var5 = Math.max(0, this.field3439.method6901() - this.field3455 + 2);
         int var6 = Math.max(0, this.field3439.method6969() - this.field3445 + 1);
         this.field3457 = Math.max(0, Math.min(var5, var1));
         this.field3458 = Math.max(0, Math.min(var6, var2));
         return var3 != this.field3457 || var4 != this.field3458;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "2031540867"
   )
   public boolean method5777(int var1, int var2) {
      return true;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1121255176"
   )
   public void method5778(int var1) {
      this.field3439.method6890(var1);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "56"
   )
   public void method5779(int var1) {
      this.field3444 = var1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "273310275"
   )
   public void method5780(int var1) {
      this.field3439.method6905(var1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1640345033"
   )
   public void method5781(int var1) {
      this.field3439.method6887(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-327130862"
   )
   public boolean method5936(int var1) {
      this.field3447 = var1;
      String var2 = this.field3439.method6880();
      int var3 = var2.length();
      var2 = this.method5877(var2);
      if (var2.length() != var3) {
         this.field3439.method6895(var2);
         this.method5946(this.field3457, this.field3458);
         this.method5839();
         this.method5844();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-558918319"
   )
   public void method5783() {
      this.field3433 = false;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1127335642"
   )
   public boolean method5784(int var1) {
      if (this.method5845(var1)) {
         this.method5789();
         class366 var2 = this.field3439.method6885((char)var1, this.field3448, this.field3432, this.field3452);
         this.method5791(var2.method6990(), var2.method6990());
         this.method5839();
         this.method5844();
      }

      return true;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1895876307"
   )
   public void method5823() {
      if (!this.method5789() && this.field3448 > 0) {
         int var1 = this.field3439.method6897(this.field3448 - 1);
         this.method5844();
         this.method5791(var1, var1);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1476990491"
   )
   public void method5872() {
      if (!this.method5789() && this.field3448 < this.field3439.method6943()) {
         int var1 = this.field3439.method6897(this.field3448);
         this.method5844();
         this.method5791(var1, var1);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2105237791"
   )
   public void method5787() {
      if (!this.method5789() && this.field3448 > 0) {
         class437 var1 = this.method5837(this.field3448 - 1);
         int var2 = this.field3439.method6898((Integer)var1.field4764, this.field3448);
         this.method5844();
         this.method5791(var2, var2);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   public void method5953() {
      if (!this.method5789() && this.field3448 < this.field3439.method6943()) {
         class437 var1 = this.method5837(this.field3448);
         int var2 = this.field3439.method6898(this.field3448, (Integer)var1.field4765);
         this.method5844();
         this.method5791(var2, var2);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "391672360"
   )
   boolean method5789() {
      if (!this.method5834()) {
         return false;
      } else {
         int var1 = this.field3439.method6898(this.field3449, this.field3448);
         this.method5844();
         this.method5791(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1350000651"
   )
   public void method5770() {
      this.method5791(0, this.field3439.method6943());
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "602500049"
   )
   public boolean method5791(int var1, int var2) {
      if (!this.method5906()) {
         this.field3449 = var1;
         this.field3448 = var2;
         return false;
      } else {
         if (var1 > this.field3439.method6943()) {
            var1 = this.field3439.method6943();
         }

         if (var2 > this.field3439.method6943()) {
            var2 = this.field3439.method6943();
         }

         boolean var3 = this.field3449 != var1 || var2 != this.field3448;
         this.field3449 = var1;
         if (var2 != this.field3448) {
            this.field3448 = var2;
            this.field3443 = 0;
            this.method5794();
         }

         if (var3 && this.field3460 != null) {
            this.field3460.vmethod5708();
         }

         return var3;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-668853391"
   )
   public void method5792(boolean var1) {
      class437 var2 = this.method5838(this.field3448);
      this.method5904((Integer)var2.field4764, var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "73"
   )
   public void method5853(boolean var1) {
      class437 var2 = this.method5838(this.field3448);
      this.method5904((Integer)var2.field4765, var1);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "29"
   )
   public void method5867(boolean var1) {
      this.method5904(0, var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-107"
   )
   public void method5825(boolean var1) {
      this.method5904(this.field3439.method6943(), var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-292624657"
   )
   public void method6028(boolean var1) {
      if (this.method5834() && !var1) {
         this.method5904(Math.min(this.field3449, this.field3448), var1);
      } else if (this.field3448 > 0) {
         this.method5904(this.field3448 - 1, var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2000790065"
   )
   public void method5786(boolean var1) {
      if (this.method5834() && !var1) {
         this.method5904(Math.max(this.field3449, this.field3448), var1);
      } else if (this.field3448 < this.field3439.method6943()) {
         this.method5904(this.field3448 + 1, var1);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "32"
   )
   public void method5798(boolean var1) {
      if (this.field3448 > 0) {
         class437 var2 = this.method5837(this.field3448 - 1);
         this.method5904((Integer)var2.field4764, var1);
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "32"
   )
   public void method5799(boolean var1) {
      if (this.field3448 < this.field3439.method6943()) {
         class437 var2 = this.method5837(this.field3448 + 1);
         this.method5904((Integer)var2.field4765, var1);
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1676919578"
   )
   public void method5886(boolean var1) {
      if (this.field3448 > 0) {
         this.method5904(this.field3439.method6900(this.field3448, -1), var1);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-15"
   )
   public void method6010(boolean var1) {
      if (this.field3448 < this.field3439.method6943()) {
         this.method5904(this.field3439.method6900(this.field3448, 1), var1);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "90"
   )
   public void method5768(boolean var1) {
      if (this.field3448 > 0) {
         int var2 = this.method5841();
         this.method5904(this.field3439.method6900(this.field3448, -var2), var1);
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "100"
   )
   public void method5803(boolean var1) {
      if (this.field3448 < this.field3439.method6943()) {
         int var2 = this.method5841();
         this.method5904(this.field3439.method6900(this.field3448, var2), var1);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "172420565"
   )
   public void method5937(boolean var1) {
      class369 var2 = this.field3439.method6891(0, this.field3448);
      class437 var3 = var2.method7101();
      this.method5904(this.field3439.method6930((Integer)var3.field4764, this.field3458), var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-2076196179"
   )
   public void method5805(boolean var1) {
      class369 var2 = this.field3439.method6891(0, this.field3448);
      class437 var3 = var2.method7101();
      this.method5904(this.field3439.method6930((Integer)var3.field4764, this.field3445 + this.field3458), var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "-243047032"
   )
   public void method5806(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      int var8;
      if (!this.field3433) {
         var8 = 0;
      } else {
         var1 += this.field3457;
         var2 += this.field3458;
         var8 = this.field3439.method6930(var1, var2);
      }

      class437 var6;
      if (var3 && var4) {
         this.field3451 = 1;
         var6 = this.method5837(var8);
         class437 var7 = this.method5837(this.field3450);
         this.method5836(var7, var6);
      } else if (var3) {
         this.field3451 = 1;
         var6 = this.method5837(var8);
         this.method5791((Integer)var6.field4764, (Integer)var6.field4765);
         this.field3450 = (Integer)var6.field4764;
      } else if (var4) {
         this.method5791(this.field3450, var8);
      } else {
         if (this.field3456 > 0 && var8 == this.field3450) {
            if (this.field3448 == this.field3449) {
               this.field3451 = 1;
               var6 = this.method5837(var8);
               this.method5791((Integer)var6.field4764, (Integer)var6.field4765);
            } else {
               this.field3451 = 2;
               var6 = this.method5838(var8);
               this.method5791((Integer)var6.field4764, (Integer)var6.field4765);
            }
         } else {
            this.field3451 = 0;
            this.method5791(var8, var8);
            this.field3450 = var8;
         }

         this.field3456 = 25;
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "487730188"
   )
   public void method5807(int var1, int var2) {
      if (this.field3433 && this.method5800()) {
         var1 += this.field3457;
         var2 += this.field3458;
         int var3 = this.field3439.method6930(var1, var2);
         class437 var4;
         class437 var5;
         switch (this.field3451) {
            case 0:
               this.method5791(this.field3449, var3);
               break;
            case 1:
               var4 = this.method5837(this.field3450);
               var5 = this.method5837(var3);
               this.method5836(var4, var5);
               break;
            case 2:
               var4 = this.method5838(this.field3450);
               var5 = this.method5838(var3);
               this.method5836(var4, var5);
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "-1568945485"
   )
   public void method5840(Clipboard var1) {
      class369 var2 = this.field3439.method6891(this.field3449, this.field3448);
      if (!var2.method7097()) {
         String var3 = var2.method7116();
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
      garbageValue = "15"
   )
   public void method5809(Clipboard var1) {
      if (this.method5834()) {
         this.method5840(var1);
         this.method5789();
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "-1634663255"
   )
   public void method5854(Clipboard var1) {
      Transferable var2 = var1.getContents((Object)null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = this.method5877((String)var2.getTransferData(DataFlavor.stringFlavor));
            this.method5789();
            class366 var4 = this.field3439.method6935(var3, this.field3448, this.field3432, this.field3452);
            this.method5791(var4.method6990(), var4.method6990());
            this.method5839();
            this.method5844();
         } catch (Exception var5) {
            System.out.println("Error pasting clipboard to InputField.");
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1950882813"
   )
   public void method5917() {
      this.field3458 = Math.max(0, this.field3458 - this.field3439.method6903());
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1850755217"
   )
   public void method5804() {
      int var1 = Math.max(0, this.field3439.method6969() - this.field3445);
      this.field3458 = Math.min(var1, this.field3458 + this.field3439.method6903());
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lko;I)V",
      garbageValue = "-1874509338"
   )
   public void method5813(class294 var1) {
      this.field3459 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lko;I)V",
      garbageValue = "-181076367"
   )
   public void method5814(class294 var1) {
      this.field3460 = var1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)Lnz;",
      garbageValue = "32"
   )
   public class365 method5962() {
      return this.field3439;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)Lnz;",
      garbageValue = "-126"
   )
   public class365 method5816() {
      return this.field3453;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Lnx;",
      garbageValue = "-597710352"
   )
   public class369 method5817() {
      return this.field3439.method6891(this.field3449, this.field3448);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-608221962"
   )
   public boolean method5800() {
      return this.field3441;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1202348163"
   )
   public boolean method5819() {
      return this.field3442;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1073760412"
   )
   public boolean method5820() {
      return this.method5800() && this.field3443 % 60 < 30;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "2"
   )
   public int method5821() {
      return this.field3448;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1609260206"
   )
   public int method5898() {
      return this.field3449;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1918729793"
   )
   public boolean method5906() {
      return this.field3433;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1947511226"
   )
   public int method5824() {
      return this.field3457;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "2678"
   )
   public int method5892() {
      return this.field3458;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-17"
   )
   public int method5826() {
      return this.field3439.method6906();
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "9"
   )
   public int method5827() {
      return this.field3452;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2138124933"
   )
   public int method5828() {
      return this.field3446;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-47"
   )
   public int method5829() {
      return this.field3444;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "987980022"
   )
   public int method6030() {
      return this.field3439.method6893();
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1929938372"
   )
   public int method5954() {
      return this.field3447;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "956147758"
   )
   public int method5832() {
      return this.field3439.method6908();
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2138423281"
   )
   public boolean method5833() {
      return this.field3452 > 1;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1205531866"
   )
   boolean method5834() {
      return this.field3448 != this.field3449;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1980903671"
   )
   String method5877(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (this.method5845(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Lpv;Lpv;I)V",
      garbageValue = "-634283126"
   )
   void method5836(class437 var1, class437 var2) {
      if ((Integer)var2.field4764 < (Integer)var1.field4764) {
         this.method5791((Integer)var1.field4765, (Integer)var2.field4764);
      } else {
         this.method5791((Integer)var1.field4764, (Integer)var2.field4765);
      }

   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II)Lpv;",
      garbageValue = "-1473052836"
   )
   class437 method5837(int var1) {
      int var2 = this.field3439.method6943();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.method5975(this.field3439.method6881(var5 - 1).field4347)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.method5975(this.field3439.method6881(var5).field4347)) {
            var4 = var5;
            break;
         }
      }

      return new class437(var3, var4);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(II)Lpv;",
      garbageValue = "-1838714256"
   )
   class437 method5838(int var1) {
      int var2 = this.field3439.method6943();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.field3439.method6881(var5 - 1).field4347 == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.field3439.method6881(var5).field4347 == '\n') {
            var4 = var5;
            break;
         }
      }

      return new class437(var3, var4);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2108562318"
   )
   boolean method5839() {
      if (!this.method5906()) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field3439.method6943() > this.field3446) {
            this.field3439.method6898(this.field3446, this.field3439.method6943());
            var1 = true;
         }

         int var2;
         if (this.field3439.method6904() > this.field3452) {
            var2 = this.field3439.method6900(0, this.field3452) - 1;
            this.field3439.method6898(var2, this.field3439.method6943());
            var1 = true;
         }

         if (var1) {
            var2 = this.field3448;
            int var3 = this.field3449;
            int var4 = this.field3439.method6943();
            if (this.field3448 > var4) {
               var2 = var4;
            }

            if (this.field3449 > var4) {
               var3 = var4;
            }

            this.method5791(var3, var2);
         }

         return var1;
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-380525563"
   )
   void method5904(int var1, boolean var2) {
      if (var2) {
         this.method5791(this.field3449, var1);
      } else {
         this.method5791(var1, var1);
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-13"
   )
   int method5841() {
      return this.field3445 / this.field3439.method6903();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method5794() {
      class369 var1 = this.field3439.method6891(0, this.field3448);
      class437 var2 = var1.method7101();
      int var3 = this.field3439.method6903();
      int var4 = (Integer)var2.field4764 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field4765 - 3;
      int var7 = var6 + var3 + 6;
      int var8 = this.field3457;
      int var9 = var8 + this.field3455;
      int var10 = this.field3458;
      int var11 = var10 + this.field3445;
      int var12 = this.field3457;
      int var13 = this.field3458;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field3455;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field3445;
      }

      this.method5946(var12, var13);
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "15"
   )
   boolean method5975(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   void method5844() {
      if (this.field3459 != null) {
         this.field3459.vmethod5708();
      }

   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-128"
   )
   boolean method5845(int var1) {
      switch (this.field3447) {
         case 1:
            return ClanSettings.isAlphaNumeric((char)var1);
         case 2:
            return BuddyRankComparator.isCharAlphabetic((char)var1);
         case 3:
            return GrandExchangeOffer.isDigit((char)var1);
         case 4:
            char var2 = (char)var1;
            if (GrandExchangeOffer.isDigit(var2)) {
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
