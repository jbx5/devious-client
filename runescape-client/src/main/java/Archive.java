import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Archive")
public class Archive extends AbstractArchive {
   @ObfuscatedName("aa")
   @Export("Archive_crc")
   static CRC32 Archive_crc = new CRC32();
   @ObfuscatedName("ju")
   @ObfuscatedGetter(
      intValue = -826564107
   )
   static int field4231;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   @Export("masterDisk")
   ArchiveDisk masterDisk;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -768850565
   )
   @Export("index")
   int index;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1807050663
   )
   volatile int field4235 = 0;
   @ObfuscatedName("af")
   boolean field4228 = false;
   @ObfuscatedName("ao")
   @Export("validGroups")
   volatile boolean[] validGroups;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 116900827
   )
   @Export("indexCrc")
   int indexCrc;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 948859093
   )
   @Export("indexVersion")
   int indexVersion;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 826288613
   )
   int field4241 = -1;
   @ObfuscatedName("ag")
   boolean field4242 = false;

   @ObfuscatedSignature(
      descriptor = "(Lqc;Lqc;IZZZZ)V"
   )
   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var3;
      this.field4228 = var6;
      this.field4242 = var7;
      Clock.method3548(this, this.index);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-447317625"
   )
   public boolean method6647() {
      return this.field4235 == 1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-710094047"
   )
   @Export("percentage")
   public int percentage() {
      if (this.field4235 == 1 || this.field4242 && this.field4235 == 2) {
         return 100;
      } else if (super.groups != null) {
         return 99;
      } else {
         int var1 = PacketBufferNode.method5673(255, this.index);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-662286080"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
      TextureProvider.method4755(this.index, var1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "44"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
      if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
         SpriteMask.method5955(var1, this.archiveDisk, this);
      } else {
         class341.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1142899829"
   )
   void method6648() {
      this.field4235 = 2;
      super.groupIds = new int[0];
      super.groupCrcs = new int[0];
      super.groupVersions = new int[0];
      super.fileCounts = new int[0];
      super.fileIds = new int[0][];
      super.groups = new Object[0];
      super.files = new Object[0][];
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1614804410"
   )
   @Export("loadIndex")
   void loadIndex(int var1, int var2) {
      this.indexCrc = var1;
      this.indexVersion = var2;
      if (this.masterDisk != null) {
         SpriteMask.method5955(this.index, this.masterDisk, this);
      } else {
         class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I[BZZI)V",
      garbageValue = "-669872897"
   )
   @Export("write")
   public void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field4235 == 1) {
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

            class300.method5686();
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if (this.archiveDisk != null) {
            ArchiveDisk var11 = this.archiveDisk;
            ArchiveDiskAction var14 = new ArchiveDiskAction();
            var14.type = 0;
            var14.key = (long)var1;
            var14.data = var2;
            var14.archiveDisk = var11;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14);
            }

            class300.method5686();
            this.validGroups[var1] = true;
         }

         if (var4) {
            super.groups[var1] = class104.method2665(var2, false);
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lqc;I[BZI)V",
      garbageValue = "-149482019"
   )
   @Export("load")
   public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.masterDisk) {
         if (this.field4235 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var5 = (int)Archive_crc.getValue();
         if (var5 != this.indexCrc) {
            class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Buffer var9 = new Buffer(NPC.decompressBytes(var3));
         int var7 = var9.readUnsignedByte();
         if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.index + "," + var2);
         }

         int var8 = 0;
         if (var7 >= 6) {
            var8 = var9.readInt();
         }

         if (var8 != this.indexVersion) {
            class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && var2 == this.field4241) {
            this.field4235 = 1;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.field4228 || var4) {
               class341.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var5 = (int)Archive_crc.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.field4228 || var4) {
               class341.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         this.validGroups[var2] = true;
         if (var4) {
            super.groups[var2] = class104.method2665(var3, false);
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1691266995"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.validGroups.length; ++var1) {
         this.validGroups[var1] = false;
      }

      if (this.archiveDisk == null) {
         this.field4235 = 1;
      } else {
         this.field4241 = -1;

         for(var1 = 0; var1 < this.validGroups.length; ++var1) {
            if (super.fileCounts[var1] > 0) {
               WorldMapArea.method5170(var1, this.archiveDisk, this);
               this.field4241 = var1;
            }
         }

         if (this.field4241 == -1) {
            this.field4235 = 1;
         }

      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "36647456"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      if (super.groups[var1] != null) {
         return 100;
      } else {
         return this.validGroups[var1] ? 100 : PacketBufferNode.method5673(this.index, var1);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "82"
   )
   public boolean method6685(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2093030557"
   )
   public boolean method6657(int var1) {
      return this.getGroupFileIds(var1) != null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1624347688"
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BIIB)Ljava/lang/String;",
      garbageValue = "14"
   )
   public static String method6690(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class383.field4391[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class383.field4391[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class383.field4391[(var6 & 15) << 2 | var7 >>> 6]).append(class383.field4391[var7 & 63]);
            } else {
               var3.append(class383.field4391[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class383.field4391[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SIII)V",
      garbageValue = "1449504556"
   )
   @Export("sortItemsByName")
   public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         sortItemsByName(var0, var1, var2, var5 - 1);
         sortItemsByName(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lnq;II)Z",
      garbageValue = "1801207784"
   )
   public static boolean method6692(AbstractArchive var0, int var1) {
      byte[] var2 = var0.takeFileFlat(var1);
      if (var2 == null) {
         return false;
      } else {
         UserComparator2.SpriteBuffer_decode(var2);
         return true;
      }
   }
}
