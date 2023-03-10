import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class375 {
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 140924849
   )
   int field4366 = Integer.MAX_VALUE;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -758691399
   )
   int field4363 = Integer.MAX_VALUE;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 200503981
   )
   int field4368 = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1630677271
   )
   int field4369 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1218339741
   )
   int field4374 = 0;
   @ObfuscatedName("af")
   boolean field4371 = true;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lou;"
   )
   AbstractFont field4372;
   @ObfuscatedName("aw")
   ArrayList field4373 = new ArrayList();
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1665827127
   )
   int field4367 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1237811303
   )
   int field4375 = 0;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IB)Lod;",
      garbageValue = "-58"
   )
   public class377 method7118(int var1) {
      return (class377)this.field4373.get(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lod;",
      garbageValue = "2053007893"
   )
   class377 method6995() {
      return this.field4373.size() == 0 ? null : (class377)this.field4373.get(this.field4373.size() - 1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1946472859"
   )
   public boolean method6996() {
      return this.field4373.size() == 0;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1445253617"
   )
   boolean method7102() {
      return this.field4363 > 1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1456819718"
   )
   public int method6998() {
      return this.field4373.size();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1489675961"
   )
   public String method6999() {
      if (this.method6996()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method6998());

         for(int var2 = 0; var2 < this.method6998(); ++var2) {
            class377 var3 = this.method7118(var2);
            var1.append(var3.field4380);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "13"
   )
   public void method7000(int var1) {
      if (this.field4372 != null && var1 < this.field4372.ascent * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field4366 != var1) {
         this.field4366 = var1;
         this.method7028();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-22"
   )
   public void method7001(int var1) {
      if (this.field4363 != var1) {
         this.field4363 = var1;
         this.method7028();
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2052556376"
   )
   public void method7002(int var1) {
      if (this.field4375 != var1) {
         this.field4375 = var1;
         this.method7028();
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lou;I)V",
      garbageValue = "2091647435"
   )
   public void method7003(AbstractFont var1) {
      if (var1 != this.field4372) {
         this.field4372 = var1;
         if (this.field4372 != null) {
            if (this.field4374 == 0) {
               this.field4374 = this.field4372.ascent;
            }

            if (!this.method6996()) {
               this.method7028();
            }
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1711544559"
   )
   public void method7127(int var1) {
      if (this.field4367 != var1) {
         this.field4367 = var1;
         this.method7028();
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-2039244192"
   )
   public boolean method7005(int var1, int var2) {
      if (this.field4368 != var1 || var2 != this.field4369) {
         this.field4368 = var1;
         this.field4369 = var2;
         this.method7028();
      }

      return true;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-39"
   )
   public void method7006(int var1) {
      if (this.field4374 != var1) {
         this.field4374 = var1;
         this.method7028();
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)Lon;",
      garbageValue = "-555760487"
   )
   public class379 method7007(int var1, int var2) {
      if (var2 == var1) {
         return new class379(this, 0, 0);
      } else if (var1 <= this.field4373.size() && var2 <= this.field4373.size()) {
         return var2 < var1 ? new class379(this, var2, var1) : new class379(this, var1, var2);
      } else {
         return new class379(this, 0, 0);
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(CIIB)Loj;",
      garbageValue = "1"
   )
   public class376 method7070(char var1, int var2, int var3) {
      return this.method7023(Character.toString(var1), var2, var3);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;III)Loj;",
      garbageValue = "-727480702"
   )
   public class376 method7023(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (this.field4373.size() >= var3) {
         this.method7029(var2, var2);
         return new class376(var2, true);
      } else {
         this.field4373.ensureCapacity(this.field4373.size() + var1.length());

         for(int var5 = 0; var5 < var1.length() && this.field4373.size() < var3; ++var5) {
            class377 var6 = new class377();
            var6.field4380 = var1.charAt(var5);
            this.field4373.add(var4, var6);
            ++var4;
         }

         this.method7029(var2, var4);
         if (this.field4363 != 0 && this.method7020() > this.field4363) {
            while(var4 != var2) {
               --var4;
               this.method7013(var4);
               if (this.method7020() <= this.field4363) {
                  break;
               }
            }

            return new class376(var4, true);
         } else {
            return new class376(var4, false);
         }
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)Loj;",
      garbageValue = "-2097418671"
   )
   class376 method7071(String var1, int var2) {
      return this.method7023(var1, this.field4373.size(), var2);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)Loj;",
      garbageValue = "180"
   )
   public class376 method7011(String var1) {
      this.method7012();
      return this.method7071(var1, 0);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-52"
   )
   void method7012() {
      this.field4373.clear();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "914132212"
   )
   public int method7013(int var1) {
      return this.method7031(var1, var1 + 1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2141158161"
   )
   public int method7031(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field4373.subList(var1, var2).clear();
      var3 = var1;
      if (this.method7102() && this.field4367 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((class377)this.field4373.get(var3)).field4380;
            if (var4 == ' ' || var4 == '\t') {
               break;
            }
         }
      }

      this.method7029(var3, var2);
      return var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1082221342"
   )
   public int method7015(int var1, int var2) {
      if (this.field4372 == null) {
         return 0;
      } else if (this.method7102() && var1 > this.field4366) {
         return this.field4373.size();
      } else {
         if (!this.field4373.isEmpty()) {
            for(int var3 = 0; var3 < this.field4373.size(); ++var3) {
               class377 var4 = (class377)this.field4373.get(var3);
               if (var2 <= var4.field4378 + this.method7019()) {
                  if (var2 < var4.field4378) {
                     break;
                  }

                  if (var1 < var4.field4379) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (var3 + 1 != this.field4373.size() && ((class377)this.field4373.get(1 + var3)).field4378 != var4.field4378) {
                     int var5 = this.method7053((class377)this.field4373.get(var3), false);
                     if (var1 < var5 + var4.field4379) {
                        return var3;
                     }

                     if (var2 <= var4.field4378 + this.method7019()) {
                        return var3 + 1;
                     }
                  }
               }
            }

            class377 var6 = (class377)this.field4373.get(this.field4373.size() - 1);
            if (var1 >= var6.field4379 && var1 <= var6.field4379 + this.method7021() && var2 >= var6.field4378 && var2 <= var6.field4378 + this.method7019()) {
               return this.field4373.size() - 1;
            }
         }

         return this.field4373.size();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "70"
   )
   public int method7016(int var1, int var2) {
      if (this.field4372 != null && !this.method6996() && var1 <= this.field4373.size()) {
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
            class377 var6 = (class377)this.field4373.get(var1 - 1);
            var4 = var6.field4379 + this.method7030(var1 - 1);
            var5 = var6.field4378;
         } else if (var3 == -1 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.field4373.size() + 1 : 0;

         for(int var11 = var3 + var1; var11 != var10; var11 += var3) {
            class377 var12 = (class377)this.field4373.get(var11 - 1);
            if (var5 != var12.field4378) {
               ++var7;
               var5 = var12.field4378;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(var12.field4379 + this.method7030(var11 - 1) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field4373.size();
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-103"
   )
   public int method7017() {
      if (!this.field4373.isEmpty() && this.method7020() == 1) {
         return this.field4373.isEmpty() ? 0 : ((class377)this.field4373.get(this.field4373.size() - 1)).field4379 + this.method7021();
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.field4373.size() - 1; var3 >= 0; --var3) {
            class377 var4 = (class377)this.field4373.get(var3);
            if (var1 != var4.field4378) {
               int var5 = this.method7053(var4, false) + var4.field4379;
               var2 = Math.max(var5, var2);
               var1 = var4.field4378;
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-463176913"
   )
   public int method7018() {
      return this.method6996() ? 0 : this.field4372.ascent + ((class377)this.field4373.get(this.field4373.size() - 1)).field4378;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1395107807"
   )
   public int method7019() {
      return this.field4374;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "777744451"
   )
   public int method7020() {
      return this.method7018() / this.field4372.ascent;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1365210754"
   )
   int method7021() {
      return this.method6996() ? 0 : this.method7053((class377)this.field4373.get(this.field4373.size() - 1), false);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1992476190"
   )
   public int method7022() {
      return this.field4366;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1670251162"
   )
   public int method7057() {
      return this.field4363;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1925990481"
   )
   public int method7024() {
      return this.field4367;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1880572091"
   )
   public int method7106() {
      return this.field4375;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "152707656"
   )
   public int method7069(int var1) {
      switch (this.field4368) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            System.out.println("TextRun.getLeftOffsetForHorizontalAlignment: Invalid horizontal alignment. Value: '" + this.field4368 + "'.");
            return 0;
      }
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-80288601"
   )
   public int method7033(int var1) {
      switch (this.field4369) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            System.out.println("TextRun.getTopOffsetForVerticalAlignment: Invalid vertical alignment. Value: '" + this.field4369 + "'.");
            return 0;
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-62815061"
   )
   void method7028() {
      this.method7029(0, this.field4373.size());
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "75"
   )
   void method7029(int var1, int var2) {
      if (!this.method6996() && this.field4372 != null) {
         class451 var3 = this.method7008(var1, var2);
         boolean var4 = (Integer)var3.field4798 == 0 && (Integer)var3.field4799 == this.field4373.size();
         int var5 = (Integer)var3.field4798;
         int var6 = 0;
         int var7 = var4 ? 0 : ((class377)this.field4373.get((Integer)var3.field4798)).field4378;
         int var8 = 0;

         int var9;
         for(var9 = (Integer)var3.field4798; var9 <= (Integer)var3.field4799; ++var9) {
            boolean var10 = var9 >= this.field4373.size();
            class377 var21 = (class377)this.field4373.get(!var10 ? var9 : this.field4373.size() - 1);
            int var22 = !var10 ? this.method7053(var21, false) : 0;
            boolean var13 = !var10 && var21.field4380 == '\n';
            boolean var14 = !var10 && this.method7102() && var22 + var6 > this.field4366;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               int var17;
               int var18;
               class377 var19;
               if (var14) {
                  var17 = 0;
                  if (this.field4367 == 1) {
                     for(var18 = var9; var18 > var5; --var18) {
                        var19 = (class377)this.field4373.get(var18);
                        var17 += var18 < var15 ? this.method7053(var19, false) : 0;
                        if (var19.field4380 == ' ' || var19.field4380 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               var17 = -this.method7069(var6);

               for(var18 = var5; var18 < var15; ++var18) {
                  var19 = (class377)this.field4373.get(var18);
                  int var20 = this.method7053(var19, false);
                  var19.field4379 = var17;
                  var19.field4378 = var7;
                  var17 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.method7019();
               ++var8;
            }

            var6 += !var10 ? var22 : 0;
         }

         if (this.field4369 != 0 && var4) {
            var9 = var8 * this.method7019();
            int var23 = this.method7033(var9);

            for(int var11 = 0; var11 < this.field4373.size(); ++var11) {
               class377 var12 = (class377)this.field4373.get(var11);
               var12.field4378 -= var23;
            }
         }

      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2066300625"
   )
   int method7030(int var1) {
      return var1 < this.field4373.size() ? this.method7053((class377)this.field4373.get(var1), false) : 0;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Lod;ZI)I",
      garbageValue = "-615847689"
   )
   int method7053(class377 var1, boolean var2) {
      if (var1.field4380 == '\n') {
         return 0;
      } else if (this.field4375 == 0) {
         int var3 = this.field4372.advances[var1.field4380];
         if (var3 == 0) {
            return var1.field4380 == '\t' ? this.field4372.advances[32] * 3 : this.field4372.advances[32];
         } else {
            return var3;
         }
      } else {
         return this.field4372.advances[42];
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lrv;",
      garbageValue = "124"
   )
   class451 method7008(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field4373.size();
      if (var3 == 0 && var5 == var4) {
         return new class451(0, var5);
      } else {
         int var6 = this.method7055(var3, false);
         int var7 = this.method7034(var4, false);
         int var8;
         switch (this.field4369) {
            case 0:
               if (this.field4368 == 0) {
                  return new class451(var6, var5);
               }

               var8 = this.method7055(var3, true);
               return new class451(var8, var5);
            case 1:
               return new class451(0, var5);
            case 2:
               if (this.field4368 == 2) {
                  return new class451(0, var7);
               }

               var8 = this.method7034(var4, true);
               return new class451(0, var8);
            default:
               return new class451(0, var5);
         }
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "1702728009"
   )
   int method7055(int var1, boolean var2) {
      if (var1 < this.field4373.size()) {
         int var3 = ((class377)this.field4373.get(var1)).field4378;

         for(int var4 = var1; var4 > 0; --var4) {
            if (((class377)this.field4373.get(var4 - 1)).field4378 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class377)this.field4373.get(var4 - 1)).field4378;
            }
         }
      }

      return 0;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "2145203744"
   )
   int method7034(int var1, boolean var2) {
      if (var1 < this.field4373.size()) {
         int var3 = ((class377)this.field4373.get(var1)).field4378;

         for(int var4 = var1; var4 < this.field4373.size() - 1; ++var4) {
            if (((class377)this.field4373.get(var4 + 1)).field4378 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class377)this.field4373.get(var4 + 1)).field4378;
            }
         }
      }

      return this.field4373.size();
   }
}
