import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ay")
class class13 extends DefaultTlsClient {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Las;)V"
   )
   class13(class12 var1) {
      this.this$1 = var1;
   }

   public Hashtable getClientExtensions() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (var1 == null) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   public TlsAuthentication getAuthentication() throws IOException {
      return new class11(this);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lhz;",
      garbageValue = "371230407"
   )
   public static FloorOverlayDefinition method160(int var0) {
      FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
         var1 = new FloorOverlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "28"
   )
   static boolean method162(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1466811282"
   )
   static int method161() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
            var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
         }

         return var0 * 10000 / Client.field715;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "(Ldq;B)V",
      garbageValue = "25"
   )
   static final void method154(Actor var0) {
      var0.isWalking = false;
      SequenceDefinition var1;
      int var2;
      if (var0.movementSequence != -1) {
         var1 = Coord.SequenceDefinition_get(var0.movementSequence);
         if (var1 != null) {
            if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
               ++var0.movementFrameCycle;
               if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
                  var0.movementFrameCycle = 1;
                  ++var0.movementFrame;
                  class10.method91(var1, var0.movementFrame, var0.x, var0.y);
               }

               if (var0.movementFrame >= var1.frameIds.length) {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2272) {
                        ++var0.field1181;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2272 && var0.field1181 >= var1.field2261) {
                        var0.movementFrameCycle = 0;
                        var0.movementFrame = 0;
                        var0.field1181 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  class10.method91(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else if (var1.isCachedModelIdSet()) {
               ++var0.movementFrame;
               var2 = var1.method4015();
               if (var0.movementFrame < var2) {
                  GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.movementFrame, var0.x, var0.y);
               } else {
                  if (var1.frameCount > 0) {
                     var0.movementFrame -= var1.frameCount;
                     if (var1.field2272) {
                        ++var0.field1181;
                     }

                     if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2272 && var0.field1181 >= var1.field2261) {
                        var0.movementFrame = 0;
                        var0.movementFrameCycle = 0;
                        var0.field1181 = 0;
                     }
                  } else {
                     var0.movementFrameCycle = 0;
                     var0.movementFrame = 0;
                  }

                  GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.movementFrame, var0.x, var0.y);
               }
            } else {
               var0.movementSequence = -1;
            }
         } else {
            var0.movementSequence = -1;
         }
      }

      if (var0.spotAnimation != -1 && Client.cycle >= var0.field1190) {
         if (var0.spotAnimationFrame < 0) {
            var0.spotAnimationFrame = 0;
         }

         int var4 = DevicePcmPlayerProvider.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
         if (var4 != -1) {
            SequenceDefinition var5 = Coord.SequenceDefinition_get(var4);
            if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) {
               ++var0.spotAnimationFrameCycle;
               if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) {
                  var0.spotAnimationFrameCycle = 1;
                  ++var0.spotAnimationFrame;
                  class10.method91(var5, var0.spotAnimationFrame, var0.x, var0.y);
               }

               if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) {
                  var0.spotAnimation = -1;
               }
            } else if (var5.isCachedModelIdSet()) {
               ++var0.spotAnimationFrame;
               int var3 = var5.method4015();
               if (var0.spotAnimationFrame < var3) {
                  GrandExchangeOfferOwnWorldComparator.method1216(var5, var0.spotAnimationFrame, var0.x, var0.y);
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
         var1 = Coord.SequenceDefinition_get(var0.sequence);
         if (var1.field2277 == 1 && var0.field1215 > 0 && var0.field1196 <= Client.cycle && var0.field1197 < Client.cycle) {
            var0.sequenceDelay = 1;
            return;
         }
      }

      if (var0.sequence != -1 && var0.sequenceDelay == 0) {
         var1 = Coord.SequenceDefinition_get(var0.sequence);
         if (var1 != null) {
            if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
               ++var0.sequenceFrameCycle;
               if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
                  var0.sequenceFrameCycle = 1;
                  ++var0.sequenceFrame;
                  class10.method91(var1, var0.sequenceFrame, var0.x, var0.y);
               }

               if (var0.sequenceFrame >= var1.frameIds.length) {
                  var0.sequenceFrame -= var1.frameCount;
                  ++var0.field1186;
                  if (var0.field1186 >= var1.field2261) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
                     class10.method91(var1, var0.sequenceFrame, var0.x, var0.y);
                  } else {
                     var0.sequence = -1;
                  }
               }

               var0.isWalking = var1.field2268;
            } else if (var1.isCachedModelIdSet()) {
               ++var0.sequenceFrame;
               var2 = var1.method4015();
               if (var0.sequenceFrame < var2) {
                  GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.sequenceFrame, var0.x, var0.y);
               } else {
                  var0.sequenceFrame -= var1.frameCount;
                  ++var0.field1186;
                  if (var0.field1186 >= var1.field2261) {
                     var0.sequence = -1;
                  } else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) {
                     GrandExchangeOfferOwnWorldComparator.method1216(var1, var0.sequenceFrame, var0.x, var0.y);
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
