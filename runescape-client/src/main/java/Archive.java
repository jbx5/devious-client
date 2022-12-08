import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("Archive")
public class Archive extends AbstractArchive {
   @ObfuscatedName("g")
   @Export("Archive_crc")
   static CRC32 Archive_crc = new CRC32();
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("masterDisk")
   ArchiveDisk masterDisk;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -175327191
   )
   @Export("index")
   int index;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1245590993
   )
   volatile int field4189 = 0;
   @ObfuscatedName("b")
   boolean field4176 = false;
   @ObfuscatedName("j")
   @Export("validGroups")
   volatile boolean[] validGroups;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 117631983
   )
   @Export("indexCrc")
   int indexCrc;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 288216263
   )
   @Export("indexVersion")
   int indexVersion;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 722015315
   )
   int field4190 = -1;
   @ObfuscatedName("k")
   boolean field4191 = false;

   @ObfuscatedSignature(
      descriptor = "(Loi;Loi;IZZZZ)V"
   )
   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var3;
      this.field4176 = var6;
      this.field4191 = var7;
      class300.method5845(this, this.index);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1329124045"
   )
   public boolean method6415() {
      return this.field4189 == 1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1416460864"
   )
   @Export("percentage")
   public int percentage() {
      if (this.field4189 == 1 || this.field4191 && this.field4189 == 2) {
         return 100;
      } else if (super.groups != null) {
         return 99;
      } else {
         int var2 = this.index;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if (NewStuff.NetCache_currentResponse != null && NewStuff.NetCache_currentResponse.key == var3) {
            var1 = ModeWhere.NetCache_responseArchiveBuffer.offset * 99 / (ModeWhere.NetCache_responseArchiveBuffer.array.length - NewStuff.NetCache_currentResponse.padding) + 1;
         } else {
            var1 = 0;
         }

         int var5 = var1;
         if (var1 >= 100) {
            var5 = 99;
         }

         return var5;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-25"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
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
         VarpDefinition.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2108339126"
   )
   void method6419() {
      this.field4189 = 2;
      super.groupIds = new int[0];
      super.groupCrcs = new int[0];
      super.groupVersions = new int[0];
      super.fileCounts = new int[0];
      super.fileIds = new int[0][];
      super.groups = new Object[0];
      super.files = new Object[0][];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1668172401"
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
         VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I[BZZI)V",
      garbageValue = "908824441"
   )
   @Export("write")
   void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field4189 == 1) {
            throw new RuntimeException();
         }

         if (this.masterDisk != null) {
            int var5 = this.index;
            ArchiveDisk var6 = this.masterDisk;
            ArchiveDiskAction var7 = new ArchiveDiskAction();
            var7.type = 0;
            var7.key = (long)var5;
            var7.data = var2;
            var7.archiveDisk = var6;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
            }

            class154.method3300();
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if (this.archiveDisk != null) {
            ArchiveDisk var11 = this.archiveDisk;
            ArchiveDiskAction var16 = new ArchiveDiskAction();
            var16.type = 0;
            var16.key = (long)var1;
            var16.data = var2;
            var16.archiveDisk = var11;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var16);
            }

            class154.method3300();
            this.validGroups[var1] = true;
         }

         if (var4) {
            Object[] var15 = super.groups;
            Object var17;
            if (var2 == null) {
               var17 = null;
            } else if (var2.length > 136) {
               DirectByteArrayCopier var8 = new DirectByteArrayCopier();
               var8.set(var2);
               var17 = var8;
            } else {
               var17 = var2;
            }

            var15[var1] = var17;
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Loi;I[BZI)V",
      garbageValue = "-2092582059"
   )
   @Export("load")
   public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.masterDisk) {
         if (this.field4189 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var5 = (int)Archive_crc.getValue();
         if (var5 != this.indexCrc) {
            VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Buffer var11 = new Buffer(WorldMapCacheName.decompressBytes(var3));
         int var12 = var11.readUnsignedByte();
         if (var12 != 5 && var12 != 6) {
            throw new RuntimeException(var12 + "," + this.index + "," + var2);
         }

         int var8 = 0;
         if (var12 >= 6) {
            var8 = var11.readInt();
         }

         if (var8 != this.indexVersion) {
            VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && var2 == this.field4190) {
            this.field4189 = 1;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.field4176 || var4) {
               VarpDefinition.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var5 = (int)Archive_crc.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.field4176 || var4) {
               VarpDefinition.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1655264850"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.validGroups.length; ++var1) {
         this.validGroups[var1] = false;
      }

      if (this.archiveDisk == null) {
         this.field4189 = 1;
      } else {
         this.field4190 = -1;

         for(var1 = 0; var1 < this.validGroups.length; ++var1) {
            if (super.fileCounts[var1] > 0) {
               class272.method5476(var1, this.archiveDisk, this);
               this.field4190 = var1;
            }
         }

         if (this.field4190 == -1) {
            this.field4189 = 1;
         }

      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "266817"
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
         if (NewStuff.NetCache_currentResponse != null && var4 == NewStuff.NetCache_currentResponse.key) {
            var2 = ModeWhere.NetCache_responseArchiveBuffer.offset * 99 / (ModeWhere.NetCache_responseArchiveBuffer.array.length - NewStuff.NetCache_currentResponse.padding) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1932389793"
   )
   public boolean method6424(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1451159899"
   )
   public boolean method6448(int var1) {
      return this.getGroupFileIds(var1) != null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-21"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1925135714"
   )
   static final boolean method6426(int var0, int var1) {
      ObjectComposition var2 = VarpDefinition.getObjectDefinition(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method3867(var1);
   }

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "53956374"
   )
   static final void method6455(int var0, int var1) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3312()) {
            ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            if (var2.rank == -1) {
               PacketBufferNode var3 = class136.getPacketBufferNode(ClientPacket.field3055, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(3 + class13.stringCp1252NullTerminatedByteSize(var2.username.getName()));
               var3.packetBuffer.writeByte(var0);
               var3.packetBuffer.writeShort(var1);
               var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }
}
