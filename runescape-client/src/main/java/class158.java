import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class158 extends class151 {
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = -624288385
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("a")
   String field1751;
   @ObfuscatedName("f")
   byte field1749;
   @ObfuscatedName("c")
   byte field1752;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class152 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class158(class152 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "85"
   )
   void vmethod3238(Buffer var1) {
      this.field1751 = var1.readStringCp1252NullTerminatedOrNull();
      if (this.field1751 != null) {
         var1.readUnsignedByte();
         this.field1749 = var1.readByte();
         this.field1752 = var1.readByte();
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)V",
      garbageValue = "-1303116736"
   )
   void vmethod3239(ClanChannel var1) {
      var1.name = this.field1751;
      if (this.field1751 != null) {
         var1.field1725 = this.field1749;
         var1.field1731 = this.field1752;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgx;",
      garbageValue = "2"
   )
   public static HitSplatDefinition method3241(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Llx;IIIBZI)V",
      garbageValue = "1712140055"
   )
   @Export("requestNetFile")
   static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
      if (var8 == null) {
         var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
         if (var8 == null) {
            var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
            if (var8 != null) {
               if (var5) {
                  var8.removeDual();
                  NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
                  --NetCache.NetCache_pendingWritesCount;
                  ++NetCache.NetCache_pendingPriorityWritesCount;
               }

            } else {
               if (!var5) {
                  var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
                  if (var8 != null) {
                     return;
                  }
               }

               var8 = new NetFileRequest();
               var8.archive = var0;
               var8.crc = var3;
               var8.padding = var4;
               if (var5) {
                  NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
                  ++NetCache.NetCache_pendingPriorityWritesCount;
               } else {
                  NetCache.NetCache_pendingWritesQueue.addFirst(var8);
                  NetCache.NetCache_pendingWrites.put(var8, var6);
                  ++NetCache.NetCache_pendingWritesCount;
               }

            }
         }
      }
   }
}
