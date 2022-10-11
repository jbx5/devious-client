import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lcf;"
   )
   @Export("mouseRecorder")
   static MouseRecorder mouseRecorder;
   @ObfuscatedName("ir")
   @Export("regionLandArchives")
   static byte[][] regionLandArchives;
   @ObfuscatedName("a")
   @Export("filterWorlds")
   boolean filterWorlds;

   GrandExchangeOfferOwnWorldComparator() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llp;Llp;I)I",
      garbageValue = "1853766659"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (var2.world == var1.world) {
         return 0;
      } else {
         if (this.filterWorlds) {
            if (Client.worldId == var1.world) {
               return -1;
            }

            if (var2.world == Client.worldId) {
               return 1;
            }
         }

         return var1.world < var2.world ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1144789040"
   )
   static void method1171(int var0) {
      if (var0 != Login.loginIndex) {
         Login.loginIndex = var0;
      }
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "(Lcl;I)V",
      garbageValue = "-2103978067"
   )
   static final void method1177(Actor var0) {
      var0.isWalking = false;
      SequenceDefinition var1;
      int var2;
      if (var0.movementSequence != -1) {
         var1 = WorldMapElement.SequenceDefinition_get(var0.movementSequence);
         if (var1 != null) {
            if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
               ++var0.movementFrameCycle;
               if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
                  var0.movementFrameCycle = 1;
                  ++var0.movementFrame;
                  ArchiveDiskActionHandler.method6292(var1, var0.movementFrame, var0.x, var0.y);
               }

               if (var0.movementFrame >= var1.frameIds.length) {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2227) {
                        ++var0.field1160;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2227 && var0.field1160 >= var1.field2228) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        var0.field1160 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  ArchiveDiskActionHandler.method6292(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else if (var1.isCachedModelIdSet()) {
               ++var0.movementFrame;
               var2 = var1.method3876();
               if (var0.movementFrame < var2) {
                  AbstractSocket.method7484(var1, var0.movementFrame, var0.x, var0.y);
               } else {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2227) {
                        ++var0.field1160;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2227 && var0.field1160 >= var1.field2228) {
                        var0.movementFrame = 0;
                        var0.movementFrameCycle = 0;
                        var0.field1160 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  AbstractSocket.method7484(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else {
               var0.movementSequence = -1;
            }
         } else {
            var0.movementSequence = -1;
         }
      }

      if (var0.spotAnimation != -1 && Client.cycle >= var0.field1186) {
         if (var0.spotAnimationFrame < 0) {
            var0.spotAnimationFrame = 0;
         }

         int var4 = ReflectionCheck.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
         if (var4 != -1) {
            SequenceDefinition var5 = WorldMapElement.SequenceDefinition_get(var4);
            if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) {
               ++var0.spotAnimationFrameCycle;
               if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) {
                  var0.spotAnimationFrameCycle = 1;
                  ++var0.spotAnimationFrame;
                  ArchiveDiskActionHandler.method6292(var5, var0.spotAnimationFrame, var0.x, var0.y);
               }

               if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) {
                  var0.spotAnimation = -1;
               }
            } else if (var5.isCachedModelIdSet()) {
               ++var0.spotAnimationFrame;
               int var3 = var5.method3876();
               if (var0.spotAnimationFrame < var3) {
                  AbstractSocket.method7484(var5, var0.spotAnimationFrame, var0.x, var0.y);
               } else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) {
                  var0.spotAnimation = -1;
               }
            } else {
               var0.spotAnimation = -1;
            }
         } else {
            var0.spotAnimation = -1;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
         var1 = WorldMapElement.SequenceDefinition_get(var0.sequence);
         if (var1.field2221 == 1 && var0.field1211 > 0 && var0.field1192 <= Client.cycle && var0.field1193 < Client.cycle) {
            var0.sequenceDelay = 1;
            return;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay == 0) {
         var1 = WorldMapElement.SequenceDefinition_get(var0.sequence);
         if (var1 != null) {
            if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
               ++var0.sequenceFrameCycle;
               if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
                  var0.sequenceFrameCycle = 1;
                  ++var0.sequenceFrame;
                  ArchiveDiskActionHandler.method6292(var1, var0.sequenceFrame, var0.x, var0.y);
               }

               if (var0.sequenceFrame >= var1.frameIds.length) {
                  var0.sequenceFrame -= var1.frameCount;
                  ++var0.field1210;
                  if (var0.field1210 >= var1.field2228) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
                     ArchiveDiskActionHandler.method6292(var1, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }

               var0.isWalking = var1.field2224;
            } else if (var1.isCachedModelIdSet()) {
               ++var0.sequenceFrame;
               var2 = var1.method3876();
               if (var0.sequenceFrame < var2) {
                  AbstractSocket.method7484(var1, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequenceFrame -= var1.frameCount;
                  ++var0.field1210;
                  if (var0.field1210 >= var1.field2228) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) {
                     AbstractSocket.method7484(var1, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }
            } else {
               var0.sequence = -1;
            }
         } else {
            var0.sequence = -1;
         }
      }

      if (var0.sequenceDelay > 0) {
         --var0.sequenceDelay;
      }

   }
}
