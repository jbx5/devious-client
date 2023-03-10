import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class206 implements class29 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   Widget field2278 = null;
   @ObfuscatedName("al")
   boolean field2279 = false;
   @ObfuscatedName("ac")
   boolean field2280 = false;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1308084386"
   )
   public boolean vmethod4075(int var1) {
      if (this.field2278 == null) {
         return false;
      } else {
         class27 var2 = this.field2278.method6120();
         if (var2 == null) {
            return false;
         } else {
            if (var2.method390(var1)) {
               switch (var1) {
                  case 81:
                     this.field2280 = true;
                     break;
                  case 82:
                     this.field2279 = true;
                     break;
                  default:
                     if (this.method4056(var1)) {
                        class69.invalidateWidget(this.field2278);
                     }
               }
            }

            return var2.method388(var1);
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1404887619"
   )
   public boolean vmethod4086(int var1) {
      switch (var1) {
         case 81:
            this.field2280 = false;
            return false;
         case 82:
            this.field2279 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-870523457"
   )
   public boolean vmethod4077(char var1) {
      if (this.field2278 == null) {
         return false;
      } else if (!ReflectionCheck.method680(var1)) {
         return false;
      } else {
         class310 var2 = this.field2278.method6118();
         if (var2 != null && var2.method5873()) {
            class27 var3 = this.field2278.method6120();
            if (var3 == null) {
               return false;
            } else {
               if (var3.method391(var1) && var2.method5834(var1)) {
                  class69.invalidateWidget(this.field2278);
               }

               return var3.method389(var1);
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "104"
   )
   public boolean vmethod4100(boolean var1) {
      return false;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)V",
      garbageValue = "1854257051"
   )
   public void method4049(Widget var1) {
      this.method4070();
      if (var1 != null) {
         this.field2278 = var1;
         class308 var2 = var1.method6163();
         if (var2 != null) {
            var2.field3458.method5891(true);
            if (var2.field3454 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2260(var1);
               var3.setArgs(var2.field3454);
               class144.method3139().addFirst(var3);
            }
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Lmy;",
      garbageValue = "2048848843"
   )
   public Widget method4050() {
      return this.field2278;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-64"
   )
   public void method4070() {
      if (this.field2278 != null) {
         class308 var1 = this.field2278.method6163();
         Widget var2 = this.field2278;
         this.field2278 = null;
         if (var1 != null) {
            var1.field3458.method5891(false);
            if (var1.field3454 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2260(var2);
               var3.setArgs(var1.field3454);
               class144.method3139().addFirst(var3);
            }

         }
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1710398450"
   )
   boolean method4056(int var1) {
      if (this.field2278 == null) {
         return false;
      } else {
         class310 var2 = this.field2278.method6118();
         if (var2 != null && var2.method5873()) {
            Clipboard var5;
            switch (var1) {
               case 13:
                  this.method4070();
                  return true;
               case 48:
                  if (this.field2279) {
                     var2.method5840();
                  }

                  return true;
               case 65:
                  if (this.field2279) {
                     var5 = class392.client.method482();
                     var2.method6056(var5);
                  }

                  return true;
               case 66:
                  if (this.field2279) {
                     var5 = class392.client.method482();
                     var2.method5858(var5);
                  }

                  return true;
               case 67:
                  if (this.field2279) {
                     var5 = class392.client.method482();
                     var2.method5860(var5);
                  }

                  return true;
               case 84:
                  if (var2.method5879() == 0) {
                     var2.method5834(10);
                  } else if (this.field2280 && var2.method5893()) {
                     var2.method5834(10);
                  } else {
                     class308 var3 = this.field2278.method6163();
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method2260(this.field2278);
                     var4.setArgs(var3.field3453);
                     class144.method3139().addFirst(var4);
                     this.method4070();
                  }

                  return true;
               case 85:
                  if (this.field2279) {
                     var2.method5837();
                  } else {
                     var2.method5835();
                  }

                  return true;
               case 96:
                  if (this.field2279) {
                     var2.method5848(this.field2280);
                  } else {
                     var2.method5846(this.field2280);
                  }

                  return true;
               case 97:
                  if (this.field2279) {
                     var2.method5948(this.field2280);
                  } else {
                     var2.method5847(this.field2280);
                  }

                  return true;
               case 98:
                  if (this.field2279) {
                     var2.method5861();
                  } else {
                     var2.method5823(this.field2280);
                  }

                  return true;
               case 99:
                  if (this.field2279) {
                     var2.method5859();
                  } else {
                     var2.method5954(this.field2280);
                  }

                  return true;
               case 101:
                  if (this.field2279) {
                     var2.method5869();
                  } else {
                     var2.method5836();
                  }

                  return true;
               case 102:
                  if (this.field2279) {
                     var2.method5897(this.field2280);
                  } else {
                     var2.method5978(this.field2280);
                  }

                  return true;
               case 103:
                  if (this.field2279) {
                     var2.method5845(this.field2280);
                  } else {
                     var2.method6047(this.field2280);
                  }

                  return true;
               case 104:
                  if (this.field2279) {
                     var2.method6012(this.field2280);
                  } else {
                     var2.method5877(this.field2280);
                  }

                  return true;
               case 105:
                  if (this.field2279) {
                     var2.method5855(this.field2280);
                  } else {
                     var2.method5914(this.field2280);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "2"
   )
   public static int method4069(int var0) {
      return class291.field3311[var0];
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-687831939"
   )
   static void method4067() {
      ItemContainer.itemContainers = new NodeHashTable(32);
   }
}
