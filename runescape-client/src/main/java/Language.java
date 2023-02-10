import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("Language")
public class Language implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_EN")
   public static final Language Language_EN;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_DE")
   static final Language Language_DE;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_FR")
   public static final Language Language_FR;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_PT")
   static final Language Language_PT;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_NL")
   static final Language Language_NL;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_ES")
   public static final Language Language_ES;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("Language_ES_MX")
   static final Language Language_ES_MX;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "[Lmn;"
   )
   @Export("Language_valuesOrdered")
   public static final Language[] Language_valuesOrdered;
   @ObfuscatedName("n")
   final String field4314;
   @ObfuscatedName("l")
   @Export("language")
   final String language;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 974377725
   )
   @Export("id")
   final int id;

   static {
      Language_EN = new Language("EN", "en", "English", ModeWhere.field4334, 0, "GB");
      Language_DE = new Language("DE", "de", "German", ModeWhere.field4334, 1, "DE");
      Language_FR = new Language("FR", "fr", "French", ModeWhere.field4334, 2, "FR");
      Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4334, 3, "BR");
      Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4328, 4, "NL");
      Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4328, 5, "ES");
      Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4334, 6, "MX");
      Language[] var0 = new Language[]{Language_ES, Language_DE, Language_EN, Language_ES_MX, Language_FR, Language_PT, Language_NL};
      Language_valuesOrdered = new Language[var0.length];
      Language[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Language var4 = var2[var3];
         if (Language_valuesOrdered[var4.id] != null) {
            throw new IllegalStateException();
         }

         Language_valuesOrdered[var4.id] = var4;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm;ILjava/lang/String;)V"
   )
   Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
      this.field4314 = var1;
      this.language = var2;
      this.id = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "275896102"
   )
   @Export("getLanguage")
   String getLanguage() {
      return this.language;
   }

   public String toString() {
      return this.getLanguage().toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "-2115703573"
   )
   public static void method6776(Buffer var0, int var1) {
      if (JagexCache.JagexCache_randomDat != null) {
         try {
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
         } catch (Exception var3) {
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1124742409"
   )
   static boolean method6781() {
      Date var0;
      try {
         var0 = class376.method7323();
      } catch (ParseException var4) {
         HealthBarUpdate.method2442("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
         return false;
      }

      if (var0 == null) {
         return false;
      } else {
         boolean var3 = class86.method2341(var0);
         boolean var2 = ArchiveDiskAction.method6455(var0);
         if (!var2) {
            HealthBarUpdate.method2442("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
         } else {
            if (!var3) {
               MusicPatchNode2.field3356 = 8388607;
            } else {
               MusicPatchNode2.field3356 = (int)(var0.getTime() / 86400000L - 11745L);
            }

            return true;
         }
      }
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-319090450"
   )
   static final void method6782() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints == -1) {
            var0.delay = 0;
            class204.method4131(var0);
         } else {
            var0.remove();
         }
      }

   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1722162852"
   )
   static final void method6779(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field725[var4] = true;
         }
      }

   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "(Lkz;II)I",
      garbageValue = "-1163445958"
   )
   static final int method6780(Widget var0, int var1) {
      if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
         try {
            int[] var2 = var0.cs1Instructions[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if (var6 == 0) {
                  return var3;
               }

               if (var6 == 1) {
                  var7 = Client.currentLevels[var2[var4++]];
               }

               if (var6 == 2) {
                  var7 = Client.levels[var2[var4++]];
               }

               if (var6 == 3) {
                  var7 = Client.experience[var2[var4++]];
               }

               int var9;
               Widget var10;
               int var11;
               int var12;
               if (var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class133.getWidget(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!TileItem.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; ++var12) {
                        if (var11 + 1 == var10.itemIds[var12]) {
                           var7 += var10.itemQuantities[var12];
                        }
                     }
                  }
               }

               if (var6 == 5) {
                  var7 = Varps.Varps_main[var2[var4++]];
               }

               if (var6 == 6) {
                  var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
               }

               if (var6 == 7) {
                  var7 = Varps.Varps_main[var2[var4++]] * 100 / '뜛';
               }

               if (var6 == 8) {
                  var7 = class387.localPlayer.combatLevel;
               }

               if (var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if (Skills.Skills_enabled[var9]) {
                        var7 += Client.levels[var9];
                     }
                  }
               }

               if (var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class133.getWidget(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!TileItem.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; ++var12) {
                        if (var11 + 1 == var10.itemIds[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var6 == 11) {
                  var7 = Client.runEnergy;
               }

               if (var6 == 12) {
                  var7 = Client.weight;
               }

               if (var6 == 13) {
                  var9 = Varps.Varps_main[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
               }

               if (var6 == 14) {
                  var9 = var2[var4++];
                  var7 = SecureRandomFuture.getVarbit(var9);
               }

               if (var6 == 15) {
                  var8 = 1;
               }

               if (var6 == 16) {
                  var8 = 2;
               }

               if (var6 == 17) {
                  var8 = 3;
               }

               if (var6 == 18) {
                  var7 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7);
               }

               if (var6 == 19) {
                  var7 = Client.baseY * 64 + (class387.localPlayer.y >> 7);
               }

               if (var6 == 20) {
                  var7 = var2[var4++];
               }

               if (var8 == 0) {
                  if (var5 == 0) {
                     var3 += var7;
                  }

                  if (var5 == 1) {
                     var3 -= var7;
                  }

                  if (var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if (var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-97"
   )
   @Export("getTapToDrop")
   static boolean getTapToDrop() {
      return Client.tapToDrop;
   }
}
