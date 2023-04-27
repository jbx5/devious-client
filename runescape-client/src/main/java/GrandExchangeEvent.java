import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      longValue = 7290179413469624005L
   )
   static long field4287;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -39392873
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -2107275097961185091L
   )
   @Export("age")
   public final long age;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("ac")
   @Export("offerName")
   String offerName;
   @ObfuscatedName("au")
   @Export("previousOfferName")
   String previousOfferName;

   @ObfuscatedSignature(
      descriptor = "(Lsg;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.offerName = var1.readStringCp1252NullTerminated();
      this.previousOfferName = var1.readStringCp1252NullTerminated();
      this.world = var1.readUnsignedShort();
      this.age = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method6869(2);
      this.grandExchangeOffer.method6865(var2);
      this.grandExchangeOffer.unitPrice = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "513475535"
   )
   @Export("getOfferName")
   public String getOfferName() {
      return this.offerName;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-171427168"
   )
   @Export("getPreviousOfferName")
   public String getPreviousOfferName() {
      return this.previousOfferName;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lek;FI)F",
      garbageValue = "-1064924394"
   )
   static float method6858(class125 var0, float var1) {
      if (var0 != null && var0.method3068() != 0) {
         if (var1 < (float)var0.field1511[0].field1452) {
            return var0.field1512 == class123.field1496 ? var0.field1511[0].field1455 : Message.method1204(var0, var1, true);
         } else if (var1 > (float)var0.field1511[var0.method3068() - 1].field1452) {
            return var0.field1528 == class123.field1496 ? var0.field1511[var0.method3068() - 1].field1455 : Message.method1204(var0, var1, false);
         } else if (var0.field1508) {
            return var0.field1511[0].field1455;
         } else {
            class120 var2 = var0.method3067(var1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               float var5;
               float var6;
               float var7;
               if ((double)var2.field1453 == 0.0 && (double)var2.field1450 == 0.0) {
                  var3 = true;
               } else if (Float.MAX_VALUE == var2.field1453 && Float.MAX_VALUE == var2.field1450) {
                  var4 = true;
               } else if (var2.field1454 != null) {
                  if (var0.field1524) {
                     var5 = (float)var2.field1452;
                     float var9 = var2.field1455;
                     var6 = var5 + var2.field1453 * 0.33333334F;
                     float var10 = var9 + var2.field1450 * 0.33333334F;
                     float var8 = (float)var2.field1454.field1452;
                     float var12 = var2.field1454.field1455;
                     var7 = var8 - 0.33333334F * var2.field1454.field1451;
                     float var11 = var12 - 0.33333334F * var2.field1454.field1449;
                     if (var0.field1523) {
                        ParamComposition.method3916(var0, var5, var6, var7, var8, var9, var10, var11, var12);
                     } else if (var0 != null) {
                        var0.field1513 = var5;
                        float var13 = var8 - var5;
                        float var14 = var12 - var9;
                        float var15 = var6 - var5;
                        float var16 = 0.0F;
                        float var17 = 0.0F;
                        if ((double)var15 != 0.0) {
                           var16 = (var10 - var9) / var15;
                        }

                        var15 = var8 - var7;
                        if (0.0 != (double)var15) {
                           var17 = (var12 - var11) / var15;
                        }

                        float var18 = 1.0F / (var13 * var13);
                        float var19 = var13 * var16;
                        float var20 = var17 * var13;
                        var0.field1515 = (var20 + var19 - var14 - var14) * var18 / var13;
                        var0.field1516 = (var14 + var14 + var14 - var19 - var19 - var20) * var18;
                        var0.field1529 = var16;
                        var0.field1518 = var9;
                     }

                     var0.field1524 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field1455;
               } else if (var4) {
                  return var1 != (float)var2.field1452 && var2.field1454 != null ? var2.field1454.field1455 : var2.field1455;
               } else if (var0.field1523) {
                  if (var0 == null) {
                     var5 = 0.0F;
                  } else {
                     if (var1 == var0.field1513) {
                        var6 = 0.0F;
                     } else if (var0.field1521 == var1) {
                        var6 = 1.0F;
                     } else {
                        var6 = (var1 - var0.field1513) / (var0.field1521 - var0.field1513);
                     }

                     if (var0.field1509) {
                        var7 = var6;
                     } else {
                        class121.field1468[3] = var0.field1518;
                        class121.field1468[2] = var0.field1529;
                        class121.field1468[1] = var0.field1516;
                        class121.field1468[0] = var0.field1515 - var6;
                        class121.field1465[0] = 0.0F;
                        class121.field1465[1] = 0.0F;
                        class121.field1465[2] = 0.0F;
                        class121.field1465[3] = 0.0F;
                        class121.field1465[4] = 0.0F;
                        int var21 = class103.method2716(class121.field1468, 3, 0.0F, true, 1.0F, true, class121.field1465);
                        if (var21 == 1) {
                           var7 = class121.field1465[0];
                        } else {
                           var7 = 0.0F;
                        }
                     }

                     var5 = var0.field1519 + (var0.field1520 + (var0.field1522 * var7 + var0.field1517) * var7) * var7;
                  }

                  return var5;
               } else {
                  return class14.method191(var0, var1);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "157863063"
   )
   public static void method6857() {
      HealthBarDefinition.HealthBarDefinition_cached.clear();
      HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
   }
}
