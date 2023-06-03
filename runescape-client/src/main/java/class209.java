import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class209 implements class29 {
   @ObfuscatedName("ur")
   @ObfuscatedGetter(
      intValue = -369722901
   )
   static int field2322;
   @ObfuscatedName("ad")
   public static short[][] field2326;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   Widget field2325 = null;
   @ObfuscatedName("an")
   boolean field2323 = false;
   @ObfuscatedName("av")
   boolean field2324 = false;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2106714627"
   )
   public boolean vmethod4127(int var1) {
      if (this.field2325 == null) {
         return false;
      } else {
         class27 var2 = this.field2325.method6382();
         if (var2 == null) {
            return false;
         } else {
            if (var2.method388(var1)) {
               switch (var1) {
                  case 81:
                     this.field2324 = true;
                     break;
                  case 82:
                     this.field2323 = true;
                     break;
                  default:
                     if (this.method4123(var1)) {
                        Messages.invalidateWidget(this.field2325);
                     }
               }
            }

            return var2.method386(var1);
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "100"
   )
   public boolean vmethod4128(int var1) {
      switch (var1) {
         case 81:
            this.field2324 = false;
            return false;
         case 82:
            this.field2323 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "4"
   )
   public boolean vmethod4145(char var1) {
      if (this.field2325 == null) {
         return false;
      } else {
         boolean var2;
         if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
            var2 = true;
         } else {
            label94: {
               if (var1 != 0) {
                  char[] var3 = class382.cp1252AsciiExtension;

                  for(int var4 = 0; var4 < var3.length; ++var4) {
                     char var5 = var3[var4];
                     if (var5 == var1) {
                        var2 = true;
                        break label94;
                     }
                  }
               }

               var2 = false;
            }
         }

         if (!var2) {
            return false;
         } else {
            class327 var7 = this.field2325.method6380();
            if (var7 != null && var7.method6238()) {
               class27 var6 = this.field2325.method6382();
               if (var6 == null) {
                  return false;
               } else {
                  if (var6.method389(var1) && var7.method6254(var1)) {
                     Messages.invalidateWidget(this.field2325);
                  }

                  return var6.method387(var1);
               }
            } else {
               return false;
            }
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "839410380"
   )
   public boolean vmethod4131(boolean var1) {
      return false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lmb;B)V",
      garbageValue = "54"
   )
   public void method4120(Widget var1) {
      this.method4102();
      if (var1 != null) {
         this.field2325 = var1;
         class325 var2 = var1.method6383();
         if (var2 != null) {
            var2.field3529.method6056(true);
            if (var2.field3532 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2247(var1);
               var3.setArgs(var2.field3532);
               Message.method1177().addFirst(var3);
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Lmb;",
      garbageValue = "-1539536755"
   )
   public Widget method4099() {
      return this.field2325;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   public void method4102() {
      if (this.field2325 != null) {
         class325 var1 = this.field2325.method6383();
         Widget var2 = this.field2325;
         this.field2325 = null;
         if (var1 != null) {
            var1.field3529.method6056(false);
            if (var1.field3532 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method2247(var2);
               var3.setArgs(var1.field3532);
               Message.method1177().addFirst(var3);
            }

         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IS)Z",
      garbageValue = "27176"
   )
   boolean method4123(int var1) {
      if (this.field2325 == null) {
         return false;
      } else {
         class327 var2 = this.field2325.method6380();
         if (var2 != null && var2.method6238()) {
            switch (var1) {
               case 13:
                  this.method4102();
                  return true;
               case 48:
                  if (this.field2323) {
                     var2.method6079();
                  }

                  return true;
               case 65:
                  if (this.field2323) {
                     var2.method6098(KeyHandler.method375());
                  }

                  return true;
               case 66:
                  if (this.field2323) {
                     var2.method6097(KeyHandler.method375());
                  }

                  return true;
               case 67:
                  if (this.field2323) {
                     var2.method6184(KeyHandler.method375());
                  }

                  return true;
               case 84:
                  if (var2.method6118() == 0) {
                     var2.method6254(10);
                  } else if (this.field2324 && var2.method6122()) {
                     var2.method6254(10);
                  } else {
                     class325 var3 = this.field2325.method6383();
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method2247(this.field2325);
                     var4.setArgs(var3.field3534);
                     Message.method1177().addFirst(var4);
                     this.method4102();
                  }

                  return true;
               case 85:
                  if (this.field2323) {
                     var2.method6076();
                  } else {
                     var2.method6273();
                  }

                  return true;
               case 96:
                  if (this.field2323) {
                     var2.method6087(this.field2324);
                  } else {
                     var2.method6266(this.field2324);
                  }

                  return true;
               case 97:
                  if (this.field2323) {
                     var2.method6095(this.field2324);
                  } else {
                     var2.method6294(this.field2324);
                  }

                  return true;
               case 98:
                  if (this.field2323) {
                     var2.method6100();
                  } else {
                     var2.method6089(this.field2324);
                  }

                  return true;
               case 99:
                  if (this.field2323) {
                     var2.method6264();
                  } else {
                     var2.method6246(this.field2324);
                  }

                  return true;
               case 101:
                  if (this.field2323) {
                     var2.method6248();
                  } else {
                     var2.method6075();
                  }

                  return true;
               case 102:
                  if (this.field2323) {
                     var2.method6083(this.field2324);
                  } else {
                     var2.method6331(this.field2324);
                  }

                  return true;
               case 103:
                  if (this.field2323) {
                     var2.method6084(this.field2324);
                  } else {
                     var2.method6216(this.field2324);
                  }

                  return true;
               case 104:
                  if (this.field2323) {
                     var2.method6093(this.field2324);
                  } else {
                     var2.method6091(this.field2324);
                  }

                  return true;
               case 105:
                  if (this.field2323) {
                     var2.method6241(this.field2324);
                  } else {
                     var2.method6092(this.field2324);
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1317822886"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-112"
   )
   static final void method4117(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class10.clientPreferences.method2488()) {
         if (class10.clientPreferences.method2488() == 0 && Client.currentTrackGroupId != -1) {
            class368.method6892(ReflectionCheck.archive6, Client.currentTrackGroupId, 0, var0, false);
            Client.playingJingle = false;
         } else if (var0 == 0) {
            class304.midiPcmStream.clear();
            class304.musicPlayerStatus = 1;
            UserComparator9.musicTrackArchive = null;
            Client.playingJingle = false;
         } else if (class304.musicPlayerStatus != 0) {
            class304.musicTrackVolume = var0;
         } else {
            class304.midiPcmStream.setPcmStreamVolume(var0);
         }

         class10.clientPreferences.method2519(var0);
      }

   }
}
