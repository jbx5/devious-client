import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class365 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -332249035
   )
   int field4329 = Integer.MAX_VALUE;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1691155089
   )
   int field4332 = 0;
   @ObfuscatedName("p")
   boolean field4333 = true;
   @ObfuscatedName("b")
   boolean field4330 = true;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lnt;"
   )
   AbstractFont field4335;
   @ObfuscatedName("u")
   ArrayList field4336 = new ArrayList();
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 896242275
   )
   int field4337 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 45441755
   )
   int field4338 = 0;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lns;",
      garbageValue = "-1964484006"
   )
   public class367 method6881(int var1) {
      return (class367)this.field4336.get(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lns;",
      garbageValue = "-992605359"
   )
   class367 method6882() {
      return this.field4336.size() == 0 ? null : (class367)this.field4336.get(this.field4336.size() - 1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-6"
   )
   public boolean method6883() {
      return this.field4336.size() == 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-195978311"
   )
   public int method6943() {
      return this.field4336.size();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "57"
   )
   public String method6880() {
      if (this.method6883()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method6943());

         for(int var2 = 0; var2 < this.method6943(); ++var2) {
            class367 var3 = this.method6881(var2);
            var1.append(var3.field4347);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1794064051"
   )
   public void method6886(int var1, boolean var2) {
      if (this.field4335 != null && var1 < this.field4335.ascent * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field4329 != var1 || var2 != this.field4333) {
         this.field4329 = var1;
         this.field4333 = var2;
         this.method6962(0, this.field4336.size(), false);
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "37"
   )
   public void method6887(int var1) {
      if (this.field4338 != var1) {
         this.field4338 = var1;
         this.method6962(0, this.field4336.size(), false);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lnt;I)V",
      garbageValue = "-915658449"
   )
   public void method6888(AbstractFont var1) {
      if (var1 != this.field4335) {
         this.field4335 = var1;
         if (this.field4335 != null) {
            if (this.field4332 == 0) {
               this.field4332 = this.field4335.ascent;
            }

            if (!this.method6883()) {
               this.method6962(0, this.field4336.size(), false);
            }
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1605888698"
   )
   public void method6905(int var1) {
      if (this.field4337 != var1) {
         this.field4337 = var1;
         this.method6962(0, this.field4336.size(), false);
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1197413449"
   )
   public void method6890(int var1) {
      if (this.field4332 != var1) {
         this.field4332 = var1;
         this.method6962(0, this.field4336.size(), false);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(III)Lnx;",
      garbageValue = "-1580347071"
   )
   public class369 method6891(int var1, int var2) {
      if (var2 == var1) {
         return new class369(this, 0, 0);
      } else if (var1 <= this.field4336.size() && var2 <= this.field4336.size()) {
         return var2 < var1 ? new class369(this, var2, var1) : new class369(this, var1, var2);
      } else {
         return new class369(this, 0, 0);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(CIIII)Lnu;",
      garbageValue = "1664631962"
   )
   public class366 method6885(char var1, int var2, int var3, int var4) {
      return this.method6935(Character.toString(var1), var2, var3, var4);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IIII)Lnu;",
      garbageValue = "1100081346"
   )
   public class366 method6935(String var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      if (this.field4336.size() >= var3) {
         return new class366(var2, true);
      } else {
         this.field4336.ensureCapacity(this.field4336.size() + var1.length());
         int var5 = var2;
         int var6 = 0;
         class367 var7 = this.method6972(var2);
         int var8 = this.method6956(var2);

         int var9;
         int var10;
         for(var9 = -1; var6 < var1.length() && this.field4336.size() < var3; ++var5) {
            class367 var11 = new class367();
            var11.field4347 = var1.charAt(var6++);
            if (var11.field4347 == '\n') {
               var11.field4343 = var7.field4343 + this.method6903();
               var10 = 0;
            } else {
               var11.field4341 = var8 + var7.field4341;
               var11.field4343 = var7.field4343;
               var10 = this.method6913(var11, false);
               if (this.field4333 && var10 + var11.field4341 > this.field4329) {
                  if (this.field4337 == 0) {
                     var11.field4341 = 0;
                     var11.field4343 += this.method6903();
                  } else if (var9 == -1) {
                     var9 = var5;
                  }
               }
            }

            var7 = var11;
            var8 = var10;
            this.field4336.add(var5, var11);
         }

         var10 = var9 == -1 ? var5 : var9;
         this.method6962(var10, this.field4336.size(), true);
         if (var4 != 0 && this.method6904() > var4) {
            while(var5 != var2) {
               --var5;
               this.method6897(var5);
               if (this.method6904() <= var4) {
                  break;
               }
            }

            return new class366(var5, true);
         } else {
            return new class366(var5, false);
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IIB)Lnu;",
      garbageValue = "73"
   )
   class366 method6894(String var1, int var2, int var3) {
      return this.method6935(var1, this.field4336.size(), var2, var3);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Lnu;",
      garbageValue = "-454911722"
   )
   public class366 method6895(String var1) {
      this.method6968();
      return this.method6894(var1, 0, 0);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "913428011"
   )
   void method6968() {
      this.field4336.clear();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "70"
   )
   public int method6897(int var1) {
      return this.method6898(var1, var1 + 1);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-47833479"
   )
   public int method6898(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field4336.subList(var1, var2).clear();
      var3 = var1;
      if (this.field4333 && this.field4337 == 1) {
         label36: {
            int var4 = var1;

            char var5;
            do {
               if (var4 <= 0) {
                  break label36;
               }

               --var4;
               var5 = ((class367)this.field4336.get(var4)).field4347;
            } while(var5 != ' ' && var5 != '\t');

            var3 = var4;
         }
      }

      this.method6962(var3, this.field4336.size(), true);
      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1023124425"
   )
   public int method6930(int var1, int var2) {
      if (this.field4335 != null && var1 >= 0 && var2 >= 0) {
         if (this.field4333 && var1 > this.field4329) {
            return this.field4336.size();
         } else {
            if (!this.field4336.isEmpty()) {
               for(int var3 = 0; var3 < this.field4336.size(); ++var3) {
                  class367 var4 = (class367)this.field4336.get(var3);
                  if (var2 <= var4.field4343 + this.method6903()) {
                     if (var2 < var4.field4343) {
                        break;
                     }

                     if (var1 < var4.field4341) {
                        return var3 > 0 ? var3 - 1 : 0;
                     }

                     if (var3 + 1 != this.field4336.size() && ((class367)this.field4336.get(1 + var3)).field4343 != var4.field4343) {
                        int var5 = this.method6913((class367)this.field4336.get(var3), false);
                        if (var1 < var5 + var4.field4341) {
                           return var3;
                        }

                        if (var2 <= var4.field4343 + this.method6903()) {
                           return var3 + 1;
                        }
                     }
                  }
               }

               class367 var6 = (class367)this.field4336.get(this.field4336.size() - 1);
               if (var1 >= var6.field4341 && var1 <= var6.field4341 + this.method6978() && var2 >= var6.field4343 && var2 <= var6.field4343 + this.method6903()) {
                  return this.field4336.size() - 1;
               }
            }

            return this.field4336.size();
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "62"
   )
   public int method6900(int var1, int var2) {
      if (this.field4335 != null && !this.method6883() && var1 <= this.field4336.size()) {
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
            class367 var6 = (class367)this.field4336.get(var1 - 1);
            var4 = var6.field4341 + this.method6912(var1 - 1);
            var5 = var6.field4343;
         } else if (var3 == -1 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.field4336.size() + 1 : 0;

         for(int var11 = var3 + var1; var10 != var11; var11 += var3) {
            class367 var12 = (class367)this.field4336.get(var11 - 1);
            if (var5 != var12.field4343) {
               ++var7;
               var5 = var12.field4343;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(var12.field4341 + this.method6912(var11 - 1) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field4336.size();
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1018364442"
   )
   public int method6901() {
      if (!this.field4336.isEmpty() && this.method6904() == 1) {
         return this.field4336.isEmpty() ? 0 : ((class367)this.field4336.get(this.field4336.size() - 1)).field4341 + this.method6978();
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.field4336.size() - 1; var3 >= 0; --var3) {
            class367 var4 = (class367)this.field4336.get(var3);
            if (var1 != var4.field4343) {
               int var5 = this.method6913(var4, false) + var4.field4341;
               var2 = Math.max(var5, var2);
               var1 = var4.field4343;
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-313663048"
   )
   public int method6969() {
      return this.method6883() ? 0 : this.field4335.ascent + ((class367)this.field4336.get(this.field4336.size() - 1)).field4343;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1763547424"
   )
   public int method6903() {
      return this.field4332;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1988231717"
   )
   public int method6904() {
      return this.method6969() / this.field4335.ascent;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-898"
   )
   int method6978() {
      return this.method6883() ? 0 : this.method6913((class367)this.field4336.get(this.field4336.size() - 1), false);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-748889445"
   )
   public int method6906() {
      return this.field4329;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1730130424"
   )
   public int method6893() {
      return this.field4337;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int method6908() {
      return this.field4338;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IIZB)V",
      garbageValue = "8"
   )
   void method6962(int var1, int var2, boolean var3) {
      if (!this.method6883() && this.field4335 != null) {
         class367 var4 = this.method6972(var1);
         int var5 = this.method6956(var1);

         for(int var6 = var1; var6 < var2; ++var6) {
            class367 var7 = (class367)this.field4336.get(var6);
            int var10;
            if (var7.field4347 == '\n') {
               int var9 = var4.field4343 + this.method6903();
               if (var3) {
                  if (var9 != var7.field4343) {
                     var10 = var9 - var7.field4343;

                     for(int var17 = var6; var17 < var2; ++var17) {
                        class367 var10000 = (class367)this.field4336.get(var17);
                        var10000.field4343 += var10;
                     }
                  }
                  break;
               }

               var7.field4343 = var9;
               boolean var8 = false;
            } else {
               var7.field4341 = var5 + var4.field4341;
               var7.field4343 = var4.field4343;
               int var18 = this.method6913(var7, false);
               if (this.field4333 && var18 + var7.field4341 > this.field4329) {
                  boolean var19 = false;
                  if (this.field4337 == 1) {
                     for(var10 = var6; var10 > 0; --var10) {
                        class367 var11 = (class367)this.field4336.get(var10 - 1);
                        if (var7.field4343 != var11.field4343) {
                           break;
                        }

                        if (var11.field4347 == ' ' || var11.field4347 == '\t') {
                           class367 var12 = (class367)this.field4336.get(var10);
                           int var13 = var12.field4341;
                           int var14 = var12.field4343 + this.method6903();

                           for(int var15 = var10; var15 <= var6; ++var15) {
                              class367 var16 = (class367)this.field4336.get(var15);
                              var16.field4341 -= var13;
                              var16.field4343 = var14;
                           }

                           var19 = true;
                           break;
                        }
                     }
                  }

                  if (!var19) {
                     var7.field4341 = 0;
                     var7.field4343 += this.method6903();
                  }
               }
            }

            var4 = (class367)this.field4336.get(var6);
            var5 = this.method6913(var4, false);
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)Lns;",
      garbageValue = "-1143519734"
   )
   class367 method6972(int var1) {
      if (var1 > 0 && !this.field4336.isEmpty()) {
         return var1 >= this.field4336.size() ? (class367)this.field4336.get(this.field4336.size() - 1) : (class367)this.field4336.get(var1 - 1);
      } else {
         return new class367();
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-649378291"
   )
   int method6956(int var1) {
      if (var1 > 0 && !this.field4336.isEmpty()) {
         return var1 >= this.field4336.size() ? this.method6912(this.field4336.size() - 1) : this.method6912(var1 - 1);
      } else {
         return 0;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "2"
   )
   int method6912(int var1) {
      return var1 < this.field4336.size() ? this.method6913((class367)this.field4336.get(var1), false) : 0;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lns;ZI)I",
      garbageValue = "-471041560"
   )
   int method6913(class367 var1, boolean var2) {
      if (var1.field4347 == '\n') {
         return 0;
      } else if (this.field4338 == 0) {
         int var3 = this.field4335.advances[var1.field4347];
         if (var3 == 0) {
            return var1.field4347 == '\t' ? this.field4335.advances[32] * 3 : this.field4335.advances[32];
         } else {
            return var3;
         }
      } else {
         return this.field4335.advances[42];
      }
   }
}
