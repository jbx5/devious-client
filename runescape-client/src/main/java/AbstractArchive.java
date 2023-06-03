import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Luh;"
   )
   @Export("gzipDecompressor")
   static GZipDecompressor gzipDecompressor = new GZipDecompressor();
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -2084025713
   )
   static int field4265 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -2057927725
   )
   @Export("groupCount")
   int groupCount;
   @ObfuscatedName("az")
   @Export("groupIds")
   int[] groupIds;
   @ObfuscatedName("au")
   @Export("groupNameHashes")
   int[] groupNameHashes;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Luf;"
   )
   @Export("groupNameHashTable")
   IntHashTable groupNameHashTable;
   @ObfuscatedName("aq")
   @Export("groupCrcs")
   int[] groupCrcs;
   @ObfuscatedName("aw")
   @Export("groupVersions")
   int[] groupVersions;
   @ObfuscatedName("ay")
   @Export("fileCounts")
   int[] fileCounts;
   @ObfuscatedName("al")
   @Export("fileIds")
   int[][] fileIds;
   @ObfuscatedName("am")
   @Export("fileNameHashes")
   int[][] fileNameHashes;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "[Luf;"
   )
   @Export("fileNameHashTables")
   IntHashTable[] fileNameHashTables;
   @ObfuscatedName("bc")
   @Export("groups")
   Object[] groups;
   @ObfuscatedName("bj")
   @Export("files")
   Object[][] files;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1568512069
   )
   @Export("hash")
   public int hash;
   @ObfuscatedName("bg")
   @Export("releaseGroups")
   boolean releaseGroups;
   @ObfuscatedName("bf")
   @Export("shallowFiles")
   boolean shallowFiles;

   AbstractArchive(boolean var1, boolean var2) {
      this.releaseGroups = var1;
      this.shallowFiles = var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-662286080"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "44"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "36647456"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      return this.groups[var1] != null ? 100 : 0;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "2"
   )
   @Export("decodeIndex")
   void decodeIndex(byte[] var1) {
      this.hash = class196.method3756(var1, var1.length);
      Buffer var2 = new Buffer(NPC.decompressBytes(var1));
      int var3 = var2.readUnsignedByte();
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.readInt();
         }

         int var4 = var2.readUnsignedByte();
         if (var3 >= 7) {
            this.groupCount = var2.readLargeSmart();
         } else {
            this.groupCount = var2.readUnsignedShort();
         }

         int var5 = 0;
         int var6 = -1;
         this.groupIds = new int[this.groupCount];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               this.groupIds[var7] = var5 += var2.readLargeSmart();
               if (this.groupIds[var7] > var6) {
                  var6 = this.groupIds[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               this.groupIds[var7] = var5 += var2.readUnsignedShort();
               if (this.groupIds[var7] > var6) {
                  var6 = this.groupIds[var7];
               }
            }
         }

         this.groupCrcs = new int[var6 + 1];
         this.groupVersions = new int[var6 + 1];
         this.fileCounts = new int[var6 + 1];
         this.fileIds = new int[var6 + 1][];
         this.groups = new Object[var6 + 1];
         this.files = new Object[var6 + 1][];
         if (var4 != 0) {
            this.groupNameHashes = new int[var6 + 1];

            for(var7 = 0; var7 < this.groupCount; ++var7) {
               this.groupNameHashes[this.groupIds[var7]] = var2.readInt();
            }

            this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
         }

         for(var7 = 0; var7 < this.groupCount; ++var7) {
            this.groupCrcs[this.groupIds[var7]] = var2.readInt();
         }

         for(var7 = 0; var7 < this.groupCount; ++var7) {
            this.groupVersions[this.groupIds[var7]] = var2.readInt();
         }

         for(var7 = 0; var7 < this.groupCount; ++var7) {
            this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               var8 = this.groupIds[var7];
               var9 = this.fileCounts[var8];
               var5 = 0;
               var10 = -1;
               this.fileIds[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.fileIds[var8][var11] = var5 += var2.readLargeSmart();
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.files[var8] = new Object[var10 + 1];
            }
         } else {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               var8 = this.groupIds[var7];
               var9 = this.fileCounts[var8];
               var5 = 0;
               var10 = -1;
               this.fileIds[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort();
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.files[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.fileNameHashes = new int[var6 + 1][];
            this.fileNameHashTables = new IntHashTable[var6 + 1];

            for(var7 = 0; var7 < this.groupCount; ++var7) {
               var8 = this.groupIds[var7];
               var9 = this.fileCounts[var8];
               this.fileNameHashes[var8] = new int[this.files[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
               }

               this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(III)[B",
      garbageValue = "-1137620411"
   )
   @Export("takeFile")
   public byte[] takeFile(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, (int[])null);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II[II)[B",
      garbageValue = "-575133043"
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

         byte[] var5 = Varps.method5964(this.files[var1][var2], false);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1129495144"
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

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "0"
   )
   public boolean method6694(int var1) {
      if (this.files.length == 1) {
         return this.tryLoadFile(0, var1);
      } else if (this.files[var1].length == 1) {
         return this.tryLoadFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1932610329"
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

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "32334"
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

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "-932023905"
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

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(III)[B",
      garbageValue = "1089327053"
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

         byte[] var4 = Varps.method5964(this.files[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(IB)[B",
      garbageValue = "-25"
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

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "228604856"
   )
   @Export("getGroupFileIds")
   public int[] getGroupFileIds(int var1) {
      return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1039432837"
   )
   @Export("getGroupFileCount")
   public int getGroupFileCount(int var1) {
      return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-93"
   )
   @Export("getGroupCount")
   public int getGroupCount() {
      return this.files.length;
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1392732"
   )
   @Export("clearGroups")
   public void clearGroups() {
      for(int var1 = 0; var1 < this.groups.length; ++var1) {
         this.groups[var1] = null;
      }

   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "53"
   )
   @Export("clearFilesGroup")
   public void clearFilesGroup(int var1) {
      for(int var2 = 0; var2 < this.files[var1].length; ++var2) {
         this.files[var1][var2] = null;
      }

   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "106"
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

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I[IB)Z",
      garbageValue = "115"
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
            if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
               var18 = Varps.method5964(this.groups[var1], false);
            } else {
               var18 = Varps.method5964(this.groups[var1], true);
               Buffer var8 = new Buffer(var18);
               var8.xteaDecrypt(var2, 5, var8.array.length);
            }

            byte[] var20 = NPC.decompressBytes(var18);
            if (this.releaseGroups) {
               this.groups[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var3 * var10 * 4;
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
                     var5[var4[var15]] = class104.method2665(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if (!this.shallowFiles) {
               var5[var4[0]] = class104.method2665(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1931627079"
   )
   @Export("getGroupId")
   public int getGroupId(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameHashTable.get(class213.hashString(var1));
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;S)I",
      garbageValue = "-5312"
   )
   @Export("getFileId")
   public int getFileId(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.fileNameHashTables[var1].get(class213.hashString(var2));
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "536777106"
   )
   @Export("isValidFileName")
   public boolean isValidFileName(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(class213.hashString(var1));
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.fileNameHashTables[var3].get(class213.hashString(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
      garbageValue = "117"
   )
   @Export("takeFileByNames")
   public byte[] takeFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(class213.hashString(var1));
      int var4 = this.fileNameHashTables[var3].get(class213.hashString(var2));
      return this.takeFile(var3, var4);
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "-100"
   )
   @Export("tryLoadFileByNames")
   public boolean tryLoadFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(class213.hashString(var1));
      int var4 = this.fileNameHashTables[var3].get(class213.hashString(var2));
      return this.tryLoadFile(var3, var4);
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-1634274768"
   )
   @Export("tryLoadGroupByName")
   public boolean tryLoadGroupByName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(class213.hashString(var1));
      return this.tryLoadGroup(var2);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1806976666"
   )
   @Export("loadRegionFromName")
   public void loadRegionFromName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(class213.hashString(var1));
      if (var2 >= 0) {
         this.loadRegionFromGroup(var2);
      }
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-2014386736"
   )
   @Export("groupLoadPercentByName")
   public int groupLoadPercentByName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(class213.hashString(var1));
      return this.groupLoadPercent(var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lqq;FFFI)F",
      garbageValue = "62692236"
   )
   static float method6743(class440 var0, float var1, float var2, float var3) {
      float var4 = FriendLoginUpdate.method7784(var0.field4700, var0.field4701, var1);
      if (Math.abs(var4) < class125.field1463) {
         return var1;
      } else {
         float var5 = FriendLoginUpdate.method7784(var0.field4700, var0.field4701, var2);
         if (Math.abs(var5) < class125.field1463) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = class125.field1467 * Math.abs(var2) + var3 * 0.5F;
               float var17 = (var6 - var2) * 0.5F;
               boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var1 == var6) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1)) * var12;
                        var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
                     }

                     if ((double)var9 > 0.0) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (var9 * 2.0F < var10 * var17 * 3.0F - Math.abs(var10 * var16) && var9 < Math.abs(0.5F * var12 * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = FriendLoginUpdate.method7784(var0.field4700, var0.field4701, var2);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }
}
