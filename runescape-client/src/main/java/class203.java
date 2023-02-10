import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class203 implements class29 {
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 950994657
   )
   @Export("pcmSampleLength")
   public static int pcmSampleLength;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   Widget field2314 = null;
   @ObfuscatedName("w")
   boolean field2311 = false;
   @ObfuscatedName("v")
   boolean field2312 = false;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "110"
   )
   public boolean vmethod4135(int var1) {
      if (this.field2314 == null) {
         return false;
      } else {
         class27 var2 = this.field2314.method6227();
         if (var2 == null) {
            return false;
         } else {
            if (var2.method411(var1)) {
               switch (var1) {
                  case 81:
                     this.field2312 = true;
                     break;
                  case 82:
                     this.field2311 = true;
                     break;
                  default:
                     if (this.method4102(var1)) {
                        LoginScreenAnimation.invalidateWidget(this.field2314);
                     }
               }
            }

            return var2.method416(var1);
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "11"
   )
   public boolean vmethod4136(int var1) {
      switch (var1) {
         case 81:
            this.field2312 = false;
            return false;
         case 82:
            this.field2311 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "783044550"
   )
   public boolean vmethod4179(char var1) {
      if (this.field2314 == null) {
         return false;
      } else if (!MusicPatch.method5789(var1)) {
         return false;
      } else {
         class307 var2 = this.field2314.method6235();
         if (var2 != null && var2.method5979()) {
            class27 var3 = this.field2314.method6227();
            if (var3 == null) {
               return false;
            } else {
               if (var3.method398(var1) && var2.method5940(var1)) {
                  LoginScreenAnimation.invalidateWidget(this.field2314);
               }

               return var3.method396(var1);
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "653857297"
   )
   public boolean vmethod4139(boolean var1) {
      return false;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lkz;B)V",
      garbageValue = "15"
   )
   public void method4096(Widget var1) {
      this.method4097();
      if (var1 != null) {
         this.field2314 = var1;
         class305 var2 = var1.method6228();
         if (var2 != null) {
            var2.field3476.method6057(true);
            if (var2.field3480 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2313(var1);
               var3.setArgs(var2.field3480);
               class12.method171().addFirst(var3);
            }
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(S)Lkz;",
      garbageValue = "-11104"
   )
   public Widget method4109() {
      return this.field2314;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1261439160"
   )
   public void method4097() {
      if (this.field2314 != null) {
         class305 var1 = this.field2314.method6228();
         Widget var2 = this.field2314;
         this.field2314 = null;
         if (var1 != null) {
            var1.field3476.method6057(false);
            if (var1.field3480 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2313(var2);
               var3.setArgs(var1.field3480);
               class12.method171().addFirst(var3);
            }

         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "577677539"
   )
   boolean method4102(int var1) {
      if (this.field2314 == null) {
         return false;
      } else {
         class307 var2 = this.field2314.method6235();
         if (var2 != null && var2.method5979()) {
            switch (var1) {
               case 13:
                  this.method4097();
                  return true;
               case 48:
                  if (this.field2311) {
                     var2.method5991();
                  }

                  return true;
               case 65:
                  if (this.field2311) {
                     var2.method5965(class12.method170());
                  }

                  return true;
               case 66:
                  if (this.field2311) {
                     var2.method5964(class12.method170());
                  }

                  return true;
               case 67:
                  if (this.field2311) {
                     var2.method6043(class12.method170());
                  }

                  return true;
               case 84:
                  if (var2.method5948() == 0) {
                     var2.method5940(10);
                  } else if (this.field2312 && var2.method5988()) {
                     var2.method5940(10);
                  } else {
                     class305 var3 = this.field2314.method6228();
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method2313(this.field2314);
                     var4.setArgs(var3.field3482);
                     class12.method171().addFirst(var4);
                     this.method4097();
                  }

                  return true;
               case 85:
                  if (this.field2311) {
                     var2.method5943();
                  } else {
                     var2.method5941();
                  }

                  return true;
               case 96:
                  if (this.field2311) {
                     var2.method6163(this.field2312);
                  } else {
                     var2.method6037(this.field2312);
                  }

                  return true;
               case 97:
                  if (this.field2311) {
                     var2.method5955(this.field2312);
                  } else {
                     var2.method5953(this.field2312);
                  }

                  return true;
               case 98:
                  if (this.field2311) {
                     var2.method5967();
                  } else {
                     var2.method5956(this.field2312);
                  }

                  return true;
               case 99:
                  if (this.field2311) {
                     var2.method5968();
                  } else {
                     var2.method5957(this.field2312);
                  }

                  return true;
               case 101:
                  if (this.field2311) {
                     var2.method5944();
                  } else {
                     var2.method6124();
                  }

                  return true;
               case 102:
                  if (this.field2311) {
                     var2.method6132(this.field2312);
                  } else {
                     var2.method5923(this.field2312);
                  }

                  return true;
               case 103:
                  if (this.field2311) {
                     var2.method6160(this.field2312);
                  } else {
                     var2.method6060(this.field2312);
                  }

                  return true;
               case 104:
                  if (this.field2311) {
                     var2.method5960(this.field2312);
                  } else {
                     var2.method5958(this.field2312);
                  }

                  return true;
               case 105:
                  if (this.field2311) {
                     var2.method5961(this.field2312);
                  } else {
                     var2.method5959(this.field2312);
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-56"
   )
   static boolean method4129(int var0) {
      return (var0 & 128) != 0;
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-175438217"
   )
   static final void method4128(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      PacketWriter.clientPreferences.updateSoundEffectVolume(var0);
   }
}
