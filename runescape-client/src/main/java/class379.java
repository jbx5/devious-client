import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class379 {
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -747672747
   )
   @Export("musicTrackGroupId")
   public static int musicTrackGroupId;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 233637321
   )
   int field4413 = Integer.MAX_VALUE;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -64830711
   )
   int field4411 = Integer.MAX_VALUE;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 252193353
   )
   int field4412 = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1114162931
   )
   int field4418 = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1059679999
   )
   int field4414 = 0;
   @ObfuscatedName("aj")
   boolean field4415 = true;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lou;"
   )
   AbstractFont field4409;
   @ObfuscatedName("az")
   ArrayList field4417 = new ArrayList();
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -29893609
   )
   int field4406 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 874587033
   )
   int field4419 = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lom;",
      garbageValue = "1345867261"
   )
   public class381 method7260(int var1) {
      return (class381)this.field4417.get(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Lom;",
      garbageValue = "-1433710051"
   )
   class381 method7290() {
      return this.field4417.size() == 0 ? null : (class381)this.field4417.get(this.field4417.size() - 1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1182697415"
   )
   public boolean method7262() {
      return this.field4417.size() == 0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "16"
   )
   boolean method7263() {
      return this.field4411 > 1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1350377634"
   )
   public int method7264() {
      return this.field4417.size();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1389348498"
   )
   public String method7265() {
      if (this.method7262()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7264());

         for(int var2 = 0; var2 < this.method7264(); ++var2) {
            class381 var3 = this.method7260(var2);
            var1.append(var3.field4428);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "2"
   )
   public void method7320(int var1) {
      if (this.field4409 != null && var1 < this.field4409.ascent * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field4413 != var1) {
         this.field4413 = var1;
         this.method7294();
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "47"
   )
   public void method7261(int var1) {
      if (this.field4411 != var1) {
         this.field4411 = var1;
         this.method7294();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2120915806"
   )
   public void method7298(int var1) {
      if (this.field4419 != var1) {
         this.field4419 = var1;
         this.method7294();
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lou;I)V",
      garbageValue = "-1950541126"
   )
   public void method7373(AbstractFont var1) {
      if (var1 != this.field4409) {
         this.field4409 = var1;
         if (this.field4409 != null) {
            if (this.field4414 == 0) {
               this.field4414 = this.field4409.ascent;
            }

            if (!this.method7262()) {
               this.method7294();
            }
         }
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-57"
   )
   public void method7270(int var1) {
      if (this.field4406 != var1) {
         this.field4406 = var1;
         this.method7294();
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1438102335"
   )
   public boolean method7271(int var1, int var2) {
      if (this.field4412 != var1 || var2 != this.field4418) {
         this.field4412 = var1;
         this.field4418 = var2;
         this.method7294();
      }

      return true;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-54"
   )
   public void method7272(int var1) {
      if (this.field4414 != var1) {
         this.field4414 = var1;
         this.method7294();
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIB)Loa;",
      garbageValue = "17"
   )
   public class383 method7341(int var1, int var2) {
      if (var2 == var1) {
         return new class383(this, 0, 0);
      } else if (var1 <= this.field4417.size() && var2 <= this.field4417.size()) {
         return var2 < var1 ? new class383(this, var2, var1) : new class383(this, var1, var2);
      } else {
         return new class383(this, 0, 0);
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(CIII)Low;",
      garbageValue = "1267710833"
   )
   public class380 method7307(char var1, int var2, int var3) {
      return this.method7275(Character.toString(var1), var2, var3);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IIB)Low;",
      garbageValue = "-18"
   )
   public class380 method7275(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (this.field4417.size() >= var3) {
         this.method7295(var2, var2);
         return new class380(var2, true);
      } else {
         this.field4417.ensureCapacity(this.field4417.size() + var1.length());

         for(int var5 = 0; var5 < var1.length() && this.field4417.size() < var3; ++var5) {
            class381 var6 = new class381();
            var6.field4428 = var1.charAt(var5);
            this.field4417.add(var4, var6);
            ++var4;
         }

         this.method7295(var2, var4);
         if (this.field4411 != 0 && this.method7286() > this.field4411) {
            while(var4 != var2) {
               --var4;
               this.method7279(var4);
               if (this.method7286() <= this.field4411) {
                  break;
               }
            }

            return new class380(var4, true);
         } else {
            return new class380(var4, false);
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)Low;",
      garbageValue = "24"
   )
   class380 method7276(String var1, int var2) {
      return this.method7275(var1, this.field4417.size(), var2);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Low;",
      garbageValue = "-844450457"
   )
   public class380 method7277(String var1) {
      this.method7269();
      return this.method7276(var1, 0);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-108"
   )
   void method7269() {
      this.field4417.clear();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1484829823"
   )
   public int method7279(int var1) {
      return this.method7280(var1, var1 + 1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "572114493"
   )
   public int method7280(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field4417.subList(var1, var2).clear();
      var3 = var1;
      if (this.method7263() && this.field4406 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((class381)this.field4417.get(var3)).field4428;
            if (var4 == ' ' || var4 == '\t') {
               break;
            }
         }
      }

      this.method7295(var3, var2);
      return var1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-22"
   )
   public int method7281(int var1, int var2) {
      if (this.field4409 == null) {
         return 0;
      } else if (this.method7263() && var1 > this.field4413) {
         return this.field4417.size();
      } else {
         if (!this.field4417.isEmpty()) {
            for(int var3 = 0; var3 < this.field4417.size(); ++var3) {
               class381 var4 = (class381)this.field4417.get(var3);
               if (var2 <= var4.field4430 + this.method7386()) {
                  if (var2 < var4.field4430) {
                     break;
                  }

                  if (var1 < var4.field4427) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (var3 + 1 != this.field4417.size() && ((class381)this.field4417.get(var3 + 1)).field4430 != var4.field4430) {
                     int var5 = this.method7297((class381)this.field4417.get(var3), false);
                     if (var1 < var5 + var4.field4427) {
                        return var3;
                     }

                     if (var2 <= var4.field4430 + this.method7386()) {
                        return var3 + 1;
                     }
                  }
               }
            }

            class381 var6 = (class381)this.field4417.get(this.field4417.size() - 1);
            if (var1 >= var6.field4427 && var1 <= var6.field4427 + this.method7359() && var2 >= var6.field4430 && var2 <= var6.field4430 + this.method7386()) {
               return this.field4417.size() - 1;
            }
         }

         return this.field4417.size();
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "95"
   )
   public int method7282(int var1, int var2) {
      if (this.field4409 != null && !this.method7262() && var1 <= this.field4417.size()) {
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
            class381 var6 = (class381)this.field4417.get(var1 - 1);
            var4 = var6.field4427 + this.method7296(var1 - 1);
            var5 = var6.field4430;
         } else if (var3 == -1 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.field4417.size() + 1 : 0;

         for(int var11 = var3 + var1; var10 != var11; var11 += var3) {
            class381 var12 = (class381)this.field4417.get(var11 - 1);
            if (var5 != var12.field4430) {
               ++var7;
               var5 = var12.field4430;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(var12.field4427 + this.method7296(var11 - 1) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field4417.size();
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

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-298165365"
   )
   public int method7283() {
      if (!this.field4417.isEmpty() && this.method7286() == 1) {
         return this.field4417.isEmpty() ? 0 : ((class381)this.field4417.get(this.field4417.size() - 1)).field4427 + this.method7359();
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.field4417.size() - 1; var3 >= 0; --var3) {
            class381 var4 = (class381)this.field4417.get(var3);
            if (var1 != var4.field4430) {
               int var5 = this.method7297(var4, false) + var4.field4427;
               var2 = Math.max(var5, var2);
               var1 = var4.field4430;
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1760321375"
   )
   public int method7284() {
      return this.method7262() ? 0 : this.field4409.ascent + ((class381)this.field4417.get(this.field4417.size() - 1)).field4430;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-297150195"
   )
   public int method7386() {
      return this.field4414;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "36"
   )
   public int method7286() {
      return this.method7284() / this.field4409.ascent;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "80"
   )
   int method7359() {
      return this.method7262() ? 0 : this.method7297((class381)this.field4417.get(this.field4417.size() - 1), false);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1296915014"
   )
   public int method7379() {
      return this.field4413;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "22905"
   )
   public int method7289() {
      return this.field4411;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "817014315"
   )
   public int method7334() {
      return this.field4406;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "785448473"
   )
   public int method7291() {
      return this.field4419;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "88"
   )
   public int method7381(int var1) {
      switch (this.field4412) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1521607060"
   )
   public int method7383(int var1) {
      switch (this.field4418) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-224307219"
   )
   void method7294() {
      this.method7295(0, this.field4417.size());
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-93545195"
   )
   void method7295(int var1, int var2) {
      if (!this.method7262() && this.field4409 != null) {
         class461 var3 = this.method7259(var1, var2);
         boolean var4 = (Integer)var3.field4886 == 0 && (Integer)var3.field4887 == this.field4417.size();
         int var5 = (Integer)var3.field4886;
         int var6 = 0;
         int var7 = var4 ? 0 : ((class381)this.field4417.get((Integer)var3.field4886)).field4430;
         int var8 = 0;

         int var9;
         for(var9 = (Integer)var3.field4886; var9 <= (Integer)var3.field4887; ++var9) {
            boolean var10 = var9 >= this.field4417.size();
            class381 var21 = (class381)this.field4417.get(!var10 ? var9 : this.field4417.size() - 1);
            int var22 = !var10 ? this.method7297(var21, false) : 0;
            boolean var13 = !var10 && var21.field4428 == '\n';
            boolean var14 = !var10 && this.method7263() && var6 + var22 > this.field4413;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               int var17;
               int var18;
               class381 var19;
               if (var14) {
                  var17 = 0;
                  if (this.field4406 == 1) {
                     for(var18 = var9; var18 > var5; --var18) {
                        var19 = (class381)this.field4417.get(var18);
                        var17 += var18 < var15 ? this.method7297(var19, false) : 0;
                        if (var19.field4428 == ' ' || var19.field4428 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               var17 = -this.method7381(var6);

               for(var18 = var5; var18 < var15; ++var18) {
                  var19 = (class381)this.field4417.get(var18);
                  int var20 = this.method7297(var19, false);
                  var19.field4427 = var17;
                  var19.field4430 = var7;
                  var17 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.method7386();
               ++var8;
            }

            var6 += !var10 ? var22 : 0;
         }

         if (this.field4418 != 0 && var4) {
            var9 = var8 * this.method7386();
            int var23 = this.method7383(var9);

            for(int var11 = 0; var11 < this.field4417.size(); ++var11) {
               class381 var12 = (class381)this.field4417.get(var11);
               var12.field4430 -= var23;
            }
         }

      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-465870520"
   )
   int method7296(int var1) {
      return var1 < this.field4417.size() ? this.method7297((class381)this.field4417.get(var1), false) : 0;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Lom;ZI)I",
      garbageValue = "-935952959"
   )
   int method7297(class381 var1, boolean var2) {
      if (var1.field4428 == '\n') {
         return 0;
      } else if (this.field4419 == 0) {
         int var3 = this.field4409.advances[var1.field4428];
         if (var3 == 0) {
            return var1.field4428 == '\t' ? this.field4409.advances[32] * 3 : this.field4409.advances[32];
         } else {
            return var3;
         }
      } else {
         return this.field4409.advances[42];
      }
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(III)Lrg;",
      garbageValue = "2105841802"
   )
   class461 method7259(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field4417.size();
      if (var3 == 0 && var4 == var5) {
         return new class461(0, var5);
      } else {
         int var6 = this.method7299(var3, false);
         int var7 = this.method7300(var4, false);
         int var8;
         switch (this.field4418) {
            case 0:
               if (this.field4412 == 0) {
                  return new class461(var6, var5);
               }

               var8 = this.method7299(var3, true);
               return new class461(var8, var5);
            case 1:
               return new class461(0, var5);
            case 2:
               if (this.field4412 == 2) {
                  return new class461(0, var7);
               }

               var8 = this.method7300(var4, true);
               return new class461(0, var8);
            default:
               return new class461(0, var5);
         }
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "-423936082"
   )
   int method7299(int var1, boolean var2) {
      if (var1 < this.field4417.size()) {
         int var3 = ((class381)this.field4417.get(var1)).field4430;

         for(int var4 = var1; var4 > 0; --var4) {
            if (((class381)this.field4417.get(var4 - 1)).field4430 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class381)this.field4417.get(var4 - 1)).field4430;
            }
         }
      }

      return 0;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "-985100260"
   )
   int method7300(int var1, boolean var2) {
      if (var1 < this.field4417.size()) {
         int var3 = ((class381)this.field4417.get(var1)).field4430;

         for(int var4 = var1; var4 < this.field4417.size() - 1; ++var4) {
            if (((class381)this.field4417.get(var4 + 1)).field4430 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class381)this.field4417.get(var4 + 1)).field4430;
            }
         }
      }

      return this.field4417.size();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-59"
   )
   public static void method7393() {
      ItemComposition.ItemDefinition_cached.clear();
      ItemComposition.ItemDefinition_cachedModels.clear();
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "613256531"
   )
   @Export("Clan_joinChat")
   static final void Clan_joinChat(String var0) {
      if (!var0.equals("")) {
         PacketBufferNode var1 = class330.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
