import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class7 {
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -1894298815
   )
   static int field27;
   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("textureProvider")
   static TextureProvider textureProvider;
   @ObfuscatedName("af")
   ExecutorService field30 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("an")
   Future field28;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   final Buffer field24;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   final class3 field26;

   @ObfuscatedSignature(
      descriptor = "(Lsg;Lac;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field24 = var1;
      this.field26 = var2;
      this.method51();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-571674084"
   )
   public boolean method58() {
      return this.field28.isDone();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "47"
   )
   public void method49() {
      this.field30.shutdown();
      this.field30 = null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Lsg;",
      garbageValue = "1213555586"
   )
   public Buffer method50() {
      try {
         return (Buffer)this.field28.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "32199"
   )
   void method51() {
      this.field28 = this.field30.submit(new class1(this, this.field24, this.field26));
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(DIII)V",
      garbageValue = "-1907908914"
   )
   @Export("Rasterizer3D_buildPalette")
   static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0 + 0.0078125;
         double var8 = 0.0625 + (double)(var5 & 7) / 8.0;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var8 + var11 - var8 * var11;
               }

               double var21 = var11 * 2.0 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  ++var27;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var19 - var21) + var21;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (var23 * 3.0 < 2.0) {
                  var13 = var21 + 6.0 * (0.6666666666666666 - var23) * (var19 - var21);
               } else {
                  var13 = var21;
               }

               if (var6 * 6.0 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (var6 * 2.0 < 1.0) {
                  var15 = var19;
               } else if (var6 * 3.0 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var27 * (var19 - var21) * 6.0 + var21;
               } else if (var27 * 2.0 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = 6.0 * (var19 - var21) * (0.6666666666666666 - var27) + var21;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(256.0 * var13);
            int var20 = (int)(256.0 * var15);
            int var30 = (int)(256.0 * var17);
            int var22 = var30 + (var20 << 8) + (var29 << 16);
            var22 = UrlRequest.Rasterizer3D_brighten(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            Rasterizer3D.Rasterizer3D_colorPalette[var4++] = var22;
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I[B[BI)V",
      garbageValue = "1887295232"
   )
   @Export("Widget_setKey")
   static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field3645 == null) {
         if (var2 == null) {
            return;
         }

         var0.field3645 = new byte[11][];
         var0.field3646 = new byte[11][];
         var0.field3627 = new int[11];
         var0.field3670 = new int[11];
      }

      var0.field3645[var1] = var2;
      if (var2 != null) {
         var0.field3581 = true;
      } else {
         var0.field3581 = false;

         for(int var4 = 0; var4 < var0.field3645.length; ++var4) {
            if (var0.field3645[var4] != null) {
               var0.field3581 = true;
               break;
            }
         }
      }

      var0.field3646[var1] = var3;
   }

   @ObfuscatedName("md")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2026496728"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      ClientPacket.method5688();
      class18.method283();
      int var1 = GraphicsDefaults.VarpDefinition_get(var0).type;
      if (var1 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               ScriptFrame.method1164(0.9);
            }

            if (var2 == 2) {
               ScriptFrame.method1164(0.8);
            }

            if (var2 == 3) {
               ScriptFrame.method1164(0.7);
            }

            if (var2 == 4) {
               ScriptFrame.method1164(0.6);
            }
         }

         if (var1 == 3) {
            if (var2 == 0) {
               class86.method2286(255);
            }

            if (var2 == 1) {
               class86.method2286(192);
            }

            if (var2 == 2) {
               class86.method2286(128);
            }

            if (var2 == 3) {
               class86.method2286(64);
            }

            if (var2 == 4) {
               class86.method2286(0);
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               class130.method3125(127);
            }

            if (var2 == 1) {
               class130.method3125(96);
            }

            if (var2 == 2) {
               class130.method3125(64);
            }

            if (var2 == 3) {
               class130.method3125(32);
            }

            if (var2 == 4) {
               class130.method3125(0);
            }
         }

         if (var1 == 5) {
            Client.leftClickOpensMenu = var2 == 1;
         }

         if (var1 == 6) {
            Client.chatEffects = var2;
         }

         if (var1 == 9) {
         }

         if (var1 == 10) {
            if (var2 == 0) {
               class135.method3182(127);
            }

            if (var2 == 1) {
               class135.method3182(96);
            }

            if (var2 == 2) {
               class135.method3182(64);
            }

            if (var2 == 3) {
               class135.method3182(32);
            }

            if (var2 == 4) {
               class135.method3182(0);
            }
         }

         if (var1 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         if (var1 == 18) {
            Client.playerAttackOption = (AttackOption)StructComposition.findEnumerated(UserComparator4.method2885(), var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var1 == 22) {
            Client.npcAttackOption = (AttackOption)StructComposition.findEnumerated(UserComparator4.method2885(), var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
