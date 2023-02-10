import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("Username")
public class Username implements Comparable {
   @ObfuscatedName("f")
   @Export("name")
   String name;
   @ObfuscatedName("w")
   @Export("cleanName")
   String cleanName;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lqj;)V"
   )
   public Username(String var1, LoginType var2) {
      this.name = var1;
      String var4;
      if (var1 == null) {
         var4 = null;
      } else {
         label123: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && MenuAction.method2084(var1.charAt(var5)); ++var5) {
            }

            while(var6 > var5 && MenuAction.method2084(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               int var9;
               if (var2 == null) {
                  var9 = 12;
               } else {
                  switch (var2.field4859) {
                     case 5:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                  }
               }

               if (var7 <= var9) {
                  StringBuilder var15 = new StringBuilder(var7);

                  for(var9 = var5; var9 < var6; ++var9) {
                     char var10 = var1.charAt(var9);
                     boolean var11;
                     if (Character.isISOControl(var10)) {
                        var11 = false;
                     } else if (class97.isAlphaNumeric(var10)) {
                        var11 = true;
                     } else {
                        char[] var12 = class454.field4864;
                        int var13 = 0;

                        label90:
                        while(true) {
                           char var14;
                           if (var13 >= var12.length) {
                              var12 = class454.field4865;

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = var12[var13];
                                 if (var10 == var14) {
                                    var11 = true;
                                    break label90;
                                 }
                              }

                              var11 = false;
                              break;
                           }

                           var14 = var12[var13];
                           if (var14 == var10) {
                              var11 = true;
                              break;
                           }

                           ++var13;
                        }
                     }

                     if (var11) {
                        char var16;
                        switch (var10) {
                           case ' ':
                           case '-':
                           case '_':
                           case ' ':
                              var16 = '_';
                              break;
                           case '#':
                           case '[':
                           case ']':
                              var16 = var10;
                              break;
                           case 'À':
                           case 'Á':
                           case 'Â':
                           case 'Ã':
                           case 'Ä':
                           case 'à':
                           case 'á':
                           case 'â':
                           case 'ã':
                           case 'ä':
                              var16 = 'a';
                              break;
                           case 'Ç':
                           case 'ç':
                              var16 = 'c';
                              break;
                           case 'È':
                           case 'É':
                           case 'Ê':
                           case 'Ë':
                           case 'è':
                           case 'é':
                           case 'ê':
                           case 'ë':
                              var16 = 'e';
                              break;
                           case 'Í':
                           case 'Î':
                           case 'Ï':
                           case 'í':
                           case 'î':
                           case 'ï':
                              var16 = 'i';
                              break;
                           case 'Ñ':
                           case 'ñ':
                              var16 = 'n';
                              break;
                           case 'Ò':
                           case 'Ó':
                           case 'Ô':
                           case 'Õ':
                           case 'Ö':
                           case 'ò':
                           case 'ó':
                           case 'ô':
                           case 'õ':
                           case 'ö':
                              var16 = 'o';
                              break;
                           case 'Ù':
                           case 'Ú':
                           case 'Û':
                           case 'Ü':
                           case 'ù':
                           case 'ú':
                           case 'û':
                           case 'ü':
                              var16 = 'u';
                              break;
                           case 'ß':
                              var16 = 'b';
                              break;
                           case 'ÿ':
                           case 'Ÿ':
                              var16 = 'y';
                              break;
                           default:
                              var16 = Character.toLowerCase(var10);
                        }

                        if (var16 != 0) {
                           var15.append(var16);
                        }
                     }
                  }

                  if (var15.length() == 0) {
                     var4 = null;
                  } else {
                     var4 = var15.toString();
                  }
                  break label123;
               }
            }

            var4 = null;
         }
      }

      this.cleanName = var4;
   }

   public Username(String var1) {
      this.name = var1;
      LoginType var4 = LoginType.oldscape;
      String var3;
      if (var1 == null) {
         var3 = null;
      } else {
         label123: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && MenuAction.method2084(var1.charAt(var5)); ++var5) {
            }

            while(var6 > var5 && MenuAction.method2084(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               int var9;
               if (var4 == null) {
                  var9 = 12;
               } else {
                  switch (var4.field4859) {
                     case 5:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                  }
               }

               if (var7 <= var9) {
                  StringBuilder var15 = new StringBuilder(var7);

                  for(var9 = var5; var9 < var6; ++var9) {
                     char var10 = var1.charAt(var9);
                     boolean var11;
                     if (Character.isISOControl(var10)) {
                        var11 = false;
                     } else if (class97.isAlphaNumeric(var10)) {
                        var11 = true;
                     } else {
                        char[] var12 = class454.field4864;
                        int var13 = 0;

                        label90:
                        while(true) {
                           char var14;
                           if (var13 >= var12.length) {
                              var12 = class454.field4865;

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = var12[var13];
                                 if (var10 == var14) {
                                    var11 = true;
                                    break label90;
                                 }
                              }

                              var11 = false;
                              break;
                           }

                           var14 = var12[var13];
                           if (var10 == var14) {
                              var11 = true;
                              break;
                           }

                           ++var13;
                        }
                     }

                     if (var11) {
                        char var16;
                        switch (var10) {
                           case ' ':
                           case '-':
                           case '_':
                           case ' ':
                              var16 = '_';
                              break;
                           case '#':
                           case '[':
                           case ']':
                              var16 = var10;
                              break;
                           case 'À':
                           case 'Á':
                           case 'Â':
                           case 'Ã':
                           case 'Ä':
                           case 'à':
                           case 'á':
                           case 'â':
                           case 'ã':
                           case 'ä':
                              var16 = 'a';
                              break;
                           case 'Ç':
                           case 'ç':
                              var16 = 'c';
                              break;
                           case 'È':
                           case 'É':
                           case 'Ê':
                           case 'Ë':
                           case 'è':
                           case 'é':
                           case 'ê':
                           case 'ë':
                              var16 = 'e';
                              break;
                           case 'Í':
                           case 'Î':
                           case 'Ï':
                           case 'í':
                           case 'î':
                           case 'ï':
                              var16 = 'i';
                              break;
                           case 'Ñ':
                           case 'ñ':
                              var16 = 'n';
                              break;
                           case 'Ò':
                           case 'Ó':
                           case 'Ô':
                           case 'Õ':
                           case 'Ö':
                           case 'ò':
                           case 'ó':
                           case 'ô':
                           case 'õ':
                           case 'ö':
                              var16 = 'o';
                              break;
                           case 'Ù':
                           case 'Ú':
                           case 'Û':
                           case 'Ü':
                           case 'ù':
                           case 'ú':
                           case 'û':
                           case 'ü':
                              var16 = 'u';
                              break;
                           case 'ß':
                              var16 = 'b';
                              break;
                           case 'ÿ':
                           case 'Ÿ':
                              var16 = 'y';
                              break;
                           default:
                              var16 = Character.toLowerCase(var10);
                        }

                        if (var16 != 0) {
                           var15.append(var16);
                        }
                     }
                  }

                  if (var15.length() == 0) {
                     var3 = null;
                  } else {
                     var3 = var15.toString();
                  }
                  break label123;
               }
            }

            var3 = null;
         }
      }

      this.cleanName = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "29793"
   )
   @Export("getName")
   public String getName() {
      return this.name;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "4"
   )
   public String method9270() {
      return this.cleanName;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "80"
   )
   @Export("hasCleanName")
   public boolean hasCleanName() {
      return this.cleanName != null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lsi;B)I",
      garbageValue = "-128"
   )
   @Export("compareToTyped")
   public int compareToTyped(Username var1) {
      if (this.cleanName == null) {
         return var1.cleanName == null ? 0 : 1;
      } else {
         return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else if (var2.cleanName == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.cleanName == null ? 0 : this.cleanName.hashCode();
   }

   public String toString() {
      return this.getName();
   }

   public int compareTo(Object var1) {
      return this.compareToTyped((Username)var1);
   }
}
