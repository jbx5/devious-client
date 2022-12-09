import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("Username")
public class Username implements Comparable {
   @ObfuscatedName("h")
   @Export("name")
   String name;
   @ObfuscatedName("e")
   @Export("cleanName")
   String cleanName;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lqi;)V"
   )
   public Username(String var1, LoginType var2) {
      this.name = var1;
      String var4;
      if (var1 == null) {
         var4 = null;
      } else {
         label85: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6; ++var5) {
               char var8 = var1.charAt(var5);
               boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
               if (!var7) {
                  break;
               }
            }

            while(var6 > var5 && GrandExchangeOfferOwnWorldComparator.method1212(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var13 = var6 - var5;
            if (var13 >= 1) {
               int var9;
               if (var2 == null) {
                  var9 = 12;
               } else {
                  switch (var2.field4833) {
                     case 1:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                  }
               }

               if (var13 <= var9) {
                  StringBuilder var12 = new StringBuilder(var13);

                  for(var9 = var5; var9 < var6; ++var9) {
                     char var10 = var1.charAt(var9);
                     if (RouteStrategy.method4181(var10)) {
                        char var11 = UserList.method7589(var10);
                        if (var11 != 0) {
                           var12.append(var11);
                        }
                     }
                  }

                  if (var12.length() == 0) {
                     var4 = null;
                  } else {
                     var4 = var12.toString();
                  }
                  break label85;
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
         label85: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6; ++var5) {
               char var8 = var1.charAt(var5);
               boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
               if (!var7) {
                  break;
               }
            }

            while(var6 > var5 && GrandExchangeOfferOwnWorldComparator.method1212(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var13 = var6 - var5;
            if (var13 >= 1) {
               int var9;
               if (var4 == null) {
                  var9 = 12;
               } else {
                  switch (var4.field4833) {
                     case 1:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                  }
               }

               if (var13 <= var9) {
                  StringBuilder var12 = new StringBuilder(var13);

                  for(var9 = var5; var9 < var6; ++var9) {
                     char var10 = var1.charAt(var9);
                     if (RouteStrategy.method4181(var10)) {
                        char var11 = UserList.method7589(var10);
                        if (var11 != 0) {
                           var12.append(var11);
                        }
                     }
                  }

                  if (var12.length() == 0) {
                     var3 = null;
                  } else {
                     var3 = var12.toString();
                  }
                  break label85;
               }
            }

            var3 = null;
         }
      }

      this.cleanName = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1788894577"
   )
   @Export("getName")
   public String getName() {
      return this.name;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-94"
   )
   public String method9160() {
      return this.cleanName;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-35"
   )
   @Export("hasCleanName")
   public boolean hasCleanName() {
      return this.cleanName != null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)I",
      garbageValue = "115"
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

   public int compareTo(Object var1) {
      return this.compareToTyped((Username)var1);
   }

   public String toString() {
      return this.getName();
   }
}
