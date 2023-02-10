import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class372 {
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 457693053
   )
   int field4394 = Integer.MAX_VALUE;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -94612245
   )
   int field4399 = 0;
   @ObfuscatedName("b")
   boolean field4396 = true;
   @ObfuscatedName("m")
   boolean field4391 = true;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lnw;"
   )
   AbstractFont field4398;
   @ObfuscatedName("h")
   ArrayList field4389 = new ArrayList();
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 659110515
   )
   int field4400 = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 704910067
   )
   int field4401 = 0;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lnq;",
      garbageValue = "55"
   )
   public class374 method7074(int var1) {
      return (class374)this.field4389.get(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Lnq;",
      garbageValue = "-899837938"
   )
   class374 method7097() {
      return this.field4389.size() == 0 ? null : (class374)this.field4389.get(this.field4389.size() - 1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "51"
   )
   public boolean method7076() {
      return this.field4389.size() == 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1962221607"
   )
   public int method7173() {
      return this.field4389.size();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "-14961"
   )
   public String method7078() {
      if (this.method7076()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7173());

         for(int var2 = 0; var2 < this.method7173(); ++var2) {
            class374 var3 = this.method7074(var2);
            var1.append(var3.field4411);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "682732986"
   )
   public void method7079(int var1, boolean var2) {
      if (this.field4398 != null && var1 < this.field4398.ascent * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field4394 != var1 || var2 != this.field4396) {
         this.field4394 = var1;
         this.field4396 = var2;
         this.method7102(0, this.field4389.size(), false);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-55"
   )
   public void method7080(int var1) {
      if (this.field4401 != var1) {
         this.field4401 = var1;
         this.method7102(0, this.field4389.size(), false);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lnw;I)V",
      garbageValue = "1071681431"
   )
   public void method7089(AbstractFont var1) {
      if (var1 != this.field4398) {
         this.field4398 = var1;
         if (this.field4398 != null) {
            if (this.field4399 == 0) {
               this.field4399 = this.field4398.ascent;
            }

            if (!this.method7076()) {
               this.method7102(0, this.field4389.size(), false);
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-98802638"
   )
   public void method7101(int var1) {
      if (this.field4400 != var1) {
         this.field4400 = var1;
         this.method7102(0, this.field4389.size(), false);
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "9870"
   )
   public void method7083(int var1) {
      if (this.field4399 != var1) {
         this.field4399 = var1;
         this.method7102(0, this.field4389.size(), false);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lnm;",
      garbageValue = "8"
   )
   public class376 method7140(int var1, int var2) {
      if (var2 == var1) {
         return new class376(this, 0, 0);
      } else if (var1 <= this.field4389.size() && var2 <= this.field4389.size()) {
         return var2 < var1 ? new class376(this, var2, var1) : new class376(this, var1, var2);
      } else {
         return new class376(this, 0, 0);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(CIIII)Lnu;",
      garbageValue = "-412468704"
   )
   public class373 method7174(char var1, int var2, int var3, int var4) {
      return this.method7086(Character.toString(var1), var2, var3, var4);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IIII)Lnu;",
      garbageValue = "-2136642155"
   )
   public class373 method7086(String var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      if (this.field4389.size() >= var3) {
         return new class373(var2, true);
      } else {
         this.field4389.ensureCapacity(this.field4389.size() + var1.length());
         int var5 = var2;
         int var6 = 0;
         class374 var7 = this.method7103(var2);
         int var8 = this.method7090(var2);

         int var9;
         int var10;
         for(var9 = -1; var6 < var1.length() && this.field4389.size() < var3; ++var5) {
            class374 var11 = new class374();
            var11.field4411 = var1.charAt(var6++);
            if (var11.field4411 == '\n') {
               var11.field4410 = var7.field4410 + this.method7096();
               var10 = 0;
            } else {
               var11.field4408 = var8 + var7.field4408;
               var11.field4410 = var7.field4410;
               var10 = this.method7106(var11, false);
               if (this.field4396 && var10 + var11.field4408 > this.field4394) {
                  if (this.field4400 == 0) {
                     var11.field4408 = 0;
                     var11.field4410 += this.method7096();
                  } else if (var9 == -1) {
                     var9 = var5;
                  }
               }
            }

            var7 = var11;
            var8 = var10;
            this.field4389.add(var5, var11);
         }

         var10 = var9 == -1 ? var5 : var9;
         this.method7102(var10, this.field4389.size(), true);
         if (var4 != 0 && this.method7137() > var4) {
            while(var5 != var2) {
               --var5;
               this.method7152(var5);
               if (this.method7137() <= var4) {
                  break;
               }
            }

            return new class373(var5, true);
         } else {
            return new class373(var5, false);
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;III)Lnu;",
      garbageValue = "-1922985516"
   )
   class373 method7075(String var1, int var2, int var3) {
      return this.method7086(var1, this.field4389.size(), var2, var3);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Lnu;",
      garbageValue = "-998070512"
   )
   public class373 method7088(String var1) {
      this.method7077();
      return this.method7075(var1, 0, 0);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method7077() {
      this.field4389.clear();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-8448203"
   )
   public int method7152(int var1) {
      return this.method7091(var1, var1 + 1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "10408"
   )
   public int method7091(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field4389.subList(var1, var2).clear();
      var3 = var1;
      if (this.field4396 && this.field4400 == 1) {
         label34: {
            int var4 = var1;

            char var5;
            do {
               if (var4 <= 0) {
                  break label34;
               }

               --var4;
               var5 = ((class374)this.field4389.get(var4)).field4411;
            } while(var5 != ' ' && var5 != '\t');

            var3 = var4;
         }
      }

      this.method7102(var3, this.field4389.size(), true);
      return var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "525"
   )
   public int method7092(int var1, int var2) {
      if (this.field4398 != null && var1 >= 0 && var2 >= 0) {
         if (this.field4396 && var1 > this.field4394) {
            return this.field4389.size();
         } else {
            if (!this.field4389.isEmpty()) {
               for(int var3 = 0; var3 < this.field4389.size(); ++var3) {
                  class374 var4 = (class374)this.field4389.get(var3);
                  if (var2 <= var4.field4410 + this.method7096()) {
                     if (var2 < var4.field4410) {
                        break;
                     }

                     if (var1 < var4.field4408) {
                        return var3 > 0 ? var3 - 1 : 0;
                     }

                     if (var3 + 1 != this.field4389.size() && ((class374)this.field4389.get(1 + var3)).field4410 != var4.field4410) {
                        int var5 = this.method7106((class374)this.field4389.get(var3), false);
                        if (var1 < var5 + var4.field4408) {
                           return var3;
                        }

                        if (var2 <= var4.field4410 + this.method7096()) {
                           return var3 + 1;
                        }
                     }
                  }
               }

               class374 var6 = (class374)this.field4389.get(this.field4389.size() - 1);
               if (var1 >= var6.field4408 && var1 <= var6.field4408 + this.method7098() && var2 >= var6.field4410 && var2 <= var6.field4410 + this.method7096()) {
                  return this.field4389.size() - 1;
               }
            }

            return this.field4389.size();
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "2001960464"
   )
   public int method7115(int var1, int var2) {
      if (this.field4398 != null && !this.method7076() && var1 <= this.field4389.size()) {
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
            class374 var6 = (class374)this.field4389.get(var1 - 1);
            var4 = var6.field4408 + this.method7105(var1 - 1);
            var5 = var6.field4410;
         } else if (var3 == -1 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.field4389.size() + 1 : 0;

         for(int var11 = var3 + var1; var11 != var10; var11 += var3) {
            class374 var12 = (class374)this.field4389.get(var11 - 1);
            if (var5 != var12.field4410) {
               ++var7;
               var5 = var12.field4410;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(var12.field4408 + this.method7105(var11 - 1) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field4389.size();
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-78"
   )
   public int method7175() {
      if (!this.field4389.isEmpty() && this.method7137() == 1) {
         return this.field4389.isEmpty() ? 0 : ((class374)this.field4389.get(this.field4389.size() - 1)).field4408 + this.method7098();
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.field4389.size() - 1; var3 >= 0; --var3) {
            class374 var4 = (class374)this.field4389.get(var3);
            if (var1 != var4.field4410) {
               int var5 = this.method7106(var4, false) + var4.field4408;
               var2 = Math.max(var5, var2);
               var1 = var4.field4410;
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-30"
   )
   public int method7095() {
      return this.method7076() ? 0 : this.field4398.ascent + ((class374)this.field4389.get(this.field4389.size() - 1)).field4410;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-534651403"
   )
   public int method7096() {
      return this.field4399;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1958718002"
   )
   public int method7137() {
      return this.method7095() / this.field4398.ascent;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1535007927"
   )
   int method7098() {
      return this.method7076() ? 0 : this.method7106((class374)this.field4389.get(this.field4389.size() - 1), false);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-983822310"
   )
   public int method7099() {
      return this.field4394;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1001126357"
   )
   public int method7100() {
      return this.field4400;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   public int method7085() {
      return this.field4401;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "1645181643"
   )
   void method7102(int var1, int var2, boolean var3) {
      if (!this.method7076() && this.field4398 != null) {
         class374 var4 = this.method7103(var1);
         int var5 = this.method7090(var1);

         for(int var6 = var1; var6 < var2; ++var6) {
            class374 var7 = (class374)this.field4389.get(var6);
            int var10;
            if (var7.field4411 == '\n') {
               int var9 = var4.field4410 + this.method7096();
               if (var3) {
                  if (var9 != var7.field4410) {
                     var10 = var9 - var7.field4410;

                     for(int var17 = var6; var17 < var2; ++var17) {
                        class374 var10000 = (class374)this.field4389.get(var17);
                        var10000.field4410 += var10;
                     }
                  }
                  break;
               }

               var7.field4410 = var9;
               boolean var8 = false;
            } else {
               var7.field4408 = var5 + var4.field4408;
               var7.field4410 = var4.field4410;
               int var18 = this.method7106(var7, false);
               if (this.field4396 && var18 + var7.field4408 > this.field4394) {
                  boolean var19 = false;
                  if (this.field4400 == 1) {
                     for(var10 = var6; var10 > 0; --var10) {
                        class374 var11 = (class374)this.field4389.get(var10 - 1);
                        if (var11.field4410 != var7.field4410) {
                           break;
                        }

                        if (var11.field4411 == ' ' || var11.field4411 == '\t') {
                           class374 var12 = (class374)this.field4389.get(var10);
                           int var13 = var12.field4408;
                           int var14 = var12.field4410 + this.method7096();

                           for(int var15 = var10; var15 <= var6; ++var15) {
                              class374 var16 = (class374)this.field4389.get(var15);
                              var16.field4408 -= var13;
                              var16.field4410 = var14;
                           }

                           var19 = true;
                           break;
                        }
                     }
                  }

                  if (!var19) {
                     var7.field4408 = 0;
                     var7.field4410 += this.method7096();
                  }
               }
            }

            var4 = (class374)this.field4389.get(var6);
            var5 = this.method7106(var4, false);
         }

      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Lnq;",
      garbageValue = "-614261861"
   )
   class374 method7103(int var1) {
      if (var1 > 0 && !this.field4389.isEmpty()) {
         return var1 >= this.field4389.size() ? (class374)this.field4389.get(this.field4389.size() - 1) : (class374)this.field4389.get(var1 - 1);
      } else {
         return new class374();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "113"
   )
   int method7090(int var1) {
      if (var1 > 0 && !this.field4389.isEmpty()) {
         return var1 >= this.field4389.size() ? this.method7105(this.field4389.size() - 1) : this.method7105(var1 - 1);
      } else {
         return 0;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2008557271"
   )
   int method7105(int var1) {
      return var1 < this.field4389.size() ? this.method7106((class374)this.field4389.get(var1), false) : 0;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lnq;ZI)I",
      garbageValue = "1847840161"
   )
   int method7106(class374 var1, boolean var2) {
      if (var1.field4411 == '\n') {
         return 0;
      } else if (this.field4401 == 0) {
         int var3 = this.field4398.advances[var1.field4411];
         if (var3 == 0) {
            return var1.field4411 == '\t' ? this.field4398.advances[32] * 3 : this.field4398.advances[32];
         } else {
            return var3;
         }
      } else {
         return this.field4398.advances[42];
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "-354380087"
   )
   @Export("getFile")
   public static File getFile(String var0) {
      if (!FileSystem.FileSystem_hasPermissions) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  FileSystem.FileSystem_cacheFiles.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
               }

               throw new RuntimeException();
            }
         }
      }
   }
}
