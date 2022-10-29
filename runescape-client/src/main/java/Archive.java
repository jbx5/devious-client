import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("Archive")
public class Archive extends AbstractArchive {
   @ObfuscatedName("s")
   @Export("Archive_crc")
   static CRC32 Archive_crc = new CRC32();
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lob;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lob;"
   )
   @Export("masterDisk")
   ArchiveDisk masterDisk;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1095750709
   )
   @Export("index")
   int index;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 583008577
   )
   volatile int field4137 = 0;
   @ObfuscatedName("r")
   boolean field4133 = false;
   @ObfuscatedName("l")
   @Export("validGroups")
   volatile boolean[] validGroups;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1766307111
   )
   @Export("indexCrc")
   int indexCrc;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1994509211
   )
   @Export("indexVersion")
   int indexVersion;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -556768421
   )
   int field4139 = -1;
   @ObfuscatedName("u")
   public boolean field4140 = false;

   @ObfuscatedSignature(
      descriptor = "(Lob;Lob;IZZZZ)V"
   )
   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var3;
      this.field4133 = var6;
      this.field4140 = var7;
      FriendSystem.method1825(this, this.index);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "264896575"
   )
   public boolean method6294() {
      return this.field4137 == 1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1558024188"
   )
   @Export("percentage")
   public int percentage() {
      if (this.field4137 == 1 || this.field4140 && this.field4137 == 2) {
         return 100;
      } else if (super.groups != null) {
         return 99;
      } else {
         int var1 = ItemLayer.method4054(255, this.index);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "61"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
      Decimator.method1108(this.index, var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1857779270"
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
         class158.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-2535"
   )
   public void method6306() {
      this.field4137 = 2;
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
      garbageValue = "-787981531"
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
         class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I[BZZI)V",
      garbageValue = "719574940"
   )
   @Export("write")
   public void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field4137 == 1) {
            throw new RuntimeException();
         }

         if (this.masterDisk != null) {
            class86.method2249(this.index, var2, this.masterDisk);
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if (this.archiveDisk != null) {
            class86.method2249(var1, var2, this.archiveDisk);
            this.validGroups[var1] = true;
         }

         if (var4) {
            super.groups[var1] = class138.method3001(var2, false);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lob;I[BZB)V",
      garbageValue = "-65"
   )
   @Export("load")
   void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.masterDisk) {
         if (this.field4137 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var5 = (int)Archive_crc.getValue();
         if (var5 != this.indexCrc) {
            class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Buffer var9 = new Buffer(VertexNormal.decompressBytes(var3));
         int var7 = var9.readUnsignedByte();
         if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.index + "," + var2);
         }

         int var8 = 0;
         if (var7 >= 6) {
            var8 = var9.readInt();
         }

         if (var8 != this.indexVersion) {
            class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && var2 == this.field4139) {
            this.field4137 = 1;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.field4133 || var4) {
               class158.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var5 = (int)Archive_crc.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.field4133 || var4) {
               class158.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         this.validGroups[var2] = true;
         if (var4) {
            super.groups[var2] = class138.method3001(var3, false);
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-93"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.validGroups.length; ++var1) {
         this.validGroups[var1] = false;
      }

      if (this.archiveDisk == null) {
         this.field4137 = 1;
      } else {
         this.field4139 = -1;

         for(var1 = 0; var1 < this.validGroups.length; ++var1) {
            if (super.fileCounts[var1] > 0) {
               Coord.method5688(var1, this.archiveDisk, this);
               this.field4139 = var1;
            }
         }

         if (this.field4139 == -1) {
            this.field4137 = 1;
         }

      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "15"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      if (super.groups[var1] != null) {
         return 100;
      } else {
         return this.validGroups[var1] ? 100 : ItemLayer.method4054(this.index, var1);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1186185048"
   )
   public boolean method6304(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2123519559"
   )
   public boolean method6298(int var1) {
      return this.getGroupFileIds(var1) != null;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1013746997"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1432548013"
   )
   public static int method6338(int var0) {
      return class281.field3279[var0];
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1924896276"
   )
   static void method6307(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = StructComposition.method3661(var4);
         int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
         int var8 = var1 - 334;
         if (var8 < 0) {
            var8 = 0;
         } else if (var8 > 100) {
            var8 = 100;
         }

         int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
         int var7 = var9 * var5 / 256;
         var2[var3] = var6 * var7 >> 16;
      }

      Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
   }
}
