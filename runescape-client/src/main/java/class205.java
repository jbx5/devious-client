import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class205 implements class29 {
   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive20")
   static Archive archive20;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   Widget field2339 = null;
   @ObfuscatedName("an")
   boolean field2334 = false;
   @ObfuscatedName("aw")
   boolean field2336 = false;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1311192309"
   )
   public boolean vmethod4207(int var1) {
      if (this.field2339 == null) {
         return false;
      } else {
         class27 var2 = this.field2339.method6367();
         if (var2 == null) {
            return false;
         } else {
            if (var2.method413(var1)) {
               switch (var1) {
                  case 81:
                     this.field2336 = true;
                     break;
                  case 82:
                     this.field2334 = true;
                     break;
                  default:
                     if (this.method4198(var1)) {
                        class144.invalidateWidget(this.field2339);
                     }
               }
            }

            return var2.method411(var1);
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1312051339"
   )
   public boolean vmethod4217(int var1) {
      switch (var1) {
         case 81:
            this.field2336 = false;
            return false;
         case 82:
            this.field2334 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-2018590760"
   )
   public boolean vmethod4234(char var1) {
      if (this.field2339 == null) {
         return false;
      } else if (!MouseHandler.method714(var1)) {
         return false;
      } else {
         class314 var2 = this.field2339.method6392();
         if (var2 != null && var2.method6143()) {
            class27 var3 = this.field2339.method6367();
            if (var3 == null) {
               return false;
            } else {
               if (var3.method441(var1) && var2.method6104(var1)) {
                  class144.invalidateWidget(this.field2339);
               }

               return var3.method412(var1);
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "-16"
   )
   public boolean vmethod4224(boolean var1) {
      return false;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)V",
      garbageValue = "1563132907"
   )
   public void method4179(Widget var1) {
      this.method4181();
      if (var1 != null) {
         this.field2339 = var1;
         class312 var2 = var1.method6395();
         if (var2 != null) {
            var2.field3502.method6087(true);
            if (var2.field3500 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2256(var1);
               var3.setArgs(var2.field3500);
               GrandExchangeOfferAgeComparator.method6838().addFirst(var3);
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(S)Lmq;",
      garbageValue = "32767"
   )
   public Widget method4202() {
      return this.field2339;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-18"
   )
   public void method4181() {
      if (this.field2339 != null) {
         class312 var1 = this.field2339.method6395();
         Widget var2 = this.field2339;
         this.field2339 = null;
         if (var1 != null) {
            var1.field3502.method6087(false);
            if (var1.field3500 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2256(var2);
               var3.setArgs(var1.field3500);
               GrandExchangeOfferAgeComparator.method6838().addFirst(var3);
            }

         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1039701598"
   )
   boolean method4198(int var1) {
      if (this.field2339 == null) {
         return false;
      } else {
         class314 var2 = this.field2339.method6392();
         if (var2 != null && var2.method6143()) {
            switch (var1) {
               case 13:
                  this.method4181();
                  return true;
               case 48:
                  if (this.field2334) {
                     var2.method6352();
                  }

                  return true;
               case 65:
                  if (this.field2334) {
                     var2.method6273(class143.method3243());
                  }

                  return true;
               case 66:
                  if (this.field2334) {
                     var2.method6128(class143.method3243());
                  }

                  return true;
               case 67:
                  if (this.field2334) {
                     var2.method6130(class143.method3243());
                  }

                  return true;
               case 84:
                  if (var2.method6149() == 0) {
                     var2.method6104(10);
                  } else if (this.field2336 && var2.method6153()) {
                     var2.method6104(10);
                  } else {
                     class312 var3 = this.field2339.method6395();
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method2256(this.field2339);
                     var4.setArgs(var3.field3504);
                     GrandExchangeOfferAgeComparator.method6838().addFirst(var4);
                     this.method4181();
                  }

                  return true;
               case 85:
                  if (this.field2334) {
                     var2.method6290();
                  } else {
                     var2.method6207();
                  }

                  return true;
               case 96:
                  if (this.field2334) {
                     var2.method6351(this.field2336);
                  } else {
                     var2.method6116(this.field2336);
                  }

                  return true;
               case 97:
                  if (this.field2334) {
                     var2.method6119(this.field2336);
                  } else {
                     var2.method6117(this.field2336);
                  }

                  return true;
               case 98:
                  if (this.field2334) {
                     var2.method6274();
                  } else {
                     var2.method6120(this.field2336);
                  }

                  return true;
               case 99:
                  if (this.field2334) {
                     var2.method6278();
                  } else {
                     var2.method6121(this.field2336);
                  }

                  return true;
               case 101:
                  if (this.field2334) {
                     var2.method6342();
                  } else {
                     var2.method6167();
                  }

                  return true;
               case 102:
                  if (this.field2334) {
                     var2.method6114(this.field2336);
                  } else {
                     var2.method6108(this.field2336);
                  }

                  return true;
               case 103:
                  if (this.field2334) {
                     var2.method6222(this.field2336);
                  } else {
                     var2.method6217(this.field2336);
                  }

                  return true;
               case 104:
                  if (this.field2334) {
                     var2.method6124(this.field2336);
                  } else {
                     var2.method6122(this.field2336);
                  }

                  return true;
               case 105:
                  if (this.field2334) {
                     var2.method6110(this.field2336);
                  } else {
                     var2.method6107(this.field2336);
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Ldu;",
      garbageValue = "-739086795"
   )
   static ClientPreferences method4204() {
      AccessFile var0 = null;
      ClientPreferences var1 = new ClientPreferences();

      try {
         var0 = Rasterizer3D.getPreferencesFile("", Client.field490.name, false);
         byte[] var2 = new byte[(int)var0.length()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.read(var2, var3, var2.length - var3);
            if (var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new ClientPreferences(new Buffer(var2));
      } catch (Exception var6) {
      }

      try {
         if (var0 != null) {
            var0.close();
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "2047687466"
   )
   @Export("setLoginResponseString")
   static void setLoginResponseString(String var0, String var1, String var2) {
      Login.Login_response1 = var0;
      Login.Login_response2 = var1;
      Login.Login_response3 = var2;
   }
}
