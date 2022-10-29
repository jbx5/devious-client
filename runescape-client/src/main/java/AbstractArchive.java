import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lru;"
   )
   @Export("gzipDecompressor")
   static GZipDecompressor gzipDecompressor = new GZipDecompressor();
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -442127047
   )
   static int field4157 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1110470755
   )
   @Export("groupCount")
   int groupCount;
   @ObfuscatedName("w")
   @Export("groupIds")
   int[] groupIds;
   @ObfuscatedName("m")
   @Export("groupNameHashes")
   int[] groupNameHashes;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lrl;"
   )
   @Export("groupNameHashTable")
   IntHashTable groupNameHashTable;
   @ObfuscatedName("i")
   @Export("groupCrcs")
   int[] groupCrcs;
   @ObfuscatedName("e")
   @Export("groupVersions")
   int[] groupVersions;
   @ObfuscatedName("g")
   @Export("fileCounts")
   int[] fileCounts;
   @ObfuscatedName("k")
   @Export("fileIds")
   int[][] fileIds;
   @ObfuscatedName("v")
   @Export("fileNameHashes")
   int[][] fileNameHashes;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lrl;"
   )
   @Export("fileNameHashTables")
   IntHashTable[] fileNameHashTables;
   @ObfuscatedName("an")
   @Export("groups")
   Object[] groups;
   @ObfuscatedName("ah")
   @Export("files")
   Object[][] files;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -531202277
   )
   @Export("hash")
   public int hash;
   @ObfuscatedName("af")
   @Export("releaseGroups")
   boolean releaseGroups;
   @ObfuscatedName("ad")
   @Export("shallowFiles")
   boolean shallowFiles;

   AbstractArchive(boolean var1, boolean var2) {
      this.releaseGroups = var1;
      this.shallowFiles = var2;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "61"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1857779270"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "15"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      return this.groups[var1] != null ? 100 : 0;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-658852576"
   )
   @Export("decodeIndex")
   void decodeIndex(byte[] var1) {
      int var3 = var1.length;
      int var2 = WorldMapSprite.method5156(var1, 0, var3);
      this.hash = var2;
      Buffer var4 = new Buffer(VertexNormal.decompressBytes(var1));
      int var5 = var4.readUnsignedByte();
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if (var5 >= 7) {
            this.groupCount = var4.readLargeSmart();
         } else {
            this.groupCount = var4.readUnsignedShort();
         }

         int var7 = 0;
         int var8 = -1;
         this.groupIds = new int[this.groupCount];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.groupCount; ++var9) {
               this.groupIds[var9] = var7 += var4.readLargeSmart();
               if (this.groupIds[var9] > var8) {
                  var8 = this.groupIds[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.groupCount; ++var9) {
               this.groupIds[var9] = var7 += var4.readUnsignedShort();
               if (this.groupIds[var9] > var8) {
                  var8 = this.groupIds[var9];
               }
            }
         }

         this.groupCrcs = new int[var8 + 1];
         this.groupVersions = new int[var8 + 1];
         this.fileCounts = new int[var8 + 1];
         this.fileIds = new int[var8 + 1][];
         this.groups = new Object[var8 + 1];
         this.files = new Object[var8 + 1][];
         if (var6 != 0) {
            this.groupNameHashes = new int[var8 + 1];

            for(var9 = 0; var9 < this.groupCount; ++var9) {
               this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
            }

            this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
         }

         for(var9 = 0; var9 < this.groupCount; ++var9) {
            this.groupCrcs[this.groupIds[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.groupCount; ++var9) {
            this.groupVersions[this.groupIds[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.groupCount; ++var9) {
            this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.groupCount; ++var9) {
               var10 = this.groupIds[var9];
               var11 = this.fileCounts[var10];
               var7 = 0;
               var12 = -1;
               this.fileIds[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.fileIds[var10][var13] = var7 += var4.readLargeSmart();
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.files[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.groupCount; ++var9) {
               var10 = this.groupIds[var9];
               var11 = this.fileCounts[var10];
               var7 = 0;
               var12 = -1;
               this.fileIds[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort();
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.files[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.fileNameHashes = new int[var8 + 1][];
            this.fileNameHashTables = new IntHashTable[var8 + 1];

            for(var9 = 0; var9 < this.groupCount; ++var9) {
               var10 = this.groupIds[var9];
               var11 = this.fileCounts[var10];
               this.fileNameHashes[var10] = new int[this.files[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
               }

               this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIB)[B",
      garbageValue = "-18"
   )
   @Export("takeFile")
   public byte[] takeFile(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, (int[])null);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II[IB)[B",
      garbageValue = "-104"
   )
   @Export("takeFileEncrypted")
   public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (this.files[var1][var2] == null) {
            boolean var4 = this.buildFiles(var1, var3);
            if (!var4) {
               this.loadGroup(var1);
               var4 = this.buildFiles(var1, var3);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = StudioGame.method6260(this.files[var1][var2], false);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1739441369"
   )
   @Export("tryLoadFile")
   public boolean tryLoadFile(int var1, int var2) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (this.files[var1][var2] != null) {
            return true;
         } else if (this.groups[var1] != null) {
            return true;
         } else {
            this.loadGroup(var1);
            return this.groups[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1676667383"
   )
   public boolean method6348(int var1) {
      if (this.files.length == 1) {
         return this.tryLoadFile(0, var1);
      } else if (this.files[var1].length == 1) {
         return this.tryLoadFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "404906413"
   )
   @Export("tryLoadGroup")
   public boolean tryLoadGroup(int var1) {
      if (this.groups[var1] != null) {
         return true;
      } else {
         this.loadGroup(var1);
         return this.groups[var1] != null;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "397677135"
   )
   @Export("isFullyLoaded")
   public boolean isFullyLoaded() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.groupIds.length; ++var2) {
         int var3 = this.groupIds[var2];
         if (this.groups[var3] == null) {
            this.loadGroup(var3);
            if (this.groups[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IB)[B",
      garbageValue = "-104"
   )
   @Export("takeFileFlat")
   public byte[] takeFileFlat(int var1) {
      if (this.files.length == 1) {
         return this.takeFile(0, var1);
      } else if (this.files[var1].length == 1) {
         return this.takeFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(IIB)[B",
      garbageValue = "-79"
   )
   @Export("getFile")
   public byte[] getFile(int var1, int var2) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (this.files[var1][var2] == null) {
            boolean var3 = this.buildFiles(var1, (int[])null);
            if (!var3) {
               this.loadGroup(var1);
               var3 = this.buildFiles(var1, (int[])null);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = StudioGame.method6260(this.files[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IB)[B",
      garbageValue = "0"
   )
   @Export("getFileFlat")
   public byte[] getFileFlat(int var1) {
      if (this.files.length == 1) {
         return this.getFile(0, var1);
      } else if (this.files[var1].length == 1) {
         return this.getFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(IB)[I",
      garbageValue = "-5"
   )
   @Export("getGroupFileIds")
   public int[] getGroupFileIds(int var1) {
      return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "919501440"
   )
   @Export("getGroupFileCount")
   public int getGroupFileCount(int var1) {
      return this.files[var1].length;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "15"
   )
   @Export("getGroupCount")
   public int getGroupCount() {
      return this.files.length;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-232459526"
   )
   @Export("clearGroups")
   public void clearGroups() {
      for(int var1 = 0; var1 < this.groups.length; ++var1) {
         this.groups[var1] = null;
      }

   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1512120476"
   )
   @Export("clearFilesGroup")
   public void clearFilesGroup(int var1) {
      for(int var2 = 0; var2 < this.files[var1].length; ++var2) {
         this.files[var1][var2] = null;
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1839748346"
   )
   @Export("clearFiles")
   public void clearFiles() {
      for(int var1 = 0; var1 < this.files.length; ++var1) {
         if (this.files[var1] != null) {
            for(int var2 = 0; var2 < this.files[var1].length; ++var2) {
               this.files[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I[II)Z",
      garbageValue = "1683493694"
   )
   @Export("buildFiles")
   boolean buildFiles(int var1, int[] var2) {
      if (this.groups[var1] == null) {
         return false;
      } else {
         int var3 = this.fileCounts[var1];
         int[] var4 = this.fileIds[var1];
         Object[] var5 = this.files[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var18;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var18 = StudioGame.method6260(this.groups[var1], true);
               Buffer var8 = new Buffer(var18);
               var8.xteaDecrypt(var2, 5, var8.array.length);
            } else {
               var18 = StudioGame.method6260(this.groups[var1], false);
            }

            byte[] var20 = VertexNormal.decompressBytes(var18);
            if (this.releaseGroups) {
               this.groups[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               Buffer var11 = new Buffer(var20);
               int[] var12 = new int[var3];
               var11.offset = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.readInt();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.offset = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.readInt();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.shallowFiles) {
                     var5[var4[var15]] = class138.method3001(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if (!this.shallowFiles) {
               var5[var4[0]] = class138.method3001(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "58"
   )
   @Export("getGroupId")
   public int getGroupId(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameHashTable.get(class343.hashString(var1));
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)I",
      garbageValue = "2074335845"
   )
   @Export("getFileId")
   public int getFileId(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.fileNameHashTables[var1].get(class343.hashString(var2));
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-2074684585"
   )
   @Export("isValidFileName")
   public boolean isValidFileName(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(class343.hashString(var1));
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.fileNameHashTables[var3].get(class343.hashString(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
      garbageValue = "-109"
   )
   @Export("takeFileByNames")
   public byte[] takeFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(class343.hashString(var1));
      int var4 = this.fileNameHashTables[var3].get(class343.hashString(var2));
      return this.takeFile(var3, var4);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-1679993527"
   )
   @Export("tryLoadFileByNames")
   public boolean tryLoadFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(class343.hashString(var1));
      int var4 = this.fileNameHashTables[var3].get(class343.hashString(var2));
      return this.tryLoadFile(var3, var4);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-1051034151"
   )
   @Export("tryLoadGroupByName")
   public boolean tryLoadGroupByName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(class343.hashString(var1));
      return this.tryLoadGroup(var2);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1907143195"
   )
   @Export("loadRegionFromName")
   public void loadRegionFromName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(class343.hashString(var1));
      if (var2 >= 0) {
         this.loadRegionFromGroup(var2);
      }
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "200899507"
   )
   @Export("groupLoadPercentByName")
   public int groupLoadPercentByName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(class343.hashString(var1));
      return this.groupLoadPercent(var2);
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-51"
   )
   static final void method6439(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field717[var4] = true;
         }
      }

   }
}
