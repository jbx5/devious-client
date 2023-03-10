import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("Archive")
public class Archive extends AbstractArchive {
   @ObfuscatedName("ax")
   @Export("Archive_crc")
   static CRC32 Archive_crc = new CRC32();
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lpv;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lpv;"
   )
   @Export("masterDisk")
   ArchiveDisk masterDisk;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1509849729
   )
   @Export("index")
   int index;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -912230569
   )
   volatile int field4172 = 0;
   @ObfuscatedName("ar")
   boolean field4173 = false;
   @ObfuscatedName("ak")
   @Export("validGroups")
   volatile boolean[] validGroups;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 15719519
   )
   @Export("indexCrc")
   int indexCrc;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 312439331
   )
   @Export("indexVersion")
   int indexVersion;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 378602323
   )
   int field4178 = -1;
   @ObfuscatedName("az")
   public boolean field4179 = false;

   @ObfuscatedSignature(
      descriptor = "(Lpv;Lpv;IZZZZ)V"
   )
   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var3;
      this.field4173 = var6;
      this.field4179 = var7;
      int var9 = this.index;
      if (this.field4179) {
         if (var9 <= NetCache.field4219) {
            throw new RuntimeException("");
         }

         if (var9 < NetCache.field4220) {
            NetCache.field4220 = var9;
         }
      } else {
         if (var9 >= NetCache.field4220) {
            throw new RuntimeException("");
         }

         if (var9 > NetCache.field4219) {
            NetCache.field4219 = var9;
         }
      }

      if (HealthBarUpdate.field1223 != null) {
         HealthBarUpdate.field1223.offset = var9 * 8 + 5;
         if (HealthBarUpdate.field1223.offset >= HealthBarUpdate.field1223.array.length) {
            if (!this.field4179) {
               throw new RuntimeException("");
            }

            this.method6386();
         } else {
            int var10 = HealthBarUpdate.field1223.readInt();
            int var11 = HealthBarUpdate.field1223.readInt();
            this.loadIndex(var10, var11);
         }
      } else {
         DevicePcmPlayerProvider.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
         NetCache.NetCache_archives[var9] = this;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "596729444"
   )
   public boolean method6424() {
      return this.field4172 == 1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "71"
   )
   @Export("percentage")
   public int percentage() {
      if (this.field4172 != 1 && (!this.field4179 || this.field4172 != 2)) {
         if (super.groups != null) {
            return 99;
         } else {
            int var2 = this.index;
            long var3 = (long)(var2 + 16711680);
            int var1;
            if (class133.NetCache_currentResponse != null && class133.NetCache_currentResponse.key == var3) {
               var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class133.NetCache_currentResponse.padding) + 1;
            } else {
               var1 = 0;
            }

            int var5 = var1;
            if (var1 >= 100) {
               var5 = 99;
            }

            return var5;
         }
      } else {
         return 100;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-7"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
      int var2 = this.index;
      long var3 = (long)((var2 << 16) + var1);
      NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3);
      if (var5 != null) {
         NetCache.NetCache_pendingWritesQueue.addLast(var5);
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-36"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
      if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
         ArchiveDisk var2 = this.archiveDisk;
         byte[] var4 = null;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) {
                  var4 = var6.data;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.load(var2, var1, var4, true);
         } else {
            byte[] var5 = var2.read(var1);
            this.load(var2, var1, var5, true);
         }
      } else {
         DevicePcmPlayerProvider.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1123893577"
   )
   public void method6386() {
      this.field4172 = 2;
      super.groupIds = new int[0];
      super.groupCrcs = new int[0];
      super.groupVersions = new int[0];
      super.fileCounts = new int[0];
      super.fileIds = new int[0][];
      super.groups = new Object[0];
      super.files = new Object[0][];
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1981775415"
   )
   @Export("loadIndex")
   public void loadIndex(int var1, int var2) {
      this.indexCrc = var1;
      this.indexVersion = var2;
      if (this.masterDisk != null) {
         int var3 = this.index;
         ArchiveDisk var4 = this.masterDisk;
         byte[] var6 = null;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) {
                  var6 = var8.data;
                  break;
               }
            }
         }

         if (var6 != null) {
            this.load(var4, var3, var6, true);
         } else {
            byte[] var7 = var4.read(var3);
            this.load(var4, var3, var7, true);
         }
      } else {
         DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I[BZZI)V",
      garbageValue = "1431655765"
   )
   @Export("write")
   public void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field4172 == 1) {
            throw new RuntimeException();
         }

         if (this.masterDisk != null) {
            HealthBar.method2550(this.index, var2, this.masterDisk);
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if (this.archiveDisk != null) {
            HealthBar.method2550(var1, var2, this.archiveDisk);
            this.validGroups[var1] = true;
         }

         if (var4) {
            super.groups[var1] = WorldMapRegion.method5050(var2, false);
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lpv;I[BZI)V",
      garbageValue = "1631564881"
   )
   @Export("load")
   void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.masterDisk) {
         if (this.field4172 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var5 = (int)Archive_crc.getValue();
         if (var5 != this.indexCrc) {
            DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Buffer var9 = new Buffer(Timer.decompressBytes(var3));
         int var7 = var9.readUnsignedByte();
         if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.index + "," + var2);
         }

         int var8 = 0;
         if (var7 >= 6) {
            var8 = var9.readInt();
         }

         if (var8 != this.indexVersion) {
            DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && var2 == this.field4178) {
            this.field4172 = 1;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.field4173 || var4) {
               DevicePcmPlayerProvider.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var5 = (int)Archive_crc.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.field4173 || var4) {
               DevicePcmPlayerProvider.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         this.validGroups[var2] = true;
         if (var4) {
            super.groups[var2] = WorldMapRegion.method5050(var3, false);
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-95"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.validGroups.length; ++var1) {
         this.validGroups[var1] = false;
      }

      if (this.archiveDisk == null) {
         this.field4172 = 1;
      } else {
         this.field4178 = -1;

         for(var1 = 0; var1 < this.validGroups.length; ++var1) {
            if (super.fileCounts[var1] > 0) {
               class324.method6325(var1, this.archiveDisk, this);
               this.field4178 = var1;
            }
         }

         if (this.field4178 == -1) {
            this.field4172 = 1;
         }

      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-877210204"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      if (super.groups[var1] != null) {
         return 100;
      } else if (this.validGroups[var1]) {
         return 100;
      } else {
         int var3 = this.index;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if (class133.NetCache_currentResponse != null && class133.NetCache_currentResponse.key == var4) {
            var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class133.NetCache_currentResponse.padding) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IS)Z",
      garbageValue = "-791"
   )
   public boolean method6422(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IS)Z",
      garbageValue = "255"
   )
   public boolean method6393(int var1) {
      return this.getGroupFileIds(var1) != null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1192908559"
   )
   @Export("loadPercent")
   public int loadPercent() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.groups.length; ++var3) {
         if (super.fileCounts[var3] > 0) {
            var1 += 100;
            var2 += this.groupLoadPercent(var3);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)Ljava/lang/String;",
      garbageValue = "1359302110"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
