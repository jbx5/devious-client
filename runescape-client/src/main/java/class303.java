import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class303 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lnu;"
   )
   class368 field3491 = new class368();
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lnu;"
   )
   class368 field3483 = new class368();
   @ObfuscatedName("t")
   boolean field3493 = false;
   @ObfuscatedName("c")
   boolean field3489 = true;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1998851831
   )
   int field3508 = 0;
   @ObfuscatedName("d")
   boolean field3496 = false;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 155329521
   )
   int field3497 = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 397985193
   )
   int field3498 = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1343153257
   )
   int field3499 = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -704819605
   )
   int field3492 = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 142706045
   )
   int field3501 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 683297025
   )
   int field3502 = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -171046757
   )
   int field3503 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1245285575
   )
   int field3500 = Integer.MAX_VALUE;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 359621961
   )
   int field3484 = Integer.MAX_VALUE;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1943562183
   )
   int field3486 = Integer.MAX_VALUE;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1762576791
   )
   int field3507 = 0;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 281194267
   )
   int field3506 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1564492109
   )
   int field3485 = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -312555077
   )
   int field3482 = 0;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   class297 field3511;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lkr;"
   )
   class297 field3512;

   class303() {
      this.field3491.method7123(1);
      this.field3483.method7123(1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1350430597"
   )
   void method5879() {
      this.field3508 = (this.field3508 + 1) % 60;
      if (this.field3503 > 0) {
         --this.field3503;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "1031224212"
   )
   public boolean method5880(boolean var1) {
      var1 = var1 && this.field3489;
      boolean var2 = this.field3493 != var1;
      this.field3493 = var1;
      if (!this.field3493) {
         this.method5904(this.field3492, this.field3492);
      }

      return var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1990857914"
   )
   public void method5881(boolean var1) {
      this.field3489 = var1;
      this.field3493 = var1 && this.field3493;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "1086312663"
   )
   boolean method5882(String var1) {
      String var2 = this.field3491.method7091();
      if (!var2.equals(var1)) {
         var1 = this.method5948(var1);
         this.field3491.method7051(var1);
         this.method5889(this.field3485, this.field3482);
         this.method5920();
         this.method5957();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-966702085"
   )
   boolean method6124(String var1) {
      this.field3483.method7051(var1);
      return true;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lne;S)Z",
      garbageValue = "-408"
   )
   boolean method5884(AbstractFont var1) {
      boolean var2 = !this.field3496;
      this.field3491.method7108(var1);
      this.field3483.method7108(var1);
      this.field3496 = true;
      var2 |= this.method5889(this.field3485, this.field3482);
      var2 |= this.method5904(this.field3501, this.field3492);
      if (this.method5920()) {
         this.method5957();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1720007659"
   )
   public boolean method5885(int var1, int var2) {
      boolean var3 = this.field3507 != var1 || var2 != this.field3506;
      this.field3507 = var1;
      this.field3506 = var2;
      var3 |= this.method5889(this.field3485, this.field3482);
      return var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "11"
   )
   public boolean method5886(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field3491.method7062();
      this.field3491.method7042(var1, true);
      this.field3483.method7042(var1, true);
      if (this.method5920()) {
         this.method5957();
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "195765062"
   )
   public boolean method5887(int var1) {
      if (var1 < 0) {
         this.field3500 = Integer.MAX_VALUE;
      } else {
         this.field3500 = var1;
      }

      if (this.method5920()) {
         this.method5957();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-54"
   )
   public boolean method5888(int var1) {
      this.field3486 = var1;
      if (this.method5920()) {
         this.method5957();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1288674527"
   )
   public boolean method5889(int var1, int var2) {
      if (!this.method6062()) {
         this.field3485 = var1;
         this.field3482 = var2;
         return false;
      } else {
         int var3 = this.field3485;
         int var4 = this.field3482;
         int var5 = Math.max(0, this.field3491.method7057() - this.field3507 + 2);
         int var6 = Math.max(0, this.field3491.method7140() - this.field3506 + 1);
         this.field3485 = Math.max(0, Math.min(var5, var1));
         this.field3482 = Math.max(0, Math.min(var6, var2));
         return var3 != this.field3485 || var4 != this.field3482;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1022783976"
   )
   public boolean method5890(int var1, int var2) {
      return true;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "604179607"
   )
   public void method5891(int var1) {
      this.field3491.method7117(var1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1403807319"
   )
   public void method5892(int var1) {
      this.field3497 = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "716355991"
   )
   public void method6015(int var1) {
      this.field3491.method7123(var1);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "217166740"
   )
   public void method5941(int var1) {
      this.field3491.method7043(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "50"
   )
   public boolean method6044(int var1) {
      this.field3499 = var1;
      String var2 = this.field3491.method7091();
      int var3 = var2.length();
      var2 = this.method5948(var2);
      if (var2.length() != var3) {
         this.field3491.method7051(var2);
         this.method5889(this.field3485, this.field3482);
         this.method5920();
         this.method5957();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1966558117"
   )
   public void method5896() {
      this.field3496 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-188837227"
   )
   public boolean method5897(int var1) {
      if (this.method5929(var1)) {
         this.method5902();
         class369 var2 = this.field3491.method7048((char)var1, this.field3492, this.field3484, this.field3500);
         this.method5904(var2.method7145(), var2.method7145());
         this.method5920();
         this.method5957();
      }

      return true;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "3315"
   )
   public void method5898() {
      if (!this.method5902() && this.field3492 > 0) {
         int var1 = this.field3491.method7053(this.field3492 - 1);
         this.method5957();
         this.method5904(var1, var1);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public void method5899() {
      if (!this.method5902() && this.field3492 < this.field3491.method7041()) {
         int var1 = this.field3491.method7053(this.field3492);
         this.method5957();
         this.method5904(var1, var1);
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "512301118"
   )
   public void method5900() {
      if (!this.method5902() && this.field3492 > 0) {
         class440 var1 = this.method5950(this.field3492 - 1);
         int var2 = this.field3491.method7046((Integer)var1.field4811, this.field3492);
         this.method5957();
         this.method5904(var2, var2);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-30062"
   )
   public void method5901() {
      if (!this.method5902() && this.field3492 < this.field3491.method7041()) {
         class440 var1 = this.method5950(this.field3492);
         int var2 = this.field3491.method7046(this.field3492, (Integer)var1.field4809);
         this.method5957();
         this.method5904(var2, var2);
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1528760733"
   )
   boolean method5902() {
      if (!this.method5947()) {
         return false;
      } else {
         int var1 = this.field3491.method7046(this.field3501, this.field3492);
         this.method5957();
         this.method5904(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "54505361"
   )
   public void method6116() {
      this.method5904(0, this.field3491.method7041());
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-34"
   )
   public boolean method5904(int var1, int var2) {
      if (!this.method6062()) {
         this.field3501 = var1;
         this.field3492 = var2;
         return false;
      } else {
         if (var1 > this.field3491.method7041()) {
            var1 = this.field3491.method7041();
         }

         if (var2 > this.field3491.method7041()) {
            var2 = this.field3491.method7041();
         }

         boolean var3 = this.field3501 != var1 || var2 != this.field3492;
         this.field3501 = var1;
         if (var2 != this.field3492) {
            this.field3492 = var2;
            this.field3508 = 0;
            this.method5955();
         }

         if (var3 && this.field3512 != null) {
            this.field3512.vmethod5829();
         }

         return var3;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "111"
   )
   public void method6143(boolean var1) {
      class440 var2 = this.method6037(this.field3492);
      this.method6112((Integer)var2.field4811, var1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1891106199"
   )
   public void method5906(boolean var1) {
      class440 var2 = this.method6037(this.field3492);
      this.method6112((Integer)var2.field4809, var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-926488964"
   )
   public void method5907(boolean var1) {
      this.method6112(0, var1);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1841715153"
   )
   public void method5908(boolean var1) {
      this.method6112(this.field3491.method7041(), var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-585513262"
   )
   public void method5909(boolean var1) {
      if (this.method5947() && !var1) {
         this.method6112(Math.min(this.field3501, this.field3492), var1);
      } else if (this.field3492 > 0) {
         this.method6112(this.field3492 - 1, var1);
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "7"
   )
   public void method5910(boolean var1) {
      if (this.method5947() && !var1) {
         this.method6112(Math.max(this.field3501, this.field3492), var1);
      } else if (this.field3492 < this.field3491.method7041()) {
         this.method6112(this.field3492 + 1, var1);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "101"
   )
   public void method5911(boolean var1) {
      if (this.field3492 > 0) {
         class440 var2 = this.method5950(this.field3492 - 1);
         this.method6112((Integer)var2.field4811, var1);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-17"
   )
   public void method5903(boolean var1) {
      if (this.field3492 < this.field3491.method7041()) {
         class440 var2 = this.method5950(this.field3492 + 1);
         this.method6112((Integer)var2.field4809, var1);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "478652614"
   )
   public void method6028(boolean var1) {
      if (this.field3492 > 0) {
         this.method6112(this.field3491.method7056(this.field3492, -1), var1);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-76"
   )
   public void method5935(boolean var1) {
      if (this.field3492 < this.field3491.method7041()) {
         this.method6112(this.field3491.method7056(this.field3492, 1), var1);
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "-2228"
   )
   public void method5915(boolean var1) {
      if (this.field3492 > 0) {
         int var2 = this.method5954();
         this.method6112(this.field3491.method7056(this.field3492, -var2), var1);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "314854978"
   )
   public void method5916(boolean var1) {
      if (this.field3492 < this.field3491.method7041()) {
         int var2 = this.method5954();
         this.method6112(this.field3491.method7056(this.field3492, var2), var1);
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "4"
   )
   public void method5917(boolean var1) {
      class372 var2 = this.field3491.method7092(0, this.field3492);
      class440 var3 = var2.method7255();
      this.method6112(this.field3491.method7055((Integer)var3.field4811, this.field3482), var1);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "891282237"
   )
   public void method5918(boolean var1) {
      class372 var2 = this.field3491.method7092(0, this.field3492);
      class440 var3 = var2.method7255();
      this.method6112(this.field3491.method7055((Integer)var3.field4811, this.field3506 + this.field3482), var1);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIZZB)V",
      garbageValue = "80"
   )
   public void method5919(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      int var8;
      if (!this.field3496) {
         var8 = 0;
      } else {
         var1 += this.field3485;
         var2 += this.field3482;
         var8 = this.field3491.method7055(var1, var2);
      }

      class440 var6;
      if (var3 && var4) {
         this.field3498 = 1;
         var6 = this.method5950(var8);
         class440 var7 = this.method5950(this.field3502);
         this.method6058(var7, var6);
      } else if (var3) {
         this.field3498 = 1;
         var6 = this.method5950(var8);
         this.method5904((Integer)var6.field4811, (Integer)var6.field4809);
         this.field3502 = (Integer)var6.field4811;
      } else if (var4) {
         this.method5904(this.field3502, var8);
      } else {
         if (this.field3503 > 0 && var8 == this.field3502) {
            if (this.field3501 == this.field3492) {
               this.field3498 = 1;
               var6 = this.method5950(var8);
               this.method5904((Integer)var6.field4811, (Integer)var6.field4809);
            } else {
               this.field3498 = 2;
               var6 = this.method6037(var8);
               this.method5904((Integer)var6.field4811, (Integer)var6.field4809);
            }
         } else {
            this.field3498 = 0;
            this.method5904(var8, var8);
            this.field3502 = var8;
         }

         this.field3503 = 25;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "116560284"
   )
   public void method6102(int var1, int var2) {
      if (this.field3496 && this.method5963()) {
         var1 += this.field3485;
         var2 += this.field3482;
         int var3 = this.field3491.method7055(var1, var2);
         class440 var4;
         class440 var5;
         switch (this.field3498) {
            case 0:
               this.method5904(this.field3501, var3);
               break;
            case 1:
               var4 = this.method5950(this.field3502);
               var5 = this.method5950(var3);
               this.method6058(var4, var5);
               break;
            case 2:
               var4 = this.method6037(this.field3502);
               var5 = this.method6037(var3);
               this.method6058(var4, var5);
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "-1357067118"
   )
   public void method6034(Clipboard var1) {
      class372 var2 = this.field3491.method7092(this.field3501, this.field3492);
      if (!var2.method7251()) {
         String var3 = var2.method7272();
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "1200185346"
   )
   public void method5922(Clipboard var1) {
      if (this.method5947()) {
         this.method6034(var1);
         this.method5902();
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
      garbageValue = "1443728969"
   )
   public void method5923(Clipboard var1) {
      Transferable var2 = var1.getContents((Object)null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = this.method5948((String)var2.getTransferData(DataFlavor.stringFlavor));
            this.method5902();
            class369 var4 = this.field3491.method7049(var3, this.field3492, this.field3484, this.field3500);
            this.method5904(var4.method7145(), var4.method7145());
            this.method5920();
            this.method5957();
         } catch (Exception var5) {
            System.out.println("Error pasting clipboard to InputField.");
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-382481619"
   )
   public void method5924() {
      this.field3482 = Math.max(0, this.field3482 - this.field3491.method7131());
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1691398443"
   )
   public void method6001() {
      int var1 = Math.max(0, this.field3491.method7140() - this.field3506);
      this.field3482 = Math.min(var1, this.field3482 + this.field3491.method7131());
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lkr;I)V",
      garbageValue = "-1482480307"
   )
   public void method5926(class297 var1) {
      this.field3511 = var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lkr;I)V",
      garbageValue = "-981604746"
   )
   public void method5927(class297 var1) {
      this.field3512 = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Lnu;",
      garbageValue = "-174585091"
   )
   public class368 method6004() {
      return this.field3491;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Lnu;",
      garbageValue = "-1028025765"
   )
   public class368 method5893() {
      return this.field3483;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Lna;",
      garbageValue = "0"
   )
   public class372 method5930() {
      return this.field3491.method7092(this.field3501, this.field3492);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1825590323"
   )
   public boolean method5963() {
      return this.field3493;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   public boolean method5878() {
      return this.field3489;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "241"
   )
   public boolean method5933() {
      return this.method5963() && this.field3508 % 60 < 30;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1904955935"
   )
   public int method5934() {
      return this.field3492;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-80"
   )
   public int method5913() {
      return this.field3501;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-555561187"
   )
   public boolean method6062() {
      return this.field3496;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1887741730"
   )
   public int method5937() {
      return this.field3485;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1255754672"
   )
   public int method5938() {
      return this.field3482;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-17768"
   )
   public int method5939() {
      return this.field3491.method7062();
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-40"
   )
   public int method5940() {
      return this.field3500;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1076456010"
   )
   public int method6111() {
      return this.field3486;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-216079285"
   )
   public int method5942() {
      return this.field3497;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1133819584"
   )
   public int method6054() {
      return this.field3491.method7063();
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2061169778"
   )
   public int method5944() {
      return this.field3499;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1951131614"
   )
   public int method6024() {
      return this.field3491.method7104();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1774852145"
   )
   public boolean method5946() {
      return this.field3500 > 1;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1862038399"
   )
   boolean method5947() {
      return this.field3492 != this.field3501;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1311901455"
   )
   String method5948(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (this.method5929(var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Lpg;Lpg;I)V",
      garbageValue = "-1058810846"
   )
   void method6058(class440 var1, class440 var2) {
      if ((Integer)var2.field4811 < (Integer)var1.field4811) {
         this.method5904((Integer)var1.field4809, (Integer)var2.field4811);
      } else {
         this.method5904((Integer)var1.field4811, (Integer)var2.field4809);
      }

   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(II)Lpg;",
      garbageValue = "-1085956446"
   )
   class440 method5950(int var1) {
      int var2 = this.field3491.method7041();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.method6029(this.field3491.method7038(var5 - 1).field4395)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.method6029(this.field3491.method7038(var5).field4395)) {
            var4 = var5;
            break;
         }
      }

      return new class440(var3, var4);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II)Lpg;",
      garbageValue = "1830301127"
   )
   class440 method6037(int var1) {
      int var2 = this.field3491.method7041();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (this.field3491.method7038(var5 - 1).field4395 == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (this.field3491.method7038(var5).field4395 == '\n') {
            var4 = var5;
            break;
         }
      }

      return new class440(var3, var4);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "8914325"
   )
   boolean method5920() {
      if (!this.method6062()) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field3491.method7041() > this.field3486) {
            this.field3491.method7046(this.field3486, this.field3491.method7041());
            var1 = true;
         }

         int var2;
         if (this.field3491.method7133() > this.field3500) {
            var2 = this.field3491.method7056(0, this.field3500) - 1;
            this.field3491.method7046(var2, this.field3491.method7041());
            var1 = true;
         }

         if (var1) {
            var2 = this.field3492;
            int var3 = this.field3501;
            int var4 = this.field3491.method7041();
            if (this.field3492 > var4) {
               var2 = var4;
            }

            if (this.field3501 > var4) {
               var3 = var4;
            }

            this.method5904(var3, var2);
         }

         return var1;
      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1350161608"
   )
   void method6112(int var1, boolean var2) {
      if (var2) {
         this.method5904(this.field3501, var1);
      } else {
         this.method5904(var1, var1);
      }

   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-201387644"
   )
   int method5954() {
      return this.field3506 / this.field3491.method7131();
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "797989363"
   )
   void method5955() {
      class372 var1 = this.field3491.method7092(0, this.field3492);
      class440 var2 = var1.method7255();
      int var3 = this.field3491.method7131();
      int var4 = (Integer)var2.field4811 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field4809 - 3;
      int var7 = var6 + var3 + 6;
      int var8 = this.field3485;
      int var9 = var8 + this.field3507;
      int var10 = this.field3482;
      int var11 = var10 + this.field3506;
      int var12 = this.field3485;
      int var13 = this.field3482;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field3507;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field3506;
      }

      this.method5889(var12, var13);
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2021327959"
   )
   boolean method6029(int var1) {
      return var1 == 32 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method5957() {
      if (this.field3511 != null) {
         this.field3511.vmethod5829();
      }

   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1962828241"
   )
   boolean method5929(int var1) {
      switch (this.field3499) {
         case 1:
            return ObjectComposition.isAlphaNumeric((char)var1);
         case 2:
            return ViewportMouse.isCharAlphabetic((char)var1);
         case 3:
            return WorldMapLabelSize.isDigit((char)var1);
         case 4:
            char var2 = (char)var1;
            if (WorldMapLabelSize.isDigit(var2)) {
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
