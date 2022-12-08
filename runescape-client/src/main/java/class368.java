import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class368 {
   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("dragInventoryWidget")
   static Widget dragInventoryWidget;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1517241847
   )
   int field4378 = Integer.MAX_VALUE;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -927573977
   )
   int field4382 = 0;
   @ObfuscatedName("i")
   boolean field4383 = true;
   @ObfuscatedName("o")
   boolean field4384 = true;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   AbstractFont field4385;
   @ObfuscatedName("k")
   ArrayList field4386 = new ArrayList();
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2048111853
   )
   int field4387 = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1741771127
   )
   int field4388 = 0;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lnp;",
      garbageValue = "599099594"
   )
   public class370 method7038(int var1) {
      return (class370)this.field4386.get(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)Lnp;",
      garbageValue = "68"
   )
   class370 method7039() {
      return this.field4386.size() == 0 ? null : (class370)this.field4386.get(this.field4386.size() - 1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2107005785"
   )
   public boolean method7103() {
      return this.field4386.size() == 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1127139622"
   )
   public int method7041() {
      return this.field4386.size();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public String method7091() {
      if (this.method7103()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7041());

         for(int var2 = 0; var2 < this.method7041(); ++var2) {
            class370 var3 = this.method7038(var2);
            var1.append(var3.field4395);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-552089288"
   )
   public void method7042(int var1, boolean var2) {
      if (this.field4385 != null && var1 < this.field4385.ascent * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field4378 != var1 || var2 != this.field4383) {
         this.field4378 = var1;
         this.field4383 = var2;
         this.method7040(0, this.field4386.size(), false);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-73"
   )
   public void method7043(int var1) {
      if (this.field4388 != var1) {
         this.field4388 = var1;
         this.method7040(0, this.field4386.size(), false);
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "1392079190"
   )
   public void method7108(AbstractFont var1) {
      if (var1 != this.field4385) {
         this.field4385 = var1;
         if (this.field4385 != null) {
            if (this.field4382 == 0) {
               this.field4382 = this.field4385.ascent;
            }

            if (!this.method7103()) {
               this.method7040(0, this.field4386.size(), false);
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-3706"
   )
   public void method7123(int var1) {
      if (this.field4387 != var1) {
         this.field4387 = var1;
         this.method7040(0, this.field4386.size(), false);
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1109991484"
   )
   public void method7117(int var1) {
      if (this.field4382 != var1) {
         this.field4382 = var1;
         this.method7040(0, this.field4386.size(), false);
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lna;",
      garbageValue = "14"
   )
   public class372 method7092(int var1, int var2) {
      if (var2 == var1) {
         return new class372(this, 0, 0);
      } else if (var1 <= this.field4386.size() && var2 <= this.field4386.size()) {
         return var2 < var1 ? new class372(this, var2, var1) : new class372(this, var1, var2);
      } else {
         return new class372(this, 0, 0);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(CIIII)Lny;",
      garbageValue = "1107452813"
   )
   public class369 method7048(char var1, int var2, int var3, int var4) {
      return this.method7049(Character.toString(var1), var2, var3, var4);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IIII)Lny;",
      garbageValue = "-620830058"
   )
   public class369 method7049(String var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      if (this.field4386.size() >= var3) {
         return new class369(var2, true);
      } else {
         this.field4386.ensureCapacity(this.field4386.size() + var1.length());
         int var5 = var2;
         int var6 = 0;
         class370 var7 = this.method7066(var2);
         int var8 = this.method7067(var2);

         int var9;
         int var10;
         for(var9 = -1; var6 < var1.length() && this.field4386.size() < var3; ++var5) {
            class370 var11 = new class370();
            var11.field4395 = var1.charAt(var6++);
            if (var11.field4395 == '\n') {
               var11.field4397 = var7.field4397 + this.method7131();
               var10 = 0;
            } else {
               var11.field4398 = var8 + var7.field4398;
               var11.field4397 = var7.field4397;
               var10 = this.method7069(var11, false);
               if (this.field4383 && var10 + var11.field4398 > this.field4378) {
                  if (this.field4387 == 0) {
                     var11.field4398 = 0;
                     var11.field4397 += this.method7131();
                  } else if (var9 == -1) {
                     var9 = var5;
                  }
               }
            }

            var7 = var11;
            var8 = var10;
            this.field4386.add(var5, var11);
         }

         var10 = var9 == -1 ? var5 : var9;
         this.method7040(var10, this.field4386.size(), true);
         if (var4 != 0 && this.method7133() > var4) {
            while(var5 != var2) {
               --var5;
               this.method7053(var5);
               if (this.method7133() <= var4) {
                  break;
               }
            }

            return new class369(var5, true);
         } else {
            return new class369(var5, false);
         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;III)Lny;",
      garbageValue = "1594768119"
   )
   class369 method7050(String var1, int var2, int var3) {
      return this.method7049(var1, this.field4386.size(), var2, var3);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Lny;",
      garbageValue = "103"
   )
   public class369 method7051(String var1) {
      this.method7052();
      return this.method7050(var1, 0, 0);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-16"
   )
   void method7052() {
      this.field4386.clear();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1344636736"
   )
   public int method7053(int var1) {
      return this.method7046(var1, var1 + 1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "888686654"
   )
   public int method7046(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field4386.subList(var1, var2).clear();
      var3 = var1;
      if (this.field4383 && this.field4387 == 1) {
         label36: {
            int var4 = var1;

            char var5;
            do {
               if (var4 <= 0) {
                  break label36;
               }

               --var4;
               var5 = ((class370)this.field4386.get(var4)).field4395;
            } while(var5 != ' ' && var5 != '\t');

            var3 = var4;
         }
      }

      this.method7040(var3, this.field4386.size(), true);
      return var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "655575850"
   )
   public int method7055(int var1, int var2) {
      if (this.field4385 != null && var1 >= 0 && var2 >= 0) {
         if (this.field4383 && var1 > this.field4378) {
            return this.field4386.size();
         } else {
            if (!this.field4386.isEmpty()) {
               for(int var3 = 0; var3 < this.field4386.size(); ++var3) {
                  class370 var4 = (class370)this.field4386.get(var3);
                  if (var2 <= var4.field4397 + this.method7131()) {
                     if (var2 < var4.field4397) {
                        break;
                     }

                     if (var1 < var4.field4398) {
                        return var3 > 0 ? var3 - 1 : 0;
                     }

                     if (var3 + 1 != this.field4386.size() && ((class370)this.field4386.get(var3 + 1)).field4397 != var4.field4397) {
                        int var5 = this.method7069((class370)this.field4386.get(var3), false);
                        if (var1 < var5 + var4.field4398) {
                           return var3;
                        }

                        if (var2 <= var4.field4397 + this.method7131()) {
                           return var3 + 1;
                        }
                     }
                  }
               }

               class370 var6 = (class370)this.field4386.get(this.field4386.size() - 1);
               if (var1 >= var6.field4398 && var1 <= var6.field4398 + this.method7061() && var2 >= var6.field4397 && var2 <= var6.field4397 + this.method7131()) {
                  return this.field4386.size() - 1;
               }
            }

            return this.field4386.size();
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1958663606"
   )
   public int method7056(int var1, int var2) {
      if (this.field4385 != null && !this.method7103() && var1 <= this.field4386.size()) {
         byte var3;
         if (var2 > 0) {
            var3 = 1;
         } else {
            var3 = -1;
            var2 = -var2;
         }

         int var4 = 0;
         int var5 = 0;
         if (var1 > 0) {
            class370 var6 = (class370)this.field4386.get(var1 - 1);
            var4 = var6.field4398 + this.method7065(var1 - 1);
            var5 = var6.field4397;
         } else if (var3 == -1 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.field4386.size() + 1 : 0;

         for(int var11 = var3 + var1; var11 != var10; var11 += var3) {
            class370 var12 = (class370)this.field4386.get(var11 - 1);
            if (var5 != var12.field4397) {
               ++var7;
               var5 = var12.field4397;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(var12.field4398 + this.method7065(var11 - 1) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field4386.size();
         } else {
            if (var5 != 0) {
               ++var7;
            }

            return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8;
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-130437286"
   )
   public int method7057() {
      if (!this.field4386.isEmpty() && this.method7133() == 1) {
         return this.field4386.isEmpty() ? 0 : ((class370)this.field4386.get(this.field4386.size() - 1)).field4398 + this.method7061();
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.field4386.size() - 1; var3 >= 0; --var3) {
            class370 var4 = (class370)this.field4386.get(var3);
            if (var1 != var4.field4397) {
               int var5 = this.method7069(var4, false) + var4.field4398;
               var2 = Math.max(var5, var2);
               var1 = var4.field4397;
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-25123"
   )
   public int method7140() {
      return this.method7103() ? 0 : this.field4385.ascent + ((class370)this.field4386.get(this.field4386.size() - 1)).field4397;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "845637475"
   )
   public int method7131() {
      return this.field4382;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2032059234"
   )
   public int method7133() {
      return this.method7140() / this.field4385.ascent;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1139842629"
   )
   int method7061() {
      return this.method7103() ? 0 : this.method7069((class370)this.field4386.get(this.field4386.size() - 1), false);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "253173757"
   )
   public int method7062() {
      return this.field4378;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1423170238"
   )
   public int method7063() {
      return this.field4387;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1071508455"
   )
   public int method7104() {
      return this.field4388;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "177216138"
   )
   void method7040(int var1, int var2, boolean var3) {
      if (!this.method7103() && this.field4385 != null) {
         class370 var4 = this.method7066(var1);
         int var5 = this.method7067(var1);

         for(int var6 = var1; var6 < var2; ++var6) {
            class370 var7 = (class370)this.field4386.get(var6);
            int var10;
            if (var7.field4395 == '\n') {
               int var9 = var4.field4397 + this.method7131();
               if (var3) {
                  if (var9 != var7.field4397) {
                     var10 = var9 - var7.field4397;

                     for(int var17 = var6; var17 < var2; ++var17) {
                        class370 var10000 = (class370)this.field4386.get(var17);
                        var10000.field4397 += var10;
                     }
                  }
                  break;
               }

               var7.field4397 = var9;
               boolean var8 = false;
            } else {
               var7.field4398 = var5 + var4.field4398;
               var7.field4397 = var4.field4397;
               int var18 = this.method7069(var7, false);
               if (this.field4383 && var18 + var7.field4398 > this.field4378) {
                  boolean var19 = false;
                  if (this.field4387 == 1) {
                     for(var10 = var6; var10 > 0; --var10) {
                        class370 var11 = (class370)this.field4386.get(var10 - 1);
                        if (var7.field4397 != var11.field4397) {
                           break;
                        }

                        if (var11.field4395 == ' ' || var11.field4395 == '\t') {
                           class370 var12 = (class370)this.field4386.get(var10);
                           int var13 = var12.field4398;
                           int var14 = var12.field4397 + this.method7131();

                           for(int var15 = var10; var15 <= var6; ++var15) {
                              class370 var16 = (class370)this.field4386.get(var15);
                              var16.field4398 -= var13;
                              var16.field4397 = var14;
                           }

                           var19 = true;
                           break;
                        }
                     }
                  }

                  if (!var19) {
                     var7.field4398 = 0;
                     var7.field4397 += this.method7131();
                  }
               }
            }

            var4 = (class370)this.field4386.get(var6);
            var5 = this.method7069(var4, false);
         }

      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Lnp;",
      garbageValue = "187141060"
   )
   class370 method7066(int var1) {
      if (var1 > 0 && !this.field4386.isEmpty()) {
         return var1 >= this.field4386.size() ? (class370)this.field4386.get(this.field4386.size() - 1) : (class370)this.field4386.get(var1 - 1);
      } else {
         return new class370();
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1721941194"
   )
   int method7067(int var1) {
      if (var1 > 0 && !this.field4386.isEmpty()) {
         return var1 >= this.field4386.size() ? this.method7065(this.field4386.size() - 1) : this.method7065(var1 - 1);
      } else {
         return 0;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-18349977"
   )
   int method7065(int var1) {
      return var1 < this.field4386.size() ? this.method7069((class370)this.field4386.get(var1), false) : 0;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lnp;ZB)I",
      garbageValue = "-31"
   )
   int method7069(class370 var1, boolean var2) {
      if (var1.field4395 == '\n') {
         return 0;
      } else if (this.field4388 == 0) {
         int var3 = this.field4385.advances[var1.field4395];
         if (var3 == 0) {
            return var1.field4395 == '\t' ? this.field4385.advances[32] * 3 : this.field4385.advances[32];
         } else {
            return var3;
         }
      } else {
         return this.field4385.advances[42];
      }
   }
}
