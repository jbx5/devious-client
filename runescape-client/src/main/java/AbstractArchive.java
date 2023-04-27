import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ltv;"
   )
   @Export("gzipDecompressor")
   static GZipDecompressor gzipDecompressor = new GZipDecompressor();
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 401859175
   )
   static int field4220 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1754346109
   )
   @Export("groupCount")
   int groupCount;
   @ObfuscatedName("am")
   @Export("groupIds")
   int[] groupIds;
   @ObfuscatedName("as")
   @Export("groupNameHashes")
   int[] groupNameHashes;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ltd;"
   )
   @Export("groupNameHashTable")
   IntHashTable groupNameHashTable;
   @ObfuscatedName("ak")
   @Export("groupCrcs")
   int[] groupCrcs;
   @ObfuscatedName("az")
   @Export("groupVersions")
   int[] groupVersions;
   @ObfuscatedName("ad")
   @Export("fileCounts")
   int[] fileCounts;
   @ObfuscatedName("ae")
   @Export("fileIds")
   int[][] fileIds;
   @ObfuscatedName("ap")
   @Export("fileNameHashes")
   int[][] fileNameHashes;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "[Ltd;"
   )
   @Export("fileNameHashTables")
   IntHashTable[] fileNameHashTables;
   @ObfuscatedName("bb")
   @Export("groups")
   Object[] groups;
   @ObfuscatedName("bi")
   @Export("files")
   Object[][] files;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -159523507
   )
   @Export("hash")
   public int hash;
   @ObfuscatedName("bx")
   @Export("releaseGroups")
   boolean releaseGroups;
   @ObfuscatedName("bo")
   @Export("shallowFiles")
   boolean shallowFiles;

   AbstractArchive(boolean var1, boolean var2) {
      this.releaseGroups = var1;
      this.shallowFiles = var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2103539915"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1884547323"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1973967810"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      return this.groups[var1] != null ? 100 : 0;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "104"
   )
   @Export("decodeIndex")
   void decodeIndex(byte[] var1) {
      this.hash = class220.method4489(var1, var1.length);
      Buffer var2 = new Buffer(class13.decompressBytes(var1));
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

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IIB)[B",
      garbageValue = "-48"
   )
   @Export("takeFile")
   public byte[] takeFile(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, (int[])null);
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II[II)[B",
      garbageValue = "1331353922"
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

         byte[] var5 = HealthBarDefinition.method3729(this.files[var1][var2], false);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-35"
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

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "953853219"
   )
   public boolean method6701(int var1) {
      if (this.files.length == 1) {
         return this.tryLoadFile(0, var1);
      } else if (this.files[var1].length == 1) {
         return this.tryLoadFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1653429081"
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

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "128"
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

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(IB)[B",
      garbageValue = "-18"
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

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(III)[B",
      garbageValue = "-606351717"
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

         byte[] var4 = HealthBarDefinition.method3729(this.files[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "1627749986"
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

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "296342556"
   )
   @Export("getGroupFileIds")
   public int[] getGroupFileIds(int var1) {
      return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "65"
   )
   @Export("getGroupFileCount")
   public int getGroupFileCount(int var1) {
      return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1154371114"
   )
   @Export("getGroupCount")
   public int getGroupCount() {
      return this.files.length;
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2145845097"
   )
   @Export("clearGroups")
   public void clearGroups() {
      for(int var1 = 0; var1 < this.groups.length; ++var1) {
         this.groups[var1] = null;
      }

   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-8"
   )
   @Export("clearFilesGroup")
   public void clearFilesGroup(int var1) {
      for(int var2 = 0; var2 < this.files[var1].length; ++var2) {
         this.files[var1][var2] = null;
      }

   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1903798827"
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

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I[II)Z",
      garbageValue = "-2109762247"
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
               var18 = HealthBarDefinition.method3729(this.groups[var1], false);
            } else {
               var18 = HealthBarDefinition.method3729(this.groups[var1], true);
               Buffer var8 = new Buffer(var18);
               var8.xteaDecrypt(var2, 5, var8.array.length);
            }

            byte[] var20 = class13.decompressBytes(var18);
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
                     var5[var4[var15]] = class108.method2853(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if (!this.shallowFiles) {
               var5[var4[0]] = class108.method2853(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1034841595"
   )
   @Export("getGroupId")
   public int getGroupId(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;S)I",
      garbageValue = "8192"
   )
   @Export("getFileId")
   public int getFileId(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.fileNameHashTables[var1].get(VerticalAlignment.hashString(var2));
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-1313069490"
   )
   @Export("isValidFileName")
   public boolean isValidFileName(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.fileNameHashTables[var3].get(VerticalAlignment.hashString(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "1648560407"
   )
   @Export("takeFileByNames")
   public byte[] takeFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
      int var4 = this.fileNameHashTables[var3].get(VerticalAlignment.hashString(var2));
      return this.takeFile(var3, var4);
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "842451065"
   )
   @Export("tryLoadFileByNames")
   public boolean tryLoadFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
      int var4 = this.fileNameHashTables[var3].get(VerticalAlignment.hashString(var2));
      return this.tryLoadFile(var3, var4);
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "1583460139"
   )
   @Export("tryLoadGroupByName")
   public boolean tryLoadGroupByName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
      return this.tryLoadGroup(var2);
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1282619653"
   )
   @Export("loadRegionFromName")
   public void loadRegionFromName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
      if (var2 >= 0) {
         this.loadRegionFromGroup(var2);
      }
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1956692579"
   )
   @Export("groupLoadPercentByName")
   public int groupLoadPercentByName(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1));
      return this.groupLoadPercent(var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhs;",
      garbageValue = "-107"
   )
   @Export("getNpcDefinition")
   public static NPCComposition getNpcDefinition(int var0) {
      NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
         var1 = new NPCComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(CLnx;B)C",
      garbageValue = "16"
   )
   @Export("standardizeChar")
   static char standardizeChar(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != Language.Language_ES) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != Language.Language_ES) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (var0 == 376) {
         return 'Y';
      } else {
         return var0;
      }
   }
}
