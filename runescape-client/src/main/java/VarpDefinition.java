import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("VarpDefinition_archive")
   public static AbstractArchive VarpDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1806135951
   )
   public static int field1922;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("VarpDefinition_cached")
   static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive14")
   static Archive archive14;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -609772131
   )
   @Export("type")
   public int type = 0;

   VarpDefinition() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "0"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "1920154303"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lgn;",
      garbageValue = "325063701"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
         var1 = new ObjectComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lln;IIIBZB)V",
      garbageValue = "-66"
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-1710620347"
   )
   @Export("SpriteBuffer_decode")
   public static void SpriteBuffer_decode(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class481.SpriteBuffer_spriteCount = var1.readUnsignedShort();
      class481.SpriteBuffer_xOffsets = new int[class481.SpriteBuffer_spriteCount];
      class414.SpriteBuffer_yOffsets = new int[class481.SpriteBuffer_spriteCount];
      class11.SpriteBuffer_spriteWidths = new int[class481.SpriteBuffer_spriteCount];
      StructComposition.SpriteBuffer_spriteHeights = new int[class481.SpriteBuffer_spriteCount];
      FloorDecoration.SpriteBuffer_pixels = new byte[class481.SpriteBuffer_spriteCount][];
      var1.offset = var0.length - 7 - class481.SpriteBuffer_spriteCount * 8;
      GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
      class481.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) {
         class481.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) {
         class414.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) {
         class11.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) {
         StructComposition.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class481.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
      WorldMapEvent.SpriteBuffer_spritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         WorldMapEvent.SpriteBuffer_spritePalette[var3] = var1.readMedium();
         if (WorldMapEvent.SpriteBuffer_spritePalette[var3] == 0) {
            WorldMapEvent.SpriteBuffer_spritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class481.SpriteBuffer_spriteCount; ++var3) {
         int var4 = class11.SpriteBuffer_spriteWidths[var3];
         int var5 = StructComposition.SpriteBuffer_spriteHeights[var3];
         int var6 = var5 * var4;
         byte[] var7 = new byte[var6];
         FloorDecoration.SpriteBuffer_pixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if (var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if (var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.readByte();
               }
            }
         }
      }

   }

   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1192039174"
   )
   static void method3547(int var0) {
      for(IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
         if ((var1.key >> 48 & 65535L) == (long)var0) {
            var1.remove();
         }
      }

   }
}
