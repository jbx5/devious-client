import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("MidiFileReader")
public class MidiFileReader {
   @ObfuscatedName("aa")
   static final byte[] field3422 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   @Export("buffer")
   Buffer buffer = new Buffer((byte[])null);
   @ObfuscatedName("an")
   @Export("division")
   int division;
   @ObfuscatedName("aw")
   @Export("trackStarts")
   int[] trackStarts;
   @ObfuscatedName("ac")
   @Export("trackPositions")
   int[] trackPositions;
   @ObfuscatedName("au")
   @Export("trackLengths")
   int[] trackLengths;
   @ObfuscatedName("ab")
   int[] field3426;
   @ObfuscatedName("aq")
   int field3427;
   @ObfuscatedName("at")
   long field3434;

   MidiFileReader(byte[] var1) {
      this.parse(var1);
   }

   MidiFileReader() {
   }

   @ObfuscatedName("af")
   @Export("parse")
   void parse(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = 10;
      int var2 = this.buffer.readUnsignedShort();
      this.division = this.buffer.readUnsignedShort();
      this.field3427 = 500000;
      this.trackStarts = new int[var2];

      Buffer var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.offset += var5) {
         int var4 = this.buffer.readInt();
         var5 = this.buffer.readInt();
         if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.offset;
            ++var3;
         }

         var10000 = this.buffer;
      }

      this.field3434 = 0L;
      this.trackPositions = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.trackPositions[var3] = this.trackStarts[var3];
      }

      this.trackLengths = new int[var2];
      this.field3426 = new int[var2];
   }

   @ObfuscatedName("an")
   @Export("clear")
   void clear() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field3426 = null;
   }

   @ObfuscatedName("aw")
   @Export("isReady")
   boolean isReady() {
      return this.buffer.array != null;
   }

   @ObfuscatedName("ac")
   @Export("trackCount")
   int trackCount() {
      return this.trackPositions.length;
   }

   @ObfuscatedName("au")
   @Export("gotoTrack")
   void gotoTrack(int var1) {
      this.buffer.offset = this.trackPositions[var1];
   }

   @ObfuscatedName("ab")
   @Export("markTrackPosition")
   void markTrackPosition(int var1) {
      this.trackPositions[var1] = this.buffer.offset;
   }

   @ObfuscatedName("aq")
   @Export("setTrackDone")
   void setTrackDone() {
      this.buffer.offset = -1;
   }

   @ObfuscatedName("al")
   @Export("readTrackLength")
   void readTrackLength(int var1) {
      int var2 = this.buffer.readVarInt();
      int[] var10000 = this.trackLengths;
      var10000[var1] += var2;
   }

   @ObfuscatedName("at")
   @Export("readMessage")
   int readMessage(int var1) {
      int var2 = this.readMessage0(var1);
      return var2;
   }

   @ObfuscatedName("aa")
   @Export("readMessage0")
   int readMessage0(int var1) {
      int var2 = this.buffer.array[this.buffer.offset];
      if (var2 < 0) {
         var2 &= 255;
         this.field3426[var1] = var2;
         ++this.buffer.offset;
      } else {
         var2 = this.field3426[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method5916(var1, var2);
      } else {
         int var3 = this.buffer.readVarInt();
         if (var2 == 247 && var3 > 0) {
            int var4 = this.buffer.array[this.buffer.offset] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.buffer.offset;
               this.field3426[var1] = var4;
               return this.method5916(var1, var4);
            }
         }

         Buffer var10000 = this.buffer;
         var10000.offset += var3;
         return 0;
      }
   }

   @ObfuscatedName("ay")
   int method5916(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.buffer.readUnsignedByte();
         var4 = this.buffer.readVarInt();
         Buffer var10000;
         if (var3 == 47) {
            var10000 = this.buffer;
            var10000.offset += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.buffer.readMedium();
            var4 -= 3;
            int var6 = this.trackLengths[var1];
            this.field3434 += (long)var6 * (long)(this.field3427 - var5);
            this.field3427 = var5;
            var10000 = this.buffer;
            var10000.offset += var4;
            return 2;
         } else {
            var10000 = this.buffer;
            var10000.offset += var4;
            return 3;
         }
      } else {
         var3 = field3422[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.buffer.readUnsignedByte() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.buffer.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

   @ObfuscatedName("ao")
   long method5903(int var1) {
      return this.field3434 + (long)var1 * (long)this.field3427;
   }

   @ObfuscatedName("ax")
   @Export("getPrioritizedTrack")
   int getPrioritizedTrack() {
      int var1 = this.trackPositions.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = this.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("ai")
   @Export("isDone")
   boolean isDone() {
      int var1 = this.trackPositions.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("ag")
   @Export("reset")
   void reset(long var1) {
      this.field3434 = var1;
      int var3 = this.trackPositions.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.trackLengths[var4] = 0;
         this.field3426[var4] = 0;
         this.buffer.offset = this.trackStarts[var4];
         this.readTrackLength(var4);
         this.trackPositions[var4] = this.buffer.offset;
      }

   }
}
