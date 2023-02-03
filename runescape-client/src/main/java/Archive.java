import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("Archive")
public class Archive extends AbstractArchive {
   @ObfuscatedName("r")
   @Export("Archive_crc")
   static CRC32 Archive_crc = new CRC32();
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("masterDisk")
   ArchiveDisk masterDisk;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1735268773
   )
   @Export("index")
   int index;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1144192569
   )
   volatile int field4207 = 0;
   @ObfuscatedName("k")
   boolean field4208 = false;
   @ObfuscatedName("c")
   @Export("validGroups")
   volatile boolean[] validGroups;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1537961039
   )
   @Export("indexCrc")
   int indexCrc;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -822534929
   )
   @Export("indexVersion")
   int indexVersion;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1889287369
   )
   int field4206 = -1;
   @ObfuscatedName("h")
   boolean field4205 = false;

   @ObfuscatedSignature(
      descriptor = "(Loi;Loi;IZZZZ)V"
   )
   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var3;
      this.field4208 = var6;
      this.field4205 = var7;
      class350.method6771(this, this.index);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2058008546"
   )
   public boolean method6473() {
      return this.field4207 == 1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "499788298"
   )
   @Export("percentage")
   public int percentage() {
      if (this.field4207 != 1 && (!this.field4205 || this.field4207 != 2)) {
         if (super.groups != null) {
            return 99;
         } else {
            int var2 = this.index;
            long var3 = (long)(var2 + 16711680);
            int var1;
            if (WorldMapDecoration.NetCache_currentResponse != null && WorldMapDecoration.NetCache_currentResponse.key == var3) {
               var1 = class14.NetCache_responseArchiveBuffer.offset * 99 / (class14.NetCache_responseArchiveBuffer.array.length - WorldMapDecoration.NetCache_currentResponse.padding) + 1;
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1827988769"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
      class122.method3030(this.index, var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-4"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
      if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
         ArchiveDisk var2 = this.archiveDisk;
         byte[] var4 = null;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) {
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
         World.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-342076711"
   )
   void method6480() {
      this.field4207 = 2;
      super.groupIds = new int[0];
      super.groupCrcs = new int[0];
      super.groupVersions = new int[0];
      super.fileCounts = new int[0];
      super.fileIds = new int[0][];
      super.groups = new Object[0];
      super.files = new Object[0][];
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1215695827"
   )
   @Export("loadIndex")
   void loadIndex(int var1, int var2) {
      this.indexCrc = var1;
      this.indexVersion = var2;
      if (this.masterDisk != null) {
         int var3 = this.index;
         ArchiveDisk var4 = this.masterDisk;
         byte[] var6 = null;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) {
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
         World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I[BZZB)V",
      garbageValue = "-9"
   )
   @Export("write")
   void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field4207 == 1) {
            throw new RuntimeException();
         }

         if (this.masterDisk != null) {
            WorldMapSectionType.method5296(this.index, var2, this.masterDisk);
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if (this.archiveDisk != null) {
            WorldMapSectionType.method5296(var1, var2, this.archiveDisk);
            this.validGroups[var1] = true;
         }

         if (var4) {
            Object[] var5 = super.groups;
            Object var7;
            if (var2 == null) {
               var7 = null;
            } else if (var2.length > 136) {
               DirectByteArrayCopier var8 = new DirectByteArrayCopier();
               var8.set(var2);
               var7 = var8;
            } else {
               var7 = var2;
            }

            var5[var1] = var7;
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Loi;I[BZB)V",
      garbageValue = "45"
   )
   @Export("load")
   void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.masterDisk) {
         if (this.field4207 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var5 = (int)Archive_crc.getValue();
         if (var5 != this.indexCrc) {
            World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Buffer var11 = new Buffer(class161.decompressBytes(var3));
         int var12 = var11.readUnsignedByte();
         if (var12 != 5 && var12 != 6) {
            throw new RuntimeException(var12 + "," + this.index + "," + var2);
         }

         int var8 = 0;
         if (var12 >= 6) {
            var8 = var11.readInt();
         }

         if (var8 != this.indexVersion) {
            World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && var2 == this.field4206) {
            this.field4207 = 1;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.field4208 || var4) {
               World.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var5 = (int)Archive_crc.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.field4208 || var4) {
               World.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         this.validGroups[var2] = true;
         if (var4) {
            Object[] var7 = super.groups;
            Object var9;
            if (var3 == null) {
               var9 = null;
            } else if (var3.length > 136) {
               DirectByteArrayCopier var10 = new DirectByteArrayCopier();
               var10.set(var3);
               var9 = var10;
            } else {
               var9 = var3;
            }

            var7[var2] = var9;
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "110"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.validGroups.length; ++var1) {
         this.validGroups[var1] = false;
      }

      if (this.archiveDisk == null) {
         this.field4207 = 1;
      } else {
         this.field4206 = -1;

         for(var1 = 0; var1 < this.validGroups.length; ++var1) {
            if (super.fileCounts[var1] > 0) {
               Players.method2749(var1, this.archiveDisk, this);
               this.field4206 = var1;
            }
         }

         if (this.field4206 == -1) {
            this.field4207 = 1;
         }

      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-821387785"
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
         if (WorldMapDecoration.NetCache_currentResponse != null && WorldMapDecoration.NetCache_currentResponse.key == var4) {
            var2 = class14.NetCache_responseArchiveBuffer.offset * 99 / (class14.NetCache_responseArchiveBuffer.array.length - WorldMapDecoration.NetCache_currentResponse.padding) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1389317722"
   )
   public boolean method6483(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "124"
   )
   public boolean method6484(int var1) {
      return this.getGroupFileIds(var1) != null;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2147483648"
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

   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1489138096"
   )
   static void method6515(int var0) {
      SequenceDefinition var1 = class85.SequenceDefinition_get(var0);
      if (var1.isCachedModelIdSet()) {
         if (class70.method2087(var1.SequenceDefinition_cachedModelId) == 2) {
            Client.field797.add(var1.SequenceDefinition_cachedModelId);
         }

      }
   }
}
