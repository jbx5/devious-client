import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
   @ObfuscatedName("uk")
   @ObfuscatedGetter(
      intValue = 906986471
   )
   static int field2963;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 887635381
   )
   @Export("width")
   int width;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1760410641
   )
   @Export("height")
   int height;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2069261645
   )
   @Export("x")
   int x;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -165337537
   )
   @Export("y")
   int y;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   final WorldMapRenderer this$0;

   @ObfuscatedSignature(
      descriptor = "(Ljt;)V"
   )
   WorldMapRectangle(WorldMapRenderer var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsq;I)V",
      garbageValue = "295942057"
   )
   static final void method5219(PacketBuffer var0) {
      int var1 = 0;
      var0.importIndex();

      byte[] var10000;
      int var2;
      int var4;
      int var5;
      for(var2 = 0; var2 < Players.Players_count; ++var2) {
         var5 = Players.Players_indices[var2];
         if ((Players.field1336[var5] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               var10000 = Players.field1336;
               var10000[var5] = (byte)(var10000[var5] | 2);
            } else {
               var4 = var0.readBits(1);
               if (var4 == 0) {
                  var1 = Fonts.method8249(var0);
                  var10000 = Players.field1336;
                  var10000[var5] = (byte)(var10000[var5] | 2);
               } else {
                  AttackOption.readPlayerUpdate(var0, var5);
               }
            }
         }
      }

      var0.exportIndex();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.importIndex();

         for(var2 = 0; var2 < Players.Players_count; ++var2) {
            var5 = Players.Players_indices[var2];
            if ((Players.field1336[var5] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  var10000 = Players.field1336;
                  var10000[var5] = (byte)(var10000[var5] | 2);
               } else {
                  var4 = var0.readBits(1);
                  if (var4 == 0) {
                     var1 = Fonts.method8249(var0);
                     var10000 = Players.field1336;
                     var10000[var5] = (byte)(var10000[var5] | 2);
                  } else {
                     AttackOption.readPlayerUpdate(var0, var5);
                  }
               }
            }
         }

         var0.exportIndex();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.importIndex();

            for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
               var5 = Players.Players_emptyIndices[var2];
               if ((Players.field1336[var5] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     var10000 = Players.field1336;
                     var10000[var5] = (byte)(var10000[var5] | 2);
                  } else {
                     var4 = var0.readBits(1);
                     if (var4 == 0) {
                        var1 = Fonts.method8249(var0);
                        var10000 = Players.field1336;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     } else if (class157.updateExternalPlayer(var0, var5)) {
                        var10000 = Players.field1336;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     }
                  }
               }
            }

            var0.exportIndex();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.importIndex();

               for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
                  var5 = Players.Players_emptyIndices[var2];
                  if ((Players.field1336[var5] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        var10000 = Players.field1336;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     } else {
                        var4 = var0.readBits(1);
                        if (var4 == 0) {
                           var1 = Fonts.method8249(var0);
                           var10000 = Players.field1336;
                           var10000[var5] = (byte)(var10000[var5] | 2);
                        } else if (class157.updateExternalPlayer(var0, var5)) {
                           var10000 = Players.field1336;
                           var10000[var5] = (byte)(var10000[var5] | 2);
                        }
                     }
                  }
               }

               var0.exportIndex();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  Players.Players_count = 0;
                  Players.Players_emptyIdxCount = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     var10000 = Players.field1336;
                     var10000[var2] = (byte)(var10000[var2] >> 1);
                     Player var3 = Client.players[var2];
                     if (var3 != null) {
                        Players.Players_indices[++Players.Players_count - 1] = var2;
                     } else {
                        Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }
}
