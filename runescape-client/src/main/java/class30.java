import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class30 {
   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;Lsw;B)Ljava/lang/String;",
      garbageValue = "-85"
   )
   public static String method468(CharSequence var0, LoginType var1) {
      if (var0 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && MouseRecorder.method2266(var0.charAt(var2)); ++var2) {
         }

         while(var3 > var2 && MouseRecorder.method2266(var0.charAt(var3 - 1))) {
            --var3;
         }

         int var4 = var3 - var2;
         if (var4 >= 1 && var4 <= class283.method5686(var1)) {
            StringBuilder var5 = new StringBuilder(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var0.charAt(var6);
               boolean var8;
               if (Character.isISOControl(var7)) {
                  var8 = false;
               } else if (MenuAction.isAlphaNumeric(var7)) {
                  var8 = true;
               } else {
                  char[] var9 = class469.field4917;
                  int var10 = 0;

                  label90:
                  while(true) {
                     char var11;
                     if (var10 >= var9.length) {
                        var9 = class469.field4919;

                        for(var10 = 0; var10 < var9.length; ++var10) {
                           var11 = var9[var10];
                           if (var11 == var7) {
                              var8 = true;
                              break label90;
                           }
                        }

                        var8 = false;
                        break;
                     }

                     var11 = var9[var10];
                     if (var11 == var7) {
                        var8 = true;
                        break;
                     }

                     ++var10;
                  }
               }

               if (var8) {
                  char var12;
                  switch (var7) {
                     case ' ':
                     case '-':
                     case '_':
                     case ' ':
                        var12 = '_';
                        break;
                     case '#':
                     case '[':
                     case ']':
                        var12 = var7;
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
                        var12 = 'a';
                        break;
                     case 'Ç':
                     case 'ç':
                        var12 = 'c';
                        break;
                     case 'È':
                     case 'É':
                     case 'Ê':
                     case 'Ë':
                     case 'è':
                     case 'é':
                     case 'ê':
                     case 'ë':
                        var12 = 'e';
                        break;
                     case 'Í':
                     case 'Î':
                     case 'Ï':
                     case 'í':
                     case 'î':
                     case 'ï':
                        var12 = 'i';
                        break;
                     case 'Ñ':
                     case 'ñ':
                        var12 = 'n';
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
                        var12 = 'o';
                        break;
                     case 'Ù':
                     case 'Ú':
                     case 'Û':
                     case 'Ü':
                     case 'ù':
                     case 'ú':
                     case 'û':
                     case 'ü':
                        var12 = 'u';
                        break;
                     case 'ß':
                        var12 = 'b';
                        break;
                     case 'ÿ':
                     case 'Ÿ':
                        var12 = 'y';
                        break;
                     default:
                        var12 = Character.toLowerCase(var7);
                  }

                  if (var12 != 0) {
                     var5.append(var12);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)J",
      garbageValue = "2061308557"
   )
   public static long method465(int var0) {
      return ViewportMouse.ViewportMouse_entityTags[var0];
   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      descriptor = "(Lsq;I)V",
      garbageValue = "900654741"
   )
   static final void method467(PacketBuffer var0) {
      var0.importIndex();
      int var1 = var0.readBits(8);
      int var2;
      if (var1 < Client.npcCount) {
         for(var2 = var1; var2 < Client.npcCount; ++var2) {
            Client.field617[++Client.field616 - 1] = Client.npcIndices[var2];
         }
      }

      if (var1 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         for(var2 = 0; var2 < var1; ++var2) {
            int var3 = Client.npcIndices[var2];
            NPC var4 = Client.npcs[var3];
            int var5 = var0.readBits(1);
            if (var5 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = var3;
               var4.npcCycle = Client.cycle;
            } else {
               int var6 = var0.readBits(2);
               if (var6 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = var3;
                  var4.npcCycle = Client.cycle;
                  Client.field549[++Client.field548 - 1] = var3;
               } else {
                  int var7;
                  int var8;
                  if (var6 == 1) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     var7 = var0.readBits(3);
                     var4.method2562(var7, class210.field2389);
                     var8 = var0.readBits(1);
                     if (var8 == 1) {
                        Client.field549[++Client.field548 - 1] = var3;
                     }
                  } else if (var6 == 2) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     if (var0.readBits(1) == 1) {
                        var7 = var0.readBits(3);
                        var4.method2562(var7, class210.field2387);
                        var8 = var0.readBits(3);
                        var4.method2562(var8, class210.field2387);
                     } else {
                        var7 = var0.readBits(3);
                        var4.method2562(var7, class210.field2388);
                     }

                     var7 = var0.readBits(1);
                     if (var7 == 1) {
                        Client.field549[++Client.field548 - 1] = var3;
                     }
                  } else if (var6 == 3) {
                     Client.field617[++Client.field616 - 1] = var3;
                  }
               }
            }
         }

      }
   }
}
